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
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType2 = periodType1.withMillisRemoved();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) (short) 1, periodType2, chronology3);
        int int5 = periodType2.size();
        org.joda.time.PeriodType periodType6 = periodType2.withYearsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withMonthsRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withYearsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(1644572152112L);
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration7 = duration4.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration9 = duration7.withMillis((long) (byte) 10);
        org.joda.time.Duration duration10 = duration1.plus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Duration duration12 = duration10.minus(1644572319259L);
        long long13 = duration10.getStandardMinutes();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 27409535L + "'", long13 == 27409535L);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        org.joda.time.Period period8 = period6.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn(readableInterval9);
        org.joda.time.Period period11 = period8.minus((org.joda.time.ReadablePeriod) hours10);
        int int12 = period11.getYears();
        org.joda.time.Period period14 = period11.minusMillis((int) (byte) 10);
        org.joda.time.Period period16 = period14.minusYears((int) 'a');
        int int17 = period16.getSeconds();
        org.joda.time.Period period19 = period16.minusYears(69);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType3 = seconds0.getFieldType();
        org.joda.time.Duration duration6 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration9 = duration6.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration11 = duration9.withMillis((long) (byte) 10);
        long long12 = duration11.getStandardSeconds();
        org.joda.time.Seconds seconds13 = duration11.toStandardSeconds();
        org.joda.time.Seconds seconds14 = seconds0.minus(seconds13);
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds17 = seconds15.multipliedBy((int) (byte) 1);
        java.lang.String str18 = seconds15.toString();
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType20 = seconds19.getFieldType();
        org.joda.time.Seconds seconds22 = seconds19.plus((-1));
        org.joda.time.DurationFieldType durationFieldType23 = seconds19.getFieldType();
        org.joda.time.Seconds seconds24 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType26 = seconds25.getFieldType();
        org.joda.time.Seconds seconds28 = seconds25.plus((-1));
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.TWO;
        java.lang.String str30 = seconds29.toString();
        org.joda.time.Seconds seconds31 = seconds28.plus(seconds29);
        org.joda.time.Seconds seconds32 = seconds24.minus(seconds29);
        org.joda.time.Seconds seconds33 = seconds19.plus(seconds24);
        org.joda.time.Seconds seconds34 = seconds15.plus(seconds33);
        org.joda.time.Seconds seconds35 = seconds14.plus(seconds33);
        org.joda.time.PeriodType periodType36 = seconds35.getPeriodType();
        int int37 = seconds35.getSeconds();
        org.joda.time.Seconds seconds39 = org.joda.time.Seconds.seconds((-2147483648));
        boolean boolean40 = seconds35.isLessThan(seconds39);
        org.joda.time.Seconds seconds42 = org.joda.time.Seconds.seconds((int) (short) -1);
        org.joda.time.Seconds seconds44 = seconds42.multipliedBy(32);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = duration47.toPeriodFrom(readableInstant48);
        org.joda.time.Period period51 = period49.minusSeconds((int) '4');
        org.joda.time.Period period53 = period49.minusSeconds(10);
        org.joda.time.Period period55 = period49.withWeeks((int) (byte) -1);
        org.joda.time.Seconds seconds56 = period49.toStandardSeconds();
        org.joda.time.Seconds seconds58 = seconds56.plus((-97));
        org.joda.time.Seconds seconds60 = seconds58.multipliedBy(8);
        org.joda.time.Seconds seconds62 = seconds58.multipliedBy(23);
        org.joda.time.Seconds seconds63 = seconds58.negated();
        boolean boolean64 = seconds44.isGreaterThan(seconds63);
        boolean boolean65 = seconds39.isLessThan(seconds63);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT3S" + "'", str18, "PT3S");
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT2S" + "'", str30, "PT2S");
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6 + "'", int37 == 6);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertNotNull(seconds58);
        org.junit.Assert.assertNotNull(seconds60);
        org.junit.Assert.assertNotNull(seconds62);
        org.junit.Assert.assertNotNull(seconds63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-10));
        org.joda.time.Weeks weeks2 = period1.toStandardWeeks();
        org.joda.time.Weeks weeks4 = weeks2.dividedBy(23);
        org.joda.time.Weeks weeks6 = weeks4.plus((-97));
        org.joda.time.Weeks weeks7 = weeks6.negated();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks9 = weeks7.multipliedBy((-2147483647));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 97 * -2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks7);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(97, 229, 28, 903);
        mutablePeriod4.addHours(0);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("2022-02-11T09:40:03.056Z/2022-02-11T09:40:03.056Z", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy((int) (byte) 1);
        int int3 = seconds2.size();
        org.joda.time.Period period5 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period7 = period5.minusMillis((-1));
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period7);
        boolean boolean9 = seconds2.isGreaterThan(seconds8);
        org.joda.time.PeriodType periodType10 = seconds2.getPeriodType();
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType12 = seconds11.getFieldType();
        org.joda.time.Seconds seconds14 = seconds11.plus((-1));
        org.joda.time.DurationFieldType durationFieldType15 = seconds11.getFieldType();
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType18 = seconds17.getFieldType();
        org.joda.time.Seconds seconds20 = seconds17.plus((-1));
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.TWO;
        java.lang.String str22 = seconds21.toString();
        org.joda.time.Seconds seconds23 = seconds20.plus(seconds21);
        org.joda.time.Seconds seconds24 = seconds16.minus(seconds21);
        org.joda.time.Seconds seconds25 = seconds11.plus(seconds16);
        org.joda.time.PeriodType periodType26 = seconds25.getPeriodType();
        boolean boolean27 = seconds2.isGreaterThan(seconds25);
        org.joda.time.Seconds seconds28 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType30 = seconds29.getFieldType();
        org.joda.time.Seconds seconds32 = seconds29.plus((-1));
        org.joda.time.Seconds seconds33 = org.joda.time.Seconds.TWO;
        java.lang.String str34 = seconds33.toString();
        org.joda.time.Seconds seconds35 = seconds32.plus(seconds33);
        org.joda.time.Seconds seconds36 = seconds28.minus(seconds33);
        org.joda.time.Seconds seconds38 = seconds36.multipliedBy((int) (byte) -1);
        org.joda.time.Seconds seconds39 = seconds2.minus(seconds36);
        org.joda.time.Period period40 = seconds2.toPeriod();
        org.joda.time.Duration duration43 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Period period45 = duration43.toPeriodFrom(readableInstant44);
        org.joda.time.Period period47 = period45.minusSeconds((int) '4');
        org.joda.time.Period period49 = period45.minusSeconds(10);
        org.joda.time.Period period51 = period45.withWeeks((int) (byte) -1);
        org.joda.time.Seconds seconds52 = period45.toStandardSeconds();
        org.joda.time.Seconds seconds54 = seconds52.plus((-97));
        org.joda.time.Seconds seconds56 = seconds52.multipliedBy(52);
        org.joda.time.Duration duration57 = seconds52.toStandardDuration();
        org.joda.time.Seconds seconds58 = seconds2.plus(seconds52);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((java.lang.Object) seconds2);
        int int60 = mutablePeriod59.getMonths();
        mutablePeriod59.setPeriod(0L, 1644572333739L);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT2S" + "'", str22, "PT2S");
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT2S" + "'", str34, "PT2S");
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(seconds52);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(seconds58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
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
        org.joda.time.PeriodType periodType15 = minutes14.getPeriodType();
        java.lang.String str16 = minutes14.toString();
        org.joda.time.Minutes minutes18 = minutes14.multipliedBy(229);
        int int19 = minutes14.getMinutes();
        org.joda.time.Duration duration20 = minutes14.toStandardDuration();
        org.joda.time.Duration duration22 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration24 = duration22.plus(1644572122285L);
        long long25 = duration22.getMillis();
        long long26 = duration22.getStandardHours();
        org.joda.time.Duration duration28 = duration22.withMillis((long) (byte) 0);
        org.joda.time.Duration duration30 = duration20.withDurationAdded((org.joda.time.ReadableDuration) duration28, 57);
        org.joda.time.Duration duration32 = duration30.minus(1644572349632L);
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
        org.joda.time.Instant instant56 = dateTime54.toInstant();
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant56, readableInstant57);
        java.lang.String str59 = instant56.toString();
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.standard();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) (short) 100, (-1L), periodType68);
        org.joda.time.Period period70 = new org.joda.time.Period(1L, (long) 52, periodType68);
        org.joda.time.Period period71 = new org.joda.time.Period(1644572249413L, 0L, periodType68);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(1644572287918L, 1644572333891L, periodType68, chronology72);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration32, (org.joda.time.ReadableInstant) instant56, periodType68);
        org.joda.time.Chronology chronology75 = instant56.getChronology();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT0M" + "'", str16, "PT0M");
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration32);
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
        org.junit.Assert.assertNotNull(instant56);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "2022-02-11T09:45:15.039Z" + "'", str59, "2022-02-11T09:45:15.039Z");
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(chronology75);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (short) 1);
        org.joda.time.Seconds seconds2 = period1.toStandardSeconds();
        org.joda.time.Period period4 = period1.minusMonths(17);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays(1644572435633L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1644572435633 * 86400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) ' ');
        org.joda.time.Days days2 = days1.negated();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration10 = duration7.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration12 = duration4.withDurationAdded((org.joda.time.ReadableDuration) duration7, (int) (short) 1);
        org.joda.time.Days days13 = duration12.toStandardDays();
        org.joda.time.Days days14 = duration12.toStandardDays();
        org.joda.time.Days days15 = duration12.toStandardDays();
        org.joda.time.ReadableInstant readableInstant16 = null;
        java.lang.Object obj17 = null;
        org.joda.time.Duration duration18 = new org.joda.time.Duration(obj17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration18);
        org.joda.time.Days days20 = duration18.toStandardDays();
        org.joda.time.Days days21 = days20.negated();
        org.joda.time.Days days22 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days24 = days22.minus(1);
        boolean boolean25 = days21.isLessThan(days24);
        org.joda.time.Days days27 = days21.multipliedBy((int) (byte) 0);
        org.joda.time.Days days29 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.Period period34 = new org.joda.time.Period((int) (byte) 0, (int) (byte) 10, (int) (byte) 100, (int) (byte) 100);
        org.joda.time.Period period36 = period34.plusDays(1);
        org.joda.time.ReadableInstant readableInstant37 = null;
        java.lang.Object obj38 = null;
        org.joda.time.Duration duration39 = new org.joda.time.Duration(obj38);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant37, (org.joda.time.ReadableDuration) duration39);
        org.joda.time.Days days41 = duration39.toStandardDays();
        org.joda.time.Days days42 = days41.negated();
        org.joda.time.Period period43 = period36.plus((org.joda.time.ReadablePeriod) days41);
        org.joda.time.Days days44 = days29.plus(days41);
        org.joda.time.DurationFieldType durationFieldType45 = days44.getFieldType();
        org.joda.time.Days days46 = days27.plus(days44);
        org.joda.time.Days days47 = days15.plus(days27);
        org.joda.time.Days days48 = days1.minus(days47);
        org.joda.time.Days days49 = days47.negated();
        org.joda.time.Duration duration50 = days47.toStandardDuration();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertNotNull(days46);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(days48);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(duration50);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks2 = weeks0.plus((int) '4');
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeks((int) (byte) -1);
        boolean boolean6 = weeks3.isGreaterThan(weeks5);
        org.joda.time.DurationFieldType durationFieldType7 = weeks5.getFieldType();
        boolean boolean8 = weeks0.isGreaterThan(weeks5);
        org.joda.time.Period period9 = weeks5.toPeriod();
        org.joda.time.Period period11 = new org.joda.time.Period(1L);
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Period period14 = period11.plus((org.joda.time.ReadablePeriod) weeks13);
        org.joda.time.Period period15 = period14.toPeriod();
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks19 = weeks18.negated();
        int int20 = weeks18.getWeeks();
        org.joda.time.Weeks weeks22 = weeks18.minus(3);
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.ONE;
        boolean boolean24 = weeks18.isLessThan(weeks23);
        org.joda.time.Weeks weeks25 = weeks16.plus(weeks23);
        org.joda.time.MutablePeriod mutablePeriod26 = weeks16.toMutablePeriod();
        org.joda.time.Weeks weeks27 = weeks5.plus(weeks16);
        org.joda.time.Weeks weeks28 = null;
        org.joda.time.Weeks weeks29 = weeks27.plus(weeks28);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks29);
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
        org.joda.time.Hours hours22 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        java.lang.Object obj26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(obj26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration27);
        boolean boolean29 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant34 = null;
        java.lang.Object obj35 = null;
        org.joda.time.Duration duration36 = new org.joda.time.Duration(obj35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration36);
        boolean boolean38 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration36);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Interval interval40 = duration36.toIntervalTo(readableInstant39);
        org.joda.time.Interval interval41 = interval40.toInterval();
        org.joda.time.Hours hours42 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval41);
        org.joda.time.Hours hours43 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval41);
        boolean boolean44 = interval31.overlaps((org.joda.time.ReadableInterval) interval41);
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant47 = null;
        java.lang.Object obj48 = null;
        org.joda.time.Duration duration49 = new org.joda.time.Duration(obj48);
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, (org.joda.time.ReadableDuration) duration49);
        boolean boolean51 = duration46.isShorterThan((org.joda.time.ReadableDuration) duration49);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Interval interval53 = duration49.toIntervalTo(readableInstant52);
        org.joda.time.Interval interval54 = interval53.toInterval();
        org.joda.time.Hours hours55 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval54);
        boolean boolean56 = interval41.contains((org.joda.time.ReadableInterval) interval54);
        boolean boolean57 = interval18.isAfter((org.joda.time.ReadableInterval) interval41);
        org.joda.time.Duration duration58 = interval41.toDuration();
        org.joda.time.Interval interval59 = interval41.toInterval();
        org.joda.time.Duration duration60 = interval59.toDuration();
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
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(hours42);
        org.junit.Assert.assertNotNull(hours43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(hours55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(duration60);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
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
        org.joda.time.Duration duration20 = interval17.toDuration();
        org.joda.time.Duration duration21 = interval17.toDuration();
        org.joda.time.Seconds seconds22 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Chronology chronology23 = interval17.getChronology();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.097S" + "'", str7, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644572715151L + "'", long18 == 1644572715151L);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(1644572416610L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
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
        mutablePeriod9.setPeriod((long) 1, 100L);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) (byte) 0, chronology28);
        java.lang.String str30 = mutablePeriod29.toString();
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant33 = null;
        java.lang.Object obj34 = null;
        org.joda.time.Duration duration35 = new org.joda.time.Duration(obj34);
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant33, (org.joda.time.ReadableDuration) duration35);
        boolean boolean37 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration35);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Interval interval39 = duration35.toIntervalTo(readableInstant38);
        long long40 = interval39.getStartMillis();
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType43);
        mutablePeriod44.setYears(0);
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology49 = null;
        mutablePeriod44.setPeriod((org.joda.time.ReadableDuration) duration48, chronology49);
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant53 = null;
        java.lang.Object obj54 = null;
        org.joda.time.Duration duration55 = new org.joda.time.Duration(obj54);
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, (org.joda.time.ReadableDuration) duration55);
        boolean boolean57 = duration52.isShorterThan((org.joda.time.ReadableDuration) duration55);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Interval interval59 = duration55.toIntervalTo(readableInstant58);
        org.joda.time.Interval interval60 = interval59.toInterval();
        org.joda.time.DateTime dateTime61 = interval60.getEnd();
        org.joda.time.Duration duration63 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant64 = null;
        java.lang.Object obj65 = null;
        org.joda.time.Duration duration66 = new org.joda.time.Duration(obj65);
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant64, (org.joda.time.ReadableDuration) duration66);
        boolean boolean68 = duration63.isShorterThan((org.joda.time.ReadableDuration) duration66);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Interval interval70 = duration66.toIntervalTo(readableInstant69);
        org.joda.time.Interval interval71 = interval70.toInterval();
        org.joda.time.DateTime dateTime72 = interval71.getEnd();
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration48, (org.joda.time.ReadableInstant) dateTime61);
        boolean boolean75 = interval39.isBefore((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Duration duration76 = mutablePeriod29.toDurationFrom((org.joda.time.ReadableInstant) dateTime61);
        mutablePeriod9.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod29);
        mutablePeriod29.add(259, 222, (-5), (-9700), (-2147483647), (-49), 101, 36000000);
        org.joda.time.MutablePeriod mutablePeriod87 = mutablePeriod29.copy();
        org.joda.time.format.PeriodFormatter periodFormatter88 = null;
        java.lang.String str89 = mutablePeriod87.toString(periodFormatter88);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT0S" + "'", str30, "PT0S");
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(interval39);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1644572715169L + "'", long40 == 1644572715169L);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertNotNull(mutablePeriod87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "P259Y222M-5W-9700DT-2147483647H-49M36101S" + "'", str89, "P259Y222M-5W-9700DT-2147483647H-49M36101S");
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        org.joda.time.Period period1 = new org.joda.time.Period(1L);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Period period4 = period1.plus((org.joda.time.ReadablePeriod) weeks3);
        org.joda.time.Period period6 = period4.withWeeks((int) 'a');
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType9);
        org.joda.time.PeriodType periodType11 = mutablePeriod10.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(periodType11);
        org.joda.time.Period period13 = period6.normalizedStandard(periodType11);
        org.joda.time.Period period15 = period13.withDays((int) '4');
        org.joda.time.MutablePeriod mutablePeriod16 = period13.toMutablePeriod();
        int int17 = mutablePeriod16.getDays();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType20);
        mutablePeriod21.addMillis((-1));
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        java.lang.Object obj27 = null;
        org.joda.time.Duration duration28 = new org.joda.time.Duration(obj27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration28);
        boolean boolean30 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Interval interval32 = duration28.toIntervalTo(readableInstant31);
        org.joda.time.Interval interval33 = interval32.toInterval();
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        java.lang.Object obj37 = null;
        org.joda.time.Duration duration38 = new org.joda.time.Duration(obj37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration38);
        boolean boolean40 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Interval interval42 = duration38.toIntervalTo(readableInstant41);
        boolean boolean43 = interval33.isAfter((org.joda.time.ReadableInterval) interval42);
        org.joda.time.Weeks weeks44 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval42);
        org.joda.time.Period period45 = interval42.toPeriod();
        mutablePeriod21.add((org.joda.time.ReadableInterval) interval42);
        mutablePeriod21.add((int) 'a', (int) ' ', (int) (short) -1, (int) (short) 10, (int) (byte) 10, (int) '#', (int) (byte) 100, (-97));
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType58);
        mutablePeriod59.setYears(0);
        mutablePeriod59.setWeeks((int) (short) -1);
        org.joda.time.Duration duration65 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant66 = null;
        java.lang.Object obj67 = null;
        org.joda.time.Duration duration68 = new org.joda.time.Duration(obj67);
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, (org.joda.time.ReadableDuration) duration68);
        boolean boolean70 = duration65.isShorterThan((org.joda.time.ReadableDuration) duration68);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Interval interval72 = duration68.toIntervalTo(readableInstant71);
        mutablePeriod59.setPeriod((org.joda.time.ReadableInterval) interval72);
        org.joda.time.PeriodType periodType74 = org.joda.time.PeriodType.dayTime();
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((java.lang.Object) interval72, periodType74);
        long long76 = interval72.getEndMillis();
        mutablePeriod21.setPeriod((org.joda.time.ReadableInterval) interval72);
        mutablePeriod16.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod21);
        mutablePeriod16.setDays(1142064018);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(periodType74);
