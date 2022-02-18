import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(19034401L, periodType1);
        mutablePeriod2.setMinutes(0);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        java.lang.Object obj9 = null;
        org.joda.time.Duration duration10 = new org.joda.time.Duration(obj9);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration10);
        boolean boolean12 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Interval interval14 = duration10.toIntervalTo(readableInstant13);
        org.joda.time.Interval interval15 = interval14.toInterval();
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.DurationField durationField17 = durationFieldType5.getField(chronology16);
        org.joda.time.Period period18 = new org.joda.time.Period(36000L, chronology16);
        org.joda.time.Period period19 = new org.joda.time.Period(1644572292390L, 0L, chronology16);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(360000L, 1644572368869L, chronology16);
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds23 = seconds21.multipliedBy((int) (byte) 1);
        java.lang.String str24 = seconds21.toString();
        org.joda.time.DurationFieldType durationFieldType25 = seconds21.getFieldType();
        mutablePeriod20.add(durationFieldType25, 2719);
        mutablePeriod20.setPeriod(601, 19, 0, (-18982), (-816), 774, 87100, 1644572300);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT3S" + "'", str24, "PT3S");
        org.junit.Assert.assertNotNull(durationFieldType25);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(1644572763705L, 1644572438867L);
        int int3 = mutablePeriod2.getWeeks();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 0);
        java.lang.String str2 = period1.toString();
        org.joda.time.Period period4 = period1.plusYears(0);
        org.joda.time.Hours hours5 = period4.toStandardHours();
        org.joda.time.Hours hours6 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours8 = hours6.dividedBy(32);
        org.joda.time.Duration duration11 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = duration11.toPeriodFrom(readableInstant12);
        org.joda.time.Period period15 = period13.withMinutes(0);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.Period period17 = period13.plus(readablePeriod16);
        boolean boolean18 = hours6.equals((java.lang.Object) readablePeriod16);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.Hours hours20 = org.joda.time.Hours.hoursIn(readableInterval19);
        org.joda.time.Hours hours22 = hours20.minus((int) (byte) 100);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        java.lang.Object obj26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(obj26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration27);
        boolean boolean29 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        org.joda.time.Interval interval32 = interval31.toInterval();
        org.joda.time.Hours hours33 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval32);
        org.joda.time.Hours hours35 = hours33.dividedBy(1);
        org.joda.time.Hours hours37 = hours33.minus((int) (short) 1);
        boolean boolean38 = hours20.isGreaterThan(hours37);
        org.joda.time.Hours hours39 = hours20.negated();
        boolean boolean40 = hours6.isLessThan(hours39);
        org.joda.time.Hours hours42 = hours39.dividedBy((int) (short) 10);
        org.joda.time.Period period43 = period4.withFields((org.joda.time.ReadablePeriod) hours42);
        int int44 = period4.getSeconds();
        org.joda.time.PeriodType periodType45 = period4.getPeriodType();
        org.joda.time.PeriodType periodType46 = periodType45.withSecondsRemoved();
        java.lang.Class<?> wildcardClass47 = periodType46.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(hours37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(hours39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(hours42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) ' ');
        org.joda.time.Duration duration3 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration5 = duration3.plus(1644572275656L);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.Seconds seconds8 = seconds6.plus(2728);
        org.joda.time.Seconds seconds9 = seconds1.minus(seconds8);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType2 = seconds1.getFieldType();
        org.joda.time.Seconds seconds4 = seconds1.plus((-1));
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        java.lang.String str6 = seconds5.toString();
        org.joda.time.Seconds seconds7 = seconds4.plus(seconds5);
        org.joda.time.Seconds seconds8 = seconds0.minus(seconds5);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.standardSecondsIn(readablePeriod9);
        org.joda.time.Seconds seconds11 = seconds8.plus(seconds10);
        org.joda.time.Duration duration12 = seconds8.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType13 = seconds8.getFieldType();
        org.joda.time.Seconds seconds15 = seconds8.plus(37);
        org.joda.time.Duration duration16 = seconds8.toStandardDuration();
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
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(duration16);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.THREE;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType3);
        mutablePeriod4.setYears(0);
        java.lang.String str7 = mutablePeriod4.toString();
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) mutablePeriod4);
        int int9 = weeks8.getWeeks();
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks12 = weeks11.negated();
        int int13 = weeks11.getWeeks();
        org.joda.time.Weeks weeks15 = weeks11.minus(3);
        org.joda.time.Weeks weeks16 = null;
        org.joda.time.Weeks weeks17 = weeks11.minus(weeks16);
        org.joda.time.Weeks weeks19 = weeks11.dividedBy(35);
        boolean boolean20 = weeks8.isLessThan(weeks11);
        org.joda.time.Weeks weeks21 = null;
        boolean boolean22 = weeks8.isGreaterThan(weeks21);
        org.joda.time.Weeks weeks24 = weeks8.dividedBy(382);
        org.joda.time.Weeks weeks25 = weeks0.plus(weeks8);
        int int26 = weeks0.getWeeks();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.001S" + "'", str7, "PT0.001S");
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(3, 2147483647, (-9700), 38);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = duration7.toPeriodFrom(readableInstant8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = duration7.toPeriod(chronology10);
        org.joda.time.Period period13 = period11.withYears((int) (byte) 10);
        org.joda.time.Period period15 = period11.minusMonths(100);
        org.joda.time.Duration duration18 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = duration18.toPeriodFrom(readableInstant19);
        org.joda.time.Period period22 = period20.minusSeconds((int) '4');
        org.joda.time.format.PeriodFormatter periodFormatter23 = null;
        java.lang.String str24 = period20.toString(periodFormatter23);
        org.joda.time.Period period25 = period15.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.Period period27 = period15.withFields(readablePeriod26);
        org.joda.time.Period period29 = period27.withMinutes((-1));
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) period27);
        mutablePeriod4.setDays(0);
        mutablePeriod4.setDays((int) (byte) 10);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0.097S" + "'", str24, "PT0.097S");
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        org.joda.time.Period period8 = period6.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn(readableInterval9);
        org.joda.time.Period period11 = period8.minus((org.joda.time.ReadablePeriod) hours10);
        org.joda.time.MutablePeriod mutablePeriod12 = hours10.toMutablePeriod();
        org.joda.time.Duration duration14 = org.joda.time.Duration.millis(1644572323020L);
        mutablePeriod12.add((org.joda.time.ReadableDuration) duration14);
        mutablePeriod12.setMonths((-16));
        mutablePeriod12.setMonths((-2147483646));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(duration14);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((-101), (int) (byte) 10, (int) (byte) 10, 0);
        int int5 = mutablePeriod4.getSeconds();
        int int7 = mutablePeriod4.getValue((int) (byte) 0);
        mutablePeriod4.setValue(5, (-100));
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        java.lang.Object obj14 = null;
        org.joda.time.Duration duration15 = new org.joda.time.Duration(obj14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration15);
        boolean boolean17 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration15.toIntervalTo(readableInstant18);
        org.joda.time.Interval interval20 = interval19.toInterval();
        long long21 = interval19.toDurationMillis();
        org.joda.time.Interval interval22 = interval19.toInterval();
        org.joda.time.Days days23 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval19);
        org.joda.time.DurationFieldType durationFieldType24 = days23.getFieldType();
        org.joda.time.Days days26 = days23.minus(0);
        org.joda.time.Days days28 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.PeriodType periodType29 = days28.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod30 = days28.toMutablePeriod();
        int int31 = days28.size();
        boolean boolean32 = days23.isLessThan(days28);
        boolean boolean33 = mutablePeriod4.equals((java.lang.Object) days23);
        mutablePeriod4.addHours(456825);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(mutablePeriod30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        org.joda.time.Period period8 = period6.withYears((int) (byte) 10);
        org.joda.time.Period period9 = period6.toPeriod();
        org.joda.time.Period period11 = period9.withMonths((int) '4');
        org.joda.time.Period period13 = period9.withHours((int) (short) 1);
        java.lang.String str14 = period9.toString();
        org.joda.time.Period period16 = period9.minusHours((-843));
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration24 = duration21.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration26 = duration18.withDurationAdded((org.joda.time.ReadableDuration) duration21, (int) (short) 1);
        org.joda.time.Days days27 = duration26.toStandardDays();
        int int28 = days27.size();
        org.joda.time.Days days29 = org.joda.time.Days.ONE;
        org.joda.time.Days days30 = days29.negated();
        org.joda.time.Days days31 = org.joda.time.Days.ONE;
        org.joda.time.Days days32 = days31.negated();
        org.joda.time.Days days33 = org.joda.time.Days.ONE;
        org.joda.time.Days days34 = days33.negated();
        boolean boolean35 = days32.isGreaterThan(days34);
        org.joda.time.Days days36 = days29.plus(days34);
        java.lang.String str37 = days34.toString();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((java.lang.Object) days34);
        org.joda.time.Days days39 = days27.minus(days34);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((java.lang.Object) days39);
        org.joda.time.Days days42 = days39.dividedBy(52);
        org.joda.time.Days days43 = days42.negated();
        org.joda.time.Days days45 = days43.minus(0);
        org.joda.time.Period period46 = period16.plus((org.joda.time.ReadablePeriod) days45);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0.097S" + "'", str14, "PT0.097S");
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "P-1D" + "'", str37, "P-1D");
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days45);
        org.junit.Assert.assertNotNull(period46);
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) '#');
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.months();
        boolean boolean3 = period1.isSupported(durationFieldType2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks4 = period1.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        java.lang.Object obj4 = null;
        org.joda.time.Duration duration5 = new org.joda.time.Duration(obj4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration5);
        boolean boolean7 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Interval interval9 = duration5.toIntervalTo(readableInstant8);
        org.joda.time.Interval interval10 = interval9.toInterval();
        long long11 = interval9.toDurationMillis();
        org.joda.time.Interval interval12 = interval9.toInterval();
        org.joda.time.Days days13 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval9);
        org.joda.time.DateTime dateTime14 = interval9.getStart();
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(1644572332104L, chronology15);
        mutablePeriod16.addMonths((-4));
        mutablePeriod16.setMillis(2147483647);
        org.joda.time.format.PeriodFormatter periodFormatter21 = null;
        java.lang.String str22 = mutablePeriod16.toString(periodFormatter21);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "P-4M2719W1DT9H38M2147535.647S" + "'", str22, "P-4M2719W1DT9H38M2147535.647S");
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object) duration1, periodType7, chronology8);
        org.joda.time.Duration duration11 = org.joda.time.Duration.millis((long) '4');
        long long12 = duration11.getStandardDays();
        boolean boolean13 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration11);
        long long14 = duration1.getMillis();
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration22 = duration19.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration24 = duration16.withDurationAdded((org.joda.time.ReadableDuration) duration19, (int) (short) 1);
        org.joda.time.ReadableDuration readableDuration25 = null;
        boolean boolean26 = duration16.isLongerThan(readableDuration25);
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant29 = null;
        java.lang.Object obj30 = null;
        org.joda.time.Duration duration31 = new org.joda.time.Duration(obj30);
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, (org.joda.time.ReadableDuration) duration31);
        boolean boolean33 = duration28.isShorterThan((org.joda.time.ReadableDuration) duration31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Interval interval35 = duration31.toIntervalTo(readableInstant34);
        org.joda.time.Interval interval36 = interval35.toInterval();
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        java.lang.Object obj41 = null;
        org.joda.time.Duration duration42 = new org.joda.time.Duration(obj41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, (org.joda.time.ReadableDuration) duration42);
        boolean boolean44 = duration39.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Interval interval46 = duration42.toIntervalTo(readableInstant45);
        org.joda.time.Interval interval47 = interval46.toInterval();
        org.joda.time.DateTime dateTime48 = interval47.getEnd();
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Period period50 = new org.joda.time.Period(readableDuration25, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Interval interval51 = duration1.toIntervalFrom((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Seconds seconds52 = duration1.toStandardSeconds();
        org.joda.time.Duration duration53 = seconds52.toStandardDuration();
        org.joda.time.Seconds seconds54 = seconds52.negated();
        org.joda.time.DurationFieldType durationFieldType55 = seconds54.getFieldType();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 36000000L + "'", long14 == 36000000L);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(seconds52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(durationFieldType55);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        org.joda.time.Period period1 = new org.joda.time.Period(1L);
        org.joda.time.Period period3 = period1.withYears((int) ' ');
        org.joda.time.Period period5 = period3.minusDays(9);
        org.joda.time.Period period7 = period5.withMillis((int) ' ');
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period7.toString(periodFormatter8);
        org.joda.time.Period period11 = period7.minusMillis((-800));
        org.joda.time.Period period12 = period7.toPeriod();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P32Y-9DT0.032S" + "'", str9, "P32Y-9DT0.032S");
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        org.joda.time.Period period4 = new org.joda.time.Period(52, 32, (int) '4', 4);
        org.joda.time.Period period6 = org.joda.time.Period.weeks((-27409532));
        org.joda.time.Days days8 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = days8.toMutablePeriod();
        java.lang.String str11 = mutablePeriod10.toString();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType20);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType24);
        mutablePeriod25.setYears(0);
        mutablePeriod21.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod25);
        mutablePeriod21.addHours((int) (byte) 1);
        mutablePeriod21.setPeriod((int) (short) 0, 0, 0, 55, (int) '4', (int) (short) -1, (-97), 32);
        org.joda.time.Days days40 = org.joda.time.Days.SIX;
        org.joda.time.Days days42 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.Days days43 = days40.plus(days42);
        org.joda.time.DurationFieldType durationFieldType44 = days42.getFieldType();
        org.joda.time.DurationFieldType durationFieldType45 = days42.getFieldType();
        int int46 = mutablePeriod21.get(durationFieldType45);
        int int47 = mutablePeriod10.get(durationFieldType45);
        boolean boolean48 = period6.isSupported(durationFieldType45);
        org.joda.time.Period period50 = period4.withField(durationFieldType45, (int) (short) 0);
        org.joda.time.Period period52 = period4.withWeeks(1760);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P-1D" + "'", str11, "P-1D");
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 55 + "'", int46 == 55);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '4');
        org.joda.time.Minutes minutes7 = period4.toStandardMinutes();
        org.joda.time.Period period9 = period4.multipliedBy((int) (byte) 100);
        org.joda.time.Period period11 = period9.withHours((int) (short) 0);
        org.joda.time.Period period13 = period9.withHours((int) (short) 1);
        org.joda.time.Period period15 = period13.withMonths(10);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) ' ', chronology17);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType21);
        mutablePeriod22.setYears(0);
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology27 = null;
        mutablePeriod22.setPeriod((org.joda.time.ReadableDuration) duration26, chronology27);
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant31 = null;
        java.lang.Object obj32 = null;
        org.joda.time.Duration duration33 = new org.joda.time.Duration(obj32);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration33);
        boolean boolean35 = duration30.isShorterThan((org.joda.time.ReadableDuration) duration33);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Interval interval37 = duration33.toIntervalTo(readableInstant36);
        org.joda.time.Interval interval38 = interval37.toInterval();
        org.joda.time.DateTime dateTime39 = interval38.getEnd();
        org.joda.time.Duration duration41 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant42 = null;
        java.lang.Object obj43 = null;
        org.joda.time.Duration duration44 = new org.joda.time.Duration(obj43);
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant42, (org.joda.time.ReadableDuration) duration44);
        boolean boolean46 = duration41.isShorterThan((org.joda.time.ReadableDuration) duration44);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Interval interval48 = duration44.toIntervalTo(readableInstant47);
        org.joda.time.Interval interval49 = interval48.toInterval();
        org.joda.time.DateTime dateTime50 = interval49.getEnd();
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Duration duration54 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant55 = null;
        java.lang.Object obj56 = null;
        org.joda.time.Duration duration57 = new org.joda.time.Duration(obj56);
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant55, (org.joda.time.ReadableDuration) duration57);
        boolean boolean59 = duration54.isShorterThan((org.joda.time.ReadableDuration) duration57);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Interval interval61 = duration57.toIntervalTo(readableInstant60);
        org.joda.time.Interval interval62 = interval61.toInterval();
        org.joda.time.DateTime dateTime63 = interval62.getEnd();
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType66 = periodType65.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod(periodType66);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(10L, periodType66);
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableInstant) dateTime63, periodType66);
        org.joda.time.Duration duration70 = mutablePeriod18.toDurationFrom((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = null;
        boolean boolean72 = dateTime39.isSupported(dateTimeFieldType71);
        org.joda.time.Duration duration73 = period15.toDurationFrom((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.MutablePeriod mutablePeriod74 = period15.toMutablePeriod();
        org.joda.time.Period period76 = period15.plusHours((int) (short) 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(mutablePeriod74);
        org.junit.Assert.assertNotNull(period76);
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.Days days3 = days0.plus(days2);
        org.joda.time.DurationFieldType durationFieldType4 = days2.getFieldType();
        org.joda.time.DurationFieldType durationFieldType5 = days2.getFieldType();
        org.joda.time.Duration duration6 = days2.toStandardDuration();
        org.joda.time.Days days7 = org.joda.time.Days.FOUR;
        org.joda.time.Period period8 = days7.toPeriod();
        org.joda.time.Days days10 = org.joda.time.Days.days((int) ' ');
        org.joda.time.Days days12 = days10.minus((int) (byte) 0);
        org.joda.time.Days days13 = days7.minus(days10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration18 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration21 = duration18.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration23 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration18, (int) (short) 1);
        org.joda.time.Days days24 = duration23.toStandardDays();
        org.joda.time.Days days26 = days24.minus((int) (short) 100);
        org.joda.time.Days days27 = days7.minus(days26);
        java.lang.String str28 = days7.toString();
        org.joda.time.Duration duration30 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration32 = duration30.plus(1644572275656L);
        org.joda.time.Days days33 = duration30.toStandardDays();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.eras();
        java.lang.String str35 = durationFieldType34.getName();
        boolean boolean36 = days33.isSupported(durationFieldType34);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration41 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration44 = duration41.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration46 = duration38.withDurationAdded((org.joda.time.ReadableDuration) duration41, (int) (short) 1);
        org.joda.time.Days days47 = duration46.toStandardDays();
        org.joda.time.Days days48 = days33.plus(days47);
        org.joda.time.Days days49 = org.joda.time.Days.SIX;
        org.joda.time.Days days51 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.Days days52 = days49.plus(days51);
        org.joda.time.PeriodType periodType53 = days52.getPeriodType();
        boolean boolean54 = days48.isGreaterThan(days52);
        java.lang.String str55 = days48.toString();
        org.joda.time.Days days57 = days48.dividedBy(36000000);
        boolean boolean58 = days7.isGreaterThan(days48);
        org.joda.time.Duration duration60 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant61 = null;
        java.lang.Object obj62 = null;
        org.joda.time.Duration duration63 = new org.joda.time.Duration(obj62);
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, (org.joda.time.ReadableDuration) duration63);
        boolean boolean65 = duration60.isShorterThan((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Duration duration67 = duration60.plus(1644572275701L);
        org.joda.time.Duration duration69 = new org.joda.time.Duration(1644572321046L);
        org.joda.time.Duration duration70 = duration67.plus((org.joda.time.ReadableDuration) duration69);
        org.joda.time.Days days71 = duration67.toStandardDays();
        boolean boolean72 = days48.equals((java.lang.Object) duration67);
        org.joda.time.Duration duration74 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration67, (-601));
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "P4D" + "'", str28, "P4D");
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "eras" + "'", str35, "eras");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(days48);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertNotNull(days52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "P0D" + "'", str55, "P0D");
        org.junit.Assert.assertNotNull(days57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(days71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(duration74);
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        org.joda.time.Period period8 = period6.minusYears((int) (byte) -1);
        org.joda.time.Period period10 = period8.minusHours(3);
        org.joda.time.Period period12 = period10.plusMonths((int) (byte) 100);
        org.joda.time.Period period14 = period12.plusHours(35);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) ' ', chronology16);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType20);
        mutablePeriod21.setYears(0);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology26 = null;
        mutablePeriod21.setPeriod((org.joda.time.ReadableDuration) duration25, chronology26);
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
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration25, (org.joda.time.ReadableInstant) dateTime38);
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
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType65 = periodType64.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(periodType65);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod(10L, periodType65);
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime62, periodType65);
        org.joda.time.Duration duration69 = mutablePeriod17.toDurationFrom((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Days days70 = duration69.toStandardDays();
        org.joda.time.Period period71 = period12.plus((org.joda.time.ReadablePeriod) days70);
        org.joda.time.MutablePeriod mutablePeriod72 = period71.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration73 = period71.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(days70);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(mutablePeriod72);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(35791);
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType2 = seconds1.getFieldType();
        org.joda.time.Seconds seconds4 = seconds1.plus((-1));
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        java.lang.String str6 = seconds5.toString();
        org.joda.time.Seconds seconds7 = seconds4.plus(seconds5);
        org.joda.time.Seconds seconds8 = seconds0.minus(seconds5);
        org.joda.time.PeriodType periodType9 = seconds0.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withMonthsRemoved();
        org.joda.time.PeriodType periodType12 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType13 = periodType9.withMonthsRemoved();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT2S" + "'", str6, "PT2S");
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.setPeriod(100L, (long) (-1));
        int int4 = mutablePeriod0.size();
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = duration7.toPeriodFrom(readableInstant8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = duration7.toPeriod(chronology10);
        org.joda.time.Period period13 = period11.withYears((int) (byte) 10);
        org.joda.time.Period period14 = period11.toPeriod();
        org.joda.time.Period period15 = period11.toPeriod();
        int int16 = period11.getMillis();
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = duration19.toPeriodFrom(readableInstant20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = duration19.toPeriod(chronology22);
        org.joda.time.Period period25 = period23.withYears((int) (byte) 10);
        org.joda.time.Period period27 = period23.minusMonths(100);
        org.joda.time.Period period29 = period23.plusYears(100);
        org.joda.time.Period period31 = period29.minusMinutes((int) (byte) 100);
        org.joda.time.Period period32 = period11.withFields((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Days days34 = org.joda.time.Days.days((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType35 = null;
        boolean boolean36 = days34.isSupported(durationFieldType35);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant39 = null;
        java.lang.Object obj40 = null;
        org.joda.time.Duration duration41 = new org.joda.time.Duration(obj40);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, (org.joda.time.ReadableDuration) duration41);
        boolean boolean43 = duration38.isShorterThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Interval interval45 = duration41.toIntervalTo(readableInstant44);
        org.joda.time.Interval interval46 = interval45.toInterval();
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant49 = null;
        java.lang.Object obj50 = null;
        org.joda.time.Duration duration51 = new org.joda.time.Duration(obj50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, (org.joda.time.ReadableDuration) duration51);
        boolean boolean53 = duration48.isShorterThan((org.joda.time.ReadableDuration) duration51);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Interval interval55 = duration51.toIntervalTo(readableInstant54);
        boolean boolean56 = interval46.isAfter((org.joda.time.ReadableInterval) interval55);
        org.joda.time.Days days57 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval46);
        org.joda.time.DurationFieldType durationFieldType58 = days57.getFieldType();
        java.lang.String str59 = durationFieldType58.toString();
        int int60 = days34.get(durationFieldType58);
        boolean boolean61 = period11.isSupported(durationFieldType58);
        mutablePeriod0.set(durationFieldType58, 0);
        java.lang.String str64 = durationFieldType58.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-97) + "'", int16 == (-97));
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(interval55);
// flaky:         org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(days57);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "days" + "'", str59, "days");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "days" + "'", str64, "days");
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1644572476118L, 1644572445734L, chronology2);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
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
        org.joda.time.Period period93 = period91.withYears(67);
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
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "2022-02-11T09:47:53.004Z" + "'", str90, "2022-02-11T09:47:53.004Z");
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(period93);
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration3 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration5 = duration3.plus(1644572275656L);
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
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration23 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration25 = duration23.plus(1644572275656L);
        long long26 = duration23.getMillis();
        long long27 = duration23.getStandardHours();
        boolean boolean28 = duration21.isEqual((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant29 = null;
        java.lang.Object obj30 = null;
        org.joda.time.Duration duration31 = new org.joda.time.Duration(obj30);
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, (org.joda.time.ReadableDuration) duration31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration31, readableInstant33);
        org.joda.time.Duration duration36 = org.joda.time.Duration.millis((long) '4');
        long long37 = duration36.getStandardDays();
        boolean boolean38 = duration31.isLongerThan((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Duration duration39 = duration23.minus((org.joda.time.ReadableDuration) duration36);
        boolean boolean40 = duration19.equals((java.lang.Object) duration23);
        org.joda.time.Duration duration42 = org.joda.time.Duration.millis((long) '4');
        long long43 = duration42.getMillis();
        org.joda.time.Minutes minutes44 = duration42.toStandardMinutes();
        org.joda.time.Duration duration45 = duration23.plus((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Duration duration47 = duration23.withMillis(1644572318076L);
        org.joda.time.Duration duration48 = duration47.toDuration();
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration52 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration54 = duration52.plus(1644572275656L);
        long long55 = duration52.getMillis();
        long long56 = duration52.getStandardHours();
        boolean boolean57 = duration50.isEqual((org.joda.time.ReadableDuration) duration52);
        org.joda.time.ReadableInstant readableInstant58 = null;
        java.lang.Object obj59 = null;
        org.joda.time.Duration duration60 = new org.joda.time.Duration(obj59);
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant58, (org.joda.time.ReadableDuration) duration60);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration60, readableInstant62);
        org.joda.time.Duration duration65 = org.joda.time.Duration.millis((long) '4');
        long long66 = duration65.getStandardDays();
        boolean boolean67 = duration60.isLongerThan((org.joda.time.ReadableDuration) duration65);
        org.joda.time.Duration duration68 = duration52.minus((org.joda.time.ReadableDuration) duration65);
        org.joda.time.Duration duration70 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration72 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration74 = duration72.plus(1644572275656L);
        long long75 = duration72.getMillis();
        long long76 = duration72.getStandardHours();
        boolean boolean77 = duration70.isEqual((org.joda.time.ReadableDuration) duration72);
        org.joda.time.ReadableInstant readableInstant78 = null;
        java.lang.Object obj79 = null;
        org.joda.time.Duration duration80 = new org.joda.time.Duration(obj79);
        org.joda.time.Period period81 = new org.joda.time.Period(readableInstant78, (org.joda.time.ReadableDuration) duration80);
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration80, readableInstant82);
        org.joda.time.Duration duration85 = org.joda.time.Duration.millis((long) '4');
        long long86 = duration85.getStandardDays();
        boolean boolean87 = duration80.isLongerThan((org.joda.time.ReadableDuration) duration85);
        org.joda.time.Duration duration88 = duration72.minus((org.joda.time.ReadableDuration) duration85);
        boolean boolean89 = duration68.equals((java.lang.Object) duration72);
        org.joda.time.PeriodType periodType90 = org.joda.time.PeriodType.yearDay();
        org.joda.time.PeriodType periodType91 = periodType90.withMonthsRemoved();
        org.joda.time.Period period92 = duration68.toPeriod(periodType91);
        org.joda.time.PeriodType periodType93 = periodType91.withMillisRemoved();
        org.joda.time.Period period94 = duration48.toPeriod(periodType91);
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
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 52L + "'", long43 == 52L);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 52L + "'", long55 == 52L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 52L + "'", long75 == 52L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(duration85);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(duration88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(periodType90);
        org.junit.Assert.assertNotNull(periodType91);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(periodType93);
        org.junit.Assert.assertNotNull(period94);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(1644572509542L);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(19034401L);
        boolean boolean4 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration3);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        org.joda.time.Period period8 = new org.joda.time.Period(352, (-27409532), (-97), 38, 39, 1, 5, 97);
        int int9 = period8.getHours();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.Period period11 = period8.plus(readablePeriod10);
        org.joda.time.Period period13 = period8.plusMinutes((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 39 + "'", int9 == 39);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        org.joda.time.Period period1 = new org.joda.time.Period(1644572805503L);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, 0L);
        org.joda.time.Weeks weeks3 = period2.toStandardWeeks();
        org.joda.time.Weeks weeks5 = weeks3.plus((-520));
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) ' ');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration9 = duration6.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration11 = duration3.withDurationAdded((org.joda.time.ReadableDuration) duration6, (int) (short) 1);
        org.joda.time.Days days12 = duration11.toStandardDays();
        org.joda.time.DurationFieldType durationFieldType13 = days12.getFieldType();
        int int14 = period1.get(durationFieldType13);
        java.lang.String str15 = durationFieldType13.getName();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "days" + "'", str15, "days");
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.millis(1644572290128L);
        long long3 = duration2.getStandardMinutes();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant7 = null;
        java.lang.Object obj8 = null;
        org.joda.time.Duration duration9 = new org.joda.time.Duration(obj8);
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration9);
        boolean boolean11 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Interval interval13 = duration9.toIntervalTo(readableInstant12);
        org.joda.time.Interval interval14 = interval13.toInterval();
        long long15 = interval13.toDurationMillis();
        org.joda.time.Interval interval16 = interval13.toInterval();
        org.joda.time.Days days17 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval13);
        org.joda.time.Interval interval18 = interval13.toInterval();
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration23 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration26 = duration23.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration28 = duration20.withDurationAdded((org.joda.time.ReadableDuration) duration23, (int) (short) 1);
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant31 = null;
        java.lang.Object obj32 = null;
        org.joda.time.Duration duration33 = new org.joda.time.Duration(obj32);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration33);
        boolean boolean35 = duration30.isShorterThan((org.joda.time.ReadableDuration) duration33);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Interval interval37 = duration33.toIntervalTo(readableInstant36);
        org.joda.time.Interval interval38 = interval37.toInterval();
        org.joda.time.DateTime dateTime39 = interval38.getEnd();
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType41 = periodType40.withSecondsRemoved();
        org.joda.time.PeriodType periodType42 = periodType41.withMillisRemoved();
        org.joda.time.Period period43 = duration20.toPeriodFrom((org.joda.time.ReadableInstant) dateTime39, periodType41);
        boolean boolean44 = interval13.isAfter((org.joda.time.ReadableInstant) dateTime39);
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
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = null;
        boolean boolean69 = dateTime55.isSupported(dateTimeFieldType68);
        org.joda.time.Duration duration71 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant72 = null;
        java.lang.Object obj73 = null;
        org.joda.time.Duration duration74 = new org.joda.time.Duration(obj73);
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant72, (org.joda.time.ReadableDuration) duration74);
        boolean boolean76 = duration71.isShorterThan((org.joda.time.ReadableDuration) duration74);
        org.joda.time.PeriodType periodType77 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((java.lang.Object) duration71, periodType77, chronology78);
        org.joda.time.Duration duration81 = org.joda.time.Duration.millis((long) '4');
        long long82 = duration81.getStandardDays();
        boolean boolean83 = duration71.isLongerThan((org.joda.time.ReadableDuration) duration81);
        org.joda.time.Period period84 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableDuration) duration71);
        org.joda.time.PeriodType periodType85 = org.joda.time.PeriodType.seconds();
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableDuration) duration71, periodType85);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(1644572453988L, periodType85);
        org.joda.time.Period period88 = duration2.toPeriod(periodType85);
        org.joda.time.Duration duration90 = duration2.minus(1644572529712L);
        org.joda.time.Period period91 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 27409538L + "'", long3 == 27409538L);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
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
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(periodType77);
        org.junit.Assert.assertNotNull(duration81);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(periodType85);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(duration90);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.Period period1 = new org.joda.time.Period((java.lang.Object) minutes0);
        org.joda.time.PeriodType periodType2 = minutes0.getPeriodType();
        org.joda.time.Minutes minutes4 = minutes0.multipliedBy((-27409532));
        org.joda.time.Minutes minutes5 = minutes4.negated();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.minutes(0);
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes10 = minutes8.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType11 = minutes10.getPeriodType();
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.ZERO;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) minutes12);
        boolean boolean14 = minutes10.isGreaterThan(minutes12);
        org.joda.time.MutablePeriod mutablePeriod15 = minutes10.toMutablePeriod();
        org.joda.time.Minutes minutes16 = minutes10.negated();
        org.joda.time.Duration duration18 = org.joda.time.Duration.millis((long) '4');
        long long19 = duration18.getMillis();
        org.joda.time.Minutes minutes20 = duration18.toStandardMinutes();
        java.lang.String str21 = minutes20.toString();
        org.joda.time.Minutes minutes23 = minutes20.multipliedBy((int) '4');
        org.joda.time.DurationFieldType durationFieldType24 = minutes20.getFieldType();
        boolean boolean25 = minutes16.isLessThan(minutes20);
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.minutes((int) (short) 0);
        org.joda.time.Duration duration29 = org.joda.time.Duration.millis((long) '4');
        long long30 = duration29.getMillis();
        org.joda.time.Minutes minutes31 = duration29.toStandardMinutes();
        org.joda.time.Minutes minutes32 = minutes31.negated();
        org.joda.time.Minutes minutes33 = minutes31.negated();
        org.joda.time.Duration duration35 = org.joda.time.Duration.millis((long) '4');
        long long36 = duration35.getMillis();
        org.joda.time.Minutes minutes37 = duration35.toStandardMinutes();
        org.joda.time.Minutes minutes38 = minutes37.negated();
        org.joda.time.Minutes minutes39 = minutes37.negated();
        org.joda.time.Minutes minutes40 = minutes37.negated();
        org.joda.time.Minutes minutes41 = minutes31.minus(minutes37);
        org.joda.time.Minutes minutes43 = org.joda.time.Minutes.minutes((int) (short) 100);
        org.joda.time.Minutes minutes44 = minutes41.minus(minutes43);
        boolean boolean45 = minutes27.isLessThan(minutes44);
        java.lang.String str46 = minutes27.toString();
        org.joda.time.Minutes minutes47 = minutes20.minus(minutes27);
        org.joda.time.Minutes minutes48 = minutes7.minus(minutes27);
        boolean boolean49 = minutes5.isLessThan(minutes27);
        org.joda.time.Minutes minutes50 = minutes27.negated();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT0M" + "'", str21, "PT0M");
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 52L + "'", long36 == 52L);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PT0M" + "'", str46, "PT0M");
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(minutes50);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
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
        org.joda.time.DurationFieldType durationFieldType17 = hours15.getFieldType();
        boolean boolean18 = hours10.isLessThan(hours15);
        org.joda.time.Hours hours20 = hours10.minus(52);
        org.joda.time.Hours hours22 = hours10.plus(10);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        java.lang.Object obj26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(obj26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration27);
        boolean boolean29 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        org.joda.time.Interval interval32 = interval31.toInterval();
        org.joda.time.Hours hours33 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval32);
        org.joda.time.Hours hours34 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval32);
        org.joda.time.DurationFieldType durationFieldType35 = hours34.getFieldType();
        org.joda.time.Hours hours37 = hours34.minus(1);
        org.joda.time.Duration duration40 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = duration40.toPeriodFrom(readableInstant41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = duration40.toPeriod(chronology43);
        org.joda.time.Period period46 = period44.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval47 = null;
        org.joda.time.Hours hours48 = org.joda.time.Hours.hoursIn(readableInterval47);
        org.joda.time.Period period49 = period46.minus((org.joda.time.ReadablePeriod) hours48);
        org.joda.time.Hours hours50 = hours48.negated();
        org.joda.time.Hours hours51 = hours37.plus(hours50);
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant54 = null;
        java.lang.Object obj55 = null;
        org.joda.time.Duration duration56 = new org.joda.time.Duration(obj55);
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, (org.joda.time.ReadableDuration) duration56);
        boolean boolean58 = duration53.isShorterThan((org.joda.time.ReadableDuration) duration56);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Interval interval60 = duration56.toIntervalTo(readableInstant59);
        org.joda.time.Interval interval61 = interval60.toInterval();
        org.joda.time.Hours hours62 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval61);
        org.joda.time.MutablePeriod mutablePeriod63 = hours62.toMutablePeriod();
        int int64 = hours62.getHours();
        org.joda.time.Hours hours65 = hours37.minus(hours62);
        org.joda.time.Hours hours66 = hours10.plus(hours37);
        org.joda.time.Hours hours68 = hours10.plus((-97));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(hours34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(hours37);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(hours48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(hours50);
        org.junit.Assert.assertNotNull(hours51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(hours62);
        org.junit.Assert.assertNotNull(mutablePeriod63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(hours65);
        org.junit.Assert.assertNotNull(hours66);
        org.junit.Assert.assertNotNull(hours68);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("2022-02-11T09:47:29.416Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:47:29.416Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}
