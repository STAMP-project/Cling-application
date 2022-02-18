import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest31 {

    public static boolean debug = false;

    @Test
    public void test15501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15501");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType2);
        mutablePeriod3.setYears(0);
        mutablePeriod3.setWeeks((int) (short) -1);
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant10 = null;
        java.lang.Object obj11 = null;
        org.joda.time.Duration duration12 = new org.joda.time.Duration(obj11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration12);
        boolean boolean14 = duration9.isShorterThan((org.joda.time.ReadableDuration) duration12);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Interval interval16 = duration12.toIntervalTo(readableInstant15);
        mutablePeriod3.setPeriod((org.joda.time.ReadableInterval) interval16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutablePeriod3.setPeriod(readableDuration18);
        mutablePeriod3.addDays(601);
        int int22 = mutablePeriod3.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType24 = mutablePeriod3.getFieldType(670);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 670");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test15502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15502");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(1015, 586, (-52), (int) (byte) 10, 456825, (-27409538), 5, 9, periodType8);
    }

    @Test
    public void test15503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15503");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        java.lang.Object obj14 = null;
        org.joda.time.Duration duration15 = new org.joda.time.Duration(obj14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration15);
        boolean boolean17 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration15.toIntervalTo(readableInstant18);
        org.joda.time.Interval interval20 = interval19.toInterval();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        java.lang.Object obj24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(obj24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration25);
        boolean boolean27 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Interval interval29 = duration25.toIntervalTo(readableInstant28);
        boolean boolean30 = interval20.isAfter((org.joda.time.ReadableInterval) interval29);
        boolean boolean31 = interval9.contains((org.joda.time.ReadableInterval) interval20);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType34);
        mutablePeriod35.addMillis((-1));
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        java.lang.Object obj41 = null;
        org.joda.time.Duration duration42 = new org.joda.time.Duration(obj41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, (org.joda.time.ReadableDuration) duration42);
        boolean boolean44 = duration39.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Interval interval46 = duration42.toIntervalTo(readableInstant45);
        org.joda.time.Interval interval47 = interval46.toInterval();
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant50 = null;
        java.lang.Object obj51 = null;
        org.joda.time.Duration duration52 = new org.joda.time.Duration(obj51);
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant50, (org.joda.time.ReadableDuration) duration52);
        boolean boolean54 = duration49.isShorterThan((org.joda.time.ReadableDuration) duration52);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Interval interval56 = duration52.toIntervalTo(readableInstant55);
        boolean boolean57 = interval47.isAfter((org.joda.time.ReadableInterval) interval56);
        org.joda.time.Weeks weeks58 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval56);
        org.joda.time.Period period59 = interval56.toPeriod();
        mutablePeriod35.add((org.joda.time.ReadableInterval) interval56);
        long long61 = interval56.getEndMillis();
        boolean boolean62 = interval20.isAfter((org.joda.time.ReadableInterval) interval56);
        long long63 = interval56.getStartMillis();
        long long64 = interval56.getStartMillis();
        org.joda.time.Duration duration66 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant67 = null;
        java.lang.Object obj68 = null;
        org.joda.time.Duration duration69 = new org.joda.time.Duration(obj68);
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant67, (org.joda.time.ReadableDuration) duration69);
        boolean boolean71 = duration66.isShorterThan((org.joda.time.ReadableDuration) duration69);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Interval interval73 = duration69.toIntervalTo(readableInstant72);
        org.joda.time.Interval interval74 = interval73.toInterval();
        long long75 = interval73.toDurationMillis();
        org.joda.time.Interval interval76 = interval73.toInterval();
        long long77 = interval73.getEndMillis();
        boolean boolean78 = interval56.isBefore((org.joda.time.ReadableInterval) interval73);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(weeks58);
        org.junit.Assert.assertNotNull(period59);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1644572668115L + "'", long61 == 1644572668115L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1644572668115L + "'", long63 == 1644572668115L);
// flaky:         org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1644572668115L + "'", long64 == 1644572668115L);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNotNull(interval76);
// flaky:         org.junit.Assert.assertTrue("'" + long77 + "' != '" + 1644572668115L + "'", long77 == 1644572668115L);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test15504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15504");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(1644572104482L, 1644572138187L, chronology2);
        org.joda.time.Period period5 = period3.minusYears((-68));
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test15505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15505");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis(1644572211794L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test15506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15506");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(11);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test15507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15507");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1644572373643L, 1644572131521L, chronology2);
    }

    @Test
    public void test15508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15508");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) 1, (-2), (int) 'a', (-963));
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant7 = null;
        java.lang.Object obj8 = null;
        org.joda.time.Duration duration9 = new org.joda.time.Duration(obj8);
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration9);
        boolean boolean11 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Interval interval13 = duration9.toIntervalTo(readableInstant12);
        org.joda.time.Interval interval14 = interval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval14);
        org.joda.time.DurationFieldType durationFieldType17 = weeks16.getFieldType();
        boolean boolean18 = mutablePeriod4.isSupported(durationFieldType17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) durationFieldType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test15509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15509");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.Minutes minutes2 = minutes1.negated();
        org.joda.time.Period period11 = new org.joda.time.Period((int) (byte) 0, 0, (int) (short) 10, 8, (-2147483648), (int) (byte) 1, 9, 9);
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes13 = minutes12.negated();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        java.lang.Object obj17 = null;
        org.joda.time.Duration duration18 = new org.joda.time.Duration(obj17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration18);
        boolean boolean20 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Interval interval22 = duration18.toIntervalTo(readableInstant21);
        org.joda.time.Duration duration25 = new org.joda.time.Duration((long) 'a', (long) 0);
        boolean boolean26 = duration18.equals((java.lang.Object) 'a');
        org.joda.time.Minutes minutes27 = duration18.toStandardMinutes();
        org.joda.time.Minutes minutes28 = minutes27.negated();
        org.joda.time.Minutes minutes29 = minutes12.minus(minutes28);
        org.joda.time.Period period30 = period11.minus((org.joda.time.ReadablePeriod) minutes29);
        boolean boolean31 = minutes2.isGreaterThan(minutes29);
        org.joda.time.Duration duration32 = minutes29.toStandardDuration();
        org.joda.time.PeriodType periodType33 = minutes29.getPeriodType();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test15510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15510");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(obj1);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.Seconds seconds4 = period3.toStandardSeconds();
        org.joda.time.Seconds seconds5 = period3.toStandardSeconds();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType8 = seconds7.getFieldType();
        org.joda.time.Seconds seconds10 = seconds7.plus((-1));
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.TWO;
        java.lang.String str12 = seconds11.toString();
        org.joda.time.Seconds seconds13 = seconds10.plus(seconds11);
        org.joda.time.Seconds seconds14 = seconds6.minus(seconds11);
        org.joda.time.PeriodType periodType15 = seconds6.getPeriodType();
        org.joda.time.Seconds seconds16 = seconds5.plus(seconds6);
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType19 = seconds18.getFieldType();
        org.joda.time.Seconds seconds21 = seconds18.plus((-1));
        org.joda.time.Seconds seconds22 = org.joda.time.Seconds.TWO;
        java.lang.String str23 = seconds22.toString();
        org.joda.time.Seconds seconds24 = seconds21.plus(seconds22);
        org.joda.time.Seconds seconds25 = seconds17.minus(seconds22);
        org.joda.time.PeriodType periodType26 = seconds17.getPeriodType();
        org.joda.time.Seconds seconds27 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) seconds17);
        org.joda.time.Seconds seconds28 = seconds16.plus(seconds17);
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds30 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType31 = seconds30.getFieldType();
        org.joda.time.Seconds seconds33 = seconds30.plus((-1));
        org.joda.time.Seconds seconds34 = org.joda.time.Seconds.TWO;
        java.lang.String str35 = seconds34.toString();
        org.joda.time.Seconds seconds36 = seconds33.plus(seconds34);
        org.joda.time.Seconds seconds37 = seconds29.minus(seconds34);
        org.joda.time.Seconds seconds38 = seconds17.plus(seconds34);
        org.joda.time.Seconds seconds39 = null;
        org.joda.time.Seconds seconds40 = seconds17.minus(seconds39);
        org.joda.time.Duration duration41 = seconds40.toStandardDuration();
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT2S" + "'", str12, "PT2S");
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT2S" + "'", str23, "PT2S");
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT2S" + "'", str35, "PT2S");
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertNotNull(duration41);
    }

    @Test
    public void test15511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15511");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration7 = duration4.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration9 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration4, (int) (short) 1);
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration15 = duration12.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration17 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration15, (int) (short) 100);
        org.joda.time.Minutes minutes18 = duration15.toStandardMinutes();
        org.joda.time.Period period19 = duration15.toPeriod();
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardHours((long) (byte) 100);
        int int22 = duration15.compareTo((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Duration duration23 = duration15.toDuration();
        org.joda.time.Duration duration25 = duration15.minus(0L);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        java.lang.Object obj29 = null;
        org.joda.time.Duration duration30 = new org.joda.time.Duration(obj29);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration30);
        boolean boolean32 = duration27.isShorterThan((org.joda.time.ReadableDuration) duration30);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Interval interval34 = duration30.toIntervalTo(readableInstant33);
        org.joda.time.Interval interval35 = interval34.toInterval();
        org.joda.time.DateTime dateTime36 = interval35.getEnd();
        org.joda.time.Instant instant37 = dateTime36.toInstant();
        org.joda.time.Period period38 = duration15.toPeriodFrom((org.joda.time.ReadableInstant) instant37);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test15512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15512");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        org.joda.time.Days days1 = org.joda.time.Days.ONE;
        org.joda.time.Days days2 = days1.negated();
        int int3 = days0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days1);
        int int4 = days0.getDays();
        org.joda.time.Days days5 = org.joda.time.Days.ONE;
        org.joda.time.Days days6 = days5.negated();
        org.joda.time.Days days7 = org.joda.time.Days.ONE;
        org.joda.time.Days days8 = days7.negated();
        org.joda.time.Days days9 = org.joda.time.Days.ONE;
        org.joda.time.Days days10 = days9.negated();
        boolean boolean11 = days8.isGreaterThan(days10);
        org.joda.time.Days days12 = days5.plus(days10);
        int int13 = days5.getDays();
        org.joda.time.Days days15 = days5.minus(2147483647);
        org.joda.time.Days days17 = days15.dividedBy((-101));
        org.joda.time.Days days18 = days0.plus(days17);
        org.joda.time.DurationFieldType durationFieldType19 = days17.getFieldType();
        java.lang.String str20 = durationFieldType19.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "days" + "'", str20, "days");
    }

    @Test
    public void test15513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15513");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-101));
        org.joda.time.Period period3 = org.joda.time.Period.days((-97));
        org.joda.time.Period period4 = period1.minus((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = period4.minusYears(0);
        org.joda.time.Hours hours7 = period6.toStandardHours();
        int int8 = period6.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test15514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15514");
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes4 = minutes2.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType5 = minutes4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withYearsRemoved();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', periodType5, chronology7);
        org.joda.time.PeriodType periodType9 = periodType5.withHoursRemoved();
        int int10 = periodType9.size();
        org.joda.time.PeriodType periodType11 = periodType9.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1644572113566L, periodType11);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod12.addSeconds((-660));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test15515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15515");
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks6 = weeks4.minus(weeks5);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.dayTime();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((java.lang.Object) weeks6, periodType7);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        java.lang.Object obj13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(obj13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration14);
        boolean boolean16 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration14.toIntervalTo(readableInstant17);
        org.joda.time.Interval interval19 = interval18.toInterval();
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.Period period21 = new org.joda.time.Period(1644572086619L, chronology20);
        org.joda.time.Period period22 = new org.joda.time.Period((long) (byte) 0, 1644572092263L, periodType7, chronology20);
        org.joda.time.Period period23 = new org.joda.time.Period((long) (-2147483648), (long) (byte) 100, chronology20);
        org.joda.time.Period period25 = period23.withHours(10);
        org.joda.time.Period period27 = period23.plusSeconds(41);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
    }

    @Test
    public void test15516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15516");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(1644572544235L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test15517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15517");
        org.joda.time.Period period1 = org.joda.time.Period.millis(2147483647);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Period period3 = period2.toPeriod();
        org.joda.time.Period period5 = period3.minusMonths(2719);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test15518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15518");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType8);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes12 = minutes10.multipliedBy((int) (short) 1);
        mutablePeriod9.setPeriod((org.joda.time.ReadablePeriod) minutes12);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        java.lang.Object obj17 = null;
        org.joda.time.Duration duration18 = new org.joda.time.Duration(obj17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration18);
        boolean boolean20 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Interval interval22 = duration18.toIntervalTo(readableInstant21);
        mutablePeriod9.setPeriod((org.joda.time.ReadableInterval) interval22);
        org.joda.time.DateTime dateTime24 = interval22.getStart();
        long long25 = interval22.getEndMillis();
        org.joda.time.Period period26 = interval22.toPeriod();
        long long27 = interval22.toDurationMillis();
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant30 = null;
        java.lang.Object obj31 = null;
        org.joda.time.Duration duration32 = new org.joda.time.Duration(obj31);
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant30, (org.joda.time.ReadableDuration) duration32);
        boolean boolean34 = duration29.isShorterThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Interval interval36 = duration32.toIntervalTo(readableInstant35);
        long long37 = interval36.getStartMillis();
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType40);
        mutablePeriod41.setYears(0);
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology46 = null;
        mutablePeriod41.setPeriod((org.joda.time.ReadableDuration) duration45, chronology46);
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant50 = null;
        java.lang.Object obj51 = null;
        org.joda.time.Duration duration52 = new org.joda.time.Duration(obj51);
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant50, (org.joda.time.ReadableDuration) duration52);
        boolean boolean54 = duration49.isShorterThan((org.joda.time.ReadableDuration) duration52);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Interval interval56 = duration52.toIntervalTo(readableInstant55);
        org.joda.time.Interval interval57 = interval56.toInterval();
        org.joda.time.DateTime dateTime58 = interval57.getEnd();
        org.joda.time.Duration duration60 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant61 = null;
        java.lang.Object obj62 = null;
        org.joda.time.Duration duration63 = new org.joda.time.Duration(obj62);
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, (org.joda.time.ReadableDuration) duration63);
        boolean boolean65 = duration60.isShorterThan((org.joda.time.ReadableDuration) duration63);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Interval interval67 = duration63.toIntervalTo(readableInstant66);
        org.joda.time.Interval interval68 = interval67.toInterval();
        org.joda.time.DateTime dateTime69 = interval68.getEnd();
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration45, (org.joda.time.ReadableInstant) dateTime58);
        boolean boolean72 = interval36.isBefore((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Duration duration73 = interval36.toDuration();
        long long74 = interval36.getEndMillis();
        boolean boolean75 = interval22.isAfter((org.joda.time.ReadableInterval) interval36);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1644572668456L + "'", long25 == 1644572668456L);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(interval36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1644572668456L + "'", long37 == 1644572668456L);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(duration73);
// flaky:         org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1644572668456L + "'", long74 == 1644572668456L);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test15519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15519");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1);
        mutablePeriod2.addWeeks((int) (byte) 100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray5 = mutablePeriod2.getFieldTypes();
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        java.lang.Object obj9 = null;
        org.joda.time.Duration duration10 = new org.joda.time.Duration(obj9);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration10);
        boolean boolean12 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Interval interval14 = duration10.toIntervalTo(readableInstant13);
        org.joda.time.Interval interval15 = interval14.toInterval();
        org.joda.time.Period period16 = interval15.toPeriod();
        org.joda.time.Period period18 = period16.minusDays(0);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks22 = weeks20.minus(weeks21);
        org.joda.time.Weeks weeks24 = weeks22.multipliedBy(100);
        org.joda.time.Weeks weeks26 = weeks22.multipliedBy((int) (short) -1);
        org.joda.time.Weeks weeks27 = org.joda.time.Weeks.TWO;
        org.joda.time.Weeks weeks28 = weeks26.plus(weeks27);
        org.joda.time.MutablePeriod mutablePeriod29 = weeks28.toMutablePeriod();
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod29);
        mutablePeriod29.setPeriod(1644572571111L, 1644572249573L);
        org.junit.Assert.assertNotNull(durationFieldTypeArray5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(mutablePeriod29);
    }

    @Test
    public void test15520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15520");
        org.joda.time.Duration duration3 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = duration3.toPeriodFrom(readableInstant4);
        org.joda.time.Period period7 = period5.minusSeconds((int) '4');
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1);
        org.joda.time.DurationFieldType durationFieldType12 = mutablePeriod10.getFieldType(1);
        org.joda.time.Period period14 = period5.withField(durationFieldType12, (int) (byte) 100);
        org.joda.time.Period period16 = period5.minusDays(0);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        java.lang.Object obj21 = null;
        org.joda.time.Duration duration22 = new org.joda.time.Duration(obj21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration22);
        boolean boolean24 = duration19.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Interval interval26 = duration22.toIntervalTo(readableInstant25);
        org.joda.time.Interval interval27 = interval26.toInterval();
        long long28 = interval26.toDurationMillis();
        org.joda.time.Interval interval29 = interval26.toInterval();
        org.joda.time.Days days30 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval26);
        org.joda.time.DurationFieldType durationFieldType31 = days30.getFieldType();
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant35 = null;
        java.lang.Object obj36 = null;
        org.joda.time.Duration duration37 = new org.joda.time.Duration(obj36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant35, (org.joda.time.ReadableDuration) duration37);
        boolean boolean39 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration37);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Interval interval41 = duration37.toIntervalTo(readableInstant40);
        org.joda.time.Interval interval42 = interval41.toInterval();
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.DurationField durationField44 = durationFieldType32.getField(chronology43);
        org.joda.time.DurationField durationField45 = durationFieldType31.getField(chronology43);
        org.joda.time.Period period46 = new org.joda.time.Period((long) ' ', chronology43);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((java.lang.Object) period5, chronology43);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 35, chronology43);
        mutablePeriod48.addHours(26);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(durationField45);
    }

    @Test
    public void test15521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15521");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '4');
        org.joda.time.Period period3 = period1.withYears((int) (byte) 0);
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType5 = weeks4.getPeriodType();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test15522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15522");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType12);
        mutablePeriod13.setYears(0);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration17, chronology18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        java.lang.Object obj21 = null;
        org.joda.time.Duration duration22 = new org.joda.time.Duration(obj21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration22);
        org.joda.time.Duration duration25 = duration22.minus((long) '4');
        mutablePeriod13.add((org.joda.time.ReadableDuration) duration25);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType28 = periodType27.withHoursRemoved();
        org.joda.time.PeriodType periodType29 = periodType28.withSecondsRemoved();
        boolean boolean30 = mutablePeriod13.equals((java.lang.Object) periodType28);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant33 = null;
        java.lang.Object obj34 = null;
        org.joda.time.Duration duration35 = new org.joda.time.Duration(obj34);
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant33, (org.joda.time.ReadableDuration) duration35);
        boolean boolean37 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration35);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Interval interval39 = duration35.toIntervalTo(readableInstant38);
        org.joda.time.Interval interval40 = interval39.toInterval();
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.Period period42 = new org.joda.time.Period((java.lang.Object) interval8, periodType28, chronology41);
        org.joda.time.DateTime dateTime43 = interval8.getStart();
        java.lang.String str44 = dateTime43.toString();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime43);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2022-02-11T09:44:28.555Z" + "'", str44, "2022-02-11T09:44:28.555Z");
    }

    @Test
    public void test15523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15523");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (short) 1);
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Duration duration3 = minutes2.toStandardDuration();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) minutes2);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.minutesIn(readableInterval5);
        java.lang.String str7 = minutes6.toString();
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes10 = minutes8.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType11 = minutes10.getPeriodType();
        org.joda.time.PeriodType periodType12 = periodType11.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.eras();
        boolean boolean14 = periodType11.isSupported(durationFieldType13);
        int int15 = minutes6.get(durationFieldType13);
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.minutesIn(readableInterval16);
        org.joda.time.Minutes minutes18 = minutes6.minus(minutes17);
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes20 = minutes6.minus(minutes19);
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.parseMinutes("PT0M");
        org.joda.time.Minutes minutes23 = minutes6.plus(minutes22);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod25.addMinutes((int) (short) 1);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType36);
        org.joda.time.Minutes minutes38 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes40 = minutes38.multipliedBy((int) (short) 1);
        mutablePeriod37.setPeriod((org.joda.time.ReadablePeriod) minutes40);
        boolean boolean42 = mutablePeriod25.equals((java.lang.Object) minutes40);
        org.joda.time.PeriodType periodType43 = minutes40.getPeriodType();
        org.joda.time.Duration duration44 = minutes40.toStandardDuration();
        org.joda.time.MutablePeriod mutablePeriod45 = minutes40.toMutablePeriod();
        org.joda.time.Duration duration46 = minutes40.toStandardDuration();
        org.joda.time.ReadableInterval readableInterval49 = null;
        org.joda.time.Minutes minutes50 = org.joda.time.Minutes.minutesIn(readableInterval49);
        java.lang.String str51 = minutes50.toString();
        org.joda.time.PeriodType periodType52 = minutes50.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (short) 10, (long) (byte) -1, periodType52, chronology53);
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.eras();
        int int56 = period54.indexOf(durationFieldType55);
        java.lang.String str57 = durationFieldType55.getName();
        boolean boolean58 = minutes40.isSupported(durationFieldType55);
        boolean boolean59 = minutes22.isGreaterThan(minutes40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes60 = minutes2.plus(minutes40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 1440 + 2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0M" + "'", str7, "PT0M");
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(mutablePeriod45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PT0M" + "'", str51, "PT0M");
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "eras" + "'", str57, "eras");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test15524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15524");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType2 = seconds1.getFieldType();
        org.joda.time.Seconds seconds4 = seconds1.plus((-1));
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        java.lang.String str6 = seconds5.toString();
        org.joda.time.Seconds seconds7 = seconds4.plus(seconds5);
        org.joda.time.Seconds seconds8 = seconds0.minus(seconds5);
        org.joda.time.Seconds seconds10 = seconds8.multipliedBy((int) (byte) -1);
        org.joda.time.Duration duration11 = seconds10.toStandardDuration();
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Period period14 = period12.withSeconds(1);
        org.joda.time.Period period15 = period12.toPeriod();
        org.joda.time.Seconds seconds16 = period15.toStandardSeconds();
        org.joda.time.Period period18 = org.joda.time.Period.parse("PT0.001S");
        org.joda.time.Period period20 = period18.withMonths((int) (short) 1);
        org.joda.time.Period period22 = period18.plusDays(90);
        org.joda.time.Seconds seconds23 = period22.toStandardSeconds();
        org.joda.time.Seconds seconds25 = seconds23.minus(369700);
        org.joda.time.Seconds seconds26 = seconds16.minus(seconds25);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT2S" + "'", str6, "PT2S");
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
    }

    @Test
    public void test15525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15525");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(5);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test15526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15526");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 10);
        int int3 = period1.getValue(0);
        org.joda.time.Period period4 = period1.toPeriod();
        org.joda.time.Period period5 = period4.negated();
        org.joda.time.Period period7 = period4.plusMinutes((-36));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test15527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15527");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval9);
        org.joda.time.Hours hours11 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval9);
        org.joda.time.Hours hours13 = hours11.minus(8);
        org.joda.time.Hours hours15 = hours13.plus(0);
        org.joda.time.DurationFieldType durationFieldType16 = hours15.getFieldType();
        org.joda.time.Hours hours18 = hours15.multipliedBy((int) (byte) 100);
        org.joda.time.Hours hours19 = org.joda.time.Hours.ONE;
        org.joda.time.Duration duration20 = hours19.toStandardDuration();
        org.joda.time.Hours hours21 = hours18.plus(hours19);
        org.joda.time.Hours hours22 = hours18.negated();
        org.joda.time.Hours hours23 = hours22.negated();
        org.joda.time.Period period25 = org.joda.time.Period.weeks((int) '#');
        org.joda.time.Period period27 = period25.withMinutes(35);
        boolean boolean28 = hours22.equals((java.lang.Object) period27);
        org.joda.time.PeriodType periodType29 = hours22.getPeriodType();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test15528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15528");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(periodType1);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str5 = durationFieldType4.toString();
        boolean boolean6 = periodType1.isSupported(durationFieldType4);
        org.joda.time.Period period7 = new org.joda.time.Period((long) 8, periodType1);
        int int8 = period7.getMonths();
        org.joda.time.Period period10 = period7.plusSeconds((int) (byte) 10);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "weeks" + "'", str5, "weeks");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test15529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15529");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod1.addMinutes((int) (short) 1);
        mutablePeriod1.addSeconds((int) (short) 100);
        org.joda.time.Duration duration14 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = duration14.toPeriodFrom(readableInstant15);
        org.joda.time.Period period18 = period16.minusSeconds((int) '4');
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1);
        org.joda.time.DurationFieldType durationFieldType23 = mutablePeriod21.getFieldType(1);
        org.joda.time.Period period25 = period16.withField(durationFieldType23, (int) (byte) 100);
        org.joda.time.Period period27 = period16.minusDays(0);
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant31 = null;
        java.lang.Object obj32 = null;
        org.joda.time.Duration duration33 = new org.joda.time.Duration(obj32);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration33);
        boolean boolean35 = duration30.isShorterThan((org.joda.time.ReadableDuration) duration33);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Interval interval37 = duration33.toIntervalTo(readableInstant36);
        org.joda.time.Interval interval38 = interval37.toInterval();
        long long39 = interval37.toDurationMillis();
        org.joda.time.Interval interval40 = interval37.toInterval();
        org.joda.time.Days days41 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval37);
        org.joda.time.DurationFieldType durationFieldType42 = days41.getFieldType();
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant46 = null;
        java.lang.Object obj47 = null;
        org.joda.time.Duration duration48 = new org.joda.time.Duration(obj47);
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant46, (org.joda.time.ReadableDuration) duration48);
        boolean boolean50 = duration45.isShorterThan((org.joda.time.ReadableDuration) duration48);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Interval interval52 = duration48.toIntervalTo(readableInstant51);
        org.joda.time.Interval interval53 = interval52.toInterval();
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.DurationField durationField55 = durationFieldType43.getField(chronology54);
        org.joda.time.DurationField durationField56 = durationFieldType42.getField(chronology54);
        org.joda.time.Period period57 = new org.joda.time.Period((long) ' ', chronology54);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((java.lang.Object) period16, chronology54);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(1644572229589L, (long) (short) 100, chronology54);
        org.joda.time.Period period60 = new org.joda.time.Period(1644572231967L, 1644572212937L, chronology54);
        mutablePeriod1.setPeriod(19L, (long) (byte) -1, chronology54);
        int int62 = mutablePeriod1.getMinutes();
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test15530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15530");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(obj1);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.Period period5 = period3.withSeconds((int) '4');
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) ' ', chronology7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType11);
        mutablePeriod12.setYears(0);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology17 = null;
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration16, chronology17);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        java.lang.Object obj22 = null;
        org.joda.time.Duration duration23 = new org.joda.time.Duration(obj22);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, (org.joda.time.ReadableDuration) duration23);
        boolean boolean25 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Interval interval27 = duration23.toIntervalTo(readableInstant26);
        org.joda.time.Interval interval28 = interval27.toInterval();
        org.joda.time.DateTime dateTime29 = interval28.getEnd();
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        java.lang.Object obj33 = null;
        org.joda.time.Duration duration34 = new org.joda.time.Duration(obj33);
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, (org.joda.time.ReadableDuration) duration34);
        boolean boolean36 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Interval interval38 = duration34.toIntervalTo(readableInstant37);
        org.joda.time.Interval interval39 = interval38.toInterval();
        org.joda.time.DateTime dateTime40 = interval39.getEnd();
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant45 = null;
        java.lang.Object obj46 = null;
        org.joda.time.Duration duration47 = new org.joda.time.Duration(obj46);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, (org.joda.time.ReadableDuration) duration47);
        boolean boolean49 = duration44.isShorterThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Interval interval51 = duration47.toIntervalTo(readableInstant50);
        org.joda.time.Interval interval52 = interval51.toInterval();
        org.joda.time.DateTime dateTime53 = interval52.getEnd();
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType56 = periodType55.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(periodType56);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(10L, periodType56);
        org.joda.time.Period period59 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime53, periodType56);
        org.joda.time.Duration duration60 = mutablePeriod8.toDurationFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Duration duration61 = period5.toDurationFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType64);
        mutablePeriod65.setYears(0);
        java.lang.String str68 = mutablePeriod65.toString();
        mutablePeriod65.setPeriod(1644572093963L, 1644572077926L);
        boolean boolean72 = dateTime29.equals((java.lang.Object) 1644572093963L);
        org.joda.time.Duration duration74 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant75 = null;
        java.lang.Object obj76 = null;
        org.joda.time.Duration duration77 = new org.joda.time.Duration(obj76);
        org.joda.time.Period period78 = new org.joda.time.Period(readableInstant75, (org.joda.time.ReadableDuration) duration77);
        boolean boolean79 = duration74.isShorterThan((org.joda.time.ReadableDuration) duration77);
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.Interval interval81 = duration77.toIntervalTo(readableInstant80);
        org.joda.time.Interval interval82 = interval81.toInterval();
        org.joda.time.Duration duration84 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant85 = null;
        java.lang.Object obj86 = null;
        org.joda.time.Duration duration87 = new org.joda.time.Duration(obj86);
        org.joda.time.Period period88 = new org.joda.time.Period(readableInstant85, (org.joda.time.ReadableDuration) duration87);
        boolean boolean89 = duration84.isShorterThan((org.joda.time.ReadableDuration) duration87);
        org.joda.time.ReadableInstant readableInstant90 = null;
        org.joda.time.Interval interval91 = duration87.toIntervalTo(readableInstant90);
        boolean boolean92 = interval82.isAfter((org.joda.time.ReadableInterval) interval91);
        org.joda.time.Period period93 = interval91.toPeriod();
        org.joda.time.DateTime dateTime94 = interval91.getStart();
        org.joda.time.Period period95 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime94);
        org.joda.time.Instant instant96 = dateTime29.toInstant();
        org.joda.time.Instant instant97 = instant96.toInstant();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "PT0.001S" + "'", str68, "PT0.001S");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertNotNull(duration84);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(interval91);
// flaky:         org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertNotNull(instant96);
        org.junit.Assert.assertNotNull(instant97);
    }

    @Test
    public void test15531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15531");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, 0L);
        org.joda.time.Period period4 = period2.minusYears((int) (short) 1);
        org.joda.time.Period period6 = period4.plusWeeks(36000000);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test15532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15532");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType2 = periodType1.withYearsRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (-101), periodType3);
        org.joda.time.PeriodType periodType5 = periodType3.withHoursRemoved();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test15533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15533");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-101));
        org.joda.time.Period period3 = org.joda.time.Period.days((-97));
        org.joda.time.Period period4 = period1.minus((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = period4.minusYears(0);
        org.joda.time.Hours hours7 = period6.toStandardHours();
        org.joda.time.PeriodType periodType8 = hours7.getPeriodType();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test15534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15534");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(obj1);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.Days days4 = duration2.toStandardDays();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours(1644572080830L);
        int int7 = duration2.compareTo((org.joda.time.ReadableDuration) duration6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        java.lang.Object obj9 = null;
        org.joda.time.Duration duration10 = new org.joda.time.Duration(obj9);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, readableInstant12);
        org.joda.time.Duration duration15 = org.joda.time.Duration.millis((long) '4');
        long long16 = duration15.getStandardDays();
        boolean boolean17 = duration10.isLongerThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType19 = periodType18.withHoursRemoved();
        org.joda.time.Period period20 = duration15.toPeriod(periodType18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) ' ', chronology22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType26);
        mutablePeriod27.setYears(0);
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology32 = null;
        mutablePeriod27.setPeriod((org.joda.time.ReadableDuration) duration31, chronology32);
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        java.lang.Object obj37 = null;
        org.joda.time.Duration duration38 = new org.joda.time.Duration(obj37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration38);
        boolean boolean40 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Interval interval42 = duration38.toIntervalTo(readableInstant41);
        org.joda.time.Interval interval43 = interval42.toInterval();
        org.joda.time.DateTime dateTime44 = interval43.getEnd();
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant47 = null;
        java.lang.Object obj48 = null;
        org.joda.time.Duration duration49 = new org.joda.time.Duration(obj48);
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, (org.joda.time.ReadableDuration) duration49);
        boolean boolean51 = duration46.isShorterThan((org.joda.time.ReadableDuration) duration49);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Interval interval53 = duration49.toIntervalTo(readableInstant52);
        org.joda.time.Interval interval54 = interval53.toInterval();
        org.joda.time.DateTime dateTime55 = interval54.getEnd();
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration31, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant60 = null;
        java.lang.Object obj61 = null;
        org.joda.time.Duration duration62 = new org.joda.time.Duration(obj61);
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, (org.joda.time.ReadableDuration) duration62);
        boolean boolean64 = duration59.isShorterThan((org.joda.time.ReadableDuration) duration62);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Interval interval66 = duration62.toIntervalTo(readableInstant65);
        org.joda.time.Interval interval67 = interval66.toInterval();
        org.joda.time.DateTime dateTime68 = interval67.getEnd();
        org.joda.time.PeriodType periodType70 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType71 = periodType70.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod(periodType71);
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(10L, periodType71);
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime68, periodType71);
        org.joda.time.Duration duration75 = mutablePeriod23.toDurationFrom((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Duration duration77 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant78 = null;
        java.lang.Object obj79 = null;
        org.joda.time.Duration duration80 = new org.joda.time.Duration(obj79);
        org.joda.time.Period period81 = new org.joda.time.Period(readableInstant78, (org.joda.time.ReadableDuration) duration80);
        boolean boolean82 = duration77.isShorterThan((org.joda.time.ReadableDuration) duration80);
        org.joda.time.ReadableInstant readableInstant83 = null;
        org.joda.time.Interval interval84 = duration80.toIntervalTo(readableInstant83);
        org.joda.time.Interval interval85 = interval84.toInterval();
        org.joda.time.DateTime dateTime86 = interval85.getEnd();
        boolean boolean87 = dateTime44.isBefore((org.joda.time.ReadableInstant) dateTime86);
        org.joda.time.Period period88 = duration15.toPeriodTo((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Period period89 = duration2.toPeriodFrom((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Days days90 = duration2.toStandardDays();
        org.joda.time.Days days91 = days90.negated();
        org.joda.time.Days days93 = days90.minus(19034);
        org.joda.time.Days days95 = days90.dividedBy((-3));
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(interval84);
        org.junit.Assert.assertNotNull(interval85);
        org.junit.Assert.assertNotNull(dateTime86);
// flaky:         org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(days90);
        org.junit.Assert.assertNotNull(days91);
        org.junit.Assert.assertNotNull(days93);
        org.junit.Assert.assertNotNull(days95);
    }

    @Test
    public void test15535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15535");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval9);
        org.joda.time.DurationFieldType durationFieldType12 = weeks11.getFieldType();
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks14 = weeks11.plus(weeks13);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        java.lang.Object obj18 = null;
        org.joda.time.Duration duration19 = new org.joda.time.Duration(obj18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration19);
        boolean boolean21 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Interval interval23 = duration19.toIntervalTo(readableInstant22);
        org.joda.time.Interval interval24 = interval23.toInterval();
        org.joda.time.Period period25 = interval24.toPeriod();
        org.joda.time.MutableInterval mutableInterval26 = interval24.toMutableInterval();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(1644572148318L);
        boolean boolean29 = mutableInterval26.equals((java.lang.Object) mutablePeriod28);
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.Weeks weeks31 = weeks13.minus(weeks30);
        int int32 = weeks30.getWeeks();
        org.joda.time.Weeks weeks34 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks35 = weeks34.negated();
        org.joda.time.Period period36 = weeks35.toPeriod();
        org.joda.time.Weeks weeks38 = weeks35.minus((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType39 = weeks38.getFieldType();
        org.joda.time.Weeks weeks41 = weeks38.dividedBy((int) (byte) -1);
        int int42 = weeks38.getWeeks();
        org.joda.time.Weeks weeks43 = weeks30.minus(weeks38);
        org.joda.time.Weeks weeks45 = org.joda.time.Weeks.weeks(36);
        org.joda.time.Weeks weeks47 = weeks45.plus(0);
        org.joda.time.Weeks weeks49 = org.joda.time.Weeks.weeks(36);
        org.joda.time.Weeks weeks51 = weeks49.plus(0);
        org.joda.time.Weeks weeks52 = weeks45.minus(weeks49);
        org.joda.time.Weeks weeks54 = weeks49.dividedBy(30);
        org.joda.time.DurationFieldType durationFieldType55 = weeks49.getFieldType();
        org.joda.time.Weeks weeks56 = weeks38.minus(weeks49);
        int int57 = weeks56.getWeeks();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(mutableInterval26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2719 + "'", int32 == 2719);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(weeks43);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertNotNull(weeks52);
        org.junit.Assert.assertNotNull(weeks54);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertNotNull(weeks56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-36) + "'", int57 == (-36));
    }

    @Test
    public void test15536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15536");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(1);
        org.joda.time.Period period3 = period1.withSeconds((-9700));
        int int4 = period3.getSeconds();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType13);
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes17 = minutes15.multipliedBy((int) (short) 1);
        mutablePeriod14.setPeriod((org.joda.time.ReadablePeriod) minutes17);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        java.lang.Object obj22 = null;
        org.joda.time.Duration duration23 = new org.joda.time.Duration(obj22);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, (org.joda.time.ReadableDuration) duration23);
        boolean boolean25 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Interval interval27 = duration23.toIntervalTo(readableInstant26);
        mutablePeriod14.setPeriod((org.joda.time.ReadableInterval) interval27);
        org.joda.time.DateTime dateTime29 = interval27.getStart();
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period31 = new org.joda.time.Period((java.lang.Object) int4, chronology30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-9700) + "'", int4 == (-9700));
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
    }

    @Test
    public void test15537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15537");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        java.lang.Object obj14 = null;
        org.joda.time.Duration duration15 = new org.joda.time.Duration(obj14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration15);
        boolean boolean17 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration15.toIntervalTo(readableInstant18);
        org.joda.time.Interval interval20 = interval19.toInterval();
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        java.lang.Object obj26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(obj26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration27);
        boolean boolean29 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        org.joda.time.Interval interval32 = interval31.toInterval();
        org.joda.time.DateTime dateTime33 = interval32.getEnd();
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        java.lang.Object obj37 = null;
        org.joda.time.Duration duration38 = new org.joda.time.Duration(obj37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration38);
        boolean boolean40 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Interval interval42 = duration38.toIntervalTo(readableInstant41);
        org.joda.time.Interval interval43 = interval42.toInterval();
        org.joda.time.DateTime dateTime44 = interval43.getEnd();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Minutes minutes46 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DurationFieldType durationFieldType47 = minutes46.getFieldType();
        org.joda.time.Duration duration50 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration53 = duration50.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Minutes minutes54 = duration53.toStandardMinutes();
        org.joda.time.Duration duration56 = org.joda.time.Duration.millis((long) '4');
        long long57 = duration56.getMillis();
        org.joda.time.Minutes minutes58 = duration56.toStandardMinutes();
        org.joda.time.Minutes minutes59 = minutes58.negated();
        boolean boolean60 = minutes54.isGreaterThan(minutes59);
        org.joda.time.Minutes minutes61 = minutes46.plus(minutes59);
        org.joda.time.Period period64 = new org.joda.time.Period(0L, 0L);
        org.joda.time.Minutes minutes65 = period64.toStandardMinutes();
        org.joda.time.Minutes minutes66 = minutes61.plus(minutes65);
        org.joda.time.Minutes minutes68 = minutes61.multipliedBy(27409537);
        org.joda.time.Duration duration71 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Period period73 = duration71.toPeriodFrom(readableInstant72);
        org.joda.time.Period period75 = period73.minusSeconds((int) '4');
        org.joda.time.Minutes minutes76 = period73.toStandardMinutes();
        org.joda.time.Period period78 = period73.multipliedBy((int) (byte) 100);
        org.joda.time.Period period80 = period78.withHours((int) (short) 0);
        org.joda.time.Minutes minutes81 = period78.toStandardMinutes();
        org.joda.time.Duration duration84 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration87 = duration84.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Minutes minutes88 = duration87.toStandardMinutes();
        org.joda.time.Duration duration90 = org.joda.time.Duration.millis((long) '4');
        long long91 = duration90.getMillis();
        org.joda.time.Minutes minutes92 = duration90.toStandardMinutes();
        org.joda.time.Minutes minutes93 = minutes92.negated();
        boolean boolean94 = minutes88.isGreaterThan(minutes93);
        org.joda.time.Minutes minutes96 = minutes88.minus((int) (byte) 0);
        org.joda.time.Minutes minutes97 = minutes81.minus(minutes88);
        org.joda.time.Minutes minutes98 = minutes97.negated();
        boolean boolean99 = minutes68.isGreaterThan(minutes98);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 52L + "'", long57 == 52L);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(minutes61);
        org.junit.Assert.assertNotNull(minutes65);
        org.junit.Assert.assertNotNull(minutes66);
        org.junit.Assert.assertNotNull(minutes68);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(minutes76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(minutes81);
        org.junit.Assert.assertNotNull(duration87);
        org.junit.Assert.assertNotNull(minutes88);
        org.junit.Assert.assertNotNull(duration90);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 52L + "'", long91 == 52L);
        org.junit.Assert.assertNotNull(minutes92);
        org.junit.Assert.assertNotNull(minutes93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(minutes96);
        org.junit.Assert.assertNotNull(minutes97);
        org.junit.Assert.assertNotNull(minutes98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test15538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15538");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(1644572512309L);
    }

    @Test
    public void test15539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15539");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod1.addMinutes((int) (short) 1);
        int int4 = mutablePeriod1.getWeeks();
        mutablePeriod1.setHours((int) (short) 100);
        mutablePeriod1.setSeconds((-1));
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType11);
        mutablePeriod12.setYears(0);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology17 = null;
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration16, chronology17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        java.lang.Object obj20 = null;
        org.joda.time.Duration duration21 = new org.joda.time.Duration(obj20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.Duration duration24 = duration21.minus((long) '4');
        mutablePeriod12.add((org.joda.time.ReadableDuration) duration24);
        mutablePeriod1.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Weeks weeks27 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks28 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks29 = weeks27.minus(weeks28);
        org.joda.time.PeriodType periodType30 = weeks29.getPeriodType();
        org.joda.time.Weeks weeks32 = weeks29.minus((int) (short) -1);
        org.joda.time.Weeks weeks34 = weeks32.plus(0);
        org.joda.time.Weeks weeks35 = weeks34.negated();
        org.joda.time.Weeks weeks37 = weeks34.plus(56);
        mutablePeriod12.add((org.joda.time.ReadablePeriod) weeks37);
        mutablePeriod12.addMonths(3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(weeks37);
    }

    @Test
    public void test15540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15540");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = org.joda.time.Days.ONE;
        org.joda.time.Days days2 = days1.negated();
        org.joda.time.Days days3 = org.joda.time.Days.ONE;
        org.joda.time.Days days4 = days3.negated();
        org.joda.time.Days days5 = org.joda.time.Days.ONE;
        org.joda.time.Days days6 = days5.negated();
        boolean boolean7 = days4.isGreaterThan(days6);
        org.joda.time.Days days8 = days1.plus(days6);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.joda.time.Days days11 = days1.plus((-1));
        org.joda.time.Days days12 = days0.plus(days1);
        org.joda.time.Days days14 = days12.multipliedBy(246);
        org.joda.time.Days days16 = days14.multipliedBy((-35));
        org.joda.time.Days days18 = days14.dividedBy((-617));
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days18);
    }

    @Test
    public void test15541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15541");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        int int1 = days0.size();
        org.joda.time.Duration duration2 = days0.toStandardDuration();
        int int3 = days0.getDays();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test15542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15542");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 'a');
        org.joda.time.Days days2 = org.joda.time.Days.FOUR;
        org.joda.time.Days days4 = days2.multipliedBy((-1));
        org.joda.time.Days days6 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod8 = days6.toMutablePeriod();
        org.joda.time.Days days9 = days4.plus(days6);
        org.joda.time.Duration duration11 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration13 = duration11.plus(1644572076849L);
        org.joda.time.Days days14 = duration11.toStandardDays();
        org.joda.time.Period period15 = days14.toPeriod();
        java.lang.String str16 = days14.toString();
        org.joda.time.Days days17 = org.joda.time.Days.FOUR;
        org.joda.time.Days days19 = days17.multipliedBy((-1));
        boolean boolean20 = days14.isGreaterThan(days19);
        boolean boolean21 = days9.isGreaterThan(days14);
        org.joda.time.Days days23 = days9.minus((int) (byte) 10);
        org.joda.time.Days days24 = org.joda.time.Days.SIX;
        org.joda.time.Days days26 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.Days days27 = days24.plus(days26);
        org.joda.time.Duration duration28 = days27.toStandardDuration();
        boolean boolean29 = days23.isGreaterThan(days27);
        int int30 = days27.getDays();
        org.joda.time.MutablePeriod mutablePeriod31 = days27.toMutablePeriod();
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant34 = null;
        java.lang.Object obj35 = null;
        org.joda.time.Duration duration36 = new org.joda.time.Duration(obj35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration36);
        boolean boolean38 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration36);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Interval interval40 = duration36.toIntervalTo(readableInstant39);
        org.joda.time.Interval interval41 = interval40.toInterval();
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant44 = null;
        java.lang.Object obj45 = null;
        org.joda.time.Duration duration46 = new org.joda.time.Duration(obj45);
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, (org.joda.time.ReadableDuration) duration46);
        boolean boolean48 = duration43.isShorterThan((org.joda.time.ReadableDuration) duration46);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Interval interval50 = duration46.toIntervalTo(readableInstant49);
        boolean boolean51 = interval41.isAfter((org.joda.time.ReadableInterval) interval50);
        org.joda.time.Interval interval52 = interval41.toInterval();
        org.joda.time.Interval interval53 = interval52.toInterval();
        mutablePeriod31.setPeriod((org.joda.time.ReadableInterval) interval53);
        org.joda.time.DateTime dateTime55 = interval53.getEnd();
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime55);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P0D" + "'", str16, "P0D");
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(mutablePeriod31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(dateTime55);
    }

    @Test
    public void test15543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15543");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType8);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes12 = minutes10.multipliedBy((int) (short) 1);
        mutablePeriod9.setPeriod((org.joda.time.ReadablePeriod) minutes12);
        org.joda.time.PeriodType periodType14 = minutes12.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(periodType14);
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod15.toMutablePeriod();
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(mutablePeriod16);
    }

    @Test
    public void test15544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15544");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod1.addMinutes((int) (short) 1);
        mutablePeriod1.addHours(10);
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod1.copy();
        int[] intArray7 = mutablePeriod6.getValues();
        org.joda.time.Days days8 = org.joda.time.Days.MAX_VALUE;
        java.lang.String str9 = days8.toString();
        org.joda.time.DurationFieldType durationFieldType10 = days8.getFieldType();
        org.joda.time.DurationFieldType durationFieldType11 = days8.getFieldType();
        java.lang.String str12 = durationFieldType11.toString();
        mutablePeriod6.set(durationFieldType11, 2147483642);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 0, 0, 10, 1, 0, 0]");
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P2147483647D" + "'", str9, "P2147483647D");
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "days" + "'", str12, "days");
    }

    @Test
    public void test15545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15545");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        java.lang.Object obj4 = null;
        org.joda.time.Duration duration5 = new org.joda.time.Duration(obj4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration5);
        boolean boolean7 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Interval interval9 = duration5.toIntervalTo(readableInstant8);
        org.joda.time.Interval interval10 = interval9.toInterval();
        org.joda.time.DateTime dateTime11 = interval10.getEnd();
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        java.lang.Object obj15 = null;
        org.joda.time.Duration duration16 = new org.joda.time.Duration(obj15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration16);
        boolean boolean18 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Interval interval20 = duration16.toIntervalTo(readableInstant19);
        org.joda.time.Interval interval21 = interval20.toInterval();
        org.joda.time.DateTime dateTime22 = interval21.getEnd();
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        boolean boolean25 = dateTime11.isSupported(dateTimeFieldType24);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        java.lang.Object obj29 = null;
        org.joda.time.Duration duration30 = new org.joda.time.Duration(obj29);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration30);
        boolean boolean32 = duration27.isShorterThan((org.joda.time.ReadableDuration) duration30);
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((java.lang.Object) duration27, periodType33, chronology34);
        org.joda.time.Duration duration37 = org.joda.time.Duration.millis((long) '4');
        long long38 = duration37.getStandardDays();
        boolean boolean39 = duration27.isLongerThan((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInterval readableInterval41 = null;
        org.joda.time.Seconds seconds42 = org.joda.time.Seconds.secondsIn(readableInterval41);
        org.joda.time.Seconds seconds44 = seconds42.dividedBy((int) '#');
        org.joda.time.ReadableInstant readableInstant45 = null;
        java.lang.Object obj46 = null;
        org.joda.time.Duration duration47 = new org.joda.time.Duration(obj46);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, (org.joda.time.ReadableDuration) duration47);
        org.joda.time.Seconds seconds49 = period48.toStandardSeconds();
        org.joda.time.Seconds seconds50 = period48.toStandardSeconds();
        org.joda.time.Seconds seconds51 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds52 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType53 = seconds52.getFieldType();
        org.joda.time.Seconds seconds55 = seconds52.plus((-1));
        org.joda.time.Seconds seconds56 = org.joda.time.Seconds.TWO;
        java.lang.String str57 = seconds56.toString();
        org.joda.time.Seconds seconds58 = seconds55.plus(seconds56);
        org.joda.time.Seconds seconds59 = seconds51.minus(seconds56);
        org.joda.time.PeriodType periodType60 = seconds51.getPeriodType();
        org.joda.time.Seconds seconds61 = seconds50.plus(seconds51);
        boolean boolean62 = seconds42.isLessThan(seconds61);
        org.joda.time.Period period63 = period40.plus((org.joda.time.ReadablePeriod) seconds61);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1);
        mutablePeriod66.addWeeks((int) (byte) 100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray69 = mutablePeriod66.getFieldTypes();
        mutablePeriod66.addMillis((int) 'a');
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod();
        mutablePeriod73.setPeriod(100L, (long) (-1));
        org.joda.time.Duration duration82 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant83 = null;
        java.lang.Object obj84 = null;
        org.joda.time.Duration duration85 = new org.joda.time.Duration(obj84);
        org.joda.time.Period period86 = new org.joda.time.Period(readableInstant83, (org.joda.time.ReadableDuration) duration85);
        boolean boolean87 = duration82.isShorterThan((org.joda.time.ReadableDuration) duration85);
        org.joda.time.ReadableInstant readableInstant88 = null;
        org.joda.time.Interval interval89 = duration85.toIntervalTo(readableInstant88);
        org.joda.time.Interval interval90 = interval89.toInterval();
        org.joda.time.Chronology chronology91 = interval90.getChronology();
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((-1L), chronology91);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod(0L, (long) (short) -1, chronology91);
        mutablePeriod73.setPeriod((long) 100, chronology91);
        mutablePeriod66.setPeriod(1644572118718L, chronology91);
        org.joda.time.Period period96 = new org.joda.time.Period((java.lang.Object) period40, chronology91);
        org.joda.time.Period period97 = new org.joda.time.Period(1644572461141L, chronology91);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertNotNull(seconds49);
        org.junit.Assert.assertNotNull(seconds50);
        org.junit.Assert.assertNotNull(seconds51);
        org.junit.Assert.assertNotNull(seconds52);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertNotNull(seconds55);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PT2S" + "'", str57, "PT2S");
        org.junit.Assert.assertNotNull(seconds58);
        org.junit.Assert.assertNotNull(seconds59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(seconds61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(durationFieldTypeArray69);
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(interval89);
        org.junit.Assert.assertNotNull(interval90);
        org.junit.Assert.assertNotNull(chronology91);
    }

    @Test
    public void test15546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15546");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        int int3 = weeks1.getWeeks();
        org.joda.time.Weeks weeks5 = weeks1.minus(3);
        org.joda.time.Weeks weeks7 = weeks5.minus(0);
        org.joda.time.PeriodType periodType8 = weeks5.getPeriodType();
        org.joda.time.Weeks weeks10 = weeks5.plus(876);
        org.joda.time.Weeks weeks12 = weeks5.minus(298);
        org.joda.time.Weeks weeks14 = weeks12.minus(670);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
    }

    @Test
    public void test15547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15547");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType8);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType12);
        mutablePeriod13.setYears(0);
        mutablePeriod9.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        mutablePeriod13.setPeriod((long) (byte) 10);
        org.joda.time.Period period20 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.Period period22 = period20.withMillis((-2147483648));
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = period22.normalizedStandard(periodType23);
        mutablePeriod13.add((org.joda.time.ReadablePeriod) period22);
        mutablePeriod13.addHours(52114);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test15548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15548");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        java.lang.String str7 = period6.toString();
        org.joda.time.MutablePeriod mutablePeriod8 = period6.toMutablePeriod();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration13.toIntervalTo(readableInstant16);
        long long18 = interval17.getStartMillis();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Duration duration23 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = duration23.toPeriodFrom(readableInstant24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = duration23.toPeriod(chronology26);
        java.lang.String str28 = period27.toString();
        org.joda.time.MutablePeriod mutablePeriod29 = period27.toMutablePeriod();
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        java.lang.Object obj33 = null;
        org.joda.time.Duration duration34 = new org.joda.time.Duration(obj33);
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, (org.joda.time.ReadableDuration) duration34);
        boolean boolean36 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Interval interval38 = duration34.toIntervalTo(readableInstant37);
        long long39 = interval38.getStartMillis();
        mutablePeriod29.setPeriod((org.joda.time.ReadableInterval) interval38);
        org.joda.time.Weeks weeks41 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval38);
        boolean boolean42 = interval17.overlaps((org.joda.time.ReadableInterval) interval38);
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant45 = null;
        java.lang.Object obj46 = null;
        org.joda.time.Duration duration47 = new org.joda.time.Duration(obj46);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, (org.joda.time.ReadableDuration) duration47);
        boolean boolean49 = duration44.isShorterThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Interval interval51 = duration47.toIntervalTo(readableInstant50);
        org.joda.time.Interval interval52 = interval51.toInterval();
        org.joda.time.Duration duration54 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant55 = null;
        java.lang.Object obj56 = null;
        org.joda.time.Duration duration57 = new org.joda.time.Duration(obj56);
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant55, (org.joda.time.ReadableDuration) duration57);
        boolean boolean59 = duration54.isShorterThan((org.joda.time.ReadableDuration) duration57);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Interval interval61 = duration57.toIntervalTo(readableInstant60);
        boolean boolean62 = interval52.isAfter((org.joda.time.ReadableInterval) interval61);
        org.joda.time.Weeks weeks63 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval61);
        org.joda.time.Duration duration65 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant66 = null;
        java.lang.Object obj67 = null;
        org.joda.time.Duration duration68 = new org.joda.time.Duration(obj67);
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, (org.joda.time.ReadableDuration) duration68);
        boolean boolean70 = duration65.isShorterThan((org.joda.time.ReadableDuration) duration68);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Interval interval72 = duration68.toIntervalTo(readableInstant71);
        org.joda.time.Interval interval73 = interval72.toInterval();
        org.joda.time.Duration duration75 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant76 = null;
        java.lang.Object obj77 = null;
        org.joda.time.Duration duration78 = new org.joda.time.Duration(obj77);
        org.joda.time.Period period79 = new org.joda.time.Period(readableInstant76, (org.joda.time.ReadableDuration) duration78);
        boolean boolean80 = duration75.isShorterThan((org.joda.time.ReadableDuration) duration78);
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.Interval interval82 = duration78.toIntervalTo(readableInstant81);
        boolean boolean83 = interval73.isAfter((org.joda.time.ReadableInterval) interval82);
        org.joda.time.Period period84 = interval82.toPeriod();
        boolean boolean85 = interval61.isAfter((org.joda.time.ReadableInterval) interval82);
        org.joda.time.DateTime dateTime86 = interval61.getEnd();
        org.joda.time.Duration duration88 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Period period89 = duration88.toPeriod();
        org.joda.time.Period period91 = period89.plusMillis((int) (byte) 0);
        int int92 = period89.getHours();
        boolean boolean93 = dateTime86.equals((java.lang.Object) period89);
        boolean boolean94 = interval17.isBefore((org.joda.time.ReadableInstant) dateTime86);
        org.joda.time.ReadableInstant readableInstant95 = null;
        boolean boolean96 = dateTime86.isBefore(readableInstant95);
        java.lang.String str97 = dateTime86.toString();
        org.joda.time.Chronology chronology98 = dateTime86.getChronology();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.097S" + "'", str7, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644572669257L + "'", long18 == 1644572669257L);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PT0.097S" + "'", str28, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(interval38);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1644572669257L + "'", long39 == 1644572669257L);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(weeks63);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(duration88);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str97 + "' != '" + "2022-02-11T09:44:29.257Z" + "'", str97, "2022-02-11T09:44:29.257Z");
        org.junit.Assert.assertNotNull(chronology98);
    }

    @Test
    public void test15549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15549");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        java.lang.Object obj4 = null;
        org.joda.time.Duration duration5 = new org.joda.time.Duration(obj4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration5);
        boolean boolean7 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.minutesIn(readableInterval9);
        java.lang.String str11 = minutes10.toString();
        org.joda.time.PeriodType periodType12 = minutes10.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant8, periodType12);
        org.joda.time.Duration duration15 = duration5.withMillis((long) 'a');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        java.lang.Object obj19 = null;
        org.joda.time.Duration duration20 = new org.joda.time.Duration(obj19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration20);
        boolean boolean22 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        java.lang.Object obj26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(obj26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration27);
        boolean boolean29 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        org.joda.time.Interval interval32 = interval31.toInterval();
        org.joda.time.DateTime dateTime33 = interval32.getEnd();
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        java.lang.Object obj37 = null;
        org.joda.time.Duration duration38 = new org.joda.time.Duration(obj37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration38);
        boolean boolean40 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Interval interval42 = duration38.toIntervalTo(readableInstant41);
        org.joda.time.Interval interval43 = interval42.toInterval();
        org.joda.time.DateTime dateTime44 = interval43.getEnd();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant48 = null;
        java.lang.Object obj49 = null;
        org.joda.time.Duration duration50 = new org.joda.time.Duration(obj49);
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant48, (org.joda.time.ReadableDuration) duration50);
        boolean boolean52 = duration47.isShorterThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInterval readableInterval54 = null;
        org.joda.time.Minutes minutes55 = org.joda.time.Minutes.minutesIn(readableInterval54);
        java.lang.String str56 = minutes55.toString();
        org.joda.time.PeriodType periodType57 = minutes55.getPeriodType();
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration50, readableInstant53, periodType57);
        org.joda.time.PeriodType periodType59 = periodType57.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, (org.joda.time.ReadableInstant) dateTime44, periodType59);
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant63 = null;
        java.lang.Object obj64 = null;
        org.joda.time.Duration duration65 = new org.joda.time.Duration(obj64);
        org.joda.time.Period period66 = new org.joda.time.Period(readableInstant63, (org.joda.time.ReadableDuration) duration65);
        boolean boolean67 = duration62.isShorterThan((org.joda.time.ReadableDuration) duration65);
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((java.lang.Object) duration62, periodType68, chronology69);
        org.joda.time.Duration duration72 = org.joda.time.Duration.millis((long) '4');
        long long73 = duration72.getStandardDays();
        boolean boolean74 = duration62.isLongerThan((org.joda.time.ReadableDuration) duration72);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableDuration) duration72);
        org.joda.time.Interval interval76 = duration15.toIntervalTo((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Chronology chronology77 = dateTime44.getChronology();
        org.joda.time.Period period78 = new org.joda.time.Period((long) (short) 100, chronology77);
        org.joda.time.Period period80 = period78.withYears((int) (byte) -1);
        org.joda.time.Period period82 = period80.withMillis((-8380800));
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT0M" + "'", str11, "PT0M");
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PT0M" + "'", str56, "PT0M");
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
    }

    @Test
    public void test15550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15550");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) 'a');
        org.joda.time.PeriodType periodType2 = hours1.getPeriodType();
        org.joda.time.Hours hours4 = hours1.dividedBy(90);
        org.joda.time.Hours hours5 = hours1.negated();
        org.joda.time.PeriodType periodType6 = hours1.getPeriodType();
        org.joda.time.Hours hours8 = hours1.multipliedBy(231);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(hours8);
    }

    @Test
    public void test15551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15551");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (byte) -1);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant7 = null;
        java.lang.Object obj8 = null;
        org.joda.time.Duration duration9 = new org.joda.time.Duration(obj8);
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration9);
        boolean boolean11 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Interval interval13 = duration9.toIntervalTo(readableInstant12);
        org.joda.time.Interval interval14 = interval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((-1L), chronology15);
        mutablePeriod2.add(1644572099705L, chronology15);
        org.joda.time.Hours hours18 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours19 = org.joda.time.Hours.ZERO;
        org.joda.time.Hours hours20 = hours18.minus(hours19);
        org.joda.time.DurationFieldType durationFieldType21 = hours19.getFieldType();
        int int22 = mutablePeriod2.indexOf(durationFieldType21);
        mutablePeriod2.addYears((int) ' ');
        mutablePeriod2.setWeeks((int) (byte) 1);
        mutablePeriod2.addHours((-9550));
        mutablePeriod2.addDays((-520));
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test15552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15552");
        org.joda.time.Days days8 = org.joda.time.Days.FOUR;
        org.joda.time.Period period9 = days8.toPeriod();
        org.joda.time.PeriodType periodType10 = period9.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period(100, 8, (-1), 1, 10, 9, 10, (-963), periodType10);
        org.joda.time.Period period13 = period11.multipliedBy(0);
        int int14 = period13.getDays();
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test15553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15553");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '4');
        org.joda.time.Minutes minutes7 = period4.toStandardMinutes();
        org.joda.time.Period period9 = period4.multipliedBy((int) (byte) 100);
        org.joda.time.Period period11 = period9.multipliedBy(0);
        org.joda.time.Period period13 = period11.withHours((-963));
        org.joda.time.Period period15 = period11.withHours((-9551));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType17 = period15.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test15554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15554");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration13.toIntervalTo(readableInstant16);
        org.joda.time.Interval interval18 = interval17.toInterval();
        org.joda.time.Hours hours19 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Hours hours20 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval18);
        boolean boolean21 = interval8.overlaps((org.joda.time.ReadableInterval) interval18);
        org.joda.time.DateTime dateTime22 = interval8.getStart();
        org.joda.time.Hours hours23 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Hours hours25 = org.joda.time.Hours.hoursIn(readableInterval24);
        org.joda.time.Hours hours27 = hours25.minus((int) (byte) 100);
        org.joda.time.Duration duration30 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = duration30.toPeriodFrom(readableInstant31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = duration30.toPeriod(chronology33);
        org.joda.time.Period period36 = period34.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.Hours hours38 = org.joda.time.Hours.hoursIn(readableInterval37);
        org.joda.time.Period period39 = period36.minus((org.joda.time.ReadablePeriod) hours38);
        org.joda.time.Hours hours41 = hours38.minus((int) '4');
        org.joda.time.Hours hours43 = hours41.plus((int) '#');
        org.joda.time.Hours hours44 = hours27.minus(hours41);
        org.joda.time.Hours hours45 = hours41.negated();
        org.joda.time.PeriodType periodType46 = hours45.getPeriodType();
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant49 = null;
        java.lang.Object obj50 = null;
        org.joda.time.Duration duration51 = new org.joda.time.Duration(obj50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, (org.joda.time.ReadableDuration) duration51);
        boolean boolean53 = duration48.isShorterThan((org.joda.time.ReadableDuration) duration51);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Interval interval55 = duration51.toIntervalTo(readableInstant54);
        org.joda.time.Interval interval56 = interval55.toInterval();
        org.joda.time.Hours hours57 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval56);
        org.joda.time.Hours hours58 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval56);
        org.joda.time.Hours hours60 = hours58.minus(8);
        org.joda.time.Hours hours62 = hours60.plus(0);
        org.joda.time.DurationFieldType durationFieldType63 = hours62.getFieldType();
        org.joda.time.Hours hours65 = hours62.multipliedBy((int) (byte) 100);
        org.joda.time.Hours hours66 = org.joda.time.Hours.ONE;
        org.joda.time.Duration duration67 = hours66.toStandardDuration();
        org.joda.time.Hours hours68 = hours65.plus(hours66);
        boolean boolean69 = hours45.isGreaterThan(hours65);
        org.joda.time.PeriodType periodType70 = hours65.getPeriodType();
        java.lang.String str71 = periodType70.getName();
        boolean boolean72 = interval8.equals((java.lang.Object) str71);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(hours38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(hours41);
        org.junit.Assert.assertNotNull(hours43);
        org.junit.Assert.assertNotNull(hours44);
        org.junit.Assert.assertNotNull(hours45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(hours57);
        org.junit.Assert.assertNotNull(hours58);
        org.junit.Assert.assertNotNull(hours60);
        org.junit.Assert.assertNotNull(hours62);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertNotNull(hours65);
        org.junit.Assert.assertNotNull(hours66);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(hours68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Hours" + "'", str71, "Hours");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test15555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15555");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration13.toIntervalTo(readableInstant16);
        org.joda.time.Interval interval18 = interval17.toInterval();
        org.joda.time.Hours hours19 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Hours hours20 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval18);
        boolean boolean21 = interval8.overlaps((org.joda.time.ReadableInterval) interval18);
        org.joda.time.MutableInterval mutableInterval22 = interval8.toMutableInterval();
        org.joda.time.DateTime dateTime23 = interval8.getStart();
        org.joda.time.Instant instant24 = dateTime23.toInstant();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(mutableInterval22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(instant24);
    }

    @Test
    public void test15556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15556");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(35791394L);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(obj5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6);
        boolean boolean8 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Interval interval10 = duration6.toIntervalTo(readableInstant9);
        org.joda.time.Interval interval11 = interval10.toInterval();
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        java.lang.Object obj16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(obj16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration17);
        boolean boolean19 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Interval interval21 = duration17.toIntervalTo(readableInstant20);
        org.joda.time.Interval interval22 = interval21.toInterval();
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        java.lang.Object obj26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(obj26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration27);
        boolean boolean29 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        boolean boolean32 = interval22.isAfter((org.joda.time.ReadableInterval) interval31);
        boolean boolean33 = interval11.contains((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Weeks weeks34 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Weeks weeks35 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval11);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType37 = periodType36.withSecondsRemoved();
        org.joda.time.PeriodType periodType38 = periodType37.withMillisRemoved();
        org.joda.time.PeriodType periodType39 = periodType38.withMinutesRemoved();
        org.joda.time.PeriodType periodType40 = periodType39.withWeeksRemoved();
        org.joda.time.PeriodType periodType41 = periodType39.withWeeksRemoved();
        org.joda.time.PeriodType periodType42 = periodType39.withHoursRemoved();
        java.lang.String str43 = periodType39.toString();
        org.joda.time.Period period44 = interval11.toPeriod(periodType39);
        org.joda.time.Period period45 = duration1.toPeriod(periodType39);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval31);
// flaky:         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PeriodType[MillisNoMillis]" + "'", str43, "PeriodType[MillisNoMillis]");
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period45);
    }

    @Test
    public void test15557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15557");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        java.lang.String str7 = period6.toString();
        org.joda.time.MutablePeriod mutablePeriod8 = period6.toMutablePeriod();
        java.lang.Object obj9 = mutablePeriod8.clone();
        int int10 = mutablePeriod8.getHours();
        org.joda.time.PeriodType periodType11 = mutablePeriod8.getPeriodType();
        org.joda.time.Duration duration13 = org.joda.time.Duration.millis((long) '4');
        long long14 = duration13.getMillis();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType17);
        mutablePeriod18.setYears(0);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod18.setPeriod((org.joda.time.ReadableDuration) duration22, chronology23);
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant27 = null;
        java.lang.Object obj28 = null;
        org.joda.time.Duration duration29 = new org.joda.time.Duration(obj28);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant27, (org.joda.time.ReadableDuration) duration29);
        boolean boolean31 = duration26.isShorterThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Interval interval33 = duration29.toIntervalTo(readableInstant32);
        org.joda.time.Interval interval34 = interval33.toInterval();
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant38 = null;
        java.lang.Object obj39 = null;
        org.joda.time.Duration duration40 = new org.joda.time.Duration(obj39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, (org.joda.time.ReadableDuration) duration40);
        boolean boolean42 = duration37.isShorterThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Interval interval44 = duration40.toIntervalTo(readableInstant43);
        org.joda.time.Interval interval45 = interval44.toInterval();
        org.joda.time.DateTime dateTime46 = interval45.getEnd();
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, (org.joda.time.ReadableInstant) dateTime35);
        java.lang.String str49 = dateTime35.toString();
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, (org.joda.time.ReadableInstant) dateTime35);
        boolean boolean51 = mutablePeriod8.equals((java.lang.Object) duration13);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = duration13.toPeriodFrom(readableInstant52);
        org.joda.time.Duration duration55 = duration13.plus(1644572337146L);
        long long56 = duration13.getStandardMinutes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.097S" + "'", str7, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "PT0.097S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "PT0.097S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "PT0.097S");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTime46);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2022-02-11T09:44:29.524Z" + "'", str49, "2022-02-11T09:44:29.524Z");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
    }

    @Test
    public void test15558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15558");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(1644572087663L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration4, readableInstant6);
        org.joda.time.Duration duration9 = org.joda.time.Duration.millis((long) '4');
        long long10 = duration9.getStandardDays();
        boolean boolean11 = duration4.isLongerThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType13 = periodType12.withHoursRemoved();
        org.joda.time.Period period14 = duration9.toPeriod(periodType12);
        org.joda.time.Period period15 = duration1.toPeriod(periodType12);
        long long16 = duration1.getStandardSeconds();
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        java.lang.Object obj20 = null;
        org.joda.time.Duration duration21 = new org.joda.time.Duration(obj20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration21);
        boolean boolean23 = duration18.isShorterThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Interval interval25 = duration21.toIntervalTo(readableInstant24);
        org.joda.time.Interval interval26 = interval25.toInterval();
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant29 = null;
        java.lang.Object obj30 = null;
        org.joda.time.Duration duration31 = new org.joda.time.Duration(obj30);
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, (org.joda.time.ReadableDuration) duration31);
        boolean boolean33 = duration28.isShorterThan((org.joda.time.ReadableDuration) duration31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Interval interval35 = duration31.toIntervalTo(readableInstant34);
        boolean boolean36 = interval26.isAfter((org.joda.time.ReadableInterval) interval35);
        org.joda.time.DateTime dateTime37 = interval26.getStart();
        org.joda.time.ReadableInstant readableInstant38 = null;
        boolean boolean39 = interval26.isAfter(readableInstant38);
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval26);
        org.joda.time.DateTime dateTime41 = interval26.getStart();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime41);
        long long43 = duration1.getStandardMinutes();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1644572087663L + "'", long16 == 1644572087663L);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 27409534794L + "'", long43 == 27409534794L);
    }

    @Test
    public void test15559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15559");
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.standard();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant7 = null;
        java.lang.Object obj8 = null;
        org.joda.time.Duration duration9 = new org.joda.time.Duration(obj8);
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration9);
        boolean boolean11 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Interval interval13 = duration9.toIntervalTo(readableInstant12);
        org.joda.time.Interval interval14 = interval13.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (byte) -1, 52L, periodType4, chronology15);
        mutablePeriod16.addSeconds(32);
        mutablePeriod16.add(10, 0, (int) (byte) -1, (int) (short) 0, (int) (byte) 10, (int) 'a', (int) '#', 10);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType31 = periodType30.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(periodType31);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(10L, periodType31);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(10L, periodType31);
        int int35 = mutablePeriod34.getMonths();
        int int36 = mutablePeriod34.getHours();
        java.lang.Object obj37 = mutablePeriod34.clone();
        mutablePeriod16.add((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.MutablePeriod mutablePeriod39 = mutablePeriod34.copy();
        org.joda.time.Duration duration42 = new org.joda.time.Duration(1644572258401L);
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant45 = null;
        java.lang.Object obj46 = null;
        org.joda.time.Duration duration47 = new org.joda.time.Duration(obj46);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, (org.joda.time.ReadableDuration) duration47);
        boolean boolean49 = duration44.isShorterThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Interval interval51 = duration47.toIntervalTo(readableInstant50);
        org.joda.time.Interval interval52 = interval51.toInterval();
        org.joda.time.DateTime dateTime53 = interval52.getEnd();
        org.joda.time.Duration duration55 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant56 = null;
        java.lang.Object obj57 = null;
        org.joda.time.Duration duration58 = new org.joda.time.Duration(obj57);
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant56, (org.joda.time.ReadableDuration) duration58);
        boolean boolean60 = duration55.isShorterThan((org.joda.time.ReadableDuration) duration58);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Interval interval62 = duration58.toIntervalTo(readableInstant61);
        org.joda.time.Interval interval63 = interval62.toInterval();
        org.joda.time.DateTime dateTime64 = interval63.getEnd();
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime53, (org.joda.time.ReadableInstant) dateTime64);
        long long66 = dateTime64.getMillis();
        org.joda.time.Chronology chronology67 = dateTime64.getChronology();
        org.joda.time.Period period68 = duration42.toPeriod(chronology67);
        mutablePeriod39.setPeriod(10L, chronology67);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(1644572405277L, 1644572076884L, chronology67);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "P");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "P");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "P");
        org.junit.Assert.assertNotNull(mutablePeriod39);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(dateTime64);
// flaky:         org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1644572669578L + "'", long66 == 1644572669578L);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(period68);
    }

    @Test
    public void test15560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15560");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.Days days3 = days2.negated();
        boolean boolean4 = days1.isGreaterThan(days3);
        org.joda.time.Days days6 = days3.plus((int) (short) 10);
        org.joda.time.Days days7 = org.joda.time.Days.ONE;
        org.joda.time.Days days8 = days7.negated();
        org.joda.time.Days days9 = org.joda.time.Days.ONE;
        org.joda.time.Days days10 = days9.negated();
        org.joda.time.Days days11 = org.joda.time.Days.ONE;
        org.joda.time.Days days12 = days11.negated();
        boolean boolean13 = days10.isGreaterThan(days12);
        org.joda.time.Days days14 = days7.plus(days12);
        org.joda.time.Days days15 = days6.plus(days7);
        org.joda.time.Days days17 = days7.minus(3);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration25 = duration22.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration27 = duration19.withDurationAdded((org.joda.time.ReadableDuration) duration22, (int) (short) 1);
        org.joda.time.Days days28 = duration27.toStandardDays();
        org.joda.time.Duration duration30 = duration27.withMillis(1644572226060L);
        org.joda.time.Days days31 = duration27.toStandardDays();
        boolean boolean32 = days17.isLessThan(days31);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test15561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15561");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 0);
        java.lang.String str2 = period1.toString();
        int int3 = period1.getMillis();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        java.lang.Object obj7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(obj7);
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration8);
        boolean boolean10 = duration5.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Interval interval12 = duration8.toIntervalTo(readableInstant11);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        java.lang.Object obj16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(obj16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration17);
        boolean boolean19 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Interval interval21 = duration17.toIntervalTo(readableInstant20);
        org.joda.time.Interval interval22 = interval21.toInterval();
        org.joda.time.Hours hours23 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Hours hours24 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval22);
        boolean boolean25 = interval12.overlaps((org.joda.time.ReadableInterval) interval22);
        org.joda.time.DateTime dateTime26 = interval12.getStart();
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant29 = null;
        java.lang.Object obj30 = null;
        org.joda.time.Duration duration31 = new org.joda.time.Duration(obj30);
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, (org.joda.time.ReadableDuration) duration31);
        boolean boolean33 = duration28.isShorterThan((org.joda.time.ReadableDuration) duration31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Interval interval35 = duration31.toIntervalTo(readableInstant34);
        org.joda.time.Interval interval36 = interval35.toInterval();
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant39 = null;
        java.lang.Object obj40 = null;
        org.joda.time.Duration duration41 = new org.joda.time.Duration(obj40);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, (org.joda.time.ReadableDuration) duration41);
        boolean boolean43 = duration38.isShorterThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Interval interval45 = duration41.toIntervalTo(readableInstant44);
        boolean boolean46 = interval36.isAfter((org.joda.time.ReadableInterval) interval45);
        org.joda.time.DateTime dateTime47 = interval36.getStart();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Duration duration49 = period1.toDurationFrom((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Period period51 = period1.withMillis((int) '#');
        org.joda.time.Period period53 = period1.multipliedBy(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
    }

    @Test
    public void test15562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15562");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = seconds2.getPeriodType();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test15563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15563");
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        java.lang.Object obj6 = null;
        org.joda.time.Duration duration7 = new org.joda.time.Duration(obj6);
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration7);
        boolean boolean9 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Interval interval11 = duration7.toIntervalTo(readableInstant10);
        long long12 = interval11.getStartMillis();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        java.lang.Object obj16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(obj16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration17);
        boolean boolean19 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Interval interval21 = duration17.toIntervalTo(readableInstant20);
        org.joda.time.Interval interval22 = interval21.toInterval();
        org.joda.time.Hours hours23 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Hours hours24 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval22);
        boolean boolean25 = interval11.isBefore((org.joda.time.ReadableInterval) interval22);
        org.joda.time.DateTime dateTime26 = interval22.getStart();
        org.joda.time.Chronology chronology27 = interval22.getChronology();
        org.joda.time.Period period28 = new org.joda.time.Period(1644572467355L, chronology27);
        org.joda.time.Period period29 = new org.joda.time.Period(1644572091081L, 1644572490635L, chronology27);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1644572669670L + "'", long12 == 1644572669670L);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test15564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15564");
        java.lang.Object obj0 = null;
        org.joda.time.Duration duration1 = new org.joda.time.Duration(obj0);
        org.joda.time.Hours hours2 = duration1.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType3 = hours2.getFieldType();
        org.joda.time.Hours hours4 = hours2.negated();
        org.joda.time.PeriodType periodType5 = hours2.getPeriodType();
        org.joda.time.Hours hours7 = hours2.plus(32);
        org.joda.time.PeriodType periodType8 = hours2.getPeriodType();
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test15565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15565");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '4');
        org.joda.time.Period period8 = period4.minusSeconds(10);
        org.joda.time.Period period10 = period4.plusDays(0);
        org.joda.time.Period period12 = period4.minusHours(727);
        org.joda.time.Period period14 = period12.plusSeconds((-22));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test15566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15566");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        org.joda.time.Period period8 = period6.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn(readableInterval9);
        org.joda.time.Period period11 = period8.minus((org.joda.time.ReadablePeriod) hours10);
        org.joda.time.Hours hours13 = hours10.minus((int) '4');
        org.joda.time.Hours hours14 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours15 = org.joda.time.Hours.ZERO;
        org.joda.time.Hours hours16 = hours14.minus(hours15);
        org.joda.time.Hours hours17 = hours10.minus(hours16);
        int int18 = hours16.getHours();
        org.joda.time.PeriodType periodType19 = hours16.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType20 = hours16.getFieldType();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        java.lang.Object obj24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(obj24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration25);
        boolean boolean27 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Interval interval29 = duration25.toIntervalTo(readableInstant28);
        org.joda.time.Interval interval30 = interval29.toInterval();
        org.joda.time.Hours hours31 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval30);
        org.joda.time.Hours hours32 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval30);
        org.joda.time.DurationFieldType durationFieldType33 = hours32.getFieldType();
        org.joda.time.Hours hours35 = hours32.minus(1);
        org.joda.time.Duration duration38 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = duration38.toPeriodFrom(readableInstant39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = duration38.toPeriod(chronology41);
        org.joda.time.Period period44 = period42.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.Hours hours46 = org.joda.time.Hours.hoursIn(readableInterval45);
        org.joda.time.Period period47 = period44.minus((org.joda.time.ReadablePeriod) hours46);
        org.joda.time.Hours hours48 = hours46.negated();
        org.joda.time.Hours hours49 = hours35.plus(hours48);
        org.joda.time.Hours hours50 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours51 = org.joda.time.Hours.ZERO;
        org.joda.time.Hours hours52 = hours50.minus(hours51);
        org.joda.time.DurationFieldType durationFieldType53 = hours51.getFieldType();
        boolean boolean54 = hours49.isLessThan(hours51);
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.Hours hours56 = org.joda.time.Hours.hoursIn(readableInterval55);
        org.joda.time.Hours hours58 = hours56.minus((int) (byte) 100);
        org.joda.time.Duration duration60 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant61 = null;
        java.lang.Object obj62 = null;
        org.joda.time.Duration duration63 = new org.joda.time.Duration(obj62);
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, (org.joda.time.ReadableDuration) duration63);
        boolean boolean65 = duration60.isShorterThan((org.joda.time.ReadableDuration) duration63);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Interval interval67 = duration63.toIntervalTo(readableInstant66);
        org.joda.time.Interval interval68 = interval67.toInterval();
        org.joda.time.Hours hours69 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval68);
        org.joda.time.Hours hours71 = hours69.dividedBy(1);
        org.joda.time.Hours hours73 = hours69.minus((int) (short) 1);
        boolean boolean74 = hours56.isGreaterThan(hours73);
        org.joda.time.Hours hours76 = hours56.plus(32);
        org.joda.time.Hours hours77 = hours51.plus(hours56);
        org.joda.time.Hours hours79 = hours51.multipliedBy(369700);
        org.joda.time.Hours hours80 = hours16.plus(hours51);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(hours31);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(hours46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(hours48);
        org.junit.Assert.assertNotNull(hours49);
        org.junit.Assert.assertNotNull(hours50);
        org.junit.Assert.assertNotNull(hours51);
        org.junit.Assert.assertNotNull(hours52);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(hours56);
        org.junit.Assert.assertNotNull(hours58);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(hours69);
        org.junit.Assert.assertNotNull(hours71);
        org.junit.Assert.assertNotNull(hours73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(hours76);
        org.junit.Assert.assertNotNull(hours77);
        org.junit.Assert.assertNotNull(hours79);
        org.junit.Assert.assertNotNull(hours80);
    }

    @Test
    public void test15567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15567");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        long long10 = interval9.getEndMillis();
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval9);
        long long12 = interval9.getStartMillis();
        boolean boolean14 = interval9.equals((java.lang.Object) 1644572199035L);
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval9);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1644572669762L + "'", long10 == 1644572669762L);
        org.junit.Assert.assertNotNull(minutes11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1644572669762L + "'", long12 == 1644572669762L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(minutes15);
    }

    @Test
    public void test15568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15568");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration3 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration5 = duration3.plus(1644572076849L);
        long long6 = duration3.getMillis();
        long long7 = duration3.getStandardHours();
        boolean boolean8 = duration1.isEqual((org.joda.time.ReadableDuration) duration3);
        org.joda.time.ReadableInstant readableInstant9 = null;
        java.lang.Object obj10 = null;
        org.joda.time.Duration duration11 = new org.joda.time.Duration(obj10);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, (org.joda.time.ReadableDuration) duration11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration11, readableInstant13);
        org.joda.time.Duration duration16 = org.joda.time.Duration.millis((long) '4');
        long long17 = duration16.getStandardDays();
        boolean boolean18 = duration11.isLongerThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Duration duration19 = duration3.minus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Duration duration20 = duration3.toDuration();
        org.joda.time.Duration duration23 = duration3.withDurationAdded(1644572149539L, 2719);
        org.joda.time.Days days24 = duration3.toStandardDays();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(days24);
    }

    @Test
    public void test15569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15569");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        int int1 = hours0.getHours();
        org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        java.lang.Object obj6 = null;
        org.joda.time.Duration duration7 = new org.joda.time.Duration(obj6);
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration7);
        boolean boolean9 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Interval interval11 = duration7.toIntervalTo(readableInstant10);
        org.joda.time.Interval interval12 = interval11.toInterval();
        org.joda.time.Hours hours13 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval12);
        org.joda.time.Hours hours15 = hours13.dividedBy(1);
        org.joda.time.Hours hours17 = hours13.minus((int) (short) 1);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        java.lang.Object obj21 = null;
        org.joda.time.Duration duration22 = new org.joda.time.Duration(obj21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration22);
        boolean boolean24 = duration19.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Interval interval26 = duration22.toIntervalTo(readableInstant25);
        org.joda.time.Interval interval27 = interval26.toInterval();
        org.joda.time.Hours hours28 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval27);
        org.joda.time.Hours hours30 = hours28.dividedBy(1);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.seconds();
        int int32 = hours30.get(durationFieldType31);
        int int33 = hours17.get(durationFieldType31);
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        java.lang.Object obj37 = null;
        org.joda.time.Duration duration38 = new org.joda.time.Duration(obj37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration38);
        boolean boolean40 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Interval interval42 = duration38.toIntervalTo(readableInstant41);
        org.joda.time.Interval interval43 = interval42.toInterval();
        org.joda.time.Hours hours44 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval43);
        org.joda.time.Hours hours45 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval43);
        org.joda.time.DurationFieldType durationFieldType46 = hours45.getFieldType();
        org.joda.time.Hours hours48 = hours45.minus(1);
        org.joda.time.Duration duration51 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = duration51.toPeriodFrom(readableInstant52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Period period55 = duration51.toPeriod(chronology54);
        org.joda.time.Period period57 = period55.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval58 = null;
        org.joda.time.Hours hours59 = org.joda.time.Hours.hoursIn(readableInterval58);
        org.joda.time.Period period60 = period57.minus((org.joda.time.ReadablePeriod) hours59);
        org.joda.time.Hours hours61 = hours59.negated();
        org.joda.time.Hours hours62 = hours48.plus(hours61);
        org.joda.time.Duration duration64 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant65 = null;
        java.lang.Object obj66 = null;
        org.joda.time.Duration duration67 = new org.joda.time.Duration(obj66);
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant65, (org.joda.time.ReadableDuration) duration67);
        boolean boolean69 = duration64.isShorterThan((org.joda.time.ReadableDuration) duration67);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Interval interval71 = duration67.toIntervalTo(readableInstant70);
        org.joda.time.Interval interval72 = interval71.toInterval();
        org.joda.time.Hours hours73 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval72);
        org.joda.time.MutablePeriod mutablePeriod74 = hours73.toMutablePeriod();
        int int75 = hours73.getHours();
        org.joda.time.Hours hours76 = hours48.minus(hours73);
        boolean boolean77 = hours17.isLessThan(hours73);
        org.joda.time.ReadableInterval readableInterval78 = null;
        org.joda.time.Hours hours79 = org.joda.time.Hours.hoursIn(readableInterval78);
        org.joda.time.Hours hours81 = hours79.dividedBy(1);
        org.joda.time.Hours hours83 = hours81.multipliedBy((int) (short) -1);
        org.joda.time.Hours hours84 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours86 = hours84.dividedBy(32);
        java.lang.String str87 = hours86.toString();
        org.joda.time.Hours hours88 = hours81.minus(hours86);
        org.joda.time.Hours hours89 = hours17.plus(hours86);
        org.joda.time.Hours hours90 = hours0.minus(hours89);
        org.joda.time.PeriodType periodType91 = hours90.getPeriodType();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(hours44);
        org.junit.Assert.assertNotNull(hours45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(hours48);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(hours59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(hours61);
        org.junit.Assert.assertNotNull(hours62);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(hours73);
        org.junit.Assert.assertNotNull(mutablePeriod74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(hours76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(hours79);
        org.junit.Assert.assertNotNull(hours81);
        org.junit.Assert.assertNotNull(hours83);
        org.junit.Assert.assertNotNull(hours84);
        org.junit.Assert.assertNotNull(hours86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "PT0H" + "'", str87, "PT0H");
        org.junit.Assert.assertNotNull(hours88);
        org.junit.Assert.assertNotNull(hours89);
        org.junit.Assert.assertNotNull(hours90);
        org.junit.Assert.assertNotNull(periodType91);
    }

    @Test
    public void test15570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15570");
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1);
        mutablePeriod3.addWeeks((int) (byte) 100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray6 = mutablePeriod3.getFieldTypes();
        mutablePeriod3.addMillis((int) 'a');
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod();
        mutablePeriod10.setPeriod(100L, (long) (-1));
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        java.lang.Object obj21 = null;
        org.joda.time.Duration duration22 = new org.joda.time.Duration(obj21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration22);
        boolean boolean24 = duration19.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Interval interval26 = duration22.toIntervalTo(readableInstant25);
        org.joda.time.Interval interval27 = interval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((-1L), chronology28);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(0L, (long) (short) -1, chronology28);
        mutablePeriod10.setPeriod((long) 100, chronology28);
        mutablePeriod3.setPeriod(1644572118718L, chronology28);
        org.joda.time.Period period33 = new org.joda.time.Period(1644572105679L, chronology28);
        org.joda.time.Weeks weeks35 = org.joda.time.Weeks.weeks((-2));
        org.joda.time.DurationFieldType durationFieldType36 = weeks35.getFieldType();
        int int37 = period33.get(durationFieldType36);
        org.joda.time.Period period42 = new org.joda.time.Period(0, 10, (int) (short) -1, (int) (byte) 1);
        org.joda.time.Period period44 = period42.withMillis((int) (short) 100);
        int int45 = period44.getDays();
        org.joda.time.Period period47 = period44.plusDays((int) (short) 100);
        org.joda.time.Period period49 = period47.withMillis((-963));
        org.joda.time.Weeks weeks50 = org.joda.time.Weeks.TWO;
        org.joda.time.DurationFieldType durationFieldType51 = weeks50.getFieldType();
        org.joda.time.Weeks weeks52 = weeks50.negated();
        org.joda.time.DurationFieldType durationFieldType53 = weeks50.getFieldType();
        org.joda.time.Period period55 = period47.withField(durationFieldType53, 53);
        org.joda.time.Period period57 = period33.withFieldAdded(durationFieldType53, 456825);
        int int58 = period33.getSeconds();
        org.junit.Assert.assertNotNull(durationFieldTypeArray6);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2719 + "'", int37 == 2719);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(weeks50);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertNotNull(weeks52);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
    }

    @Test
    public void test15571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15571");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(1644572431607L, periodType1);
    }

    @Test
    public void test15572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15572");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(1644572518699L, 1644572480062L);
    }

    @Test
    public void test15573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15573");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        java.lang.String str7 = period6.toString();
        org.joda.time.MutablePeriod mutablePeriod8 = period6.toMutablePeriod();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration13.toIntervalTo(readableInstant16);
        long long18 = interval17.getStartMillis();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Interval interval20 = interval17.toInterval();
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval20);
        long long22 = interval20.toDurationMillis();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType25);
        mutablePeriod26.setYears(0);
        mutablePeriod26.setPeriod((long) 100, 100L);
        mutablePeriod26.setPeriod((long) (-97));
        org.joda.time.DurationFieldType[] durationFieldTypeArray34 = mutablePeriod26.getFieldTypes();
        mutablePeriod26.setWeeks((int) (byte) 10);
        int int37 = mutablePeriod26.getMinutes();
        mutablePeriod26.add((int) (short) 100, (-1), 3, 36, 0, (int) '4', (int) (byte) 10, 56);
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant49 = null;
        java.lang.Object obj50 = null;
        org.joda.time.Duration duration51 = new org.joda.time.Duration(obj50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, (org.joda.time.ReadableDuration) duration51);
        boolean boolean53 = duration48.isShorterThan((org.joda.time.ReadableDuration) duration51);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Interval interval55 = duration51.toIntervalTo(readableInstant54);
        org.joda.time.Interval interval56 = interval55.toInterval();
        org.joda.time.Duration duration58 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant59 = null;
        java.lang.Object obj60 = null;
        org.joda.time.Duration duration61 = new org.joda.time.Duration(obj60);
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant59, (org.joda.time.ReadableDuration) duration61);
        boolean boolean63 = duration58.isShorterThan((org.joda.time.ReadableDuration) duration61);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Interval interval65 = duration61.toIntervalTo(readableInstant64);
        boolean boolean66 = interval56.isAfter((org.joda.time.ReadableInterval) interval65);
        org.joda.time.DateTime dateTime67 = interval56.getStart();
        org.joda.time.Duration duration68 = interval56.toDuration();
        mutablePeriod26.add((org.joda.time.ReadableInterval) interval56);
        org.joda.time.Interval interval70 = interval56.toInterval();
        org.joda.time.Seconds seconds71 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval70);
        org.joda.time.DateTime dateTime72 = interval70.getStart();
        org.joda.time.Chronology chronology73 = dateTime72.getChronology();
        boolean boolean74 = interval20.isBefore((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTime dateTime75 = interval20.getStart();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.097S" + "'", str7, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644572669888L + "'", long18 == 1644572669888L);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(durationFieldTypeArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(seconds71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(dateTime75);
    }

    @Test
    public void test15574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15574");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(obj5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6);
        boolean boolean8 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration13.toIntervalTo(readableInstant16);
        org.joda.time.Interval interval18 = interval17.toInterval();
        org.joda.time.DateTime dateTime19 = interval18.getEnd();
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        java.lang.Object obj23 = null;
        org.joda.time.Duration duration24 = new org.joda.time.Duration(obj23);
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant22, (org.joda.time.ReadableDuration) duration24);
        boolean boolean26 = duration21.isShorterThan((org.joda.time.ReadableDuration) duration24);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Interval interval28 = duration24.toIntervalTo(readableInstant27);
        org.joda.time.Interval interval29 = interval28.toInterval();
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant34 = null;
        java.lang.Object obj35 = null;
        org.joda.time.Duration duration36 = new org.joda.time.Duration(obj35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration36);
        boolean boolean38 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration36);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.Minutes minutes41 = org.joda.time.Minutes.minutesIn(readableInterval40);
        java.lang.String str42 = minutes41.toString();
        org.joda.time.PeriodType periodType43 = minutes41.getPeriodType();
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration36, readableInstant39, periodType43);
        org.joda.time.PeriodType periodType45 = periodType43.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateTime30, periodType45);
        org.joda.time.PeriodType periodType47 = periodType45.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 30, 1644572122681L, periodType45);
        org.joda.time.PeriodType periodType49 = periodType45.withMillisRemoved();
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT0M" + "'", str42, "PT0M");
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType49);
    }

    @Test
    public void test15575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15575");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(2);
        int int2 = seconds1.getSeconds();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test15576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15576");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(1644572151412L);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Duration duration4 = weeks3.toStandardDuration();
        long long5 = duration4.getStandardMinutes();
        org.joda.time.Duration duration7 = duration4.plus(100L);
        org.joda.time.Duration duration9 = duration4.plus(1644572089958L);
        org.joda.time.Duration duration11 = duration9.plus(1644572187226L);
        org.joda.time.Duration duration14 = duration11.withDurationAdded(1644572162974L, 218);
        boolean boolean15 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-10080L) + "'", long5 == (-10080L));
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test15577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15577");
        org.joda.time.Period period1 = org.joda.time.Period.millis(97);
        org.joda.time.Duration duration2 = period1.toStandardDuration();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test15578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15578");
        org.joda.time.Period period8 = new org.joda.time.Period((-97), 1, (int) (byte) 0, (-1), (-9700), 97, (int) (short) 10, 52);
        org.joda.time.Period period10 = period8.withHours(5);
        org.joda.time.Period period12 = period8.plusMonths(592);
        org.joda.time.Period period14 = period12.plusMinutes((-840));
        org.joda.time.Period period16 = period14.withMonths(187);
        org.joda.time.Duration duration19 = new org.joda.time.Duration(1644572172378L, 1644572189539L);
        long long20 = duration19.getStandardMinutes();
        org.joda.time.Hours hours21 = duration19.toStandardHours();
        org.joda.time.Period period22 = period14.minus((org.joda.time.ReadablePeriod) hours21);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test15579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15579");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '4');
        org.joda.time.Minutes minutes7 = period4.toStandardMinutes();
        org.joda.time.Period period9 = period4.multipliedBy((int) (byte) 100);
        org.joda.time.Period period11 = period9.multipliedBy(0);
        org.joda.time.Period period13 = period11.withHours((-963));
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType15 = periodType14.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(periodType14);
        java.lang.String str17 = mutablePeriod16.toString();
        org.joda.time.PeriodType periodType18 = mutablePeriod16.getPeriodType();
        org.joda.time.Minutes minutes20 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType21 = minutes20.getFieldType();
        boolean boolean22 = mutablePeriod16.isSupported(durationFieldType21);
        org.joda.time.Period period24 = period11.withFieldAdded(durationFieldType21, 36000000);
        org.joda.time.Period period26 = period24.withSeconds((-97));
        org.joda.time.Period period28 = period24.minusMillis((int) (byte) 10);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0S" + "'", str17, "PT0S");
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test15580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15580");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("2022-02-11T09:39:27.895Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:39:27.895Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15581");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(1644572077926L);
        org.joda.time.Period period6 = new org.joda.time.Period(246, (int) (short) 1, (int) (byte) 0, 8);
        org.joda.time.Period period8 = new org.joda.time.Period(1L);
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Period period11 = period8.plus((org.joda.time.ReadablePeriod) weeks10);
        int int12 = period11.getMinutes();
        int int13 = period11.getYears();
        org.joda.time.Period period14 = period6.withFields((org.joda.time.ReadablePeriod) period11);
        boolean boolean15 = duration1.equals((java.lang.Object) period11);
        org.joda.time.Period period17 = period11.plusHours(903);
        org.joda.time.Period period19 = period17.plusMonths(134);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test15582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15582");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        long long9 = interval8.getStartMillis();
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.years();
        int int12 = minutes10.get(durationFieldType11);
        org.joda.time.Minutes minutes13 = minutes10.negated();
        org.joda.time.Minutes minutes15 = minutes10.multipliedBy((int) ' ');
        org.joda.time.PeriodType periodType16 = minutes10.getPeriodType();
        org.joda.time.Minutes minutes18 = minutes10.multipliedBy((-101));
        org.joda.time.Minutes minutes20 = minutes10.multipliedBy((-869));
        org.joda.time.DurationFieldType durationFieldType21 = minutes20.getFieldType();
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.ZERO;
        org.joda.time.DurationFieldType durationFieldType23 = minutes22.getFieldType();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        java.lang.Object obj27 = null;
        org.joda.time.Duration duration28 = new org.joda.time.Duration(obj27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration28);
        boolean boolean30 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Interval interval32 = duration28.toIntervalTo(readableInstant31);
        long long33 = interval32.getStartMillis();
        org.joda.time.Minutes minutes34 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval32);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.years();
        int int36 = minutes34.get(durationFieldType35);
        org.joda.time.Minutes minutes37 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes38 = minutes37.negated();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant41 = null;
        java.lang.Object obj42 = null;
        org.joda.time.Duration duration43 = new org.joda.time.Duration(obj42);
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, (org.joda.time.ReadableDuration) duration43);
        boolean boolean45 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Interval interval47 = duration43.toIntervalTo(readableInstant46);
        org.joda.time.Duration duration50 = new org.joda.time.Duration((long) 'a', (long) 0);
        boolean boolean51 = duration43.equals((java.lang.Object) 'a');
        org.joda.time.Minutes minutes52 = duration43.toStandardMinutes();
        org.joda.time.Minutes minutes53 = minutes52.negated();
        org.joda.time.Minutes minutes54 = minutes37.minus(minutes53);
        org.joda.time.Minutes minutes56 = minutes53.minus(35);
        org.joda.time.Minutes minutes57 = minutes34.plus(minutes56);
        boolean boolean58 = minutes22.isGreaterThan(minutes34);
        org.joda.time.Minutes minutes59 = minutes22.negated();
        org.joda.time.Minutes minutes60 = minutes20.plus(minutes22);
        org.joda.time.Minutes minutes61 = minutes20.negated();
        org.joda.time.Minutes minutes63 = minutes61.multipliedBy((-41));
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1644572670049L + "'", long9 == 1644572670049L);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1644572670049L + "'", long33 == 1644572670049L);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(minutes52);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertNotNull(minutes57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertNotNull(minutes60);
        org.junit.Assert.assertNotNull(minutes61);
        org.junit.Assert.assertNotNull(minutes63);
    }

    @Test
    public void test15583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15583");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '4');
        org.joda.time.Minutes minutes7 = period4.toStandardMinutes();
        org.joda.time.Period period9 = period4.multipliedBy((int) (byte) 100);
        org.joda.time.Period period11 = period9.withHours((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        org.joda.time.Period period14 = period9.withField(durationFieldType12, 0);
        org.joda.time.Period period16 = period14.withYears((int) (short) -1);
        org.joda.time.Period period18 = period16.minusHours((int) (byte) 0);
        org.joda.time.Period period20 = period18.plusHours((-1));
        org.joda.time.Period period22 = period18.minusMillis(443);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test15584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15584");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("2022-02-11T09:41:20.568Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:41:20.568Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15585");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1);
        org.joda.time.DurationFieldType durationFieldType4 = mutablePeriod2.getFieldType(1);
        org.joda.time.Hours hours5 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod2);
        mutablePeriod2.addMonths((-963));
        mutablePeriod2.setHours(52);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = mutablePeriod2.getValue(42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 42");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(hours5);
    }

    @Test
    public void test15586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15586");
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks5 = weeks3.plus((int) '4');
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeks((int) (byte) -1);
        boolean boolean9 = weeks6.isGreaterThan(weeks8);
        org.joda.time.DurationFieldType durationFieldType10 = weeks8.getFieldType();
        boolean boolean11 = weeks3.isGreaterThan(weeks8);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeks((int) (byte) -1);
        boolean boolean15 = weeks12.isGreaterThan(weeks14);
        java.lang.String str16 = weeks12.toString();
        org.joda.time.Weeks weeks17 = weeks3.plus(weeks12);
        org.joda.time.PeriodType periodType18 = weeks17.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(1644572131521L, 1644572184071L, periodType18);
        org.joda.time.Period period20 = new org.joda.time.Period(1644572080830L, periodType18);
        org.joda.time.Duration duration21 = period20.toStandardDuration();
        org.joda.time.Period period24 = new org.joda.time.Period(0L, (long) 100);
        org.joda.time.Weeks weeks25 = period24.toStandardWeeks();
        org.joda.time.Weeks weeks27 = weeks25.multipliedBy((int) (byte) 1);
        org.joda.time.Weeks weeks29 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks30 = weeks29.negated();
        int int31 = weeks29.getWeeks();
        org.joda.time.Weeks weeks33 = weeks29.minus(3);
        org.joda.time.Period period35 = new org.joda.time.Period((long) (byte) 1);
        boolean boolean36 = weeks29.equals((java.lang.Object) (byte) 1);
        org.joda.time.Weeks weeks38 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks39 = weeks38.negated();
        int int40 = weeks38.getWeeks();
        org.joda.time.Weeks weeks42 = weeks38.minus(3);
        boolean boolean43 = weeks29.isGreaterThan(weeks42);
        boolean boolean44 = weeks25.isGreaterThan(weeks42);
        org.joda.time.Duration duration46 = org.joda.time.Duration.millis((long) '4');
        long long47 = duration46.getMillis();
        org.joda.time.Period period48 = new org.joda.time.Period((java.lang.Object) duration46);
        org.joda.time.Duration duration49 = period48.toStandardDuration();
        boolean boolean50 = weeks42.equals((java.lang.Object) period48);
        java.lang.String str51 = weeks42.toString();
        boolean boolean52 = duration21.equals((java.lang.Object) str51);
        org.joda.time.Duration duration53 = duration21.toDuration();
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P-2147483648W" + "'", str16, "P-2147483648W");
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 52L + "'", long47 == 52L);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "P-4W" + "'", str51, "P-4W");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(duration53);
    }

    @Test
    public void test15587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15587");
        org.joda.time.Hours hours5 = org.joda.time.Hours.hours((int) (byte) 0);
        org.joda.time.Duration duration6 = hours5.toStandardDuration();
        org.joda.time.Hours hours8 = hours5.multipliedBy((int) ' ');
        org.joda.time.PeriodType periodType9 = hours8.getPeriodType();
        java.lang.String str10 = periodType9.toString();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1644572157654L, (-9699L), periodType9);
        org.joda.time.Period period12 = new org.joda.time.Period(1644572440941L, 1644572280262L, periodType9);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PeriodType[Hours]" + "'", str10, "PeriodType[Hours]");
    }

    @Test
    public void test15588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15588");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("2022-02-11T09:40:20.227Z/2022-02-11T09:40:20.227Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:40:20.227Z/2022-02-11T09:40:20.227Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15589");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType8);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType12);
        mutablePeriod13.setYears(0);
        mutablePeriod9.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.Period period17 = mutablePeriod13.toPeriod();
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        java.lang.Object obj21 = null;
        org.joda.time.Duration duration22 = new org.joda.time.Duration(obj21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration22);
        boolean boolean24 = duration19.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Interval interval26 = duration22.toIntervalTo(readableInstant25);
        org.joda.time.Interval interval27 = interval26.toInterval();
        org.joda.time.DateTime dateTime28 = interval27.getEnd();
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant31 = null;
        java.lang.Object obj32 = null;
        org.joda.time.Duration duration33 = new org.joda.time.Duration(obj32);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration33);
        boolean boolean35 = duration30.isShorterThan((org.joda.time.ReadableDuration) duration33);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Interval interval37 = duration33.toIntervalTo(readableInstant36);
        org.joda.time.Interval interval38 = interval37.toInterval();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant41 = null;
        java.lang.Object obj42 = null;
        org.joda.time.Duration duration43 = new org.joda.time.Duration(obj42);
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, (org.joda.time.ReadableDuration) duration43);
        boolean boolean45 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Interval interval47 = duration43.toIntervalTo(readableInstant46);
        boolean boolean48 = interval38.isAfter((org.joda.time.ReadableInterval) interval47);
        boolean boolean49 = interval27.contains((org.joda.time.ReadableInterval) interval38);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType52);
        mutablePeriod53.addMillis((-1));
        org.joda.time.Duration duration57 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant58 = null;
        java.lang.Object obj59 = null;
        org.joda.time.Duration duration60 = new org.joda.time.Duration(obj59);
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant58, (org.joda.time.ReadableDuration) duration60);
        boolean boolean62 = duration57.isShorterThan((org.joda.time.ReadableDuration) duration60);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Interval interval64 = duration60.toIntervalTo(readableInstant63);
        org.joda.time.Interval interval65 = interval64.toInterval();
        org.joda.time.Duration duration67 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant68 = null;
        java.lang.Object obj69 = null;
        org.joda.time.Duration duration70 = new org.joda.time.Duration(obj69);
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant68, (org.joda.time.ReadableDuration) duration70);
        boolean boolean72 = duration67.isShorterThan((org.joda.time.ReadableDuration) duration70);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Interval interval74 = duration70.toIntervalTo(readableInstant73);
        boolean boolean75 = interval65.isAfter((org.joda.time.ReadableInterval) interval74);
        org.joda.time.Weeks weeks76 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval74);
        org.joda.time.Period period77 = interval74.toPeriod();
        mutablePeriod53.add((org.joda.time.ReadableInterval) interval74);
        long long79 = interval74.getEndMillis();
        boolean boolean80 = interval38.isAfter((org.joda.time.ReadableInterval) interval74);
        long long81 = interval74.getStartMillis();
        org.joda.time.Interval interval82 = interval74.toInterval();
        long long83 = interval74.getEndMillis();
        org.joda.time.Period period84 = interval74.toPeriod();
        org.joda.time.Chronology chronology85 = interval74.getChronology();
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod13, chronology85);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(weeks76);
        org.junit.Assert.assertNotNull(period77);
// flaky:         org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1644572670163L + "'", long79 == 1644572670163L);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1644572670163L + "'", long81 == 1644572670163L);
        org.junit.Assert.assertNotNull(interval82);
// flaky:         org.junit.Assert.assertTrue("'" + long83 + "' != '" + 1644572670163L + "'", long83 == 1644572670163L);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(chronology85);
    }

    @Test
    public void test15590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15590");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        int int3 = weeks1.getWeeks();
        org.joda.time.Weeks weeks5 = weeks1.minus(3);
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) 1);
        boolean boolean8 = weeks1.equals((java.lang.Object) (byte) 1);
        org.joda.time.PeriodType periodType9 = weeks1.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = weeks1.toMutablePeriod();
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.THREE;
        int int12 = weeks11.size();
        org.joda.time.Duration duration13 = weeks11.toStandardDuration();
        java.lang.String str14 = weeks11.toString();
        org.joda.time.Weeks weeks16 = weeks11.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks18 = weeks16.multipliedBy(3);
        org.joda.time.Weeks weeks19 = weeks1.minus(weeks18);
        org.joda.time.MutablePeriod mutablePeriod20 = weeks1.toMutablePeriod();
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks23 = weeks1.plus(weeks22);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P3W" + "'", str14, "P3W");
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks23);
    }

    @Test
    public void test15591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15591");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(obj1);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant4);
        org.joda.time.Duration duration7 = org.joda.time.Duration.millis((long) '4');
        long long8 = duration7.getStandardDays();
        boolean boolean9 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration7);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.Period period12 = duration7.toPeriod(periodType10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) ' ', chronology14);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType18);
        mutablePeriod19.setYears(0);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology24 = null;
        mutablePeriod19.setPeriod((org.joda.time.ReadableDuration) duration23, chronology24);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        java.lang.Object obj29 = null;
        org.joda.time.Duration duration30 = new org.joda.time.Duration(obj29);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration30);
        boolean boolean32 = duration27.isShorterThan((org.joda.time.ReadableDuration) duration30);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Interval interval34 = duration30.toIntervalTo(readableInstant33);
        org.joda.time.Interval interval35 = interval34.toInterval();
        org.joda.time.DateTime dateTime36 = interval35.getEnd();
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant39 = null;
        java.lang.Object obj40 = null;
        org.joda.time.Duration duration41 = new org.joda.time.Duration(obj40);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, (org.joda.time.ReadableDuration) duration41);
        boolean boolean43 = duration38.isShorterThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Interval interval45 = duration41.toIntervalTo(readableInstant44);
        org.joda.time.Interval interval46 = interval45.toInterval();
        org.joda.time.DateTime dateTime47 = interval46.getEnd();
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration23, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Duration duration51 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant52 = null;
        java.lang.Object obj53 = null;
        org.joda.time.Duration duration54 = new org.joda.time.Duration(obj53);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant52, (org.joda.time.ReadableDuration) duration54);
        boolean boolean56 = duration51.isShorterThan((org.joda.time.ReadableDuration) duration54);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Interval interval58 = duration54.toIntervalTo(readableInstant57);
        org.joda.time.Interval interval59 = interval58.toInterval();
        org.joda.time.DateTime dateTime60 = interval59.getEnd();
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType63 = periodType62.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(periodType63);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod(10L, periodType63);
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) dateTime60, periodType63);
        org.joda.time.Duration duration67 = mutablePeriod15.toDurationFrom((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Duration duration69 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant70 = null;
        java.lang.Object obj71 = null;
        org.joda.time.Duration duration72 = new org.joda.time.Duration(obj71);
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant70, (org.joda.time.ReadableDuration) duration72);
        boolean boolean74 = duration69.isShorterThan((org.joda.time.ReadableDuration) duration72);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.Interval interval76 = duration72.toIntervalTo(readableInstant75);
        org.joda.time.Interval interval77 = interval76.toInterval();
        org.joda.time.DateTime dateTime78 = interval77.getEnd();
        boolean boolean79 = dateTime36.isBefore((org.joda.time.ReadableInstant) dateTime78);
        org.joda.time.Period period80 = duration7.toPeriodTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Period period82 = period80.plusMonths((int) (short) -1);
        org.joda.time.Period period84 = period82.withDays(36);
        org.joda.time.Period period86 = period84.plusMonths(0);
        org.joda.time.Period period88 = period84.withMillis(703);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertNotNull(dateTime78);
// flaky:         org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period88);
    }

    @Test
    public void test15592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15592");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod1.addMinutes((int) (short) 1);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType12);
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes16 = minutes14.multipliedBy((int) (short) 1);
        mutablePeriod13.setPeriod((org.joda.time.ReadablePeriod) minutes16);
        boolean boolean18 = mutablePeriod1.equals((java.lang.Object) minutes16);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        java.lang.Object obj22 = null;
        org.joda.time.Duration duration23 = new org.joda.time.Duration(obj22);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, (org.joda.time.ReadableDuration) duration23);
        boolean boolean25 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Interval interval27 = duration23.toIntervalTo(readableInstant26);
        org.joda.time.Interval interval28 = interval27.toInterval();
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant31 = null;
        java.lang.Object obj32 = null;
        org.joda.time.Duration duration33 = new org.joda.time.Duration(obj32);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration33);
        boolean boolean35 = duration30.isShorterThan((org.joda.time.ReadableDuration) duration33);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Interval interval37 = duration33.toIntervalTo(readableInstant36);
        org.joda.time.Interval interval38 = interval37.toInterval();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant41 = null;
        java.lang.Object obj42 = null;
        org.joda.time.Duration duration43 = new org.joda.time.Duration(obj42);
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, (org.joda.time.ReadableDuration) duration43);
        boolean boolean45 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Interval interval47 = duration43.toIntervalTo(readableInstant46);
        boolean boolean48 = interval38.isAfter((org.joda.time.ReadableInterval) interval47);
        org.joda.time.Period period49 = interval47.toPeriod();
        boolean boolean50 = interval28.isBefore((org.joda.time.ReadableInterval) interval47);
        mutablePeriod1.add((org.joda.time.ReadableInterval) interval28);
        mutablePeriod1.setPeriod(100, 5, (-9700), 2719, 9, (int) (short) -1, 9, 52);
        mutablePeriod1.setPeriod((long) 37);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test15593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15593");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(1644572665867L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test15594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15594");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        long long9 = interval8.getStartMillis();
        org.joda.time.DateTime dateTime10 = interval8.getStart();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        java.lang.Object obj14 = null;
        org.joda.time.Duration duration15 = new org.joda.time.Duration(obj14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration15);
        boolean boolean17 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration15.toIntervalTo(readableInstant18);
        org.joda.time.Interval interval20 = interval19.toInterval();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        java.lang.Object obj24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(obj24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration25);
        boolean boolean27 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Interval interval29 = duration25.toIntervalTo(readableInstant28);
        boolean boolean30 = interval20.isAfter((org.joda.time.ReadableInterval) interval29);
        org.joda.time.Weeks weeks31 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval29);
        org.joda.time.DateTime dateTime32 = interval29.getEnd();
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, readableDuration34);
        org.joda.time.Weeks weeks36 = org.joda.time.Weeks.TWO;
        org.joda.time.Weeks weeks38 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks39 = weeks38.negated();
        org.joda.time.Weeks weeks40 = weeks39.negated();
        org.joda.time.Weeks weeks41 = weeks36.minus(weeks39);
        org.joda.time.PeriodType periodType42 = weeks41.getPeriodType();
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType45);
        mutablePeriod46.setYears(0);
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology51 = null;
        mutablePeriod46.setPeriod((org.joda.time.ReadableDuration) duration50, chronology51);
        mutablePeriod46.add(0, (-1), (int) (short) 1, (int) (byte) 0, (int) (byte) 0, 1, 10, (int) '4');
        int int62 = mutablePeriod46.getYears();
        mutablePeriod46.addMonths((int) (short) 0);
        mutablePeriod46.addSeconds(0);
        mutablePeriod46.addSeconds((-1));
        org.joda.time.PeriodType periodType69 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType70 = periodType69.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(periodType69);
        org.joda.time.DurationFieldType durationFieldType72 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str73 = durationFieldType72.toString();
        boolean boolean74 = periodType69.isSupported(durationFieldType72);
        boolean boolean75 = mutablePeriod46.isSupported(durationFieldType72);
        int int76 = periodType42.indexOf(durationFieldType72);
        org.joda.time.Period period78 = period35.withFieldAdded(durationFieldType72, 7);
        org.joda.time.Period period80 = org.joda.time.Period.months(100);
        org.joda.time.Period period81 = period35.minus((org.joda.time.ReadablePeriod) period80);
        org.joda.time.Period period83 = period81.plusSeconds(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period85 = period81.multipliedBy(456368756);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -100 * 456368756");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1644572670329L + "'", long9 == 1644572670329L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "weeks" + "'", str73, "weeks");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
    }

    @Test
    public void test15595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15595");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType3 = periodType2.withMonthsRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withMillisRemoved();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 187, (long) (-840), periodType2, chronology5);
        org.joda.time.Period period8 = period6.minusDays(6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period8.withYears(46);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test15596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15596");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(53, 33, 54, (int) '4', 3, 727, 0, 648);
        org.joda.time.PeriodType periodType9 = mutablePeriod8.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = mutablePeriod8.getValue(284);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 284");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test15597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15597");
        org.joda.time.ReadableInstant readableInstant1 = null;
        java.lang.Object obj2 = null;
        org.joda.time.Duration duration3 = new org.joda.time.Duration(obj2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Period period6 = period4.withSeconds((int) '4');
        org.joda.time.Period period8 = period4.plusWeeks(10);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType11 = periodType10.withMillisRemoved();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (short) 1, periodType11, chronology12);
        org.joda.time.PeriodType periodType14 = periodType11.withYearsRemoved();
        org.joda.time.PeriodType periodType15 = periodType11.withMillisRemoved();
        org.joda.time.Period period16 = period8.normalizedStandard(periodType15);
        org.joda.time.PeriodType periodType17 = periodType15.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(1644572252461L, periodType15);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod18.setSeconds((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test15598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15598");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(0);
        org.joda.time.Hours hours2 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours3 = org.joda.time.Hours.ZERO;
        org.joda.time.Hours hours4 = hours2.minus(hours3);
        int int5 = hours2.getHours();
        org.joda.time.Hours hours6 = hours1.minus(hours2);
        org.joda.time.Duration duration9 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = duration9.toPeriodFrom(readableInstant10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = duration9.toPeriod(chronology12);
        org.joda.time.Period period15 = period13.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.Hours hours17 = org.joda.time.Hours.hoursIn(readableInterval16);
        org.joda.time.Period period18 = period15.minus((org.joda.time.ReadablePeriod) hours17);
        org.joda.time.Hours hours20 = hours17.minus((int) '4');
        org.joda.time.Hours hours22 = hours20.plus((int) (short) 10);
        org.joda.time.Duration duration25 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = duration25.toPeriodFrom(readableInstant26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = duration25.toPeriod(chronology28);
        org.joda.time.Period period31 = period29.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.Hours hours33 = org.joda.time.Hours.hoursIn(readableInterval32);
        org.joda.time.Period period34 = period31.minus((org.joda.time.ReadablePeriod) hours33);
        org.joda.time.Hours hours35 = hours33.negated();
        org.joda.time.Duration duration38 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = duration38.toPeriodFrom(readableInstant39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = duration38.toPeriod(chronology41);
        org.joda.time.Period period44 = period42.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.Hours hours46 = org.joda.time.Hours.hoursIn(readableInterval45);
        org.joda.time.Period period47 = period44.minus((org.joda.time.ReadablePeriod) hours46);
        org.joda.time.Hours hours48 = hours46.negated();
        org.joda.time.Hours hours49 = hours33.minus(hours46);
        org.joda.time.Hours hours50 = hours22.minus(hours46);
        org.joda.time.DurationFieldType durationFieldType51 = hours46.getFieldType();
        org.joda.time.Hours hours53 = hours46.plus(2147483647);
        org.joda.time.Hours hours55 = org.joda.time.Hours.hours((int) 'a');
        org.joda.time.Duration duration56 = hours55.toStandardDuration();
        org.joda.time.Duration duration58 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant59 = null;
        java.lang.Object obj60 = null;
        org.joda.time.Duration duration61 = new org.joda.time.Duration(obj60);
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant59, (org.joda.time.ReadableDuration) duration61);
        boolean boolean63 = duration58.isShorterThan((org.joda.time.ReadableDuration) duration61);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Interval interval65 = duration61.toIntervalTo(readableInstant64);
        org.joda.time.Interval interval66 = interval65.toInterval();
        org.joda.time.Hours hours67 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval66);
        org.joda.time.Hours hours68 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval66);
        org.joda.time.Hours hours70 = hours68.minus(8);
        org.joda.time.Hours hours72 = hours70.plus(0);
        org.joda.time.Hours hours73 = hours55.minus(hours70);
        boolean boolean74 = hours46.isGreaterThan(hours73);
        boolean boolean75 = hours6.isGreaterThan(hours73);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(hours46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(hours48);
        org.junit.Assert.assertNotNull(hours49);
        org.junit.Assert.assertNotNull(hours50);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertNotNull(hours53);
        org.junit.Assert.assertNotNull(hours55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(hours67);
        org.junit.Assert.assertNotNull(hours68);
        org.junit.Assert.assertNotNull(hours70);
        org.junit.Assert.assertNotNull(hours72);
        org.junit.Assert.assertNotNull(hours73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test15599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15599");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (short) 1);
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withMinutes(213044);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test15600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15600");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 0, (int) (byte) 10, (int) (byte) 100, (int) (byte) 100);
        org.joda.time.Period period10 = period8.plusDays(1);
        org.joda.time.Period period12 = period10.minusYears((int) (short) -1);
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period10);
        org.joda.time.DurationFieldType durationFieldType14 = seconds13.getFieldType();
        boolean boolean15 = periodType3.isSupported(durationFieldType14);
        org.joda.time.Duration duration18 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration21 = duration18.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration23 = duration21.withMillis((long) (byte) 10);
        long long24 = duration23.getStandardHours();
        boolean boolean25 = periodType3.equals((java.lang.Object) duration23);
        org.joda.time.PeriodType periodType26 = periodType3.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(1644572459275L, periodType26);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(periodType26);
    }

    @Test
    public void test15601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15601");
        org.joda.time.Period period8 = new org.joda.time.Period((-32), 876, 0, (-12), 16, 29, 2719, (-963));
    }

    @Test
    public void test15602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15602");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval9);
        org.joda.time.DurationFieldType durationFieldType12 = weeks11.getFieldType();
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks14 = weeks11.plus(weeks13);
        org.joda.time.Weeks weeks16 = weeks13.plus(107);
        org.joda.time.Weeks weeks18 = weeks13.multipliedBy(52);
        int int19 = weeks13.getWeeks();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test15603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15603");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        java.lang.Object obj13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(obj13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration14);
        boolean boolean16 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration14.toIntervalTo(readableInstant17);
        boolean boolean19 = interval9.isAfter((org.joda.time.ReadableInterval) interval18);
        org.joda.time.DateTime dateTime20 = interval9.getStart();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        org.joda.time.Duration duration23 = org.joda.time.Duration.millis((long) '4');
        long long24 = duration23.getMillis();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType27);
        mutablePeriod28.setYears(0);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration32, chronology33);
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant37 = null;
        java.lang.Object obj38 = null;
        org.joda.time.Duration duration39 = new org.joda.time.Duration(obj38);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant37, (org.joda.time.ReadableDuration) duration39);
        boolean boolean41 = duration36.isShorterThan((org.joda.time.ReadableDuration) duration39);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Interval interval43 = duration39.toIntervalTo(readableInstant42);
        org.joda.time.Interval interval44 = interval43.toInterval();
        org.joda.time.DateTime dateTime45 = interval44.getEnd();
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant48 = null;
        java.lang.Object obj49 = null;
        org.joda.time.Duration duration50 = new org.joda.time.Duration(obj49);
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant48, (org.joda.time.ReadableDuration) duration50);
        boolean boolean52 = duration47.isShorterThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Interval interval54 = duration50.toIntervalTo(readableInstant53);
        org.joda.time.Interval interval55 = interval54.toInterval();
        org.joda.time.DateTime dateTime56 = interval55.getEnd();
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration32, (org.joda.time.ReadableInstant) dateTime45);
        java.lang.String str59 = dateTime45.toString();
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration23, (org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant63 = null;
        java.lang.Object obj64 = null;
        org.joda.time.Duration duration65 = new org.joda.time.Duration(obj64);
        org.joda.time.Period period66 = new org.joda.time.Period(readableInstant63, (org.joda.time.ReadableDuration) duration65);
        boolean boolean67 = duration62.isShorterThan((org.joda.time.ReadableDuration) duration65);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Interval interval69 = duration65.toIntervalTo(readableInstant68);
        org.joda.time.Duration duration72 = new org.joda.time.Duration((long) 'a', (long) 0);
        boolean boolean73 = duration65.equals((java.lang.Object) 'a');
        org.joda.time.Minutes minutes74 = duration65.toStandardMinutes();
        org.joda.time.Duration duration75 = duration23.plus((org.joda.time.ReadableDuration) duration65);
        long long76 = duration75.getStandardDays();
        org.joda.time.Period period77 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableDuration) duration75);
        org.joda.time.PeriodType periodType78 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType79 = periodType78.withMonthsRemoved();
        org.joda.time.PeriodType periodType80 = periodType79.withHoursRemoved();
        boolean boolean81 = period77.equals((java.lang.Object) periodType80);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(periodType80);
        mutablePeriod82.setSeconds(56);
        org.joda.time.Minutes minutes85 = org.joda.time.Minutes.ZERO;
        org.joda.time.Period period86 = new org.joda.time.Period((java.lang.Object) minutes85);
        org.joda.time.Minutes minutes87 = minutes85.negated();
        org.joda.time.ReadablePeriod readablePeriod88 = null;
        org.joda.time.Minutes minutes89 = org.joda.time.Minutes.standardMinutesIn(readablePeriod88);
        java.lang.String str90 = minutes89.toString();
        org.joda.time.Minutes minutes91 = minutes85.plus(minutes89);
        mutablePeriod82.setPeriod((org.joda.time.ReadablePeriod) minutes89);
        mutablePeriod82.add(1644572413599L);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(dateTime56);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "2022-02-11T09:44:30.504Z" + "'", str59, "2022-02-11T09:44:30.504Z");
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(minutes74);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(periodType78);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(minutes85);
        org.junit.Assert.assertNotNull(minutes87);
        org.junit.Assert.assertNotNull(minutes89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "PT0M" + "'", str90, "PT0M");
        org.junit.Assert.assertNotNull(minutes91);
    }

    @Test
    public void test15604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15604");
        org.joda.time.Period period1 = org.joda.time.Period.hours(10);
        org.joda.time.Period period3 = period1.plusMonths(2147483647);
        org.joda.time.Period period5 = period1.withMinutes((int) (byte) 0);
        org.joda.time.Period period7 = period5.withDays(4);
        org.joda.time.Days days8 = period7.toStandardDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
    }

    @Test
    public void test15605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15605");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        java.lang.Object obj4 = null;
        org.joda.time.Duration duration5 = new org.joda.time.Duration(obj4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration5);
        boolean boolean7 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Interval interval9 = duration5.toIntervalTo(readableInstant8);
        org.joda.time.Interval interval10 = interval9.toInterval();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        java.lang.Object obj14 = null;
        org.joda.time.Duration duration15 = new org.joda.time.Duration(obj14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration15);
        boolean boolean17 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration15.toIntervalTo(readableInstant18);
        boolean boolean20 = interval10.isAfter((org.joda.time.ReadableInterval) interval19);
        org.joda.time.DateTime dateTime21 = interval10.getStart();
        org.joda.time.Duration duration22 = interval10.toDuration();
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        java.lang.Object obj26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(obj26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration27);
        boolean boolean29 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        org.joda.time.Interval interval32 = interval31.toInterval();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType35);
        mutablePeriod36.setYears(0);
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod36.setPeriod((org.joda.time.ReadableDuration) duration40, chronology41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        java.lang.Object obj44 = null;
        org.joda.time.Duration duration45 = new org.joda.time.Duration(obj44);
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant43, (org.joda.time.ReadableDuration) duration45);
        org.joda.time.Duration duration48 = duration45.minus((long) '4');
        mutablePeriod36.add((org.joda.time.ReadableDuration) duration48);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType51 = periodType50.withHoursRemoved();
        org.joda.time.PeriodType periodType52 = periodType51.withSecondsRemoved();
        boolean boolean53 = mutablePeriod36.equals((java.lang.Object) periodType51);
        org.joda.time.Duration duration55 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant56 = null;
        java.lang.Object obj57 = null;
        org.joda.time.Duration duration58 = new org.joda.time.Duration(obj57);
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant56, (org.joda.time.ReadableDuration) duration58);
        boolean boolean60 = duration55.isShorterThan((org.joda.time.ReadableDuration) duration58);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Interval interval62 = duration58.toIntervalTo(readableInstant61);
        org.joda.time.Interval interval63 = interval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.Period period65 = new org.joda.time.Period((java.lang.Object) interval31, periodType51, chronology64);
        org.joda.time.PeriodType periodType66 = periodType51.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (byte) -1);
        org.joda.time.Duration duration73 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant74 = null;
        java.lang.Object obj75 = null;
        org.joda.time.Duration duration76 = new org.joda.time.Duration(obj75);
        org.joda.time.Period period77 = new org.joda.time.Period(readableInstant74, (org.joda.time.ReadableDuration) duration76);
        boolean boolean78 = duration73.isShorterThan((org.joda.time.ReadableDuration) duration76);
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.Interval interval80 = duration76.toIntervalTo(readableInstant79);
        org.joda.time.Interval interval81 = interval80.toInterval();
        org.joda.time.Chronology chronology82 = interval81.getChronology();
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((-1L), chronology82);
        mutablePeriod69.add(1644572099705L, chronology82);
        org.joda.time.Period period85 = duration22.toPeriod(periodType66, chronology82);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod(1644572149539L, chronology82);
        mutablePeriod86.addMinutes((int) (short) -1);
        mutablePeriod86.setHours((-52));
        int int91 = mutablePeriod86.getMonths();
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test15606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15606");
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType5 = periodType4.withYearsRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = new org.joda.time.Period(1644572164953L, 1644572155130L, periodType4);
        org.joda.time.Period period8 = new org.joda.time.Period(1644572080830L, 1644572108154L, periodType4);
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.seconds((int) '#');
        org.joda.time.DurationFieldType durationFieldType11 = seconds10.getFieldType();
        boolean boolean12 = periodType4.isSupported(durationFieldType11);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15607");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks2 = weeks0.minus(weeks1);
        org.joda.time.Weeks weeks4 = weeks2.multipliedBy(100);
        org.joda.time.MutablePeriod mutablePeriod5 = weeks2.toMutablePeriod();
        org.joda.time.Weeks weeks7 = weeks2.multipliedBy(2);
        int int8 = weeks2.getWeeks();
        org.joda.time.Weeks weeks9 = weeks2.negated();
        java.lang.String str10 = weeks2.toString();
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.THREE;
        int int12 = weeks11.size();
        org.joda.time.Duration duration13 = weeks11.toStandardDuration();
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.THREE;
        int int15 = weeks14.size();
        org.joda.time.Duration duration16 = weeks14.toStandardDuration();
        java.lang.String str17 = weeks14.toString();
        org.joda.time.Weeks weeks19 = weeks14.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks21 = weeks19.multipliedBy(3);
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.weeks((-1));
        boolean boolean24 = weeks19.isGreaterThan(weeks23);
        org.joda.time.Weeks weeks25 = weeks11.minus(weeks23);
        int int26 = weeks25.getWeeks();
        org.joda.time.Weeks weeks27 = org.joda.time.Weeks.TWO;
        org.joda.time.Weeks weeks28 = weeks25.plus(weeks27);
        int int29 = weeks27.getWeeks();
        boolean boolean30 = weeks2.isLessThan(weeks27);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P0W" + "'", str10, "P0W");
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P3W" + "'", str17, "P3W");
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test15608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15608");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval9);
        org.joda.time.Hours hours11 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval9);
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        java.lang.Object obj15 = null;
        org.joda.time.Duration duration16 = new org.joda.time.Duration(obj15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration16);
        boolean boolean18 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Interval interval20 = duration16.toIntervalTo(readableInstant19);
        org.joda.time.Interval interval21 = interval20.toInterval();
        org.joda.time.DateTime dateTime22 = interval21.getEnd();
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        java.lang.Object obj26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(obj26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration27);
        boolean boolean29 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        org.joda.time.Interval interval32 = interval31.toInterval();
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant35 = null;
        java.lang.Object obj36 = null;
        org.joda.time.Duration duration37 = new org.joda.time.Duration(obj36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant35, (org.joda.time.ReadableDuration) duration37);
        boolean boolean39 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration37);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Interval interval41 = duration37.toIntervalTo(readableInstant40);
        boolean boolean42 = interval32.isAfter((org.joda.time.ReadableInterval) interval41);
        boolean boolean43 = interval21.contains((org.joda.time.ReadableInterval) interval32);
        org.joda.time.Hours hours44 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval21);
        long long45 = interval21.toDurationMillis();
        boolean boolean46 = interval9.isAfter((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant49 = null;
        java.lang.Object obj50 = null;
        org.joda.time.Duration duration51 = new org.joda.time.Duration(obj50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, (org.joda.time.ReadableDuration) duration51);
        boolean boolean53 = duration48.isShorterThan((org.joda.time.ReadableDuration) duration51);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Interval interval55 = duration51.toIntervalTo(readableInstant54);
        org.joda.time.Duration duration57 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant58 = null;
        java.lang.Object obj59 = null;
        org.joda.time.Duration duration60 = new org.joda.time.Duration(obj59);
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant58, (org.joda.time.ReadableDuration) duration60);
        boolean boolean62 = duration57.isShorterThan((org.joda.time.ReadableDuration) duration60);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Interval interval64 = duration60.toIntervalTo(readableInstant63);
        org.joda.time.Interval interval65 = interval64.toInterval();
        org.joda.time.Hours hours66 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval65);
        org.joda.time.Hours hours67 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval65);
        boolean boolean68 = interval55.overlaps((org.joda.time.ReadableInterval) interval65);
        org.joda.time.DateTime dateTime69 = interval55.getStart();
        org.joda.time.MutableInterval mutableInterval70 = interval55.toMutableInterval();
        org.joda.time.DateTime dateTime71 = mutableInterval70.getEnd();
        long long72 = mutableInterval70.toDurationMillis();
        org.joda.time.Duration duration73 = mutableInterval70.toDuration();
        boolean boolean74 = interval9.contains((org.joda.time.ReadableInterval) mutableInterval70);
        long long75 = mutableInterval70.toDurationMillis();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(hours44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(hours66);
        org.junit.Assert.assertNotNull(hours67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(mutableInterval70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
    }

    @Test
    public void test15609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15609");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(obj5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6);
        boolean boolean8 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Interval interval10 = duration6.toIntervalTo(readableInstant9);
        org.joda.time.Interval interval11 = interval10.toInterval();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) ' ', chronology13);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType17);
        mutablePeriod18.setYears(0);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod18.setPeriod((org.joda.time.ReadableDuration) duration22, chronology23);
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant27 = null;
        java.lang.Object obj28 = null;
        org.joda.time.Duration duration29 = new org.joda.time.Duration(obj28);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant27, (org.joda.time.ReadableDuration) duration29);
        boolean boolean31 = duration26.isShorterThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Interval interval33 = duration29.toIntervalTo(readableInstant32);
        org.joda.time.Interval interval34 = interval33.toInterval();
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant38 = null;
        java.lang.Object obj39 = null;
        org.joda.time.Duration duration40 = new org.joda.time.Duration(obj39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, (org.joda.time.ReadableDuration) duration40);
        boolean boolean42 = duration37.isShorterThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Interval interval44 = duration40.toIntervalTo(readableInstant43);
        org.joda.time.Interval interval45 = interval44.toInterval();
        org.joda.time.DateTime dateTime46 = interval45.getEnd();
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant51 = null;
        java.lang.Object obj52 = null;
        org.joda.time.Duration duration53 = new org.joda.time.Duration(obj52);
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant51, (org.joda.time.ReadableDuration) duration53);
        boolean boolean55 = duration50.isShorterThan((org.joda.time.ReadableDuration) duration53);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Interval interval57 = duration53.toIntervalTo(readableInstant56);
        org.joda.time.Interval interval58 = interval57.toInterval();
        org.joda.time.DateTime dateTime59 = interval58.getEnd();
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType62 = periodType61.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(periodType62);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(10L, periodType62);
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime59, periodType62);
        org.joda.time.Duration duration66 = mutablePeriod14.toDurationFrom((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Duration duration68 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant69 = null;
        java.lang.Object obj70 = null;
        org.joda.time.Duration duration71 = new org.joda.time.Duration(obj70);
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant69, (org.joda.time.ReadableDuration) duration71);
        boolean boolean73 = duration68.isShorterThan((org.joda.time.ReadableDuration) duration71);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Interval interval75 = duration71.toIntervalTo(readableInstant74);
        org.joda.time.Interval interval76 = interval75.toInterval();
        org.joda.time.DateTime dateTime77 = interval76.getEnd();
        boolean boolean78 = dateTime35.isBefore((org.joda.time.ReadableInstant) dateTime77);
        boolean boolean79 = interval10.isBefore((org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.Duration duration81 = org.joda.time.Duration.millis((long) 3);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime77, (org.joda.time.ReadableDuration) duration81);
        org.joda.time.ReadableDuration readableDuration83 = null;
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime77, readableDuration83);
        org.joda.time.Chronology chronology85 = dateTime77.getChronology();
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod(17161L, chronology85);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod((long) 5, chronology85);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(dateTime77);
// flaky:         org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(duration81);
        org.junit.Assert.assertNotNull(chronology85);
    }

    @Test
    public void test15610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15610");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (byte) 0);
        mutablePeriod1.setValue((int) (short) 0, (int) 'a');
        mutablePeriod1.setDays(56);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1);
        mutablePeriod9.addWeeks((int) (byte) 100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray12 = mutablePeriod9.getFieldTypes();
        mutablePeriod9.addMillis((int) 'a');
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod();
        mutablePeriod16.setPeriod(100L, (long) (-1));
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        java.lang.Object obj27 = null;
        org.joda.time.Duration duration28 = new org.joda.time.Duration(obj27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration28);
        boolean boolean30 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Interval interval32 = duration28.toIntervalTo(readableInstant31);
        org.joda.time.Interval interval33 = interval32.toInterval();
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((-1L), chronology34);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(0L, (long) (short) -1, chronology34);
        mutablePeriod16.setPeriod((long) 100, chronology34);
        mutablePeriod9.setPeriod(1644572118718L, chronology34);
        org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) mutablePeriod1, chronology34);
        org.joda.time.Period period42 = new org.joda.time.Period((long) (byte) 10, (long) (byte) 0);
        org.joda.time.Period period44 = period42.minusWeeks((int) ' ');
        mutablePeriod1.setPeriod((org.joda.time.ReadablePeriod) period44);
        org.junit.Assert.assertNotNull(durationFieldTypeArray12);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test15611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15611");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        long long10 = interval8.toDurationMillis();
        org.joda.time.DateTime dateTime11 = interval8.getStart();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) ' ', chronology13);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType17);
        mutablePeriod18.setYears(0);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod18.setPeriod((org.joda.time.ReadableDuration) duration22, chronology23);
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant27 = null;
        java.lang.Object obj28 = null;
        org.joda.time.Duration duration29 = new org.joda.time.Duration(obj28);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant27, (org.joda.time.ReadableDuration) duration29);
        boolean boolean31 = duration26.isShorterThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Interval interval33 = duration29.toIntervalTo(readableInstant32);
        org.joda.time.Interval interval34 = interval33.toInterval();
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant38 = null;
        java.lang.Object obj39 = null;
        org.joda.time.Duration duration40 = new org.joda.time.Duration(obj39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, (org.joda.time.ReadableDuration) duration40);
        boolean boolean42 = duration37.isShorterThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Interval interval44 = duration40.toIntervalTo(readableInstant43);
        org.joda.time.Interval interval45 = interval44.toInterval();
        org.joda.time.DateTime dateTime46 = interval45.getEnd();
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, (org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant51 = null;
        java.lang.Object obj52 = null;
        org.joda.time.Duration duration53 = new org.joda.time.Duration(obj52);
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant51, (org.joda.time.ReadableDuration) duration53);
        boolean boolean55 = duration50.isShorterThan((org.joda.time.ReadableDuration) duration53);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Interval interval57 = duration53.toIntervalTo(readableInstant56);
        org.joda.time.Interval interval58 = interval57.toInterval();
        org.joda.time.DateTime dateTime59 = interval58.getEnd();
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType62 = periodType61.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(periodType62);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(10L, periodType62);
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime59, periodType62);
        org.joda.time.Duration duration66 = mutablePeriod14.toDurationFrom((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Seconds seconds67 = duration66.toStandardSeconds();
        org.joda.time.ReadableDuration readableDuration68 = null;
        boolean boolean69 = duration66.isShorterThan(readableDuration68);
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime11, readableDuration68);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = null;
        boolean boolean72 = dateTime11.isSupported(dateTimeFieldType71);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(seconds67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test15612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15612");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days2 = days0.multipliedBy((-1));
        org.joda.time.Days days4 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod6 = days4.toMutablePeriod();
        org.joda.time.Days days7 = days2.plus(days4);
        org.joda.time.Duration duration9 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration11 = duration9.plus(1644572076849L);
        org.joda.time.Days days12 = duration9.toStandardDays();
        org.joda.time.Period period13 = days12.toPeriod();
        java.lang.String str14 = days12.toString();
        org.joda.time.Days days15 = org.joda.time.Days.FOUR;
        org.joda.time.Days days17 = days15.multipliedBy((-1));
        boolean boolean18 = days12.isGreaterThan(days17);
        boolean boolean19 = days7.isGreaterThan(days12);
        org.joda.time.Days days21 = days7.minus((int) (byte) 10);
        org.joda.time.Days days22 = org.joda.time.Days.SIX;
        org.joda.time.Days days24 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.Days days25 = days22.plus(days24);
        org.joda.time.Duration duration26 = days25.toStandardDuration();
        boolean boolean27 = days21.isGreaterThan(days25);
        int int28 = days25.getDays();
        org.joda.time.Days days30 = days25.dividedBy((-68));
        org.joda.time.Days days32 = days25.minus((-48));
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P0D" + "'", str14, "P0D");
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days32);
    }

    @Test
    public void test15613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15613");
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardSeconds(1644572148350L);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType7 = periodType6.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(10L, periodType7);
        org.joda.time.Period period10 = duration4.toPeriod(periodType7);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod12.addMinutes((int) (short) 1);
        mutablePeriod12.setDays((int) ' ');
        org.joda.time.Duration duration21 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = duration21.toPeriodFrom(readableInstant22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = duration21.toPeriod(chronology24);
        java.lang.String str26 = period25.toString();
        org.joda.time.MutablePeriod mutablePeriod27 = period25.toMutablePeriod();
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant30 = null;
        java.lang.Object obj31 = null;
        org.joda.time.Duration duration32 = new org.joda.time.Duration(obj31);
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant30, (org.joda.time.ReadableDuration) duration32);
        boolean boolean34 = duration29.isShorterThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Interval interval36 = duration32.toIntervalTo(readableInstant35);
        long long37 = interval36.getStartMillis();
        mutablePeriod27.setPeriod((org.joda.time.ReadableInterval) interval36);
        org.joda.time.Minutes minutes39 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval36);
        long long40 = interval36.getEndMillis();
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant43 = null;
        java.lang.Object obj44 = null;
        org.joda.time.Duration duration45 = new org.joda.time.Duration(obj44);
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant43, (org.joda.time.ReadableDuration) duration45);
        boolean boolean47 = duration42.isShorterThan((org.joda.time.ReadableDuration) duration45);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Interval interval49 = duration45.toIntervalTo(readableInstant48);
        org.joda.time.Interval interval50 = interval49.toInterval();
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant53 = null;
        java.lang.Object obj54 = null;
        org.joda.time.Duration duration55 = new org.joda.time.Duration(obj54);
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, (org.joda.time.ReadableDuration) duration55);
        boolean boolean57 = duration52.isShorterThan((org.joda.time.ReadableDuration) duration55);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Interval interval59 = duration55.toIntervalTo(readableInstant58);
        org.joda.time.Interval interval60 = interval59.toInterval();
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant63 = null;
        java.lang.Object obj64 = null;
        org.joda.time.Duration duration65 = new org.joda.time.Duration(obj64);
        org.joda.time.Period period66 = new org.joda.time.Period(readableInstant63, (org.joda.time.ReadableDuration) duration65);
        boolean boolean67 = duration62.isShorterThan((org.joda.time.ReadableDuration) duration65);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Interval interval69 = duration65.toIntervalTo(readableInstant68);
        boolean boolean70 = interval60.isAfter((org.joda.time.ReadableInterval) interval69);
        org.joda.time.Period period71 = interval69.toPeriod();
        boolean boolean72 = interval50.isBefore((org.joda.time.ReadableInterval) interval69);
        boolean boolean73 = interval36.isAfter((org.joda.time.ReadableInterval) interval50);
        org.joda.time.Duration duration74 = interval36.toDuration();
        org.joda.time.Chronology chronology75 = interval36.getChronology();
        mutablePeriod12.setPeriod(1644572114000L, (long) 17, chronology75);
        org.joda.time.Period period77 = new org.joda.time.Period(1644572160337L, 1644572122353L, periodType7, chronology75);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period78 = new org.joda.time.Period((java.lang.Object) "2022-02-11T09:41:06.810Z/2022-02-11T09:41:06.810Z", periodType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:41:06.810Z/2022-02...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT0.097S" + "'", str26, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(interval36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1644572670765L + "'", long37 == 1644572670765L);
        org.junit.Assert.assertNotNull(minutes39);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1644572670765L + "'", long40 == 1644572670765L);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertNotNull(chronology75);
    }

    @Test
    public void test15614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15614");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(1644572113566L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration4, readableInstant6);
        org.joda.time.Duration duration9 = org.joda.time.Duration.millis((long) '4');
        long long10 = duration9.getStandardDays();
        boolean boolean11 = duration4.isLongerThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        java.lang.Object obj15 = null;
        org.joda.time.Duration duration16 = new org.joda.time.Duration(obj15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration16);
        boolean boolean18 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        java.lang.Object obj22 = null;
        org.joda.time.Duration duration23 = new org.joda.time.Duration(obj22);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, (org.joda.time.ReadableDuration) duration23);
        boolean boolean25 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Interval interval27 = duration23.toIntervalTo(readableInstant26);
        org.joda.time.Interval interval28 = interval27.toInterval();
        org.joda.time.DateTime dateTime29 = interval28.getEnd();
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        java.lang.Object obj33 = null;
        org.joda.time.Duration duration34 = new org.joda.time.Duration(obj33);
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, (org.joda.time.ReadableDuration) duration34);
        boolean boolean36 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Interval interval38 = duration34.toIntervalTo(readableInstant37);
        org.joda.time.Interval interval39 = interval38.toInterval();
        org.joda.time.DateTime dateTime40 = interval39.getEnd();
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant44 = null;
        java.lang.Object obj45 = null;
        org.joda.time.Duration duration46 = new org.joda.time.Duration(obj45);
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, (org.joda.time.ReadableDuration) duration46);
        boolean boolean48 = duration43.isShorterThan((org.joda.time.ReadableDuration) duration46);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.Minutes minutes51 = org.joda.time.Minutes.minutesIn(readableInterval50);
        java.lang.String str52 = minutes51.toString();
        org.joda.time.PeriodType periodType53 = minutes51.getPeriodType();
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration46, readableInstant49, periodType53);
        org.joda.time.PeriodType periodType55 = periodType53.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime40, periodType55);
        org.joda.time.Interval interval57 = duration4.toIntervalFrom((org.joda.time.ReadableInstant) dateTime40);
        java.lang.String str58 = interval57.toString();
        org.joda.time.DateTime dateTime59 = interval57.getStart();
        org.joda.time.Interval interval60 = duration1.toIntervalFrom((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Interval interval61 = interval60.toInterval();
        long long62 = interval60.toDurationMillis();
        org.joda.time.DateTime dateTime63 = interval60.getStart();
        org.joda.time.ReadableInstant readableInstant64 = null;
        boolean boolean65 = dateTime63.isEqual(readableInstant64);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PT0M" + "'", str52, "PT0M");
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(interval57);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "2022-02-11T09:44:30.786Z/2022-02-11T09:44:30.786Z" + "'", str58, "2022-02-11T09:44:30.786Z/2022-02-11T09:44:30.786Z");
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1644572113566L + "'", long62 == 1644572113566L);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test15615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15615");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Period period1 = minutes0.toPeriod();
        org.joda.time.Duration duration2 = period1.toStandardDuration();
        org.joda.time.Period period4 = period1.withDays((-2147483612));
        org.joda.time.Period period6 = period4.minusMinutes((int) 'a');
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test15616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15616");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(1644572076L);
        mutablePeriod1.setWeeks(100);
        mutablePeriod1.addMonths(5);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType8);
        mutablePeriod9.setYears(0);
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod9.setPeriod((org.joda.time.ReadableDuration) duration13, chronology14);
        mutablePeriod9.add(0, (-1), (int) (short) 1, (int) (byte) 0, (int) (byte) 0, 1, 10, (int) '4');
        int int25 = mutablePeriod9.getYears();
        mutablePeriod9.addMonths((int) (short) 0);
        mutablePeriod9.addSeconds(0);
        mutablePeriod9.addSeconds((-1));
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType33 = periodType32.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(periodType32);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str36 = durationFieldType35.toString();
        boolean boolean37 = periodType32.isSupported(durationFieldType35);
        boolean boolean38 = mutablePeriod9.isSupported(durationFieldType35);
        java.lang.String str39 = durationFieldType35.getName();
        int int40 = mutablePeriod1.get(durationFieldType35);
        mutablePeriod1.addSeconds(12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "weeks" + "'", str36, "weeks");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "weeks" + "'", str39, "weeks");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
    }

    @Test
    public void test15617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15617");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy((int) (byte) 1);
        int int3 = seconds2.size();
        org.joda.time.Period period5 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period7 = period5.minusMillis((-1));
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period7);
        boolean boolean9 = seconds2.isGreaterThan(seconds8);
        org.joda.time.DurationFieldType durationFieldType10 = seconds8.getFieldType();
        org.joda.time.DurationFieldType durationFieldType11 = seconds8.getFieldType();
        org.joda.time.DurationFieldType durationFieldType12 = seconds8.getFieldType();
        org.joda.time.Seconds seconds14 = seconds8.multipliedBy(8);
        org.joda.time.Seconds seconds16 = seconds8.plus((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType18 = seconds8.getFieldType(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds16);
    }

    @Test
    public void test15618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15618");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        java.lang.Object obj4 = null;
        org.joda.time.Duration duration5 = new org.joda.time.Duration(obj4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration5);
        boolean boolean7 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Interval interval9 = duration5.toIntervalTo(readableInstant8);
        org.joda.time.Interval interval10 = interval9.toInterval();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        java.lang.Object obj14 = null;
        org.joda.time.Duration duration15 = new org.joda.time.Duration(obj14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration15);
        boolean boolean17 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration15.toIntervalTo(readableInstant18);
        boolean boolean20 = interval10.isAfter((org.joda.time.ReadableInterval) interval19);
        org.joda.time.DateTime dateTime21 = interval10.getStart();
        org.joda.time.Duration duration22 = interval10.toDuration();
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        java.lang.Object obj26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(obj26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration27);
        boolean boolean29 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        org.joda.time.Interval interval32 = interval31.toInterval();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType35);
        mutablePeriod36.setYears(0);
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod36.setPeriod((org.joda.time.ReadableDuration) duration40, chronology41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        java.lang.Object obj44 = null;
        org.joda.time.Duration duration45 = new org.joda.time.Duration(obj44);
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant43, (org.joda.time.ReadableDuration) duration45);
        org.joda.time.Duration duration48 = duration45.minus((long) '4');
        mutablePeriod36.add((org.joda.time.ReadableDuration) duration48);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType51 = periodType50.withHoursRemoved();
        org.joda.time.PeriodType periodType52 = periodType51.withSecondsRemoved();
        boolean boolean53 = mutablePeriod36.equals((java.lang.Object) periodType51);
        org.joda.time.Duration duration55 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant56 = null;
        java.lang.Object obj57 = null;
        org.joda.time.Duration duration58 = new org.joda.time.Duration(obj57);
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant56, (org.joda.time.ReadableDuration) duration58);
        boolean boolean60 = duration55.isShorterThan((org.joda.time.ReadableDuration) duration58);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Interval interval62 = duration58.toIntervalTo(readableInstant61);
        org.joda.time.Interval interval63 = interval62.toInterval();
        org.joda.time.Chronology chronology64 = interval63.getChronology();
        org.joda.time.Period period65 = new org.joda.time.Period((java.lang.Object) interval31, periodType51, chronology64);
        org.joda.time.PeriodType periodType66 = periodType51.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) (short) 1, (long) (byte) -1);
        org.joda.time.Duration duration73 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant74 = null;
        java.lang.Object obj75 = null;
        org.joda.time.Duration duration76 = new org.joda.time.Duration(obj75);
        org.joda.time.Period period77 = new org.joda.time.Period(readableInstant74, (org.joda.time.ReadableDuration) duration76);
        boolean boolean78 = duration73.isShorterThan((org.joda.time.ReadableDuration) duration76);
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.Interval interval80 = duration76.toIntervalTo(readableInstant79);
        org.joda.time.Interval interval81 = interval80.toInterval();
        org.joda.time.Chronology chronology82 = interval81.getChronology();
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((-1L), chronology82);
        mutablePeriod69.add(1644572099705L, chronology82);
        org.joda.time.Period period85 = duration22.toPeriod(periodType66, chronology82);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod(1644572149539L, chronology82);
        mutablePeriod86.clear();
        int int88 = mutablePeriod86.getMillis();
        int int89 = mutablePeriod86.getWeeks();
        int int90 = mutablePeriod86.size();
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 8 + "'", int90 == 8);
    }

    @Test
    public void test15619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15619");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.standard();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) (byte) 0, periodType2);
        int int4 = mutablePeriod3.getDays();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType7);
        mutablePeriod8.setYears(0);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology13 = null;
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration12, chronology13);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        java.lang.Object obj18 = null;
        org.joda.time.Duration duration19 = new org.joda.time.Duration(obj18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration19);
        boolean boolean21 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Interval interval23 = duration19.toIntervalTo(readableInstant22);
        org.joda.time.Interval interval24 = interval23.toInterval();
        org.joda.time.DateTime dateTime25 = interval24.getEnd();
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        java.lang.Object obj29 = null;
        org.joda.time.Duration duration30 = new org.joda.time.Duration(obj29);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration30);
        boolean boolean32 = duration27.isShorterThan((org.joda.time.ReadableDuration) duration30);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Interval interval34 = duration30.toIntervalTo(readableInstant33);
        org.joda.time.Interval interval35 = interval34.toInterval();
        org.joda.time.DateTime dateTime36 = interval35.getEnd();
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, (org.joda.time.ReadableInstant) dateTime25);
        java.lang.String str39 = dateTime25.toString();
        org.joda.time.Duration duration41 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType44);
        mutablePeriod45.setYears(0);
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology50 = null;
        mutablePeriod45.setPeriod((org.joda.time.ReadableDuration) duration49, chronology50);
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant54 = null;
        java.lang.Object obj55 = null;
        org.joda.time.Duration duration56 = new org.joda.time.Duration(obj55);
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, (org.joda.time.ReadableDuration) duration56);
        boolean boolean58 = duration53.isShorterThan((org.joda.time.ReadableDuration) duration56);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Interval interval60 = duration56.toIntervalTo(readableInstant59);
        org.joda.time.Interval interval61 = interval60.toInterval();
        org.joda.time.DateTime dateTime62 = interval61.getEnd();
        org.joda.time.Duration duration64 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant65 = null;
        java.lang.Object obj66 = null;
        org.joda.time.Duration duration67 = new org.joda.time.Duration(obj66);
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant65, (org.joda.time.ReadableDuration) duration67);
        boolean boolean69 = duration64.isShorterThan((org.joda.time.ReadableDuration) duration67);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Interval interval71 = duration67.toIntervalTo(readableInstant70);
        org.joda.time.Interval interval72 = interval71.toInterval();
        org.joda.time.DateTime dateTime73 = interval72.getEnd();
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime62, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration49, (org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.PeriodType periodType76 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period77 = duration41.toPeriodTo((org.joda.time.ReadableInstant) dateTime62, periodType76);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Duration duration79 = mutablePeriod3.toDurationFrom((org.joda.time.ReadableInstant) dateTime25);
        mutablePeriod3.setMinutes(134);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(dateTime36);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2022-02-11T09:44:30.890Z" + "'", str39, "2022-02-11T09:44:30.890Z");
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(periodType76);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(duration79);
    }

    @Test
    public void test15620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15620");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(33);
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test15621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15621");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1);
        org.joda.time.DurationFieldType durationFieldType4 = mutablePeriod2.getFieldType(1);
        org.joda.time.Hours hours5 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod2);
        mutablePeriod2.addHours(2147483647);
        int int8 = mutablePeriod2.getMonths();
        mutablePeriod2.addSeconds((-242));
        mutablePeriod2.setYears((-53));
        mutablePeriod2.addWeeks(916);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test15622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15622");
        org.joda.time.Period period1 = org.joda.time.Period.years(18);
        org.joda.time.Period period2 = period1.normalizedStandard();
        org.joda.time.Period period4 = period1.withWeeks((-648));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test15623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15623");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(1644572078660L);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(obj5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6);
        boolean boolean8 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.minutesIn(readableInterval10);
        java.lang.String str12 = minutes11.toString();
        org.joda.time.PeriodType periodType13 = minutes11.getPeriodType();
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant9, periodType13);
        org.joda.time.Duration duration16 = duration6.withMillis((long) 'a');
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        java.lang.Object obj20 = null;
        org.joda.time.Duration duration21 = new org.joda.time.Duration(obj20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration21);
        boolean boolean23 = duration18.isShorterThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        java.lang.Object obj27 = null;
        org.joda.time.Duration duration28 = new org.joda.time.Duration(obj27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration28);
        boolean boolean30 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Interval interval32 = duration28.toIntervalTo(readableInstant31);
        org.joda.time.Interval interval33 = interval32.toInterval();
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant37 = null;
        java.lang.Object obj38 = null;
        org.joda.time.Duration duration39 = new org.joda.time.Duration(obj38);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant37, (org.joda.time.ReadableDuration) duration39);
        boolean boolean41 = duration36.isShorterThan((org.joda.time.ReadableDuration) duration39);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Interval interval43 = duration39.toIntervalTo(readableInstant42);
        org.joda.time.Interval interval44 = interval43.toInterval();
        org.joda.time.DateTime dateTime45 = interval44.getEnd();
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant49 = null;
        java.lang.Object obj50 = null;
        org.joda.time.Duration duration51 = new org.joda.time.Duration(obj50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, (org.joda.time.ReadableDuration) duration51);
        boolean boolean53 = duration48.isShorterThan((org.joda.time.ReadableDuration) duration51);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.Minutes minutes56 = org.joda.time.Minutes.minutesIn(readableInterval55);
        java.lang.String str57 = minutes56.toString();
        org.joda.time.PeriodType periodType58 = minutes56.getPeriodType();
        org.joda.time.Period period59 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration51, readableInstant54, periodType58);
        org.joda.time.PeriodType periodType60 = periodType58.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, (org.joda.time.ReadableInstant) dateTime45, periodType60);
        org.joda.time.Duration duration63 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant64 = null;
        java.lang.Object obj65 = null;
        org.joda.time.Duration duration66 = new org.joda.time.Duration(obj65);
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant64, (org.joda.time.ReadableDuration) duration66);
        boolean boolean68 = duration63.isShorterThan((org.joda.time.ReadableDuration) duration66);
        org.joda.time.PeriodType periodType69 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((java.lang.Object) duration63, periodType69, chronology70);
        org.joda.time.Duration duration73 = org.joda.time.Duration.millis((long) '4');
        long long74 = duration73.getStandardDays();
        boolean boolean75 = duration63.isLongerThan((org.joda.time.ReadableDuration) duration73);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableDuration) duration73);
        org.joda.time.Interval interval77 = duration16.toIntervalTo((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Interval interval78 = duration1.toIntervalFrom((org.joda.time.ReadableInstant) dateTime45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes79 = duration1.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 98674324719600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT0M" + "'", str12, "PT0M");
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PT0M" + "'", str57, "PT0M");
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertNotNull(interval78);
    }

    @Test
    public void test15624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15624");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 10);
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = seconds2.plus((-1));
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        java.lang.String str7 = seconds6.toString();
        org.joda.time.Seconds seconds8 = seconds5.plus(seconds6);
        org.joda.time.Period period9 = period1.minus((org.joda.time.ReadablePeriod) seconds5);
        int int10 = seconds5.getSeconds();
        org.joda.time.Period period12 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period14 = period12.minusMillis((-1));
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Seconds seconds17 = seconds15.plus(36);
        int int18 = seconds5.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds15);
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds20 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType21 = seconds20.getFieldType();
        org.joda.time.Seconds seconds23 = seconds20.plus((-1));
        org.joda.time.Seconds seconds24 = org.joda.time.Seconds.TWO;
        java.lang.String str25 = seconds24.toString();
        org.joda.time.Seconds seconds26 = seconds23.plus(seconds24);
        org.joda.time.Seconds seconds27 = seconds19.minus(seconds24);
        org.joda.time.ReadableInterval readableInterval28 = null;
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.secondsIn(readableInterval28);
        org.joda.time.Seconds seconds30 = seconds24.plus(seconds29);
        org.joda.time.Seconds seconds31 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) seconds29);
        int int32 = seconds29.getSeconds();
        org.joda.time.Seconds seconds33 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds34 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType35 = seconds34.getFieldType();
        org.joda.time.Seconds seconds37 = seconds34.plus((-1));
        org.joda.time.Seconds seconds38 = org.joda.time.Seconds.TWO;
        java.lang.String str39 = seconds38.toString();
        org.joda.time.Seconds seconds40 = seconds37.plus(seconds38);
        org.joda.time.Seconds seconds41 = seconds33.minus(seconds38);
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.Seconds seconds43 = org.joda.time.Seconds.secondsIn(readableInterval42);
        org.joda.time.Seconds seconds44 = seconds38.plus(seconds43);
        boolean boolean45 = seconds29.isGreaterThan(seconds44);
        int int46 = seconds44.getSeconds();
        java.lang.String str47 = seconds44.toString();
        org.joda.time.Seconds seconds48 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds50 = seconds48.multipliedBy((int) (byte) 1);
        java.lang.String str51 = seconds48.toString();
        org.joda.time.PeriodType periodType52 = seconds48.getPeriodType();
        org.joda.time.Seconds seconds53 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType54 = seconds53.getFieldType();
        org.joda.time.Seconds seconds56 = seconds53.plus((-1));
        org.joda.time.Seconds seconds57 = org.joda.time.Seconds.TWO;
        java.lang.String str58 = seconds57.toString();
        org.joda.time.Seconds seconds59 = seconds56.plus(seconds57);
        org.joda.time.Seconds seconds60 = seconds48.minus(seconds56);
        org.joda.time.Seconds seconds61 = seconds44.minus(seconds56);
        org.joda.time.Seconds seconds62 = seconds15.minus(seconds44);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT2S" + "'", str7, "PT2S");
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT2S" + "'", str25, "PT2S");
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PT2S" + "'", str39, "PT2S");
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertNotNull(seconds41);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PT2S" + "'", str47, "PT2S");
        org.junit.Assert.assertNotNull(seconds48);
        org.junit.Assert.assertNotNull(seconds50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PT3S" + "'", str51, "PT3S");
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(seconds53);
        org.junit.Assert.assertNotNull(durationFieldType54);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertNotNull(seconds57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT2S" + "'", str58, "PT2S");
        org.junit.Assert.assertNotNull(seconds59);
        org.junit.Assert.assertNotNull(seconds60);
        org.junit.Assert.assertNotNull(seconds61);
        org.junit.Assert.assertNotNull(seconds62);
    }

    @Test
    public void test15625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15625");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType2 = seconds1.getFieldType();
        org.joda.time.Seconds seconds4 = seconds1.plus((-1));
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        java.lang.String str6 = seconds5.toString();
        org.joda.time.Seconds seconds7 = seconds4.plus(seconds5);
        org.joda.time.Seconds seconds8 = seconds0.minus(seconds5);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.secondsIn(readableInterval9);
        org.joda.time.Seconds seconds11 = seconds5.plus(seconds10);
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) seconds10);
        org.joda.time.Duration duration13 = seconds10.toStandardDuration();
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType16 = seconds15.getFieldType();
        org.joda.time.Seconds seconds18 = seconds15.plus((-1));
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.TWO;
        java.lang.String str20 = seconds19.toString();
        org.joda.time.Seconds seconds21 = seconds18.plus(seconds19);
        org.joda.time.Seconds seconds22 = seconds14.minus(seconds19);
        org.joda.time.Duration duration23 = seconds19.toStandardDuration();
        org.joda.time.Seconds seconds24 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType25 = seconds24.getFieldType();
        org.joda.time.Seconds seconds27 = seconds24.plus((-1));
        org.joda.time.Seconds seconds28 = org.joda.time.Seconds.TWO;
        java.lang.String str29 = seconds28.toString();
        org.joda.time.Seconds seconds30 = seconds27.plus(seconds28);
        org.joda.time.Seconds seconds32 = seconds30.multipliedBy(3);
        org.joda.time.Seconds seconds34 = seconds32.dividedBy(36);
        boolean boolean35 = seconds19.isGreaterThan(seconds34);
        org.joda.time.Seconds seconds37 = seconds34.plus(456368756);
        org.joda.time.Seconds seconds38 = seconds10.plus(seconds34);
        org.joda.time.Period period40 = org.joda.time.Period.millis((int) (short) -1);
        org.joda.time.Period period41 = period40.toPeriod();
        org.joda.time.Period period43 = period40.plusMonths(8);
        org.joda.time.Seconds seconds44 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period40);
        org.joda.time.Seconds seconds46 = seconds44.minus(32);
        org.joda.time.Seconds seconds47 = seconds10.plus(seconds44);
        int int48 = seconds10.getSeconds();
        org.joda.time.Period period49 = new org.joda.time.Period((java.lang.Object) seconds10);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT2S" + "'", str6, "PT2S");
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT2S" + "'", str20, "PT2S");
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT2S" + "'", str29, "PT2S");
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertNotNull(seconds46);
        org.junit.Assert.assertNotNull(seconds47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test15626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15626");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration7 = duration4.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration9 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration4, (int) (short) 1);
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration15 = duration12.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration17 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration15, (int) (short) 100);
        org.joda.time.Minutes minutes18 = duration15.toStandardMinutes();
        org.joda.time.Period period19 = duration15.toPeriod();
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardHours((long) (byte) 100);
        int int22 = duration15.compareTo((org.joda.time.ReadableDuration) duration21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        java.lang.Object obj24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(obj24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration25, readableInstant27);
        long long29 = duration25.getMillis();
        long long30 = duration25.getStandardDays();
        java.lang.String str31 = duration25.toString();
        boolean boolean32 = duration21.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Minutes minutes33 = duration25.toStandardMinutes();
        long long34 = duration25.getStandardSeconds();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT0S" + "'", str31, "PT0S");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test15627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15627");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(obj1);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant4);
        org.joda.time.Duration duration7 = org.joda.time.Duration.millis((long) '4');
        long long8 = duration7.getStandardDays();
        boolean boolean9 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration7);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.Period period12 = duration7.toPeriod(periodType10);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearMonthDayTime();
        boolean boolean14 = periodType10.equals((java.lang.Object) periodType13);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType17);
        mutablePeriod18.setYears(0);
        mutablePeriod18.setWeeks((int) (short) -1);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        java.lang.Object obj26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(obj26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration27);
        boolean boolean29 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        mutablePeriod18.setPeriod((org.joda.time.ReadableInterval) interval31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutablePeriod18.setPeriod(readableDuration33);
        int int35 = mutablePeriod18.size();
        org.joda.time.Duration duration37 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration39 = duration37.plus(1644572076849L);
        org.joda.time.Days days40 = duration37.toStandardDays();
        org.joda.time.Days days41 = org.joda.time.Days.ZERO;
        boolean boolean42 = days40.isGreaterThan(days41);
        org.joda.time.DurationFieldType durationFieldType43 = days40.getFieldType();
        mutablePeriod18.add(durationFieldType43, (int) (short) 1);
        java.lang.String str46 = durationFieldType43.getName();
        boolean boolean47 = periodType13.isSupported(durationFieldType43);
        org.joda.time.Period period58 = new org.joda.time.Period((int) (byte) 0, (int) (byte) 10, (int) (byte) 100, (int) (byte) 100);
        org.joda.time.Period period60 = period58.plusDays(1);
        org.joda.time.ReadableInstant readableInstant61 = null;
        java.lang.Object obj62 = null;
        org.joda.time.Duration duration63 = new org.joda.time.Duration(obj62);
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, (org.joda.time.ReadableDuration) duration63);
        org.joda.time.Days days65 = duration63.toStandardDays();
        org.joda.time.Days days66 = days65.negated();
        org.joda.time.Period period67 = period60.plus((org.joda.time.ReadablePeriod) days65);
        org.joda.time.Days days69 = days65.minus((int) (short) 1);
        org.joda.time.Days days73 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.PeriodType periodType74 = days73.getPeriodType();
        org.joda.time.Period period75 = new org.joda.time.Period((long) (-97), 1644572085189L, periodType74);
        org.joda.time.Period period76 = new org.joda.time.Period((java.lang.Object) days69, periodType74);
        org.joda.time.DurationFieldType durationFieldType78 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.Duration duration80 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant81 = null;
        java.lang.Object obj82 = null;
        org.joda.time.Duration duration83 = new org.joda.time.Duration(obj82);
        org.joda.time.Period period84 = new org.joda.time.Period(readableInstant81, (org.joda.time.ReadableDuration) duration83);
        boolean boolean85 = duration80.isShorterThan((org.joda.time.ReadableDuration) duration83);
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.Interval interval87 = duration83.toIntervalTo(readableInstant86);
        org.joda.time.Interval interval88 = interval87.toInterval();
        org.joda.time.Chronology chronology89 = interval88.getChronology();
        org.joda.time.DurationField durationField90 = durationFieldType78.getField(chronology89);
        org.joda.time.Period period91 = new org.joda.time.Period(36000L, chronology89);
        org.joda.time.Period period92 = new org.joda.time.Period(1644572116727L, 1644572113566L, periodType74, chronology89);
        org.joda.time.Period period93 = new org.joda.time.Period(1644572132349L, 1644572143465L, chronology89);
        org.joda.time.Period period94 = new org.joda.time.Period((long) 601, 1644572108183L, chronology89);
        boolean boolean95 = durationFieldType43.isSupported(chronology89);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "days" + "'", str46, "days");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(days65);
        org.junit.Assert.assertNotNull(days66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(days69);
        org.junit.Assert.assertNotNull(days73);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(interval87);
        org.junit.Assert.assertNotNull(interval88);
        org.junit.Assert.assertNotNull(chronology89);
        org.junit.Assert.assertNotNull(durationField90);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test15628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15628");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks2 = weeks0.minus(weeks1);
        org.joda.time.PeriodType periodType3 = weeks2.getPeriodType();
        org.joda.time.Weeks weeks5 = weeks2.minus((int) (short) -1);
        org.joda.time.Weeks weeks7 = weeks5.plus(0);
        int int8 = weeks7.size();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test15629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15629");
        org.joda.time.Period period1 = new org.joda.time.Period(1L);
        org.joda.time.Period period3 = period1.withYears((int) ' ');
        org.joda.time.Period period5 = period3.minusDays(9);
        org.joda.time.Period period7 = period5.withMillis((int) ' ');
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period7.toString(periodFormatter8);
        org.joda.time.Period period11 = period7.minusYears(90);
        org.joda.time.Period period13 = period7.minusSeconds((int) (short) 0);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        java.lang.Object obj17 = null;
        org.joda.time.Duration duration18 = new org.joda.time.Duration(obj17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration18);
        boolean boolean20 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Interval interval22 = duration18.toIntervalTo(readableInstant21);
        long long23 = interval22.getStartMillis();
        org.joda.time.Minutes minutes24 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.years();
        int int26 = minutes24.get(durationFieldType25);
        org.joda.time.Minutes minutes27 = minutes24.negated();
        org.joda.time.Minutes minutes29 = minutes24.multipliedBy((int) ' ');
        org.joda.time.PeriodType periodType30 = minutes24.getPeriodType();
        org.joda.time.Minutes minutes32 = minutes24.multipliedBy((int) '#');
        java.lang.String str33 = minutes24.toString();
        org.joda.time.Period period34 = period13.minus((org.joda.time.ReadablePeriod) minutes24);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P32Y-9DT0.032S" + "'", str9, "P32Y-9DT0.032S");
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(interval22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1644572671109L + "'", long23 == 1644572671109L);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PT0M" + "'", str33, "PT0M");
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test15630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15630");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.standard();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        java.lang.Object obj6 = null;
        org.joda.time.Duration duration7 = new org.joda.time.Duration(obj6);
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration7);
        boolean boolean9 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Interval interval11 = duration7.toIntervalTo(readableInstant10);
        org.joda.time.Interval interval12 = interval11.toInterval();
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) (byte) -1, 52L, periodType2, chronology13);
        mutablePeriod14.addSeconds(32);
        mutablePeriod14.add(10, 0, (int) (byte) -1, (int) (short) 0, (int) (byte) 10, (int) 'a', (int) '#', 10);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType29 = periodType28.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(periodType29);
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(10L, periodType29);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(10L, periodType29);
        int int33 = mutablePeriod32.getMonths();
        int int34 = mutablePeriod32.getHours();
        java.lang.Object obj35 = mutablePeriod32.clone();
        mutablePeriod14.add((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.MutablePeriod mutablePeriod37 = mutablePeriod14.copy();
        mutablePeriod37.addMonths((-617));
        mutablePeriod37.addYears(1015);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "P");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "P");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "P");
        org.junit.Assert.assertNotNull(mutablePeriod37);
    }

    @Test
    public void test15631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15631");
        org.joda.time.Period period8 = new org.joda.time.Period((-101), 0, (int) (byte) 1, 17, (-7), 21262214, (-22), 19034);
    }

    @Test
    public void test15632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15632");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withDaysRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test15633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15633");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType2);
        mutablePeriod3.setYears(0);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration7, chronology8);
        mutablePeriod3.add(0, (-1), (int) (short) 1, (int) (byte) 0, (int) (byte) 0, 1, 10, (int) '4');
        int int19 = mutablePeriod3.getYears();
        mutablePeriod3.addMonths((int) (short) 0);
        mutablePeriod3.addSeconds(0);
        mutablePeriod3.addSeconds((-1));
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType27 = periodType26.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(periodType26);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str30 = durationFieldType29.toString();
        boolean boolean31 = periodType26.isSupported(durationFieldType29);
        boolean boolean32 = mutablePeriod3.isSupported(durationFieldType29);
        mutablePeriod3.setMinutes((int) (short) 100);
        int int35 = mutablePeriod3.getYears();
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant38 = null;
        java.lang.Object obj39 = null;
        org.joda.time.Duration duration40 = new org.joda.time.Duration(obj39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, (org.joda.time.ReadableDuration) duration40);
        boolean boolean42 = duration37.isShorterThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Interval interval44 = duration40.toIntervalTo(readableInstant43);
        org.joda.time.Interval interval45 = interval44.toInterval();
        long long46 = interval44.toDurationMillis();
        org.joda.time.Interval interval47 = interval44.toInterval();
        long long48 = interval47.getStartMillis();
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant51 = null;
        java.lang.Object obj52 = null;
        org.joda.time.Duration duration53 = new org.joda.time.Duration(obj52);
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant51, (org.joda.time.ReadableDuration) duration53);
        boolean boolean55 = duration50.isShorterThan((org.joda.time.ReadableDuration) duration53);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Interval interval57 = duration53.toIntervalTo(readableInstant56);
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant60 = null;
        java.lang.Object obj61 = null;
        org.joda.time.Duration duration62 = new org.joda.time.Duration(obj61);
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, (org.joda.time.ReadableDuration) duration62);
        boolean boolean64 = duration59.isShorterThan((org.joda.time.ReadableDuration) duration62);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Interval interval66 = duration62.toIntervalTo(readableInstant65);
        org.joda.time.Interval interval67 = interval66.toInterval();
        org.joda.time.Hours hours68 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval67);
        org.joda.time.Hours hours69 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval67);
        boolean boolean70 = interval57.overlaps((org.joda.time.ReadableInterval) interval67);
        boolean boolean71 = interval47.isBefore((org.joda.time.ReadableInterval) interval57);
        mutablePeriod3.setPeriod((org.joda.time.ReadableInterval) interval57);
        org.joda.time.Hours hours73 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval57);
        org.joda.time.PeriodType periodType74 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period75 = interval57.toPeriod(periodType74);
        org.joda.time.DurationFieldType durationFieldType77 = periodType74.getFieldType((int) (short) 1);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "weeks" + "'", str30, "weeks");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(interval47);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1644572671174L + "'", long48 == 1644572671174L);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(hours68);
        org.junit.Assert.assertNotNull(hours69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(hours73);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(durationFieldType77);
    }

    @Test
    public void test15634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15634");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.Days days11 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval9);
        org.joda.time.Days days12 = days11.negated();
        org.joda.time.Days days14 = days12.plus((-52));
        org.joda.time.Days days16 = days14.plus((int) (short) 100);
        org.joda.time.Days days18 = days16.minus((-617));
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days18);
    }

    @Test
    public void test15635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15635");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(obj1);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant4);
        org.joda.time.Duration duration7 = org.joda.time.Duration.millis((long) '4');
        long long8 = duration7.getStandardDays();
        boolean boolean9 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration7);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        java.lang.Object obj13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(obj13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration14);
        boolean boolean16 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        java.lang.Object obj20 = null;
        org.joda.time.Duration duration21 = new org.joda.time.Duration(obj20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration21);
        boolean boolean23 = duration18.isShorterThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Interval interval25 = duration21.toIntervalTo(readableInstant24);
        org.joda.time.Interval interval26 = interval25.toInterval();
        org.joda.time.DateTime dateTime27 = interval26.getEnd();
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant30 = null;
        java.lang.Object obj31 = null;
        org.joda.time.Duration duration32 = new org.joda.time.Duration(obj31);
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant30, (org.joda.time.ReadableDuration) duration32);
        boolean boolean34 = duration29.isShorterThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Interval interval36 = duration32.toIntervalTo(readableInstant35);
        org.joda.time.Interval interval37 = interval36.toInterval();
        org.joda.time.DateTime dateTime38 = interval37.getEnd();
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Duration duration41 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant42 = null;
        java.lang.Object obj43 = null;
        org.joda.time.Duration duration44 = new org.joda.time.Duration(obj43);
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant42, (org.joda.time.ReadableDuration) duration44);
        boolean boolean46 = duration41.isShorterThan((org.joda.time.ReadableDuration) duration44);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.Minutes minutes49 = org.joda.time.Minutes.minutesIn(readableInterval48);
        java.lang.String str50 = minutes49.toString();
        org.joda.time.PeriodType periodType51 = minutes49.getPeriodType();
        org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration44, readableInstant47, periodType51);
        org.joda.time.PeriodType periodType53 = periodType51.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime38, periodType53);
        org.joda.time.Interval interval55 = duration2.toIntervalFrom((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType58);
        mutablePeriod59.setYears(0);
        org.joda.time.Duration duration63 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology64 = null;
        mutablePeriod59.setPeriod((org.joda.time.ReadableDuration) duration63, chronology64);
        org.joda.time.Duration duration67 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant68 = null;
        java.lang.Object obj69 = null;
        org.joda.time.Duration duration70 = new org.joda.time.Duration(obj69);
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant68, (org.joda.time.ReadableDuration) duration70);
        boolean boolean72 = duration67.isShorterThan((org.joda.time.ReadableDuration) duration70);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Interval interval74 = duration70.toIntervalTo(readableInstant73);
        org.joda.time.Interval interval75 = interval74.toInterval();
        org.joda.time.DateTime dateTime76 = interval75.getEnd();
        org.joda.time.Duration duration78 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant79 = null;
        java.lang.Object obj80 = null;
        org.joda.time.Duration duration81 = new org.joda.time.Duration(obj80);
        org.joda.time.Period period82 = new org.joda.time.Period(readableInstant79, (org.joda.time.ReadableDuration) duration81);
        boolean boolean83 = duration78.isShorterThan((org.joda.time.ReadableDuration) duration81);
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.Interval interval85 = duration81.toIntervalTo(readableInstant84);
        org.joda.time.Interval interval86 = interval85.toInterval();
        org.joda.time.DateTime dateTime87 = interval86.getEnd();
        org.joda.time.Period period88 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime76, (org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.Period period89 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration63, (org.joda.time.ReadableInstant) dateTime76);
        java.lang.String str90 = dateTime76.toString();
        org.joda.time.Period period91 = duration2.toPeriodTo((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.Period period92 = period91.toPeriod();
        org.joda.time.Period period94 = period92.withMinutes((-1));
        org.joda.time.Period period96 = period94.withWeeks(18);
        org.joda.time.PeriodType periodType97 = period96.getPeriodType();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PT0M" + "'", str50, "PT0M");
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(duration78);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(interval85);
        org.junit.Assert.assertNotNull(interval86);
        org.junit.Assert.assertNotNull(dateTime87);
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "2022-02-11T09:44:31.223Z" + "'", str90, "2022-02-11T09:44:31.223Z");
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(period96);
        org.junit.Assert.assertNotNull(periodType97);
    }

    @Test
    public void test15636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15636");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        java.lang.String str7 = period6.toString();
        org.joda.time.MutablePeriod mutablePeriod8 = period6.toMutablePeriod();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration13.toIntervalTo(readableInstant16);
        long long18 = interval17.getStartMillis();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Minutes minutes21 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType22 = minutes21.getFieldType();
        org.joda.time.Minutes minutes23 = minutes21.negated();
        org.joda.time.Minutes minutes25 = minutes23.minus((int) 'a');
        java.lang.String str26 = minutes23.toString();
        org.joda.time.Minutes minutes28 = minutes23.dividedBy((-963));
        org.joda.time.PeriodType periodType29 = minutes23.getPeriodType();
        org.joda.time.PeriodType periodType30 = minutes23.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(0, 2147483647, (int) (byte) 1, (-1), (int) (short) 0, 8, 100, (int) (byte) 0);
        mutablePeriod39.setSeconds((int) (byte) -1);
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant46 = null;
        java.lang.Object obj47 = null;
        org.joda.time.Duration duration48 = new org.joda.time.Duration(obj47);
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant46, (org.joda.time.ReadableDuration) duration48);
        boolean boolean50 = duration45.isShorterThan((org.joda.time.ReadableDuration) duration48);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Interval interval52 = duration48.toIntervalTo(readableInstant51);
        org.joda.time.Interval interval53 = interval52.toInterval();
        org.joda.time.Chronology chronology54 = interval52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(19033L, chronology54);
        mutablePeriod39.setPeriod(1644572254270L, chronology54);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod8, periodType30, chronology54);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.097S" + "'", str7, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644572671272L + "'", long18 == 1644572671272L);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT-10M" + "'", str26, "PT-10M");
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(chronology54);
    }

    @Test
    public void test15637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15637");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((-840));
        org.joda.time.PeriodType periodType2 = minutes1.getPeriodType();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test15638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15638");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((-840));
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test15639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15639");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((java.lang.Object) minutes0, periodType1);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.seconds();
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        java.lang.Object obj15 = null;
        org.joda.time.Duration duration16 = new org.joda.time.Duration(obj15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration16);
        boolean boolean18 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Interval interval20 = duration16.toIntervalTo(readableInstant19);
        org.joda.time.Interval interval21 = interval20.toInterval();
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((-1L), chronology22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(0L, (long) (short) -1, chronology22);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (byte) 100, periodType8, chronology22);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(1644572212149L, 0L, chronology22);
        org.joda.time.Period period27 = new org.joda.time.Period(1644572175055L, chronology22);
        mutablePeriod2.setPeriod(1644572578455L, chronology22);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test15640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15640");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) 0);
        org.joda.time.Hours hours2 = period1.toStandardHours();
        org.joda.time.Period period4 = org.joda.time.Period.years((int) (short) 10);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant7 = null;
        java.lang.Object obj8 = null;
        org.joda.time.Duration duration9 = new org.joda.time.Duration(obj8);
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration9);
        boolean boolean11 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Interval interval13 = duration9.toIntervalTo(readableInstant12);
        org.joda.time.Interval interval14 = interval13.toInterval();
        org.joda.time.Hours hours15 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval14);
        org.joda.time.Hours hours17 = hours15.dividedBy(1);
        boolean boolean18 = period4.equals((java.lang.Object) hours17);
        org.joda.time.Hours hours20 = hours17.minus(10);
        org.joda.time.Hours hours21 = hours2.plus(hours17);
        org.joda.time.ReadableInterval readableInterval22 = null;
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.minutesIn(readableInterval22);
        java.lang.String str24 = minutes23.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = hours17.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Hours cannot be compared to class org.joda.time.Minutes");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0M" + "'", str24, "PT0M");
    }

    @Test
    public void test15641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15641");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        long long9 = interval8.getStartMillis();
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.years();
        int int12 = minutes10.get(durationFieldType11);
        org.joda.time.Minutes minutes13 = minutes10.negated();
        org.joda.time.Duration duration14 = minutes10.toStandardDuration();
        java.lang.String str15 = minutes10.toString();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        java.lang.Object obj19 = null;
        org.joda.time.Duration duration20 = new org.joda.time.Duration(obj19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration20);
        boolean boolean22 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Interval interval24 = duration20.toIntervalTo(readableInstant23);
        org.joda.time.Duration duration27 = new org.joda.time.Duration((long) 'a', (long) 0);
        boolean boolean28 = duration20.equals((java.lang.Object) 'a');
        org.joda.time.Minutes minutes29 = duration20.toStandardMinutes();
        org.joda.time.Minutes minutes30 = minutes29.negated();
        org.joda.time.Duration duration33 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = duration33.toPeriodFrom(readableInstant34);
        org.joda.time.Period period37 = period35.minusSeconds((int) '4');
        org.joda.time.Minutes minutes38 = period35.toStandardMinutes();
        boolean boolean39 = minutes29.isLessThan(minutes38);
        org.joda.time.Minutes minutes41 = minutes29.minus((int) (short) 0);
        boolean boolean42 = minutes10.isGreaterThan(minutes41);
        org.joda.time.Minutes minutes43 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes44 = minutes43.negated();
        org.joda.time.DurationFieldType durationFieldType45 = minutes43.getFieldType();
        boolean boolean46 = minutes41.isGreaterThan(minutes43);
        org.joda.time.Minutes minutes48 = minutes43.multipliedBy(40);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1644572671348L + "'", long9 == 1644572671348L);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0M" + "'", str15, "PT0M");
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(minutes48);
    }

    @Test
    public void test15642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15642");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) '4');
        long long2 = duration1.getMillis();
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType5);
        mutablePeriod6.setYears(0);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod6.setPeriod((org.joda.time.ReadableDuration) duration10, chronology11);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        java.lang.Object obj16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(obj16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration17);
        boolean boolean19 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Interval interval21 = duration17.toIntervalTo(readableInstant20);
        org.joda.time.Interval interval22 = interval21.toInterval();
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        java.lang.Object obj27 = null;
        org.joda.time.Duration duration28 = new org.joda.time.Duration(obj27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration28);
        boolean boolean30 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Interval interval32 = duration28.toIntervalTo(readableInstant31);
        org.joda.time.Interval interval33 = interval32.toInterval();
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, (org.joda.time.ReadableInstant) dateTime23);
        java.lang.String str37 = dateTime23.toString();
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Period period40 = period38.minusHours(10);
        org.joda.time.Minutes minutes41 = period40.toStandardMinutes();
        org.joda.time.Minutes minutes42 = minutes41.negated();
        org.joda.time.Minutes minutes44 = minutes41.plus(30);
        org.joda.time.Minutes minutes46 = org.joda.time.Minutes.minutes((int) (byte) 10);
        boolean boolean47 = minutes44.isGreaterThan(minutes46);
        org.joda.time.Minutes minutes49 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType50 = minutes49.getFieldType();
        org.joda.time.Minutes minutes51 = minutes49.negated();
        org.joda.time.Minutes minutes53 = minutes51.minus((int) 'a');
        java.lang.String str54 = minutes51.toString();
        boolean boolean55 = minutes46.isLessThan(minutes51);
        org.joda.time.Minutes minutes57 = minutes46.dividedBy(3);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(dateTime34);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2022-02-11T09:44:31.367Z" + "'", str37, "2022-02-11T09:44:31.367Z");
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "PT-10M" + "'", str54, "PT-10M");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(minutes57);
    }

    @Test
    public void test15643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15643");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '4');
        org.joda.time.Minutes minutes7 = period4.toStandardMinutes();
        org.joda.time.Period period9 = period4.multipliedBy((int) (byte) 100);
        org.joda.time.Period period11 = period9.withHours((int) (short) 0);
        java.lang.String str12 = period9.toString();
        org.joda.time.Duration duration15 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = duration15.toPeriodFrom(readableInstant16);
        org.joda.time.Period period19 = period17.minusSeconds((int) '4');
        org.joda.time.Period period21 = period17.minusSeconds(10);
        org.joda.time.Period period22 = period17.normalizedStandard();
        org.joda.time.Period period23 = period9.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearDay();
        boolean boolean25 = period17.equals((java.lang.Object) periodType24);
        org.joda.time.Period period27 = period17.minusSeconds((-101));
        org.joda.time.Period period29 = period27.plusYears(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType31 = period27.getFieldType(134);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT-9.700S" + "'", str12, "PT-9.700S");
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test15644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15644");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT0S");
        org.joda.time.Duration duration3 = org.joda.time.Duration.millis((long) '4');
        long long4 = duration3.getMillis();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType7);
        mutablePeriod8.setYears(0);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology13 = null;
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration12, chronology13);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        java.lang.Object obj18 = null;
        org.joda.time.Duration duration19 = new org.joda.time.Duration(obj18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration19);
        boolean boolean21 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Interval interval23 = duration19.toIntervalTo(readableInstant22);
        org.joda.time.Interval interval24 = interval23.toInterval();
        org.joda.time.DateTime dateTime25 = interval24.getEnd();
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        java.lang.Object obj29 = null;
        org.joda.time.Duration duration30 = new org.joda.time.Duration(obj29);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration30);
        boolean boolean32 = duration27.isShorterThan((org.joda.time.ReadableDuration) duration30);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Interval interval34 = duration30.toIntervalTo(readableInstant33);
        org.joda.time.Interval interval35 = interval34.toInterval();
        org.joda.time.DateTime dateTime36 = interval35.getEnd();
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, (org.joda.time.ReadableInstant) dateTime25);
        java.lang.String str39 = dateTime25.toString();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration3, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant43 = null;
        java.lang.Object obj44 = null;
        org.joda.time.Duration duration45 = new org.joda.time.Duration(obj44);
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant43, (org.joda.time.ReadableDuration) duration45);
        boolean boolean47 = duration42.isShorterThan((org.joda.time.ReadableDuration) duration45);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Interval interval49 = duration45.toIntervalTo(readableInstant48);
        org.joda.time.Duration duration52 = new org.joda.time.Duration((long) 'a', (long) 0);
        boolean boolean53 = duration45.equals((java.lang.Object) 'a');
        org.joda.time.Minutes minutes54 = duration45.toStandardMinutes();
        org.joda.time.Duration duration55 = duration3.plus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Duration duration57 = duration3.minus((long) 100);
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration62 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration65 = duration62.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration67 = duration59.withDurationAdded((org.joda.time.ReadableDuration) duration62, (int) (short) 1);
        org.joda.time.Duration duration70 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration73 = duration70.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration75 = duration59.withDurationAdded((org.joda.time.ReadableDuration) duration73, (int) (short) 100);
        boolean boolean76 = duration57.isLongerThan((org.joda.time.ReadableDuration) duration59);
        mutablePeriod1.setPeriod((org.joda.time.ReadableDuration) duration57);
        int int78 = mutablePeriod1.size();
        mutablePeriod1.addMillis((int) (byte) 100);
        java.lang.Object obj81 = mutablePeriod1.clone();
        int int82 = mutablePeriod1.size();
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(dateTime36);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2022-02-11T09:44:31.417Z" + "'", str39, "2022-02-11T09:44:31.417Z");
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 8 + "'", int78 == 8);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertEquals(obj81.toString(), "PT0.052S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj81), "PT0.052S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj81), "PT0.052S");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 8 + "'", int82 == 8);
    }

    @Test
    public void test15645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15645");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) 0, (int) (byte) 10, (int) (byte) 100, (int) (byte) 100);
        org.joda.time.Period period6 = period4.plusDays(1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        java.lang.Object obj8 = null;
        org.joda.time.Duration duration9 = new org.joda.time.Duration(obj8);
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration9);
        org.joda.time.Days days11 = duration9.toStandardDays();
        org.joda.time.Days days12 = days11.negated();
        org.joda.time.Period period13 = period6.plus((org.joda.time.ReadablePeriod) days11);
        org.joda.time.Period period15 = period13.plusDays((-1));
        org.joda.time.Period period17 = period15.minusSeconds((int) ' ');
        int int18 = period17.getMonths();
        org.joda.time.Period period20 = period17.minusYears((-34));
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test15646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15646");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.Days days1 = org.joda.time.Days.ONE;
        org.joda.time.Days days2 = days1.negated();
        org.joda.time.Days days3 = org.joda.time.Days.ONE;
        org.joda.time.Days days4 = days3.negated();
        org.joda.time.Days days5 = org.joda.time.Days.ONE;
        org.joda.time.Days days6 = days5.negated();
        boolean boolean7 = days4.isGreaterThan(days6);
        org.joda.time.Days days8 = days1.plus(days6);
        boolean boolean9 = days0.isLessThan(days6);
        org.joda.time.MutablePeriod mutablePeriod10 = days0.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType11 = days0.getFieldType();
        org.joda.time.DurationFieldType durationFieldType12 = days0.getFieldType();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test15647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15647");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.ZERO;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.DurationFieldType durationFieldType3 = hours1.getFieldType();
        org.joda.time.Hours hours5 = org.joda.time.Hours.hours(0);
        boolean boolean6 = hours1.isLessThan(hours5);
        org.joda.time.Duration duration9 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = duration9.toPeriodFrom(readableInstant10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = duration9.toPeriod(chronology12);
        org.joda.time.Period period15 = period13.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.Hours hours17 = org.joda.time.Hours.hoursIn(readableInterval16);
        org.joda.time.Period period18 = period15.minus((org.joda.time.ReadablePeriod) hours17);
        org.joda.time.Hours hours19 = hours17.negated();
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = duration22.toPeriodFrom(readableInstant23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = duration22.toPeriod(chronology25);
        org.joda.time.Period period28 = period26.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.Hours hours30 = org.joda.time.Hours.hoursIn(readableInterval29);
        org.joda.time.Period period31 = period28.minus((org.joda.time.ReadablePeriod) hours30);
        org.joda.time.Hours hours32 = hours30.negated();
        org.joda.time.Hours hours33 = hours17.minus(hours30);
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        java.lang.Object obj37 = null;
        org.joda.time.Duration duration38 = new org.joda.time.Duration(obj37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration38);
        boolean boolean40 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Interval interval42 = duration38.toIntervalTo(readableInstant41);
        org.joda.time.Interval interval43 = interval42.toInterval();
        org.joda.time.Hours hours44 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval43);
        boolean boolean45 = hours30.isLessThan(hours44);
        org.joda.time.Hours hours47 = hours30.plus(35);
        org.joda.time.Hours hours49 = org.joda.time.Hours.hours(0);
        org.joda.time.Hours hours50 = hours47.plus(hours49);
        org.joda.time.Hours hours51 = hours5.plus(hours50);
        org.joda.time.Hours hours53 = hours5.plus((-2147483648));
        org.joda.time.PeriodType periodType54 = hours5.getPeriodType();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(hours44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(hours47);
        org.junit.Assert.assertNotNull(hours49);
        org.junit.Assert.assertNotNull(hours50);
        org.junit.Assert.assertNotNull(hours51);
        org.junit.Assert.assertNotNull(hours53);
        org.junit.Assert.assertNotNull(periodType54);
    }

    @Test
    public void test15648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15648");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, 1644572077926L, chronology2);
        org.joda.time.Period period5 = period3.plusHours((int) (short) 10);
        org.joda.time.Period period7 = period5.multipliedBy((int) (short) 1);
        org.joda.time.Period period9 = period5.withSeconds(298);
        org.joda.time.Period period11 = period9.withMonths(456368756);
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        java.lang.Object obj15 = null;
        org.joda.time.Duration duration16 = new org.joda.time.Duration(obj15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration16);
        boolean boolean18 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Interval interval20 = duration16.toIntervalTo(readableInstant19);
        org.joda.time.Interval interval21 = interval20.toInterval();
        org.joda.time.DateTime dateTime22 = interval21.getEnd();
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        java.lang.Object obj27 = null;
        org.joda.time.Duration duration28 = new org.joda.time.Duration(obj27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration28);
        boolean boolean30 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Interval interval32 = duration28.toIntervalTo(readableInstant31);
        org.joda.time.Interval interval33 = interval32.toInterval();
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant37 = null;
        java.lang.Object obj38 = null;
        org.joda.time.Duration duration39 = new org.joda.time.Duration(obj38);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant37, (org.joda.time.ReadableDuration) duration39);
        boolean boolean41 = duration36.isShorterThan((org.joda.time.ReadableDuration) duration39);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Interval interval43 = duration39.toIntervalTo(readableInstant42);
        org.joda.time.Interval interval44 = interval43.toInterval();
        org.joda.time.DateTime dateTime45 = interval44.getEnd();
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime45);
        long long47 = dateTime45.getMillis();
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime45.getZone();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant23, (org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Duration duration50 = period11.toDurationTo((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardSeconds((-1L));
        org.joda.time.Duration duration54 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant55 = null;
        java.lang.Object obj56 = null;
        org.joda.time.Duration duration57 = new org.joda.time.Duration(obj56);
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant55, (org.joda.time.ReadableDuration) duration57);
        boolean boolean59 = duration54.isShorterThan((org.joda.time.ReadableDuration) duration57);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Interval interval61 = duration57.toIntervalTo(readableInstant60);
        long long62 = interval61.getStartMillis();
        org.joda.time.Duration duration64 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant65 = null;
        java.lang.Object obj66 = null;
        org.joda.time.Duration duration67 = new org.joda.time.Duration(obj66);
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant65, (org.joda.time.ReadableDuration) duration67);
        boolean boolean69 = duration64.isShorterThan((org.joda.time.ReadableDuration) duration67);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Interval interval71 = duration67.toIntervalTo(readableInstant70);
        org.joda.time.Interval interval72 = interval71.toInterval();
        org.joda.time.Hours hours73 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval72);
        org.joda.time.Hours hours74 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval72);
        boolean boolean75 = interval61.isBefore((org.joda.time.ReadableInterval) interval72);
        org.joda.time.DateTime dateTime76 = interval61.getStart();
        org.joda.time.Period period77 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration52, (org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.Chronology chronology78 = dateTime76.getChronology();
        boolean boolean79 = instant23.isAfter((org.joda.time.ReadableInstant) dateTime76);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTime45);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1644572671504L + "'", long47 == 1644572671504L);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(interval61);
// flaky:         org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1644572671504L + "'", long62 == 1644572671504L);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(hours73);
        org.junit.Assert.assertNotNull(hours74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test15649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15649");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(1644572091586L, chronology1);
        int int3 = period2.getMonths();
        org.joda.time.Hours hours4 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period2);
        org.joda.time.DurationFieldType[] durationFieldTypeArray5 = period2.getFieldTypes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldTypeArray5);
    }

    @Test
    public void test15650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15650");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-10886400));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test15651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15651");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(1644572088216L);
        org.joda.time.Duration duration3 = duration1.minus(1644572149218L);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = duration6.toPeriodFrom(readableInstant7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = duration6.toPeriod(chronology9);
        java.lang.String str11 = period10.toString();
        org.joda.time.MutablePeriod mutablePeriod12 = period10.toMutablePeriod();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        java.lang.Object obj16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(obj16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration17);
        boolean boolean19 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Interval interval21 = duration17.toIntervalTo(readableInstant20);
        long long22 = interval21.getStartMillis();
        mutablePeriod12.setPeriod((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Minutes minutes24 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval21);
        org.joda.time.DateTime dateTime25 = interval21.getStart();
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardSeconds(1644572105679L);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType29 = periodType28.withDaysRemoved();
        org.joda.time.PeriodType periodType30 = periodType29.withMinutesRemoved();
        int int31 = periodType29.size();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration27, periodType29);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration3, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Instant instant34 = dateTime25.toInstant();
        java.lang.String str35 = dateTime25.toString();
        org.joda.time.Duration duration37 = org.joda.time.Duration.millis(10L);
        java.lang.String str38 = duration37.toString();
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration37);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT0.097S" + "'", str11, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(interval21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1644572671584L + "'", long22 == 1644572671584L);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(instant34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2022-02-11T09:44:31.584Z" + "'", str35, "2022-02-11T09:44:31.584Z");
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PT0.010S" + "'", str38, "PT0.010S");
    }

    @Test
    public void test15652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15652");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        org.joda.time.Period period8 = period6.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn(readableInterval9);
        org.joda.time.Period period11 = period8.minus((org.joda.time.ReadablePeriod) hours10);
        org.joda.time.Hours hours13 = hours10.minus((int) '4');
        org.joda.time.Hours hours15 = hours13.plus((int) '#');
        org.joda.time.Hours hours16 = hours13.negated();
        org.joda.time.Duration duration17 = hours16.toStandardDuration();
        org.joda.time.Hours hours18 = hours16.negated();
        org.joda.time.Hours hours20 = hours16.dividedBy((-2147483648));
        org.joda.time.Hours hours22 = hours20.multipliedBy(0);
        org.joda.time.Hours hours24 = hours22.minus((-199));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours24);
    }

    @Test
    public void test15653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15653");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Duration duration6 = duration2.plus((-1L));
        org.joda.time.Duration duration7 = duration2.toDuration();
        org.joda.time.Duration duration9 = duration2.withMillis((long) 17);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        java.lang.Object obj13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(obj13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration14);
        boolean boolean16 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration14.toIntervalTo(readableInstant17);
        org.joda.time.Interval interval19 = interval18.toInterval();
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        java.lang.Object obj24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(obj24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration25);
        boolean boolean27 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Interval interval29 = duration25.toIntervalTo(readableInstant28);
        org.joda.time.Interval interval30 = interval29.toInterval();
        org.joda.time.DateTime dateTime31 = interval30.getEnd();
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        boolean boolean34 = dateTime20.isEqual(readableInstant33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        boolean boolean36 = dateTime20.isSupported(dateTimeFieldType35);
        org.joda.time.Duration duration38 = new org.joda.time.Duration(1644572076849L);
        long long39 = duration38.getStandardSeconds();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.Chronology chronology41 = dateTime20.getChronology();
        org.joda.time.Duration duration44 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Period period46 = duration44.toPeriodFrom(readableInstant45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = duration44.toPeriod(chronology47);
        org.joda.time.Period period50 = period48.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval51 = null;
        org.joda.time.Hours hours52 = org.joda.time.Hours.hoursIn(readableInterval51);
        org.joda.time.Period period53 = period50.minus((org.joda.time.ReadablePeriod) hours52);
        org.joda.time.Hours hours55 = hours52.minus((int) '4');
        org.joda.time.Hours hours57 = hours55.plus((int) (short) 10);
        org.joda.time.Duration duration60 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Period period62 = duration60.toPeriodFrom(readableInstant61);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Period period64 = duration60.toPeriod(chronology63);
        org.joda.time.Period period66 = period64.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval67 = null;
        org.joda.time.Hours hours68 = org.joda.time.Hours.hoursIn(readableInterval67);
        org.joda.time.Period period69 = period66.minus((org.joda.time.ReadablePeriod) hours68);
        org.joda.time.Hours hours70 = hours68.negated();
        org.joda.time.Duration duration73 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Period period75 = duration73.toPeriodFrom(readableInstant74);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.Period period77 = duration73.toPeriod(chronology76);
        org.joda.time.Period period79 = period77.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval80 = null;
        org.joda.time.Hours hours81 = org.joda.time.Hours.hoursIn(readableInterval80);
        org.joda.time.Period period82 = period79.minus((org.joda.time.ReadablePeriod) hours81);
        org.joda.time.Hours hours83 = hours81.negated();
        org.joda.time.Hours hours84 = hours68.minus(hours81);
        org.joda.time.Hours hours85 = hours57.minus(hours81);
        org.joda.time.Hours hours86 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours87 = org.joda.time.Hours.ZERO;
        org.joda.time.Hours hours88 = hours86.minus(hours87);
        org.joda.time.DurationFieldType durationFieldType89 = hours88.getFieldType();
        org.joda.time.Hours hours90 = hours81.minus(hours88);
        org.joda.time.PeriodType periodType91 = hours90.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration9, (org.joda.time.ReadableInstant) dateTime20, periodType91);
        org.joda.time.Hours hours93 = duration9.toStandardHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1644572076L + "'", long39 == 1644572076L);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(hours52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(hours55);
        org.junit.Assert.assertNotNull(hours57);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(hours68);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(hours70);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(hours81);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(hours83);
        org.junit.Assert.assertNotNull(hours84);
        org.junit.Assert.assertNotNull(hours85);
        org.junit.Assert.assertNotNull(hours86);
        org.junit.Assert.assertNotNull(hours87);
        org.junit.Assert.assertNotNull(hours88);
        org.junit.Assert.assertNotNull(durationFieldType89);
        org.junit.Assert.assertNotNull(hours90);
        org.junit.Assert.assertNotNull(periodType91);
        org.junit.Assert.assertNotNull(hours93);
    }

    @Test
    public void test15654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15654");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        java.lang.Object obj14 = null;
        org.joda.time.Duration duration15 = new org.joda.time.Duration(obj14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration15);
        boolean boolean17 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration15.toIntervalTo(readableInstant18);
        org.joda.time.Interval interval20 = interval19.toInterval();
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        java.lang.Object obj26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(obj26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration27);
        boolean boolean29 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        org.joda.time.Interval interval32 = interval31.toInterval();
        org.joda.time.DateTime dateTime33 = interval32.getEnd();
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        java.lang.Object obj37 = null;
        org.joda.time.Duration duration38 = new org.joda.time.Duration(obj37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration38);
        boolean boolean40 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Interval interval42 = duration38.toIntervalTo(readableInstant41);
        org.joda.time.Interval interval43 = interval42.toInterval();
        org.joda.time.DateTime dateTime44 = interval43.getEnd();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Minutes minutes46 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        boolean boolean48 = dateTime44.isSupported(dateTimeFieldType47);
        org.joda.time.Chronology chronology49 = dateTime44.getChronology();
        org.joda.time.ReadableInstant readableInstant50 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int51 = dateTime44.compareTo(readableInstant50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(chronology49);
    }

    @Test
    public void test15655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15655");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Duration duration11 = new org.joda.time.Duration((long) 'a', (long) 0);
        boolean boolean12 = duration4.equals((java.lang.Object) 'a');
        org.joda.time.Minutes minutes13 = duration4.toStandardMinutes();
        org.joda.time.Minutes minutes14 = minutes13.negated();
        org.joda.time.Duration duration17 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = duration17.toPeriodFrom(readableInstant18);
        org.joda.time.Period period21 = period19.minusSeconds((int) '4');
        org.joda.time.Minutes minutes22 = period19.toStandardMinutes();
        boolean boolean23 = minutes13.isLessThan(minutes22);
        org.joda.time.Minutes minutes25 = minutes13.minus((int) (short) 0);
        org.joda.time.Minutes minutes27 = minutes13.plus(100);
        org.joda.time.Duration duration30 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = duration30.toPeriodFrom(readableInstant31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = duration30.toPeriod(chronology33);
        org.joda.time.Period period36 = period34.minusYears((int) (byte) -1);
        org.joda.time.Minutes minutes38 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType39 = minutes38.getFieldType();
        org.joda.time.Period period40 = period34.minus((org.joda.time.ReadablePeriod) minutes38);
        org.joda.time.Minutes minutes41 = minutes27.plus(minutes38);
        org.joda.time.Duration duration42 = minutes41.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType43 = minutes41.getFieldType();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(durationFieldType43);
    }

    @Test
    public void test15656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15656");
        org.joda.time.Period period1 = org.joda.time.Period.days(903);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test15657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15657");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        java.lang.String str7 = period6.toString();
        org.joda.time.MutablePeriod mutablePeriod8 = period6.toMutablePeriod();
        java.lang.Object obj9 = mutablePeriod8.clone();
        int int10 = mutablePeriod8.getHours();
        org.joda.time.PeriodType periodType11 = mutablePeriod8.getPeriodType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray12 = mutablePeriod8.getFieldTypes();
        org.joda.time.PeriodType periodType13 = mutablePeriod8.getPeriodType();
        int int14 = mutablePeriod8.getHours();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = mutablePeriod8.getValue(31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.097S" + "'", str7, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "PT0.097S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "PT0.097S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "PT0.097S");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldTypeArray12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test15658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15658");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) (byte) -1);
        org.joda.time.Days days3 = days1.dividedBy(97);
        org.joda.time.Duration duration4 = days3.toStandardDuration();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(1644572098650L, periodType7, chronology9);
        org.joda.time.PeriodType periodType11 = mutablePeriod10.getPeriodType();
        org.joda.time.PeriodType periodType12 = mutablePeriod10.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) days3, periodType12);
        org.joda.time.Days days14 = org.joda.time.Days.ONE;
        org.joda.time.Days days15 = days14.negated();
        org.joda.time.Days days16 = org.joda.time.Days.ONE;
        org.joda.time.Days days17 = days16.negated();
        boolean boolean18 = days15.isGreaterThan(days17);
        org.joda.time.Days days20 = days17.plus((int) (short) 10);
        boolean boolean21 = days3.isGreaterThan(days17);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test15659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15659");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.Days days3 = days2.negated();
        org.joda.time.Days days4 = org.joda.time.Days.ONE;
        org.joda.time.Days days5 = days4.negated();
        boolean boolean6 = days3.isGreaterThan(days5);
        org.joda.time.Days days7 = days0.plus(days5);
        java.lang.String str8 = days5.toString();
        org.joda.time.DurationFieldType durationFieldType9 = days5.getFieldType();
        org.joda.time.PeriodType periodType10 = days5.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withDaysRemoved();
        java.lang.String str12 = periodType10.getName();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P-1D" + "'", str8, "P-1D");
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Days" + "'", str12, "Days");
    }

    @Test
    public void test15660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15660");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration13.toIntervalTo(readableInstant16);
        org.joda.time.Interval interval18 = interval17.toInterval();
        org.joda.time.Hours hours19 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Hours hours20 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval18);
        boolean boolean21 = interval8.overlaps((org.joda.time.ReadableInterval) interval18);
        org.joda.time.MutableInterval mutableInterval22 = interval8.toMutableInterval();
        long long23 = interval8.getEndMillis();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        java.lang.Object obj27 = null;
        org.joda.time.Duration duration28 = new org.joda.time.Duration(obj27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration28);
        boolean boolean30 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Interval interval32 = duration28.toIntervalTo(readableInstant31);
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant35 = null;
        java.lang.Object obj36 = null;
        org.joda.time.Duration duration37 = new org.joda.time.Duration(obj36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant35, (org.joda.time.ReadableDuration) duration37);
        boolean boolean39 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration37);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Interval interval41 = duration37.toIntervalTo(readableInstant40);
        org.joda.time.Interval interval42 = interval41.toInterval();
        org.joda.time.Hours hours43 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval42);
        org.joda.time.Hours hours44 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval42);
        boolean boolean45 = interval32.overlaps((org.joda.time.ReadableInterval) interval42);
        org.joda.time.DateTime dateTime46 = interval32.getStart();
        org.joda.time.MutableInterval mutableInterval47 = interval32.toMutableInterval();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(1644572088907L, (long) 3);
        boolean boolean51 = interval32.equals((java.lang.Object) 3);
        boolean boolean52 = interval8.isBefore((org.joda.time.ReadableInterval) interval32);
        org.joda.time.ReadableInstant readableInstant53 = null;
        boolean boolean54 = interval8.isBefore(readableInstant53);
        java.lang.String str55 = interval8.toString();
        org.joda.time.MutableInterval mutableInterval56 = interval8.toMutableInterval();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(mutableInterval22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1644572671782L + "'", long23 == 1644572671782L);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(hours43);
        org.junit.Assert.assertNotNull(hours44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(mutableInterval47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "2022-02-11T09:44:31.782Z/2022-02-11T09:44:31.782Z" + "'", str55, "2022-02-11T09:44:31.782Z/2022-02-11T09:44:31.782Z");
        org.junit.Assert.assertNotNull(mutableInterval56);
    }

    @Test
    public void test15661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15661");
        org.joda.time.Period period1 = org.joda.time.Period.millis(1);
        org.joda.time.Period period3 = period1.minusMinutes((int) (short) -1);
        org.joda.time.Period period5 = period3.withDays(10);
        org.joda.time.Period period7 = period3.minusMonths(52);
        org.joda.time.Period period8 = period7.normalizedStandard();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test15662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15662");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(4);
        org.joda.time.Days days2 = minutes1.toStandardDays();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test15663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15663");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType2);
        mutablePeriod3.setYears(0);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration7, chronology8);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        java.lang.Object obj13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(obj13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration14);
        boolean boolean16 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration14.toIntervalTo(readableInstant17);
        org.joda.time.Interval interval19 = interval18.toInterval();
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        java.lang.Object obj24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(obj24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration25);
        boolean boolean27 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Interval interval29 = duration25.toIntervalTo(readableInstant28);
        org.joda.time.Interval interval30 = interval29.toInterval();
        org.joda.time.DateTime dateTime31 = interval30.getEnd();
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, (org.joda.time.ReadableInstant) dateTime20);
        int int34 = period33.getHours();
        org.joda.time.Minutes minutes37 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes39 = minutes37.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType40 = minutes39.getPeriodType();
        org.joda.time.PeriodType periodType41 = periodType40.withYearsRemoved();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#', periodType40, chronology42);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType40);
        org.joda.time.Period period45 = period33.normalizedStandard(periodType40);
        org.joda.time.Period period46 = period45.toPeriod();
        org.joda.time.Period period47 = period46.toPeriod();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period47);
    }

    @Test
    public void test15664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15664");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType2 = seconds1.getFieldType();
        org.joda.time.Seconds seconds4 = seconds1.plus((-1));
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        java.lang.String str6 = seconds5.toString();
        org.joda.time.Seconds seconds7 = seconds4.plus(seconds5);
        org.joda.time.Seconds seconds8 = seconds0.minus(seconds5);
        org.joda.time.Seconds seconds10 = seconds5.dividedBy((-4));
        org.joda.time.Seconds seconds11 = seconds5.negated();
        org.joda.time.Seconds seconds13 = seconds5.minus((int) (byte) 10);
        org.joda.time.Seconds seconds15 = seconds5.minus((int) (byte) 0);
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds18 = seconds16.multipliedBy((int) (byte) 1);
        java.lang.String str19 = seconds16.toString();
        org.joda.time.PeriodType periodType20 = seconds16.getPeriodType();
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType22 = seconds21.getFieldType();
        org.joda.time.Seconds seconds24 = seconds21.plus((-1));
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.TWO;
        java.lang.String str26 = seconds25.toString();
        org.joda.time.Seconds seconds27 = seconds24.plus(seconds25);
        org.joda.time.Seconds seconds28 = seconds16.minus(seconds24);
        java.lang.String str29 = seconds16.toString();
        org.joda.time.DurationFieldType durationFieldType30 = seconds16.getFieldType();
        org.joda.time.Duration duration33 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration36 = duration33.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration38 = org.joda.time.Duration.millis((long) '4');
        long long39 = duration38.getMillis();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType42);
        mutablePeriod43.setYears(0);
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology48 = null;
        mutablePeriod43.setPeriod((org.joda.time.ReadableDuration) duration47, chronology48);
        org.joda.time.Duration duration51 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant52 = null;
        java.lang.Object obj53 = null;
        org.joda.time.Duration duration54 = new org.joda.time.Duration(obj53);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant52, (org.joda.time.ReadableDuration) duration54);
        boolean boolean56 = duration51.isShorterThan((org.joda.time.ReadableDuration) duration54);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Interval interval58 = duration54.toIntervalTo(readableInstant57);
        org.joda.time.Interval interval59 = interval58.toInterval();
        org.joda.time.DateTime dateTime60 = interval59.getEnd();
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant63 = null;
        java.lang.Object obj64 = null;
        org.joda.time.Duration duration65 = new org.joda.time.Duration(obj64);
        org.joda.time.Period period66 = new org.joda.time.Period(readableInstant63, (org.joda.time.ReadableDuration) duration65);
        boolean boolean67 = duration62.isShorterThan((org.joda.time.ReadableDuration) duration65);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Interval interval69 = duration65.toIntervalTo(readableInstant68);
        org.joda.time.Interval interval70 = interval69.toInterval();
        org.joda.time.DateTime dateTime71 = interval70.getEnd();
        org.joda.time.Period period72 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime60, (org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration47, (org.joda.time.ReadableInstant) dateTime60);
        java.lang.String str74 = dateTime60.toString();
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Period period76 = duration36.toPeriodTo((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Seconds seconds77 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType78 = seconds77.getFieldType();
        org.joda.time.Seconds seconds80 = seconds77.plus((-1));
        boolean boolean81 = duration36.equals((java.lang.Object) seconds77);
        org.joda.time.Seconds seconds82 = org.joda.time.Seconds.MAX_VALUE;
        org.joda.time.PeriodType periodType83 = seconds82.getPeriodType();
        org.joda.time.Seconds seconds84 = seconds77.minus(seconds82);
        boolean boolean85 = seconds16.isGreaterThan(seconds84);
        boolean boolean86 = seconds15.isLessThan(seconds84);
        org.joda.time.Seconds seconds88 = seconds15.dividedBy((-48));
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT2S" + "'", str6, "PT2S");
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT3S" + "'", str19, "PT3S");
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT2S" + "'", str26, "PT2S");
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT3S" + "'", str29, "PT3S");
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 52L + "'", long39 == 52L);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(dateTime71);
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "2022-02-11T09:44:31.857Z" + "'", str74, "2022-02-11T09:44:31.857Z");
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(seconds77);
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertNotNull(seconds80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(seconds82);
        org.junit.Assert.assertNotNull(periodType83);
        org.junit.Assert.assertNotNull(seconds84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(seconds88);
    }

    @Test
    public void test15665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15665");
        org.joda.time.Period period1 = new org.joda.time.Period(1L);
        org.joda.time.Period period3 = period1.minusMonths((-101));
        org.joda.time.Period period5 = period1.plusMillis(3);
        org.joda.time.Period period7 = period5.multipliedBy(2);
        org.joda.time.Period period9 = period5.plusWeeks((-2147483648));
        org.joda.time.Weeks weeks10 = period5.toStandardWeeks();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(weeks10);
    }

    @Test
    public void test15666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15666");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks2 = weeks0.plus((int) '4');
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks5 = weeks3.minus(weeks4);
        org.joda.time.Weeks weeks6 = weeks0.minus(weeks3);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.millis();
        java.lang.String str8 = durationFieldType7.toString();
        int int9 = weeks0.get(durationFieldType7);
        java.lang.String str10 = durationFieldType7.toString();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "millis" + "'", str8, "millis");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "millis" + "'", str10, "millis");
    }

    @Test
    public void test15667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15667");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.Days days3 = days2.negated();
        boolean boolean4 = days1.isGreaterThan(days3);
        org.joda.time.DurationFieldType durationFieldType5 = days1.getFieldType();
        org.joda.time.Days days7 = days1.multipliedBy((int) (short) 1);
        org.joda.time.Days days9 = days7.plus((-10));
        org.joda.time.Duration duration11 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Duration duration15 = duration11.withDurationAdded(100L, 10);
        org.joda.time.Days days16 = duration15.toStandardDays();
        org.joda.time.Days days17 = org.joda.time.Days.FOUR;
        org.joda.time.Days days18 = org.joda.time.Days.ONE;
        org.joda.time.Days days19 = days18.negated();
        org.joda.time.Days days20 = org.joda.time.Days.ONE;
        org.joda.time.Days days21 = days20.negated();
        org.joda.time.Days days22 = org.joda.time.Days.ONE;
        org.joda.time.Days days23 = days22.negated();
        boolean boolean24 = days21.isGreaterThan(days23);
        org.joda.time.Days days25 = days18.plus(days23);
        org.joda.time.Days days26 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days18);
        org.joda.time.Days days28 = days18.plus((-1));
        org.joda.time.Days days29 = days17.plus(days18);
        org.joda.time.Days days30 = days16.minus(days18);
        org.joda.time.Days days32 = days18.multipliedBy((-35));
        boolean boolean33 = days7.isLessThan(days18);
        org.joda.time.Days days35 = days7.plus(0);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(days35);
    }

    @Test
    public void test15668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15668");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) 0, (int) (byte) 10, (int) (byte) 100, (int) (byte) 100);
        org.joda.time.Period period6 = period4.withWeeks((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Duration duration10 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = duration10.toPeriodFrom(readableInstant11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = duration10.toPeriod(chronology13);
        org.joda.time.Period period16 = period14.minusYears((int) (byte) -1);
        org.joda.time.Period period18 = period16.minusHours(3);
        org.joda.time.Period period19 = period6.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period21 = period18.withWeeks((-52));
        org.joda.time.Period period23 = new org.joda.time.Period(1L);
        org.joda.time.Weeks weeks25 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Period period26 = period23.plus((org.joda.time.ReadablePeriod) weeks25);
        int int27 = period26.getMinutes();
        int[] intArray28 = period26.getValues();
        org.joda.time.Weeks weeks29 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period31 = period26.withDays((-101));
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period34 = period31.withFieldAdded(durationFieldType32, 1);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant39 = null;
        java.lang.Object obj40 = null;
        org.joda.time.Duration duration41 = new org.joda.time.Duration(obj40);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, (org.joda.time.ReadableDuration) duration41);
        boolean boolean43 = duration38.isShorterThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Interval interval45 = duration41.toIntervalTo(readableInstant44);
        org.joda.time.Interval interval46 = interval45.toInterval();
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.DurationField durationField48 = durationFieldType36.getField(chronology47);
        org.joda.time.Period period49 = new org.joda.time.Period(36000L, chronology47);
        org.joda.time.DurationField durationField50 = durationFieldType32.getField(chronology47);
        int int51 = period18.indexOf(durationFieldType32);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, -1, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 7 + "'", int51 == 7);
    }

    @Test
    public void test15669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15669");
        org.joda.time.Period period1 = org.joda.time.Period.years(18);
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.joda.time.Period period4 = period1.withDays(97);
        org.joda.time.Period period6 = period1.plusSeconds(2);
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks9 = weeks8.negated();
        org.joda.time.Weeks weeks10 = weeks9.negated();
        org.joda.time.Weeks weeks12 = weeks9.plus((int) ' ');
        org.joda.time.Weeks weeks13 = weeks12.negated();
        org.joda.time.PeriodType periodType14 = weeks12.getPeriodType();
        java.lang.String str15 = weeks12.toString();
        org.joda.time.DurationFieldType durationFieldType16 = weeks12.getFieldType();
        boolean boolean17 = period6.isSupported(durationFieldType16);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P33W" + "'", str15, "P33W");
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test15670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15670");
        org.joda.time.Period period4 = new org.joda.time.Period(18, 0, (-3), 10);
        org.joda.time.Period period6 = period4.withHours((-97));
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test15671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15671");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Duration duration11 = new org.joda.time.Duration((long) 'a', (long) 0);
        boolean boolean12 = duration4.equals((java.lang.Object) 'a');
        org.joda.time.Minutes minutes13 = duration4.toStandardMinutes();
        org.joda.time.Minutes minutes15 = minutes13.multipliedBy((int) '4');
        org.joda.time.Minutes minutes17 = minutes15.multipliedBy((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType19 = minutes15.getFieldType((int) (short) 0);
        org.joda.time.Minutes minutes21 = minutes15.dividedBy(2147483647);
        int int22 = minutes21.getMinutes();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test15672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15672");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '4');
        org.joda.time.Minutes minutes7 = period4.toStandardMinutes();
        org.joda.time.Period period9 = period4.multipliedBy((int) (byte) 100);
        org.joda.time.Period period11 = period9.withHours((int) (short) 0);
        java.lang.String str12 = period9.toString();
        org.joda.time.Duration duration15 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = duration15.toPeriodFrom(readableInstant16);
        org.joda.time.Period period19 = period17.minusSeconds((int) '4');
        org.joda.time.Period period21 = period17.minusSeconds(10);
        org.joda.time.Period period22 = period17.normalizedStandard();
        org.joda.time.Period period23 = period9.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearDay();
        boolean boolean25 = period17.equals((java.lang.Object) periodType24);
        org.joda.time.Period period27 = period17.minusSeconds((-101));
        int int28 = period17.getMillis();
        org.joda.time.Period period29 = period17.toPeriod();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT-9.700S" + "'", str12, "PT-9.700S");
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-97) + "'", int28 == (-97));
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test15673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15673");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType8);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType12);
        mutablePeriod13.setYears(0);
        mutablePeriod9.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        mutablePeriod13.setWeeks((int) (byte) 10);
        mutablePeriod13.add((long) 8);
        mutablePeriod13.setMinutes(34);
        org.joda.time.Duration duration25 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = duration25.toPeriodFrom(readableInstant26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = duration25.toPeriod(chronology28);
        java.lang.String str30 = period29.toString();
        org.joda.time.MutablePeriod mutablePeriod31 = period29.toMutablePeriod();
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant34 = null;
        java.lang.Object obj35 = null;
        org.joda.time.Duration duration36 = new org.joda.time.Duration(obj35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration36);
        boolean boolean38 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration36);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Interval interval40 = duration36.toIntervalTo(readableInstant39);
        long long41 = interval40.getStartMillis();
        mutablePeriod31.setPeriod((org.joda.time.ReadableInterval) interval40);
        org.joda.time.Minutes minutes43 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval40);
        org.joda.time.Minutes minutes45 = minutes43.dividedBy((int) (short) 1);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType48 = periodType47.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(periodType48);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(10L, periodType48);
        int int51 = mutablePeriod50.getMillis();
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration56 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration59 = duration56.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration61 = duration53.withDurationAdded((org.joda.time.ReadableDuration) duration56, (int) (short) 1);
        org.joda.time.Duration duration64 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration67 = duration64.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration69 = duration53.withDurationAdded((org.joda.time.ReadableDuration) duration67, (int) (short) 100);
        mutablePeriod50.add((org.joda.time.ReadableDuration) duration69);
        org.joda.time.Minutes minutes71 = duration69.toStandardMinutes();
        boolean boolean72 = minutes45.isLessThan(minutes71);
        org.joda.time.Minutes minutes74 = minutes71.multipliedBy(54);
        org.joda.time.Duration duration76 = org.joda.time.Duration.millis((long) '4');
        long long77 = duration76.getMillis();
        org.joda.time.Minutes minutes78 = duration76.toStandardMinutes();
        org.joda.time.PeriodType periodType79 = minutes78.getPeriodType();
        org.joda.time.Minutes minutes81 = minutes78.dividedBy(727);
        org.joda.time.Duration duration82 = minutes81.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType83 = minutes81.getFieldType();
        boolean boolean84 = minutes71.isSupported(durationFieldType83);
        mutablePeriod13.add(durationFieldType83, (int) (short) 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT0.097S" + "'", str30, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(interval40);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1644572672043L + "'", long41 == 1644572672043L);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(minutes45);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(minutes71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(minutes74);
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 52L + "'", long77 == 52L);
        org.junit.Assert.assertNotNull(minutes78);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertNotNull(minutes81);
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertNotNull(durationFieldType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test15674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15674");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        java.lang.Object obj14 = null;
        org.joda.time.Duration duration15 = new org.joda.time.Duration(obj14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration15);
        boolean boolean17 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration15.toIntervalTo(readableInstant18);
        org.joda.time.Interval interval20 = interval19.toInterval();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        java.lang.Object obj24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(obj24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration25);
        boolean boolean27 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Interval interval29 = duration25.toIntervalTo(readableInstant28);
        boolean boolean30 = interval20.isAfter((org.joda.time.ReadableInterval) interval29);
        boolean boolean31 = interval9.contains((org.joda.time.ReadableInterval) interval20);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType34);
        mutablePeriod35.addMillis((-1));
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        java.lang.Object obj41 = null;
        org.joda.time.Duration duration42 = new org.joda.time.Duration(obj41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, (org.joda.time.ReadableDuration) duration42);
        boolean boolean44 = duration39.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Interval interval46 = duration42.toIntervalTo(readableInstant45);
        org.joda.time.Interval interval47 = interval46.toInterval();
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant50 = null;
        java.lang.Object obj51 = null;
        org.joda.time.Duration duration52 = new org.joda.time.Duration(obj51);
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant50, (org.joda.time.ReadableDuration) duration52);
        boolean boolean54 = duration49.isShorterThan((org.joda.time.ReadableDuration) duration52);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Interval interval56 = duration52.toIntervalTo(readableInstant55);
        boolean boolean57 = interval47.isAfter((org.joda.time.ReadableInterval) interval56);
        org.joda.time.Weeks weeks58 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval56);
        org.joda.time.Period period59 = interval56.toPeriod();
        mutablePeriod35.add((org.joda.time.ReadableInterval) interval56);
        long long61 = interval56.getEndMillis();
        boolean boolean62 = interval20.isAfter((org.joda.time.ReadableInterval) interval56);
        long long63 = interval56.getEndMillis();
        long long64 = interval56.getEndMillis();
        org.joda.time.Chronology chronology65 = interval56.getChronology();
        long long66 = interval56.getStartMillis();
        java.lang.String str67 = interval56.toString();
        org.joda.time.DateTime dateTime68 = interval56.getStart();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int70 = dateTime68.get(dateTimeFieldType69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(weeks58);
        org.junit.Assert.assertNotNull(period59);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1644572672080L + "'", long61 == 1644572672080L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1644572672080L + "'", long63 == 1644572672080L);
// flaky:         org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1644572672080L + "'", long64 == 1644572672080L);
        org.junit.Assert.assertNotNull(chronology65);
// flaky:         org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1644572672080L + "'", long66 == 1644572672080L);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "2022-02-11T09:44:32.080Z/2022-02-11T09:44:32.080Z" + "'", str67, "2022-02-11T09:44:32.080Z/2022-02-11T09:44:32.080Z");
        org.junit.Assert.assertNotNull(dateTime68);
    }

    @Test
    public void test15675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15675");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(906, (-6), 21, 19034);
    }

    @Test
    public void test15676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15676");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 8, 0L);
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        java.lang.Object obj6 = null;
        org.joda.time.Duration duration7 = new org.joda.time.Duration(obj6);
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration7);
        boolean boolean9 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Interval interval11 = duration7.toIntervalTo(readableInstant10);
        long long12 = interval11.getStartMillis();
        org.joda.time.DateTime dateTime13 = interval11.getStart();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        java.lang.Object obj17 = null;
        org.joda.time.Duration duration18 = new org.joda.time.Duration(obj17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration18);
        boolean boolean20 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Interval interval22 = duration18.toIntervalTo(readableInstant21);
        org.joda.time.Interval interval23 = interval22.toInterval();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        java.lang.Object obj27 = null;
        org.joda.time.Duration duration28 = new org.joda.time.Duration(obj27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration28);
        boolean boolean30 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Interval interval32 = duration28.toIntervalTo(readableInstant31);
        boolean boolean33 = interval23.isAfter((org.joda.time.ReadableInterval) interval32);
        org.joda.time.Weeks weeks34 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval32);
        org.joda.time.DateTime dateTime35 = interval32.getEnd();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime35);
        java.lang.Object obj37 = null;
        boolean boolean38 = dateTime13.equals(obj37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = dateTime13.isSupported(dateTimeFieldType39);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardMinutes(1644572165801L);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableDuration) duration42);
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration2, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Period period46 = period44.minusHours((-9551));
        org.joda.time.format.PeriodFormatter periodFormatter47 = null;
        java.lang.String str48 = period44.toString(periodFormatter47);
        java.lang.String str49 = period44.toString();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1644572672116L + "'", long12 == 1644572672116L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PT0.008S" + "'", str48, "PT0.008S");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PT0.008S" + "'", str49, "PT0.008S");
    }

    @Test
    public void test15677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15677");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType1 = seconds0.getFieldType();
        org.joda.time.Seconds seconds3 = seconds0.plus((-1));
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds6 = seconds4.multipliedBy((int) (byte) 1);
        int int7 = seconds6.size();
        org.joda.time.Period period9 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period11 = period9.minusMillis((-1));
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period11);
        boolean boolean13 = seconds6.isGreaterThan(seconds12);
        boolean boolean14 = seconds0.isGreaterThan(seconds6);
        org.joda.time.Seconds seconds16 = seconds0.multipliedBy(8);
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType19 = seconds18.getFieldType();
        org.joda.time.Seconds seconds21 = seconds18.plus((-1));
        org.joda.time.Seconds seconds22 = org.joda.time.Seconds.TWO;
        java.lang.String str23 = seconds22.toString();
        org.joda.time.Seconds seconds24 = seconds21.plus(seconds22);
        org.joda.time.Seconds seconds25 = seconds17.minus(seconds22);
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.Seconds seconds27 = org.joda.time.Seconds.secondsIn(readableInterval26);
        org.joda.time.Seconds seconds28 = seconds22.plus(seconds27);
        org.joda.time.Seconds seconds29 = seconds0.minus(seconds27);
        org.joda.time.PeriodType periodType30 = seconds29.getPeriodType();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT2S" + "'", str23, "PT2S");
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test15678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15678");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration7 = duration4.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration9 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration4, (int) (short) 1);
        org.joda.time.Days days10 = duration9.toStandardDays();
        org.joda.time.Days days11 = duration9.toStandardDays();
        long long12 = duration9.getStandardHours();
        org.joda.time.Duration duration14 = org.joda.time.Duration.millis((long) 36);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        java.lang.Object obj18 = null;
        org.joda.time.Duration duration19 = new org.joda.time.Duration(obj18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration19);
        boolean boolean21 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object) duration16, periodType22, chronology23);
        org.joda.time.Duration duration26 = org.joda.time.Duration.millis((long) '4');
        long long27 = duration26.getStandardDays();
        boolean boolean28 = duration16.isLongerThan((org.joda.time.ReadableDuration) duration26);
        long long29 = duration16.getMillis();
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        java.lang.Object obj33 = null;
        org.joda.time.Duration duration34 = new org.joda.time.Duration(obj33);
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, (org.joda.time.ReadableDuration) duration34);
        boolean boolean36 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Interval interval38 = duration34.toIntervalTo(readableInstant37);
        org.joda.time.Interval interval39 = interval38.toInterval();
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.Period period41 = duration16.toPeriod(chronology40);
        org.joda.time.Period period42 = duration14.toPeriod(chronology40);
        org.joda.time.Duration duration44 = duration9.withDurationAdded((org.joda.time.ReadableDuration) duration14, 601);
        org.joda.time.Duration duration47 = duration14.withDurationAdded(1644572650538L, 48);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 36000000L + "'", long29 == 36000000L);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration47);
    }

    @Test
    public void test15679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15679");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        java.lang.Object obj13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(obj13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration14);
        boolean boolean16 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration14.toIntervalTo(readableInstant17);
        boolean boolean19 = interval9.isAfter((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Period period20 = interval18.toPeriod();
        org.joda.time.Period period21 = interval18.toPeriod();
        org.joda.time.Duration duration24 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = duration24.toPeriodFrom(readableInstant25);
        org.joda.time.Period period28 = period26.minusSeconds((int) '4');
        org.joda.time.Period period30 = period26.minusSeconds(10);
        org.joda.time.Period period32 = period26.withWeeks((int) (byte) -1);
        org.joda.time.Period period33 = period21.plus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period35 = period33.withHours(9);
        org.joda.time.MutablePeriod mutablePeriod36 = period33.toMutablePeriod();
        org.joda.time.Seconds seconds37 = period33.toStandardSeconds();
        org.joda.time.Seconds seconds39 = seconds37.dividedBy(107);
        org.joda.time.Duration duration40 = seconds39.toStandardDuration();
        org.joda.time.Period period45 = new org.joda.time.Period((int) 'a', 727, (int) (short) 0, 187);
        org.joda.time.Period period47 = period45.plusDays((int) (byte) 0);
        boolean boolean48 = seconds39.equals((java.lang.Object) period47);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(mutablePeriod36);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test15680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15680");
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1);
        mutablePeriod3.addWeeks((int) (byte) 100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray6 = mutablePeriod3.getFieldTypes();
        mutablePeriod3.addMillis((int) 'a');
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod();
        mutablePeriod10.setPeriod(100L, (long) (-1));
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        java.lang.Object obj21 = null;
        org.joda.time.Duration duration22 = new org.joda.time.Duration(obj21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration22);
        boolean boolean24 = duration19.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Interval interval26 = duration22.toIntervalTo(readableInstant25);
        org.joda.time.Interval interval27 = interval26.toInterval();
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((-1L), chronology28);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(0L, (long) (short) -1, chronology28);
        mutablePeriod10.setPeriod((long) 100, chronology28);
        mutablePeriod3.setPeriod(1644572118718L, chronology28);
        org.joda.time.Period period33 = new org.joda.time.Period(1644572105679L, chronology28);
        org.joda.time.Weeks weeks35 = org.joda.time.Weeks.weeks((-2));
        org.joda.time.DurationFieldType durationFieldType36 = weeks35.getFieldType();
        int int37 = period33.get(durationFieldType36);
        org.joda.time.Period period42 = new org.joda.time.Period(0, 10, (int) (short) -1, (int) (byte) 1);
        org.joda.time.Period period44 = period42.withMillis((int) (short) 100);
        int int45 = period44.getDays();
        org.joda.time.Period period47 = period44.plusDays((int) (short) 100);
        org.joda.time.Period period49 = period47.withMillis((-963));
        org.joda.time.Weeks weeks50 = org.joda.time.Weeks.TWO;
        org.joda.time.DurationFieldType durationFieldType51 = weeks50.getFieldType();
        org.joda.time.Weeks weeks52 = weeks50.negated();
        org.joda.time.DurationFieldType durationFieldType53 = weeks50.getFieldType();
        org.joda.time.Period period55 = period47.withField(durationFieldType53, 53);
        org.joda.time.Period period57 = period33.withFieldAdded(durationFieldType53, 456825);
        org.joda.time.format.PeriodFormatter periodFormatter58 = null;
        java.lang.String str59 = period33.toString(periodFormatter58);
        org.junit.Assert.assertNotNull(durationFieldTypeArray6);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2719 + "'", int37 == 2719);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(weeks50);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertNotNull(weeks52);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "P2719W1DT9H35M5.679S" + "'", str59, "P2719W1DT9H35M5.679S");
    }

    @Test
    public void test15681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15681");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(1644572076884L);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(obj5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6);
        boolean boolean8 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType11);
        mutablePeriod12.setYears(0);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology17 = null;
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration16, chronology17);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        java.lang.Object obj22 = null;
        org.joda.time.Duration duration23 = new org.joda.time.Duration(obj22);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, (org.joda.time.ReadableDuration) duration23);
        boolean boolean25 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Interval interval27 = duration23.toIntervalTo(readableInstant26);
        org.joda.time.Interval interval28 = interval27.toInterval();
        org.joda.time.DateTime dateTime29 = interval28.getEnd();
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        java.lang.Object obj33 = null;
        org.joda.time.Duration duration34 = new org.joda.time.Duration(obj33);
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, (org.joda.time.ReadableDuration) duration34);
        boolean boolean36 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Interval interval38 = duration34.toIntervalTo(readableInstant37);
        org.joda.time.Interval interval39 = interval38.toInterval();
        org.joda.time.DateTime dateTime40 = interval39.getEnd();
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime29);
        java.lang.String str43 = dateTime29.toString();
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType48);
        mutablePeriod49.setYears(0);
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology54 = null;
        mutablePeriod49.setPeriod((org.joda.time.ReadableDuration) duration53, chronology54);
        org.joda.time.Duration duration57 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant58 = null;
        java.lang.Object obj59 = null;
        org.joda.time.Duration duration60 = new org.joda.time.Duration(obj59);
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant58, (org.joda.time.ReadableDuration) duration60);
        boolean boolean62 = duration57.isShorterThan((org.joda.time.ReadableDuration) duration60);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Interval interval64 = duration60.toIntervalTo(readableInstant63);
        org.joda.time.Interval interval65 = interval64.toInterval();
        org.joda.time.DateTime dateTime66 = interval65.getEnd();
        org.joda.time.Duration duration68 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant69 = null;
        java.lang.Object obj70 = null;
        org.joda.time.Duration duration71 = new org.joda.time.Duration(obj70);
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant69, (org.joda.time.ReadableDuration) duration71);
        boolean boolean73 = duration68.isShorterThan((org.joda.time.ReadableDuration) duration71);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Interval interval75 = duration71.toIntervalTo(readableInstant74);
        org.joda.time.Interval interval76 = interval75.toInterval();
        org.joda.time.DateTime dateTime77 = interval76.getEnd();
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.Period period79 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration53, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.PeriodType periodType80 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period81 = duration45.toPeriodTo((org.joda.time.ReadableInstant) dateTime66, periodType80);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Interval interval83 = duration3.toIntervalTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Interval interval84 = duration1.toIntervalFrom((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Duration duration86 = duration1.plus(1644572126513L);
        org.joda.time.Duration duration89 = duration86.withDurationAdded(1644572542192L, 856);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(dateTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "2022-02-11T09:44:32.225Z" + "'", str43, "2022-02-11T09:44:32.225Z");
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(interval83);
        org.junit.Assert.assertNotNull(interval84);
        org.junit.Assert.assertNotNull(duration86);
        org.junit.Assert.assertNotNull(duration89);
    }

    @Test
    public void test15682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15682");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        java.lang.Object obj15 = null;
        org.joda.time.Duration duration16 = new org.joda.time.Duration(obj15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration16);
        boolean boolean18 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) duration13, periodType19, chronology20);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        java.lang.Object obj25 = null;
        org.joda.time.Duration duration26 = new org.joda.time.Duration(obj25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, (org.joda.time.ReadableDuration) duration26);
        boolean boolean28 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Interval interval30 = duration26.toIntervalTo(readableInstant29);
        org.joda.time.Interval interval31 = interval30.toInterval();
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.Period period33 = new org.joda.time.Period((long) 1, (long) '#', periodType19, chronology32);
        org.joda.time.PeriodType periodType34 = periodType19.withDaysRemoved();
        org.joda.time.Period period35 = interval9.toPeriod(periodType19);
        long long36 = interval9.getStartMillis();
        org.joda.time.DateTime dateTime37 = interval9.getEnd();
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardMinutes((-2L));
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableDuration) duration39);
        long long41 = duration39.getStandardSeconds();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period35);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1644572672280L + "'", long36 == 1644572672280L);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-120L) + "'", long41 == (-120L));
    }

    @Test
    public void test15683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15683");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.Days days3 = days2.negated();
        boolean boolean4 = days1.isGreaterThan(days3);
        org.joda.time.Days days6 = days3.plus((int) (short) 10);
        org.joda.time.Days days7 = org.joda.time.Days.ONE;
        org.joda.time.Days days8 = days7.negated();
        org.joda.time.Days days9 = org.joda.time.Days.ONE;
        org.joda.time.Days days10 = days9.negated();
        org.joda.time.Days days11 = org.joda.time.Days.ONE;
        org.joda.time.Days days12 = days11.negated();
        boolean boolean13 = days10.isGreaterThan(days12);
        org.joda.time.Days days14 = days7.plus(days12);
        org.joda.time.Days days15 = days6.plus(days7);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration23 = duration20.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration25 = duration17.withDurationAdded((org.joda.time.ReadableDuration) duration20, (int) (short) 1);
        org.joda.time.Days days26 = duration25.toStandardDays();
        org.joda.time.Days days28 = days26.minus((int) (short) 100);
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration33 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration36 = duration33.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration38 = duration30.withDurationAdded((org.joda.time.ReadableDuration) duration33, (int) (short) 1);
        org.joda.time.Days days39 = duration38.toStandardDays();
        org.joda.time.Days days41 = days39.minus((int) (short) 100);
        org.joda.time.Days days42 = days26.plus(days39);
        boolean boolean43 = days6.isLessThan(days26);
        org.joda.time.Duration duration45 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Period period46 = duration45.toPeriod();
        org.joda.time.Duration duration49 = duration45.withDurationAdded(100L, 10);
        org.joda.time.Days days50 = duration49.toStandardDays();
        org.joda.time.Days days51 = org.joda.time.Days.FOUR;
        org.joda.time.Days days52 = org.joda.time.Days.ONE;
        org.joda.time.Days days53 = days52.negated();
        org.joda.time.Days days54 = org.joda.time.Days.ONE;
        org.joda.time.Days days55 = days54.negated();
        org.joda.time.Days days56 = org.joda.time.Days.ONE;
        org.joda.time.Days days57 = days56.negated();
        boolean boolean58 = days55.isGreaterThan(days57);
        org.joda.time.Days days59 = days52.plus(days57);
        org.joda.time.Days days60 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days52);
        org.joda.time.Days days62 = days52.plus((-1));
        org.joda.time.Days days63 = days51.plus(days52);
        org.joda.time.Days days64 = days50.minus(days52);
        org.joda.time.Days days66 = days52.multipliedBy((-35));
        org.joda.time.Days days67 = days66.negated();
        boolean boolean68 = days26.isGreaterThan(days66);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(days50);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertNotNull(days52);
        org.junit.Assert.assertNotNull(days53);
        org.junit.Assert.assertNotNull(days54);
        org.junit.Assert.assertNotNull(days55);
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertNotNull(days57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(days59);
        org.junit.Assert.assertNotNull(days60);
        org.junit.Assert.assertNotNull(days62);
        org.junit.Assert.assertNotNull(days63);
        org.junit.Assert.assertNotNull(days64);
        org.junit.Assert.assertNotNull(days66);
        org.junit.Assert.assertNotNull(days67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test15684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15684");
        org.joda.time.Period period1 = new org.joda.time.Period(1644572386625L);
    }

    @Test
    public void test15685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15685");
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        java.lang.Object obj7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(obj7);
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration8);
        boolean boolean10 = duration5.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Interval interval12 = duration8.toIntervalTo(readableInstant11);
        org.joda.time.Interval interval13 = interval12.toInterval();
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.DurationField durationField15 = durationFieldType3.getField(chronology14);
        org.joda.time.Period period16 = new org.joda.time.Period(36000L, chronology14);
        org.joda.time.Period period17 = new org.joda.time.Period(1644572093963L, 0L, chronology14);
        org.joda.time.Period period19 = period17.plusHours((-101));
        org.joda.time.Period period22 = new org.joda.time.Period((long) (byte) 10, (long) (byte) 0);
        org.joda.time.Period period24 = period22.minusWeeks((int) ' ');
        org.joda.time.Period period25 = period17.minus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType28);
        mutablePeriod29.setYears(0);
        mutablePeriod29.setWeeks((int) (short) -1);
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        java.lang.Object obj37 = null;
        org.joda.time.Duration duration38 = new org.joda.time.Duration(obj37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration38);
        boolean boolean40 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Interval interval42 = duration38.toIntervalTo(readableInstant41);
        mutablePeriod29.setPeriod((org.joda.time.ReadableInterval) interval42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        mutablePeriod29.setPeriod(readableDuration44);
        mutablePeriod29.setWeeks(32);
        boolean boolean48 = period25.equals((java.lang.Object) mutablePeriod29);
        org.joda.time.PeriodType periodType49 = period25.getPeriodType();
        org.joda.time.PeriodType periodType50 = periodType49.withMonthsRemoved();
        org.joda.time.PeriodType periodType51 = periodType49.withMinutesRemoved();
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
    }

    @Test
    public void test15686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15686");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        java.lang.Object obj4 = null;
        org.joda.time.Duration duration5 = new org.joda.time.Duration(obj4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration5);
        boolean boolean7 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((java.lang.Object) duration2, periodType8, chronology9);
        java.lang.String str11 = duration2.toString();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.Duration duration14 = org.joda.time.Duration.millis((long) '4');
        long long15 = duration14.getMillis();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType18);
        mutablePeriod19.setYears(0);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology24 = null;
        mutablePeriod19.setPeriod((org.joda.time.ReadableDuration) duration23, chronology24);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        java.lang.Object obj29 = null;
        org.joda.time.Duration duration30 = new org.joda.time.Duration(obj29);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration30);
        boolean boolean32 = duration27.isShorterThan((org.joda.time.ReadableDuration) duration30);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Interval interval34 = duration30.toIntervalTo(readableInstant33);
        org.joda.time.Interval interval35 = interval34.toInterval();
        org.joda.time.DateTime dateTime36 = interval35.getEnd();
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant39 = null;
        java.lang.Object obj40 = null;
        org.joda.time.Duration duration41 = new org.joda.time.Duration(obj40);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, (org.joda.time.ReadableDuration) duration41);
        boolean boolean43 = duration38.isShorterThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Interval interval45 = duration41.toIntervalTo(readableInstant44);
        org.joda.time.Interval interval46 = interval45.toInterval();
        org.joda.time.DateTime dateTime47 = interval46.getEnd();
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration23, (org.joda.time.ReadableInstant) dateTime36);
        java.lang.String str50 = dateTime36.toString();
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant54 = null;
        java.lang.Object obj55 = null;
        org.joda.time.Duration duration56 = new org.joda.time.Duration(obj55);
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, (org.joda.time.ReadableDuration) duration56);
        boolean boolean58 = duration53.isShorterThan((org.joda.time.ReadableDuration) duration56);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Interval interval60 = duration56.toIntervalTo(readableInstant59);
        org.joda.time.Duration duration63 = new org.joda.time.Duration((long) 'a', (long) 0);
        boolean boolean64 = duration56.equals((java.lang.Object) 'a');
        org.joda.time.Minutes minutes65 = duration56.toStandardMinutes();
        org.joda.time.Duration duration66 = duration14.plus((org.joda.time.ReadableDuration) duration56);
        org.joda.time.Duration duration68 = duration14.minus((long) 100);
        org.joda.time.Duration duration69 = duration68.toDuration();
        org.joda.time.Duration duration70 = duration2.minus((org.joda.time.ReadableDuration) duration68);
        org.joda.time.Minutes minutes71 = duration68.toStandardMinutes();
        org.joda.time.Duration duration74 = duration68.withDurationAdded(1644572409226L, (int) (short) 0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT36000S" + "'", str11, "PT36000S");
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(dateTime47);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "2022-02-11T09:44:32.408Z" + "'", str50, "2022-02-11T09:44:32.408Z");
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(minutes65);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(minutes71);
        org.junit.Assert.assertNotNull(duration74);
    }

    @Test
    public void test15687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15687");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (long) 100);
        org.joda.time.Weeks weeks3 = period2.toStandardWeeks();
        org.joda.time.Weeks weeks5 = weeks3.multipliedBy((int) (byte) 1);
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks8 = weeks7.negated();
        int int9 = weeks7.getWeeks();
        org.joda.time.Weeks weeks11 = weeks7.minus(3);
        org.joda.time.Period period13 = new org.joda.time.Period((long) (byte) 1);
        boolean boolean14 = weeks7.equals((java.lang.Object) (byte) 1);
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks17 = weeks16.negated();
        int int18 = weeks16.getWeeks();
        org.joda.time.Weeks weeks20 = weeks16.minus(3);
        boolean boolean21 = weeks7.isGreaterThan(weeks20);
        boolean boolean22 = weeks3.isGreaterThan(weeks20);
        org.joda.time.Duration duration23 = weeks20.toStandardDuration();
        org.joda.time.Weeks weeks25 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks26 = weeks25.negated();
        int int27 = weeks25.getWeeks();
        org.joda.time.Weeks weeks29 = weeks25.minus(3);
        org.joda.time.Weeks weeks31 = weeks29.minus(0);
        boolean boolean32 = weeks20.isLessThan(weeks29);
        org.joda.time.Weeks weeks34 = weeks29.multipliedBy((-9));
        org.joda.time.Weeks weeks36 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks37 = weeks36.negated();
        int int38 = weeks36.getWeeks();
        org.joda.time.Weeks weeks40 = weeks36.minus(3);
        org.joda.time.Period period42 = new org.joda.time.Period((long) (byte) 1);
        boolean boolean43 = weeks36.equals((java.lang.Object) (byte) 1);
        org.joda.time.PeriodType periodType44 = weeks36.getPeriodType();
        org.joda.time.Weeks weeks45 = org.joda.time.Weeks.THREE;
        int int46 = weeks45.size();
        org.joda.time.Duration duration47 = weeks45.toStandardDuration();
        org.joda.time.Weeks weeks48 = org.joda.time.Weeks.THREE;
        int int49 = weeks48.size();
        org.joda.time.Duration duration50 = weeks48.toStandardDuration();
        java.lang.String str51 = weeks48.toString();
        org.joda.time.Weeks weeks53 = weeks48.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks55 = weeks53.multipliedBy(3);
        org.joda.time.Weeks weeks57 = org.joda.time.Weeks.weeks((-1));
        boolean boolean58 = weeks53.isGreaterThan(weeks57);
        org.joda.time.Weeks weeks59 = weeks45.minus(weeks57);
        org.joda.time.Weeks weeks60 = weeks36.plus(weeks45);
        java.lang.String str61 = weeks36.toString();
        boolean boolean62 = weeks34.isLessThan(weeks36);
        org.joda.time.Weeks weeks64 = weeks36.plus(18);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(weeks48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "P3W" + "'", str51, "P3W");
        org.junit.Assert.assertNotNull(weeks53);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertNotNull(weeks57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(weeks59);
        org.junit.Assert.assertNotNull(weeks60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "P-1W" + "'", str61, "P-1W");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(weeks64);
    }

    @Test
    public void test15688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15688");
        org.joda.time.Period period1 = org.joda.time.Period.days(3);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Period period4 = period2.withHours(31);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test15689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15689");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval8);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(hours10);
    }

    @Test
    public void test15690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15690");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) ' ', chronology1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType5);
        mutablePeriod6.setYears(0);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod6.setPeriod((org.joda.time.ReadableDuration) duration10, chronology11);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        java.lang.Object obj16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(obj16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration17);
        boolean boolean19 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Interval interval21 = duration17.toIntervalTo(readableInstant20);
        org.joda.time.Interval interval22 = interval21.toInterval();
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        java.lang.Object obj27 = null;
        org.joda.time.Duration duration28 = new org.joda.time.Duration(obj27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration28);
        boolean boolean30 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Interval interval32 = duration28.toIntervalTo(readableInstant31);
        org.joda.time.Interval interval33 = interval32.toInterval();
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant39 = null;
        java.lang.Object obj40 = null;
        org.joda.time.Duration duration41 = new org.joda.time.Duration(obj40);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, (org.joda.time.ReadableDuration) duration41);
        boolean boolean43 = duration38.isShorterThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Interval interval45 = duration41.toIntervalTo(readableInstant44);
        org.joda.time.Interval interval46 = interval45.toInterval();
        org.joda.time.DateTime dateTime47 = interval46.getEnd();
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType50 = periodType49.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(periodType50);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(10L, periodType50);
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime47, periodType50);
        org.joda.time.Duration duration54 = mutablePeriod2.toDurationFrom((org.joda.time.ReadableInstant) dateTime23);
        mutablePeriod2.setPeriod(360000L);
        int int57 = mutablePeriod2.getYears();
        mutablePeriod2.setMinutes((int) '4');
        int int60 = mutablePeriod2.getHours();
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test15691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15691");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) ' ', chronology1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType5);
        mutablePeriod6.setYears(0);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod6.setPeriod((org.joda.time.ReadableDuration) duration10, chronology11);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        java.lang.Object obj16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(obj16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration17);
        boolean boolean19 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Interval interval21 = duration17.toIntervalTo(readableInstant20);
        org.joda.time.Interval interval22 = interval21.toInterval();
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        java.lang.Object obj27 = null;
        org.joda.time.Duration duration28 = new org.joda.time.Duration(obj27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration28);
        boolean boolean30 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Interval interval32 = duration28.toIntervalTo(readableInstant31);
        org.joda.time.Interval interval33 = interval32.toInterval();
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant39 = null;
        java.lang.Object obj40 = null;
        org.joda.time.Duration duration41 = new org.joda.time.Duration(obj40);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, (org.joda.time.ReadableDuration) duration41);
        boolean boolean43 = duration38.isShorterThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Interval interval45 = duration41.toIntervalTo(readableInstant44);
        org.joda.time.Interval interval46 = interval45.toInterval();
        org.joda.time.DateTime dateTime47 = interval46.getEnd();
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType50 = periodType49.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(periodType50);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(10L, periodType50);
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime47, periodType50);
        org.joda.time.Duration duration54 = mutablePeriod2.toDurationFrom((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant57 = null;
        java.lang.Object obj58 = null;
        org.joda.time.Duration duration59 = new org.joda.time.Duration(obj58);
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant57, (org.joda.time.ReadableDuration) duration59);
        boolean boolean61 = duration56.isShorterThan((org.joda.time.ReadableDuration) duration59);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Interval interval63 = duration59.toIntervalTo(readableInstant62);
        org.joda.time.Interval interval64 = interval63.toInterval();
        org.joda.time.DateTime dateTime65 = interval64.getEnd();
        boolean boolean66 = dateTime23.isBefore((org.joda.time.ReadableInstant) dateTime65);
        java.lang.String str67 = dateTime65.toString();
        java.lang.String str68 = dateTime65.toString();
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(dateTime65);
// flaky:         org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "2022-02-11T09:44:32.541Z" + "'", str67, "2022-02-11T09:44:32.541Z");
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "2022-02-11T09:44:32.541Z" + "'", str68, "2022-02-11T09:44:32.541Z");
    }

    @Test
    public void test15692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15692");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(obj5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6);
        boolean boolean8 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.minutesIn(readableInterval10);
        java.lang.String str12 = minutes11.toString();
        org.joda.time.PeriodType periodType13 = minutes11.getPeriodType();
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant9, periodType13);
        org.joda.time.PeriodType periodType15 = periodType13.withYearsRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(1644572097900L, 1644572097900L, periodType15);
        org.joda.time.MutablePeriod mutablePeriod18 = mutablePeriod17.copy();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod18.setValue((int) (byte) 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT0M" + "'", str12, "PT0M");
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(mutablePeriod18);
    }

    @Test
    public void test15693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15693");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(36);
        org.joda.time.Weeks weeks3 = weeks1.plus(0);
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeks(36);
        org.joda.time.Weeks weeks7 = weeks5.plus(0);
        org.joda.time.Weeks weeks8 = weeks1.minus(weeks5);
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks11 = weeks9.plus((int) '4');
        org.joda.time.Weeks weeks13 = weeks11.multipliedBy((int) ' ');
        boolean boolean14 = weeks1.isLessThan(weeks11);
        org.joda.time.Weeks weeks16 = weeks1.multipliedBy((int) (byte) 1);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(weeks16);
    }

    @Test
    public void test15694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15694");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        java.lang.String str7 = period6.toString();
        org.joda.time.MutablePeriod mutablePeriod8 = period6.toMutablePeriod();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration13.toIntervalTo(readableInstant16);
        long long18 = interval17.getStartMillis();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Minutes minutes20 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval17);
        long long21 = interval17.getEndMillis();
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        java.lang.Object obj25 = null;
        org.joda.time.Duration duration26 = new org.joda.time.Duration(obj25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, (org.joda.time.ReadableDuration) duration26);
        boolean boolean28 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Interval interval30 = duration26.toIntervalTo(readableInstant29);
        org.joda.time.Interval interval31 = interval30.toInterval();
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant34 = null;
        java.lang.Object obj35 = null;
        org.joda.time.Duration duration36 = new org.joda.time.Duration(obj35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration36);
        boolean boolean38 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration36);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Interval interval40 = duration36.toIntervalTo(readableInstant39);
        org.joda.time.Interval interval41 = interval40.toInterval();
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant44 = null;
        java.lang.Object obj45 = null;
        org.joda.time.Duration duration46 = new org.joda.time.Duration(obj45);
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, (org.joda.time.ReadableDuration) duration46);
        boolean boolean48 = duration43.isShorterThan((org.joda.time.ReadableDuration) duration46);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Interval interval50 = duration46.toIntervalTo(readableInstant49);
        boolean boolean51 = interval41.isAfter((org.joda.time.ReadableInterval) interval50);
        org.joda.time.Period period52 = interval50.toPeriod();
        boolean boolean53 = interval31.isBefore((org.joda.time.ReadableInterval) interval50);
        boolean boolean54 = interval17.isAfter((org.joda.time.ReadableInterval) interval31);
        org.joda.time.DateTime dateTime55 = interval17.getStart();
        org.joda.time.DateTimeZone dateTimeZone56 = dateTime55.getZone();
        org.joda.time.Instant instant57 = dateTime55.toInstant();
        org.joda.time.Instant instant58 = instant57.toInstant();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.097S" + "'", str7, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644572672623L + "'", long18 == 1644572672623L);
        org.junit.Assert.assertNotNull(minutes20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1644572672623L + "'", long21 == 1644572672623L);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(instant57);
        org.junit.Assert.assertNotNull(instant58);
    }

    @Test
    public void test15695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15695");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        java.lang.Object obj13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(obj13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration14);
        boolean boolean16 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration14.toIntervalTo(readableInstant17);
        boolean boolean19 = interval9.isAfter((org.joda.time.ReadableInterval) interval18);
        org.joda.time.DateTime dateTime20 = interval9.getStart();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        org.joda.time.Duration duration23 = org.joda.time.Duration.millis((long) '4');
        long long24 = duration23.getMillis();
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType27);
        mutablePeriod28.setYears(0);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration32, chronology33);
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant37 = null;
        java.lang.Object obj38 = null;
        org.joda.time.Duration duration39 = new org.joda.time.Duration(obj38);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant37, (org.joda.time.ReadableDuration) duration39);
        boolean boolean41 = duration36.isShorterThan((org.joda.time.ReadableDuration) duration39);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Interval interval43 = duration39.toIntervalTo(readableInstant42);
        org.joda.time.Interval interval44 = interval43.toInterval();
        org.joda.time.DateTime dateTime45 = interval44.getEnd();
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant48 = null;
        java.lang.Object obj49 = null;
        org.joda.time.Duration duration50 = new org.joda.time.Duration(obj49);
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant48, (org.joda.time.ReadableDuration) duration50);
        boolean boolean52 = duration47.isShorterThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Interval interval54 = duration50.toIntervalTo(readableInstant53);
        org.joda.time.Interval interval55 = interval54.toInterval();
        org.joda.time.DateTime dateTime56 = interval55.getEnd();
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration32, (org.joda.time.ReadableInstant) dateTime45);
        java.lang.String str59 = dateTime45.toString();
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration23, (org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant63 = null;
        java.lang.Object obj64 = null;
        org.joda.time.Duration duration65 = new org.joda.time.Duration(obj64);
        org.joda.time.Period period66 = new org.joda.time.Period(readableInstant63, (org.joda.time.ReadableDuration) duration65);
        boolean boolean67 = duration62.isShorterThan((org.joda.time.ReadableDuration) duration65);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Interval interval69 = duration65.toIntervalTo(readableInstant68);
        org.joda.time.Duration duration72 = new org.joda.time.Duration((long) 'a', (long) 0);
        boolean boolean73 = duration65.equals((java.lang.Object) 'a');
        org.joda.time.Minutes minutes74 = duration65.toStandardMinutes();
        org.joda.time.Duration duration75 = duration23.plus((org.joda.time.ReadableDuration) duration65);
        long long76 = duration75.getStandardDays();
        org.joda.time.Period period77 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableDuration) duration75);
        org.joda.time.PeriodType periodType78 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType79 = periodType78.withMonthsRemoved();
        org.joda.time.PeriodType periodType80 = periodType79.withHoursRemoved();
        boolean boolean81 = period77.equals((java.lang.Object) periodType80);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(periodType80);
        mutablePeriod82.setSeconds(56);
        org.joda.time.Minutes minutes85 = org.joda.time.Minutes.ZERO;
        org.joda.time.Period period86 = new org.joda.time.Period((java.lang.Object) minutes85);
        org.joda.time.Minutes minutes87 = minutes85.negated();
        org.joda.time.ReadablePeriod readablePeriod88 = null;
        org.joda.time.Minutes minutes89 = org.joda.time.Minutes.standardMinutesIn(readablePeriod88);
        java.lang.String str90 = minutes89.toString();
        org.joda.time.Minutes minutes91 = minutes85.plus(minutes89);
        mutablePeriod82.setPeriod((org.joda.time.ReadablePeriod) minutes89);
        org.joda.time.DurationFieldType durationFieldType93 = minutes89.getFieldType();
        org.joda.time.DurationFieldType durationFieldType94 = minutes89.getFieldType();
        org.joda.time.PeriodType periodType95 = minutes89.getPeriodType();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(dateTime56);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "2022-02-11T09:44:32.654Z" + "'", str59, "2022-02-11T09:44:32.654Z");
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(minutes74);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(periodType78);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(minutes85);
        org.junit.Assert.assertNotNull(minutes87);
        org.junit.Assert.assertNotNull(minutes89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "PT0M" + "'", str90, "PT0M");
        org.junit.Assert.assertNotNull(minutes91);
        org.junit.Assert.assertNotNull(durationFieldType93);
        org.junit.Assert.assertNotNull(durationFieldType94);
        org.junit.Assert.assertNotNull(periodType95);
    }

    @Test
    public void test15696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15696");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutesIn(readableInterval0);
        java.lang.String str2 = minutes1.toString();
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes5 = minutes3.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType6 = minutes5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.eras();
        boolean boolean9 = periodType6.isSupported(durationFieldType8);
        int int10 = minutes1.get(durationFieldType8);
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.minutesIn(readableInterval11);
        org.joda.time.Minutes minutes13 = minutes1.minus(minutes12);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod15.addMinutes((int) (short) 1);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType26);
        org.joda.time.Minutes minutes28 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes30 = minutes28.multipliedBy((int) (short) 1);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) minutes30);
        boolean boolean32 = mutablePeriod15.equals((java.lang.Object) minutes30);
        org.joda.time.PeriodType periodType33 = minutes30.getPeriodType();
        int int34 = minutes1.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes30);
        org.joda.time.PeriodType periodType35 = minutes1.getPeriodType();
        org.joda.time.Minutes minutes37 = minutes1.multipliedBy(298);
        org.joda.time.Minutes minutes39 = minutes1.multipliedBy((-963));
        org.joda.time.Minutes minutes41 = minutes1.minus(30);
        org.joda.time.Minutes minutes42 = minutes1.negated();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0M" + "'", str2, "PT0M");
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(minutes42);
    }

    @Test
    public void test15697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15697");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(1644572637981L, 1644572186877L);
    }

    @Test
    public void test15698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15698");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration13.toIntervalTo(readableInstant16);
        org.joda.time.Interval interval18 = interval17.toInterval();
        org.joda.time.Hours hours19 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Hours hours20 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval18);
        boolean boolean21 = interval8.overlaps((org.joda.time.ReadableInterval) interval18);
        org.joda.time.MutableInterval mutableInterval22 = interval8.toMutableInterval();
        org.joda.time.Interval interval23 = mutableInterval22.toInterval();
        org.joda.time.Interval interval24 = interval23.toInterval();
        org.joda.time.Duration duration25 = interval23.toDuration();
        org.joda.time.Hours hours26 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval23);
        org.joda.time.Hours hours27 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval23);
        org.joda.time.Period period28 = interval23.toPeriod();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(mutableInterval22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test15699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15699");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval9);
        org.joda.time.Hours hours11 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval9);
        org.joda.time.DurationFieldType durationFieldType12 = hours11.getFieldType();
        org.joda.time.Hours hours14 = hours11.minus(1);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = duration17.toPeriodFrom(readableInstant18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = duration17.toPeriod(chronology20);
        org.joda.time.Period period23 = period21.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Hours hours25 = org.joda.time.Hours.hoursIn(readableInterval24);
        org.joda.time.Period period26 = period23.minus((org.joda.time.ReadablePeriod) hours25);
        org.joda.time.Hours hours27 = hours25.negated();
        org.joda.time.Hours hours28 = hours14.plus(hours27);
        org.joda.time.Hours hours29 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours30 = org.joda.time.Hours.ZERO;
        org.joda.time.Hours hours31 = hours29.minus(hours30);
        org.joda.time.DurationFieldType durationFieldType32 = hours30.getFieldType();
        boolean boolean33 = hours28.isLessThan(hours30);
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.Hours hours35 = org.joda.time.Hours.hoursIn(readableInterval34);
        org.joda.time.Hours hours37 = hours35.minus((int) (byte) 100);
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        java.lang.Object obj41 = null;
        org.joda.time.Duration duration42 = new org.joda.time.Duration(obj41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, (org.joda.time.ReadableDuration) duration42);
        boolean boolean44 = duration39.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Interval interval46 = duration42.toIntervalTo(readableInstant45);
        org.joda.time.Interval interval47 = interval46.toInterval();
        org.joda.time.Hours hours48 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval47);
        org.joda.time.Hours hours50 = hours48.dividedBy(1);
        org.joda.time.Hours hours52 = hours48.minus((int) (short) 1);
        boolean boolean53 = hours35.isGreaterThan(hours52);
        org.joda.time.Hours hours55 = hours35.plus(32);
        org.joda.time.Hours hours56 = hours30.plus(hours35);
        org.joda.time.ReadableInterval readableInterval57 = null;
        org.joda.time.Hours hours58 = org.joda.time.Hours.hoursIn(readableInterval57);
        org.joda.time.Hours hours60 = hours58.minus((int) (byte) 100);
        boolean boolean61 = hours35.isGreaterThan(hours58);
        org.joda.time.Hours hours63 = hours35.multipliedBy(14);
        org.joda.time.DurationFieldType durationFieldType64 = hours35.getFieldType();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertNotNull(hours31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(hours37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(hours48);
        org.junit.Assert.assertNotNull(hours50);
        org.junit.Assert.assertNotNull(hours52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(hours55);
        org.junit.Assert.assertNotNull(hours56);
        org.junit.Assert.assertNotNull(hours58);
        org.junit.Assert.assertNotNull(hours60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(hours63);
        org.junit.Assert.assertNotNull(durationFieldType64);
    }

    @Test
    public void test15700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15700");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(1644572092997L);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(1644572076884L);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        java.lang.Object obj7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(obj7);
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration8);
        boolean boolean10 = duration5.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType13);
        mutablePeriod14.setYears(0);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod14.setPeriod((org.joda.time.ReadableDuration) duration18, chronology19);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        java.lang.Object obj24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(obj24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration25);
        boolean boolean27 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Interval interval29 = duration25.toIntervalTo(readableInstant28);
        org.joda.time.Interval interval30 = interval29.toInterval();
        org.joda.time.DateTime dateTime31 = interval30.getEnd();
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant34 = null;
        java.lang.Object obj35 = null;
        org.joda.time.Duration duration36 = new org.joda.time.Duration(obj35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration36);
        boolean boolean38 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration36);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Interval interval40 = duration36.toIntervalTo(readableInstant39);
        org.joda.time.Interval interval41 = interval40.toInterval();
        org.joda.time.DateTime dateTime42 = interval41.getEnd();
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration18, (org.joda.time.ReadableInstant) dateTime31);
        java.lang.String str45 = dateTime31.toString();
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType50);
        mutablePeriod51.setYears(0);
        org.joda.time.Duration duration55 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology56 = null;
        mutablePeriod51.setPeriod((org.joda.time.ReadableDuration) duration55, chronology56);
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant60 = null;
        java.lang.Object obj61 = null;
        org.joda.time.Duration duration62 = new org.joda.time.Duration(obj61);
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, (org.joda.time.ReadableDuration) duration62);
        boolean boolean64 = duration59.isShorterThan((org.joda.time.ReadableDuration) duration62);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Interval interval66 = duration62.toIntervalTo(readableInstant65);
        org.joda.time.Interval interval67 = interval66.toInterval();
        org.joda.time.DateTime dateTime68 = interval67.getEnd();
        org.joda.time.Duration duration70 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant71 = null;
        java.lang.Object obj72 = null;
        org.joda.time.Duration duration73 = new org.joda.time.Duration(obj72);
        org.joda.time.Period period74 = new org.joda.time.Period(readableInstant71, (org.joda.time.ReadableDuration) duration73);
        boolean boolean75 = duration70.isShorterThan((org.joda.time.ReadableDuration) duration73);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Interval interval77 = duration73.toIntervalTo(readableInstant76);
        org.joda.time.Interval interval78 = interval77.toInterval();
        org.joda.time.DateTime dateTime79 = interval78.getEnd();
        org.joda.time.Period period80 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime68, (org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.Period period81 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration55, (org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.PeriodType periodType82 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period83 = duration47.toPeriodTo((org.joda.time.ReadableInstant) dateTime68, periodType82);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.Interval interval85 = duration5.toIntervalTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Interval interval86 = duration3.toIntervalFrom((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Duration duration88 = org.joda.time.Duration.standardSeconds(1644572096050L);
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableDuration) duration88);
        boolean boolean90 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration88);
        org.joda.time.Duration duration92 = duration1.minus(1644572138000L);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(dateTime42);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2022-02-11T09:44:32.795Z" + "'", str45, "2022-02-11T09:44:32.795Z");
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(interval85);
        org.junit.Assert.assertNotNull(interval86);
        org.junit.Assert.assertNotNull(duration88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(duration92);
    }

    @Test
    public void test15701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15701");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(36);
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.weeks((int) (byte) -1);
        boolean boolean5 = weeks2.isGreaterThan(weeks4);
        org.joda.time.DurationFieldType durationFieldType6 = weeks2.getFieldType();
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks9 = weeks7.minus(weeks8);
        org.joda.time.Weeks weeks11 = weeks9.multipliedBy(100);
        org.joda.time.Weeks weeks13 = weeks11.multipliedBy((int) (short) 10);
        boolean boolean14 = weeks2.isLessThan(weeks13);
        org.joda.time.Weeks weeks15 = weeks13.negated();
        org.joda.time.Weeks weeks17 = weeks15.dividedBy((int) (short) 10);
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks20 = weeks18.minus(weeks19);
        org.joda.time.Weeks weeks21 = weeks17.plus(weeks20);
        org.joda.time.Weeks weeks22 = weeks1.minus(weeks21);
        int int23 = weeks21.size();
        int int24 = weeks21.size();
        int int25 = weeks21.getWeeks();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test15702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15702");
        org.joda.time.Period period1 = new org.joda.time.Period(1L);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Minutes minutes4 = minutes2.plus((int) (short) 1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType6 = periodType5.withMillisRemoved();
        java.lang.String str7 = periodType6.getName();
        boolean boolean8 = minutes4.equals((java.lang.Object) periodType6);
        org.joda.time.Duration duration9 = minutes4.toStandardDuration();
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MillisNoMillis" + "'", str7, "MillisNoMillis");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(duration9);
    }

    @Test
    public void test15703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15703");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(1644572549277L);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(obj5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6);
        boolean boolean8 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.minutesIn(readableInterval10);
        java.lang.String str12 = minutes11.toString();
        org.joda.time.PeriodType periodType13 = minutes11.getPeriodType();
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant9, periodType13);
        org.joda.time.Duration duration16 = duration6.withMillis((long) 'a');
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardHours(1644572078660L);
        org.joda.time.Duration duration19 = duration16.plus((org.joda.time.ReadableDuration) duration18);
        boolean boolean20 = duration1.equals((java.lang.Object) duration16);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT0M" + "'", str12, "PT0M");
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15704");
        org.joda.time.Period period1 = new org.joda.time.Period(1L);
        org.joda.time.Period period3 = period1.minusMonths((-101));
        org.joda.time.Period period5 = period1.plusMillis(3);
        org.joda.time.Period period7 = period5.multipliedBy(2);
        org.joda.time.Minutes minutes8 = period5.toStandardMinutes();
        org.joda.time.MutablePeriod mutablePeriod9 = minutes8.toMutablePeriod();
        org.joda.time.PeriodType periodType10 = mutablePeriod9.getPeriodType();
        int int11 = mutablePeriod9.size();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test15705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15705");
        org.joda.time.Period period1 = new org.joda.time.Period(1L);
        org.joda.time.Period period3 = period1.minusMonths((-101));
        org.joda.time.Period period5 = period1.plusMillis(3);
        org.joda.time.Period period7 = period5.minusDays((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((java.lang.Object) period5);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.Days days10 = null;
        org.joda.time.Days days11 = days9.minus(days10);
        org.joda.time.Period period16 = new org.joda.time.Period((-101), 0, 10, (int) (short) 10);
        org.joda.time.Days days17 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        org.joda.time.Days days19 = days11.minus(days17);
        org.joda.time.Days days21 = days11.multipliedBy(0);
        org.joda.time.Days days23 = org.joda.time.Days.days((int) (byte) 10);
        org.joda.time.Days days25 = days23.dividedBy(3);
        org.joda.time.Days days27 = days25.multipliedBy((int) (byte) 100);
        org.joda.time.Days days29 = days27.minus(31);
        boolean boolean30 = days21.isGreaterThan(days29);
        org.joda.time.DurationFieldType durationFieldType31 = days29.getFieldType();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(durationFieldType31);
    }

    @Test
    public void test15706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15706");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '4');
        org.joda.time.Minutes minutes7 = period4.toStandardMinutes();
        org.joda.time.Period period9 = period4.multipliedBy((int) (byte) 100);
        org.joda.time.Period period11 = period4.plusYears((int) '#');
        org.joda.time.Period period13 = period11.withMillis(1);
        org.joda.time.Period period15 = period13.plusWeeks(963);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (short) 10, 1644572077926L, chronology18);
        org.joda.time.Period period21 = period19.plusMinutes((int) (short) 100);
        int int22 = period19.getHours();
        org.joda.time.Period period23 = period15.minus((org.joda.time.ReadablePeriod) period19);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test15707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15707");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) 601);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) ' ', chronology3);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType7);
        mutablePeriod8.setYears(0);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology13 = null;
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration12, chronology13);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        java.lang.Object obj18 = null;
        org.joda.time.Duration duration19 = new org.joda.time.Duration(obj18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration19);
        boolean boolean21 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Interval interval23 = duration19.toIntervalTo(readableInstant22);
        org.joda.time.Interval interval24 = interval23.toInterval();
        org.joda.time.DateTime dateTime25 = interval24.getEnd();
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        java.lang.Object obj29 = null;
        org.joda.time.Duration duration30 = new org.joda.time.Duration(obj29);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration30);
        boolean boolean32 = duration27.isShorterThan((org.joda.time.ReadableDuration) duration30);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Interval interval34 = duration30.toIntervalTo(readableInstant33);
        org.joda.time.Interval interval35 = interval34.toInterval();
        org.joda.time.DateTime dateTime36 = interval35.getEnd();
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant41 = null;
        java.lang.Object obj42 = null;
        org.joda.time.Duration duration43 = new org.joda.time.Duration(obj42);
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, (org.joda.time.ReadableDuration) duration43);
        boolean boolean45 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Interval interval47 = duration43.toIntervalTo(readableInstant46);
        org.joda.time.Interval interval48 = interval47.toInterval();
        org.joda.time.DateTime dateTime49 = interval48.getEnd();
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType52 = periodType51.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(periodType52);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(10L, periodType52);
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime49, periodType52);
        org.joda.time.Duration duration56 = mutablePeriod4.toDurationFrom((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Duration duration57 = duration56.toDuration();
        org.joda.time.Period period59 = org.joda.time.Period.days((int) (short) 1);
        org.joda.time.Period period60 = period59.toPeriod();
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType63);
        mutablePeriod64.setYears(0);
        org.joda.time.Duration duration68 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology69 = null;
        mutablePeriod64.setPeriod((org.joda.time.ReadableDuration) duration68, chronology69);
        org.joda.time.Duration duration72 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant73 = null;
        java.lang.Object obj74 = null;
        org.joda.time.Duration duration75 = new org.joda.time.Duration(obj74);
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant73, (org.joda.time.ReadableDuration) duration75);
        boolean boolean77 = duration72.isShorterThan((org.joda.time.ReadableDuration) duration75);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Interval interval79 = duration75.toIntervalTo(readableInstant78);
        org.joda.time.Interval interval80 = interval79.toInterval();
        org.joda.time.DateTime dateTime81 = interval80.getEnd();
        org.joda.time.Duration duration83 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant84 = null;
        java.lang.Object obj85 = null;
        org.joda.time.Duration duration86 = new org.joda.time.Duration(obj85);
        org.joda.time.Period period87 = new org.joda.time.Period(readableInstant84, (org.joda.time.ReadableDuration) duration86);
        boolean boolean88 = duration83.isShorterThan((org.joda.time.ReadableDuration) duration86);
        org.joda.time.ReadableInstant readableInstant89 = null;
        org.joda.time.Interval interval90 = duration86.toIntervalTo(readableInstant89);
        org.joda.time.Interval interval91 = interval90.toInterval();
        org.joda.time.DateTime dateTime92 = interval91.getEnd();
        org.joda.time.Period period93 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime81, (org.joda.time.ReadableInstant) dateTime92);
        org.joda.time.Period period94 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration68, (org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.Duration duration95 = period59.toDurationFrom((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.Period period96 = duration56.toPeriodFrom((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.Duration duration97 = duration1.plus((org.joda.time.ReadableDuration) duration56);
        org.joda.time.Duration duration98 = duration1.toDuration();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(interval79);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(duration83);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(interval90);
        org.junit.Assert.assertNotNull(interval91);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertNotNull(duration95);
        org.junit.Assert.assertNotNull(period96);
        org.junit.Assert.assertNotNull(duration97);
        org.junit.Assert.assertNotNull(duration98);
    }

    @Test
    public void test15708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15708");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod1.addMinutes((int) (short) 1);
        mutablePeriod1.addSeconds((int) (short) 100);
        mutablePeriod1.setPeriod(1644572096572L, 1644572091575L);
        org.joda.time.Period period10 = new org.joda.time.Period(1L);
        org.joda.time.Period period12 = period10.withYears((int) ' ');
        org.joda.time.Period period14 = period12.minusDays(9);
        org.joda.time.Period period16 = period14.withMillis((int) ' ');
        org.joda.time.Days days17 = org.joda.time.Days.FOUR;
        org.joda.time.Days days19 = days17.multipliedBy((-1));
        org.joda.time.Days days21 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.PeriodType periodType22 = days21.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod23 = days21.toMutablePeriod();
        org.joda.time.Days days24 = days19.plus(days21);
        org.joda.time.Duration duration26 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration28 = duration26.plus(1644572076849L);
        org.joda.time.Days days29 = duration26.toStandardDays();
        org.joda.time.Period period30 = days29.toPeriod();
        java.lang.String str31 = days29.toString();
        org.joda.time.Days days32 = org.joda.time.Days.FOUR;
        org.joda.time.Days days34 = days32.multipliedBy((-1));
        boolean boolean35 = days29.isGreaterThan(days34);
        boolean boolean36 = days24.isGreaterThan(days29);
        org.joda.time.DurationFieldType durationFieldType37 = days29.getFieldType();
        int int38 = period14.indexOf(durationFieldType37);
        boolean boolean39 = mutablePeriod1.isSupported(durationFieldType37);
        mutablePeriod1.setPeriod((-100), (int) (byte) 100, (-2147483646), (-97), 0, 443, (-963), 2719);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "P0D" + "'", str31, "P0D");
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test15709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15709");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(8);
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days4 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.Days days5 = days2.plus(days4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = days5.getPeriodType();
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) days5);
        org.joda.time.Days days10 = days5.multipliedBy(142);
        org.joda.time.Days days12 = days5.dividedBy(601);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days12);
    }

    @Test
    public void test15710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15710");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType4);
        mutablePeriod5.setYears(0);
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration9, chronology10);
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        java.lang.Object obj15 = null;
        org.joda.time.Duration duration16 = new org.joda.time.Duration(obj15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration16);
        boolean boolean18 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Interval interval20 = duration16.toIntervalTo(readableInstant19);
        org.joda.time.Interval interval21 = interval20.toInterval();
        org.joda.time.DateTime dateTime22 = interval21.getEnd();
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        java.lang.Object obj26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(obj26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration27);
        boolean boolean29 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        org.joda.time.Interval interval32 = interval31.toInterval();
        org.joda.time.DateTime dateTime33 = interval32.getEnd();
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, (org.joda.time.ReadableInstant) dateTime22);
        java.lang.String str36 = dateTime22.toString();
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType41);
        mutablePeriod42.setYears(0);
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology47 = null;
        mutablePeriod42.setPeriod((org.joda.time.ReadableDuration) duration46, chronology47);
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant51 = null;
        java.lang.Object obj52 = null;
        org.joda.time.Duration duration53 = new org.joda.time.Duration(obj52);
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant51, (org.joda.time.ReadableDuration) duration53);
        boolean boolean55 = duration50.isShorterThan((org.joda.time.ReadableDuration) duration53);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Interval interval57 = duration53.toIntervalTo(readableInstant56);
        org.joda.time.Interval interval58 = interval57.toInterval();
        org.joda.time.DateTime dateTime59 = interval58.getEnd();
        org.joda.time.Duration duration61 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant62 = null;
        java.lang.Object obj63 = null;
        org.joda.time.Duration duration64 = new org.joda.time.Duration(obj63);
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant62, (org.joda.time.ReadableDuration) duration64);
        boolean boolean66 = duration61.isShorterThan((org.joda.time.ReadableDuration) duration64);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Interval interval68 = duration64.toIntervalTo(readableInstant67);
        org.joda.time.Interval interval69 = interval68.toInterval();
        org.joda.time.DateTime dateTime70 = interval69.getEnd();
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime59, (org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Period period72 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.PeriodType periodType73 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period74 = duration38.toPeriodTo((org.joda.time.ReadableInstant) dateTime59, periodType73);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Minutes minutes76 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.PeriodType periodType77 = minutes76.getPeriodType();
        org.joda.time.Period period78 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime59, periodType77);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period80 = period78.withDays((-41));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(dateTime33);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2022-02-11T09:44:33.063Z" + "'", str36, "2022-02-11T09:44:33.063Z");
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(minutes76);
        org.junit.Assert.assertNotNull(periodType77);
        org.junit.Assert.assertNotNull(period78);
    }

    @Test
    public void test15711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15711");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (-963));
        org.joda.time.Period period2 = period1.toPeriod();
        int int3 = period2.getHours();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test15712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15712");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(35);
        org.joda.time.Period period3 = period1.minusYears((int) (short) 1);
        org.joda.time.Period period5 = period1.minusMinutes(456368756);
        org.joda.time.Period period7 = period1.plusYears(703);
        org.joda.time.Period period9 = period1.minusMinutes(952);
        org.joda.time.Period period11 = period9.plusMinutes(601);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test15713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15713");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.Days days3 = days2.negated();
        org.joda.time.Days days4 = org.joda.time.Days.ONE;
        org.joda.time.Days days5 = days4.negated();
        boolean boolean6 = days3.isGreaterThan(days5);
        org.joda.time.Days days7 = days0.plus(days5);
        int int8 = days0.getDays();
        org.joda.time.Days days10 = days0.minus(2147483647);
        java.lang.String str11 = days10.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P-2147483646D" + "'", str11, "P-2147483646D");
    }

    @Test
    public void test15714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15714");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        long long10 = interval8.toDurationMillis();
        org.joda.time.Interval interval11 = interval8.toInterval();
        org.joda.time.Days days12 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.MutableInterval mutableInterval13 = interval8.toMutableInterval();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        java.lang.Object obj17 = null;
        org.joda.time.Duration duration18 = new org.joda.time.Duration(obj17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration18);
        boolean boolean20 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Interval interval22 = duration18.toIntervalTo(readableInstant21);
        org.joda.time.Interval interval23 = interval22.toInterval();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        boolean boolean25 = interval8.isBefore((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Chronology chronology26 = interval22.getChronology();
        org.joda.time.Interval interval27 = interval22.toInterval();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(interval27);
    }

    @Test
    public void test15715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15715");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT-99H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15716");
        org.joda.time.Period period1 = new org.joda.time.Period(1L);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Period period4 = period1.plus((org.joda.time.ReadablePeriod) weeks3);
        int int5 = period4.getMinutes();
        int[] intArray6 = period4.getValues();
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period9 = period4.withDays((-101));
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period12 = period9.withFieldAdded(durationFieldType10, 1);
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks15 = weeks14.negated();
        org.joda.time.Weeks weeks16 = weeks15.negated();
        org.joda.time.Weeks weeks18 = weeks15.plus((int) ' ');
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks21 = weeks20.negated();
        org.joda.time.Weeks weeks22 = weeks21.negated();
        org.joda.time.Weeks weeks24 = weeks21.plus((int) ' ');
        boolean boolean25 = weeks15.isGreaterThan(weeks21);
        org.joda.time.MutablePeriod mutablePeriod26 = weeks15.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType27 = weeks15.getFieldType();
        boolean boolean28 = period9.isSupported(durationFieldType27);
        org.joda.time.Weeks weeks29 = period9.toStandardWeeks();
        org.joda.time.Weeks weeks31 = weeks29.dividedBy(30);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, -1, 0, 0, 0, 0, 1]");
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(weeks31);
    }

    @Test
    public void test15717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15717");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType2);
        mutablePeriod3.addMillis((-1));
        mutablePeriod3.addHours(10);
        int int8 = mutablePeriod3.getDays();
        mutablePeriod3.setMillis((-2));
        mutablePeriod3.setValue(7, 19034);
        mutablePeriod3.setHours((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setValue(187, (-36));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 187");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test15718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15718");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("2022-02-11T09:37:36.587Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:37:36.587Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15719");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Hours hours1 = org.joda.time.Hours.hoursIn(readableInterval0);
        org.joda.time.Hours hours3 = hours1.minus((int) (byte) 100);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        java.lang.Object obj7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(obj7);
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration8);
        boolean boolean10 = duration5.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Interval interval12 = duration8.toIntervalTo(readableInstant11);
        org.joda.time.Interval interval13 = interval12.toInterval();
        org.joda.time.Hours hours14 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval13);
        org.joda.time.Hours hours16 = hours14.dividedBy(1);
        org.joda.time.Hours hours18 = hours14.minus((int) (short) 1);
        boolean boolean19 = hours1.isGreaterThan(hours18);
        org.joda.time.Hours hours21 = hours1.plus(32);
        org.joda.time.DurationFieldType durationFieldType22 = hours21.getFieldType();
        java.lang.String str23 = hours21.toString();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT32H" + "'", str23, "PT32H");
    }

    @Test
    public void test15720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15720");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(obj5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6);
        boolean boolean8 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration13.toIntervalTo(readableInstant16);
        org.joda.time.Interval interval18 = interval17.toInterval();
        org.joda.time.DateTime dateTime19 = interval18.getEnd();
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        java.lang.Object obj23 = null;
        org.joda.time.Duration duration24 = new org.joda.time.Duration(obj23);
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant22, (org.joda.time.ReadableDuration) duration24);
        boolean boolean26 = duration21.isShorterThan((org.joda.time.ReadableDuration) duration24);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Interval interval28 = duration24.toIntervalTo(readableInstant27);
        org.joda.time.Interval interval29 = interval28.toInterval();
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant34 = null;
        java.lang.Object obj35 = null;
        org.joda.time.Duration duration36 = new org.joda.time.Duration(obj35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration36);
        boolean boolean38 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration36);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.Minutes minutes41 = org.joda.time.Minutes.minutesIn(readableInterval40);
        java.lang.String str42 = minutes41.toString();
        org.joda.time.PeriodType periodType43 = minutes41.getPeriodType();
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration36, readableInstant39, periodType43);
        org.joda.time.PeriodType periodType45 = periodType43.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateTime30, periodType45);
        org.joda.time.PeriodType periodType47 = periodType45.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 30, 1644572122681L, periodType45);
        int int49 = mutablePeriod48.getYears();
        org.joda.time.DurationFieldType[] durationFieldTypeArray50 = mutablePeriod48.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod48.addMillis((-369700));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT0M" + "'", str42, "PT0M");
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray50);
    }

    @Test
    public void test15721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15721");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        java.lang.String str7 = period6.toString();
        org.joda.time.MutablePeriod mutablePeriod8 = period6.toMutablePeriod();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration13.toIntervalTo(readableInstant16);
        long long18 = interval17.getStartMillis();
        mutablePeriod8.setPeriod((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Minutes minutes20 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Minutes minutes22 = minutes20.dividedBy((int) (short) 1);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType25 = periodType24.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(periodType25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(10L, periodType25);
        int int28 = mutablePeriod27.getMillis();
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration33 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration36 = duration33.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration38 = duration30.withDurationAdded((org.joda.time.ReadableDuration) duration33, (int) (short) 1);
        org.joda.time.Duration duration41 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration44 = duration41.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration46 = duration30.withDurationAdded((org.joda.time.ReadableDuration) duration44, (int) (short) 100);
        mutablePeriod27.add((org.joda.time.ReadableDuration) duration46);
        org.joda.time.Minutes minutes48 = duration46.toStandardMinutes();
        boolean boolean49 = minutes22.isLessThan(minutes48);
        org.joda.time.Minutes minutes51 = minutes48.multipliedBy(54);
        org.joda.time.Duration duration53 = org.joda.time.Duration.millis((long) '4');
        long long54 = duration53.getMillis();
        org.joda.time.Minutes minutes55 = duration53.toStandardMinutes();
        org.joda.time.PeriodType periodType56 = minutes55.getPeriodType();
        org.joda.time.Minutes minutes58 = minutes55.dividedBy(727);
        org.joda.time.Duration duration59 = minutes58.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType60 = minutes58.getFieldType();
        boolean boolean61 = minutes48.isSupported(durationFieldType60);
        org.joda.time.Duration duration63 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant64 = null;
        java.lang.Object obj65 = null;
        org.joda.time.Duration duration66 = new org.joda.time.Duration(obj65);
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant64, (org.joda.time.ReadableDuration) duration66);
        boolean boolean68 = duration63.isShorterThan((org.joda.time.ReadableDuration) duration66);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Interval interval70 = duration66.toIntervalTo(readableInstant69);
        long long71 = interval70.getStartMillis();
        org.joda.time.Minutes minutes72 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval70);
        org.joda.time.DurationFieldType durationFieldType73 = org.joda.time.DurationFieldType.years();
        int int74 = minutes72.get(durationFieldType73);
        org.joda.time.Minutes minutes75 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes76 = minutes75.negated();
        org.joda.time.Duration duration78 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant79 = null;
        java.lang.Object obj80 = null;
        org.joda.time.Duration duration81 = new org.joda.time.Duration(obj80);
        org.joda.time.Period period82 = new org.joda.time.Period(readableInstant79, (org.joda.time.ReadableDuration) duration81);
        boolean boolean83 = duration78.isShorterThan((org.joda.time.ReadableDuration) duration81);
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.Interval interval85 = duration81.toIntervalTo(readableInstant84);
        org.joda.time.Duration duration88 = new org.joda.time.Duration((long) 'a', (long) 0);
        boolean boolean89 = duration81.equals((java.lang.Object) 'a');
        org.joda.time.Minutes minutes90 = duration81.toStandardMinutes();
        org.joda.time.Minutes minutes91 = minutes90.negated();
        org.joda.time.Minutes minutes92 = minutes75.minus(minutes91);
        org.joda.time.Minutes minutes94 = minutes91.minus(35);
        org.joda.time.Minutes minutes95 = minutes72.plus(minutes94);
        org.joda.time.DurationFieldType durationFieldType96 = minutes94.getFieldType();
        boolean boolean97 = minutes48.isGreaterThan(minutes94);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.097S" + "'", str7, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644572673271L + "'", long18 == 1644572673271L);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 52L + "'", long54 == 52L);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(interval70);
// flaky:         org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1644572673272L + "'", long71 == 1644572673272L);
        org.junit.Assert.assertNotNull(minutes72);
        org.junit.Assert.assertNotNull(durationFieldType73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(minutes75);
        org.junit.Assert.assertNotNull(minutes76);
        org.junit.Assert.assertNotNull(duration78);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(interval85);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(minutes90);
        org.junit.Assert.assertNotNull(minutes91);
        org.junit.Assert.assertNotNull(minutes92);
        org.junit.Assert.assertNotNull(minutes94);
        org.junit.Assert.assertNotNull(minutes95);
        org.junit.Assert.assertNotNull(durationFieldType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test15722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15722");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = weeks2.negated();
        org.joda.time.Weeks weeks5 = weeks2.plus((int) ' ');
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks8 = weeks7.negated();
        org.joda.time.Weeks weeks9 = weeks8.negated();
        org.joda.time.Weeks weeks11 = weeks8.plus((int) ' ');
        boolean boolean12 = weeks2.isGreaterThan(weeks8);
        org.joda.time.DurationFieldType durationFieldType13 = weeks2.getFieldType();
        org.joda.time.Weeks weeks15 = weeks2.plus(36000000);
        org.joda.time.Weeks weeks17 = weeks2.dividedBy(231);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
    }

    @Test
    public void test15723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15723");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(1644572098650L, periodType2, chronology4);
        int int6 = mutablePeriod5.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test15724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15724");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval9);
        org.joda.time.Hours hours12 = hours10.dividedBy(1);
        org.joda.time.Hours hours14 = hours10.minus((int) (short) 1);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        java.lang.Object obj18 = null;
        org.joda.time.Duration duration19 = new org.joda.time.Duration(obj18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration19);
        boolean boolean21 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Interval interval23 = duration19.toIntervalTo(readableInstant22);
        org.joda.time.Interval interval24 = interval23.toInterval();
        org.joda.time.Hours hours25 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval24);
        org.joda.time.Hours hours27 = hours25.dividedBy(1);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.seconds();
        int int29 = hours27.get(durationFieldType28);
        int int30 = hours14.get(durationFieldType28);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant33 = null;
        java.lang.Object obj34 = null;
        org.joda.time.Duration duration35 = new org.joda.time.Duration(obj34);
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant33, (org.joda.time.ReadableDuration) duration35);
        boolean boolean37 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration35);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Interval interval39 = duration35.toIntervalTo(readableInstant38);
        org.joda.time.Interval interval40 = interval39.toInterval();
        org.joda.time.Hours hours41 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval40);
        org.joda.time.Hours hours42 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval40);
        org.joda.time.DurationFieldType durationFieldType43 = hours42.getFieldType();
        org.joda.time.Hours hours45 = hours42.minus(1);
        org.joda.time.Duration duration48 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = duration48.toPeriodFrom(readableInstant49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = duration48.toPeriod(chronology51);
        org.joda.time.Period period54 = period52.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.Hours hours56 = org.joda.time.Hours.hoursIn(readableInterval55);
        org.joda.time.Period period57 = period54.minus((org.joda.time.ReadablePeriod) hours56);
        org.joda.time.Hours hours58 = hours56.negated();
        org.joda.time.Hours hours59 = hours45.plus(hours58);
        org.joda.time.Duration duration61 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant62 = null;
        java.lang.Object obj63 = null;
        org.joda.time.Duration duration64 = new org.joda.time.Duration(obj63);
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant62, (org.joda.time.ReadableDuration) duration64);
        boolean boolean66 = duration61.isShorterThan((org.joda.time.ReadableDuration) duration64);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Interval interval68 = duration64.toIntervalTo(readableInstant67);
        org.joda.time.Interval interval69 = interval68.toInterval();
        org.joda.time.Hours hours70 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval69);
        org.joda.time.MutablePeriod mutablePeriod71 = hours70.toMutablePeriod();
        int int72 = hours70.getHours();
        org.joda.time.Hours hours73 = hours45.minus(hours70);
        boolean boolean74 = hours14.isLessThan(hours70);
        org.joda.time.ReadableInterval readableInterval75 = null;
        org.joda.time.Hours hours76 = org.joda.time.Hours.hoursIn(readableInterval75);
        org.joda.time.Hours hours78 = hours76.dividedBy(1);
        org.joda.time.Hours hours80 = hours78.multipliedBy((int) (short) -1);
        org.joda.time.Hours hours81 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours83 = hours81.dividedBy(32);
        java.lang.String str84 = hours83.toString();
        org.joda.time.Hours hours85 = hours78.minus(hours83);
        org.joda.time.Hours hours86 = hours14.plus(hours83);
        java.lang.String str87 = hours83.toString();
        org.joda.time.DurationFieldType durationFieldType88 = hours83.getFieldType();
        org.joda.time.DurationFieldType durationFieldType89 = hours83.getFieldType();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(hours41);
        org.junit.Assert.assertNotNull(hours42);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(hours45);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(hours56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(hours58);
        org.junit.Assert.assertNotNull(hours59);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(hours70);
        org.junit.Assert.assertNotNull(mutablePeriod71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(hours73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(hours76);
        org.junit.Assert.assertNotNull(hours78);
        org.junit.Assert.assertNotNull(hours80);
        org.junit.Assert.assertNotNull(hours81);
        org.junit.Assert.assertNotNull(hours83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "PT0H" + "'", str84, "PT0H");
        org.junit.Assert.assertNotNull(hours85);
        org.junit.Assert.assertNotNull(hours86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "PT0H" + "'", str87, "PT0H");
        org.junit.Assert.assertNotNull(durationFieldType88);
        org.junit.Assert.assertNotNull(durationFieldType89);
    }

    @Test
    public void test15725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15725");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod();
        mutablePeriod4.setPeriod(100L, (long) (-1));
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, periodType8);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        java.lang.Object obj13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(obj13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration14);
        boolean boolean16 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration14.toIntervalTo(readableInstant17);
        org.joda.time.Interval interval19 = interval18.toInterval();
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        java.lang.Object obj24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(obj24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration25);
        boolean boolean27 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Interval interval29 = duration25.toIntervalTo(readableInstant28);
        org.joda.time.Interval interval30 = interval29.toInterval();
        org.joda.time.DateTime dateTime31 = interval30.getEnd();
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant35 = null;
        java.lang.Object obj36 = null;
        org.joda.time.Duration duration37 = new org.joda.time.Duration(obj36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant35, (org.joda.time.ReadableDuration) duration37);
        boolean boolean39 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration37);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Interval interval41 = duration37.toIntervalTo(readableInstant40);
        org.joda.time.Interval interval42 = interval41.toInterval();
        org.joda.time.DateTime dateTime43 = interval42.getEnd();
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant46 = null;
        java.lang.Object obj47 = null;
        org.joda.time.Duration duration48 = new org.joda.time.Duration(obj47);
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant46, (org.joda.time.ReadableDuration) duration48);
        boolean boolean50 = duration45.isShorterThan((org.joda.time.ReadableDuration) duration48);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Interval interval52 = duration48.toIntervalTo(readableInstant51);
        org.joda.time.Interval interval53 = interval52.toInterval();
        org.joda.time.DateTime dateTime54 = interval53.getEnd();
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Minutes minutes56 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DurationFieldType durationFieldType57 = minutes56.getFieldType();
        int int58 = mutablePeriod4.get(durationFieldType57);
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant63 = null;
        java.lang.Object obj64 = null;
        org.joda.time.Duration duration65 = new org.joda.time.Duration(obj64);
        org.joda.time.Period period66 = new org.joda.time.Period(readableInstant63, (org.joda.time.ReadableDuration) duration65);
        boolean boolean67 = duration62.isShorterThan((org.joda.time.ReadableDuration) duration65);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Interval interval69 = duration65.toIntervalTo(readableInstant68);
        org.joda.time.Interval interval70 = interval69.toInterval();
        org.joda.time.Chronology chronology71 = interval70.getChronology();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((-1L), chronology71);
        mutablePeriod4.add((-1L), chronology71);
        org.joda.time.Period period74 = new org.joda.time.Period(1644572168667L, (long) 456368756, chronology71);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod(1644572076849L, 1644572122577L, chronology71);
        mutablePeriod75.addWeeks(2147483642);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertNotNull(durationFieldType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(chronology71);
    }

    @Test
    public void test15726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15726");
        org.joda.time.Period period1 = org.joda.time.Period.months((-68));
        org.joda.time.Period period3 = period1.minusYears(13);
        int int4 = period3.getWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test15727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15727");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(periodType3);
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(10L, periodType3);
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(10L, periodType3);
        int int7 = mutablePeriod6.getMonths();
        int int8 = mutablePeriod6.getMonths();
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod6);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod6.addSeconds((-58));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(minutes9);
    }

    @Test
    public void test15728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15728");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("2022-02-11T09:39:05.328Z", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15729");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((-2));
        org.joda.time.DurationFieldType durationFieldType2 = weeks1.getFieldType();
        java.lang.String str3 = durationFieldType2.getName();
        java.lang.String str4 = durationFieldType2.toString();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "weeks" + "'", str3, "weeks");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "weeks" + "'", str4, "weeks");
    }

    @Test
    public void test15730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15730");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(obj1);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.Duration duration5 = duration2.minus((long) '4');
        org.joda.time.Minutes minutes6 = duration2.toStandardMinutes();
        org.joda.time.Period period7 = duration2.toPeriod();
        org.joda.time.Period period9 = period7.minusHours(703);
        java.lang.Class<?> wildcardClass10 = period9.getClass();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15731");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object) duration1, periodType7, chronology8);
        org.joda.time.DurationFieldType[] durationFieldTypeArray10 = mutablePeriod9.getFieldTypes();
        org.joda.time.Duration duration13 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = duration13.toPeriodFrom(readableInstant14);
        org.joda.time.Duration duration17 = duration13.plus((-1L));
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod9.setPeriod((org.joda.time.ReadableDuration) duration17, chronology18);
        java.lang.Object obj20 = mutablePeriod9.clone();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.setPeriod((-4), (int) (byte) -1, 798, (-41), 0, 100, 27409535, (-9700));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "PT0.098S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "PT0.098S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "PT0.098S");
    }

    @Test
    public void test15732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15732");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        org.joda.time.Period period8 = period6.minusYears((int) (byte) -1);
        org.joda.time.Period period10 = period6.plusMinutes((-1));
        org.joda.time.Duration duration13 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = duration13.toPeriodFrom(readableInstant14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = duration13.toPeriod(chronology16);
        org.joda.time.Period period19 = period17.withYears((int) (byte) 10);
        org.joda.time.Period period20 = period17.toPeriod();
        org.joda.time.Period period22 = period20.minusMinutes((int) ' ');
        org.joda.time.Period period24 = period20.minusSeconds((int) ' ');
        org.joda.time.Period period25 = period6.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period27 = period24.multipliedBy(13);
        org.joda.time.Period period29 = period24.withYears((-3));
        org.joda.time.Days days30 = period24.toStandardDays();
        org.joda.time.Duration duration32 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Period period33 = duration32.toPeriod();
        org.joda.time.Duration duration36 = duration32.withDurationAdded(100L, 10);
        org.joda.time.Days days37 = duration36.toStandardDays();
        org.joda.time.Days days39 = days37.multipliedBy((-34));
        org.joda.time.Days days41 = days39.dividedBy(7);
        org.joda.time.Days days42 = days30.plus(days41);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(days42);
    }

    @Test
    public void test15733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15733");
        org.joda.time.Period period1 = org.joda.time.Period.hours(456);
        org.joda.time.Period period3 = period1.plusYears(369700);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test15734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15734");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(1);
        org.joda.time.Period period3 = period1.withSeconds((-9700));
        org.joda.time.Period period5 = period3.minusHours((int) (byte) 100);
        org.joda.time.Period period7 = period5.minusSeconds(3);
        org.joda.time.Period period9 = period5.minusMillis(10);
        org.joda.time.Hours hours10 = period5.toStandardHours();
        org.joda.time.Hours hours11 = null;
        org.joda.time.Hours hours12 = hours10.minus(hours11);
        org.joda.time.Hours hours14 = hours12.multipliedBy(369700);
        org.joda.time.Hours hours16 = hours14.dividedBy(12);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours16);
    }

    @Test
    public void test15735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15735");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType8);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType12);
        mutablePeriod13.setYears(0);
        mutablePeriod9.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        mutablePeriod13.setWeeks((int) (byte) 10);
        mutablePeriod13.setMillis(18);
        mutablePeriod13.addDays((-2147483648));
    }

    @Test
    public void test15736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15736");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(obj1);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.Duration duration5 = duration2.plus((long) 'a');
        org.joda.time.ReadableInstant readableInstant6 = null;
        java.lang.Object obj7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(obj7);
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, readableInstant10);
        org.joda.time.Duration duration13 = org.joda.time.Duration.millis((long) '4');
        long long14 = duration13.getStandardDays();
        boolean boolean15 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        java.lang.Object obj19 = null;
        org.joda.time.Duration duration20 = new org.joda.time.Duration(obj19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration20);
        boolean boolean22 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        java.lang.Object obj26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(obj26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration27);
        boolean boolean29 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        org.joda.time.Interval interval32 = interval31.toInterval();
        org.joda.time.DateTime dateTime33 = interval32.getEnd();
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        java.lang.Object obj37 = null;
        org.joda.time.Duration duration38 = new org.joda.time.Duration(obj37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration38);
        boolean boolean40 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Interval interval42 = duration38.toIntervalTo(readableInstant41);
        org.joda.time.Interval interval43 = interval42.toInterval();
        org.joda.time.DateTime dateTime44 = interval43.getEnd();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant48 = null;
        java.lang.Object obj49 = null;
        org.joda.time.Duration duration50 = new org.joda.time.Duration(obj49);
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant48, (org.joda.time.ReadableDuration) duration50);
        boolean boolean52 = duration47.isShorterThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInterval readableInterval54 = null;
        org.joda.time.Minutes minutes55 = org.joda.time.Minutes.minutesIn(readableInterval54);
        java.lang.String str56 = minutes55.toString();
        org.joda.time.PeriodType periodType57 = minutes55.getPeriodType();
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration50, readableInstant53, periodType57);
        org.joda.time.PeriodType periodType59 = periodType57.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, (org.joda.time.ReadableInstant) dateTime44, periodType59);
        org.joda.time.Interval interval61 = duration8.toIntervalFrom((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Interval interval62 = duration2.toIntervalFrom((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Duration duration64 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant65 = null;
        java.lang.Object obj66 = null;
        org.joda.time.Duration duration67 = new org.joda.time.Duration(obj66);
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant65, (org.joda.time.ReadableDuration) duration67);
        boolean boolean69 = duration64.isShorterThan((org.joda.time.ReadableDuration) duration67);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.ReadableInterval readableInterval71 = null;
        org.joda.time.Minutes minutes72 = org.joda.time.Minutes.minutesIn(readableInterval71);
        java.lang.String str73 = minutes72.toString();
        org.joda.time.PeriodType periodType74 = minutes72.getPeriodType();
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration67, readableInstant70, periodType74);
        org.joda.time.Duration duration77 = duration67.withMillis((long) 'a');
        org.joda.time.Duration duration79 = org.joda.time.Duration.standardHours(1644572078660L);
        org.joda.time.Duration duration80 = duration77.plus((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Duration duration82 = duration77.minus(5920459527891600000L);
        org.joda.time.Minutes minutes84 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType85 = minutes84.getFieldType();
        org.joda.time.Minutes minutes86 = minutes84.negated();
        org.joda.time.PeriodType periodType87 = minutes84.getPeriodType();
        org.joda.time.PeriodType periodType88 = periodType87.withHoursRemoved();
        org.joda.time.PeriodType periodType89 = periodType88.withHoursRemoved();
        org.joda.time.PeriodType periodType90 = periodType89.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableDuration) duration77, periodType89);
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = null;
        boolean boolean93 = dateTime44.isSupported(dateTimeFieldType92);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PT0M" + "'", str56, "PT0M");
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(minutes72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "PT0M" + "'", str73, "PT0M");
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertNotNull(minutes84);
        org.junit.Assert.assertNotNull(durationFieldType85);
        org.junit.Assert.assertNotNull(minutes86);
        org.junit.Assert.assertNotNull(periodType87);
        org.junit.Assert.assertNotNull(periodType88);
        org.junit.Assert.assertNotNull(periodType89);
        org.junit.Assert.assertNotNull(periodType90);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test15737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15737");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant9 = null;
        java.lang.Object obj10 = null;
        org.joda.time.Duration duration11 = new org.joda.time.Duration(obj10);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, (org.joda.time.ReadableDuration) duration11);
        boolean boolean13 = duration8.isShorterThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Interval interval15 = duration11.toIntervalTo(readableInstant14);
        org.joda.time.Interval interval16 = interval15.toInterval();
        org.joda.time.DateTime dateTime17 = interval16.getEnd();
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        java.lang.Object obj21 = null;
        org.joda.time.Duration duration22 = new org.joda.time.Duration(obj21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration22);
        boolean boolean24 = duration19.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Interval interval26 = duration22.toIntervalTo(readableInstant25);
        org.joda.time.Interval interval27 = interval26.toInterval();
        org.joda.time.DateTime dateTime28 = interval27.getEnd();
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        java.lang.Object obj33 = null;
        org.joda.time.Duration duration34 = new org.joda.time.Duration(obj33);
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, (org.joda.time.ReadableDuration) duration34);
        boolean boolean36 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.Minutes minutes39 = org.joda.time.Minutes.minutesIn(readableInterval38);
        java.lang.String str40 = minutes39.toString();
        org.joda.time.PeriodType periodType41 = minutes39.getPeriodType();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration34, readableInstant37, periodType41);
        org.joda.time.PeriodType periodType43 = periodType41.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration4, (org.joda.time.ReadableInstant) dateTime28, periodType43);
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant47 = null;
        java.lang.Object obj48 = null;
        org.joda.time.Duration duration49 = new org.joda.time.Duration(obj48);
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, (org.joda.time.ReadableDuration) duration49);
        boolean boolean51 = duration46.isShorterThan((org.joda.time.ReadableDuration) duration49);
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((java.lang.Object) duration46, periodType52, chronology53);
        org.joda.time.Duration duration56 = org.joda.time.Duration.millis((long) '4');
        long long57 = duration56.getStandardDays();
        boolean boolean58 = duration46.isLongerThan((org.joda.time.ReadableDuration) duration56);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableDuration) duration56);
        mutablePeriod59.setPeriod((long) (-1));
        mutablePeriod59.setPeriod(1644572086619L);
        mutablePeriod59.addDays((int) (short) 0);
        mutablePeriod59.setSeconds((int) '#');
        mutablePeriod59.addDays((-27409538));
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT0M" + "'", str40, "PT0M");
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test15738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15738");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("2022-02-11T09:39:10.058Z", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15739");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType2);
        mutablePeriod3.setYears(0);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration7, chronology8);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        java.lang.Object obj13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(obj13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration14);
        boolean boolean16 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration14.toIntervalTo(readableInstant17);
        org.joda.time.Interval interval19 = interval18.toInterval();
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        java.lang.Object obj24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(obj24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration25);
        boolean boolean27 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Interval interval29 = duration25.toIntervalTo(readableInstant28);
        org.joda.time.Interval interval30 = interval29.toInterval();
        org.joda.time.DateTime dateTime31 = interval30.getEnd();
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1644572081298L, (long) (byte) 1);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration41 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration44 = duration41.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration46 = duration38.withDurationAdded((org.joda.time.ReadableDuration) duration41, (int) (short) 1);
        org.joda.time.Days days47 = duration46.toStandardDays();
        mutablePeriod36.add((org.joda.time.ReadableDuration) duration46);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableDuration) duration46);
        mutablePeriod49.setMillis((int) (byte) -1);
        mutablePeriod49.setWeeks(97);
        mutablePeriod49.setDays(0);
        org.joda.time.Chronology chronology58 = null;
        mutablePeriod49.setPeriod(1644572361300L, 1644572412437L, chronology58);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(days47);
    }

    @Test
    public void test15740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15740");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType8);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType12);
        mutablePeriod13.setYears(0);
        mutablePeriod9.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod13);
        mutablePeriod9.addHours((int) (byte) 1);
        mutablePeriod9.addSeconds((-101));
        mutablePeriod9.addMillis((int) '#');
        org.joda.time.Period period24 = new org.joda.time.Period(1L);
        int int25 = period24.getWeeks();
        org.joda.time.Period period27 = period24.plusMonths((int) '#');
        org.joda.time.Period period29 = period27.minusDays(100);
        org.joda.time.Period period31 = period29.minusMinutes((int) '#');
        mutablePeriod9.add((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Seconds seconds33 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType34 = seconds33.getFieldType();
        org.joda.time.Seconds seconds36 = seconds33.plus((-1));
        org.joda.time.DurationFieldType durationFieldType37 = seconds33.getFieldType();
        org.joda.time.Seconds seconds38 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds39 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType40 = seconds39.getFieldType();
        org.joda.time.Seconds seconds42 = seconds39.plus((-1));
        org.joda.time.Seconds seconds43 = org.joda.time.Seconds.TWO;
        java.lang.String str44 = seconds43.toString();
        org.joda.time.Seconds seconds45 = seconds42.plus(seconds43);
        org.joda.time.Seconds seconds46 = seconds38.minus(seconds43);
        org.joda.time.Seconds seconds47 = seconds33.plus(seconds38);
        org.joda.time.Seconds seconds49 = seconds38.dividedBy(8);
        int int50 = seconds49.getSeconds();
        org.joda.time.DurationFieldType durationFieldType51 = seconds49.getFieldType();
        org.joda.time.Period period53 = period29.withFieldAdded(durationFieldType51, (-52));
        org.joda.time.Period period55 = period53.withMinutes(17);
        org.joda.time.Period period57 = period53.plusSeconds((-4));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT2S" + "'", str44, "PT2S");
        org.junit.Assert.assertNotNull(seconds45);
        org.junit.Assert.assertNotNull(seconds46);
        org.junit.Assert.assertNotNull(seconds47);
        org.junit.Assert.assertNotNull(seconds49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
    }

    @Test
    public void test15741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15741");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(1644572213073L);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(1644572186988L);
        org.joda.time.Duration duration4 = duration1.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant7 = null;
        java.lang.Object obj8 = null;
        org.joda.time.Duration duration9 = new org.joda.time.Duration(obj8);
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration9);
        boolean boolean11 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType14);
        mutablePeriod15.setYears(0);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod15.setPeriod((org.joda.time.ReadableDuration) duration19, chronology20);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        java.lang.Object obj25 = null;
        org.joda.time.Duration duration26 = new org.joda.time.Duration(obj25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, (org.joda.time.ReadableDuration) duration26);
        boolean boolean28 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Interval interval30 = duration26.toIntervalTo(readableInstant29);
        org.joda.time.Interval interval31 = interval30.toInterval();
        org.joda.time.DateTime dateTime32 = interval31.getEnd();
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant35 = null;
        java.lang.Object obj36 = null;
        org.joda.time.Duration duration37 = new org.joda.time.Duration(obj36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant35, (org.joda.time.ReadableDuration) duration37);
        boolean boolean39 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration37);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Interval interval41 = duration37.toIntervalTo(readableInstant40);
        org.joda.time.Interval interval42 = interval41.toInterval();
        org.joda.time.DateTime dateTime43 = interval42.getEnd();
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration19, (org.joda.time.ReadableInstant) dateTime32);
        java.lang.String str46 = dateTime32.toString();
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType51);
        mutablePeriod52.setYears(0);
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology57 = null;
        mutablePeriod52.setPeriod((org.joda.time.ReadableDuration) duration56, chronology57);
        org.joda.time.Duration duration60 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant61 = null;
        java.lang.Object obj62 = null;
        org.joda.time.Duration duration63 = new org.joda.time.Duration(obj62);
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, (org.joda.time.ReadableDuration) duration63);
        boolean boolean65 = duration60.isShorterThan((org.joda.time.ReadableDuration) duration63);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Interval interval67 = duration63.toIntervalTo(readableInstant66);
        org.joda.time.Interval interval68 = interval67.toInterval();
        org.joda.time.DateTime dateTime69 = interval68.getEnd();
        org.joda.time.Duration duration71 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant72 = null;
        java.lang.Object obj73 = null;
        org.joda.time.Duration duration74 = new org.joda.time.Duration(obj73);
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant72, (org.joda.time.ReadableDuration) duration74);
        boolean boolean76 = duration71.isShorterThan((org.joda.time.ReadableDuration) duration74);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.Interval interval78 = duration74.toIntervalTo(readableInstant77);
        org.joda.time.Interval interval79 = interval78.toInterval();
        org.joda.time.DateTime dateTime80 = interval79.getEnd();
        org.joda.time.Period period81 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime69, (org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.Period period82 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration56, (org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.PeriodType periodType83 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period84 = duration48.toPeriodTo((org.joda.time.ReadableInstant) dateTime69, periodType83);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.Interval interval86 = duration6.toIntervalTo((org.joda.time.ReadableInstant) dateTime32);
        boolean boolean88 = dateTime32.equals((java.lang.Object) 1644572255421L);
        org.joda.time.Days days91 = org.joda.time.Days.FOUR;
        org.joda.time.Days days93 = days91.dividedBy((int) '#');
        org.joda.time.PeriodType periodType94 = days91.getPeriodType();
        org.joda.time.Period period95 = new org.joda.time.Period(0L, 1644572078660L, periodType94);
        org.joda.time.PeriodType periodType96 = periodType94.withMinutesRemoved();
        org.joda.time.Period period97 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration3, (org.joda.time.ReadableInstant) dateTime32, periodType96);
        int int98 = period97.getYears();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(dateTime43);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2022-02-11T09:44:33.762Z" + "'", str46, "2022-02-11T09:44:33.762Z");
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertNotNull(interval79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(periodType83);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(interval86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(days91);
        org.junit.Assert.assertNotNull(days93);
        org.junit.Assert.assertNotNull(periodType94);
        org.junit.Assert.assertNotNull(periodType96);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test15742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15742");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((-9700));
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test15743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15743");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Period period10 = interval9.toPeriod();
        java.lang.String str11 = interval9.toString();
        long long12 = interval9.getEndMillis();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        java.lang.Object obj16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(obj16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration17);
        boolean boolean19 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Interval interval21 = duration17.toIntervalTo(readableInstant20);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        java.lang.Object obj25 = null;
        org.joda.time.Duration duration26 = new org.joda.time.Duration(obj25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, (org.joda.time.ReadableDuration) duration26);
        boolean boolean28 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Interval interval30 = duration26.toIntervalTo(readableInstant29);
        org.joda.time.Interval interval31 = interval30.toInterval();
        org.joda.time.Hours hours32 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval31);
        org.joda.time.Hours hours33 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval31);
        boolean boolean34 = interval21.overlaps((org.joda.time.ReadableInterval) interval31);
        org.joda.time.MutableInterval mutableInterval35 = interval21.toMutableInterval();
        boolean boolean36 = interval9.overlaps((org.joda.time.ReadableInterval) mutableInterval35);
        org.joda.time.DateTime dateTime37 = interval9.getEnd();
        org.joda.time.Instant instant38 = dateTime37.toInstant();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(period10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022-02-11T09:44:33.808Z/2022-02-11T09:44:33.808Z" + "'", str11, "2022-02-11T09:44:33.808Z/2022-02-11T09:44:33.808Z");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1644572673808L + "'", long12 == 1644572673808L);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(mutableInterval35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(instant38);
    }

    @Test
    public void test15744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15744");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        java.lang.Object obj14 = null;
        org.joda.time.Duration duration15 = new org.joda.time.Duration(obj14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration15);
        boolean boolean17 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration15.toIntervalTo(readableInstant18);
        org.joda.time.Interval interval20 = interval19.toInterval();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        java.lang.Object obj24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(obj24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration25);
        boolean boolean27 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Interval interval29 = duration25.toIntervalTo(readableInstant28);
        boolean boolean30 = interval20.isAfter((org.joda.time.ReadableInterval) interval29);
        boolean boolean31 = interval9.contains((org.joda.time.ReadableInterval) interval20);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType34);
        mutablePeriod35.addMillis((-1));
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        java.lang.Object obj41 = null;
        org.joda.time.Duration duration42 = new org.joda.time.Duration(obj41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, (org.joda.time.ReadableDuration) duration42);
        boolean boolean44 = duration39.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Interval interval46 = duration42.toIntervalTo(readableInstant45);
        org.joda.time.Interval interval47 = interval46.toInterval();
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant50 = null;
        java.lang.Object obj51 = null;
        org.joda.time.Duration duration52 = new org.joda.time.Duration(obj51);
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant50, (org.joda.time.ReadableDuration) duration52);
        boolean boolean54 = duration49.isShorterThan((org.joda.time.ReadableDuration) duration52);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Interval interval56 = duration52.toIntervalTo(readableInstant55);
        boolean boolean57 = interval47.isAfter((org.joda.time.ReadableInterval) interval56);
        org.joda.time.Weeks weeks58 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval56);
        org.joda.time.Period period59 = interval56.toPeriod();
        mutablePeriod35.add((org.joda.time.ReadableInterval) interval56);
        long long61 = interval56.getEndMillis();
        boolean boolean62 = interval20.isAfter((org.joda.time.ReadableInterval) interval56);
        org.joda.time.Duration duration64 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant65 = null;
        java.lang.Object obj66 = null;
        org.joda.time.Duration duration67 = new org.joda.time.Duration(obj66);
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant65, (org.joda.time.ReadableDuration) duration67);
        boolean boolean69 = duration64.isShorterThan((org.joda.time.ReadableDuration) duration67);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Interval interval71 = duration67.toIntervalTo(readableInstant70);
        org.joda.time.Interval interval72 = interval71.toInterval();
        org.joda.time.DateTime dateTime73 = interval72.getEnd();
        org.joda.time.Duration duration75 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant76 = null;
        java.lang.Object obj77 = null;
        org.joda.time.Duration duration78 = new org.joda.time.Duration(obj77);
        org.joda.time.Period period79 = new org.joda.time.Period(readableInstant76, (org.joda.time.ReadableDuration) duration78);
        boolean boolean80 = duration75.isShorterThan((org.joda.time.ReadableDuration) duration78);
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.Interval interval82 = duration78.toIntervalTo(readableInstant81);
        org.joda.time.Interval interval83 = interval82.toInterval();
        org.joda.time.DateTime dateTime84 = interval83.getEnd();
        org.joda.time.Period period85 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime73, (org.joda.time.ReadableInstant) dateTime84);
        boolean boolean86 = interval56.contains((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Chronology chronology87 = dateTime73.getChronology();
        org.joda.time.ReadableInstant readableInstant88 = null;
        java.lang.Object obj89 = null;
        org.joda.time.Duration duration90 = new org.joda.time.Duration(obj89);
        org.joda.time.Period period91 = new org.joda.time.Period(readableInstant88, (org.joda.time.ReadableDuration) duration90);
        org.joda.time.Duration duration93 = duration90.minus((long) '4');
        java.lang.String str94 = duration90.toString();
        long long95 = duration90.getStandardDays();
        org.joda.time.Period period96 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime73, (org.joda.time.ReadableDuration) duration90);
        org.joda.time.Period period97 = period96.normalizedStandard();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(weeks58);
        org.junit.Assert.assertNotNull(period59);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1644572673842L + "'", long61 == 1644572673842L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertNotNull(interval83);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(chronology87);
        org.junit.Assert.assertNotNull(duration93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "PT0S" + "'", str94, "PT0S");
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 0L + "'", long95 == 0L);
        org.junit.Assert.assertNotNull(period97);
    }

    @Test
    public void test15745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15745");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(obj1);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.Duration duration5 = duration2.plus((long) 'a');
        org.joda.time.ReadableInstant readableInstant6 = null;
        java.lang.Object obj7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(obj7);
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration8, readableInstant10);
        org.joda.time.Duration duration13 = org.joda.time.Duration.millis((long) '4');
        long long14 = duration13.getStandardDays();
        boolean boolean15 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        java.lang.Object obj19 = null;
        org.joda.time.Duration duration20 = new org.joda.time.Duration(obj19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration20);
        boolean boolean22 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        java.lang.Object obj26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(obj26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration27);
        boolean boolean29 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        org.joda.time.Interval interval32 = interval31.toInterval();
        org.joda.time.DateTime dateTime33 = interval32.getEnd();
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        java.lang.Object obj37 = null;
        org.joda.time.Duration duration38 = new org.joda.time.Duration(obj37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration38);
        boolean boolean40 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Interval interval42 = duration38.toIntervalTo(readableInstant41);
        org.joda.time.Interval interval43 = interval42.toInterval();
        org.joda.time.DateTime dateTime44 = interval43.getEnd();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant48 = null;
        java.lang.Object obj49 = null;
        org.joda.time.Duration duration50 = new org.joda.time.Duration(obj49);
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant48, (org.joda.time.ReadableDuration) duration50);
        boolean boolean52 = duration47.isShorterThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInterval readableInterval54 = null;
        org.joda.time.Minutes minutes55 = org.joda.time.Minutes.minutesIn(readableInterval54);
        java.lang.String str56 = minutes55.toString();
        org.joda.time.PeriodType periodType57 = minutes55.getPeriodType();
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration50, readableInstant53, periodType57);
        org.joda.time.PeriodType periodType59 = periodType57.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, (org.joda.time.ReadableInstant) dateTime44, periodType59);
        org.joda.time.Interval interval61 = duration8.toIntervalFrom((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Interval interval62 = duration2.toIntervalFrom((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Period period63 = interval62.toPeriod();
        org.joda.time.Duration duration64 = interval62.toDuration();
        org.joda.time.MutableInterval mutableInterval65 = interval62.toMutableInterval();
        org.joda.time.DateTime dateTime66 = interval62.getStart();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PT0M" + "'", str56, "PT0M");
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(mutableInterval65);
        org.junit.Assert.assertNotNull(dateTime66);
    }

    @Test
    public void test15746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15746");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        java.lang.Object obj13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(obj13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration14);
        boolean boolean16 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration14.toIntervalTo(readableInstant17);
        boolean boolean19 = interval9.isAfter((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        java.lang.Object obj24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(obj24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration25);
        boolean boolean27 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Interval interval29 = duration25.toIntervalTo(readableInstant28);
        org.joda.time.Interval interval30 = interval29.toInterval();
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant33 = null;
        java.lang.Object obj34 = null;
        org.joda.time.Duration duration35 = new org.joda.time.Duration(obj34);
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant33, (org.joda.time.ReadableDuration) duration35);
        boolean boolean37 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration35);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Interval interval39 = duration35.toIntervalTo(readableInstant38);
        boolean boolean40 = interval30.isAfter((org.joda.time.ReadableInterval) interval39);
        org.joda.time.Period period41 = interval39.toPeriod();
        boolean boolean42 = interval18.isAfter((org.joda.time.ReadableInterval) interval39);
        org.joda.time.ReadableInterval readableInterval43 = null;
        boolean boolean44 = interval39.isAfter(readableInterval43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        boolean boolean46 = interval39.contains(readableInstant45);
        long long47 = interval39.toDurationMillis();
        org.joda.time.Chronology chronology48 = interval39.getChronology();
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant51 = null;
        java.lang.Object obj52 = null;
        org.joda.time.Duration duration53 = new org.joda.time.Duration(obj52);
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant51, (org.joda.time.ReadableDuration) duration53);
        boolean boolean55 = duration50.isShorterThan((org.joda.time.ReadableDuration) duration53);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Interval interval57 = duration53.toIntervalTo(readableInstant56);
        org.joda.time.Interval interval58 = interval57.toInterval();
        long long59 = interval57.toDurationMillis();
        org.joda.time.Interval interval60 = interval57.toInterval();
        org.joda.time.Duration duration61 = interval57.toDuration();
        long long62 = interval57.getEndMillis();
        boolean boolean63 = interval39.contains((org.joda.time.ReadableInterval) interval57);
        org.joda.time.DateTime dateTime64 = interval57.getStart();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(duration61);
// flaky:         org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1644572673923L + "'", long62 == 1644572673923L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(dateTime64);
    }

    @Test
    public void test15747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15747");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-2147483648));
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = seconds2.plus((-1));
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        java.lang.String str7 = seconds6.toString();
        org.joda.time.Seconds seconds8 = seconds5.plus(seconds6);
        org.joda.time.Seconds seconds10 = seconds8.multipliedBy(3);
        int int11 = seconds10.size();
        org.joda.time.DurationFieldType durationFieldType12 = seconds10.getFieldType();
        int int13 = period1.get(durationFieldType12);
        org.joda.time.Period period15 = period1.plusWeeks(35);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT2S" + "'", str7, "PT2S");
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test15748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15748");
        org.joda.time.Period period1 = org.joda.time.Period.hours(2147483647);
        org.joda.time.Period period3 = period1.withYears(4);
        org.joda.time.Period period5 = period3.withMonths(2719);
        org.joda.time.Period period7 = new org.joda.time.Period(1L);
        org.joda.time.Period period9 = period7.minusMonths((-101));
        org.joda.time.Period period11 = period9.minusMinutes((int) (short) 10);
        boolean boolean12 = period5.equals((java.lang.Object) period11);
        org.joda.time.Period period14 = period11.withYears((-840));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test15749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15749");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes1 = minutes0.negated();
        java.lang.String str2 = minutes0.toString();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Duration duration4 = minutes0.toStandardDuration();
        org.joda.time.Duration duration5 = duration4.toDuration();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0M" + "'", str2, "PT0M");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test15750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15750");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(1644572111353L);
        mutablePeriod1.addSeconds(18);
        int int4 = mutablePeriod1.getMonths();
        int int5 = mutablePeriod1.size();
        int int6 = mutablePeriod1.getMonths();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test15751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15751");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration7 = duration4.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration9 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration4, (int) (short) 1);
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration15 = duration12.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration17 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration15, (int) (short) 100);
        org.joda.time.ReadableInstant readableInstant18 = null;
        java.lang.Object obj19 = null;
        org.joda.time.Duration duration20 = new org.joda.time.Duration(obj19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration20, readableInstant22);
        org.joda.time.Duration duration25 = org.joda.time.Duration.millis((long) '4');
        long long26 = duration25.getStandardDays();
        boolean boolean27 = duration20.isLongerThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant30 = null;
        java.lang.Object obj31 = null;
        org.joda.time.Duration duration32 = new org.joda.time.Duration(obj31);
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant30, (org.joda.time.ReadableDuration) duration32);
        boolean boolean34 = duration29.isShorterThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant37 = null;
        java.lang.Object obj38 = null;
        org.joda.time.Duration duration39 = new org.joda.time.Duration(obj38);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant37, (org.joda.time.ReadableDuration) duration39);
        boolean boolean41 = duration36.isShorterThan((org.joda.time.ReadableDuration) duration39);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Interval interval43 = duration39.toIntervalTo(readableInstant42);
        org.joda.time.Interval interval44 = interval43.toInterval();
        org.joda.time.DateTime dateTime45 = interval44.getEnd();
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant48 = null;
        java.lang.Object obj49 = null;
        org.joda.time.Duration duration50 = new org.joda.time.Duration(obj49);
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant48, (org.joda.time.ReadableDuration) duration50);
        boolean boolean52 = duration47.isShorterThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Interval interval54 = duration50.toIntervalTo(readableInstant53);
        org.joda.time.Interval interval55 = interval54.toInterval();
        org.joda.time.DateTime dateTime56 = interval55.getEnd();
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant60 = null;
        java.lang.Object obj61 = null;
        org.joda.time.Duration duration62 = new org.joda.time.Duration(obj61);
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, (org.joda.time.ReadableDuration) duration62);
        boolean boolean64 = duration59.isShorterThan((org.joda.time.ReadableDuration) duration62);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.ReadableInterval readableInterval66 = null;
        org.joda.time.Minutes minutes67 = org.joda.time.Minutes.minutesIn(readableInterval66);
        java.lang.String str68 = minutes67.toString();
        org.joda.time.PeriodType periodType69 = minutes67.getPeriodType();
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration62, readableInstant65, periodType69);
        org.joda.time.PeriodType periodType71 = periodType69.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, (org.joda.time.ReadableInstant) dateTime56, periodType71);
        org.joda.time.Interval interval73 = duration20.toIntervalFrom((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration75 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration78 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration81 = duration78.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration83 = duration75.withDurationAdded((org.joda.time.ReadableDuration) duration78, (int) (short) 1);
        org.joda.time.Duration duration86 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration89 = duration86.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration91 = duration75.withDurationAdded((org.joda.time.ReadableDuration) duration89, (int) (short) 100);
        org.joda.time.Period period92 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableDuration) duration91);
        org.joda.time.Interval interval93 = duration15.toIntervalTo((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Interval interval94 = interval93.toInterval();
        org.joda.time.Interval interval95 = interval94.toInterval();
        long long96 = interval94.toDurationMillis();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(minutes67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "PT0M" + "'", str68, "PT0M");
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(duration81);
        org.junit.Assert.assertNotNull(duration83);
        org.junit.Assert.assertNotNull(duration89);
        org.junit.Assert.assertNotNull(duration91);
        org.junit.Assert.assertNotNull(interval93);
        org.junit.Assert.assertNotNull(interval94);
        org.junit.Assert.assertNotNull(interval95);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 903L + "'", long96 == 903L);
    }

    @Test
    public void test15752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15752");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) -1);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.TWO;
        org.joda.time.DurationFieldType durationFieldType4 = weeks3.getFieldType();
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        java.lang.Object obj9 = null;
        org.joda.time.Duration duration10 = new org.joda.time.Duration(obj9);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration10);
        boolean boolean12 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Interval interval14 = duration10.toIntervalTo(readableInstant13);
        org.joda.time.Interval interval15 = interval14.toInterval();
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        java.lang.Object obj20 = null;
        org.joda.time.Duration duration21 = new org.joda.time.Duration(obj20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration21);
        boolean boolean23 = duration18.isShorterThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Interval interval25 = duration21.toIntervalTo(readableInstant24);
        org.joda.time.Interval interval26 = interval25.toInterval();
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant29 = null;
        java.lang.Object obj30 = null;
        org.joda.time.Duration duration31 = new org.joda.time.Duration(obj30);
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, (org.joda.time.ReadableDuration) duration31);
        boolean boolean33 = duration28.isShorterThan((org.joda.time.ReadableDuration) duration31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Interval interval35 = duration31.toIntervalTo(readableInstant34);
        boolean boolean36 = interval26.isAfter((org.joda.time.ReadableInterval) interval35);
        boolean boolean37 = interval15.contains((org.joda.time.ReadableInterval) interval26);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType40);
        mutablePeriod41.setYears(0);
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology46 = null;
        mutablePeriod41.setPeriod((org.joda.time.ReadableDuration) duration45, chronology46);
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant50 = null;
        java.lang.Object obj51 = null;
        org.joda.time.Duration duration52 = new org.joda.time.Duration(obj51);
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant50, (org.joda.time.ReadableDuration) duration52);
        boolean boolean54 = duration49.isShorterThan((org.joda.time.ReadableDuration) duration52);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Interval interval56 = duration52.toIntervalTo(readableInstant55);
        org.joda.time.Interval interval57 = interval56.toInterval();
        org.joda.time.DateTime dateTime58 = interval57.getEnd();
        org.joda.time.Duration duration60 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant61 = null;
        java.lang.Object obj62 = null;
        org.joda.time.Duration duration63 = new org.joda.time.Duration(obj62);
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, (org.joda.time.ReadableDuration) duration63);
        boolean boolean65 = duration60.isShorterThan((org.joda.time.ReadableDuration) duration63);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Interval interval67 = duration63.toIntervalTo(readableInstant66);
        org.joda.time.Interval interval68 = interval67.toInterval();
        org.joda.time.DateTime dateTime69 = interval68.getEnd();
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration45, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Duration duration73 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant74 = null;
        java.lang.Object obj75 = null;
        org.joda.time.Duration duration76 = new org.joda.time.Duration(obj75);
        org.joda.time.Period period77 = new org.joda.time.Period(readableInstant74, (org.joda.time.ReadableDuration) duration76);
        boolean boolean78 = duration73.isShorterThan((org.joda.time.ReadableDuration) duration76);
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.Interval interval80 = duration76.toIntervalTo(readableInstant79);
        org.joda.time.Interval interval81 = interval80.toInterval();
        org.joda.time.DateTime dateTime82 = interval81.getEnd();
        org.joda.time.PeriodType periodType84 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType85 = periodType84.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod(periodType85);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(10L, periodType85);
        org.joda.time.Period period88 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime82, periodType85);
        boolean boolean89 = interval26.isAfter((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Chronology chronology90 = dateTime58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod(0L, chronology90);
        org.joda.time.DurationField durationField92 = durationFieldType4.getField(chronology90);
        org.joda.time.Period period93 = new org.joda.time.Period((java.lang.Object) period2, chronology90);
        org.joda.time.Period period95 = period93.minusMinutes(456825);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(periodType84);
        org.junit.Assert.assertNotNull(periodType85);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(chronology90);
        org.junit.Assert.assertNotNull(durationField92);
        org.junit.Assert.assertNotNull(period95);
    }

    @Test
    public void test15753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15753");
        org.joda.time.Period period4 = new org.joda.time.Period(0, (int) (short) 10, 40, 54);
        org.joda.time.Period period6 = period4.plusWeeks(1);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test15754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15754");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval9);
        org.joda.time.Hours hours11 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval9);
        org.joda.time.DurationFieldType durationFieldType12 = hours11.getFieldType();
        org.joda.time.Hours hours14 = hours11.minus(1);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = duration17.toPeriodFrom(readableInstant18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = duration17.toPeriod(chronology20);
        org.joda.time.Period period23 = period21.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Hours hours25 = org.joda.time.Hours.hoursIn(readableInterval24);
        org.joda.time.Period period26 = period23.minus((org.joda.time.ReadablePeriod) hours25);
        org.joda.time.Hours hours27 = hours25.negated();
        org.joda.time.Hours hours28 = hours14.plus(hours27);
        org.joda.time.Hours hours29 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours30 = org.joda.time.Hours.ZERO;
        org.joda.time.Hours hours31 = hours29.minus(hours30);
        org.joda.time.DurationFieldType durationFieldType32 = hours30.getFieldType();
        boolean boolean33 = hours28.isLessThan(hours30);
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.Hours hours35 = org.joda.time.Hours.hoursIn(readableInterval34);
        org.joda.time.Hours hours37 = hours35.minus((int) (byte) 100);
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        java.lang.Object obj41 = null;
        org.joda.time.Duration duration42 = new org.joda.time.Duration(obj41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, (org.joda.time.ReadableDuration) duration42);
        boolean boolean44 = duration39.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Interval interval46 = duration42.toIntervalTo(readableInstant45);
        org.joda.time.Interval interval47 = interval46.toInterval();
        org.joda.time.Hours hours48 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval47);
        org.joda.time.Hours hours50 = hours48.dividedBy(1);
        org.joda.time.Hours hours52 = hours48.minus((int) (short) 1);
        boolean boolean53 = hours35.isGreaterThan(hours52);
        org.joda.time.Hours hours55 = hours35.plus(32);
        org.joda.time.Hours hours56 = hours30.plus(hours35);
        org.joda.time.Hours hours58 = org.joda.time.Hours.hours(32);
        org.joda.time.DurationFieldType durationFieldType59 = hours58.getFieldType();
        org.joda.time.Hours hours61 = hours58.multipliedBy(3);
        boolean boolean62 = hours56.isLessThan(hours58);
        java.lang.String str63 = hours58.toString();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertNotNull(hours31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(hours37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(hours48);
        org.junit.Assert.assertNotNull(hours50);
        org.junit.Assert.assertNotNull(hours52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(hours55);
        org.junit.Assert.assertNotNull(hours56);
        org.junit.Assert.assertNotNull(hours58);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertNotNull(hours61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PT32H" + "'", str63, "PT32H");
    }

    @Test
    public void test15755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15755");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("2022-02-11T09:37:54.747Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:37:54.747Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15756");
        org.joda.time.Period period1 = new org.joda.time.Period(1L);
        int int2 = period1.getWeeks();
        org.joda.time.Period period4 = period1.plusMonths((int) '#');
        org.joda.time.Period period6 = period4.minusDays(100);
        org.joda.time.Period period8 = period6.plusSeconds((int) (short) -1);
        org.joda.time.Period period9 = period6.toPeriod();
        java.lang.String str10 = period9.toString();
        org.joda.time.Duration duration13 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = duration13.toPeriodFrom(readableInstant14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = duration13.toPeriod(chronology16);
        org.joda.time.Period period19 = period17.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.Hours hours21 = org.joda.time.Hours.hoursIn(readableInterval20);
        org.joda.time.Period period22 = period19.minus((org.joda.time.ReadablePeriod) hours21);
        org.joda.time.Period period23 = period9.plus((org.joda.time.ReadablePeriod) hours21);
        org.joda.time.Hours hours24 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours25 = org.joda.time.Hours.ZERO;
        org.joda.time.Hours hours26 = hours24.minus(hours25);
        org.joda.time.DurationFieldType durationFieldType27 = hours25.getFieldType();
        int int28 = hours25.getHours();
        boolean boolean29 = hours21.isLessThan(hours25);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) ' ', chronology31);
        org.joda.time.Duration duration34 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration36 = duration34.plus(1644572076849L);
        mutablePeriod32.setPeriod((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Hours hours38 = duration36.toStandardHours();
        org.joda.time.Hours hours39 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours40 = hours38.minus(hours39);
        boolean boolean41 = hours21.isGreaterThan(hours39);
        org.joda.time.Hours hours43 = hours21.plus(59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P35M-100DT0.001S" + "'", str10, "P35M-100DT0.001S");
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(hours38);
        org.junit.Assert.assertNotNull(hours39);
        org.junit.Assert.assertNotNull(hours40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(hours43);
    }

    @Test
    public void test15757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15757");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        java.lang.Object obj13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(obj13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration14);
        boolean boolean16 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration14.toIntervalTo(readableInstant17);
        boolean boolean19 = interval9.isAfter((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Period period20 = interval18.toPeriod();
        org.joda.time.Period period21 = interval18.toPeriod();
        org.joda.time.Duration duration24 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = duration24.toPeriodFrom(readableInstant25);
        org.joda.time.Period period28 = period26.minusSeconds((int) '4');
        org.joda.time.Period period30 = period26.minusSeconds(10);
        org.joda.time.Period period32 = period26.withWeeks((int) (byte) -1);
        org.joda.time.Period period33 = period21.plus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period35 = period33.withHours(9);
        org.joda.time.MutablePeriod mutablePeriod36 = period33.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod37 = mutablePeriod36.copy();
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType40);
        mutablePeriod41.setYears(0);
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology46 = null;
        mutablePeriod41.setPeriod((org.joda.time.ReadableDuration) duration45, chronology46);
        mutablePeriod41.add(0, (-1), (int) (short) 1, (int) (byte) 0, (int) (byte) 0, 1, 10, (int) '4');
        int int57 = mutablePeriod41.getYears();
        mutablePeriod41.addMonths((int) (short) 0);
        mutablePeriod41.addSeconds(0);
        mutablePeriod41.addSeconds((-1));
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType65 = periodType64.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(periodType64);
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str68 = durationFieldType67.toString();
        boolean boolean69 = periodType64.isSupported(durationFieldType67);
        boolean boolean70 = mutablePeriod41.isSupported(durationFieldType67);
        java.lang.String str71 = durationFieldType67.getName();
        boolean boolean72 = mutablePeriod37.isSupported(durationFieldType67);
        mutablePeriod37.addWeeks(2147483639);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(mutablePeriod36);
        org.junit.Assert.assertNotNull(mutablePeriod37);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "weeks" + "'", str68, "weeks");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "weeks" + "'", str71, "weeks");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test15758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15758");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (short) -1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) ' ', chronology3);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType7);
        mutablePeriod8.setYears(0);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology13 = null;
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration12, chronology13);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        java.lang.Object obj18 = null;
        org.joda.time.Duration duration19 = new org.joda.time.Duration(obj18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration19);
        boolean boolean21 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Interval interval23 = duration19.toIntervalTo(readableInstant22);
        org.joda.time.Interval interval24 = interval23.toInterval();
        org.joda.time.DateTime dateTime25 = interval24.getEnd();
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant28 = null;
        java.lang.Object obj29 = null;
        org.joda.time.Duration duration30 = new org.joda.time.Duration(obj29);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration30);
        boolean boolean32 = duration27.isShorterThan((org.joda.time.ReadableDuration) duration30);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Interval interval34 = duration30.toIntervalTo(readableInstant33);
        org.joda.time.Interval interval35 = interval34.toInterval();
        org.joda.time.DateTime dateTime36 = interval35.getEnd();
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant41 = null;
        java.lang.Object obj42 = null;
        org.joda.time.Duration duration43 = new org.joda.time.Duration(obj42);
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, (org.joda.time.ReadableDuration) duration43);
        boolean boolean45 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Interval interval47 = duration43.toIntervalTo(readableInstant46);
        org.joda.time.Interval interval48 = interval47.toInterval();
        org.joda.time.DateTime dateTime49 = interval48.getEnd();
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType52 = periodType51.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(periodType52);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(10L, periodType52);
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime49, periodType52);
        org.joda.time.Duration duration56 = mutablePeriod4.toDurationFrom((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Duration duration57 = duration56.toDuration();
        long long58 = duration56.getStandardMinutes();
        mutablePeriod1.add((org.joda.time.ReadableDuration) duration56);
        mutablePeriod1.addYears((-53));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks62 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) mutablePeriod1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as years is not precise in the period P-53YT0.031S");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
    }

    @Test
    public void test15759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15759");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT0M");
        mutablePeriod1.addDays((-2147483648));
        mutablePeriod1.addHours((int) '4');
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test15760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15760");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        java.lang.String str1 = seconds0.toString();
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType4 = seconds3.getFieldType();
        org.joda.time.Seconds seconds6 = seconds3.plus((-1));
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        java.lang.String str8 = seconds7.toString();
        org.joda.time.Seconds seconds9 = seconds6.plus(seconds7);
        org.joda.time.Seconds seconds10 = seconds2.minus(seconds7);
        org.joda.time.PeriodType periodType11 = seconds2.getPeriodType();
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) seconds2);
        org.joda.time.Seconds seconds14 = seconds12.multipliedBy((int) '#');
        org.joda.time.Seconds seconds15 = seconds0.plus(seconds14);
        org.joda.time.Seconds seconds17 = seconds0.minus(876);
        org.joda.time.DurationFieldType durationFieldType18 = seconds17.getFieldType();
        org.joda.time.Seconds seconds20 = seconds17.minus(99);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PT2S" + "'", str1, "PT2S");
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT2S" + "'", str8, "PT2S");
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(seconds20);
    }

    @Test
    public void test15761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15761");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Duration duration4 = duration1.plus(1644572183716L);
        org.joda.time.Duration duration6 = duration1.plus(1644572231664L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        java.lang.Object obj8 = null;
        org.joda.time.Duration duration9 = new org.joda.time.Duration(obj8);
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration9);
        org.joda.time.Duration duration12 = duration9.plus((long) 'a');
        org.joda.time.Days days13 = duration12.toStandardDays();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardHours(1644572093756L);
        boolean boolean16 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        boolean boolean22 = duration19.isShorterThan(readableDuration21);
        boolean boolean23 = duration12.isLongerThan(readableDuration21);
        org.joda.time.Duration duration25 = duration6.withDurationAdded(readableDuration21, 53);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(duration25);
    }

    @Test
    public void test15762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15762");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        org.joda.time.Period period8 = period6.minusYears((int) (byte) -1);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.ZERO;
        org.joda.time.DurationFieldType durationFieldType10 = minutes9.getFieldType();
        org.joda.time.Period period12 = period8.withField(durationFieldType10, (int) (short) 10);
        org.joda.time.Period period14 = period12.withDays(34);
        int int15 = period14.getMillis();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
    }

    @Test
    public void test15763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15763");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, 1644572077926L, chronology2);
        org.joda.time.Period period5 = period3.withDays((int) (byte) 10);
        int int6 = period3.size();
        int[] intArray7 = period3.getValues();
        org.joda.time.Period period9 = period3.minusMillis((int) (short) 10);
        org.joda.time.Period period11 = period3.minusMonths(21262214);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 1, 1, 3, 9, 34, 37, 916]");
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test15764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15764");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (byte) 100);
        long long2 = duration1.getStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        java.lang.Object obj6 = null;
        org.joda.time.Duration duration7 = new org.joda.time.Duration(obj6);
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration7);
        boolean boolean9 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Interval interval11 = duration7.toIntervalTo(readableInstant10);
        org.joda.time.Interval interval12 = interval11.toInterval();
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        java.lang.Object obj17 = null;
        org.joda.time.Duration duration18 = new org.joda.time.Duration(obj17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration18);
        boolean boolean20 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Interval interval22 = duration18.toIntervalTo(readableInstant21);
        org.joda.time.Interval interval23 = interval22.toInterval();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        java.lang.Object obj27 = null;
        org.joda.time.Duration duration28 = new org.joda.time.Duration(obj27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration28);
        boolean boolean30 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Interval interval32 = duration28.toIntervalTo(readableInstant31);
        boolean boolean33 = interval23.isAfter((org.joda.time.ReadableInterval) interval32);
        boolean boolean34 = interval12.contains((org.joda.time.ReadableInterval) interval23);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType37);
        mutablePeriod38.setYears(0);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod38.setPeriod((org.joda.time.ReadableDuration) duration42, chronology43);
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant47 = null;
        java.lang.Object obj48 = null;
        org.joda.time.Duration duration49 = new org.joda.time.Duration(obj48);
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, (org.joda.time.ReadableDuration) duration49);
        boolean boolean51 = duration46.isShorterThan((org.joda.time.ReadableDuration) duration49);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Interval interval53 = duration49.toIntervalTo(readableInstant52);
        org.joda.time.Interval interval54 = interval53.toInterval();
        org.joda.time.DateTime dateTime55 = interval54.getEnd();
        org.joda.time.Duration duration57 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant58 = null;
        java.lang.Object obj59 = null;
        org.joda.time.Duration duration60 = new org.joda.time.Duration(obj59);
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant58, (org.joda.time.ReadableDuration) duration60);
        boolean boolean62 = duration57.isShorterThan((org.joda.time.ReadableDuration) duration60);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Interval interval64 = duration60.toIntervalTo(readableInstant63);
        org.joda.time.Interval interval65 = interval64.toInterval();
        org.joda.time.DateTime dateTime66 = interval65.getEnd();
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration42, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Duration duration70 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant71 = null;
        java.lang.Object obj72 = null;
        org.joda.time.Duration duration73 = new org.joda.time.Duration(obj72);
        org.joda.time.Period period74 = new org.joda.time.Period(readableInstant71, (org.joda.time.ReadableDuration) duration73);
        boolean boolean75 = duration70.isShorterThan((org.joda.time.ReadableDuration) duration73);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Interval interval77 = duration73.toIntervalTo(readableInstant76);
        org.joda.time.Interval interval78 = interval77.toInterval();
        org.joda.time.DateTime dateTime79 = interval78.getEnd();
        org.joda.time.PeriodType periodType81 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType82 = periodType81.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod(periodType82);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod(10L, periodType82);
        org.joda.time.Period period85 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime79, periodType82);
        boolean boolean86 = interval23.isAfter((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Chronology chronology87 = dateTime55.getChronology();
        org.joda.time.Interval interval88 = duration1.toIntervalTo((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Chronology chronology89 = dateTime55.getChronology();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 360000L + "'", long2 == 360000L);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(periodType81);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(chronology87);
        org.junit.Assert.assertNotNull(interval88);
        org.junit.Assert.assertNotNull(chronology89);
    }

    @Test
    public void test15765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15765");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period6 = period4.withMinutes(0);
        org.joda.time.Period period7 = period4.toPeriod();
        org.joda.time.Days days8 = org.joda.time.Days.ONE;
        org.joda.time.Days days9 = days8.negated();
        org.joda.time.Days days10 = org.joda.time.Days.ONE;
        org.joda.time.Days days11 = days10.negated();
        org.joda.time.Days days12 = org.joda.time.Days.ONE;
        org.joda.time.Days days13 = days12.negated();
        boolean boolean14 = days11.isGreaterThan(days13);
        org.joda.time.Days days15 = days8.plus(days13);
        org.joda.time.PeriodType periodType16 = days15.getPeriodType();
        org.joda.time.PeriodType periodType17 = periodType16.withMinutesRemoved();
        org.joda.time.PeriodType periodType18 = periodType16.withMillisRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withMinutesRemoved();
        org.joda.time.Period period20 = period4.normalizedStandard(periodType18);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test15766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15766");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration7 = duration4.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration9 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration4, (int) (short) 1);
        org.joda.time.Days days10 = duration9.toStandardDays();
        org.joda.time.Duration duration12 = duration9.minus((long) 10);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds(1644572185468L);
        org.joda.time.Duration duration16 = duration12.withDurationAdded((org.joda.time.ReadableDuration) duration14, (int) '#');
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant19 = null;
        java.lang.Object obj20 = null;
        org.joda.time.Duration duration21 = new org.joda.time.Duration(obj20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration21);
        boolean boolean23 = duration18.isShorterThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) (-101));
        boolean boolean26 = duration21.isEqual((org.joda.time.ReadableDuration) duration25);
        boolean boolean27 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration25);
        long long28 = duration25.getStandardHours();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-101L) + "'", long28 == (-101L));
    }

    @Test
    public void test15767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15767");
        org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days2 = days0.multipliedBy(8);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days2);
        org.joda.time.Days days4 = days3.negated();
        org.joda.time.Duration duration5 = days4.toStandardDuration();
        java.lang.String str6 = duration5.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-4838400S" + "'", str6, "PT-4838400S");
    }
}