// flaky:         org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1644572715191L + "'", long76 == 1644572715191L);
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(periodType3);
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(10L, periodType3);
        int int6 = mutablePeriod5.getMillis();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration11 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration14 = duration11.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration16 = duration8.withDurationAdded((org.joda.time.ReadableDuration) duration11, (int) (short) 1);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration22 = duration19.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration24 = duration8.withDurationAdded((org.joda.time.ReadableDuration) duration22, (int) (short) 100);
        mutablePeriod5.add((org.joda.time.ReadableDuration) duration24);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod();
        mutablePeriod26.setPeriod(100L, (long) (-1));
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod26, periodType30);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.years();
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant37 = null;
        java.lang.Object obj38 = null;
        org.joda.time.Duration duration39 = new org.joda.time.Duration(obj38);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant37, (org.joda.time.ReadableDuration) duration39);
        boolean boolean41 = duration36.isShorterThan((org.joda.time.ReadableDuration) duration39);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Interval interval43 = duration39.toIntervalTo(readableInstant42);
        org.joda.time.Interval interval44 = interval43.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        boolean boolean46 = durationFieldType34.isSupported(chronology45);
        mutablePeriod26.setPeriod((long) 0, (long) 8, chronology45);
        org.joda.time.Period period48 = duration24.toPeriod(chronology45);
        org.joda.time.Period period49 = new org.joda.time.Period(1644572137529L, chronology45);
        org.joda.time.Seconds seconds50 = period49.toStandardSeconds();
        org.joda.time.Seconds seconds52 = seconds50.dividedBy(27409600);
        org.joda.time.Seconds seconds54 = seconds50.plus((-11));
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(seconds50);
        org.junit.Assert.assertNotNull(seconds52);
        org.junit.Assert.assertNotNull(seconds54);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) '4');
        long long2 = duration1.getMillis();
        org.joda.time.Minutes minutes3 = duration1.toStandardMinutes();
        java.lang.String str4 = minutes3.toString();
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.Duration duration8 = org.joda.time.Duration.millis((long) '4');
        long long9 = duration8.getMillis();
        org.joda.time.Minutes minutes10 = duration8.toStandardMinutes();
        org.joda.time.Minutes minutes11 = minutes10.negated();
        org.joda.time.Minutes minutes12 = minutes6.plus(minutes10);
        org.joda.time.Minutes minutes13 = minutes12.negated();
        org.joda.time.Minutes minutes14 = minutes3.plus(minutes13);
        org.joda.time.PeriodType periodType15 = minutes14.getPeriodType();
        org.joda.time.Duration duration17 = org.joda.time.Duration.millis((long) '4');
        long long18 = duration17.getMillis();
        org.joda.time.Minutes minutes19 = duration17.toStandardMinutes();
        java.lang.String str20 = minutes19.toString();
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.Duration duration24 = org.joda.time.Duration.millis((long) '4');
        long long25 = duration24.getMillis();
        org.joda.time.Minutes minutes26 = duration24.toStandardMinutes();
        org.joda.time.Minutes minutes27 = minutes26.negated();
        org.joda.time.Minutes minutes28 = minutes22.plus(minutes26);
        org.joda.time.Minutes minutes29 = minutes28.negated();
        org.joda.time.Minutes minutes30 = minutes19.plus(minutes29);
        org.joda.time.Duration duration32 = org.joda.time.Duration.millis((long) '4');
        long long33 = duration32.getMillis();
        org.joda.time.Minutes minutes34 = duration32.toStandardMinutes();
        org.joda.time.Minutes minutes35 = minutes34.negated();
        org.joda.time.DurationFieldType durationFieldType36 = minutes35.getFieldType();
        org.joda.time.Period period37 = minutes35.toPeriod();
        int int38 = minutes35.getMinutes();
        org.joda.time.Minutes minutes39 = minutes30.minus(minutes35);
        org.joda.time.Minutes minutes40 = minutes30.negated();
        org.joda.time.Minutes minutes41 = minutes14.plus(minutes30);
        org.joda.time.Minutes minutes43 = minutes30.multipliedBy((-99));
        org.joda.time.Minutes minutes45 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.Minutes minutes47 = org.joda.time.Minutes.minutes(30);
        org.joda.time.Minutes minutes48 = minutes45.plus(minutes47);
        org.joda.time.Duration duration51 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration54 = duration51.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Minutes minutes55 = duration54.toStandardMinutes();
        org.joda.time.Duration duration57 = org.joda.time.Duration.millis((long) '4');
        long long58 = duration57.getMillis();
        org.joda.time.Minutes minutes59 = duration57.toStandardMinutes();
        org.joda.time.Minutes minutes60 = minutes59.negated();
        boolean boolean61 = minutes55.isGreaterThan(minutes60);
        org.joda.time.Minutes minutes63 = minutes55.minus((int) (byte) 0);
        org.joda.time.Minutes minutes64 = minutes45.minus(minutes55);
        org.joda.time.Minutes minutes65 = org.joda.time.Minutes.ZERO;
        boolean boolean66 = minutes64.isGreaterThan(minutes65);
        org.joda.time.Minutes minutes68 = minutes65.multipliedBy(3);
        org.joda.time.Minutes minutes70 = minutes68.dividedBy(127);
        org.joda.time.Duration duration72 = org.joda.time.Duration.millis((long) '4');
        long long73 = duration72.getMillis();
        org.joda.time.Minutes minutes74 = duration72.toStandardMinutes();
        org.joda.time.Minutes minutes75 = minutes74.negated();
        org.joda.time.Minutes minutes76 = minutes75.negated();
        org.joda.time.Period period78 = new org.joda.time.Period(1L);
        org.joda.time.Minutes minutes79 = period78.toStandardMinutes();
        org.joda.time.Minutes minutes80 = minutes76.plus(minutes79);
        org.joda.time.Minutes minutes82 = minutes76.multipliedBy((-9700));
        org.joda.time.Period period83 = minutes76.toPeriod();
        org.joda.time.Minutes minutes84 = minutes70.plus(minutes76);
        org.joda.time.Minutes minutes85 = minutes30.minus(minutes70);
        org.joda.time.DurationFieldType durationFieldType86 = minutes85.getFieldType();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0M" + "'", str4, "PT0M");
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT0M" + "'", str20, "PT0M");
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 52L + "'", long25 == 52L);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 52L + "'", long33 == 52L);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(minutes45);
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 52L + "'", long58 == 52L);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertNotNull(minutes60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(minutes63);
        org.junit.Assert.assertNotNull(minutes64);
        org.junit.Assert.assertNotNull(minutes65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(minutes68);
        org.junit.Assert.assertNotNull(minutes70);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 52L + "'", long73 == 52L);
        org.junit.Assert.assertNotNull(minutes74);
        org.junit.Assert.assertNotNull(minutes75);
        org.junit.Assert.assertNotNull(minutes76);
        org.junit.Assert.assertNotNull(minutes79);
        org.junit.Assert.assertNotNull(minutes80);
        org.junit.Assert.assertNotNull(minutes82);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(minutes84);
        org.junit.Assert.assertNotNull(minutes85);
        org.junit.Assert.assertNotNull(durationFieldType86);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        org.joda.time.Days days1 = org.joda.time.Days.days(6);
        org.joda.time.Days days3 = org.joda.time.Days.days(0);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardSeconds(1644572135205L);
        org.joda.time.Days days6 = duration5.toStandardDays();
        org.joda.time.Days days8 = days6.minus(22);
        org.joda.time.Days days9 = org.joda.time.Days.ONE;
        org.joda.time.Days days10 = days9.negated();
        org.joda.time.Days days11 = org.joda.time.Days.ONE;
        org.joda.time.Days days12 = days11.negated();
        boolean boolean13 = days10.isGreaterThan(days12);
        org.joda.time.Days days15 = days12.minus((int) (short) -1);
        org.joda.time.Days days17 = days15.minus(100);
        org.joda.time.Days days19 = days15.plus(101);
        org.joda.time.Days days21 = days15.minus(8);
        boolean boolean22 = days8.isLessThan(days15);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType25 = periodType24.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(periodType25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(10L, periodType25);
        org.joda.time.DurationFieldType[] durationFieldTypeArray28 = mutablePeriod27.getFieldTypes();
        org.joda.time.Days days29 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.Days days30 = days8.minus(days29);
        org.joda.time.Days days31 = days3.plus(days30);
        boolean boolean32 = days1.isGreaterThan(days3);
        org.joda.time.Days days34 = days3.multipliedBy((int) '#');
        org.joda.time.Duration duration37 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration40 = duration37.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration42 = duration40.withMillis((long) (byte) 10);
        org.joda.time.Days days43 = duration42.toStandardDays();
        org.joda.time.Days days45 = days43.plus((int) (byte) 100);
        org.joda.time.Days days47 = org.joda.time.Days.days(10);
        org.joda.time.Days days48 = org.joda.time.Days.ONE;
        org.joda.time.Days days49 = days48.negated();
        org.joda.time.Days days50 = org.joda.time.Days.ONE;
        org.joda.time.Days days51 = days50.negated();
        boolean boolean52 = days49.isGreaterThan(days51);
        int int53 = days51.size();
        boolean boolean54 = days47.isGreaterThan(days51);
        int int55 = days47.getDays();
        org.joda.time.Duration duration58 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Period period60 = duration58.toPeriodFrom(readableInstant59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = duration58.toPeriod(chronology61);
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType64 = periodType63.withMillisRemoved();
        org.joda.time.Period period65 = period62.withPeriodType(periodType63);
        org.joda.time.Days days66 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period65);
        org.joda.time.Days days67 = days47.minus(days66);
        org.joda.time.Days days68 = days45.plus(days67);
        org.joda.time.Duration duration69 = days45.toStandardDuration();
        org.joda.time.Days days70 = days3.plus(days45);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(durationFieldTypeArray28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days45);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(days48);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(days50);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(days66);
        org.junit.Assert.assertNotNull(days67);
        org.junit.Assert.assertNotNull(days68);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(days70);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object) duration1, periodType7, chronology8);
        org.joda.time.PeriodType periodType10 = periodType7.withMonthsRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        java.lang.String str12 = periodType11.toString();
        org.joda.time.PeriodType periodType13 = periodType11.withMillisRemoved();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[Millis]" + "'", str12, "PeriodType[Millis]");
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 10);
        org.joda.time.Period period3 = period1.plusMonths((int) (short) 0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = period3.getFieldTypes();
        int[] intArray5 = period3.getValues();
        int int6 = period3.getDays();
        boolean boolean8 = period3.equals((java.lang.Object) 1644572401188L);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration16 = duration13.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration18 = duration10.withDurationAdded((org.joda.time.ReadableDuration) duration13, (int) (short) 1);
        org.joda.time.Duration duration20 = duration10.plus(1644572134288L);
        org.joda.time.Duration duration23 = new org.joda.time.Duration(1L, 1644572122326L);
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
        org.joda.time.Instant instant47 = dateTime45.toInstant();
        org.joda.time.Weeks weeks48 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks49 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks50 = weeks48.minus(weeks49);
        org.joda.time.Period period51 = new org.joda.time.Period((java.lang.Object) weeks50);
        org.joda.time.PeriodType periodType52 = weeks50.getPeriodType();
        org.joda.time.Period period53 = duration23.toPeriodTo((org.joda.time.ReadableInstant) instant47, periodType52);
        org.joda.time.Interval interval54 = duration10.toIntervalFrom((org.joda.time.ReadableInstant) instant47);
        org.joda.time.Duration duration55 = period3.toDurationTo((org.joda.time.ReadableInstant) instant47);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration20);
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
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertNotNull(weeks48);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertNotNull(weeks50);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(duration55);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
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
        org.joda.time.Period period23 = period21.plusHours((int) (short) -1);
        org.joda.time.Period period25 = period21.plusSeconds(22);
        org.joda.time.Period period27 = period21.minusMillis((-9700));
        org.joda.time.Period period29 = period27.withDays((int) 'a');
        org.joda.time.Weeks weeks30 = period27.toStandardWeeks();
        org.joda.time.Weeks weeks32 = weeks30.multipliedBy(43);
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
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks32);
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(obj1);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.Period period5 = period3.minusMinutes((int) (short) 1);
        org.joda.time.Period period7 = period3.minusHours((int) '#');
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period10 = period3.withFieldAdded(durationFieldType8, 32);
        org.joda.time.Minutes minutes11 = period3.toStandardMinutes();
        org.joda.time.Minutes minutes13 = minutes11.minus((-4));
        org.joda.time.DurationFieldType durationFieldType14 = minutes13.getFieldType();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(durationFieldType14);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object) duration1, periodType7, chronology8);
        int int10 = mutablePeriod9.getSeconds();
        mutablePeriod9.clear();
        org.joda.time.ReadableInstant readableInstant14 = null;
        java.lang.Object obj15 = null;
        org.joda.time.Duration duration16 = new org.joda.time.Duration(obj15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration16, readableInstant18);
        org.joda.time.Duration duration21 = org.joda.time.Duration.millis((long) '4');
        long long22 = duration21.getStandardDays();
        boolean boolean23 = duration16.isLongerThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType25 = periodType24.withHoursRemoved();
        org.joda.time.Period period26 = duration21.toPeriod(periodType24);
        org.joda.time.PeriodType periodType27 = periodType24.withYearsRemoved();
        java.lang.Object obj28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod();
        mutablePeriod29.setPeriod(100L, (long) (-1));
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod29, periodType33);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.years();
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        java.lang.Object obj41 = null;
        org.joda.time.Duration duration42 = new org.joda.time.Duration(obj41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, (org.joda.time.ReadableDuration) duration42);
        boolean boolean44 = duration39.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Interval interval46 = duration42.toIntervalTo(readableInstant45);
        org.joda.time.Interval interval47 = interval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        boolean boolean49 = durationFieldType37.isSupported(chronology48);
        mutablePeriod29.setPeriod((long) 0, (long) 8, chronology48);
        org.joda.time.Period period51 = new org.joda.time.Period(obj28, chronology48);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(0L, periodType24, chronology48);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.setPeriod(1644572679577L, chronology48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1644572679577");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        org.joda.time.Period period1 = new org.joda.time.Period(10L);
        org.joda.time.Period period3 = period1.minusMonths((int) (byte) 100);
        int int4 = period1.size();
        org.joda.time.Period period6 = period1.multipliedBy((-8));
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) '4');
        org.joda.time.Period period3 = period1.minusHours((int) (byte) -1);
        org.joda.time.Period period5 = period1.plusSeconds((int) (short) 0);
        int int6 = period5.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        org.joda.time.Period period1 = org.joda.time.Period.hours(2147483644);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) ' ', chronology4);
        org.joda.time.Duration duration7 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration9 = duration7.plus(1644572122285L);
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration9);
        int int11 = mutablePeriod5.getSeconds();
        mutablePeriod5.addMonths((int) (short) 1);
        org.joda.time.PeriodType periodType14 = mutablePeriod5.getPeriodType();
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
        org.joda.time.Chronology chronology40 = dateTime27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(1644572166118L, 1644572162497L, chronology40);
        org.joda.time.Period period42 = new org.joda.time.Period(1644572170016L, periodType14, chronology40);
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration50 = duration47.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration52 = duration44.withDurationAdded((org.joda.time.ReadableDuration) duration47, (int) (short) 1);
        org.joda.time.Duration duration54 = duration44.plus(1644572134288L);
        long long55 = duration44.getMillis();
        boolean boolean56 = periodType14.equals((java.lang.Object) long55);
        java.lang.String str57 = periodType14.getName();
        org.joda.time.PeriodType periodType58 = periodType14.withHoursRemoved();
        java.lang.String str59 = periodType58.getName();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(1644572407553L, 1644572178101L, periodType58);
        org.joda.time.PeriodType periodType61 = periodType58.withWeeksRemoved();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
        org.junit.Assert.assertNotNull(periodType14);
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
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 36000000L + "'", long55 == 36000000L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Standard" + "'", str57, "Standard");
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "StandardNoHours" + "'", str59, "StandardNoHours");
        org.junit.Assert.assertNotNull(periodType61);
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("2022-02-11T09:42:27.745Z/2022-02-11T09:42:27.745Z", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.Period period1 = new org.joda.time.Period((java.lang.Object) minutes0);
        org.joda.time.Period period2 = minutes0.toPeriod();
        org.joda.time.Duration duration4 = org.joda.time.Duration.millis((long) '4');
        long long5 = duration4.getMillis();
        org.joda.time.Minutes minutes6 = duration4.toStandardMinutes();
        org.joda.time.Minutes minutes7 = minutes6.negated();
        org.joda.time.Minutes minutes9 = minutes6.minus((int) 'a');
        org.joda.time.Minutes minutes10 = minutes0.minus(minutes6);
        org.joda.time.Duration duration12 = org.joda.time.Duration.millis((long) '4');
        long long13 = duration12.getMillis();
        org.joda.time.Minutes minutes14 = duration12.toStandardMinutes();
        org.joda.time.Minutes minutes15 = minutes14.negated();
        org.joda.time.Minutes minutes16 = minutes15.negated();
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration24 = duration21.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration26 = duration18.withDurationAdded((org.joda.time.ReadableDuration) duration21, (int) (short) 1);
        org.joda.time.Duration duration29 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration32 = duration29.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration34 = duration18.withDurationAdded((org.joda.time.ReadableDuration) duration32, (int) (short) 100);
        org.joda.time.Minutes minutes35 = duration32.toStandardMinutes();
        org.joda.time.Minutes minutes36 = minutes15.minus(minutes35);
        org.joda.time.Minutes minutes37 = minutes6.minus(minutes36);
        org.joda.time.Duration duration39 = org.joda.time.Duration.millis((long) '4');
        long long40 = duration39.getMillis();
        org.joda.time.Minutes minutes41 = duration39.toStandardMinutes();
        java.lang.String str42 = minutes41.toString();
        org.joda.time.Minutes minutes44 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.Duration duration46 = org.joda.time.Duration.millis((long) '4');
        long long47 = duration46.getMillis();
        org.joda.time.Minutes minutes48 = duration46.toStandardMinutes();
        org.joda.time.Minutes minutes49 = minutes48.negated();
        org.joda.time.Minutes minutes50 = minutes44.plus(minutes48);
        org.joda.time.Minutes minutes51 = minutes50.negated();
        org.joda.time.Minutes minutes52 = minutes41.plus(minutes51);
        org.joda.time.PeriodType periodType53 = minutes52.getPeriodType();
        boolean boolean54 = minutes37.isGreaterThan(minutes52);
        int int55 = minutes37.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod56 = minutes37.toMutablePeriod();
        org.joda.time.Minutes minutes58 = minutes37.plus(97);
        org.joda.time.Period period59 = minutes37.toPeriod();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 52L + "'", long40 == 52L);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT0M" + "'", str42, "PT0M");
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 52L + "'", long47 == 52L);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertNotNull(minutes52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod56);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertNotNull(period59);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0.097S");
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.Period period4 = period2.plusMinutes((-1));
        int[] intArray5 = period2.getValues();
        int int6 = period2.getDays();
        int int7 = period2.size();
        org.joda.time.Duration duration8 = period2.toStandardDuration();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, -97]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks5 = weeks4.negated();
        org.joda.time.Weeks weeks6 = weeks2.minus(weeks5);
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks9 = weeks8.negated();
        int int10 = weeks8.getWeeks();
        org.joda.time.Weeks weeks11 = weeks6.minus(weeks8);
        org.joda.time.DurationFieldType durationFieldType12 = weeks6.getFieldType();
        org.joda.time.Duration duration13 = weeks6.toStandardDuration();
        org.joda.time.Weeks weeks15 = weeks6.multipliedBy(35);
        org.joda.time.Weeks weeks17 = weeks15.plus((-5));
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        org.joda.time.Period period8 = period6.withYears((int) (byte) 10);
        org.joda.time.Period period9 = period6.toPeriod();
        org.joda.time.Period period10 = period6.toPeriod();
        int int11 = period6.getMillis();
        org.joda.time.Period period13 = period6.withWeeks((-10));
        org.joda.time.Period period15 = period6.plusDays(0);
        int int16 = period6.getWeeks();
        int int17 = period6.getMillis();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-97) + "'", int11 == (-97));
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-97) + "'", int17 == (-97));
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("2022-02-11T09:44:21.781Z", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(1644572126273L, periodType1);
        mutablePeriod2.setPeriod((long) (short) 1, (long) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod2.toMutablePeriod();
        mutablePeriod6.addSeconds(6);
        mutablePeriod6.addMinutes((-7));
        org.junit.Assert.assertNotNull(mutablePeriod6);
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        org.joda.time.Duration duration3 = org.joda.time.Duration.millis((long) '4');
        long long4 = duration3.getMillis();
        org.joda.time.Minutes minutes5 = duration3.toStandardMinutes();
        java.lang.String str6 = minutes5.toString();
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.Duration duration10 = org.joda.time.Duration.millis((long) '4');
        long long11 = duration10.getMillis();
        org.joda.time.Minutes minutes12 = duration10.toStandardMinutes();
        org.joda.time.Minutes minutes13 = minutes12.negated();
        org.joda.time.Minutes minutes14 = minutes8.plus(minutes12);
        org.joda.time.Minutes minutes15 = minutes14.negated();
        org.joda.time.Minutes minutes16 = minutes5.plus(minutes15);
        org.joda.time.Duration duration18 = org.joda.time.Duration.millis((long) '4');
        long long19 = duration18.getMillis();
        org.joda.time.Minutes minutes20 = duration18.toStandardMinutes();
        org.joda.time.Minutes minutes21 = minutes20.negated();
        org.joda.time.DurationFieldType durationFieldType22 = minutes21.getFieldType();
        org.joda.time.Period period23 = minutes21.toPeriod();
        int int24 = minutes21.getMinutes();
        org.joda.time.Minutes minutes25 = minutes16.minus(minutes21);
        org.joda.time.PeriodType periodType26 = minutes16.getPeriodType();
        org.joda.time.Period period27 = new org.joda.time.Period(1644572419560L, 1644572146961L, periodType26);
        org.joda.time.Period period28 = period27.negated();
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0M" + "'", str6, "PT0M");
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((-42), 35, 2147483647, (-229));
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '4');
        org.joda.time.Minutes minutes7 = period4.toStandardMinutes();
        org.joda.time.Period period9 = period4.multipliedBy((int) (byte) 100);
        org.joda.time.Period period11 = period4.withSeconds((int) ' ');
        org.joda.time.Period period13 = period11.withWeeks((int) (byte) -1);
        org.joda.time.Period period14 = period13.toPeriod();
        org.joda.time.Period period16 = period13.minusSeconds((int) ' ');
        org.joda.time.Period period18 = period16.withDays(2147483644);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
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
        org.joda.time.Period period21 = interval18.toPeriod();
        org.joda.time.Duration duration22 = interval18.toDuration();
        org.joda.time.DateTime dateTime23 = interval18.getEnd();
        org.joda.time.ReadableInterval readableInterval24 = null;
        boolean boolean25 = interval18.contains(readableInterval24);
        org.joda.time.Weeks weeks27 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks28 = weeks27.negated();
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks31 = weeks30.negated();
        org.joda.time.Weeks weeks32 = weeks28.minus(weeks31);
        org.joda.time.Duration duration33 = weeks28.toStandardDuration();
        org.joda.time.PeriodType periodType34 = weeks28.getPeriodType();
        boolean boolean35 = interval18.equals((java.lang.Object) weeks28);
        org.joda.time.Weeks weeks36 = weeks28.negated();
        org.joda.time.Weeks weeks38 = weeks36.multipliedBy((-10));
        org.joda.time.Weeks weeks40 = weeks36.multipliedBy(0);
        org.joda.time.Weeks weeks41 = org.joda.time.Weeks.THREE;
        int int42 = weeks41.size();
        org.joda.time.Duration duration43 = weeks41.toStandardDuration();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.standard();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) (byte) 0, periodType46);
        mutablePeriod47.addSeconds(36);
        org.joda.time.Weeks weeks50 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.joda.time.DurationFieldType durationFieldType51 = weeks50.getFieldType();
        org.joda.time.Weeks weeks52 = weeks41.plus(weeks50);
        org.joda.time.Weeks weeks53 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks55 = weeks53.plus((int) '4');
        org.joda.time.Weeks weeks56 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks58 = org.joda.time.Weeks.weeks((int) (byte) -1);
        boolean boolean59 = weeks56.isGreaterThan(weeks58);
        org.joda.time.DurationFieldType durationFieldType60 = weeks58.getFieldType();
        boolean boolean61 = weeks53.isGreaterThan(weeks58);
        org.joda.time.Period period62 = weeks58.toPeriod();
        org.joda.time.Period period64 = new org.joda.time.Period(1L);
        org.joda.time.Weeks weeks66 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Period period67 = period64.plus((org.joda.time.ReadablePeriod) weeks66);
        org.joda.time.Period period68 = period67.toPeriod();
        org.joda.time.Weeks weeks69 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period68);
        org.joda.time.Weeks weeks71 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks72 = weeks71.negated();
        int int73 = weeks71.getWeeks();
        org.joda.time.Weeks weeks75 = weeks71.minus(3);
        org.joda.time.Weeks weeks76 = org.joda.time.Weeks.ONE;
        boolean boolean77 = weeks71.isLessThan(weeks76);
        org.joda.time.Weeks weeks78 = weeks69.plus(weeks76);
        org.joda.time.MutablePeriod mutablePeriod79 = weeks69.toMutablePeriod();
        org.joda.time.Weeks weeks80 = weeks58.plus(weeks69);
        org.joda.time.PeriodType periodType81 = weeks69.getPeriodType();
        org.joda.time.Weeks weeks82 = weeks41.minus(weeks69);
        boolean boolean83 = weeks40.isGreaterThan(weeks41);
        java.lang.String str84 = weeks41.toString();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(weeks50);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertNotNull(weeks52);
        org.junit.Assert.assertNotNull(weeks53);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertNotNull(weeks56);
        org.junit.Assert.assertNotNull(weeks58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(weeks66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(weeks69);
        org.junit.Assert.assertNotNull(weeks71);
        org.junit.Assert.assertNotNull(weeks72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(weeks75);
        org.junit.Assert.assertNotNull(weeks76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(weeks78);
        org.junit.Assert.assertNotNull(mutablePeriod79);
        org.junit.Assert.assertNotNull(weeks80);
        org.junit.Assert.assertNotNull(periodType81);
        org.junit.Assert.assertNotNull(weeks82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "P3W" + "'", str84, "P3W");
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        int int3 = weeks1.getWeeks();
        org.joda.time.Weeks weeks5 = weeks1.minus(3);
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.ONE;
        boolean boolean7 = weeks1.isLessThan(weeks6);
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant10 = null;
        java.lang.Object obj11 = null;
        org.joda.time.Duration duration12 = new org.joda.time.Duration(obj11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration12);
        boolean boolean14 = duration9.isShorterThan((org.joda.time.ReadableDuration) duration12);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Interval interval16 = duration12.toIntervalTo(readableInstant15);
        org.joda.time.Interval interval17 = interval16.toInterval();
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        java.lang.Object obj21 = null;
        org.joda.time.Duration duration22 = new org.joda.time.Duration(obj21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration22);
        boolean boolean24 = duration19.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Interval interval26 = duration22.toIntervalTo(readableInstant25);
        boolean boolean27 = interval17.isAfter((org.joda.time.ReadableInterval) interval26);
        org.joda.time.Weeks weeks28 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval26);
        org.joda.time.Duration duration31 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = duration31.toPeriodFrom(readableInstant32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = duration31.toPeriod(chronology34);
        java.lang.String str36 = period35.toString();
        org.joda.time.MutablePeriod mutablePeriod37 = period35.toMutablePeriod();
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        java.lang.Object obj41 = null;
        org.joda.time.Duration duration42 = new org.joda.time.Duration(obj41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, (org.joda.time.ReadableDuration) duration42);
        boolean boolean44 = duration39.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Interval interval46 = duration42.toIntervalTo(readableInstant45);
        long long47 = interval46.getStartMillis();
        mutablePeriod37.setPeriod((org.joda.time.ReadableInterval) interval46);
        org.joda.time.Interval interval49 = interval46.toInterval();
        org.joda.time.Duration duration50 = interval49.toDuration();
        boolean boolean51 = interval26.isAfter((org.joda.time.ReadableInterval) interval49);
        org.joda.time.Weeks weeks52 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval49);
        boolean boolean53 = weeks1.isGreaterThan(weeks52);
        org.joda.time.Weeks weeks55 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks56 = weeks55.negated();
        org.joda.time.PeriodType periodType57 = weeks55.getPeriodType();
        org.joda.time.Weeks weeks58 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks59 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks60 = weeks58.minus(weeks59);
        org.joda.time.Weeks weeks62 = weeks60.multipliedBy(100);
        boolean boolean63 = weeks55.isLessThan(weeks62);
        int int64 = weeks55.getWeeks();
        org.joda.time.Weeks weeks65 = weeks52.minus(weeks55);
        org.joda.time.Weeks weeks66 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks67 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks68 = weeks66.minus(weeks67);
        int int69 = weeks68.getWeeks();
        org.joda.time.Duration duration70 = weeks68.toStandardDuration();
        org.joda.time.Weeks weeks72 = weeks68.plus((-97));
        org.joda.time.Weeks weeks74 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks75 = weeks74.negated();
        int int76 = weeks74.getWeeks();
        java.lang.String str77 = weeks74.toString();
        org.joda.time.Weeks weeks78 = weeks68.minus(weeks74);
        org.joda.time.DurationFieldType durationFieldType80 = weeks68.getFieldType((int) (short) 0);
        org.joda.time.Weeks weeks81 = weeks65.plus(weeks68);
        org.joda.time.Weeks weeks83 = weeks65.dividedBy(58);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval26);
// flaky:         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PT0.097S" + "'", str36, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval46);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1644572715656L + "'", long47 == 1644572715656L);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(weeks52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertNotNull(weeks56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(weeks58);
        org.junit.Assert.assertNotNull(weeks59);
        org.junit.Assert.assertNotNull(weeks60);
        org.junit.Assert.assertNotNull(weeks62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(weeks65);
        org.junit.Assert.assertNotNull(weeks66);
        org.junit.Assert.assertNotNull(weeks67);
        org.junit.Assert.assertNotNull(weeks68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(weeks72);
        org.junit.Assert.assertNotNull(weeks74);
        org.junit.Assert.assertNotNull(weeks75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "P-1W" + "'", str77, "P-1W");
        org.junit.Assert.assertNotNull(weeks78);
        org.junit.Assert.assertNotNull(durationFieldType80);
        org.junit.Assert.assertNotNull(weeks81);
        org.junit.Assert.assertNotNull(weeks83);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType3);
        mutablePeriod4.setYears(0);
        mutablePeriod4.setWeeks((int) (short) -1);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration13.toIntervalTo(readableInstant16);
        mutablePeriod4.setPeriod((org.joda.time.ReadableInterval) interval17);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.dayTime();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((java.lang.Object) interval17, periodType19);
        long long21 = interval17.getEndMillis();
        org.joda.time.Chronology chronology22 = interval17.getChronology();
        org.joda.time.Interval interval23 = interval17.toInterval();
        org.joda.time.Period period25 = org.joda.time.Period.years((int) (short) 0);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.PeriodType periodType28 = periodType27.withMillisRemoved();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.days();
        boolean boolean30 = periodType28.isSupported(durationFieldType29);
        org.joda.time.Period period31 = period25.withPeriodType(periodType28);
        org.joda.time.Days days32 = org.joda.time.Days.ONE;
        org.joda.time.Days days33 = days32.negated();
        org.joda.time.Days days34 = org.joda.time.Days.ONE;
        org.joda.time.Days days35 = days34.negated();
        boolean boolean36 = days33.isGreaterThan(days35);
        int int37 = days35.size();
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
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
        org.joda.time.PeriodType periodType74 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period75 = duration39.toPeriodTo((org.joda.time.ReadableInstant) dateTime60, periodType74);
        org.joda.time.ReadableDuration readableDuration76 = null;
        boolean boolean77 = duration39.isEqual(readableDuration76);
        org.joda.time.Days days78 = duration39.toStandardDays();
        org.joda.time.Days days79 = days35.plus(days78);
        boolean boolean80 = periodType28.equals((java.lang.Object) days79);
        org.joda.time.Period period81 = interval17.toPeriod(periodType28);
        org.joda.time.Period period82 = new org.joda.time.Period(1644572389962L, periodType28);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(periodType19);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1644572715696L + "'", long21 == 1644572715696L);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(duration39);
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
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(days78);
        org.junit.Assert.assertNotNull(days79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(period81);
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
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
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        java.lang.Object obj25 = null;
        org.joda.time.Duration duration26 = new org.joda.time.Duration(obj25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, (org.joda.time.ReadableDuration) duration26);
        boolean boolean28 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Interval interval30 = duration26.toIntervalTo(readableInstant29);
        org.joda.time.Interval interval31 = interval30.toInterval();
        long long32 = interval30.toDurationMillis();
        long long33 = interval30.toDurationMillis();
        boolean boolean34 = interval8.overlaps((org.joda.time.ReadableInterval) interval30);
        org.joda.time.Period period35 = interval30.toPeriod();
        long long36 = interval30.getStartMillis();
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
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(period35);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1644572715741L + "'", long36 == 1644572715741L);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        org.joda.time.Period period8 = period6.withYears((int) (byte) 10);
        int int9 = period8.getYears();
        int int10 = period8.getWeeks();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 100, 1644572122285L);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.years();
        org.joda.time.Period period16 = period13.withField(durationFieldType14, (int) (byte) 1);
        org.joda.time.Period period17 = period8.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period19 = period8.withHours(4);
        org.joda.time.DurationFieldType[] durationFieldTypeArray20 = period8.getFieldTypes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldTypeArray20);
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType1 = seconds0.getFieldType();
        org.joda.time.Seconds seconds3 = seconds0.plus((-1));
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        java.lang.String str5 = seconds4.toString();
        org.joda.time.Seconds seconds6 = seconds3.plus(seconds4);
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType9 = seconds8.getFieldType();
        org.joda.time.Seconds seconds11 = seconds8.plus((-1));
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.TWO;
        java.lang.String str13 = seconds12.toString();
        org.joda.time.Seconds seconds14 = seconds11.plus(seconds12);
        org.joda.time.Seconds seconds15 = seconds7.minus(seconds12);
        org.joda.time.Seconds seconds17 = seconds15.multipliedBy((int) (byte) -1);
        org.joda.time.Seconds seconds19 = seconds17.minus(3);
        org.joda.time.Seconds seconds20 = seconds3.plus(seconds19);
        org.joda.time.MutablePeriod mutablePeriod21 = seconds20.toMutablePeriod();
        mutablePeriod21.addYears(2719200);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT2S" + "'", str5, "PT2S");
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT2S" + "'", str13, "PT2S");
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(mutablePeriod21);
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks5 = weeks4.negated();
        org.joda.time.Weeks weeks6 = weeks2.minus(weeks5);
        org.joda.time.Weeks weeks8 = weeks2.plus((int) ' ');
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
        org.joda.time.Weeks weeks32 = period31.toStandardWeeks();
        org.joda.time.Weeks weeks33 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period31);
        int int34 = weeks33.size();
        int int35 = weeks33.getWeeks();
        org.joda.time.Weeks weeks37 = weeks33.dividedBy(30);
        org.joda.time.Weeks weeks38 = weeks37.negated();
        java.lang.String str39 = weeks38.toString();
        org.joda.time.Weeks weeks40 = weeks8.minus(weeks38);
        org.joda.time.Period period42 = new org.joda.time.Period(1L);
        org.joda.time.Weeks weeks44 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Period period45 = period42.plus((org.joda.time.ReadablePeriod) weeks44);
        org.joda.time.Weeks weeks46 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks48 = weeks46.plus((int) '4');
        org.joda.time.Weeks weeks49 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks51 = org.joda.time.Weeks.weeks((int) (byte) -1);
        boolean boolean52 = weeks49.isGreaterThan(weeks51);
        org.joda.time.DurationFieldType durationFieldType53 = weeks51.getFieldType();
        boolean boolean54 = weeks46.isGreaterThan(weeks51);
        org.joda.time.Period period55 = weeks51.toPeriod();
        org.joda.time.Weeks weeks57 = weeks51.plus(30);
        org.joda.time.Weeks weeks58 = weeks44.plus(weeks57);
        org.joda.time.Weeks weeks59 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType60 = weeks59.getFieldType();
        org.joda.time.Weeks weeks62 = weeks59.plus((int) '#');
        org.joda.time.Weeks weeks63 = weeks44.plus(weeks62);
        org.joda.time.Weeks weeks64 = weeks63.negated();
        org.joda.time.Period period66 = org.joda.time.Period.minutes((-10));
        org.joda.time.Weeks weeks67 = period66.toStandardWeeks();
        org.joda.time.Weeks weeks69 = weeks67.dividedBy(23);
        boolean boolean70 = weeks64.isLessThan(weeks69);
        org.joda.time.Weeks weeks71 = weeks40.minus(weeks69);
        org.joda.time.MutablePeriod mutablePeriod72 = weeks71.toMutablePeriod();
        org.joda.time.PeriodType periodType73 = weeks71.getPeriodType();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
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
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "P0W" + "'", str39, "P0W");
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(weeks46);
        org.junit.Assert.assertNotNull(weeks48);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(weeks57);
        org.junit.Assert.assertNotNull(weeks58);
        org.junit.Assert.assertNotNull(weeks59);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertNotNull(weeks62);
        org.junit.Assert.assertNotNull(weeks63);
        org.junit.Assert.assertNotNull(weeks64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(weeks67);
        org.junit.Assert.assertNotNull(weeks69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(weeks71);
        org.junit.Assert.assertNotNull(mutablePeriod72);
        org.junit.Assert.assertNotNull(periodType73);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.minutesIn(readableInterval8);
        java.lang.String str10 = minutes9.toString();
        org.joda.time.PeriodType periodType11 = minutes9.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant7, periodType11);
        org.joda.time.Duration duration14 = duration4.withMillis((long) 'a');
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        java.lang.Object obj18 = null;
        org.joda.time.Duration duration19 = new org.joda.time.Duration(obj18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration19);
        boolean boolean21 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration19);
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
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant47 = null;
        java.lang.Object obj48 = null;
        org.joda.time.Duration duration49 = new org.joda.time.Duration(obj48);
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, (org.joda.time.ReadableDuration) duration49);
        boolean boolean51 = duration46.isShorterThan((org.joda.time.ReadableDuration) duration49);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInterval readableInterval53 = null;
        org.joda.time.Minutes minutes54 = org.joda.time.Minutes.minutesIn(readableInterval53);
        java.lang.String str55 = minutes54.toString();
        org.joda.time.PeriodType periodType56 = minutes54.getPeriodType();
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration49, readableInstant52, periodType56);
        org.joda.time.PeriodType periodType58 = periodType56.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, (org.joda.time.ReadableInstant) dateTime43, periodType58);
        org.joda.time.Duration duration61 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant62 = null;
        java.lang.Object obj63 = null;
        org.joda.time.Duration duration64 = new org.joda.time.Duration(obj63);
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant62, (org.joda.time.ReadableDuration) duration64);
        boolean boolean66 = duration61.isShorterThan((org.joda.time.ReadableDuration) duration64);
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((java.lang.Object) duration61, periodType67, chronology68);
        org.joda.time.Duration duration71 = org.joda.time.Duration.millis((long) '4');
        long long72 = duration71.getStandardDays();
        boolean boolean73 = duration61.isLongerThan((org.joda.time.ReadableDuration) duration71);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableDuration) duration71);
        org.joda.time.Interval interval75 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.PeriodType periodType76 = org.joda.time.PeriodType.seconds();
        boolean boolean77 = dateTime43.equals((java.lang.Object) periodType76);
        org.joda.time.PeriodType periodType78 = periodType76.withMinutesRemoved();
        org.joda.time.PeriodType periodType79 = periodType78.withSecondsRemoved();
        org.joda.time.PeriodType periodType80 = periodType79.withHoursRemoved();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0M" + "'", str10, "PT0M");
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
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
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PT0M" + "'", str55, "PT0M");
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertNotNull(periodType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(periodType78);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertNotNull(periodType80);
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((-2147483648), (-3), 6, 36000032);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = mutablePeriod4.getValue(31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks2 = weeks0.minus(weeks1);
        java.lang.String str3 = weeks1.toString();
        org.joda.time.Weeks weeks5 = weeks1.plus((-101));
        org.joda.time.Weeks weeks7 = weeks1.dividedBy(49);
        org.joda.time.Weeks weeks9 = weeks1.minus(1);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P3W" + "'", str3, "P3W");
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Period period4 = period2.plusMillis((int) (byte) 0);
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType6 = seconds5.getFieldType();
        org.joda.time.Chronology chronology7 = null;
        boolean boolean8 = durationFieldType6.isSupported(chronology7);
        org.joda.time.Period period10 = period4.withField(durationFieldType6, 100);
        int int11 = period10.getSeconds();
        org.joda.time.Period period13 = period10.minusHours(19034399);
        org.joda.time.Period period15 = period13.plusMillis(19034399);
        org.joda.time.Period period17 = period15.plusWeeks((-456825));
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        org.joda.time.Period period2 = new org.joda.time.Period(32L, 360000L);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period2);
        org.joda.time.Period period5 = period2.minusSeconds((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period8 = period5.withFieldAdded(durationFieldType6, (-2147483648));
        org.joda.time.DurationFieldType durationFieldType10 = period8.getFieldType(2);
        org.joda.time.MutablePeriod mutablePeriod11 = period8.toMutablePeriod();
        mutablePeriod11.add(11, (-2147483648), (-44), (-3), 41, 30, (-830), (-40));
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MAX_VALUE;
        int int1 = minutes0.getMinutes();
        org.joda.time.Minutes minutes3 = minutes0.minus(802);
        org.joda.time.ReadableInstant readableInstant4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(obj5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6);
        org.joda.time.Period period9 = period7.minusMinutes((int) (short) 1);
        org.joda.time.Period period11 = period7.minusHours((int) '#');
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period14 = period7.withFieldAdded(durationFieldType12, 32);
        org.joda.time.Minutes minutes15 = period7.toStandardMinutes();
        org.joda.time.Duration duration18 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = duration18.toPeriodFrom(readableInstant19);
        org.joda.time.Period period22 = period20.minusSeconds((int) '4');
        org.joda.time.Minutes minutes23 = period20.toStandardMinutes();
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Minutes minutes25 = org.joda.time.Minutes.minutesIn(readableInterval24);
        java.lang.String str26 = minutes25.toString();
        org.joda.time.Minutes minutes27 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes29 = minutes27.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType30 = minutes29.getPeriodType();
        org.joda.time.PeriodType periodType31 = periodType30.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.eras();
        boolean boolean33 = periodType30.isSupported(durationFieldType32);
        int int34 = minutes25.get(durationFieldType32);
        org.joda.time.Minutes minutes35 = null;
        boolean boolean36 = minutes25.isLessThan(minutes35);
        org.joda.time.Minutes minutes38 = minutes25.multipliedBy((int) (byte) 10);
        boolean boolean39 = minutes23.isLessThan(minutes38);
        org.joda.time.Minutes minutes40 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes42 = minutes40.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType43 = minutes42.getPeriodType();
        boolean boolean44 = minutes23.isLessThan(minutes42);
        org.joda.time.Minutes minutes46 = minutes42.minus(10);
        org.joda.time.PeriodType periodType47 = minutes46.getPeriodType();
        boolean boolean48 = minutes15.isLessThan(minutes46);
        boolean boolean49 = minutes3.isLessThan(minutes15);
        org.joda.time.PeriodType periodType50 = minutes15.getPeriodType();
        org.joda.time.Minutes minutes52 = minutes15.minus((-2147482680));
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT0M" + "'", str26, "PT0M");
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(minutes52);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(1644572123232L, chronology1);
        mutablePeriod2.addMonths(2719);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearDay();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(1644572188570L, (long) 3, periodType9);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (short) 10);
        mutablePeriod16.setMinutes(306);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardMinutes(1644572192768L);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (byte) 0, chronology25);
        java.lang.String str27 = mutablePeriod26.toString();
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
        org.joda.time.Duration duration73 = mutablePeriod26.toDurationFrom((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Chronology chronology74 = dateTime58.getChronology();
        org.joda.time.Period period75 = new org.joda.time.Period(1644572143942L, (-106L), chronology74);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(1644572163088L, chronology74);
        mutablePeriod16.setPeriod((org.joda.time.ReadableDuration) duration20, chronology74);
        mutablePeriod10.add(1644572332362L, chronology74);
        mutablePeriod2.setPeriod(0L, 1644572314318L, chronology74);
        int int80 = mutablePeriod2.getYears();
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PT0S" + "'", str27, "PT0S");
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(interval36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1644572715927L + "'", long37 == 1644572715927L);
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
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 52 + "'", int80 == 52);
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        java.lang.String str1 = seconds0.toString();
        org.joda.time.Seconds seconds3 = seconds0.multipliedBy(8);
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.parseMinutes("PT0M");
        org.joda.time.Duration duration7 = org.joda.time.Duration.millis((long) '4');
        long long8 = duration7.getMillis();
        org.joda.time.Minutes minutes9 = duration7.toStandardMinutes();
        org.joda.time.Minutes minutes10 = minutes9.negated();
        org.joda.time.Minutes minutes11 = minutes10.negated();
        org.joda.time.Duration duration13 = org.joda.time.Duration.millis((long) '4');
        long long14 = duration13.getMillis();
        org.joda.time.Minutes minutes15 = duration13.toStandardMinutes();
        org.joda.time.Minutes minutes16 = minutes15.negated();
        org.joda.time.Minutes minutes17 = minutes16.negated();
        boolean boolean18 = minutes10.isGreaterThan(minutes17);
        org.joda.time.Minutes minutes20 = minutes17.multipliedBy(3);
        boolean boolean21 = minutes5.isLessThan(minutes20);
        org.joda.time.Minutes minutes22 = minutes20.negated();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = seconds3.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Seconds cannot be compared to class org.joda.time.Minutes");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PT2S" + "'", str1, "PT2S");
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(minutes22);
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType6 = seconds5.getFieldType();
        org.joda.time.Seconds seconds8 = seconds5.plus((-1));
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        java.lang.String str10 = seconds9.toString();
        org.joda.time.Seconds seconds11 = seconds8.plus(seconds9);
        org.joda.time.Seconds seconds12 = seconds4.minus(seconds9);
        org.joda.time.PeriodType periodType13 = seconds4.getPeriodType();
        org.joda.time.PeriodType periodType14 = periodType13.withDaysRemoved();
        org.joda.time.PeriodType periodType15 = periodType14.withWeeksRemoved();
        org.joda.time.Period period16 = new org.joda.time.Period(1644572150793L, 1644572455071L, periodType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(1644572578760L, 98674327443900L, periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 97029754865");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT2S" + "'", str10, "PT2S");
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = weeks1.negated();
        org.joda.time.DurationFieldType durationFieldType4 = weeks3.getFieldType();
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.ZERO;
        org.joda.time.Weeks weeks6 = weeks3.minus(weeks5);
        org.joda.time.PeriodType periodType7 = weeks6.getPeriodType();
        int int8 = weeks6.size();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.minutesIn(readableInterval2);
        java.lang.String str4 = minutes3.toString();
        org.joda.time.PeriodType periodType5 = minutes3.getPeriodType();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (short) 10, (long) (byte) -1, periodType5, chronology6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.eras();
        int int9 = period7.indexOf(durationFieldType8);
        int[] intArray10 = period7.getValues();
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0M" + "'", str4, "PT0M");
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Hours hours3 = org.joda.time.Hours.hoursIn(readableInterval2);
        org.joda.time.Hours hours4 = hours3.negated();
        org.joda.time.PeriodType periodType5 = hours3.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withYearsRemoved();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(periodType9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.eras();
        int int12 = periodType9.indexOf(durationFieldType11);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        java.lang.Object obj16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(obj16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration17);
        boolean boolean19 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Interval interval21 = duration17.toIntervalTo(readableInstant20);
        org.joda.time.Interval interval22 = interval21.toInterval();
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.Period period24 = new org.joda.time.Period((long) 1, periodType9, chronology23);
        org.joda.time.Period period25 = new org.joda.time.Period(1644572178980L, 1644572174305L, periodType6, chronology23);
        org.joda.time.PeriodType periodType26 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType27 = periodType26.withMonthsRemoved();
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 10);
        org.joda.time.Period period3 = period1.plusMonths((int) (short) 0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = period3.getFieldTypes();
        org.joda.time.Period period6 = period3.withMillis((-101));
        org.joda.time.Period period8 = period6.minusMillis(300);
        org.joda.time.Duration duration11 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = duration11.toPeriodFrom(readableInstant12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = duration11.toPeriod(chronology14);
        java.lang.String str16 = period15.toString();
        org.joda.time.MutablePeriod mutablePeriod17 = period15.toMutablePeriod();
        org.joda.time.Seconds seconds18 = period15.toStandardSeconds();
        org.joda.time.Period period20 = period15.plusMonths((int) (byte) 0);
        org.joda.time.Period period22 = period20.minusMinutes(52);
        org.joda.time.Duration duration23 = period20.toStandardDuration();
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = duration26.toPeriodFrom(readableInstant27);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.years();
        org.joda.time.Period period31 = period28.withField(durationFieldType29, (int) (byte) 100);
        org.joda.time.Period period33 = period20.withFieldAdded(durationFieldType29, (-2));
        org.joda.time.Period period35 = period8.withFieldAdded(durationFieldType29, 87);
        java.lang.String str36 = durationFieldType29.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT0.097S" + "'", str16, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "years" + "'", str36, "years");
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT-456825H");
        mutablePeriod1.addWeeks((-5));
        mutablePeriod1.addYears((-3628800));
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType16);
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes20 = minutes18.multipliedBy((int) (short) 1);
        mutablePeriod17.setPeriod((org.joda.time.ReadablePeriod) minutes20);
        mutablePeriod17.addDays(0);
        mutablePeriod17.setMonths((int) (byte) 1);
        int int26 = mutablePeriod17.getMonths();
        mutablePeriod17.setDays((-9700));
        mutablePeriod17.setPeriod(2147483647, 222, 0, (int) (short) 1, 100, (int) (byte) 1, 229, (int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod38 = mutablePeriod17.copy();
        org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) mutablePeriod17);
        org.joda.time.PeriodType periodType40 = mutablePeriod17.getPeriodType();
        org.joda.time.PeriodType periodType41 = periodType40.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period42 = new org.joda.time.Period((int) '#', 22, 2719199, (-44), (-59), (-2147483648), 22, 245, periodType41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(mutablePeriod38);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays(0L);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(obj5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6);
        boolean boolean8 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Interval interval10 = duration6.toIntervalTo(readableInstant9);
        org.joda.time.Interval interval11 = interval10.toInterval();
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        java.lang.Object obj15 = null;
        org.joda.time.Duration duration16 = new org.joda.time.Duration(obj15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration16);
        boolean boolean18 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Interval interval20 = duration16.toIntervalTo(readableInstant19);
        boolean boolean21 = interval11.isAfter((org.joda.time.ReadableInterval) interval20);
        org.joda.time.Period period22 = interval20.toPeriod();
        org.joda.time.DateTime dateTime23 = interval20.getStart();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime23.getZone();
        org.joda.time.Period period25 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Period period27 = period25.minusMonths((int) (short) 100);
        java.lang.String str28 = period25.toString();
        int int29 = period25.getHours();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PT0S" + "'", str28, "PT0S");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(obj1);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType8);
        mutablePeriod9.addMillis((-1));
        mutablePeriod5.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod9);
        int int13 = mutablePeriod5.getYears();
        mutablePeriod5.setWeeks((-97));
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(1644572126273L, periodType17);
        mutablePeriod18.setPeriod((long) (short) 1, (long) (byte) 0);
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
        org.joda.time.Interval interval54 = interval31.toInterval();
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant57 = null;
        java.lang.Object obj58 = null;
        org.joda.time.Duration duration59 = new org.joda.time.Duration(obj58);
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant57, (org.joda.time.ReadableDuration) duration59);
        boolean boolean61 = duration56.isShorterThan((org.joda.time.ReadableDuration) duration59);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Interval interval63 = duration59.toIntervalTo(readableInstant62);
        org.joda.time.Interval interval64 = interval63.toInterval();
        org.joda.time.Duration duration66 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant67 = null;
        java.lang.Object obj68 = null;
        org.joda.time.Duration duration69 = new org.joda.time.Duration(obj68);
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant67, (org.joda.time.ReadableDuration) duration69);
        boolean boolean71 = duration66.isShorterThan((org.joda.time.ReadableDuration) duration69);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Interval interval73 = duration69.toIntervalTo(readableInstant72);
        boolean boolean74 = interval64.isAfter((org.joda.time.ReadableInterval) interval73);
        boolean boolean75 = interval54.isBefore((org.joda.time.ReadableInterval) interval73);
        mutablePeriod18.setPeriod((org.joda.time.ReadableInterval) interval54);
        org.joda.time.Interval interval77 = interval54.toInterval();
        mutablePeriod5.setPeriod((org.joda.time.ReadableInterval) interval54);
        org.joda.time.MutableInterval mutableInterval79 = interval54.toMutableInterval();
        org.joda.time.Weeks weeks80 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval54);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
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
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertNotNull(mutableInterval79);
        org.junit.Assert.assertNotNull(weeks80);
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P-1MT0.097S");
        mutablePeriod1.setYears((-100));
        mutablePeriod1.setMinutes((int) (short) 0);
        mutablePeriod1.addDays(0);
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.secondsIn(readableInterval0);
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType4 = seconds3.getFieldType();
        org.joda.time.Seconds seconds6 = seconds3.plus((-1));
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        java.lang.String str8 = seconds7.toString();
        org.joda.time.Seconds seconds9 = seconds6.plus(seconds7);
        org.joda.time.Seconds seconds10 = seconds2.minus(seconds7);
        org.joda.time.Seconds seconds11 = seconds1.minus(seconds7);
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds14 = seconds12.multipliedBy((int) (byte) 1);
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds17 = seconds15.multipliedBy((int) (byte) 1);
        int int18 = seconds17.size();
        org.joda.time.Period period20 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period22 = period20.minusMillis((-1));
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period22);
        boolean boolean24 = seconds17.isGreaterThan(seconds23);
        org.joda.time.PeriodType periodType25 = seconds17.getPeriodType();
        org.joda.time.Seconds seconds26 = seconds14.plus(seconds17);
        org.joda.time.Seconds seconds28 = seconds14.plus(52);
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds31 = seconds29.multipliedBy((int) (byte) 1);
        org.joda.time.Seconds seconds32 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds34 = seconds32.multipliedBy((int) (byte) 1);
        int int35 = seconds34.size();
        org.joda.time.Period period37 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period39 = period37.minusMillis((-1));
        org.joda.time.Seconds seconds40 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period39);
        boolean boolean41 = seconds34.isGreaterThan(seconds40);
        org.joda.time.PeriodType periodType42 = seconds34.getPeriodType();
        org.joda.time.Seconds seconds43 = seconds31.plus(seconds34);
        org.joda.time.Seconds seconds44 = seconds14.minus(seconds31);
        boolean boolean45 = seconds1.isGreaterThan(seconds31);
        java.lang.String str46 = seconds1.toString();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType49);
        mutablePeriod50.setYears(0);
        org.joda.time.Duration duration54 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology55 = null;
        mutablePeriod50.setPeriod((org.joda.time.ReadableDuration) duration54, chronology55);
        org.joda.time.ReadableInstant readableInstant57 = null;
        java.lang.Object obj58 = null;
        org.joda.time.Duration duration59 = new org.joda.time.Duration(obj58);
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant57, (org.joda.time.ReadableDuration) duration59);
        org.joda.time.Duration duration62 = duration59.minus((long) '4');
        mutablePeriod50.add((org.joda.time.ReadableDuration) duration62);
        org.joda.time.DurationFieldType durationFieldType64 = org.joda.time.DurationFieldType.halfdays();
        int int65 = mutablePeriod50.get(durationFieldType64);
        int int66 = seconds1.get(durationFieldType64);
        org.joda.time.Seconds seconds68 = seconds1.plus(104);
        org.joda.time.DurationFieldType durationFieldType69 = seconds68.getFieldType();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT2S" + "'", str8, "PT2S");
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PT0S" + "'", str46, "PT0S");
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(seconds68);
        org.junit.Assert.assertNotNull(durationFieldType69);
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1, (int) (byte) 10, 10, 10);
        org.joda.time.Days days5 = org.joda.time.Days.SEVEN;
        org.joda.time.Duration duration6 = days5.toStandardDuration();
        org.joda.time.Duration duration8 = duration6.withMillis(1644572164015L);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration13.toIntervalTo(readableInstant16);
        org.joda.time.Interval interval18 = interval17.toInterval();
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        java.lang.Object obj22 = null;
        org.joda.time.Duration duration23 = new org.joda.time.Duration(obj22);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, (org.joda.time.ReadableDuration) duration23);
        boolean boolean25 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Interval interval27 = duration23.toIntervalTo(readableInstant26);
        boolean boolean28 = interval18.isAfter((org.joda.time.ReadableInterval) interval27);
        org.joda.time.Period period29 = interval27.toPeriod();
        org.joda.time.Duration duration30 = interval27.toDuration();
        org.joda.time.Duration duration33 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = duration33.toPeriodFrom(readableInstant34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = duration33.toPeriod(chronology36);
        java.lang.String str38 = period37.toString();
        org.joda.time.MutablePeriod mutablePeriod39 = period37.toMutablePeriod();
        org.joda.time.Duration duration41 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant42 = null;
        java.lang.Object obj43 = null;
        org.joda.time.Duration duration44 = new org.joda.time.Duration(obj43);
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant42, (org.joda.time.ReadableDuration) duration44);
        boolean boolean46 = duration41.isShorterThan((org.joda.time.ReadableDuration) duration44);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Interval interval48 = duration44.toIntervalTo(readableInstant47);
        long long49 = interval48.getStartMillis();
        mutablePeriod39.setPeriod((org.joda.time.ReadableInterval) interval48);
        org.joda.time.Duration duration51 = interval48.toDuration();
        org.joda.time.DateTime dateTime52 = interval48.getStart();
        org.joda.time.Period period53 = duration30.toPeriodFrom((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Interval interval54 = duration8.toIntervalTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant57 = null;
        java.lang.Object obj58 = null;
        org.joda.time.Duration duration59 = new org.joda.time.Duration(obj58);
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant57, (org.joda.time.ReadableDuration) duration59);
        boolean boolean61 = duration56.isShorterThan((org.joda.time.ReadableDuration) duration59);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Interval interval63 = duration59.toIntervalTo(readableInstant62);
        org.joda.time.Interval interval64 = interval63.toInterval();
        org.joda.time.Chronology chronology65 = interval64.getChronology();
        org.joda.time.Interval interval66 = interval64.toInterval();
        boolean boolean67 = interval54.isAfter((org.joda.time.ReadableInterval) interval64);
        org.joda.time.Chronology chronology68 = interval54.getChronology();
        org.joda.time.Days days69 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval54);
        mutablePeriod4.setPeriod((org.joda.time.ReadableInterval) interval54);
        org.joda.time.Chronology chronology71 = interval54.getChronology();
        org.joda.time.Duration duration73 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant74 = null;
        java.lang.Object obj75 = null;
        org.joda.time.Duration duration76 = new org.joda.time.Duration(obj75);
        org.joda.time.Period period77 = new org.joda.time.Period(readableInstant74, (org.joda.time.ReadableDuration) duration76);
        boolean boolean78 = duration73.isShorterThan((org.joda.time.ReadableDuration) duration76);
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.Interval interval80 = duration76.toIntervalTo(readableInstant79);
        org.joda.time.Interval interval81 = interval80.toInterval();
        long long82 = interval80.toDurationMillis();
        long long83 = interval80.toDurationMillis();
        org.joda.time.MutableInterval mutableInterval84 = interval80.toMutableInterval();
        boolean boolean85 = interval54.isAfter((org.joda.time.ReadableInterval) mutableInterval84);
        org.joda.time.Period period86 = new org.joda.time.Period((java.lang.Object) interval54);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PT0.097S" + "'", str38, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(interval48);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1644572716117L + "'", long49 == 1644572716117L);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(days69);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(mutableInterval84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
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
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType47 = periodType46.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(periodType47);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(10L, periodType47);
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime44, periodType47);
        int int51 = periodType47.size();
        org.joda.time.PeriodType periodType52 = periodType47.withDaysRemoved();
        org.joda.time.PeriodType periodType53 = periodType52.withMonthsRemoved();
        org.joda.time.PeriodType periodType54 = periodType53.withDaysRemoved();
        org.joda.time.PeriodType periodType55 = periodType53.withDaysRemoved();
        int int56 = periodType55.size();
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
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
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
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration15 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration18 = duration15.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration20 = duration12.withDurationAdded((org.joda.time.ReadableDuration) duration15, (int) (short) 1);
        org.joda.time.Duration duration23 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration26 = duration23.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration28 = duration12.withDurationAdded((org.joda.time.ReadableDuration) duration26, (int) (short) 100);
        org.joda.time.Duration duration30 = org.joda.time.Duration.millis((long) '4');
        long long31 = duration30.getMillis();
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType34);
        mutablePeriod35.setYears(0);
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology40 = null;
        mutablePeriod35.setPeriod((org.joda.time.ReadableDuration) duration39, chronology40);
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant44 = null;
        java.lang.Object obj45 = null;
        org.joda.time.Duration duration46 = new org.joda.time.Duration(obj45);
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, (org.joda.time.ReadableDuration) duration46);
        boolean boolean48 = duration43.isShorterThan((org.joda.time.ReadableDuration) duration46);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Interval interval50 = duration46.toIntervalTo(readableInstant49);
        org.joda.time.Interval interval51 = interval50.toInterval();
        org.joda.time.DateTime dateTime52 = interval51.getEnd();
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
        org.joda.time.Period period64 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration39, (org.joda.time.ReadableInstant) dateTime52);
        java.lang.String str66 = dateTime52.toString();
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration30, (org.joda.time.ReadableInstant) dateTime52);
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
        org.joda.time.Duration duration80 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant81 = null;
        java.lang.Object obj82 = null;
        org.joda.time.Duration duration83 = new org.joda.time.Duration(obj82);
        org.joda.time.Period period84 = new org.joda.time.Period(readableInstant81, (org.joda.time.ReadableDuration) duration83);
        boolean boolean85 = duration80.isShorterThan((org.joda.time.ReadableDuration) duration83);
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.Interval interval87 = duration83.toIntervalTo(readableInstant86);
        org.joda.time.Interval interval88 = interval87.toInterval();
        org.joda.time.DateTime dateTime89 = interval88.getEnd();
        org.joda.time.Period period90 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime78, (org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.Days days91 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, (org.joda.time.ReadableInstant) dateTime89);
        boolean boolean93 = interval8.isAfter((org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.DateTimeFieldType dateTimeFieldType94 = null;
        boolean boolean95 = dateTime89.isSupported(dateTimeFieldType94);
        org.joda.time.Chronology chronology96 = dateTime89.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType97 = null;
        boolean boolean98 = dateTime89.isSupported(dateTimeFieldType97);
        org.joda.time.Chronology chronology99 = dateTime89.getChronology();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(dateTime63);
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "2022-02-11T09:45:16.171Z" + "'", str66, "2022-02-11T09:45:16.171Z");
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(interval87);
        org.junit.Assert.assertNotNull(interval88);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(days91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(chronology96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(chronology99);
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        org.joda.time.Period period1 = new org.joda.time.Period(1644572593514L);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
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
        org.joda.time.Hours hours15 = org.joda.time.Hours.hours((-1));
        boolean boolean16 = hours13.isLessThan(hours15);
        org.joda.time.Hours hours17 = hours13.negated();
        int int18 = hours17.getHours();
        org.joda.time.PeriodType periodType19 = hours17.getPeriodType();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration22);
        org.joda.time.Period period25 = org.joda.time.Period.years((int) (short) 10);
        org.joda.time.Period period27 = period25.plusMonths((int) (short) 0);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) 100, chronology29);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.eras();
        boolean boolean32 = period30.isSupported(durationFieldType31);
        boolean boolean33 = period27.isSupported(durationFieldType31);
        boolean boolean34 = period23.isSupported(durationFieldType31);
        org.joda.time.Period period36 = period23.withDays(5);
        boolean boolean37 = hours17.equals((java.lang.Object) period23);
        org.joda.time.Period period38 = hours17.toPeriod();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration3 = duration1.plus(1644572122285L);
        org.joda.time.Days days4 = duration1.toStandardDays();
        org.joda.time.Period period5 = days4.toPeriod();
        org.joda.time.Days days6 = period5.toStandardDays();
        org.joda.time.Period period8 = period5.withSeconds(3);
        org.joda.time.Period period10 = period5.minusYears((-6));
        org.joda.time.Period period12 = period10.withMinutes(2400);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
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
        org.joda.time.Duration duration61 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant62 = null;
        java.lang.Object obj63 = null;
        org.joda.time.Duration duration64 = new org.joda.time.Duration(obj63);
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant62, (org.joda.time.ReadableDuration) duration64);
        boolean boolean66 = duration61.isShorterThan((org.joda.time.ReadableDuration) duration64);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableInterval readableInterval68 = null;
        org.joda.time.Minutes minutes69 = org.joda.time.Minutes.minutesIn(readableInterval68);
        java.lang.String str70 = minutes69.toString();
        org.joda.time.PeriodType periodType71 = minutes69.getPeriodType();
        org.joda.time.Period period72 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration64, readableInstant67, periodType71);
        org.joda.time.Duration duration74 = duration64.withMillis((long) 'a');
        org.joda.time.Duration duration76 = duration74.withMillis(1644572126858L);
        org.joda.time.Period period77 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableDuration) duration74);
        org.joda.time.Period period79 = period77.minusMonths(36);
        org.joda.time.Period period81 = period79.minusHours((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int83 = period81.getValue((-710));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -710");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(minutes69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "PT0M" + "'", str70, "PT0M");
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
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
        org.joda.time.Seconds seconds20 = duration17.toStandardSeconds();
        org.joda.time.Seconds seconds22 = seconds20.multipliedBy((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType23 = seconds22.getFieldType();
        org.joda.time.Seconds seconds25 = seconds22.plus(1868);
        org.joda.time.Seconds seconds27 = org.joda.time.Seconds.seconds(36);
        boolean boolean28 = seconds22.isLessThan(seconds27);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.secondsIn(readableInterval0);
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType4 = seconds3.getFieldType();
        org.joda.time.Seconds seconds6 = seconds3.plus((-1));
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        java.lang.String str8 = seconds7.toString();
        org.joda.time.Seconds seconds9 = seconds6.plus(seconds7);
        org.joda.time.Seconds seconds10 = seconds2.minus(seconds7);
        org.joda.time.Seconds seconds11 = seconds1.minus(seconds7);
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds14 = seconds12.multipliedBy((int) (byte) 1);
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds17 = seconds15.multipliedBy((int) (byte) 1);
        int int18 = seconds17.size();
        org.joda.time.Period period20 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period22 = period20.minusMillis((-1));
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period22);
        boolean boolean24 = seconds17.isGreaterThan(seconds23);
        org.joda.time.PeriodType periodType25 = seconds17.getPeriodType();
        org.joda.time.Seconds seconds26 = seconds14.plus(seconds17);
        org.joda.time.Seconds seconds28 = seconds14.plus(52);
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds31 = seconds29.multipliedBy((int) (byte) 1);
        org.joda.time.Seconds seconds32 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds34 = seconds32.multipliedBy((int) (byte) 1);
        int int35 = seconds34.size();
        org.joda.time.Period period37 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period39 = period37.minusMillis((-1));
        org.joda.time.Seconds seconds40 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period39);
        boolean boolean41 = seconds34.isGreaterThan(seconds40);
        org.joda.time.PeriodType periodType42 = seconds34.getPeriodType();
        org.joda.time.Seconds seconds43 = seconds31.plus(seconds34);
        org.joda.time.Seconds seconds44 = seconds14.minus(seconds31);
        boolean boolean45 = seconds1.isGreaterThan(seconds31);
        org.joda.time.DurationFieldType durationFieldType46 = seconds31.getFieldType();
        org.joda.time.Seconds seconds48 = seconds31.minus((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType49 = seconds48.getFieldType();
        org.joda.time.PeriodType periodType50 = seconds48.getPeriodType();
        org.joda.time.PeriodType periodType51 = periodType50.withMinutesRemoved();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT2S" + "'", str8, "PT2S");
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(seconds48);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy((int) (byte) 1);
        int int3 = seconds2.size();
        org.joda.time.Period period5 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period7 = period5.minusMillis((-1));
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period7);
        boolean boolean9 = seconds2.isGreaterThan(seconds8);
        org.joda.time.Seconds seconds11 = seconds8.minus(6);
        org.joda.time.Seconds seconds13 = seconds8.dividedBy(8);
        org.joda.time.Period period15 = org.joda.time.Period.weeks(101);
        org.joda.time.Duration duration18 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = duration18.toPeriodFrom(readableInstant19);
        org.joda.time.Period period22 = period20.minusSeconds((int) '4');
        org.joda.time.Period period24 = period20.minusSeconds(10);
        org.joda.time.Period period25 = period20.normalizedStandard();
        int int26 = period20.size();
        org.joda.time.Period period28 = period20.withSeconds(22);
        org.joda.time.Period period29 = period15.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Seconds seconds30 = period29.toStandardSeconds();
        org.joda.time.Seconds seconds31 = seconds13.minus(seconds30);
        org.joda.time.Duration duration32 = seconds13.toStandardDuration();
        org.joda.time.Seconds seconds33 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds35 = seconds33.multipliedBy((int) (byte) 1);
        org.joda.time.Seconds seconds36 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds38 = seconds36.multipliedBy((int) (byte) 1);
        int int39 = seconds38.size();
        org.joda.time.Period period41 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period43 = period41.minusMillis((-1));
        org.joda.time.Seconds seconds44 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period43);
        boolean boolean45 = seconds38.isGreaterThan(seconds44);
        org.joda.time.PeriodType periodType46 = seconds38.getPeriodType();
        org.joda.time.Seconds seconds47 = seconds35.plus(seconds38);
        org.joda.time.Seconds seconds48 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType49 = seconds48.getFieldType();
        org.joda.time.Seconds seconds51 = seconds48.plus((-1));
        org.joda.time.Seconds seconds52 = org.joda.time.Seconds.TWO;
        java.lang.String str53 = seconds52.toString();
        org.joda.time.Seconds seconds54 = seconds51.plus(seconds52);
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant57 = null;
        java.lang.Object obj58 = null;
        org.joda.time.Duration duration59 = new org.joda.time.Duration(obj58);
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant57, (org.joda.time.ReadableDuration) duration59);
        boolean boolean61 = duration56.isShorterThan((org.joda.time.ReadableDuration) duration59);
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((java.lang.Object) duration56, periodType62, chronology63);
        org.joda.time.DurationFieldType[] durationFieldTypeArray65 = mutablePeriod64.getFieldTypes();
        org.joda.time.Duration duration68 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Period period70 = duration68.toPeriodFrom(readableInstant69);
        org.joda.time.Duration duration72 = duration68.plus((-1L));
        org.joda.time.Chronology chronology73 = null;
        mutablePeriod64.setPeriod((org.joda.time.ReadableDuration) duration72, chronology73);
        org.joda.time.Seconds seconds75 = duration72.toStandardSeconds();
        org.joda.time.Seconds seconds76 = seconds51.plus(seconds75);
        boolean boolean77 = seconds38.isGreaterThan(seconds75);
        org.joda.time.Seconds seconds79 = seconds38.multipliedBy((-35));
        org.joda.time.Seconds seconds81 = seconds38.multipliedBy(55);
        boolean boolean82 = seconds13.isGreaterThan(seconds81);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(seconds47);
        org.junit.Assert.assertNotNull(seconds48);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertNotNull(seconds51);
        org.junit.Assert.assertNotNull(seconds52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PT2S" + "'", str53, "PT2S");
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(durationFieldTypeArray65);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(seconds75);
        org.junit.Assert.assertNotNull(seconds76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(seconds79);
        org.junit.Assert.assertNotNull(seconds81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType8);
        int int10 = mutablePeriod9.getDays();
        mutablePeriod9.setPeriod((long) 1, 1644572133896L);
        mutablePeriod9.setPeriod((int) (short) -1, (-3), 6, (-49), 0, (-9700), 2, 29);
        int int23 = mutablePeriod9.getDays();
        mutablePeriod9.setMinutes(36);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType34);
        mutablePeriod35.clear();
        org.joda.time.Weeks weeks37 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) mutablePeriod35);
        mutablePeriod9.setPeriod((org.joda.time.ReadablePeriod) weeks37);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-49) + "'", int23 == (-49));
        org.junit.Assert.assertNotNull(weeks37);
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
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
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks23 = weeks21.minus(weeks22);
        org.joda.time.Weeks weeks24 = weeks20.plus(weeks21);
        org.joda.time.Weeks weeks25 = null;
        org.joda.time.Weeks weeks26 = weeks24.plus(weeks25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) weeks24, chronology27);
        org.joda.time.PeriodType periodType29 = weeks24.getPeriodType();
        org.joda.time.Weeks weeks31 = weeks24.dividedBy(871);
        org.joda.time.DurationFieldType durationFieldType32 = weeks31.getFieldType();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(durationFieldType32);
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(1644572126273L, periodType1);
        mutablePeriod2.setPeriod((long) (short) 1, (long) (byte) 0);
        mutablePeriod2.addDays(0);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1);
        org.joda.time.DurationFieldType durationFieldType13 = mutablePeriod11.getFieldType(1);
        org.joda.time.ReadableInstant readableInstant14 = null;
        java.lang.Object obj15 = null;
        org.joda.time.Duration duration16 = new org.joda.time.Duration(obj15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration16, readableInstant18);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType22);
        mutablePeriod23.addMillis((-1));
        mutablePeriod19.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.Duration duration29 = org.joda.time.Duration.millis((long) '4');
        long long30 = duration29.getMillis();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType33);
        mutablePeriod34.setYears(0);
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology39 = null;
        mutablePeriod34.setPeriod((org.joda.time.ReadableDuration) duration38, chronology39);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant43 = null;
        java.lang.Object obj44 = null;
        org.joda.time.Duration duration45 = new org.joda.time.Duration(obj44);
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant43, (org.joda.time.ReadableDuration) duration45);
        boolean boolean47 = duration42.isShorterThan((org.joda.time.ReadableDuration) duration45);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Interval interval49 = duration45.toIntervalTo(readableInstant48);
        org.joda.time.Interval interval50 = interval49.toInterval();
        org.joda.time.DateTime dateTime51 = interval50.getEnd();
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
        org.joda.time.Period period63 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Period period64 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateTime51);
        java.lang.String str65 = dateTime51.toString();
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration29, (org.joda.time.ReadableInstant) dateTime51);
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
        org.joda.time.Duration duration79 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant80 = null;
        java.lang.Object obj81 = null;
        org.joda.time.Duration duration82 = new org.joda.time.Duration(obj81);
        org.joda.time.Period period83 = new org.joda.time.Period(readableInstant80, (org.joda.time.ReadableDuration) duration82);
        boolean boolean84 = duration79.isShorterThan((org.joda.time.ReadableDuration) duration82);
        org.joda.time.ReadableInstant readableInstant85 = null;
        org.joda.time.Interval interval86 = duration82.toIntervalTo(readableInstant85);
        org.joda.time.Interval interval87 = interval86.toInterval();
        org.joda.time.DateTime dateTime88 = interval87.getEnd();
        org.joda.time.Period period89 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime77, (org.joda.time.ReadableInstant) dateTime88);
        org.joda.time.Seconds seconds90 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.Chronology chronology91 = dateTime51.getChronology();
        mutablePeriod23.setPeriod((long) 0, chronology91);
        boolean boolean93 = durationFieldType13.isSupported(chronology91);
        mutablePeriod2.setPeriod(1644572149256L, chronology91);
        int int95 = mutablePeriod2.getSeconds();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.setValue((-5211), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -5211");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(dateTime62);
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "2022-02-11T09:45:16.362Z" + "'", str65, "2022-02-11T09:45:16.362Z");
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(interval86);
        org.junit.Assert.assertNotNull(interval87);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertNotNull(seconds90);
        org.junit.Assert.assertNotNull(chronology91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 49 + "'", int95 == 49);
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        org.joda.time.PeriodType periodType3 = null;
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
        org.joda.time.Weeks weeks30 = period29.toStandardWeeks();
        org.joda.time.Weeks weeks31 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks33 = weeks31.plus((int) '4');
        org.joda.time.Weeks weeks34 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks36 = org.joda.time.Weeks.weeks((int) (byte) -1);
        boolean boolean37 = weeks34.isGreaterThan(weeks36);
        org.joda.time.DurationFieldType durationFieldType38 = weeks36.getFieldType();
        boolean boolean39 = weeks31.isGreaterThan(weeks36);
        boolean boolean40 = weeks30.isGreaterThan(weeks36);
        org.joda.time.Weeks weeks42 = weeks30.minus(8);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.years();
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
        boolean boolean55 = durationFieldType43.isSupported(chronology54);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((java.lang.Object) weeks30, chronology54);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(360000000L, (-98L), chronology54);
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(1644572203745L, chronology54);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(1644572227845L, 1644572207950L, periodType3, chronology54);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(1644572303044L, chronology54);
        int int61 = mutablePeriod60.getWeeks();
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
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2719 + "'", int61 == 2719);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.Duration duration3 = duration1.withMillis(0L);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType8);
        mutablePeriod9.setYears(0);
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod9.setPeriod((org.joda.time.ReadableDuration) duration13, chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        java.lang.Object obj17 = null;
        org.joda.time.Duration duration18 = new org.joda.time.Duration(obj17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration18);
        org.joda.time.Duration duration21 = duration18.minus((long) '4');
        mutablePeriod9.add((org.joda.time.ReadableDuration) duration21);
        boolean boolean23 = duration5.isEqual((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration29 = duration26.withDurationAdded((long) (byte) 100, 10);
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
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant43 = null;
        java.lang.Object obj44 = null;
        org.joda.time.Duration duration45 = new org.joda.time.Duration(obj44);
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant43, (org.joda.time.ReadableDuration) duration45);
        boolean boolean47 = duration42.isShorterThan((org.joda.time.ReadableDuration) duration45);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Interval interval49 = duration45.toIntervalTo(readableInstant48);
        org.joda.time.Interval interval50 = interval49.toInterval();
        org.joda.time.DateTime dateTime51 = interval50.getEnd();
        org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime51);
        long long53 = dateTime51.getMillis();
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration29, (org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Period period55 = duration5.toPeriodFrom((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Interval interval56 = duration3.toIntervalTo((org.joda.time.ReadableInstant) dateTime51);
        java.lang.String str57 = interval56.toString();
        boolean boolean59 = interval56.equals((java.lang.Object) 1644572313981L);
        org.joda.time.DateTime dateTime60 = interval56.getEnd();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(dateTime51);
// flaky:         org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1644572716398L + "'", long53 == 1644572716398L);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(interval56);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "2022-02-11T09:45:16.398Z/2022-02-11T09:45:16.398Z" + "'", str57, "2022-02-11T09:45:16.398Z/2022-02-11T09:45:16.398Z");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(dateTime60);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays(0L);
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration7 = duration4.withDurationAdded((long) (byte) 100, 10);
        int int8 = duration1.compareTo((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Interval interval10 = duration1.toIntervalTo(readableInstant9);
        org.joda.time.Period period11 = duration1.toPeriod();
        org.joda.time.ReadableInstant readableInstant12 = null;
        java.lang.Object obj13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(obj13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration14);
        org.joda.time.Duration duration17 = duration14.minus((long) '4');
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration25 = duration22.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration27 = duration19.withDurationAdded((org.joda.time.ReadableDuration) duration22, (int) (short) 1);
        org.joda.time.Days days28 = duration27.toStandardDays();
        org.joda.time.Days days29 = duration27.toStandardDays();
        int int30 = duration14.compareTo((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration31 = duration1.minus((org.joda.time.ReadableDuration) duration14);
        long long32 = duration14.getStandardHours();
        org.joda.time.Duration duration33 = duration14.toDuration();
        long long34 = duration14.getStandardHours();
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours(1644572124065L);
        org.joda.time.Duration duration37 = duration14.minus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Period period38 = duration14.toPeriod();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        org.joda.time.Period period8 = new org.joda.time.Period(1868, 57, (-2147483648), (int) '4', 0, (-100), 903, 229);
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration2.toPeriod(chronology4);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.withPeriodType(periodType6);
        org.joda.time.Period period9 = period5.withMonths(8);
        org.joda.time.Period period11 = period9.minusMonths(46);
        org.joda.time.Period period13 = period9.plusMinutes((-7));
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        org.joda.time.Period period8 = period6.withYears((int) (byte) 10);
        org.joda.time.Period period10 = period6.withMillis(22);
        org.joda.time.Period period12 = period6.plusHours(48);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 1);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.DurationFieldType[] durationFieldTypeArray5 = mutablePeriod3.getFieldTypes();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.forFields(durationFieldTypeArray5);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.forFields(durationFieldTypeArray5);
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardDays(0L);
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration19 = duration16.withDurationAdded((long) (byte) 100, 10);
        int int20 = duration13.compareTo((org.joda.time.ReadableDuration) duration16);
        long long21 = duration16.getMillis();
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.Hours hours24 = org.joda.time.Hours.hoursIn(readableInterval23);
        org.joda.time.Hours hours25 = hours24.negated();
        org.joda.time.PeriodType periodType26 = hours24.getPeriodType();
        org.joda.time.PeriodType periodType27 = periodType26.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.years();
        org.joda.time.Duration duration30 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant31 = null;
        java.lang.Object obj32 = null;
        org.joda.time.Duration duration33 = new org.joda.time.Duration(obj32);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration33);
        boolean boolean35 = duration30.isShorterThan((org.joda.time.ReadableDuration) duration33);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Interval interval37 = duration33.toIntervalTo(readableInstant36);
        org.joda.time.Interval interval38 = interval37.toInterval();
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        boolean boolean40 = durationFieldType28.isSupported(chronology39);
        org.joda.time.Period period41 = new org.joda.time.Period(1644572162361L, periodType27, chronology39);
        org.joda.time.Period period42 = duration16.toPeriod(chronology39);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(1644572257362L, chronology39);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) '4', 1644572330049L, chronology39);
        org.joda.time.Period period45 = new org.joda.time.Period(1644572568774L, 1644572200017L, periodType7, chronology39);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-97L) + "'", long21 == (-97L));
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(period42);
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType2);
        org.joda.time.PeriodType periodType4 = mutablePeriod3.getPeriodType();
        mutablePeriod3.addHours((int) (short) 10);
        mutablePeriod3.addDays((-2147483647));
        org.joda.time.Duration duration11 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = duration11.toPeriodFrom(readableInstant12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = duration11.toPeriod(chronology14);
        java.lang.String str16 = period15.toString();
        org.joda.time.MutablePeriod mutablePeriod17 = period15.toMutablePeriod();
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        java.lang.Object obj21 = null;
        org.joda.time.Duration duration22 = new org.joda.time.Duration(obj21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration22);
        boolean boolean24 = duration19.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Interval interval26 = duration22.toIntervalTo(readableInstant25);
        long long27 = interval26.getStartMillis();
        mutablePeriod17.setPeriod((org.joda.time.ReadableInterval) interval26);
        org.joda.time.Interval interval29 = interval26.toInterval();
        org.joda.time.Interval interval30 = interval26.toInterval();
        org.joda.time.Chronology chronology31 = interval26.getChronology();
        org.joda.time.DateTime dateTime32 = interval26.getEnd();
        mutablePeriod3.setPeriod((org.joda.time.ReadableInterval) interval26);
        org.joda.time.DateTime dateTime34 = interval26.getStart();
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT0.097S" + "'", str16, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval26);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1644572716473L + "'", long27 == 1644572716473L);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        org.joda.time.Period period1 = new org.joda.time.Period(1644572507470L);
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period3 = period1.minusMillis((-1));
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        int int5 = mutablePeriod4.getMinutes();
        mutablePeriod4.addHours((-101));
        mutablePeriod4.setPeriod(600000L);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(1644572167154L);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType4 = periodType3.withMillisRemoved();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) (short) 1, periodType4, chronology5);
        int int7 = periodType4.size();
        org.joda.time.Period period9 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period11 = period9.withMillis((int) ' ');
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
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType59 = periodType58.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(periodType59);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(10L, periodType59);
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime56, periodType59);
        org.joda.time.Duration duration63 = period9.toDurationFrom((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Duration duration65 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant66 = null;
        java.lang.Object obj67 = null;
        org.joda.time.Duration duration68 = new org.joda.time.Duration(obj67);
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, (org.joda.time.ReadableDuration) duration68);
        boolean boolean70 = duration65.isShorterThan((org.joda.time.ReadableDuration) duration68);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType72 = periodType71.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(periodType72);
        org.joda.time.DurationFieldType durationFieldType74 = org.joda.time.DurationFieldType.eras();
        int int75 = periodType72.indexOf(durationFieldType74);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableDuration) duration68, periodType72);
        boolean boolean77 = periodType4.equals((java.lang.Object) dateTime56);
        org.joda.time.Period period78 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateTime56);
        long long79 = dateTime56.getMillis();
        org.joda.time.ReadableInstant readableInstant80 = null;
        java.lang.Object obj81 = null;
        org.joda.time.Duration duration82 = new org.joda.time.Duration(obj81);
        org.joda.time.Period period83 = new org.joda.time.Period(readableInstant80, (org.joda.time.ReadableDuration) duration82);
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration82, readableInstant84);
        org.joda.time.Duration duration87 = org.joda.time.Duration.millis((long) '4');
        long long88 = duration87.getStandardDays();
        boolean boolean89 = duration82.isLongerThan((org.joda.time.ReadableDuration) duration87);
        org.joda.time.PeriodType periodType90 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType91 = periodType90.withHoursRemoved();
        org.joda.time.Period period92 = duration87.toPeriod(periodType90);
        java.lang.String str93 = periodType90.toString();
        boolean boolean94 = dateTime56.equals((java.lang.Object) periodType90);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
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
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertNotNull(durationFieldType74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(period78);
// flaky:         org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1644572716499L + "'", long79 == 1644572716499L);
        org.junit.Assert.assertNotNull(duration87);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(periodType90);
        org.junit.Assert.assertNotNull(periodType91);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "PeriodType[Days]" + "'", str93, "PeriodType[Days]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis(1644572157310L);
        long long2 = duration1.getStandardSeconds();
        long long3 = duration1.getStandardHours();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1644572157L + "'", long2 == 1644572157L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 456825L + "'", long3 == 456825L);
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.ReadableInstant readableInstant10 = null;
        java.lang.Object obj11 = null;
        org.joda.time.Duration duration12 = new org.joda.time.Duration(obj11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant14);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType18);
        mutablePeriod19.addMillis((-1));
        mutablePeriod15.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.Duration duration25 = org.joda.time.Duration.millis((long) '4');
        long long26 = duration25.getMillis();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType29);
        mutablePeriod30.setYears(0);
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod30.setPeriod((org.joda.time.ReadableDuration) duration34, chronology35);
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
        org.joda.time.Period period59 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration34, (org.joda.time.ReadableInstant) dateTime47);
        java.lang.String str61 = dateTime47.toString();
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration25, (org.joda.time.ReadableInstant) dateTime47);
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
        org.joda.time.Seconds seconds86 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Chronology chronology87 = dateTime47.getChronology();
        mutablePeriod19.setPeriod((long) 0, chronology87);
        org.joda.time.Period period89 = new org.joda.time.Period((java.lang.Object) interval8, chronology87);
        org.joda.time.Period period91 = period89.withWeeks(36000000);
        java.lang.String str92 = period89.toString();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(dateTime58);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "2022-02-11T09:45:16.552Z" + "'", str61, "2022-02-11T09:45:16.552Z");
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
        org.junit.Assert.assertNotNull(seconds86);
        org.junit.Assert.assertNotNull(chronology87);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "PT0S" + "'", str92, "PT0S");
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks2 = weeks0.minus(weeks1);
        org.joda.time.Weeks weeks4 = weeks2.multipliedBy(100);
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks7 = weeks5.plus((int) '4');
        org.joda.time.DurationFieldType durationFieldType8 = weeks7.getFieldType();
        boolean boolean9 = weeks2.isLessThan(weeks7);
        org.joda.time.DurationFieldType durationFieldType10 = weeks7.getFieldType();
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeks((int) (short) 100);
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks15 = weeks13.plus((int) '4');
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.weeks((int) (byte) -1);
        boolean boolean19 = weeks16.isGreaterThan(weeks18);
        org.joda.time.DurationFieldType durationFieldType20 = weeks18.getFieldType();
        boolean boolean21 = weeks13.isGreaterThan(weeks18);
        org.joda.time.Period period22 = weeks18.toPeriod();
        org.joda.time.Weeks weeks24 = weeks18.plus(30);
        org.joda.time.Weeks weeks25 = weeks12.minus(weeks18);
        org.joda.time.Weeks weeks26 = weeks7.minus(weeks18);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(164457249783893L, (long) (-52));
        mutablePeriod29.addSeconds(36000032);
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
        org.joda.time.Interval interval51 = interval50.toInterval();
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant54 = null;
        java.lang.Object obj55 = null;
        org.joda.time.Duration duration56 = new org.joda.time.Duration(obj55);
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, (org.joda.time.ReadableDuration) duration56);
        boolean boolean58 = duration53.isShorterThan((org.joda.time.ReadableDuration) duration56);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Interval interval60 = duration56.toIntervalTo(readableInstant59);
        boolean boolean61 = interval51.isAfter((org.joda.time.ReadableInterval) interval60);
        org.joda.time.Period period62 = interval60.toPeriod();
        boolean boolean63 = interval41.isBefore((org.joda.time.ReadableInterval) interval60);
        org.joda.time.Interval interval64 = interval41.toInterval();
        org.joda.time.Weeks weeks65 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval64);
        mutablePeriod29.setPeriod((org.joda.time.ReadablePeriod) weeks65);
        org.joda.time.Weeks weeks68 = org.joda.time.Weeks.weeks(100);
        int int69 = weeks68.getWeeks();
        org.joda.time.Weeks weeks71 = weeks68.plus(2);
        org.joda.time.Weeks weeks72 = weeks65.plus(weeks68);
        org.joda.time.Weeks weeks73 = weeks18.minus(weeks72);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(weeks65);
        org.junit.Assert.assertNotNull(weeks68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertNotNull(weeks71);
        org.junit.Assert.assertNotNull(weeks72);
        org.junit.Assert.assertNotNull(weeks73);
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days2 = days0.plus((int) ' ');
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days2);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(19034399);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes2 = weeks1.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 19034399 * 10080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(245);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        org.joda.time.Duration duration2 = new org.joda.time.Duration(1644572152112L, 1644572122326L);
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
        org.joda.time.ReadableInstant readableInstant37 = null;
        boolean boolean38 = dateTime23.isAfter(readableInstant37);
        org.joda.time.Duration duration41 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration44 = duration41.withDurationAdded((long) (byte) 100, 10);
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
        long long68 = dateTime66.getMillis();
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration44, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant37, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Period period71 = duration2.toPeriodTo(readableInstant37);
        java.lang.String str72 = period71.toString();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(duration44);
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
// flaky:         org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1644572716645L + "'", long68 == 1644572716645L);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "PT-29.786S" + "'", str72, "PT-29.786S");
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
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
        org.joda.time.Duration duration25 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = duration25.toPeriodFrom(readableInstant26);
        org.joda.time.Duration duration29 = duration25.plus((-1L));
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration25);
        org.joda.time.Period period31 = period30.negated();
        org.joda.time.Period period33 = period30.withMonths(0);
        org.joda.time.Period period35 = org.joda.time.Period.parse("PT0.097S");
        org.joda.time.Period period37 = period35.minusHours(10);
        org.joda.time.Days days38 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period35);
        org.joda.time.DurationFieldType durationFieldType39 = days38.getFieldType();
        boolean boolean40 = period30.isSupported(durationFieldType39);
        int int41 = period30.getMinutes();
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
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("2022-02-11T09:38:16.238Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:38:16.238Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(69, 22, (-99), 9, 0, (int) '#', (-1440), 108);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
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
        org.joda.time.PeriodType periodType15 = minutes14.getPeriodType();
        org.joda.time.Minutes minutes17 = minutes14.multipliedBy((-99));
        org.joda.time.Duration duration18 = minutes17.toStandardDuration();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(duration18);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration5 = duration2.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Minutes minutes6 = duration5.toStandardMinutes();
        org.joda.time.Duration duration8 = org.joda.time.Duration.millis((long) '4');
        long long9 = duration8.getMillis();
        org.joda.time.Minutes minutes10 = duration8.toStandardMinutes();
        org.joda.time.Minutes minutes11 = minutes10.negated();
        boolean boolean12 = minutes6.isGreaterThan(minutes11);
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes14 = minutes13.negated();
        org.joda.time.Minutes minutes15 = minutes11.minus(minutes14);
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.Duration duration19 = org.joda.time.Duration.millis((long) '4');
        long long20 = duration19.getMillis();
        org.joda.time.Minutes minutes21 = duration19.toStandardMinutes();
        org.joda.time.Minutes minutes22 = minutes21.negated();
        org.joda.time.Minutes minutes23 = minutes17.plus(minutes21);
        org.joda.time.Minutes minutes24 = minutes23.negated();
        int int26 = minutes24.getValue((int) (short) 0);
        org.joda.time.PeriodType periodType27 = minutes24.getPeriodType();
        org.joda.time.Minutes minutes28 = minutes24.negated();
        org.joda.time.Duration duration29 = minutes24.toStandardDuration();
        org.joda.time.Duration duration31 = org.joda.time.Duration.millis((long) '4');
        long long32 = duration31.getMillis();
        org.joda.time.Minutes minutes33 = duration31.toStandardMinutes();
        org.joda.time.Minutes minutes34 = minutes33.negated();
        org.joda.time.Minutes minutes35 = minutes34.negated();
        org.joda.time.Duration duration37 = org.joda.time.Duration.millis((long) '4');
        long long38 = duration37.getMillis();
        org.joda.time.Minutes minutes39 = duration37.toStandardMinutes();
        org.joda.time.Minutes minutes40 = minutes39.negated();
        org.joda.time.Minutes minutes41 = minutes40.negated();
        boolean boolean42 = minutes34.isGreaterThan(minutes41);
        org.joda.time.Duration duration43 = minutes41.toStandardDuration();
        org.joda.time.Minutes minutes44 = minutes41.negated();
        boolean boolean45 = minutes24.isLessThan(minutes44);
        org.joda.time.Minutes minutes46 = minutes14.minus(minutes44);
        org.joda.time.Duration duration47 = minutes46.toStandardDuration();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-10) + "'", int26 == (-10));
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(duration47);
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((-1));
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(obj5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6);
        boolean boolean8 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Interval interval10 = duration6.toIntervalTo(readableInstant9);
        org.joda.time.Interval interval11 = interval10.toInterval();
        org.joda.time.Hours hours12 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Hours hours14 = hours12.dividedBy(1);
        boolean boolean15 = hours1.isGreaterThan(hours14);
        org.joda.time.Hours hours16 = hours14.negated();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = duration19.toPeriod(chronology21);
        org.joda.time.Hours hours23 = duration19.toStandardHours();
        int int24 = hours23.getHours();
        java.lang.Object obj25 = null;
        org.joda.time.Duration duration26 = new org.joda.time.Duration(obj25);
        org.joda.time.Hours hours27 = duration26.toStandardHours();
        org.joda.time.Duration duration28 = hours27.toStandardDuration();
        org.joda.time.Hours hours29 = hours23.minus(hours27);
        org.joda.time.Hours hours31 = org.joda.time.Hours.hours(36000000);
        org.joda.time.Hours hours33 = hours31.plus(229);
        int int34 = hours33.size();
        org.joda.time.Hours hours35 = hours23.minus(hours33);
        boolean boolean36 = hours16.isLessThan(hours33);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(hours31);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((-101));
        int int2 = weeks1.getWeeks();
        org.joda.time.DurationFieldType durationFieldType3 = weeks1.getFieldType();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101) + "'", int2 == (-101));
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        long long9 = interval8.getStartMillis();
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval8);
        java.lang.String str11 = hours10.toString();
        org.joda.time.Hours hours13 = hours10.dividedBy(23);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        java.lang.Object obj17 = null;
        org.joda.time.Duration duration18 = new org.joda.time.Duration(obj17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration18);
        boolean boolean20 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Interval interval22 = duration18.toIntervalTo(readableInstant21);
        org.joda.time.Interval interval23 = interval22.toInterval();
        org.joda.time.Hours hours24 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval23);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((java.lang.Object) hours24);
        org.joda.time.PeriodType periodType26 = hours24.getPeriodType();
        org.joda.time.Hours hours28 = hours24.minus((int) (byte) -1);
        org.joda.time.Hours hours30 = hours28.dividedBy(3);
        org.joda.time.Hours hours32 = hours28.plus((int) (byte) 10);
        org.joda.time.Hours hours34 = hours32.dividedBy((-2147483648));
        org.joda.time.Hours hours36 = hours32.plus(0);
        org.joda.time.Hours hours37 = hours36.negated();
        org.joda.time.Hours hours39 = hours37.dividedBy(41);
        org.joda.time.Duration duration42 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Period period44 = duration42.toPeriodFrom(readableInstant43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = duration42.toPeriod(chronology45);
        org.joda.time.Period period48 = period46.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval49 = null;
        org.joda.time.Hours hours50 = org.joda.time.Hours.hoursIn(readableInterval49);
        org.joda.time.Period period51 = period48.minus((org.joda.time.ReadablePeriod) hours50);
        org.joda.time.Hours hours53 = hours50.minus((int) '4');
        org.joda.time.Hours hours55 = hours53.plus((int) (short) 10);
        org.joda.time.Hours hours57 = hours53.dividedBy(6);
        org.joda.time.Hours hours58 = hours37.minus(hours57);
        org.joda.time.Hours hours59 = hours10.minus(hours37);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1644572716754L + "'", long9 == 1644572716754L);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT0H" + "'", str11, "PT0H");
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(hours34);
        org.junit.Assert.assertNotNull(hours36);
        org.junit.Assert.assertNotNull(hours37);
        org.junit.Assert.assertNotNull(hours39);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(hours50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(hours53);
        org.junit.Assert.assertNotNull(hours55);
        org.junit.Assert.assertNotNull(hours57);
        org.junit.Assert.assertNotNull(hours58);
        org.junit.Assert.assertNotNull(hours59);
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType1 = seconds0.getFieldType();
        org.joda.time.Seconds seconds3 = seconds0.plus((-1));
        org.joda.time.DurationFieldType durationFieldType4 = seconds0.getFieldType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus((-1));
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        java.lang.String str11 = seconds10.toString();
        org.joda.time.Seconds seconds12 = seconds9.plus(seconds10);
        org.joda.time.Seconds seconds13 = seconds5.minus(seconds10);
        org.joda.time.Seconds seconds14 = seconds0.plus(seconds5);
        org.joda.time.Seconds seconds15 = seconds14.negated();
        org.joda.time.Seconds seconds17 = seconds14.dividedBy((-10));
        org.joda.time.PeriodType periodType18 = seconds17.getPeriodType();
        org.joda.time.Seconds seconds20 = seconds17.dividedBy((int) (byte) 1);
        java.lang.String str21 = seconds17.toString();
        org.joda.time.Seconds seconds22 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds24 = seconds22.multipliedBy((int) (byte) 1);
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds27 = seconds25.multipliedBy((int) (byte) 1);
        int int28 = seconds27.size();
        org.joda.time.Period period30 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period32 = period30.minusMillis((-1));
        org.joda.time.Seconds seconds33 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period32);
        boolean boolean34 = seconds27.isGreaterThan(seconds33);
        org.joda.time.PeriodType periodType35 = seconds27.getPeriodType();
        org.joda.time.Seconds seconds36 = seconds24.plus(seconds27);
        org.joda.time.Seconds seconds37 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType38 = seconds37.getFieldType();
        org.joda.time.Seconds seconds40 = seconds37.plus((-1));
        org.joda.time.Seconds seconds41 = org.joda.time.Seconds.TWO;
        java.lang.String str42 = seconds41.toString();
        org.joda.time.Seconds seconds43 = seconds40.plus(seconds41);
        org.joda.time.Duration duration45 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant46 = null;
        java.lang.Object obj47 = null;
        org.joda.time.Duration duration48 = new org.joda.time.Duration(obj47);
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant46, (org.joda.time.ReadableDuration) duration48);
        boolean boolean50 = duration45.isShorterThan((org.joda.time.ReadableDuration) duration48);
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((java.lang.Object) duration45, periodType51, chronology52);
        org.joda.time.DurationFieldType[] durationFieldTypeArray54 = mutablePeriod53.getFieldTypes();
        org.joda.time.Duration duration57 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Period period59 = duration57.toPeriodFrom(readableInstant58);
        org.joda.time.Duration duration61 = duration57.plus((-1L));
        org.joda.time.Chronology chronology62 = null;
        mutablePeriod53.setPeriod((org.joda.time.ReadableDuration) duration61, chronology62);
        org.joda.time.Seconds seconds64 = duration61.toStandardSeconds();
        org.joda.time.Seconds seconds65 = seconds40.plus(seconds64);
        boolean boolean66 = seconds27.isGreaterThan(seconds64);
        org.joda.time.Seconds seconds68 = seconds27.multipliedBy((-35));
        boolean boolean69 = seconds17.isLessThan(seconds27);
        org.joda.time.Seconds seconds71 = seconds27.minus(30);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT2S" + "'", str11, "PT2S");
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT0S" + "'", str21, "PT0S");
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertNotNull(seconds41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT2S" + "'", str42, "PT2S");
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(durationFieldTypeArray54);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(seconds64);
        org.junit.Assert.assertNotNull(seconds65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(seconds68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(seconds71);
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType2 = periodType1.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.eras();
        int int5 = periodType2.indexOf(durationFieldType4);
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
        org.joda.time.Period period17 = new org.joda.time.Period((long) 1, periodType2, chronology16);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType19 = periodType18.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(periodType19);
        org.joda.time.Period period21 = period17.minus((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.format.PeriodFormatter periodFormatter22 = null;
        java.lang.String str23 = period17.toString(periodFormatter22);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "P" + "'", str23, "P");
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks5 = weeks4.negated();
        org.joda.time.Weeks weeks6 = weeks2.minus(weeks5);
        org.joda.time.Weeks weeks8 = weeks2.plus((int) ' ');
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
        org.joda.time.Weeks weeks32 = period31.toStandardWeeks();
        org.joda.time.Weeks weeks33 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period31);
        int int34 = weeks33.size();
        int int35 = weeks33.getWeeks();
        org.joda.time.Weeks weeks37 = weeks33.dividedBy(30);
        org.joda.time.Weeks weeks38 = weeks37.negated();
        java.lang.String str39 = weeks38.toString();
        org.joda.time.Weeks weeks40 = weeks8.minus(weeks38);
        org.joda.time.Weeks weeks42 = weeks38.minus(23);
        org.joda.time.Weeks weeks44 = weeks38.multipliedBy(0);
        org.joda.time.MutablePeriod mutablePeriod45 = weeks38.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType46 = weeks38.getFieldType();
        org.joda.time.Weeks weeks48 = weeks38.dividedBy((-3628800));
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
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
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "P0W" + "'", str39, "P0W");
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertNotNull(mutablePeriod45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(weeks48);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        org.joda.time.Duration duration2 = new org.joda.time.Duration(1644572122285L, 1644572137529L);
        org.joda.time.Duration duration4 = duration2.plus(1644572372979L);
        org.joda.time.Duration duration5 = duration4.toDuration();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
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
        org.joda.time.PeriodType periodType15 = minutes14.getPeriodType();
        org.joda.time.Minutes minutes17 = minutes14.multipliedBy((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType18 = minutes17.getFieldType();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(durationFieldType18);
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Duration duration2 = days0.toStandardDuration();
        org.joda.time.Days days4 = days0.minus(36);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) '4');
        long long2 = duration1.getMillis();
        org.joda.time.Minutes minutes3 = duration1.toStandardMinutes();
        java.lang.String str4 = minutes3.toString();
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.Duration duration8 = org.joda.time.Duration.millis((long) '4');
        long long9 = duration8.getMillis();
        org.joda.time.Minutes minutes10 = duration8.toStandardMinutes();
        org.joda.time.Minutes minutes11 = minutes10.negated();
        org.joda.time.Minutes minutes12 = minutes6.plus(minutes10);
        org.joda.time.Minutes minutes13 = minutes12.negated();
        org.joda.time.Minutes minutes14 = minutes3.plus(minutes13);
        org.joda.time.PeriodType periodType15 = minutes14.getPeriodType();
        org.joda.time.Duration duration17 = org.joda.time.Duration.millis((long) '4');
        long long18 = duration17.getMillis();
        org.joda.time.Minutes minutes19 = duration17.toStandardMinutes();
        java.lang.String str20 = minutes19.toString();
        int int21 = minutes19.getMinutes();
        org.joda.time.Minutes minutes23 = minutes19.plus((-1));
        org.joda.time.PeriodType periodType24 = minutes23.getPeriodType();
        boolean boolean25 = minutes14.isGreaterThan(minutes23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        java.lang.Object obj27 = null;
        org.joda.time.Duration duration28 = new org.joda.time.Duration(obj27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, readableInstant30);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType34);
        mutablePeriod35.addMillis((-1));
        mutablePeriod31.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod35);
        int int39 = mutablePeriod31.getYears();
        org.joda.time.Minutes minutes40 = org.joda.time.Minutes.ZERO;
        org.joda.time.Period period41 = new org.joda.time.Period((java.lang.Object) minutes40);
        org.joda.time.Period period42 = minutes40.toPeriod();
        org.joda.time.Duration duration44 = org.joda.time.Duration.millis((long) '4');
        long long45 = duration44.getMillis();
        org.joda.time.Minutes minutes46 = duration44.toStandardMinutes();
        org.joda.time.Minutes minutes47 = minutes46.negated();
        org.joda.time.Minutes minutes49 = minutes46.minus((int) 'a');
        org.joda.time.Minutes minutes50 = minutes40.minus(minutes46);
        mutablePeriod31.mergePeriod((org.joda.time.ReadablePeriod) minutes50);
        org.joda.time.Minutes minutes53 = org.joda.time.Minutes.minutes((int) (byte) 10);
        org.joda.time.Duration duration55 = org.joda.time.Duration.millis((long) '4');
        long long56 = duration55.getMillis();
        org.joda.time.Minutes minutes57 = duration55.toStandardMinutes();
        org.joda.time.Minutes minutes58 = minutes57.negated();
        org.joda.time.Minutes minutes59 = minutes53.plus(minutes57);
        org.joda.time.Duration duration62 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration65 = duration62.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Minutes minutes66 = duration65.toStandardMinutes();
        org.joda.time.Duration duration68 = org.joda.time.Duration.millis((long) '4');
        long long69 = duration68.getMillis();
        org.joda.time.Minutes minutes70 = duration68.toStandardMinutes();
        org.joda.time.Minutes minutes71 = minutes70.negated();
        boolean boolean72 = minutes66.isGreaterThan(minutes71);
        org.joda.time.Minutes minutes73 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes74 = minutes73.negated();
        org.joda.time.Minutes minutes75 = minutes71.minus(minutes74);
        boolean boolean76 = minutes53.isLessThan(minutes75);
        org.joda.time.Minutes minutes78 = minutes53.minus(0);
        boolean boolean79 = minutes50.isLessThan(minutes78);
        org.joda.time.Minutes minutes80 = minutes78.negated();
        org.joda.time.Minutes minutes81 = minutes78.negated();
        org.joda.time.Minutes minutes83 = minutes78.multipliedBy(229);
        org.joda.time.Minutes minutes84 = minutes23.minus(minutes83);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0M" + "'", str4, "PT0M");
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT0M" + "'", str20, "PT0M");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 52L + "'", long45 == 52L);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 52L + "'", long56 == 52L);
        org.junit.Assert.assertNotNull(minutes57);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(minutes66);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 52L + "'", long69 == 52L);
        org.junit.Assert.assertNotNull(minutes70);
        org.junit.Assert.assertNotNull(minutes71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(minutes73);
        org.junit.Assert.assertNotNull(minutes74);
        org.junit.Assert.assertNotNull(minutes75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(minutes78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(minutes80);
        org.junit.Assert.assertNotNull(minutes81);
        org.junit.Assert.assertNotNull(minutes83);
        org.junit.Assert.assertNotNull(minutes84);
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0.097S");
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.Period period4 = period2.plusMinutes((-1));
        int[] intArray5 = period2.getValues();
        org.joda.time.Period period7 = period2.plusWeeks((int) (short) -1);
        org.joda.time.Days days8 = org.joda.time.Days.ONE;
        org.joda.time.Days days9 = days8.negated();
        org.joda.time.Days days10 = org.joda.time.Days.ONE;
        org.joda.time.Days days11 = days10.negated();
        org.joda.time.Days days12 = org.joda.time.Days.ONE;
        org.joda.time.Days days13 = days12.negated();
        boolean boolean14 = days11.isGreaterThan(days13);
        org.joda.time.Days days15 = days8.plus(days13);
        boolean boolean16 = period7.equals((java.lang.Object) days8);
        org.joda.time.Period period18 = period7.minusSeconds((int) 'a');
        org.joda.time.Period period20 = period7.minusSeconds(32);
        org.joda.time.Period period22 = period20.minusYears(26);
        org.joda.time.Period period24 = period22.plusHours(2718);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, -97]");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(19034399);
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(1644572188982L, 1644572337158L);
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(obj1);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration2, readableInstant4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType8);
        mutablePeriod9.addMillis((-1));
        mutablePeriod5.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod9);
        mutablePeriod5.setMillis((int) '4');
        org.joda.time.MutablePeriod mutablePeriod15 = mutablePeriod5.copy();
        mutablePeriod5.addMillis((int) '#');
        int int18 = mutablePeriod5.getSeconds();
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) mutablePeriod5);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(seconds19);
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        org.joda.time.Period period8 = new org.joda.time.Period(30, 300, 6, (int) (short) 1, (int) (short) 1, 36, (int) (short) -1, (-2));
        org.joda.time.Period period10 = period8.withYears(300);
        org.joda.time.Period period12 = period10.withSeconds((int) 'a');
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT0S");
        int int2 = minutes1.getMinutes();
        org.joda.time.Minutes minutes4 = minutes1.plus((int) (short) 100);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(minutes4);
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 1, (int) (byte) 100, (-9), 41, 101, (-19034399), (int) (short) -1, (-830), periodType8);
        org.joda.time.PeriodType periodType11 = periodType8.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (short) 100);
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks4 = weeks2.plus((int) '4');
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeks((int) (byte) -1);
        boolean boolean8 = weeks5.isGreaterThan(weeks7);
        org.joda.time.DurationFieldType durationFieldType9 = weeks7.getFieldType();
        boolean boolean10 = weeks2.isGreaterThan(weeks7);
        org.joda.time.Period period11 = weeks7.toPeriod();
        org.joda.time.Weeks weeks13 = weeks7.plus(30);
        org.joda.time.Weeks weeks14 = weeks1.minus(weeks7);
        org.joda.time.Weeks weeks15 = weeks1.negated();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks15);
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((-1));
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(obj5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6);
        boolean boolean8 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Interval interval10 = duration6.toIntervalTo(readableInstant9);
        org.joda.time.Interval interval11 = interval10.toInterval();
        org.joda.time.Hours hours12 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Hours hours14 = hours12.dividedBy(1);
        boolean boolean15 = hours1.isGreaterThan(hours14);
        org.joda.time.Hours hours16 = hours14.negated();
        java.lang.String str17 = hours16.toString();
        org.joda.time.Duration duration20 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = duration20.toPeriodFrom(readableInstant21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = duration20.toPeriod(chronology23);
        org.joda.time.Period period26 = period24.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.Hours hours28 = org.joda.time.Hours.hoursIn(readableInterval27);
        org.joda.time.Period period29 = period26.minus((org.joda.time.ReadablePeriod) hours28);
        org.joda.time.Hours hours30 = hours28.negated();
        org.joda.time.DurationFieldType durationFieldType31 = hours28.getFieldType();
        org.joda.time.Hours hours33 = hours28.multipliedBy((-9700));
        org.joda.time.Hours hours35 = hours28.plus((-97));
        org.joda.time.Hours hours36 = hours16.plus(hours35);
        org.joda.time.Hours hours37 = hours36.negated();
        org.joda.time.Hours hours39 = hours37.multipliedBy(2400);
        org.joda.time.Hours hours41 = hours37.minus(38);
        org.joda.time.Hours hours43 = hours37.multipliedBy((-1));
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0H" + "'", str17, "PT0H");
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(hours36);
        org.junit.Assert.assertNotNull(hours37);
        org.junit.Assert.assertNotNull(hours39);
        org.junit.Assert.assertNotNull(hours41);
        org.junit.Assert.assertNotNull(hours43);
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        java.lang.String str7 = period6.toString();
        org.joda.time.MutablePeriod mutablePeriod8 = period6.toMutablePeriod();
        org.joda.time.Period period9 = period6.toPeriod();
        org.joda.time.Period period11 = period6.withHours(51);
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant14 = null;
        java.lang.Object obj15 = null;
        org.joda.time.Duration duration16 = new org.joda.time.Duration(obj15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration16);
        boolean boolean18 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Interval interval20 = duration16.toIntervalTo(readableInstant19);
        org.joda.time.Interval interval21 = interval20.toInterval();
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        java.lang.Object obj25 = null;
        org.joda.time.Duration duration26 = new org.joda.time.Duration(obj25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, (org.joda.time.ReadableDuration) duration26);
        boolean boolean28 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Interval interval30 = duration26.toIntervalTo(readableInstant29);
        boolean boolean31 = interval21.isAfter((org.joda.time.ReadableInterval) interval30);
        org.joda.time.Period period32 = interval30.toPeriod();
        org.joda.time.Duration duration33 = interval30.toDuration();
        org.joda.time.Seconds seconds34 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval30);
        org.joda.time.DurationFieldType durationFieldType35 = seconds34.getFieldType();
        org.joda.time.DurationFieldType durationFieldType36 = seconds34.getFieldType();
        boolean boolean37 = period6.isSupported(durationFieldType36);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.097S" + "'", str7, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("2022-02-11T09:37:02.840Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:37:02.840Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy((int) (byte) 1);
        org.joda.time.PeriodType periodType3 = seconds2.getPeriodType();
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType6 = seconds5.getFieldType();
        org.joda.time.Seconds seconds8 = seconds5.plus((-1));
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        java.lang.String str10 = seconds9.toString();
        org.joda.time.Seconds seconds11 = seconds8.plus(seconds9);
        org.joda.time.Seconds seconds12 = seconds4.minus(seconds9);
        org.joda.time.Duration duration13 = seconds4.toStandardDuration();
        org.joda.time.Seconds seconds14 = seconds2.plus(seconds4);
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType16 = seconds15.getFieldType();
        org.joda.time.Seconds seconds18 = seconds15.plus((-1));
        org.joda.time.DurationFieldType durationFieldType19 = seconds15.getFieldType();
        org.joda.time.Seconds seconds20 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType22 = seconds21.getFieldType();
        org.joda.time.Seconds seconds24 = seconds21.plus((-1));
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.TWO;
        java.lang.String str26 = seconds25.toString();
        org.joda.time.Seconds seconds27 = seconds24.plus(seconds25);
        org.joda.time.Seconds seconds28 = seconds20.minus(seconds25);
        org.joda.time.Seconds seconds29 = seconds15.plus(seconds20);
        org.joda.time.Duration duration30 = seconds15.toStandardDuration();
        java.lang.String str31 = seconds15.toString();
        org.joda.time.Seconds seconds32 = org.joda.time.Seconds.TWO;
        java.lang.String str33 = seconds32.toString();
        boolean boolean34 = seconds15.isGreaterThan(seconds32);
        org.joda.time.Seconds seconds36 = seconds15.multipliedBy((-9700));
        boolean boolean37 = seconds14.isGreaterThan(seconds15);
        org.joda.time.MutablePeriod mutablePeriod38 = seconds14.toMutablePeriod();
        mutablePeriod38.setMonths(7);
        mutablePeriod38.addMillis((int) (short) -1);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT2S" + "'", str10, "PT2S");
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT2S" + "'", str26, "PT2S");
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT0S" + "'", str31, "PT0S");
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PT2S" + "'", str33, "PT2S");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(mutablePeriod38);
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType2 = seconds1.getFieldType();
        org.joda.time.Seconds seconds4 = seconds1.plus((-1));
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        java.lang.String str6 = seconds5.toString();
        org.joda.time.Seconds seconds7 = seconds4.plus(seconds5);
        org.joda.time.Seconds seconds8 = seconds0.minus(seconds5);
        org.joda.time.Seconds seconds9 = seconds5.negated();
        org.joda.time.Seconds seconds11 = seconds5.multipliedBy((int) (short) 100);
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.seconds((int) (byte) 0);
        org.joda.time.Seconds seconds15 = seconds13.minus(1);
        boolean boolean16 = seconds11.isLessThan(seconds13);
        int int17 = seconds13.size();
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType19 = seconds18.getFieldType();
        org.joda.time.Seconds seconds21 = seconds18.plus((-1));
        org.joda.time.DurationFieldType durationFieldType22 = seconds18.getFieldType();
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds24 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType25 = seconds24.getFieldType();
        org.joda.time.Seconds seconds27 = seconds24.plus((-1));
        org.joda.time.Seconds seconds28 = org.joda.time.Seconds.TWO;
        java.lang.String str29 = seconds28.toString();
        org.joda.time.Seconds seconds30 = seconds27.plus(seconds28);
        org.joda.time.Seconds seconds31 = seconds23.minus(seconds28);
        org.joda.time.Seconds seconds32 = seconds18.plus(seconds23);
        org.joda.time.Duration duration33 = seconds18.toStandardDuration();
        java.lang.String str34 = seconds18.toString();
        org.joda.time.Seconds seconds35 = org.joda.time.Seconds.TWO;
        java.lang.String str36 = seconds35.toString();
        boolean boolean37 = seconds18.isGreaterThan(seconds35);
        org.joda.time.PeriodType periodType38 = seconds35.getPeriodType();
        org.joda.time.Seconds seconds39 = org.joda.time.Seconds.ONE;
        org.joda.time.Seconds seconds40 = seconds35.plus(seconds39);
        int int41 = seconds39.getSeconds();
        org.joda.time.Seconds seconds43 = seconds39.multipliedBy((int) (short) 0);
        org.joda.time.Seconds seconds44 = seconds39.negated();
        org.joda.time.Seconds seconds45 = seconds13.minus(seconds39);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT2S" + "'", str6, "PT2S");
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT2S" + "'", str29, "PT2S");
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT0S" + "'", str34, "PT0S");
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PT2S" + "'", str36, "PT2S");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertNotNull(seconds45);
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period3 = period1.withWeeks(52);
        int int4 = period3.getWeeks();
        org.joda.time.Period period6 = period3.plusMinutes(69);
        org.joda.time.Period period8 = period3.minusWeeks((-10));
        org.joda.time.ReadableInstant readableInstant10 = null;
        java.lang.Object obj11 = null;
        org.joda.time.Duration duration12 = new org.joda.time.Duration(obj11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant14);
        org.joda.time.Duration duration17 = org.joda.time.Duration.millis((long) '4');
        long long18 = duration17.getStandardDays();
        boolean boolean19 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType21 = periodType20.withHoursRemoved();
        org.joda.time.Period period22 = duration17.toPeriod(periodType20);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((-1L), periodType20);
        org.joda.time.Period period24 = period3.normalizedStandard(periodType20);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(periodType20);
        java.lang.String str26 = periodType20.getName();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Days" + "'", str26, "Days");
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        org.joda.time.Period period12 = new org.joda.time.Period(36, (int) (byte) 0, (int) (byte) 0, (int) (byte) -1);
        org.joda.time.PeriodType periodType13 = period12.getPeriodType();
        org.joda.time.PeriodType periodType14 = periodType13.withHoursRemoved();
        org.joda.time.Period period15 = new org.joda.time.Period((-5), 1644572123, 0, 26, (int) (byte) 100, 31, 37, (-229), periodType13);
        org.joda.time.PeriodType periodType16 = periodType13.withHoursRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType18 = periodType16.getFieldType((-23));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test16628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16628");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) -1, 1, (int) (byte) 0, 100);
        mutablePeriod4.setPeriod(1644572143661L);
        mutablePeriod4.setMonths(222);
        mutablePeriod4.setYears((-456825));
        int int11 = mutablePeriod4.getMinutes();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test16629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16629");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period3 = period1.plusMinutes((int) ' ');
        int int4 = period3.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test16630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16630");
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
        org.joda.time.Duration duration20 = interval17.toDuration();
        long long21 = interval17.toDurationMillis();
        org.joda.time.Days days22 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval17);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.097S" + "'", str7, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644572717105L + "'", long18 == 1644572717105L);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(days22);
    }

    @Test
    public void test16631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16631");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Interval interval9 = interval8.toInterval();
        org.joda.time.Days days10 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.DateTime dateTime11 = interval8.getEnd();
        org.joda.time.DateTime dateTime12 = interval8.getStart();
        long long13 = interval8.toDurationMillis();
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
        long long34 = interval32.toDurationMillis();
        org.joda.time.Interval interval35 = interval32.toInterval();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = interval35.toPeriod(periodType36);
        org.joda.time.DateTime dateTime38 = interval35.getStart();
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime38.getZone();
        boolean boolean40 = interval8.isAfter((org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test16632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16632");
        org.joda.time.Days days1 = org.joda.time.Days.days(10);
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.Days days3 = days2.negated();
        org.joda.time.Days days4 = org.joda.time.Days.ONE;
        org.joda.time.Days days5 = days4.negated();
        boolean boolean6 = days3.isGreaterThan(days5);
        int int7 = days5.size();
        boolean boolean8 = days1.isGreaterThan(days5);
        org.joda.time.Days days10 = days5.minus((int) ' ');
        org.joda.time.Days days11 = days5.negated();
        org.joda.time.PeriodType periodType12 = days5.getPeriodType();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test16633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16633");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) 0, (int) (byte) 10, (int) (byte) 100, (int) (byte) 100);
        org.joda.time.Period period6 = period4.plusYears((int) (byte) 10);
        org.joda.time.Period period8 = period6.withMillis((int) '#');
        org.joda.time.Period period10 = period8.withHours((int) (short) 10);
        org.joda.time.format.PeriodFormatter periodFormatter11 = null;
        java.lang.String str12 = period10.toString(periodFormatter11);
        org.joda.time.Period period14 = period10.withMillis((-690));
        org.joda.time.Period period15 = period10.toPeriod();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P10YT10H10M100.035S" + "'", str12, "P10YT10H10M100.035S");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test16634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16634");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        org.joda.time.Period period8 = period6.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn(readableInterval9);
        org.joda.time.Period period11 = period8.minus((org.joda.time.ReadablePeriod) hours10);
        int int12 = period11.getYears();
        org.joda.time.Period period14 = period11.minusMillis((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod15 = period14.toMutablePeriod();
        int int16 = mutablePeriod15.getMinutes();
        int int17 = mutablePeriod15.getMonths();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test16635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16635");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType1 = seconds0.getFieldType();
        org.joda.time.Seconds seconds3 = seconds0.plus((-1));
        org.joda.time.DurationFieldType durationFieldType4 = seconds0.getFieldType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus((-1));
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        java.lang.String str11 = seconds10.toString();
        org.joda.time.Seconds seconds12 = seconds9.plus(seconds10);
        org.joda.time.Seconds seconds13 = seconds5.minus(seconds10);
        org.joda.time.Seconds seconds14 = seconds0.plus(seconds5);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.secondsIn(readableInterval15);
        org.joda.time.Seconds seconds17 = seconds0.plus(seconds16);
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds20 = seconds18.multipliedBy((int) (byte) 1);
        java.lang.String str21 = seconds18.toString();
        org.joda.time.Seconds seconds22 = seconds16.plus(seconds18);
        org.joda.time.Seconds seconds23 = seconds18.negated();
        org.joda.time.PeriodType periodType24 = seconds23.getPeriodType();
        org.joda.time.Seconds seconds25 = null;
        boolean boolean26 = seconds23.isLessThan(seconds25);
        org.joda.time.Duration duration27 = seconds23.toStandardDuration();
        org.joda.time.Duration duration28 = duration27.toDuration();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT2S" + "'", str11, "PT2S");
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT3S" + "'", str21, "PT3S");
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration28);
    }

    @Test
    public void test16636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16636");
        java.lang.Object obj0 = null;
        org.joda.time.Duration duration1 = new org.joda.time.Duration(obj0);
        org.joda.time.Hours hours2 = duration1.toStandardHours();
        org.joda.time.Hours hours4 = hours2.dividedBy(52);
        org.joda.time.MutablePeriod mutablePeriod5 = hours2.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod6 = hours2.toMutablePeriod();
        org.joda.time.Period period7 = mutablePeriod6.toPeriod();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant10 = null;
        java.lang.Object obj11 = null;
        org.joda.time.Duration duration12 = new org.joda.time.Duration(obj11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration12);
        boolean boolean14 = duration9.isShorterThan((org.joda.time.ReadableDuration) duration12);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Interval interval16 = duration12.toIntervalTo(readableInstant15);
        org.joda.time.Interval interval17 = interval16.toInterval();
        org.joda.time.Hours hours18 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval17);
        org.joda.time.Hours hours19 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval17);
        org.joda.time.DurationFieldType durationFieldType20 = hours19.getFieldType();
        org.joda.time.Hours hours22 = hours19.minus(1);
        org.joda.time.Hours hours24 = hours22.minus((int) (short) 1);
        org.joda.time.Hours hours26 = hours24.plus((-100));
        org.joda.time.Hours hours28 = hours26.dividedBy(103);
        mutablePeriod6.setPeriod((org.joda.time.ReadablePeriod) hours26);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours28);
    }

    @Test
    public void test16637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16637");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks2 = weeks0.minus(weeks1);
        int int3 = weeks2.getWeeks();
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks6 = weeks5.negated();
        int int7 = weeks5.getWeeks();
        org.joda.time.Weeks weeks9 = weeks5.minus(3);
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks12 = weeks10.minus(weeks11);
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) weeks12);
        org.joda.time.PeriodType periodType14 = weeks12.getPeriodType();
        boolean boolean15 = weeks5.isGreaterThan(weeks12);
        org.joda.time.Weeks weeks16 = weeks2.minus(weeks12);
        org.joda.time.MutablePeriod mutablePeriod17 = weeks2.toMutablePeriod();
        mutablePeriod17.add(100, 6, 8, 0, (int) (byte) 10, (int) ' ', 52, (int) '#');
        org.joda.time.MutablePeriod mutablePeriod27 = mutablePeriod17.copy();
        int int28 = mutablePeriod27.getMillis();
        java.lang.String str29 = mutablePeriod27.toString();
        mutablePeriod27.addMillis(11);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "P100Y6M8WT10H32M52.035S" + "'", str29, "P100Y6M8WT10H32M52.035S");
    }

    @Test
    public void test16638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16638");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(101);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) ' ', chronology4);
        org.joda.time.Duration duration7 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration9 = duration7.plus(1644572122285L);
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration9);
        int int11 = mutablePeriod5.getSeconds();
        mutablePeriod5.addMonths((int) (short) 1);
        org.joda.time.PeriodType periodType14 = mutablePeriod5.getPeriodType();
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
        org.joda.time.Chronology chronology40 = dateTime27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod(1644572166118L, 1644572162497L, chronology40);
        org.joda.time.Period period42 = new org.joda.time.Period(1644572170016L, periodType14, chronology40);
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration50 = duration47.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration52 = duration44.withDurationAdded((org.joda.time.ReadableDuration) duration47, (int) (short) 1);
        org.joda.time.Duration duration54 = duration44.plus(1644572134288L);
        long long55 = duration44.getMillis();
        boolean boolean56 = periodType14.equals((java.lang.Object) long55);
        java.lang.String str57 = periodType14.getName();
        org.joda.time.PeriodType periodType58 = periodType14.withHoursRemoved();
        java.lang.String str59 = periodType58.getName();
        boolean boolean60 = period1.equals((java.lang.Object) str59);
        org.joda.time.Period period62 = period1.plusWeeks(48);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
        org.junit.Assert.assertNotNull(periodType14);
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
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 36000000L + "'", long55 == 36000000L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Standard" + "'", str57, "Standard");
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "StandardNoHours" + "'", str59, "StandardNoHours");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(period62);
    }

    @Test
    public void test16639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16639");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 10);
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
        org.joda.time.Interval interval50 = interval49.toInterval();
        org.joda.time.DateTime dateTime51 = interval50.getEnd();
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
        org.joda.time.Period period63 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Seconds seconds64 = org.joda.time.Seconds.secondsBetween((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.Chronology chronology65 = dateTime25.getChronology();
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime25.getZone();
        java.lang.String str67 = dateTime25.toString();
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Duration duration70 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant71 = null;
        java.lang.Object obj72 = null;
        org.joda.time.Duration duration73 = new org.joda.time.Duration(obj72);
        org.joda.time.Period period74 = new org.joda.time.Period(readableInstant71, (org.joda.time.ReadableDuration) duration73);
        boolean boolean75 = duration70.isShorterThan((org.joda.time.ReadableDuration) duration73);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Interval interval77 = duration73.toIntervalTo(readableInstant76);
        org.joda.time.Duration duration80 = new org.joda.time.Duration((long) 'a', (long) 0);
        boolean boolean81 = duration73.equals((java.lang.Object) 'a');
        org.joda.time.Period period82 = duration73.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableDuration) duration73);
        org.joda.time.Duration duration86 = new org.joda.time.Duration((long) 9, 1644572133852L);
        org.joda.time.Duration duration87 = duration73.plus((org.joda.time.ReadableDuration) duration86);
        org.joda.time.Duration duration89 = duration86.withMillis(1644572223350L);
        org.joda.time.Duration duration90 = duration89.toDuration();
        org.junit.Assert.assertNotNull(duration1);
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
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2022-02-11T09:45:17.228Z" + "'", str39, "2022-02-11T09:45:17.228Z");
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(seconds64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeZone66);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "2022-02-11T09:45:17.228Z" + "'", str67, "2022-02-11T09:45:17.228Z");
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(duration87);
        org.junit.Assert.assertNotNull(duration89);
        org.junit.Assert.assertNotNull(duration90);
    }

    @Test
    public void test16640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16640");
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType6);
        org.joda.time.PeriodType periodType8 = mutablePeriod7.getPeriodType();
        java.lang.String str9 = periodType8.getName();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        java.lang.Object obj13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(obj13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration14);
        boolean boolean16 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration14.toIntervalTo(readableInstant17);
        long long19 = interval18.getStartMillis();
        org.joda.time.Minutes minutes20 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        java.lang.Object obj24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(obj24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration25);
        boolean boolean27 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration25);
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
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant53 = null;
        java.lang.Object obj54 = null;
        org.joda.time.Duration duration55 = new org.joda.time.Duration(obj54);
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, (org.joda.time.ReadableDuration) duration55);
        boolean boolean57 = duration52.isShorterThan((org.joda.time.ReadableDuration) duration55);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInterval readableInterval59 = null;
        org.joda.time.Minutes minutes60 = org.joda.time.Minutes.minutesIn(readableInterval59);
        java.lang.String str61 = minutes60.toString();
        org.joda.time.PeriodType periodType62 = minutes60.getPeriodType();
        org.joda.time.Period period63 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration55, readableInstant58, periodType62);
        org.joda.time.PeriodType periodType64 = periodType62.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration25, (org.joda.time.ReadableInstant) dateTime49, periodType64);
        org.joda.time.Duration duration67 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant68 = null;
        java.lang.Object obj69 = null;
        org.joda.time.Duration duration70 = new org.joda.time.Duration(obj69);
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant68, (org.joda.time.ReadableDuration) duration70);
        boolean boolean72 = duration67.isShorterThan((org.joda.time.ReadableDuration) duration70);
        org.joda.time.PeriodType periodType73 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((java.lang.Object) duration67, periodType73, chronology74);
        org.joda.time.Duration duration77 = org.joda.time.Duration.millis((long) '4');
        long long78 = duration77.getStandardDays();
        boolean boolean79 = duration67.isLongerThan((org.joda.time.ReadableDuration) duration77);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableDuration) duration77);
        boolean boolean81 = interval18.equals((java.lang.Object) dateTime49);
        org.joda.time.Chronology chronology82 = dateTime49.getChronology();
        org.joda.time.Period period83 = new org.joda.time.Period(36090L, (long) 300, periodType8, chronology82);
        org.joda.time.Period period84 = new org.joda.time.Period((long) (byte) 0, 97L, chronology82);
        org.joda.time.Period period86 = period84.withSeconds(23);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Standard" + "'", str9, "Standard");
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1644572717269L + "'", long19 == 1644572717269L);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
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
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(minutes60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "PT0M" + "'", str61, "PT0M");
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertNotNull(period86);
    }

    @Test
    public void test16641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16641");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType2);
        mutablePeriod3.setYears(0);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration7, chronology8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        java.lang.Object obj11 = null;
        org.joda.time.Duration duration12 = new org.joda.time.Duration(obj11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.Duration duration15 = duration12.minus((long) '4');
        mutablePeriod3.add((org.joda.time.ReadableDuration) duration15);
        mutablePeriod3.setWeeks((int) (byte) 100);
        int int19 = mutablePeriod3.getWeeks();
        mutablePeriod3.addMillis((-1440));
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test16642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16642");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.standardSecondsIn(readablePeriod0);
        org.joda.time.Seconds seconds3 = seconds1.multipliedBy((int) (short) 0);
        org.joda.time.Duration duration4 = seconds3.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = seconds3.getValue(101);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 101");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test16643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16643");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(obj1);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.Days days4 = duration2.toStandardDays();
        org.joda.time.Days days5 = days4.negated();
        org.joda.time.Days days6 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days8 = days6.minus(1);
        boolean boolean9 = days5.isLessThan(days8);
        org.joda.time.Days days11 = days5.multipliedBy((int) (byte) 0);
        org.joda.time.PeriodType periodType12 = days5.getPeriodType();
        org.joda.time.Days days14 = days5.dividedBy((-10));
        java.lang.String str15 = days5.toString();
        org.joda.time.DurationFieldType durationFieldType16 = days5.getFieldType();
        org.joda.time.Days days17 = org.joda.time.Days.ONE;
        org.joda.time.Days days18 = days17.negated();
        org.joda.time.Days days19 = org.joda.time.Days.ONE;
        org.joda.time.Days days20 = days19.negated();
        org.joda.time.Days days21 = org.joda.time.Days.ONE;
        org.joda.time.Days days22 = days21.negated();
        boolean boolean23 = days20.isGreaterThan(days22);
        org.joda.time.Days days24 = days17.plus(days22);
        org.joda.time.Days days26 = days24.minus(1);
        boolean boolean27 = days5.isGreaterThan(days24);
        org.joda.time.Days days29 = days5.plus((int) (byte) 0);
        org.joda.time.Days days31 = days29.dividedBy((int) (byte) 1);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0D" + "'", str15, "P0D");
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(days31);
    }

    @Test
    public void test16644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16644");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("2022-02-11T09:38:17.734Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:38:17.734Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16645");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(obj5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6);
        boolean boolean8 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.ReadableDuration readableDuration9 = null;
        boolean boolean10 = duration6.isLongerThan(readableDuration9);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        java.lang.Object obj14 = null;
        org.joda.time.Duration duration15 = new org.joda.time.Duration(obj14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration15);
        boolean boolean17 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((java.lang.Object) duration12, periodType18, chronology19);
        org.joda.time.PeriodType periodType21 = periodType18.withMonthsRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(periodType21);
        int int24 = periodType21.size();
        org.joda.time.Duration duration27 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Period period28 = duration27.toPeriod();
        org.joda.time.Period period30 = period28.plusMillis((int) (byte) 0);
        org.joda.time.Seconds seconds31 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType32 = seconds31.getFieldType();
        org.joda.time.Chronology chronology33 = null;
        boolean boolean34 = durationFieldType32.isSupported(chronology33);
        org.joda.time.Period period36 = period30.withField(durationFieldType32, 100);
        org.joda.time.Seconds seconds37 = period36.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology39 = null;
        boolean boolean40 = durationFieldType38.isSupported(chronology39);
        int int41 = period36.get(durationFieldType38);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType44 = periodType43.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(periodType44);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.eras();
        int int47 = periodType44.indexOf(durationFieldType46);
        org.joda.time.Duration duration49 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant50 = null;
        java.lang.Object obj51 = null;
        org.joda.time.Duration duration52 = new org.joda.time.Duration(obj51);
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant50, (org.joda.time.ReadableDuration) duration52);
        boolean boolean54 = duration49.isShorterThan((org.joda.time.ReadableDuration) duration52);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Interval interval56 = duration52.toIntervalTo(readableInstant55);
        org.joda.time.Interval interval57 = interval56.toInterval();
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.Period period59 = new org.joda.time.Period((long) 1, periodType44, chronology58);
        org.joda.time.DurationField durationField60 = durationFieldType38.getField(chronology58);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(1644572184190L, chronology58);
        org.joda.time.Period period62 = duration6.toPeriod(periodType21, chronology58);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((long) (-35), 1644572273526L, chronology58);
        int int64 = mutablePeriod63.getDays();
        mutablePeriod63.setPeriod(1644572610670L, 1644572669231L);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
    }

    @Test
    public void test16646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16646");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod1.addMinutes((int) (short) 1);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType12);
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes16 = minutes14.multipliedBy((int) (short) 1);
        mutablePeriod13.setPeriod((org.joda.time.ReadablePeriod) minutes16);
        boolean boolean18 = mutablePeriod1.equals((java.lang.Object) minutes16);
        org.joda.time.PeriodType periodType19 = minutes16.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod20 = minutes16.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant21 = null;
        java.lang.Object obj22 = null;
        org.joda.time.Duration duration23 = new org.joda.time.Duration(obj22);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.Duration duration26 = duration23.minus((long) '4');
        org.joda.time.Duration duration28 = org.joda.time.Duration.millis((long) '4');
        long long29 = duration28.getMillis();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType32);
        mutablePeriod33.setYears(0);
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology38 = null;
        mutablePeriod33.setPeriod((org.joda.time.ReadableDuration) duration37, chronology38);
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
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant53 = null;
        java.lang.Object obj54 = null;
        org.joda.time.Duration duration55 = new org.joda.time.Duration(obj54);
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, (org.joda.time.ReadableDuration) duration55);
        boolean boolean57 = duration52.isShorterThan((org.joda.time.ReadableDuration) duration55);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Interval interval59 = duration55.toIntervalTo(readableInstant58);
        org.joda.time.Interval interval60 = interval59.toInterval();
        org.joda.time.DateTime dateTime61 = interval60.getEnd();
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Period period63 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, (org.joda.time.ReadableInstant) dateTime50);
        java.lang.String str64 = dateTime50.toString();
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration28, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Duration duration67 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant68 = null;
        java.lang.Object obj69 = null;
        org.joda.time.Duration duration70 = new org.joda.time.Duration(obj69);
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant68, (org.joda.time.ReadableDuration) duration70);
        boolean boolean72 = duration67.isShorterThan((org.joda.time.ReadableDuration) duration70);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Interval interval74 = duration70.toIntervalTo(readableInstant73);
        org.joda.time.Duration duration77 = new org.joda.time.Duration((long) 'a', (long) 0);
        boolean boolean78 = duration70.equals((java.lang.Object) 'a');
        org.joda.time.Minutes minutes79 = duration70.toStandardMinutes();
        org.joda.time.Duration duration80 = duration28.plus((org.joda.time.ReadableDuration) duration70);
        org.joda.time.Duration duration82 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration84 = duration82.plus(1644572122285L);
        long long85 = duration82.getMillis();
        long long86 = duration82.getStandardHours();
        org.joda.time.Duration duration88 = org.joda.time.Duration.standardHours(1644572124065L);
        boolean boolean89 = duration82.isLongerThan((org.joda.time.ReadableDuration) duration88);
        org.joda.time.Duration duration91 = duration82.plus((long) 1);
        org.joda.time.Duration duration92 = duration80.plus((org.joda.time.ReadableDuration) duration82);
        boolean boolean93 = duration26.isEqual((org.joda.time.ReadableDuration) duration92);
        long long94 = duration26.getStandardSeconds();
        boolean boolean95 = minutes16.equals((java.lang.Object) duration26);
        org.joda.time.ReadableInstant readableInstant96 = null;
        org.joda.time.Period period97 = duration26.toPeriodTo(readableInstant96);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 52L + "'", long29 == 52L);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(dateTime61);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "2022-02-11T09:45:17.361Z" + "'", str64, "2022-02-11T09:45:17.361Z");
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(minutes79);
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertNotNull(duration84);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 52L + "'", long85 == 52L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertNotNull(duration88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(duration91);
        org.junit.Assert.assertNotNull(duration92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(period97);
    }

    @Test
    public void test16647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16647");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration7 = duration4.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration9 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration4, (int) (short) 1);
        org.joda.time.Duration duration11 = duration1.plus(1644572134288L);
        long long12 = duration1.getMillis();
        java.lang.String str13 = duration1.toString();
        org.joda.time.Duration duration15 = duration1.withMillis(1644572149846L);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) (byte) 0, chronology17);
        mutablePeriod18.setDays((int) (short) 0);
        java.lang.Object obj21 = mutablePeriod18.clone();
        mutablePeriod18.addMillis((int) (short) 0);
        mutablePeriod18.addHours((-690));
        org.joda.time.DurationFieldType[] durationFieldTypeArray26 = mutablePeriod18.getFieldTypes();
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.forFields(durationFieldTypeArray26);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.forFields(durationFieldTypeArray26);
        org.joda.time.Period period29 = duration1.toPeriod(periodType28);
        org.joda.time.Period period34 = new org.joda.time.Period((int) (byte) 1, 100, (int) (short) -1, 0);
        org.joda.time.Period period36 = period34.plusDays((-2));
        org.joda.time.Period period38 = period36.withDays((int) (byte) 1);
        org.joda.time.Period period40 = period38.withWeeks(1);
        org.joda.time.Days days42 = org.joda.time.Days.days((int) (byte) 0);
        org.joda.time.Days days43 = days42.negated();
        org.joda.time.DurationFieldType durationFieldType44 = days42.getFieldType();
        int int45 = period40.get(durationFieldType44);
        java.lang.String str46 = durationFieldType44.toString();
        boolean boolean47 = period29.isSupported(durationFieldType44);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36000000L + "'", long12 == 36000000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT36000S" + "'", str13, "PT36000S");
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "PT-690H");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "PT-690H");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "PT-690H");
        org.junit.Assert.assertNotNull(durationFieldTypeArray26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "days" + "'", str46, "days");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test16648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16648");
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
        org.joda.time.Interval interval21 = interval17.toInterval();
        org.joda.time.DateTime dateTime22 = interval17.getEnd();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.097S" + "'", str7, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644572717487L + "'", long18 == 1644572717487L);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test16649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16649");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.Hours hours2 = hours0.multipliedBy((int) (short) 1);
        org.joda.time.Hours hours4 = hours2.dividedBy(22);
        org.joda.time.MutablePeriod mutablePeriod6 = org.joda.time.MutablePeriod.parse("PT0.097S");
        mutablePeriod6.addMonths((int) (short) 1);
        mutablePeriod6.add(10, (int) (short) 1, (int) (short) 0, (int) 'a', 0, (-97), (int) (byte) 1, (int) (byte) -1);
        mutablePeriod6.addSeconds(0);
        org.joda.time.Hours hours21 = org.joda.time.Hours.hours((-1));
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
        org.joda.time.Hours hours34 = hours32.dividedBy(1);
        boolean boolean35 = hours21.isGreaterThan(hours34);
        org.joda.time.Duration duration36 = hours21.toStandardDuration();
        org.joda.time.Hours hours37 = org.joda.time.Hours.TWO;
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
        org.joda.time.Duration duration53 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Period period55 = duration53.toPeriodFrom(readableInstant54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = duration53.toPeriod(chronology56);
        org.joda.time.Period period59 = period57.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval60 = null;
        org.joda.time.Hours hours61 = org.joda.time.Hours.hoursIn(readableInterval60);
        org.joda.time.Period period62 = period59.minus((org.joda.time.ReadablePeriod) hours61);
        org.joda.time.Hours hours63 = hours61.negated();
        org.joda.time.Hours hours64 = hours48.minus(hours61);
        org.joda.time.Hours hours65 = hours37.minus(hours61);
        org.joda.time.Duration duration68 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Period period70 = duration68.toPeriodFrom(readableInstant69);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.Period period72 = duration68.toPeriod(chronology71);
        org.joda.time.Period period74 = period72.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval75 = null;
        org.joda.time.Hours hours76 = org.joda.time.Hours.hoursIn(readableInterval75);
        org.joda.time.Period period77 = period74.minus((org.joda.time.ReadablePeriod) hours76);
        org.joda.time.Hours hours79 = hours76.minus((int) '4');
        org.joda.time.Hours hours81 = hours79.plus((int) (short) 10);
        org.joda.time.Hours hours82 = hours65.plus(hours79);
        org.joda.time.Hours hours83 = hours21.minus(hours65);
        mutablePeriod6.add((org.joda.time.ReadablePeriod) hours83);
        org.joda.time.Hours hours85 = hours4.minus(hours83);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(hours34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(hours37);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(hours48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(hours50);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(hours61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(hours63);
        org.junit.Assert.assertNotNull(hours64);
        org.junit.Assert.assertNotNull(hours65);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(hours76);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(hours79);
        org.junit.Assert.assertNotNull(hours81);
        org.junit.Assert.assertNotNull(hours82);
        org.junit.Assert.assertNotNull(hours83);
        org.junit.Assert.assertNotNull(hours85);
    }

    @Test
    public void test16650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16650");
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
        long long20 = interval18.toDurationMillis();
        org.joda.time.Interval interval21 = interval18.toInterval();
        org.joda.time.DateTime dateTime22 = interval18.getEnd();
        org.joda.time.MutableInterval mutableInterval23 = interval18.toMutableInterval();
        org.joda.time.DateTime dateTime24 = interval18.getEnd();
        org.joda.time.Interval interval25 = interval18.toInterval();
        org.joda.time.Duration duration26 = interval25.toDuration();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableInterval23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(duration26);
    }

    @Test
    public void test16651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16651");
        org.joda.time.Period period1 = org.joda.time.Period.days((-300));
        int int2 = period1.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16652");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType8);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes12 = minutes10.multipliedBy((int) (short) 1);
        mutablePeriod9.setPeriod((org.joda.time.ReadablePeriod) minutes12);
        mutablePeriod9.addDays(0);
        mutablePeriod9.setMonths((int) (byte) 1);
        int int18 = mutablePeriod9.getMonths();
        mutablePeriod9.setPeriod(0L);
        mutablePeriod9.setPeriod(43, (-15), 2147483614, (-999), 871, (-5211), 8, 2147483647);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test16653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16653");
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
        org.joda.time.Period period23 = period21.plusHours((int) (short) -1);
        org.joda.time.Period period25 = period21.plusSeconds(22);
        org.joda.time.Period period27 = period21.minusMillis((-9700));
        org.joda.time.Period period28 = period21.toPeriod();
        org.joda.time.Period period30 = period28.minusYears((-8));
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
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
    }

    @Test
    public void test16654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16654");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("2022-02-11T09:39:19.870Z/2022-02-11T09:39:19.870Z", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16655");
        org.joda.time.Duration duration2 = new org.joda.time.Duration(1644572469360L, 1644572685782L);
    }

    @Test
    public void test16656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16656");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((-2147483648));
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test16657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16657");
        org.joda.time.Period period4 = new org.joda.time.Period(101, (-1), 22, 3);
        org.joda.time.Period period5 = period4.toPeriod();
        org.joda.time.Duration duration8 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = duration8.toPeriodFrom(readableInstant9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.years();
        org.joda.time.Period period13 = period10.withField(durationFieldType11, (int) (byte) 100);
        org.joda.time.PeriodType periodType14 = period13.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType24);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType28);
        mutablePeriod29.setYears(0);
        mutablePeriod25.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod29);
        mutablePeriod25.addHours((int) (byte) 1);
        mutablePeriod25.setDays((int) '#');
        mutablePeriod25.add(1644572131443L);
        org.joda.time.format.PeriodFormatter periodFormatter39 = null;
        java.lang.String str40 = mutablePeriod25.toString(periodFormatter39);
        org.joda.time.Duration duration44 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration46 = duration44.plus(1644572122285L);
        long long47 = duration44.getMillis();
        long long48 = duration44.getStandardHours();
        org.joda.time.Seconds seconds49 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds51 = seconds49.multipliedBy((int) (byte) 1);
        org.joda.time.PeriodType periodType52 = seconds51.getPeriodType();
        org.joda.time.Duration duration54 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant55 = null;
        java.lang.Object obj56 = null;
        org.joda.time.Duration duration57 = new org.joda.time.Duration(obj56);
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant55, (org.joda.time.ReadableDuration) duration57);
        boolean boolean59 = duration54.isShorterThan((org.joda.time.ReadableDuration) duration57);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Interval interval61 = duration57.toIntervalTo(readableInstant60);
        org.joda.time.Interval interval62 = interval61.toInterval();
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.Period period64 = duration44.toPeriod(periodType52, chronology63);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod(1644572133852L, chronology63);
        mutablePeriod25.add((long) (-97), chronology63);
        org.joda.time.DurationField durationField67 = durationFieldType15.getField(chronology63);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((java.lang.Object) period5, periodType14, chronology63);
        org.joda.time.Period period70 = period5.plusMillis((-1));
        org.joda.time.Period period72 = period5.plusYears(2400);
        org.joda.time.Period period74 = period72.plusHours(11);
        int int75 = period72.getHours();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "P2719W36DT10H35M31.442S" + "'", str40, "P2719W36DT10H35M31.442S");
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 52L + "'", long47 == 52L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(seconds49);
        org.junit.Assert.assertNotNull(seconds51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 101 + "'", int75 == 101);
    }

    @Test
    public void test16658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16658");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(obj1);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Hours hours6 = hours4.multipliedBy(2400);
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
        org.joda.time.Duration duration34 = hours33.toStandardDuration();
        org.joda.time.Hours hours35 = hours4.minus(hours33);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours6);
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
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(hours35);
    }

    @Test
    public void test16659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16659");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("2022-02-11T09:40:48.634Z", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16660");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '4');
        org.joda.time.Minutes minutes7 = period4.toStandardMinutes();
        org.joda.time.Period period9 = period4.multipliedBy((int) (byte) 100);
        org.joda.time.Period period11 = period9.withHours((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        org.joda.time.Period period14 = period9.withField(durationFieldType12, 0);
        org.joda.time.Period period16 = period14.plusMinutes((int) (short) -1);
        org.joda.time.Period period18 = period14.withMillis(100);
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
        long long42 = dateTime40.getMillis();
        org.joda.time.Duration duration43 = period14.toDurationTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Period period45 = period14.minusDays(259);
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant49 = null;
        java.lang.Object obj50 = null;
        org.joda.time.Duration duration51 = new org.joda.time.Duration(obj50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, (org.joda.time.ReadableDuration) duration51);
        boolean boolean53 = duration48.isShorterThan((org.joda.time.ReadableDuration) duration51);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Interval interval55 = duration51.toIntervalTo(readableInstant54);
        org.joda.time.Interval interval56 = interval55.toInterval();
        org.joda.time.DateTime dateTime57 = interval56.getEnd();
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
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableInstant) dateTime68);
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
        org.joda.time.Duration duration82 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant83 = null;
        java.lang.Object obj84 = null;
        org.joda.time.Duration duration85 = new org.joda.time.Duration(obj84);
        org.joda.time.Period period86 = new org.joda.time.Period(readableInstant83, (org.joda.time.ReadableDuration) duration85);
        boolean boolean87 = duration82.isShorterThan((org.joda.time.ReadableDuration) duration85);
        org.joda.time.ReadableInstant readableInstant88 = null;
        org.joda.time.Interval interval89 = duration85.toIntervalTo(readableInstant88);
        org.joda.time.Interval interval90 = interval89.toInterval();
        org.joda.time.DateTime dateTime91 = interval90.getEnd();
        org.joda.time.Period period92 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime80, (org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.Minutes minutes93 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime68, (org.joda.time.ReadableInstant) dateTime91);
        boolean boolean94 = periodType46.equals((java.lang.Object) dateTime91);
        org.joda.time.Period period95 = period45.withPeriodType(periodType46);
        org.joda.time.PeriodType periodType96 = periodType46.withYearsRemoved();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
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
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1644572717682L + "'", long42 == 1644572717682L);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertNotNull(interval79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(interval89);
        org.junit.Assert.assertNotNull(interval90);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(minutes93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(period95);
        org.junit.Assert.assertNotNull(periodType96);
    }

    @Test
    public void test16661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16661");
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
        org.joda.time.ReadableInstant readableInstant34 = null;
        boolean boolean35 = dateTime20.isAfter(readableInstant34);
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant38 = null;
        java.lang.Object obj39 = null;
        org.joda.time.Duration duration40 = new org.joda.time.Duration(obj39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, (org.joda.time.ReadableDuration) duration40);
        boolean boolean42 = duration37.isShorterThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((java.lang.Object) duration37, periodType43, chronology44);
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        boolean boolean48 = dateTime20.isSupported(dateTimeFieldType47);
        org.joda.time.Duration duration51 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = duration51.toPeriodFrom(readableInstant52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Period period55 = duration51.toPeriod(chronology54);
        java.lang.String str56 = period55.toString();
        org.joda.time.MutablePeriod mutablePeriod57 = period55.toMutablePeriod();
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant60 = null;
        java.lang.Object obj61 = null;
        org.joda.time.Duration duration62 = new org.joda.time.Duration(obj61);
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, (org.joda.time.ReadableDuration) duration62);
        boolean boolean64 = duration59.isShorterThan((org.joda.time.ReadableDuration) duration62);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Interval interval66 = duration62.toIntervalTo(readableInstant65);
        long long67 = interval66.getStartMillis();
        mutablePeriod57.setPeriod((org.joda.time.ReadableInterval) interval66);
        org.joda.time.Duration duration69 = interval66.toDuration();
        org.joda.time.DateTime dateTime70 = interval66.getStart();
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Period period73 = period71.plusMillis(35);
        org.joda.time.Seconds seconds74 = period71.toStandardSeconds();
        org.joda.time.Period period76 = period71.plusWeeks(30);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PT0.097S" + "'", str56, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(interval66);
// flaky:         org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1644572717726L + "'", long67 == 1644572717726L);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(seconds74);
        org.junit.Assert.assertNotNull(period76);
    }

    @Test
    public void test16662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16662");
        org.joda.time.Period period1 = org.joda.time.Period.years((-44));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test16663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16663");
        org.joda.time.Period period1 = new org.joda.time.Period((-1L));
        org.joda.time.Seconds seconds2 = period1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        java.lang.Object obj6 = null;
        org.joda.time.Duration duration7 = new org.joda.time.Duration(obj6);
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration7);
        boolean boolean9 = duration4.isShorterThan((org.joda.time.ReadableDuration) duration7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Interval interval11 = duration7.toIntervalTo(readableInstant10);
        org.joda.time.Interval interval12 = interval11.toInterval();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        java.lang.Object obj16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(obj16);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration17);
        boolean boolean19 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Interval interval21 = duration17.toIntervalTo(readableInstant20);
        boolean boolean22 = interval12.isAfter((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Period period23 = interval21.toPeriod();
        org.joda.time.Period period24 = interval21.toPeriod();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) period24, chronology25);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod();
        mutablePeriod29.setPeriod(100L, (long) (-1));
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod29, periodType33);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.years();
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant40 = null;
        java.lang.Object obj41 = null;
        org.joda.time.Duration duration42 = new org.joda.time.Duration(obj41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, (org.joda.time.ReadableDuration) duration42);
        boolean boolean44 = duration39.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Interval interval46 = duration42.toIntervalTo(readableInstant45);
        org.joda.time.Interval interval47 = interval46.toInterval();
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        boolean boolean49 = durationFieldType37.isSupported(chronology48);
        mutablePeriod29.setPeriod((long) 0, (long) 8, chronology48);
        org.joda.time.Period period51 = new org.joda.time.Period(0L, 1644572148770L, chronology48);
        org.joda.time.Period period52 = period26.withFields((org.joda.time.ReadablePeriod) period51);
        int int53 = period52.getYears();
        org.joda.time.MutablePeriod mutablePeriod54 = period52.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(1644572185796L, 1644572167962L);
        org.joda.time.Period period59 = org.joda.time.Period.years((int) '4');
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.weekyears();
        int int61 = period59.indexOf(durationFieldType60);
        boolean boolean62 = mutablePeriod57.isSupported(durationFieldType60);
        boolean boolean63 = mutablePeriod54.isSupported(durationFieldType60);
        mutablePeriod54.add((long) (-97));
        boolean boolean66 = period1.equals((java.lang.Object) mutablePeriod54);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 52 + "'", int53 == 52);
        org.junit.Assert.assertNotNull(mutablePeriod54);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test16664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16664");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(0, 2, 259, (int) (byte) 10, (-2231), 26, (int) (byte) 10, (int) (short) 10);
        int int9 = mutablePeriod8.getMillis();
        int int10 = mutablePeriod8.getYears();
        org.joda.time.Period period12 = new org.joda.time.Period(1L);
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Period period15 = period12.plus((org.joda.time.ReadablePeriod) weeks14);
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks18 = weeks16.plus((int) '4');
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.weeks((int) (byte) -1);
        boolean boolean22 = weeks19.isGreaterThan(weeks21);
        org.joda.time.DurationFieldType durationFieldType23 = weeks21.getFieldType();
        boolean boolean24 = weeks16.isGreaterThan(weeks21);
        org.joda.time.Period period25 = weeks21.toPeriod();
        org.joda.time.Weeks weeks27 = weeks21.plus(30);
        org.joda.time.Weeks weeks28 = weeks14.plus(weeks27);
        org.joda.time.Weeks weeks29 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType30 = weeks29.getFieldType();
        org.joda.time.Weeks weeks32 = weeks29.plus((int) '#');
        org.joda.time.Weeks weeks33 = weeks14.plus(weeks32);
        org.joda.time.Weeks weeks34 = weeks33.negated();
        org.joda.time.DurationFieldType durationFieldType35 = weeks33.getFieldType();
        mutablePeriod8.set(durationFieldType35, (int) (short) 100);
        java.lang.String str38 = durationFieldType35.getName();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "weeks" + "'", str38, "weeks");
    }

    @Test
    public void test16665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16665");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(26);
        org.joda.time.Hours hours3 = hours1.multipliedBy(2719200);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
    }

    @Test
    public void test16666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16666");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) '4');
        long long2 = duration1.getMillis();
        org.joda.time.Minutes minutes3 = duration1.toStandardMinutes();
        java.lang.String str4 = minutes3.toString();
        org.joda.time.PeriodType periodType5 = minutes3.getPeriodType();
        org.joda.time.PeriodType periodType6 = minutes3.getPeriodType();
        java.lang.String str7 = periodType6.toString();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0M" + "'", str4, "PT0M");
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PeriodType[Minutes]" + "'", str7, "PeriodType[Minutes]");
    }

    @Test
    public void test16667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16667");
        org.joda.time.Period period1 = new org.joda.time.Period(1644572150441L);
        org.joda.time.Period period3 = period1.plusSeconds((-101));
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearMonthDayTime();
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
        org.joda.time.DateTime dateTime27 = interval26.getEnd();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime27);
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
        org.joda.time.Minutes minutes52 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime50);
        boolean boolean53 = periodType5.equals((java.lang.Object) dateTime50);
        org.joda.time.Period period54 = new org.joda.time.Period((long) 51, periodType5);
        org.joda.time.PeriodType periodType55 = periodType5.withMillisRemoved();
        org.joda.time.Period period56 = period1.normalizedStandard(periodType5);
        org.joda.time.PeriodType periodType57 = periodType5.withSecondsRemoved();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(dateTime27);
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
        org.junit.Assert.assertNotNull(minutes52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(periodType57);
    }

    @Test
    public void test16668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16668");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes3 = minutes1.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType4 = minutes3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withYearsRemoved();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', periodType4, chronology6);
        org.joda.time.Period period8 = period7.normalizedStandard();
        org.joda.time.Duration duration10 = org.joda.time.Duration.millis(1L);
        long long11 = duration10.getStandardSeconds();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant12);
        org.joda.time.Duration duration15 = duration10.plus(1644572417292L);
        org.joda.time.Duration duration17 = new org.joda.time.Duration((long) (byte) -1);
        org.joda.time.Duration duration20 = duration17.withDurationAdded(1644572216746L, (-690));
        long long21 = duration20.getStandardMinutes();
        org.joda.time.Duration duration22 = duration10.minus((org.joda.time.ReadableDuration) duration20);
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
        org.joda.time.Instant instant46 = dateTime44.toInstant();
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant46, readableInstant47);
        org.joda.time.Chronology chronology49 = instant46.getChronology();
        org.joda.time.Minutes minutes53 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes55 = minutes53.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType56 = minutes55.getPeriodType();
        org.joda.time.PeriodType periodType57 = periodType56.withYearsRemoved();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) '#', periodType56, chronology58);
        org.joda.time.PeriodType periodType60 = periodType56.withYearsRemoved();
        java.lang.String str61 = periodType56.toString();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(1644572383002L, 1644572139520L, periodType56);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, (org.joda.time.ReadableInstant) instant46, periodType56);
        boolean boolean64 = period7.equals((java.lang.Object) instant46);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-18912580492L) + "'", long21 == (-18912580492L));
        org.junit.Assert.assertNotNull(duration22);
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
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "PeriodType[Minutes]" + "'", str61, "PeriodType[Minutes]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test16669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16669");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(8);
        org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test16670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16670");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("P97WT0.001S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16671");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType3);
        mutablePeriod4.setYears(0);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration8, chronology9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration16 = duration13.minus((long) '4');
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType19 = seconds18.getFieldType();
        org.joda.time.Seconds seconds21 = seconds18.plus((-1));
        org.joda.time.Seconds seconds22 = org.joda.time.Seconds.TWO;
        java.lang.String str23 = seconds22.toString();
        org.joda.time.Seconds seconds24 = seconds21.plus(seconds22);
        mutablePeriod4.add((org.joda.time.ReadablePeriod) seconds24);
        org.joda.time.PeriodType periodType26 = seconds24.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType27 = seconds24.getFieldType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) (short) -1, 1644572122326L);
        int int32 = mutablePeriod31.getMonths();
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType39);
        mutablePeriod40.setYears(0);
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology45 = null;
        mutablePeriod40.setPeriod((org.joda.time.ReadableDuration) duration44, chronology45);
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant49 = null;
        java.lang.Object obj50 = null;
        org.joda.time.Duration duration51 = new org.joda.time.Duration(obj50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, (org.joda.time.ReadableDuration) duration51);
        boolean boolean53 = duration48.isShorterThan((org.joda.time.ReadableDuration) duration51);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Interval interval55 = duration51.toIntervalTo(readableInstant54);
        org.joda.time.Interval interval56 = interval55.toInterval();
        org.joda.time.DateTime dateTime57 = interval56.getEnd();
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
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration44, (org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period72 = duration36.toPeriodTo((org.joda.time.ReadableInstant) dateTime57, periodType71);
        org.joda.time.Chronology chronology73 = dateTime57.getChronology();
        mutablePeriod31.setPeriod(1644572166505L, (long) 222, chronology73);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((-19044L), chronology73);
        org.joda.time.DurationField durationField76 = durationFieldType27.getField(chronology73);
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod(1644572592165L, chronology73);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT2S" + "'", str23, "PT2S");
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(durationField76);
    }

    @Test
    public void test16672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16672");
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
        org.joda.time.Hours hours15 = hours13.dividedBy(100);
        java.lang.Object obj16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(obj16);
        org.joda.time.Hours hours18 = duration17.toStandardHours();
        org.joda.time.Hours hours19 = hours18.negated();
        boolean boolean20 = hours13.isGreaterThan(hours19);
        org.joda.time.Hours hours22 = hours13.minus((int) (byte) 1);
        java.lang.String str23 = hours22.toString();
        org.joda.time.PeriodType periodType24 = hours22.getPeriodType();
        org.joda.time.Duration duration25 = hours22.toStandardDuration();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT-53H" + "'", str23, "PT-53H");
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(duration25);
    }

    @Test
    public void test16673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16673");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.Days days3 = days2.negated();
        boolean boolean4 = days1.isGreaterThan(days3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        java.lang.Object obj6 = null;
        org.joda.time.Duration duration7 = new org.joda.time.Duration(obj6);
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration7);
        org.joda.time.Days days9 = duration7.toStandardDays();
        org.joda.time.Days days10 = days9.negated();
        org.joda.time.Days days11 = days3.minus(days9);
        org.joda.time.Period period12 = days3.toPeriod();
        org.joda.time.Days days13 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period15 = period12.minusSeconds(87);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test16674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16674");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) (byte) 0);
        mutablePeriod1.setValue((int) (short) 0, (int) 'a');
        org.joda.time.MutablePeriod mutablePeriod5 = mutablePeriod1.copy();
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
        org.joda.time.Hours hours22 = hours20.plus((int) '#');
        org.joda.time.DurationFieldType durationFieldType23 = hours20.getFieldType();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType26 = periodType25.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(periodType26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(10L, periodType26);
        int int29 = mutablePeriod28.getMillis();
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration37 = duration34.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration39 = duration31.withDurationAdded((org.joda.time.ReadableDuration) duration34, (int) (short) 1);
        org.joda.time.Duration duration42 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration45 = duration42.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration47 = duration31.withDurationAdded((org.joda.time.ReadableDuration) duration45, (int) (short) 100);
        mutablePeriod28.add((org.joda.time.ReadableDuration) duration47);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod();
        mutablePeriod49.setPeriod(100L, (long) (-1));
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod49, periodType53);
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.years();
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant60 = null;
        java.lang.Object obj61 = null;
        org.joda.time.Duration duration62 = new org.joda.time.Duration(obj61);
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, (org.joda.time.ReadableDuration) duration62);
        boolean boolean64 = duration59.isShorterThan((org.joda.time.ReadableDuration) duration62);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Interval interval66 = duration62.toIntervalTo(readableInstant65);
        org.joda.time.Interval interval67 = interval66.toInterval();
        org.joda.time.Chronology chronology68 = interval67.getChronology();
        boolean boolean69 = durationFieldType57.isSupported(chronology68);
        mutablePeriod49.setPeriod((long) 0, (long) 8, chronology68);
        org.joda.time.Period period71 = duration47.toPeriod(chronology68);
        boolean boolean72 = durationFieldType23.isSupported(chronology68);
        org.joda.time.PeriodType periodType76 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType77 = periodType76.withMillisRemoved();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period((long) (short) 1, periodType77, chronology78);
        java.lang.String str80 = periodType77.getName();
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
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod(1644572149549L, 1644572155612L, periodType77, chronology91);
        org.joda.time.DurationField durationField93 = durationFieldType23.getField(chronology91);
        mutablePeriod1.add(1644572253564L, chronology91);
        mutablePeriod1.setValue((int) (short) 1, 69);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(durationFieldType57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(periodType76);
        org.junit.Assert.assertNotNull(periodType77);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "MillisNoMillis" + "'", str80, "MillisNoMillis");
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(interval89);
        org.junit.Assert.assertNotNull(interval90);
        org.junit.Assert.assertNotNull(chronology91);
        org.junit.Assert.assertNotNull(durationField93);
    }

    @Test
    public void test16675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16675");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(22);
        org.joda.time.Duration duration2 = weeks1.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType3 = weeks1.getFieldType();
        org.joda.time.Weeks weeks5 = weeks1.minus(101);
        org.joda.time.Duration duration6 = weeks1.toStandardDuration();
        org.joda.time.Weeks weeks8 = weeks1.plus(46);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(weeks8);
    }

    @Test
    public void test16676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16676");
        org.joda.time.ReadableInstant readableInstant1 = null;
        java.lang.Object obj2 = null;
        org.joda.time.Duration duration3 = new org.joda.time.Duration(obj2);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.Seconds seconds5 = period4.toStandardSeconds();
        org.joda.time.Seconds seconds6 = period4.toStandardSeconds();
        org.joda.time.PeriodType periodType7 = seconds6.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        int int9 = periodType8.size();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(1644572234741L, periodType8);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test16677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16677");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period5 = period4.toPeriod();
        org.joda.time.Period period7 = period4.minusWeeks((int) (short) 100);
        org.joda.time.Period period9 = period7.plusMillis((int) (short) 100);
        org.joda.time.Hours hours10 = period9.toStandardHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(hours10);
    }

    @Test
    public void test16678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16678");
        org.joda.time.Period period8 = new org.joda.time.Period(300, (-283), 2719200, 4, 871, 53, (-34), (int) '4');
    }

    @Test
    public void test16679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16679");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((java.lang.Object) 1644572167345L);
        org.joda.time.Duration duration4 = duration1.withDurationAdded(1644572220416L, (-97));
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = duration7.toPeriodFrom(readableInstant8);
        org.joda.time.Period period11 = period9.minusSeconds((int) '4');
        org.joda.time.Period period13 = period9.minusSeconds(10);
        org.joda.time.Period period15 = period9.withWeeks((int) (byte) -1);
        org.joda.time.Seconds seconds16 = period9.toStandardSeconds();
        org.joda.time.Seconds seconds18 = seconds16.plus((-97));
        org.joda.time.Seconds seconds20 = seconds16.multipliedBy(52);
        org.joda.time.Duration duration21 = seconds16.toStandardDuration();
        org.joda.time.Duration duration22 = duration21.toDuration();
        org.joda.time.Duration duration24 = duration4.withDurationAdded((org.joda.time.ReadableDuration) duration21, (-9700));
        long long25 = duration4.getStandardSeconds();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-157878933213L) + "'", long25 == (-157878933213L));
    }

    @Test
    public void test16680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16680");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 0, chronology2);
        mutablePeriod3.setDays((int) (short) 0);
        java.lang.Object obj6 = mutablePeriod3.clone();
        mutablePeriod3.addMillis((int) (short) 0);
        mutablePeriod3.addHours((-690));
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = mutablePeriod3.getFieldTypes();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.forFields(durationFieldTypeArray11);
        org.joda.time.PeriodType periodType13 = periodType12.withMonthsRemoved();
        org.joda.time.PeriodType periodType14 = periodType12.withHoursRemoved();
        org.joda.time.Chronology chronology15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object) "PeriodType[YearWeekDay]", periodType14, chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[YearWeekDay]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "PT-690H");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "PT-690H");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "PT-690H");
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test16681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16681");
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
        org.joda.time.Interval interval32 = interval9.toInterval();
        org.joda.time.DateTime dateTime33 = interval32.getEnd();
        org.joda.time.Duration duration34 = interval32.toDuration();
        org.joda.time.Hours hours35 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval32);
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
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(hours35);
    }

    @Test
    public void test16682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16682");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.Days days3 = days2.negated();
        boolean boolean4 = days1.isGreaterThan(days3);
        org.joda.time.Days days6 = days3.plus((-8));
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days6);
    }

    @Test
    public void test16683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16683");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType2);
        mutablePeriod3.addMillis((-1));
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        java.lang.Object obj9 = null;
        org.joda.time.Duration duration10 = new org.joda.time.Duration(obj9);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration10);
        boolean boolean12 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Interval interval14 = duration10.toIntervalTo(readableInstant13);
        org.joda.time.Interval interval15 = interval14.toInterval();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        java.lang.Object obj19 = null;
        org.joda.time.Duration duration20 = new org.joda.time.Duration(obj19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration20);
        boolean boolean22 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Interval interval24 = duration20.toIntervalTo(readableInstant23);
        boolean boolean25 = interval15.isAfter((org.joda.time.ReadableInterval) interval24);
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval24);
        org.joda.time.Period period27 = interval24.toPeriod();
        mutablePeriod3.add((org.joda.time.ReadableInterval) interval24);
        org.joda.time.DateTime dateTime29 = interval24.getStart();
        long long30 = interval24.getStartMillis();
        org.joda.time.Period period35 = new org.joda.time.Period(52, (int) (short) -1, (int) ' ', 22);
        boolean boolean36 = interval24.equals((java.lang.Object) 22);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1644572718080L + "'", long30 == 1644572718080L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test16684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16684");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) 'a');
        org.joda.time.Duration duration2 = seconds1.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType3 = seconds1.getFieldType();
        int int4 = seconds1.getSeconds();
        org.joda.time.Period period5 = seconds1.toPeriod();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test16685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16685");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(1644572146961L);
        org.joda.time.Duration duration3 = org.joda.time.Duration.millis(1644572192768L);
        boolean boolean4 = duration1.isEqual((org.joda.time.ReadableDuration) duration3);
        long long5 = duration3.getStandardSeconds();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1644572192L + "'", long5 == 1644572192L);
    }

    @Test
    public void test16686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16686");
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes4 = minutes2.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType5 = minutes4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withYearsRemoved();
        int int7 = periodType5.size();
        org.joda.time.PeriodType periodType8 = periodType5.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(1644572300772L, 0L, periodType5);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.setSeconds((-456825));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test16687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16687");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType1 = seconds0.getFieldType();
        org.joda.time.Seconds seconds3 = seconds0.plus((-1));
        org.joda.time.DurationFieldType durationFieldType4 = seconds0.getFieldType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus((-1));
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        java.lang.String str11 = seconds10.toString();
        org.joda.time.Seconds seconds12 = seconds9.plus(seconds10);
        org.joda.time.Seconds seconds13 = seconds5.minus(seconds10);
        org.joda.time.Seconds seconds14 = seconds0.plus(seconds5);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.secondsIn(readableInterval15);
        org.joda.time.Seconds seconds17 = seconds0.plus(seconds16);
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds20 = seconds18.multipliedBy((int) (byte) 1);
        java.lang.String str21 = seconds18.toString();
        org.joda.time.Seconds seconds22 = seconds16.plus(seconds18);
        org.joda.time.Seconds seconds23 = seconds18.negated();
        java.lang.String str24 = seconds18.toString();
        org.joda.time.Seconds seconds26 = seconds18.multipliedBy(8);
        int int27 = seconds26.size();
        org.joda.time.Seconds seconds29 = seconds26.dividedBy((-59));
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT2S" + "'", str11, "PT2S");
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT3S" + "'", str21, "PT3S");
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT3S" + "'", str24, "PT3S");
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(seconds29);
    }

    @Test
    public void test16688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16688");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) '4');
        long long2 = duration1.getMillis();
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
        org.joda.time.DateTime dateTime24 = interval23.getEnd();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Duration duration28 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = duration28.toPeriodFrom(readableInstant29);
        org.joda.time.Duration duration32 = duration28.plus((-1L));
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableDuration) duration28);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        boolean boolean35 = dateTime13.isSupported(dateTimeFieldType34);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime13.getZone();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod();
        mutablePeriod38.setPeriod(100L, (long) (-1));
        int int42 = mutablePeriod38.getDays();
        org.joda.time.MutablePeriod mutablePeriod43 = mutablePeriod38.toMutablePeriod();
        mutablePeriod43.setSeconds(8);
        int int46 = mutablePeriod43.getSeconds();
        mutablePeriod37.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod43);
        mutablePeriod43.setMillis(0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
    }

    @Test
    public void test16689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16689");
        org.joda.time.Period period1 = new org.joda.time.Period(1L);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Period period4 = period1.plus((org.joda.time.ReadablePeriod) weeks3);
        org.joda.time.DurationFieldType durationFieldType5 = weeks3.getFieldType();
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test16690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16690");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes2 = minutes0.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType3 = minutes2.getPeriodType();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.ZERO;
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) minutes4);
        boolean boolean6 = minutes2.isGreaterThan(minutes4);
        org.joda.time.Period period7 = minutes2.toPeriod();
        org.joda.time.Period period9 = period7.minusYears((int) ' ');
        org.joda.time.Period period11 = period9.withSeconds(36);
        org.joda.time.PeriodType periodType12 = period9.getPeriodType();
        org.joda.time.Period period14 = period9.minusWeeks(33);
        org.joda.time.Period period16 = period9.minusSeconds((-35));
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test16691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16691");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType1 = seconds0.getFieldType();
        org.joda.time.Seconds seconds3 = seconds0.plus((-1));
        org.joda.time.DurationFieldType durationFieldType4 = seconds0.getFieldType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus((-1));
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        java.lang.String str11 = seconds10.toString();
        org.joda.time.Seconds seconds12 = seconds9.plus(seconds10);
        org.joda.time.Seconds seconds13 = seconds5.minus(seconds10);
        org.joda.time.Seconds seconds14 = seconds0.plus(seconds5);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.secondsIn(readableInterval15);
        org.joda.time.Seconds seconds17 = seconds0.plus(seconds16);
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds20 = seconds18.multipliedBy((int) (byte) 1);
        java.lang.String str21 = seconds18.toString();
        org.joda.time.Seconds seconds22 = seconds16.plus(seconds18);
        org.joda.time.Seconds seconds23 = seconds18.negated();
        org.joda.time.PeriodType periodType24 = seconds23.getPeriodType();
        org.joda.time.PeriodType periodType25 = seconds23.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod26 = seconds23.toMutablePeriod();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT2S" + "'", str11, "PT2S");
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT3S" + "'", str21, "PT3S");
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(mutablePeriod26);
    }

    @Test
    public void test16692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16692");
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
        long long14 = duration4.getStandardDays();
        org.joda.time.Duration duration16 = new org.joda.time.Duration(0L);
        int int17 = duration4.compareTo((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Period period19 = new org.joda.time.Period(1644572133852L);
        org.joda.time.Period period20 = period19.negated();
        org.joda.time.Minutes minutes21 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.minutes(5);
        org.joda.time.Minutes minutes25 = minutes23.dividedBy((int) (short) 10);
        org.joda.time.Minutes minutes26 = minutes21.minus(minutes25);
        org.joda.time.Minutes minutes27 = minutes26.negated();
        boolean boolean28 = duration16.equals((java.lang.Object) minutes27);
        org.joda.time.Period period30 = org.joda.time.Period.years((int) (short) 0);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) ' ', chronology32);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType36);
        mutablePeriod37.setYears(0);
        org.joda.time.Duration duration41 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology42 = null;
        mutablePeriod37.setPeriod((org.joda.time.ReadableDuration) duration41, chronology42);
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
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration41, (org.joda.time.ReadableInstant) dateTime54);
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
        org.joda.time.PeriodType periodType80 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType81 = periodType80.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(periodType81);
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod(10L, periodType81);
        org.joda.time.Period period84 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime54, (org.joda.time.ReadableInstant) dateTime78, periodType81);
        org.joda.time.Duration duration85 = mutablePeriod33.toDurationFrom((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1);
        org.joda.time.DurationFieldType durationFieldType90 = mutablePeriod88.getFieldType(1);
        boolean boolean91 = mutablePeriod33.isSupported(durationFieldType90);
        int int92 = period30.get(durationFieldType90);
        java.lang.String str93 = durationFieldType90.getName();
        boolean boolean94 = minutes27.isSupported(durationFieldType90);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertNotNull(periodType81);
        org.junit.Assert.assertNotNull(duration85);
        org.junit.Assert.assertNotNull(durationFieldType90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "months" + "'", str93, "months");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test16693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16693");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '4');
        org.joda.time.Minutes minutes7 = period4.toStandardMinutes();
        org.joda.time.Period period9 = period4.multipliedBy((int) (byte) 100);
        org.joda.time.Period period11 = period9.withHours((int) (short) 0);
        org.joda.time.Period period13 = period11.withMonths(10);
        org.joda.time.Period period15 = period11.plusHours((int) (short) 10);
        org.joda.time.Period period17 = period11.minusMonths((-1440));
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.Period period19 = period11.minus(readablePeriod18);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test16694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16694");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) 1);
        org.joda.time.Period period3 = period1.plusMillis((-10));
        org.joda.time.Period period5 = period1.withMonths((-6));
        org.joda.time.Period period6 = period1.normalizedStandard();
        int int7 = period1.getDays();
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds10 = seconds8.multipliedBy((int) (byte) 1);
        java.lang.String str11 = seconds8.toString();
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.MAX_VALUE;
        org.joda.time.Seconds seconds13 = seconds8.minus(seconds12);
        org.joda.time.Seconds seconds15 = seconds12.minus((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod16 = seconds12.toMutablePeriod();
        boolean boolean17 = period1.equals((java.lang.Object) mutablePeriod16);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT3S" + "'", str11, "PT3S");
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16695");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration5 = duration2.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Minutes minutes6 = duration5.toStandardMinutes();
        org.joda.time.Duration duration8 = org.joda.time.Duration.millis((long) '4');
        long long9 = duration8.getMillis();
        org.joda.time.Minutes minutes10 = duration8.toStandardMinutes();
        org.joda.time.Minutes minutes11 = minutes10.negated();
        boolean boolean12 = minutes6.isGreaterThan(minutes11);
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes14 = minutes13.negated();
        org.joda.time.Minutes minutes15 = minutes11.minus(minutes14);
        org.joda.time.Minutes minutes17 = minutes14.minus((int) 'a');
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes20 = minutes18.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType21 = minutes20.getPeriodType();
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.ZERO;
        org.joda.time.Period period23 = new org.joda.time.Period((java.lang.Object) minutes22);
        boolean boolean24 = minutes20.isGreaterThan(minutes22);
        int int25 = minutes20.size();
        boolean boolean26 = minutes17.isGreaterThan(minutes20);
        org.joda.time.Minutes minutes28 = minutes17.minus(802);
        org.joda.time.PeriodType periodType29 = minutes28.getPeriodType();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test16696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16696");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearDayTime();
        int int1 = periodType0.size();
        org.joda.time.PeriodType periodType2 = periodType0.withDaysRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test16697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16697");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(1644572440694L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = duration1.toPeriodFrom(readableInstant2);
        int int4 = period3.getMonths();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test16698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16698");
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
        org.joda.time.Interval interval32 = interval9.toInterval();
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant35 = null;
        java.lang.Object obj36 = null;
        org.joda.time.Duration duration37 = new org.joda.time.Duration(obj36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant35, (org.joda.time.ReadableDuration) duration37);
        boolean boolean39 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration37);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Interval interval41 = duration37.toIntervalTo(readableInstant40);
        org.joda.time.Interval interval42 = interval41.toInterval();
        org.joda.time.Duration duration44 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant45 = null;
        java.lang.Object obj46 = null;
        org.joda.time.Duration duration47 = new org.joda.time.Duration(obj46);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, (org.joda.time.ReadableDuration) duration47);
        boolean boolean49 = duration44.isShorterThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Interval interval51 = duration47.toIntervalTo(readableInstant50);
        boolean boolean52 = interval42.isAfter((org.joda.time.ReadableInterval) interval51);
        long long53 = interval51.toDurationMillis();
        org.joda.time.Interval interval54 = interval51.toInterval();
        org.joda.time.DateTime dateTime55 = interval51.getEnd();
        boolean boolean56 = interval32.isAfter((org.joda.time.ReadableInterval) interval51);
        org.joda.time.MutableInterval mutableInterval57 = interval32.toMutableInterval();
        org.joda.time.Weeks weeks58 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval32);
        org.joda.time.Duration duration60 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant61 = null;
        java.lang.Object obj62 = null;
        org.joda.time.Duration duration63 = new org.joda.time.Duration(obj62);
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, (org.joda.time.ReadableDuration) duration63);
        boolean boolean65 = duration60.isShorterThan((org.joda.time.ReadableDuration) duration63);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Interval interval67 = duration63.toIntervalTo(readableInstant66);
        org.joda.time.Interval interval68 = interval67.toInterval();
        org.joda.time.Duration duration70 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant71 = null;
        java.lang.Object obj72 = null;
        org.joda.time.Duration duration73 = new org.joda.time.Duration(obj72);
        org.joda.time.Period period74 = new org.joda.time.Period(readableInstant71, (org.joda.time.ReadableDuration) duration73);
        boolean boolean75 = duration70.isShorterThan((org.joda.time.ReadableDuration) duration73);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Interval interval77 = duration73.toIntervalTo(readableInstant76);
        boolean boolean78 = interval68.isAfter((org.joda.time.ReadableInterval) interval77);
        org.joda.time.Period period79 = interval77.toPeriod();
        org.joda.time.DateTime dateTime80 = interval77.getStart();
        org.joda.time.MutableInterval mutableInterval81 = interval77.toMutableInterval();
        org.joda.time.DateTime dateTime82 = interval77.getStart();
        org.joda.time.Duration duration84 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration86 = duration84.plus(1644572122285L);
        long long87 = duration84.getMillis();
        long long88 = duration84.getStandardHours();
        org.joda.time.Duration duration90 = org.joda.time.Duration.standardHours(1644572124065L);
        boolean boolean91 = duration84.isLongerThan((org.joda.time.ReadableDuration) duration90);
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime82, (org.joda.time.ReadableDuration) duration84);
        boolean boolean93 = interval32.isAfter((org.joda.time.ReadableInstant) dateTime82);
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
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(mutableInterval57);
        org.junit.Assert.assertNotNull(weeks58);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(mutableInterval81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(duration84);
        org.junit.Assert.assertNotNull(duration86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 52L + "'", long87 == 52L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertNotNull(duration90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test16699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16699");
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
        org.joda.time.ReadableInstant readableInstant34 = null;
        boolean boolean35 = dateTime20.isAfter(readableInstant34);
        org.joda.time.Duration duration37 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant38 = null;
        java.lang.Object obj39 = null;
        org.joda.time.Duration duration40 = new org.joda.time.Duration(obj39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, (org.joda.time.ReadableDuration) duration40);
        boolean boolean42 = duration37.isShorterThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((java.lang.Object) duration37, periodType43, chronology44);
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        boolean boolean48 = dateTime20.isSupported(dateTimeFieldType47);
        org.joda.time.Duration duration51 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = duration51.toPeriodFrom(readableInstant52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Period period55 = duration51.toPeriod(chronology54);
        java.lang.String str56 = period55.toString();
        org.joda.time.MutablePeriod mutablePeriod57 = period55.toMutablePeriod();
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant60 = null;
        java.lang.Object obj61 = null;
        org.joda.time.Duration duration62 = new org.joda.time.Duration(obj61);
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, (org.joda.time.ReadableDuration) duration62);
        boolean boolean64 = duration59.isShorterThan((org.joda.time.ReadableDuration) duration62);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Interval interval66 = duration62.toIntervalTo(readableInstant65);
        long long67 = interval66.getStartMillis();
        mutablePeriod57.setPeriod((org.joda.time.ReadableInterval) interval66);
        org.joda.time.Duration duration69 = interval66.toDuration();
        org.joda.time.DateTime dateTime70 = interval66.getStart();
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Instant instant72 = dateTime70.toInstant();
        long long73 = instant72.getMillis();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PT0.097S" + "'", str56, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(interval66);
// flaky:         org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1644572718344L + "'", long67 == 1644572718344L);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(instant72);
// flaky:         org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1644572718344L + "'", long73 == 1644572718344L);
    }

    @Test
    public void test16700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16700");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType2);
        mutablePeriod3.addMillis((-1));
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        java.lang.Object obj9 = null;
        org.joda.time.Duration duration10 = new org.joda.time.Duration(obj9);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration10);
        boolean boolean12 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Interval interval14 = duration10.toIntervalTo(readableInstant13);
        org.joda.time.Interval interval15 = interval14.toInterval();
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        java.lang.Object obj19 = null;
        org.joda.time.Duration duration20 = new org.joda.time.Duration(obj19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration20);
        boolean boolean22 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Interval interval24 = duration20.toIntervalTo(readableInstant23);
        boolean boolean25 = interval15.isAfter((org.joda.time.ReadableInterval) interval24);
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval24);
        org.joda.time.Period period27 = interval24.toPeriod();
        mutablePeriod3.add((org.joda.time.ReadableInterval) interval24);
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.standard();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) (short) 100, (-1L), periodType31);
        org.joda.time.format.PeriodFormatter periodFormatter33 = null;
        java.lang.String str34 = mutablePeriod32.toString(periodFormatter33);
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant37 = null;
        java.lang.Object obj38 = null;
        org.joda.time.Duration duration39 = new org.joda.time.Duration(obj38);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant37, (org.joda.time.ReadableDuration) duration39);
        boolean boolean41 = duration36.isShorterThan((org.joda.time.ReadableDuration) duration39);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Interval interval43 = duration39.toIntervalTo(readableInstant42);
        org.joda.time.Interval interval44 = interval43.toInterval();
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant47 = null;
        java.lang.Object obj48 = null;
        org.joda.time.Duration duration49 = new org.joda.time.Duration(obj48);
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, (org.joda.time.ReadableDuration) duration49);
        boolean boolean51 = duration46.isShorterThan((org.joda.time.ReadableDuration) duration49);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Interval interval53 = duration49.toIntervalTo(readableInstant52);
        org.joda.time.Interval interval54 = interval53.toInterval();
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant57 = null;
        java.lang.Object obj58 = null;
        org.joda.time.Duration duration59 = new org.joda.time.Duration(obj58);
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant57, (org.joda.time.ReadableDuration) duration59);
        boolean boolean61 = duration56.isShorterThan((org.joda.time.ReadableDuration) duration59);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Interval interval63 = duration59.toIntervalTo(readableInstant62);
        boolean boolean64 = interval54.isAfter((org.joda.time.ReadableInterval) interval63);
        org.joda.time.Period period65 = interval63.toPeriod();
        boolean boolean66 = interval44.isBefore((org.joda.time.ReadableInterval) interval63);
        org.joda.time.Interval interval67 = interval44.toInterval();
        mutablePeriod32.add((org.joda.time.ReadableInterval) interval44);
        long long69 = interval44.getStartMillis();
        org.joda.time.DateTime dateTime70 = interval44.getEnd();
        boolean boolean71 = interval24.contains((org.joda.time.ReadableInterval) interval44);
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.Period period73 = interval44.toPeriod(periodType72);
        long long74 = interval44.getStartMillis();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT0.101S" + "'", str34, "PT0.101S");
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(interval67);
// flaky:         org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1644572718371L + "'", long69 == 1644572718371L);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(period73);
// flaky:         org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1644572718371L + "'", long74 == 1644572718371L);
    }

    @Test
    public void test16701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16701");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        org.joda.time.Period period8 = period6.withYears((int) (byte) 10);
        org.joda.time.Period period10 = period6.withMillis(22);
        org.joda.time.Period period12 = org.joda.time.Period.years((int) (short) 0);
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
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) (byte) 100, (long) 1);
        org.joda.time.DurationFieldType durationFieldType72 = mutablePeriod70.getFieldType(1);
        boolean boolean73 = mutablePeriod15.isSupported(durationFieldType72);
        int int74 = period12.get(durationFieldType72);
        org.joda.time.Duration duration77 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Period period79 = duration77.toPeriodFrom(readableInstant78);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.Period period81 = duration77.toPeriod(chronology80);
        org.joda.time.Period period83 = period81.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval84 = null;
        org.joda.time.Hours hours85 = org.joda.time.Hours.hoursIn(readableInterval84);
        org.joda.time.Period period86 = period83.minus((org.joda.time.ReadablePeriod) hours85);
        org.joda.time.Hours hours87 = hours85.negated();
        org.joda.time.DurationFieldType durationFieldType88 = hours85.getFieldType();
        org.joda.time.Period period90 = period12.withField(durationFieldType88, 0);
        int int91 = period6.get(durationFieldType88);
        org.joda.time.Period period93 = period6.plusDays((-229));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
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
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(hours85);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(hours87);
        org.junit.Assert.assertNotNull(durationFieldType88);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(period93);
    }

    @Test
    public void test16702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16702");
        org.joda.time.Period period1 = org.joda.time.Period.months(149);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test16703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16703");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(1644572126858L);
        long long2 = duration1.getStandardDays();
        org.joda.time.Duration duration4 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Duration duration6 = duration4.plus(1644572122285L);
        long long7 = duration4.getMillis();
        long long8 = duration4.getStandardHours();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours(1644572124065L);
        boolean boolean11 = duration4.isLongerThan((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration4.plus((long) 1);
        boolean boolean14 = duration1.isEqual((org.joda.time.ReadableDuration) duration4);
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
        mutablePeriod18.addMonths((int) ' ');
        org.joda.time.Duration duration37 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration40 = duration37.withDurationAdded((long) (byte) 100, 10);
        mutablePeriod18.setPeriod((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration43 = duration40.plus(1644572264237L);
        org.joda.time.Duration duration45 = org.joda.time.Duration.millis(1644572293397L);
        boolean boolean46 = duration43.isShorterThan((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Duration duration48 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration45, (-42));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19034L + "'", long2 == 19034L);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(duration48);
    }

    @Test
    public void test16704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16704");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("2022-02-11T09:38:58.994Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:38:58.994Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16705");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(164457249783893L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 164457249783893 * 3600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16706");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.Days days3 = days2.negated();
        boolean boolean4 = days1.isGreaterThan(days3);
        org.joda.time.Days days6 = days3.minus((int) (short) -1);
        org.joda.time.Days days8 = days6.minus(100);
        org.joda.time.Days days10 = days6.plus(101);
        org.joda.time.Days days11 = org.joda.time.Days.ONE;
        org.joda.time.Days days12 = days11.negated();
        org.joda.time.Days days13 = org.joda.time.Days.ONE;
        org.joda.time.Days days14 = days13.negated();
        boolean boolean15 = days12.isGreaterThan(days14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        java.lang.Object obj17 = null;
        org.joda.time.Duration duration18 = new org.joda.time.Duration(obj17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration18);
        org.joda.time.Days days20 = duration18.toStandardDays();
        org.joda.time.Days days21 = days20.negated();
        org.joda.time.Days days22 = days14.minus(days20);
        boolean boolean23 = days10.isLessThan(days14);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test16707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16707");
        org.joda.time.Period period2 = new org.joda.time.Period((-1L), 1644572452427L);
    }

    @Test
    public void test16708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16708");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks2 = weeks0.minus(weeks1);
        org.joda.time.Weeks weeks4 = weeks2.multipliedBy(100);
        org.joda.time.Duration duration5 = weeks4.toStandardDuration();
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks8 = weeks6.minus(weeks7);
        org.joda.time.Weeks weeks10 = weeks8.multipliedBy(100);
        org.joda.time.Weeks weeks12 = weeks8.multipliedBy((int) (short) -1);
        org.joda.time.Weeks weeks13 = weeks4.minus(weeks8);
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = duration16.toPeriodFrom(readableInstant17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = duration16.toPeriod(chronology19);
        org.joda.time.Period period22 = period20.withYears((int) (byte) 10);
        org.joda.time.Period period23 = period20.toPeriod();
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Period period26 = period23.withField(durationFieldType24, (-9700));
        org.joda.time.Period period28 = period23.multipliedBy(100);
        org.joda.time.Period period30 = period28.minusMinutes(22);
        org.joda.time.DurationFieldType durationFieldType32 = period30.getFieldType((int) (byte) 1);
        java.lang.String str33 = durationFieldType32.toString();
        int int34 = weeks4.get(durationFieldType32);
        java.lang.String str35 = durationFieldType32.toString();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "months" + "'", str33, "months");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "months" + "'", str35, "months");
    }

    @Test
    public void test16709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16709");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType1 = seconds0.getFieldType();
        org.joda.time.Seconds seconds3 = seconds0.plus((-1));
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        java.lang.String str5 = seconds4.toString();
        org.joda.time.Seconds seconds6 = seconds3.plus(seconds4);
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType9 = seconds8.getFieldType();
        org.joda.time.Seconds seconds11 = seconds8.plus((-1));
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.TWO;
        java.lang.String str13 = seconds12.toString();
        org.joda.time.Seconds seconds14 = seconds11.plus(seconds12);
        org.joda.time.Seconds seconds15 = seconds7.minus(seconds12);
        org.joda.time.Seconds seconds17 = seconds15.multipliedBy((int) (byte) -1);
        org.joda.time.Seconds seconds19 = seconds17.minus(3);
        org.joda.time.Seconds seconds20 = seconds3.plus(seconds19);
        org.joda.time.MutablePeriod mutablePeriod21 = seconds20.toMutablePeriod();
        int int22 = mutablePeriod21.getMinutes();
        org.joda.time.DurationFieldType[] durationFieldTypeArray23 = mutablePeriod21.getFieldTypes();
        mutablePeriod21.addYears((-830));
        mutablePeriod21.setPeriod(27409535904L);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT2S" + "'", str5, "PT2S");
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT2S" + "'", str13, "PT2S");
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray23);
    }

    @Test
    public void test16710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16710");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        java.lang.Object obj3 = null;
        org.joda.time.Duration duration4 = new org.joda.time.Duration(obj3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        boolean boolean6 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardHours((long) (byte) 100);
        long long9 = duration8.getStandardSeconds();
        boolean boolean10 = duration4.isEqual((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Interval interval12 = duration8.toIntervalFrom(readableInstant11);
        org.joda.time.Hours hours13 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval12);
        java.lang.Object obj14 = null;
        org.joda.time.Duration duration15 = new org.joda.time.Duration(obj14);
        org.joda.time.Hours hours16 = duration15.toStandardHours();
        org.joda.time.Hours hours18 = hours16.dividedBy(52);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.Hours hours20 = org.joda.time.Hours.hoursIn(readableInterval19);
        org.joda.time.Hours hours22 = hours20.minus((int) (byte) 100);
        org.joda.time.Hours hours24 = hours20.minus((int) (short) 1);
        java.lang.String str25 = hours20.toString();
        org.joda.time.Hours hours26 = hours20.negated();
        boolean boolean27 = hours16.isGreaterThan(hours20);
        org.joda.time.Hours hours28 = hours13.minus(hours20);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 360000L + "'", long9 == 360000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT0H" + "'", str25, "PT0H");
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(hours28);
    }

    @Test
    public void test16711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16711");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.Period period5 = period3.minusMillis(0);
        org.joda.time.Period period7 = period3.minusHours((int) '4');
        int int8 = period7.getMillis();
        org.joda.time.Period period10 = period7.plusDays((int) (byte) 0);
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
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Weeks weeks34 = period33.toStandardWeeks();
        org.joda.time.Weeks weeks35 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks37 = weeks35.plus((int) '4');
        org.joda.time.Weeks weeks38 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.weeks((int) (byte) -1);
        boolean boolean41 = weeks38.isGreaterThan(weeks40);
        org.joda.time.DurationFieldType durationFieldType42 = weeks40.getFieldType();
        boolean boolean43 = weeks35.isGreaterThan(weeks40);
        boolean boolean44 = weeks34.isGreaterThan(weeks40);
        org.joda.time.Weeks weeks46 = weeks34.minus(8);
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant49 = null;
        java.lang.Object obj50 = null;
        org.joda.time.Duration duration51 = new org.joda.time.Duration(obj50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, (org.joda.time.ReadableDuration) duration51);
        boolean boolean53 = duration48.isShorterThan((org.joda.time.ReadableDuration) duration51);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Interval interval55 = duration51.toIntervalTo(readableInstant54);
        org.joda.time.Interval interval56 = interval55.toInterval();
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        org.joda.time.Weeks weeks58 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval56);
        int int59 = weeks58.getWeeks();
        org.joda.time.Weeks weeks60 = weeks46.minus(weeks58);
        org.joda.time.Weeks weeks61 = weeks60.negated();
        org.joda.time.Period period62 = period7.minus((org.joda.time.ReadablePeriod) weeks60);
        org.joda.time.Period period64 = period62.plusMonths((int) (byte) 10);
        org.joda.time.Period period66 = period62.minusYears(0);
        org.joda.time.Period period68 = period62.plusMonths(23);
        int int69 = period68.getSeconds();
        int int70 = period68.size();
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(weeks46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(weeks58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(weeks60);
        org.junit.Assert.assertNotNull(weeks61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 8 + "'", int70 == 8);
    }

    @Test
    public void test16712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16712");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(1644572386960L, 1644572295391L);
    }

    @Test
    public void test16713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16713");
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds5 = seconds3.multipliedBy((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType6 = seconds3.getFieldType();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds((long) 23);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableDuration readableDuration16 = null;
        boolean boolean17 = duration13.isLongerThan(readableDuration16);
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        java.lang.Object obj21 = null;
        org.joda.time.Duration duration22 = new org.joda.time.Duration(obj21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration22);
        boolean boolean24 = duration19.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((java.lang.Object) duration19, periodType25, chronology26);
        org.joda.time.PeriodType periodType28 = periodType25.withMonthsRemoved();
        org.joda.time.PeriodType periodType29 = periodType28.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(periodType28);
        int int31 = periodType28.size();
        org.joda.time.Duration duration34 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Period period35 = duration34.toPeriod();
        org.joda.time.Period period37 = period35.plusMillis((int) (byte) 0);
        org.joda.time.Seconds seconds38 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType39 = seconds38.getFieldType();
        org.joda.time.Chronology chronology40 = null;
        boolean boolean41 = durationFieldType39.isSupported(chronology40);
        org.joda.time.Period period43 = period37.withField(durationFieldType39, 100);
        org.joda.time.Seconds seconds44 = period43.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology46 = null;
        boolean boolean47 = durationFieldType45.isSupported(chronology46);
        int int48 = period43.get(durationFieldType45);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType51 = periodType50.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(periodType51);
        org.joda.time.DurationFieldType durationFieldType53 = org.joda.time.DurationFieldType.eras();
        int int54 = periodType51.indexOf(durationFieldType53);
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant57 = null;
        java.lang.Object obj58 = null;
        org.joda.time.Duration duration59 = new org.joda.time.Duration(obj58);
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant57, (org.joda.time.ReadableDuration) duration59);
        boolean boolean61 = duration56.isShorterThan((org.joda.time.ReadableDuration) duration59);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Interval interval63 = duration59.toIntervalTo(readableInstant62);
        org.joda.time.Interval interval64 = interval63.toInterval();
        org.joda.time.Chronology chronology65 = interval64.getChronology();
        org.joda.time.Period period66 = new org.joda.time.Period((long) 1, periodType51, chronology65);
        org.joda.time.DurationField durationField67 = durationFieldType45.getField(chronology65);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(1644572184190L, chronology65);
        org.joda.time.Period period69 = duration13.toPeriod(periodType28, chronology65);
        java.lang.String str70 = periodType28.toString();
        org.joda.time.PeriodType periodType74 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType75 = periodType74.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(periodType75);
        org.joda.time.DurationFieldType durationFieldType77 = org.joda.time.DurationFieldType.eras();
        int int78 = periodType75.indexOf(durationFieldType77);
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
        org.joda.time.Period period90 = new org.joda.time.Period((long) 1, periodType75, chronology89);
        org.joda.time.Period period91 = new org.joda.time.Period(1644572171365L, 1644572147317L, chronology89);
        org.joda.time.Period period92 = duration8.toPeriod(periodType28, chronology89);
        org.joda.time.DurationField durationField93 = durationFieldType6.getField(chronology89);
        org.joda.time.Period period94 = new org.joda.time.Period(1644572264012L, 19034399L, chronology89);
        org.joda.time.Period period95 = new org.joda.time.Period(1644572461971L, chronology89);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "PeriodType[Millis]" + "'", str70, "PeriodType[Millis]");
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertNotNull(durationFieldType77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(interval87);
        org.junit.Assert.assertNotNull(interval88);
        org.junit.Assert.assertNotNull(chronology89);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(durationField93);
    }

    @Test
    public void test16714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16714");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '4');
        org.joda.time.Minutes minutes7 = period4.toStandardMinutes();
        org.joda.time.Period period9 = period4.multipliedBy((int) (byte) 100);
        org.joda.time.Period period11 = period9.withHours((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        org.joda.time.Period period14 = period9.withField(durationFieldType12, 0);
        org.joda.time.Period period16 = period9.plusSeconds(300);
        org.joda.time.Period period18 = period9.withDays((-41297762));
        org.joda.time.Period period19 = period9.normalizedStandard();
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.Minutes minutes21 = org.joda.time.Minutes.minutesIn(readableInterval20);
        java.lang.String str22 = minutes21.toString();
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes25 = minutes23.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType26 = minutes25.getPeriodType();
        org.joda.time.PeriodType periodType27 = periodType26.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.eras();
        boolean boolean29 = periodType26.isSupported(durationFieldType28);
        int int30 = minutes21.get(durationFieldType28);
        org.joda.time.Minutes minutes31 = null;
        boolean boolean32 = minutes21.isLessThan(minutes31);
        org.joda.time.Minutes minutes34 = minutes21.multipliedBy((int) (byte) 10);
        org.joda.time.Minutes minutes36 = minutes21.plus((-10));
        org.joda.time.DurationFieldType durationFieldType37 = minutes36.getFieldType();
        int int38 = period19.indexOf(durationFieldType37);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT0M" + "'", str22, "PT0M");
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
    }

    @Test
    public void test16715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16715");
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
        org.joda.time.DateTime dateTime21 = interval18.getStart();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime21.getZone();
        org.joda.time.Duration duration25 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = duration25.toPeriodFrom(readableInstant26);
        org.joda.time.Period period29 = period27.minusSeconds((int) '4');
        org.joda.time.Minutes minutes30 = period27.toStandardMinutes();
        org.joda.time.Period period32 = period27.multipliedBy((int) (byte) 100);
        org.joda.time.Period period34 = period32.withHours((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.months();
        org.joda.time.Period period37 = period32.withField(durationFieldType35, 0);
        org.joda.time.Period period39 = period37.plusMinutes((int) (short) -1);
        org.joda.time.Period period41 = period37.withMillis(100);
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant44 = null;
        java.lang.Object obj45 = null;
        org.joda.time.Duration duration46 = new org.joda.time.Duration(obj45);
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, (org.joda.time.ReadableDuration) duration46);
        boolean boolean48 = duration43.isShorterThan((org.joda.time.ReadableDuration) duration46);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Interval interval50 = duration46.toIntervalTo(readableInstant49);
        org.joda.time.Interval interval51 = interval50.toInterval();
        org.joda.time.DateTime dateTime52 = interval51.getEnd();
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
        org.joda.time.Period period64 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime52, (org.joda.time.ReadableInstant) dateTime63);
        long long65 = dateTime63.getMillis();
        org.joda.time.Duration duration66 = period37.toDurationTo((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Period period69 = period67.withMonths(3);
        org.joda.time.Duration duration72 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Period period74 = duration72.toPeriodFrom(readableInstant73);
        org.joda.time.Period period76 = period74.minusSeconds((int) '4');
        org.joda.time.Minutes minutes77 = period74.toStandardMinutes();
        org.joda.time.Period period79 = period74.multipliedBy((int) (byte) 100);
        org.joda.time.Period period81 = period74.withSeconds((int) ' ');
        org.joda.time.Period period83 = period81.withWeeks((int) (byte) -1);
        org.joda.time.Period period84 = period83.toPeriod();
        org.joda.time.Period period85 = period69.withFields((org.joda.time.ReadablePeriod) period84);
        int int86 = period85.getSeconds();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertNotNull(dateTime63);
// flaky:         org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1644572718628L + "'", long65 == 1644572718628L);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(minutes77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 32 + "'", int86 == 32);
    }

    @Test
    public void test16716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16716");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType9);
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes13 = minutes11.multipliedBy((int) (short) 1);
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) minutes13);
        mutablePeriod10.addDays(0);
        mutablePeriod10.setMonths((int) (byte) 1);
        mutablePeriod10.setYears(0);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.Duration duration24 = duration22.withMillis(0L);
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardMinutes((long) (byte) 0);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType29);
        mutablePeriod30.setYears(0);
        org.joda.time.Duration duration34 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod30.setPeriod((org.joda.time.ReadableDuration) duration34, chronology35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        java.lang.Object obj38 = null;
        org.joda.time.Duration duration39 = new org.joda.time.Duration(obj38);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant37, (org.joda.time.ReadableDuration) duration39);
        org.joda.time.Duration duration42 = duration39.minus((long) '4');
        mutablePeriod30.add((org.joda.time.ReadableDuration) duration42);
        boolean boolean44 = duration26.isEqual((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration50 = duration47.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant53 = null;
        java.lang.Object obj54 = null;
        org.joda.time.Duration duration55 = new org.joda.time.Duration(obj54);
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, (org.joda.time.ReadableDuration) duration55);
        boolean boolean57 = duration52.isShorterThan((org.joda.time.ReadableDuration) duration55);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Interval interval59 = duration55.toIntervalTo(readableInstant58);
        org.joda.time.Interval interval60 = interval59.toInterval();
        org.joda.time.DateTime dateTime61 = interval60.getEnd();
        org.joda.time.Duration duration63 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant64 = null;
        java.lang.Object obj65 = null;
        org.joda.time.Duration duration66 = new org.joda.time.Duration(obj65);
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant64, (org.joda.time.ReadableDuration) duration66);
        boolean boolean68 = duration63.isShorterThan((org.joda.time.ReadableDuration) duration66);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Interval interval70 = duration66.toIntervalTo(readableInstant69);
        org.joda.time.Interval interval71 = interval70.toInterval();
        org.joda.time.DateTime dateTime72 = interval71.getEnd();
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime72);
        long long74 = dateTime72.getMillis();
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration50, (org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Period period76 = duration26.toPeriodFrom((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Interval interval77 = duration24.toIntervalTo((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.DateTime dateTime78 = interval77.getStart();
        org.joda.time.Duration duration79 = mutablePeriod10.toDurationTo((org.joda.time.ReadableInstant) dateTime78);
        org.joda.time.Chronology chronology80 = dateTime78.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks81 = org.joda.time.Weeks.weeksBetween(readableInstant0, (org.joda.time.ReadableInstant) dateTime78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(dateTime72);
// flaky:         org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1644572718661L + "'", long74 == 1644572718661L);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(chronology80);
    }

    @Test
    public void test16717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16717");
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
        org.joda.time.Duration duration21 = interval18.toDuration();
        org.joda.time.Duration duration24 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = duration24.toPeriodFrom(readableInstant25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = duration24.toPeriod(chronology27);
        java.lang.String str29 = period28.toString();
        org.joda.time.MutablePeriod mutablePeriod30 = period28.toMutablePeriod();
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant33 = null;
        java.lang.Object obj34 = null;
        org.joda.time.Duration duration35 = new org.joda.time.Duration(obj34);
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant33, (org.joda.time.ReadableDuration) duration35);
        boolean boolean37 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration35);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Interval interval39 = duration35.toIntervalTo(readableInstant38);
        long long40 = interval39.getStartMillis();
        mutablePeriod30.setPeriod((org.joda.time.ReadableInterval) interval39);
        org.joda.time.Duration duration42 = interval39.toDuration();
        org.joda.time.DateTime dateTime43 = interval39.getStart();
        org.joda.time.Period period44 = duration21.toPeriodFrom((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = duration47.toPeriodFrom(readableInstant48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = duration47.toPeriod(chronology50);
        java.lang.String str52 = period51.toString();
        org.joda.time.MutablePeriod mutablePeriod53 = period51.toMutablePeriod();
        org.joda.time.Duration duration55 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant56 = null;
        java.lang.Object obj57 = null;
        org.joda.time.Duration duration58 = new org.joda.time.Duration(obj57);
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant56, (org.joda.time.ReadableDuration) duration58);
        boolean boolean60 = duration55.isShorterThan((org.joda.time.ReadableDuration) duration58);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Interval interval62 = duration58.toIntervalTo(readableInstant61);
        long long63 = interval62.getStartMillis();
        mutablePeriod53.setPeriod((org.joda.time.ReadableInterval) interval62);
        org.joda.time.Interval interval65 = interval62.toInterval();
        org.joda.time.DateTime dateTime66 = interval65.getEnd();
        org.joda.time.Period period67 = duration21.toPeriodFrom((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Period period69 = period67.withMillis(20);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT0.097S" + "'", str29, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(interval39);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1644572718674L + "'", long40 == 1644572718674L);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PT0.097S" + "'", str52, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod53);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(interval62);
// flaky:         org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1644572718674L + "'", long63 == 1644572718674L);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
    }

    @Test
    public void test16718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16718");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod1.addMinutes((int) (short) 1);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType12);
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes16 = minutes14.multipliedBy((int) (short) 1);
        mutablePeriod13.setPeriod((org.joda.time.ReadablePeriod) minutes16);
        boolean boolean18 = mutablePeriod1.equals((java.lang.Object) minutes16);
        org.joda.time.PeriodType periodType19 = minutes16.getPeriodType();
        org.joda.time.Duration duration20 = minutes16.toStandardDuration();
        org.joda.time.Minutes minutes21 = org.joda.time.Minutes.ZERO;
        org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) minutes21);
        org.joda.time.Minutes minutes23 = minutes16.minus(minutes21);
        java.lang.String str24 = minutes23.toString();
        org.joda.time.Duration duration25 = minutes23.toStandardDuration();
        org.joda.time.Minutes minutes27 = minutes23.plus((int) (short) 0);
        org.joda.time.Period period29 = org.joda.time.Period.years((int) '4');
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.weekyears();
        int int31 = period29.indexOf(durationFieldType30);
        int int32 = period29.getYears();
        org.joda.time.Duration duration34 = org.joda.time.Duration.millis((long) '4');
        long long35 = duration34.getMillis();
        org.joda.time.Minutes minutes36 = duration34.toStandardMinutes();
        org.joda.time.Minutes minutes37 = minutes36.negated();
        org.joda.time.Minutes minutes39 = minutes36.multipliedBy((int) (short) 10);
        java.lang.String str40 = minutes39.toString();
        org.joda.time.Minutes minutes42 = minutes39.minus((-35));
        org.joda.time.Duration duration44 = org.joda.time.Duration.millis((long) '4');
        org.joda.time.Period period45 = duration44.toPeriod();
        org.joda.time.Period period47 = period45.plusMillis((int) (byte) 0);
        org.joda.time.Minutes minutes48 = period45.toStandardMinutes();
        org.joda.time.Minutes minutes49 = minutes39.plus(minutes48);
        org.joda.time.Minutes minutes51 = minutes48.multipliedBy(22);
        org.joda.time.Period period52 = period29.plus((org.joda.time.ReadablePeriod) minutes48);
        org.joda.time.Duration duration54 = org.joda.time.Duration.millis((long) '4');
        long long55 = duration54.getMillis();
        org.joda.time.Minutes minutes56 = duration54.toStandardMinutes();
        org.joda.time.PeriodType periodType57 = minutes56.getPeriodType();
        org.joda.time.ReadableInterval readableInterval58 = null;
        org.joda.time.Minutes minutes59 = org.joda.time.Minutes.minutesIn(readableInterval58);
        java.lang.String str60 = minutes59.toString();
        org.joda.time.Minutes minutes61 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes63 = minutes61.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType64 = minutes63.getPeriodType();
        org.joda.time.PeriodType periodType65 = periodType64.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType66 = org.joda.time.DurationFieldType.eras();
        boolean boolean67 = periodType64.isSupported(durationFieldType66);
        int int68 = minutes59.get(durationFieldType66);
        org.joda.time.ReadableInterval readableInterval69 = null;
        org.joda.time.Minutes minutes70 = org.joda.time.Minutes.minutesIn(readableInterval69);
        org.joda.time.Minutes minutes71 = minutes59.minus(minutes70);
        org.joda.time.Minutes minutes72 = minutes56.minus(minutes59);
        int int73 = minutes72.getMinutes();
        org.joda.time.Minutes minutes74 = minutes48.plus(minutes72);
        org.joda.time.Minutes minutes75 = minutes48.negated();
        boolean boolean76 = minutes23.isGreaterThan(minutes75);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT2147483647M" + "'", str24, "PT2147483647M");
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 52L + "'", long35 == 52L);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT0M" + "'", str40, "PT0M");
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 52L + "'", long55 == 52L);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PT0M" + "'", str60, "PT0M");
        org.junit.Assert.assertNotNull(minutes61);
        org.junit.Assert.assertNotNull(minutes63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(minutes70);
        org.junit.Assert.assertNotNull(minutes71);
        org.junit.Assert.assertNotNull(minutes72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(minutes74);
        org.junit.Assert.assertNotNull(minutes75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test16719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16719");
        org.joda.time.Days days4 = org.joda.time.Days.FOUR;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        java.lang.Object obj11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod();
        mutablePeriod12.setPeriod(100L, (long) (-1));
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod12, periodType16);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        java.lang.Object obj24 = null;
        org.joda.time.Duration duration25 = new org.joda.time.Duration(obj24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration25);
        boolean boolean27 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Interval interval29 = duration25.toIntervalTo(readableInstant28);
        org.joda.time.Interval interval30 = interval29.toInterval();
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        boolean boolean32 = durationFieldType20.isSupported(chronology31);
        mutablePeriod12.setPeriod((long) 0, (long) 8, chronology31);
        org.joda.time.Period period34 = new org.joda.time.Period(obj11, chronology31);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(1644572155170L, 1644572140312L, chronology31);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(164457249783893L, 0L, chronology31);
        org.joda.time.Period period37 = new org.joda.time.Period(1644572274118L, chronology31);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(1644572312331L, 1644572124065L, periodType5, chronology31);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(1644572592395L, 1644572391623L, chronology31);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test16720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16720");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks2 = weeks0.minus(weeks1);
        int int3 = weeks2.getWeeks();
        org.joda.time.Duration duration4 = weeks2.toStandardDuration();
        org.joda.time.Weeks weeks6 = weeks2.plus((-97));
        org.joda.time.Weeks weeks7 = weeks2.negated();
        int int8 = weeks2.getWeeks();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test16721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16721");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        mutablePeriod1.addMinutes((int) (short) 1);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) (short) 10, (int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0, (int) '4', periodType12);
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes16 = minutes14.multipliedBy((int) (short) 1);
        mutablePeriod13.setPeriod((org.joda.time.ReadablePeriod) minutes16);
        boolean boolean18 = mutablePeriod1.equals((java.lang.Object) minutes16);
        org.joda.time.PeriodType periodType19 = minutes16.getPeriodType();
        org.joda.time.Duration duration20 = minutes16.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = duration20.toPeriodTo(readableInstant21);
        int int23 = period22.getYears();
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4083 + "'", int23 == 4083);
    }

    @Test
    public void test16722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16722");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((-710));
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.Duration duration6 = new org.joda.time.Duration(obj5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6);
        boolean boolean8 = duration3.isShorterThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Interval interval10 = duration6.toIntervalTo(readableInstant9);
        org.joda.time.Interval interval11 = interval10.toInterval();
        org.joda.time.Hours hours12 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Hours hours13 = org.joda.time.Hours.hoursIn((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Hours hours15 = hours13.multipliedBy((int) 'a');
        org.joda.time.Hours hours17 = hours15.multipliedBy((-3));
        org.joda.time.Hours hours19 = hours17.minus(4);
        org.joda.time.Hours hours21 = hours19.dividedBy(36000032);
        org.joda.time.Hours hours23 = hours21.multipliedBy((-300));
        org.joda.time.Hours hours24 = hours1.minus(hours23);
        org.joda.time.DurationFieldType durationFieldType25 = hours23.getFieldType();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(durationFieldType25);
    }

    @Test
    public void test16723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16723");
        org.joda.time.Period period1 = new org.joda.time.Period(1L);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Period period4 = period1.plus((org.joda.time.ReadablePeriod) weeks3);
        org.joda.time.Period period5 = period4.toPeriod();
        int int6 = period5.getMillis();
        org.joda.time.Period period8 = period5.minusMinutes(5);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        mutablePeriod9.addMillis(245);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
    }

    @Test
    public void test16724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16724");
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Minutes minutes4 = minutes2.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType5 = minutes4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.eras();
        boolean boolean8 = periodType5.isSupported(durationFieldType7);
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
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        java.lang.Object obj33 = null;
        org.joda.time.Duration duration34 = new org.joda.time.Duration(obj33);
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, (org.joda.time.ReadableDuration) duration34);
        boolean boolean36 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Interval interval38 = duration34.toIntervalTo(readableInstant37);
        boolean boolean39 = interval29.isAfter((org.joda.time.ReadableInterval) interval38);
        boolean boolean40 = interval18.contains((org.joda.time.ReadableInterval) interval29);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType43);
        mutablePeriod44.setYears(0);
        org.joda.time.Duration duration48 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology49 = null;
        mutablePeriod44.setPeriod((org.joda.time.ReadableDuration) duration48, chronology49);
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant53 = null;
        java.lang.Object obj54 = null;
        org.joda.time.Duration duration55 = new org.joda.time.Duration(obj54);
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, (org.joda.time.ReadableDuration) duration55);
        boolean boolean57 = duration52.isShorterThan((org.joda.time.ReadableDuration) duration55);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Interval interval59 = duration55.toIntervalTo(readableInstant58);
        org.joda.time.Interval interval60 = interval59.toInterval();
        org.joda.time.DateTime dateTime61 = interval60.getEnd();
        org.joda.time.Duration duration63 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant64 = null;
        java.lang.Object obj65 = null;
        org.joda.time.Duration duration66 = new org.joda.time.Duration(obj65);
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant64, (org.joda.time.ReadableDuration) duration66);
        boolean boolean68 = duration63.isShorterThan((org.joda.time.ReadableDuration) duration66);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Interval interval70 = duration66.toIntervalTo(readableInstant69);
        org.joda.time.Interval interval71 = interval70.toInterval();
        org.joda.time.DateTime dateTime72 = interval71.getEnd();
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration48, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Duration duration76 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant77 = null;
        java.lang.Object obj78 = null;
        org.joda.time.Duration duration79 = new org.joda.time.Duration(obj78);
        org.joda.time.Period period80 = new org.joda.time.Period(readableInstant77, (org.joda.time.ReadableDuration) duration79);
        boolean boolean81 = duration76.isShorterThan((org.joda.time.ReadableDuration) duration79);
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.Interval interval83 = duration79.toIntervalTo(readableInstant82);
        org.joda.time.Interval interval84 = interval83.toInterval();
        org.joda.time.DateTime dateTime85 = interval84.getEnd();
        org.joda.time.PeriodType periodType87 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType88 = periodType87.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod(periodType88);
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod(10L, periodType88);
        org.joda.time.Period period91 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime85, periodType88);
        boolean boolean92 = interval29.isAfter((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.Chronology chronology93 = dateTime61.getChronology();
        org.joda.time.Period period94 = new org.joda.time.Period(10L, 52L, periodType5, chronology93);
        org.joda.time.PeriodType periodType95 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType96 = periodType5.withMonthsRemoved();
        java.lang.String str97 = periodType96.toString();
        org.joda.time.PeriodType periodType98 = periodType96.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod99 = new org.joda.time.MutablePeriod(periodType98);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
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
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(interval83);
        org.junit.Assert.assertNotNull(interval84);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(periodType87);
        org.junit.Assert.assertNotNull(periodType88);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(chronology93);
        org.junit.Assert.assertNotNull(periodType95);
        org.junit.Assert.assertNotNull(periodType96);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "PeriodType[Minutes]" + "'", str97, "PeriodType[Minutes]");
        org.junit.Assert.assertNotNull(periodType98);
    }

    @Test
    public void test16725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16725");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT1644572182S");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test16726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16726");
        org.joda.time.ReadableInstant readableInstant0 = null;
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
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        java.lang.Object obj25 = null;
        org.joda.time.Duration duration26 = new org.joda.time.Duration(obj25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, (org.joda.time.ReadableDuration) duration26);
        boolean boolean28 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Interval interval30 = duration26.toIntervalTo(readableInstant29);
        boolean boolean31 = interval21.isAfter((org.joda.time.ReadableInterval) interval30);
        boolean boolean32 = interval10.contains((org.joda.time.ReadableInterval) interval21);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType35);
        mutablePeriod36.setYears(0);
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod36.setPeriod((org.joda.time.ReadableDuration) duration40, chronology41);
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
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration40, (org.joda.time.ReadableInstant) dateTime53);
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
        org.joda.time.PeriodType periodType79 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType80 = periodType79.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod(periodType80);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(10L, periodType80);
        org.joda.time.Period period83 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime53, (org.joda.time.ReadableInstant) dateTime77, periodType80);
        boolean boolean84 = interval21.isAfter((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.ReadableInstant readableInstant85 = null;
        java.lang.Object obj86 = null;
        org.joda.time.Duration duration87 = new org.joda.time.Duration(obj86);
        org.joda.time.Period period88 = new org.joda.time.Period(readableInstant85, (org.joda.time.ReadableDuration) duration87);
        org.joda.time.Duration duration90 = duration87.plus((long) 'a');
        org.joda.time.PeriodType periodType91 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Period period92 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime53, (org.joda.time.ReadableDuration) duration90, periodType91);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes93 = org.joda.time.Minutes.minutesBetween(readableInstant0, (org.joda.time.ReadableInstant) dateTime53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(duration40);
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
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(duration90);
        org.junit.Assert.assertNotNull(periodType91);
    }

    @Test
    public void test16727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16727");
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
        org.joda.time.Period period22 = period20.withMillis((int) ' ');
        org.joda.time.Period period24 = period20.withWeeks((int) 'a');
        int int25 = period24.getHours();
        org.joda.time.Period period27 = period24.plusYears(0);
        org.joda.time.Period period29 = period27.plusHours((-5));
        org.joda.time.Period period31 = period27.plusHours(37);
        org.joda.time.Period period33 = period31.plusSeconds((-19034399));
        int int34 = period33.getHours();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 37 + "'", int34 == 37);
    }

    @Test
    public void test16728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16728");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("2022-02-11T09:38:32.497Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:38:32.497Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16729");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks5 = weeks4.negated();
        org.joda.time.Weeks weeks6 = weeks2.minus(weeks5);
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks9 = weeks8.negated();
        int int10 = weeks8.getWeeks();
        org.joda.time.Weeks weeks11 = weeks6.minus(weeks8);
        org.joda.time.Weeks weeks13 = weeks8.minus((int) (short) 1);
        org.joda.time.Weeks weeks15 = weeks13.dividedBy((int) (short) 1);
        org.joda.time.Weeks weeks16 = weeks15.negated();
        org.joda.time.Period period17 = weeks15.toPeriod();
        org.joda.time.Weeks weeks19 = weeks15.minus((int) '#');
        org.joda.time.Weeks weeks21 = weeks19.dividedBy(628);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks21);
    }

    @Test
    public void test16730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16730");
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
        int int21 = period20.getWeeks();
        org.joda.time.Days days22 = period20.toStandardDays();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(days22);
    }

    @Test
    public void test16731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16731");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 0);
        org.joda.time.Period period3 = period1.plusMinutes((-1));
        org.joda.time.Minutes minutes4 = period1.toStandardMinutes();
        org.joda.time.Minutes minutes6 = minutes4.dividedBy((int) (byte) -1);
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test16732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16732");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '4');
        org.joda.time.Period period8 = period4.minusSeconds(10);
        org.joda.time.Period period10 = period4.withWeeks((int) (byte) -1);
        int[] intArray11 = period10.getValues();
        org.joda.time.Period period13 = period10.minusMinutes(5);
        org.joda.time.Period period15 = period10.withMinutes((-1));
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.standard();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (short) 100, (-1L), periodType20);
        org.joda.time.Period period22 = new org.joda.time.Period(1L, (long) 52, periodType20);
        org.joda.time.Period period24 = period22.minusMinutes(6);
        int int25 = period24.getDays();
        org.joda.time.Period period27 = period24.withHours(8);
        org.joda.time.Period period28 = period15.withFields((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Period period30 = period27.plusDays((-52));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType32 = period27.getFieldType((-762));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, -1, 0, 0, 0, 0, -97]");
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
    }

    @Test
    public void test16733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16733");
        org.joda.time.Days days1 = org.joda.time.Days.days(5);
        java.lang.String str2 = days1.toString();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P5D" + "'", str2, "P5D");
    }

    @Test
    public void test16734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16734");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) -1, 1, (int) (byte) 0, 100);
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = duration7.toPeriodFrom(readableInstant8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = duration7.toPeriod(chronology10);
        org.joda.time.Period period13 = period11.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.Hours hours15 = org.joda.time.Hours.hoursIn(readableInterval14);
        org.joda.time.Period period16 = period13.minus((org.joda.time.ReadablePeriod) hours15);
        org.joda.time.Hours hours18 = hours15.dividedBy((int) '4');
        org.joda.time.Period period20 = org.joda.time.Period.days(100);
        org.joda.time.Period period22 = period20.withMillis(1);
        org.joda.time.Hours hours23 = period20.toStandardHours();
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Hours hours25 = org.joda.time.Hours.hoursIn(readableInterval24);
        org.joda.time.Hours hours26 = hours25.negated();
        org.joda.time.Hours hours27 = hours23.plus(hours26);
        boolean boolean28 = hours15.isLessThan(hours26);
        mutablePeriod4.setPeriod((org.joda.time.ReadablePeriod) hours15);
        org.joda.time.Hours hours31 = hours15.plus(35);
        java.lang.String str32 = hours31.toString();
        org.joda.time.Hours hours34 = hours31.dividedBy(97);
        org.joda.time.PeriodType periodType35 = hours31.getPeriodType();
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(hours31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT35H" + "'", str32, "PT35H");
        org.junit.Assert.assertNotNull(hours34);
        org.junit.Assert.assertNotNull(periodType35);
    }

    @Test
    public void test16735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16735");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        java.lang.Object obj7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(obj7);
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration8);
        boolean boolean10 = duration5.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Interval interval12 = duration8.toIntervalTo(readableInstant11);
        org.joda.time.Interval interval13 = interval12.toInterval();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        java.lang.Object obj17 = null;
        org.joda.time.Duration duration18 = new org.joda.time.Duration(obj17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration18);
        boolean boolean20 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Interval interval22 = duration18.toIntervalTo(readableInstant21);
        boolean boolean23 = interval13.isAfter((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Period period25 = interval22.toPeriod();
        org.joda.time.Duration duration26 = interval22.toDuration();
        org.joda.time.DateTime dateTime27 = interval22.getEnd();
        org.joda.time.Interval interval28 = interval22.toInterval();
        org.joda.time.Period period29 = interval22.toPeriod();
        org.joda.time.Period period31 = period29.plusDays(0);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.standard();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) (short) 100, (-1L), periodType34);
        org.joda.time.format.PeriodFormatter periodFormatter36 = null;
        java.lang.String str37 = mutablePeriod35.toString(periodFormatter36);
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
        org.joda.time.Interval interval57 = interval56.toInterval();
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant60 = null;
        java.lang.Object obj61 = null;
        org.joda.time.Duration duration62 = new org.joda.time.Duration(obj61);
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, (org.joda.time.ReadableDuration) duration62);
        boolean boolean64 = duration59.isShorterThan((org.joda.time.ReadableDuration) duration62);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Interval interval66 = duration62.toIntervalTo(readableInstant65);
        boolean boolean67 = interval57.isAfter((org.joda.time.ReadableInterval) interval66);
        org.joda.time.Period period68 = interval66.toPeriod();
        boolean boolean69 = interval47.isBefore((org.joda.time.ReadableInterval) interval66);
        org.joda.time.Interval interval70 = interval47.toInterval();
        mutablePeriod35.add((org.joda.time.ReadableInterval) interval47);
        long long72 = interval47.getStartMillis();
        org.joda.time.DateTime dateTime73 = interval47.getEnd();
        long long74 = interval47.toDurationMillis();
        org.joda.time.Weeks weeks75 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval47);
        org.joda.time.Weeks weeks77 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks78 = weeks77.negated();
        org.joda.time.Weeks weeks80 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks81 = weeks80.negated();
        org.joda.time.Weeks weeks82 = weeks78.minus(weeks81);
        org.joda.time.Weeks weeks84 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks85 = weeks84.negated();
        int int86 = weeks84.getWeeks();
        org.joda.time.Weeks weeks87 = weeks82.minus(weeks84);
        org.joda.time.Weeks weeks89 = weeks82.minus((int) (short) 10);
        org.joda.time.Weeks weeks91 = weeks89.dividedBy(8);
        boolean boolean92 = weeks75.isLessThan(weeks89);
        org.joda.time.DurationFieldType durationFieldType93 = weeks75.getFieldType();
        org.joda.time.Period period95 = period29.withFieldAdded(durationFieldType93, 51);
        int int96 = periodType3.indexOf(durationFieldType93);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PT0.101S" + "'", str37, "PT0.101S");
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(interval70);
// flaky:         org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1644572719064L + "'", long72 == 1644572719064L);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(weeks75);
        org.junit.Assert.assertNotNull(weeks77);
        org.junit.Assert.assertNotNull(weeks78);
        org.junit.Assert.assertNotNull(weeks80);
        org.junit.Assert.assertNotNull(weeks81);
        org.junit.Assert.assertNotNull(weeks82);
        org.junit.Assert.assertNotNull(weeks84);
        org.junit.Assert.assertNotNull(weeks85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(weeks87);
        org.junit.Assert.assertNotNull(weeks89);
        org.junit.Assert.assertNotNull(weeks91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(durationFieldType93);
        org.junit.Assert.assertNotNull(period95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test16736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16736");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test16737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16737");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        java.lang.String str1 = seconds0.toString();
        org.joda.time.Seconds seconds3 = seconds0.multipliedBy(8);
        org.joda.time.PeriodType periodType4 = seconds3.getPeriodType();
        org.joda.time.PeriodType periodType5 = seconds3.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withYearsRemoved();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PT2S" + "'", str1, "PT2S");
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test16738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16738");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) 100);
        org.joda.time.Period period3 = period1.withDays((int) (short) 100);
        int int4 = period3.getYears();
        int int5 = period3.getHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test16739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16739");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.minutes();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        java.lang.Object obj7 = null;
        org.joda.time.Duration duration8 = new org.joda.time.Duration(obj7);
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration8);
        boolean boolean10 = duration5.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Interval interval12 = duration8.toIntervalTo(readableInstant11);
        org.joda.time.Interval interval13 = interval12.toInterval();
        org.joda.time.DateTime dateTime14 = interval13.getEnd();
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        java.lang.Object obj18 = null;
        org.joda.time.Duration duration19 = new org.joda.time.Duration(obj18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration19);
        boolean boolean21 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Interval interval23 = duration19.toIntervalTo(readableInstant22);
        org.joda.time.Interval interval24 = interval23.toInterval();
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant27 = null;
        java.lang.Object obj28 = null;
        org.joda.time.Duration duration29 = new org.joda.time.Duration(obj28);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant27, (org.joda.time.ReadableDuration) duration29);
        boolean boolean31 = duration26.isShorterThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Interval interval33 = duration29.toIntervalTo(readableInstant32);
        boolean boolean34 = interval24.isAfter((org.joda.time.ReadableInterval) interval33);
        boolean boolean35 = interval13.contains((org.joda.time.ReadableInterval) interval24);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType38);
        mutablePeriod39.setYears(0);
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology44 = null;
        mutablePeriod39.setPeriod((org.joda.time.ReadableDuration) duration43, chronology44);
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
        org.joda.time.Duration duration58 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant59 = null;
        java.lang.Object obj60 = null;
        org.joda.time.Duration duration61 = new org.joda.time.Duration(obj60);
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant59, (org.joda.time.ReadableDuration) duration61);
        boolean boolean63 = duration58.isShorterThan((org.joda.time.ReadableDuration) duration61);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Interval interval65 = duration61.toIntervalTo(readableInstant64);
        org.joda.time.Interval interval66 = interval65.toInterval();
        org.joda.time.DateTime dateTime67 = interval66.getEnd();
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration43, (org.joda.time.ReadableInstant) dateTime56);
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
        org.joda.time.PeriodType periodType82 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType83 = periodType82.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod(periodType83);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod(10L, periodType83);
        org.joda.time.Period period86 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadableInstant) dateTime80, periodType83);
        boolean boolean87 = interval24.isAfter((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Chronology chronology88 = dateTime56.getChronology();
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((long) (byte) -1, periodType3, chronology88);
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod(1644572137529L, periodType3);
        org.joda.time.PeriodType periodType91 = periodType3.withYearsRemoved();
        org.joda.time.PeriodType periodType92 = periodType91.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod(1644572161256L, periodType91);
        org.joda.time.PeriodType periodType94 = periodType91.withMinutesRemoved();
        org.joda.time.Hours hours95 = org.joda.time.Hours.ONE;
        org.joda.time.DurationFieldType durationFieldType96 = hours95.getFieldType();
        org.joda.time.DurationFieldType durationFieldType97 = hours95.getFieldType();
        boolean boolean98 = periodType91.isSupported(durationFieldType97);
        java.lang.String str99 = durationFieldType97.toString();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertNotNull(interval79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(periodType83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertNotNull(periodType91);
        org.junit.Assert.assertNotNull(periodType92);
        org.junit.Assert.assertNotNull(periodType94);
        org.junit.Assert.assertNotNull(hours95);
        org.junit.Assert.assertNotNull(durationFieldType96);
        org.junit.Assert.assertNotNull(durationFieldType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "hours" + "'", str99, "hours");
    }

    @Test
    public void test16740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16740");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        org.joda.time.Period period8 = period6.withYears((int) (byte) 10);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn(readableInterval9);
        org.joda.time.Period period11 = period8.minus((org.joda.time.ReadablePeriod) hours10);
        org.joda.time.Hours hours12 = hours10.negated();
        java.lang.String str13 = hours12.toString();
        int int14 = hours12.size();
        java.lang.String str15 = hours12.toString();
        org.joda.time.Duration duration16 = hours12.toStandardDuration();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT0H" + "'", str13, "PT0H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0H" + "'", str15, "PT0H");
        org.junit.Assert.assertNotNull(duration16);
    }

    @Test
    public void test16741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16741");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(1644572122285L);
        org.joda.time.Duration duration3 = duration1.withMillis(1644572384301L);
        org.joda.time.Period period5 = org.joda.time.Period.days((-52));
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) 0, periodType10);
        mutablePeriod11.setYears(0);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod11.setPeriod((org.joda.time.ReadableDuration) duration15, chronology16);
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
        org.joda.time.DateTime dateTime39 = interval38.getEnd();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant44 = null;
        java.lang.Object obj45 = null;
        org.joda.time.Duration duration46 = new org.joda.time.Duration(obj45);
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, (org.joda.time.ReadableDuration) duration46);
        boolean boolean48 = duration43.isShorterThan((org.joda.time.ReadableDuration) duration46);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Interval interval50 = duration46.toIntervalTo(readableInstant49);
        org.joda.time.Interval interval51 = interval50.toInterval();
        org.joda.time.DateTime dateTime52 = interval51.getEnd();
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType55 = periodType54.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(periodType55);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(10L, periodType55);
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime52, periodType55);
        int int59 = periodType55.size();
        org.joda.time.PeriodType periodType60 = periodType55.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) (-1), 1644572131984L, periodType60);
        org.joda.time.Period period62 = period5.normalizedStandard(periodType60);
        java.lang.String str63 = periodType60.toString();
        org.joda.time.Period period64 = duration1.toPeriod(periodType60);
        org.joda.time.PeriodType periodType65 = periodType60.withYearsRemoved();
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PeriodType[MillisNoMillis]" + "'", str63, "PeriodType[MillisNoMillis]");
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(periodType65);
    }

    @Test
    public void test16742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16742");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType1 = seconds0.getFieldType();
        org.joda.time.Seconds seconds3 = seconds0.plus((-1));
        org.joda.time.DurationFieldType durationFieldType4 = seconds0.getFieldType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus((-1));
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        java.lang.String str11 = seconds10.toString();
        org.joda.time.Seconds seconds12 = seconds9.plus(seconds10);
        org.joda.time.Seconds seconds13 = seconds5.minus(seconds10);
        org.joda.time.Seconds seconds14 = seconds0.plus(seconds5);
        org.joda.time.Seconds seconds15 = seconds14.negated();
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType17 = seconds16.getFieldType();
        org.joda.time.Seconds seconds19 = seconds16.plus((-1));
        org.joda.time.Seconds seconds20 = null;
        boolean boolean21 = seconds19.isGreaterThan(seconds20);
        org.joda.time.Seconds seconds22 = seconds15.minus(seconds20);
        org.joda.time.Duration duration25 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = duration25.toPeriodFrom(readableInstant26);
        org.joda.time.Period period29 = period27.minusSeconds((int) '4');
        org.joda.time.Period period31 = period27.minusSeconds(10);
        org.joda.time.Period period33 = period27.withWeeks((int) (byte) -1);
        org.joda.time.Seconds seconds34 = period27.toStandardSeconds();
        org.joda.time.Seconds seconds36 = seconds34.plus((int) (short) -1);
        boolean boolean37 = seconds22.isGreaterThan(seconds36);
        org.joda.time.DurationFieldType durationFieldType38 = seconds22.getFieldType();
        java.lang.String str39 = durationFieldType38.toString();
        java.lang.Class<?> wildcardClass40 = durationFieldType38.getClass();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT2S" + "'", str11, "PT2S");
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "seconds" + "'", str39, "seconds");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test16743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16743");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, 1644572123232L, chronology2);
        org.joda.time.Period period5 = period3.withDays((int) (byte) 10);
        int int6 = period3.getHours();
        org.joda.time.Period period8 = period3.minusWeeks((int) '#');
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        java.lang.Object obj12 = null;
        org.joda.time.Duration duration13 = new org.joda.time.Duration(obj12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Interval interval17 = duration13.toIntervalTo(readableInstant16);
        org.joda.time.Interval interval18 = interval17.toInterval();
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
        boolean boolean38 = interval28.isAfter((org.joda.time.ReadableInterval) interval37);
        org.joda.time.Period period39 = interval37.toPeriod();
        boolean boolean40 = interval18.isBefore((org.joda.time.ReadableInterval) interval37);
        org.joda.time.DateTime dateTime41 = interval37.getEnd();
        org.joda.time.Instant instant42 = dateTime41.toInstant();
        org.joda.time.Duration duration43 = period8.toDurationTo((org.joda.time.ReadableInstant) dateTime41);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(duration43);
    }

    @Test
    public void test16744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16744");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 1, (int) (byte) 100, (-10), 32, 3, 2, (int) '#', (int) ' ');
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.THREE;
        org.joda.time.Weeks weeks11 = weeks9.minus(weeks10);
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks14 = weeks13.negated();
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeks((int) (byte) -1);
        org.joda.time.Weeks weeks17 = weeks16.negated();
        org.joda.time.Weeks weeks18 = weeks14.minus(weeks17);
        org.joda.time.Duration duration19 = weeks14.toStandardDuration();
        org.joda.time.Weeks weeks20 = weeks11.plus(weeks14);
        org.joda.time.DurationFieldType durationFieldType21 = weeks20.getFieldType();
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.Duration duration29 = duration26.withDurationAdded((long) (byte) 100, 10);
        org.joda.time.Duration duration31 = duration23.withDurationAdded((org.joda.time.ReadableDuration) duration26, (int) (short) 1);
        long long32 = duration23.getStandardMinutes();
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.weeks();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.years();
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant37 = null;
        java.lang.Object obj38 = null;
        org.joda.time.Duration duration39 = new org.joda.time.Duration(obj38);
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant37, (org.joda.time.ReadableDuration) duration39);
        boolean boolean41 = duration36.isShorterThan((org.joda.time.ReadableDuration) duration39);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Interval interval43 = duration39.toIntervalTo(readableInstant42);
        org.joda.time.Interval interval44 = interval43.toInterval();
        org.joda.time.Chronology chronology45 = interval44.getChronology();
        boolean boolean46 = durationFieldType34.isSupported(chronology45);
        org.joda.time.Period period47 = duration23.toPeriod(periodType33, chronology45);
        boolean boolean48 = durationFieldType21.isSupported(chronology45);
        org.joda.time.Period period50 = period8.withFieldAdded(durationFieldType21, 36);
        org.joda.time.Period period52 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period54 = period52.withMillis((int) ' ');
        org.joda.time.Period period56 = period52.minusMonths((int) (short) 100);
        org.joda.time.Duration duration59 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Period period61 = duration59.toPeriodFrom(readableInstant60);
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.years();
        org.joda.time.Period period64 = period61.withField(durationFieldType62, (int) (byte) 100);
        boolean boolean65 = period56.isSupported(durationFieldType62);
        org.joda.time.Period period67 = period50.withField(durationFieldType62, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours68 = period50.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 600L + "'", long32 == 600L);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(period67);
    }

    @Test
    public void test16745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16745");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.Days days3 = days2.negated();
        boolean boolean4 = days1.isGreaterThan(days3);
        org.joda.time.MutablePeriod mutablePeriod5 = days1.toMutablePeriod();
        mutablePeriod5.setPeriod((-2147483648), 0, 0, (int) (short) -1, 1, 23, 30, 23);
        org.joda.time.format.PeriodFormatter periodFormatter15 = null;
        java.lang.String str16 = mutablePeriod5.toString(periodFormatter15);
        mutablePeriod5.addHours(214748364);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P-2147483648Y-1DT1H23M30.023S" + "'", str16, "P-2147483648Y-1DT1H23M30.023S");
    }

    @Test
    public void test16746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16746");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '4');
        org.joda.time.Minutes minutes7 = period4.toStandardMinutes();
        org.joda.time.Period period9 = period4.multipliedBy((int) (byte) 100);
        org.joda.time.Period period11 = period9.withHours((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        org.joda.time.Period period14 = period9.withField(durationFieldType12, 0);
        org.joda.time.Period period16 = period14.plusMinutes((int) (short) -1);
        org.joda.time.Period period17 = period16.normalizedStandard();
        org.joda.time.Period period19 = period16.minusSeconds(306);
        org.joda.time.Period period21 = period16.minusYears((int) (byte) -1);
        int int22 = period21.getYears();
        org.joda.time.Period period24 = period21.minusMillis(15);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test16747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16747");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy((int) (byte) 1);
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds5 = seconds3.multipliedBy((int) (byte) 1);
        int int6 = seconds5.size();
        org.joda.time.Period period8 = org.joda.time.Period.parse("PT0S");
        org.joda.time.Period period10 = period8.minusMillis((-1));
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period10);
        boolean boolean12 = seconds5.isGreaterThan(seconds11);
        org.joda.time.PeriodType periodType13 = seconds5.getPeriodType();
        org.joda.time.Seconds seconds14 = seconds2.plus(seconds5);
        org.joda.time.Seconds seconds16 = seconds2.plus(52);
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.THREE;
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.ZERO;
        org.joda.time.DurationFieldType durationFieldType19 = seconds18.getFieldType();
        org.joda.time.Seconds seconds21 = seconds18.plus((-1));
        org.joda.time.Seconds seconds22 = org.joda.time.Seconds.TWO;
        java.lang.String str23 = seconds22.toString();
        org.joda.time.Seconds seconds24 = seconds21.plus(seconds22);
        org.joda.time.Seconds seconds25 = seconds17.minus(seconds22);
        org.joda.time.Seconds seconds27 = seconds25.multipliedBy((int) (byte) -1);
        org.joda.time.Duration duration28 = seconds27.toStandardDuration();
        org.joda.time.Seconds seconds30 = seconds27.minus((int) '4');
        java.lang.String str31 = seconds30.toString();
        org.joda.time.Seconds seconds32 = seconds2.plus(seconds30);
        org.joda.time.DurationFieldType durationFieldType33 = seconds2.getFieldType();
        java.lang.String str34 = durationFieldType33.toString();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(seconds14);
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
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT-53S" + "'", str31, "PT-53S");
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "seconds" + "'", str34, "seconds");
    }

    @Test
    public void test16748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16748");
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
        org.joda.time.ReadableInterval readableInterval12 = null;
        boolean boolean13 = interval9.isAfter(readableInterval12);
        org.joda.time.Duration duration14 = interval9.toDuration();
        org.joda.time.MutableInterval mutableInterval15 = interval9.toMutableInterval();
        org.joda.time.DateTime dateTime16 = mutableInterval15.getStart();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test16749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16749");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = duration2.toPeriodFrom(readableInstant3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        java.lang.String str7 = period6.toString();
        org.joda.time.MutablePeriod mutablePeriod8 = period6.toMutablePeriod();
        org.joda.time.Seconds seconds9 = period6.toStandardSeconds();
        org.joda.time.Period period11 = period6.multipliedBy((int) (short) 100);
        org.joda.time.Period period13 = period11.multipliedBy((int) (byte) -1);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.097S" + "'", str7, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test16750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16750");
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
        org.joda.time.DateTime dateTime21 = interval18.getStart();
        org.joda.time.MutableInterval mutableInterval22 = interval18.toMutableInterval();
        org.joda.time.DateTime dateTime23 = interval18.getStart();
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        java.lang.Object obj27 = null;
        org.joda.time.Duration duration28 = new org.joda.time.Duration(obj27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration28);
        boolean boolean30 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Interval interval32 = duration28.toIntervalTo(readableInstant31);
        org.joda.time.Interval interval33 = interval32.toInterval();
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant36 = null;
        java.lang.Object obj37 = null;
        org.joda.time.Duration duration38 = new org.joda.time.Duration(obj37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration38);
        boolean boolean40 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Interval interval42 = duration38.toIntervalTo(readableInstant41);
        boolean boolean43 = interval33.isAfter((org.joda.time.ReadableInterval) interval42);
        long long44 = interval42.toDurationMillis();
        org.joda.time.Interval interval45 = interval42.toInterval();
        org.joda.time.DateTime dateTime46 = interval42.getEnd();
        org.joda.time.Hours hours47 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime46);
        long long48 = dateTime23.getMillis();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableInterval22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(hours47);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1644572719400L + "'", long48 == 1644572719400L);
    }

    @Test
    public void test16751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16751");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.standard();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 100, (-1L), periodType2);
        int[] intArray4 = mutablePeriod3.getValues();
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 0, (int) (byte) 10, (int) (byte) 100, (int) (byte) 100);
        org.joda.time.Period period11 = period9.plusDays(1);
        org.joda.time.ReadableInstant readableInstant12 = null;
        java.lang.Object obj13 = null;
        org.joda.time.Duration duration14 = new org.joda.time.Duration(obj13);
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration14);
        org.joda.time.Days days16 = duration14.toStandardDays();
        org.joda.time.Days days17 = days16.negated();
        org.joda.time.Period period18 = period11.plus((org.joda.time.ReadablePeriod) days16);
        org.joda.time.Period period20 = period18.plusDays((-1));
        org.joda.time.Period period22 = period20.minusHours((int) '#');
        org.joda.time.Period period24 = period20.plusMillis(10);
        int int25 = period20.getMillis();
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.days();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) (short) 100, chronology28);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.eras();
        boolean boolean31 = period29.isSupported(durationFieldType30);
        int int32 = periodType26.indexOf(durationFieldType30);
        int int33 = period20.indexOf(durationFieldType30);
        int int34 = mutablePeriod3.get(durationFieldType30);
        mutablePeriod3.addMonths((int) (byte) -1);
        org.joda.time.Duration duration39 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Period period41 = duration39.toPeriodFrom(readableInstant40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = duration39.toPeriod(chronology42);
        java.lang.String str44 = period43.toString();
        org.joda.time.MutablePeriod mutablePeriod45 = period43.toMutablePeriod();
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardHours((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant48 = null;
        java.lang.Object obj49 = null;
        org.joda.time.Duration duration50 = new org.joda.time.Duration(obj49);
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant48, (org.joda.time.ReadableDuration) duration50);
        boolean boolean52 = duration47.isShorterThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Interval interval54 = duration50.toIntervalTo(readableInstant53);
        long long55 = interval54.getStartMillis();
        mutablePeriod45.setPeriod((org.joda.time.ReadableInterval) interval54);
        org.joda.time.Interval interval57 = interval54.toInterval();
        org.joda.time.Duration duration58 = interval57.toDuration();
        org.joda.time.MutableInterval mutableInterval59 = interval57.toMutableInterval();
        long long60 = interval57.getEndMillis();
        mutablePeriod3.setPeriod((org.joda.time.ReadableInterval) interval57);
        org.joda.time.DateTime dateTime62 = interval57.getEnd();
        long long63 = interval57.toDurationMillis();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0, 0, 0, 0, 0, 0, -101]");
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PT0.097S" + "'", str44, "PT0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(interval54);
// flaky:         org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1644572719421L + "'", long55 == 1644572719421L);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(mutableInterval59);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1644572719421L + "'", long60 == 1644572719421L);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
    }

    @Test
    public void test16752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16752");
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
        org.joda.time.Seconds seconds18 = seconds6.multipliedBy(10);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = duration21.toPeriodFrom(readableInstant22);
        org.joda.time.Period period25 = period23.minusSeconds((int) '4');
        org.joda.time.Period period27 = period23.minusSeconds(10);
        org.joda.time.Period period29 = period23.withWeeks((int) (byte) -1);
        org.joda.time.Seconds seconds30 = period23.toStandardSeconds();
        org.joda.time.Seconds seconds32 = seconds30.plus((-97));
        org.joda.time.Seconds seconds34 = seconds30.multipliedBy(52);
        org.joda.time.DurationFieldType durationFieldType35 = seconds30.getFieldType();
        boolean boolean36 = seconds18.isGreaterThan(seconds30);
        org.joda.time.Duration duration39 = new org.joda.time.Duration((long) 'a', (long) 0);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Period period41 = duration39.toPeriodFrom(readableInstant40);
        org.joda.time.Period period43 = period41.minusSeconds((int) '4');
        org.joda.time.Period period45 = period41.minusSeconds(10);
        org.joda.time.Period period47 = period41.withWeeks((int) (byte) -1);
        org.joda.time.Seconds seconds48 = period41.toStandardSeconds();
        org.joda.time.Seconds seconds50 = seconds48.plus(9);
        boolean boolean51 = seconds30.isGreaterThan(seconds48);
        org.joda.time.Seconds seconds53 = seconds30.multipliedBy(2);
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
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(seconds48);
        org.junit.Assert.assertNotNull(seconds50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(seconds53);
    }
}
