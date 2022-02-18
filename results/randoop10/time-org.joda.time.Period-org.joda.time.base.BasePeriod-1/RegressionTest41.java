import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest41 {

    public static boolean debug = false;

    @Test
    public void test20501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20501");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        int int5 = period4.getYears();
        org.joda.time.Period period6 = period4.toPeriod();
        org.joda.time.Period period8 = period6.plusMinutes(100);
        org.joda.time.Period period10 = period6.minusMillis(1);
        int int11 = period6.getWeeks();
        int int12 = period6.getYears();
        org.joda.time.Period period14 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Period period16 = period14.plusWeeks((-36));
        org.joda.time.Period period18 = period16.withWeeks((int) (short) -1);
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration20 = seconds19.toStandardDuration();
        org.joda.time.Duration duration22 = org.joda.time.Duration.millis((long) ' ');
        boolean boolean23 = duration20.isEqual((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period29 = period27.minusMonths(0);
        org.joda.time.Period period31 = period27.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType32 = period27.getPeriodType();
        org.joda.time.PeriodType periodType33 = periodType32.withMinutesRemoved();
        java.lang.String str34 = periodType33.toString();
        org.joda.time.Period period35 = duration20.toPeriodFrom(readableInstant24, periodType33);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.minutes();
        java.lang.String str37 = durationFieldType36.toString();
        boolean boolean38 = periodType33.isSupported(durationFieldType36);
        boolean boolean39 = period18.isSupported(durationFieldType36);
        int int40 = period6.indexOf(durationFieldType36);
        org.joda.time.Period period42 = period6.multipliedBy((-2400));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str34, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "minutes" + "'", str37, "minutes");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertNotNull(period42);
    }

    @Test
    public void test20502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20502");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Period period8 = duration7.toPeriod();
        org.joda.time.Duration duration10 = duration7.plus((long) (byte) 0);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.Period period12 = duration10.toPeriod();
        org.joda.time.Period period14 = period12.plusYears(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration15 = new org.joda.time.Duration((java.lang.Object) period14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test20503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20503");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = days0.minus(8);
        org.joda.time.Days days5 = days0.plus(8);
        org.joda.time.Days days6 = org.joda.time.Days.TWO;
        boolean boolean7 = days0.isLessThan(days6);
        org.joda.time.Days days9 = org.joda.time.Days.parseDays("P10D");
        org.joda.time.Days days10 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType11 = days10.getPeriodType();
        org.joda.time.Days days13 = days10.plus((int) (byte) 100);
        boolean boolean14 = days9.isLessThan(days13);
        org.joda.time.DurationFieldType durationFieldType15 = days9.getFieldType();
        org.joda.time.Days days16 = days0.minus(days9);
        java.lang.String str17 = days9.toString();
        org.joda.time.PeriodType periodType18 = days9.getPeriodType();
        org.joda.time.Period period19 = days9.toPeriod();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P10D" + "'", str17, "P10D");
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test20504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20504");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration2 = duration1.toDuration();
        org.joda.time.Duration duration4 = duration2.withMillis(100000L);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        org.joda.time.Seconds seconds7 = seconds5.dividedBy(1680);
        org.joda.time.Seconds seconds9 = seconds5.plus(0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
    }

    @Test
    public void test20505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20505");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (-10));
        org.joda.time.Duration duration3 = duration1.minus((-128849018880000L));
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType4);
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        org.joda.time.Duration duration12 = minutes11.toStandardDuration();
        org.joda.time.Period period13 = duration12.toPeriod();
        org.joda.time.Duration duration15 = duration12.plus((long) (byte) 0);
        org.joda.time.Period period16 = duration12.toPeriod();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Minutes minutes23 = period22.toStandardMinutes();
        org.joda.time.Duration duration24 = minutes23.toStandardDuration();
        org.joda.time.Period period25 = duration24.toPeriod();
        org.joda.time.Duration duration27 = duration24.plus((long) (byte) 0);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration27);
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((java.lang.Object) duration27, periodType29, chronology30);
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period36 = period34.minusMonths(0);
        org.joda.time.Minutes minutes37 = period36.toStandardMinutes();
        org.joda.time.Duration duration38 = minutes37.toStandardDuration();
        org.joda.time.Minutes minutes40 = minutes37.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration41 = minutes37.toStandardDuration();
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period46 = period44.minusMonths(0);
        org.joda.time.Minutes minutes47 = period46.toStandardMinutes();
        org.joda.time.Duration duration48 = minutes47.toStandardDuration();
        org.joda.time.Period period49 = duration48.toPeriod();
        boolean boolean50 = duration41.isLongerThan((org.joda.time.ReadableDuration) duration48);
        boolean boolean51 = duration27.isShorterThan((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration52 = duration12.minus((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration55 = duration48.withDurationAdded(217728000L, 2147483645);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration55, readableInstant56);
        org.joda.time.Period period58 = period57.toPeriod();
        boolean boolean59 = duration1.equals((java.lang.Object) period57);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test20506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20506");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Period period8 = period2.multipliedBy((int) '4');
        org.joda.time.Duration duration11 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration13 = duration11.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant14);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Duration duration22 = minutes21.toStandardDuration();
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period27 = period25.minusMonths(0);
        org.joda.time.Minutes minutes28 = period27.toStandardMinutes();
        org.joda.time.Duration duration29 = minutes28.toStandardDuration();
        boolean boolean30 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = new org.joda.time.Duration(readableInstant31, readableInstant32);
        org.joda.time.Duration duration34 = duration22.minus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration35 = duration22.toDuration();
        boolean boolean36 = duration13.isEqual((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Period period39 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period41 = period39.minusMonths(0);
        org.joda.time.Minutes minutes42 = period41.toStandardMinutes();
        org.joda.time.Duration duration43 = minutes42.toStandardDuration();
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period48 = period46.minusMonths(0);
        org.joda.time.Minutes minutes49 = period48.toStandardMinutes();
        org.joda.time.Duration duration50 = minutes49.toStandardDuration();
        boolean boolean51 = duration43.isShorterThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = new org.joda.time.Duration(readableInstant52, readableInstant53);
        org.joda.time.Duration duration55 = duration43.minus((org.joda.time.ReadableDuration) duration54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration43, readableInstant56);
        org.joda.time.Period period58 = duration43.toPeriod();
        boolean boolean59 = duration35.equals((java.lang.Object) period58);
        org.joda.time.Period period60 = period8.minus((org.joda.time.ReadablePeriod) period58);
        org.joda.time.Period period62 = period60.multipliedBy(14400);
        org.joda.time.Period period64 = period62.plusWeeks((-97));
        org.joda.time.Period period66 = period62.withWeeks(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period68 = period66.multipliedBy((-2147483552));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -26956800 * -2147483552");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
    }

    @Test
    public void test20507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20507");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) '#');
        int int2 = seconds1.getSeconds();
        org.joda.time.Seconds seconds4 = seconds1.dividedBy((int) (short) 1);
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.Seconds seconds9 = seconds6.plus((int) (byte) 0);
        org.joda.time.Seconds seconds11 = seconds6.minus(8);
        org.joda.time.Period period12 = seconds11.toPeriod();
        org.joda.time.Seconds seconds14 = seconds11.multipliedBy(2);
        org.joda.time.MutablePeriod mutablePeriod15 = seconds11.toMutablePeriod();
        org.joda.time.Seconds seconds17 = seconds11.plus(0);
        org.joda.time.Seconds seconds18 = seconds4.minus(seconds17);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
    }

    @Test
    public void test20508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20508");
        org.joda.time.Duration duration3 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration5 = duration3.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Interval interval9 = duration5.toIntervalFrom(readableInstant8);
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval9);
        org.joda.time.Period period11 = weeks10.toPeriod();
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeks(1);
        boolean boolean15 = weeks12.isGreaterThan(weeks14);
        org.joda.time.Weeks weeks16 = weeks10.minus(weeks12);
        org.joda.time.Weeks weeks17 = weeks10.negated();
        org.joda.time.Weeks weeks19 = weeks10.multipliedBy((-35));
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.weeks((-35));
        org.joda.time.Weeks weeks23 = weeks21.plus(11);
        org.joda.time.Weeks weeks24 = weeks19.plus(weeks23);
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.weeksIn(readableInterval25);
        org.joda.time.Weeks weeks28 = weeks26.plus(11);
        org.joda.time.Weeks weeks30 = weeks26.plus((int) (short) 100);
        java.lang.String str31 = weeks30.toString();
        org.joda.time.Weeks weeks33 = weeks30.multipliedBy((-95));
        org.joda.time.Weeks weeks34 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks36 = weeks34.dividedBy(1);
        org.joda.time.Weeks weeks37 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean38 = weeks36.isGreaterThan(weeks37);
        org.joda.time.Duration duration39 = weeks36.toStandardDuration();
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.ZERO;
        java.lang.String str41 = weeks40.toString();
        int int42 = weeks40.size();
        org.joda.time.PeriodType periodType43 = weeks40.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod44 = weeks40.toMutablePeriod();
        org.joda.time.Weeks weeks45 = weeks36.minus(weeks40);
        org.joda.time.Weeks weeks46 = org.joda.time.Weeks.TWO;
        org.joda.time.Weeks weeks48 = org.joda.time.Weeks.weeks(10);
        org.joda.time.Weeks weeks49 = weeks48.negated();
        java.lang.String str50 = weeks48.toString();
        boolean boolean51 = weeks46.isLessThan(weeks48);
        boolean boolean52 = weeks40.isLessThan(weeks48);
        org.joda.time.Weeks weeks54 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks55 = weeks54.negated();
        org.joda.time.Weeks weeks56 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval57 = null;
        org.joda.time.Weeks weeks58 = org.joda.time.Weeks.weeksIn(readableInterval57);
        boolean boolean59 = weeks56.isLessThan(weeks58);
        boolean boolean60 = weeks55.isGreaterThan(weeks58);
        org.joda.time.Weeks weeks61 = null;
        org.joda.time.Weeks weeks62 = weeks58.minus(weeks61);
        org.joda.time.DurationFieldType durationFieldType63 = weeks58.getFieldType();
        org.joda.time.Weeks weeks65 = weeks58.plus(52);
        org.joda.time.Weeks weeks66 = weeks58.negated();
        org.joda.time.Weeks weeks67 = weeks48.minus(weeks58);
        org.joda.time.Weeks weeks68 = weeks30.plus(weeks67);
        org.joda.time.Weeks weeks69 = weeks24.minus(weeks67);
        org.joda.time.PeriodType periodType70 = weeks24.getPeriodType();
        org.joda.time.Period period71 = new org.joda.time.Period(11000L, periodType70);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "P100W" + "'", str31, "P100W");
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "P0W" + "'", str41, "P0W");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(mutablePeriod44);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertNotNull(weeks46);
        org.junit.Assert.assertNotNull(weeks48);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "P10W" + "'", str50, "P10W");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(weeks54);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertNotNull(weeks56);
        org.junit.Assert.assertNotNull(weeks58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(weeks62);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertNotNull(weeks65);
        org.junit.Assert.assertNotNull(weeks66);
        org.junit.Assert.assertNotNull(weeks67);
        org.junit.Assert.assertNotNull(weeks68);
        org.junit.Assert.assertNotNull(weeks69);
        org.junit.Assert.assertNotNull(periodType70);
    }

    @Test
    public void test20509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20509");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration1 = seconds0.toStandardDuration();
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.seconds((int) '#');
        int int4 = seconds3.getSeconds();
        org.joda.time.Seconds seconds6 = seconds3.dividedBy((int) (short) 1);
        org.joda.time.Seconds seconds7 = seconds0.plus(seconds6);
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds10 = seconds8.multipliedBy((int) (byte) 100);
        org.joda.time.Seconds seconds12 = seconds8.multipliedBy((int) (byte) 0);
        org.joda.time.Duration duration13 = seconds8.toStandardDuration();
        java.lang.String str14 = seconds8.toString();
        org.joda.time.Seconds seconds16 = seconds8.plus((int) '4');
        org.joda.time.Seconds seconds17 = seconds7.plus(seconds8);
        int int18 = seconds7.getSeconds();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0S" + "'", str14, "PT0S");
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
    }

    @Test
    public void test20510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20510");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = days0.minus(8);
        org.joda.time.Days days5 = days0.plus(8);
        java.lang.String str6 = days5.toString();
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        java.lang.String str8 = days7.toString();
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.Days days12 = days9.minus(0);
        boolean boolean13 = days7.isLessThan(days12);
        java.lang.String str14 = days7.toString();
        org.joda.time.Days days15 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType16 = days15.getPeriodType();
        org.joda.time.Days days17 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        org.joda.time.Days days20 = days17.minus(0);
        org.joda.time.Days days21 = days20.negated();
        boolean boolean22 = days15.isGreaterThan(days20);
        org.joda.time.Days days23 = days7.minus(days15);
        boolean boolean24 = days5.isLessThan(days15);
        org.joda.time.PeriodType periodType25 = days5.getPeriodType();
        org.joda.time.Days days27 = days5.dividedBy(87);
        org.joda.time.Days days28 = org.joda.time.Days.FIVE;
        java.lang.String str29 = days28.toString();
        org.joda.time.Days days30 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType31 = days30.getPeriodType();
        org.joda.time.Days days33 = days30.minus(0);
        boolean boolean34 = days28.isLessThan(days33);
        org.joda.time.Days days35 = org.joda.time.Days.TWO;
        org.joda.time.Days days36 = days35.negated();
        org.joda.time.Days days37 = days35.negated();
        org.joda.time.Days days38 = days33.minus(days35);
        org.joda.time.Days days39 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days40 = days38.minus(days39);
        org.joda.time.Days days41 = days5.plus(days40);
        org.joda.time.DurationFieldType durationFieldType42 = days41.getFieldType();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P13D" + "'", str6, "P13D");
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P5D" + "'", str8, "P5D");
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P5D" + "'", str14, "P5D");
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "P5D" + "'", str29, "P5D");
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(durationFieldType42);
    }

    @Test
    public void test20511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20511");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Period period9 = period5.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType10 = period5.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withMinutesRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withHoursRemoved();
        int int14 = periodType11.size();
        org.joda.time.Period period15 = new org.joda.time.Period((long) 1, periodType11);
        org.joda.time.PeriodType periodType16 = periodType11.withMinutesRemoved();
        org.joda.time.PeriodType periodType17 = periodType11.withHoursRemoved();
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType17);
        org.joda.time.PeriodType periodType19 = period18.getPeriodType();
        int int20 = period18.size();
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test20512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20512");
        org.joda.time.Days days1 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.Period period4 = new org.joda.time.Period((long) 1, periodType3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test20513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20513");
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks10 = weeks8.dividedBy(1);
        org.joda.time.Duration duration11 = weeks8.toStandardDuration();
        org.joda.time.PeriodType periodType12 = weeks8.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = new org.joda.time.Period((-268435455), 2147483644, 126064, 400, (-2147483640), (-31), (-102), (-13), periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test20514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20514");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis(4475L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test20515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20515");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = new org.joda.time.Duration(readableInstant1, readableInstant2);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration5 = minutes4.toStandardDuration();
        long long6 = duration5.getStandardSeconds();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        org.joda.time.Minutes minutes15 = minutes12.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration16 = minutes12.toStandardDuration();
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Minutes minutes22 = period21.toStandardMinutes();
        org.joda.time.Duration duration23 = minutes22.toStandardDuration();
        org.joda.time.Period period24 = duration23.toPeriod();
        boolean boolean25 = duration16.isLongerThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.days();
        org.joda.time.Period period28 = duration16.toPeriodTo(readableInstant26, periodType27);
        org.joda.time.Duration duration29 = duration5.plus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period34 = period32.minusMonths(0);
        org.joda.time.Minutes minutes35 = period34.toStandardMinutes();
        org.joda.time.Duration duration36 = minutes35.toStandardDuration();
        org.joda.time.Period period39 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period41 = period39.minusMonths(0);
        org.joda.time.Minutes minutes42 = period41.toStandardMinutes();
        org.joda.time.Duration duration43 = minutes42.toStandardDuration();
        boolean boolean44 = duration36.isShorterThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration43, readableInstant45);
        long long47 = duration43.getStandardHours();
        org.joda.time.Duration duration48 = duration16.minus((org.joda.time.ReadableDuration) duration43);
        int int49 = duration3.compareTo((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        int int51 = period50.getHours();
        org.joda.time.Period period53 = period50.withWeeks(97);
        org.joda.time.Period period55 = period50.plusDays((-190));
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-128849018880L) + "'", long6 == (-128849018880L));
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
    }

    @Test
    public void test20516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20516");
        org.joda.time.Period period1 = new org.joda.time.Period(100000L);
        org.joda.time.Period period3 = period1.minusYears(100);
        org.joda.time.Period period5 = period1.withHours((-2));
        org.joda.time.Period period6 = period1.toPeriod();
        org.joda.time.Days days7 = org.joda.time.Days.ONE;
        org.joda.time.Days days9 = days7.dividedBy((int) (byte) 10);
        org.joda.time.Days days11 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days13 = days11.multipliedBy((int) (short) 100);
        org.joda.time.Days days14 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType15 = days14.getPeriodType();
        org.joda.time.Days days17 = days14.minus(0);
        org.joda.time.Days days18 = days11.minus(days17);
        java.lang.String str19 = days18.toString();
        org.joda.time.Days days20 = days18.negated();
        org.joda.time.Days days21 = org.joda.time.Days.FIVE;
        java.lang.String str22 = days21.toString();
        org.joda.time.Days days24 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days25 = days21.minus(days24);
        org.joda.time.DurationFieldType durationFieldType26 = days21.getFieldType();
        boolean boolean27 = days20.isLessThan(days21);
        org.joda.time.Days days29 = days20.dividedBy(52);
        boolean boolean30 = days9.isLessThan(days29);
        org.joda.time.Period period31 = period1.minus((org.joda.time.ReadablePeriod) days9);
        java.lang.String str32 = period1.toString();
        java.lang.Object obj33 = null;
        boolean boolean34 = period1.equals(obj33);
        int int35 = period1.getHours();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P0D" + "'", str19, "P0D");
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "P5D" + "'", str22, "P5D");
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT1M40S" + "'", str32, "PT1M40S");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test20517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20517");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.DurationFieldType durationFieldType8 = seconds2.getFieldType();
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.seconds(100);
        boolean boolean11 = seconds2.isGreaterThan(seconds10);
        org.joda.time.Seconds seconds13 = seconds2.minus(0);
        org.joda.time.Seconds seconds14 = seconds2.negated();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
    }

    @Test
    public void test20518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20518");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = days0.multipliedBy((int) (byte) -1);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        java.lang.String str5 = days4.toString();
        org.joda.time.Days days6 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.Days days9 = days6.minus(0);
        boolean boolean10 = days4.isLessThan(days9);
        boolean boolean11 = days3.isLessThan(days4);
        org.joda.time.Days days13 = days4.dividedBy((int) (short) 1);
        org.joda.time.Days days15 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.Days days17 = days15.minus((int) '4');
        org.joda.time.Days days19 = days17.dividedBy((int) (short) 10);
        org.joda.time.Days days20 = org.joda.time.Days.FIVE;
        java.lang.String str21 = days20.toString();
        org.joda.time.Days days22 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType23 = days22.getPeriodType();
        org.joda.time.Days days25 = days22.minus(0);
        boolean boolean26 = days20.isLessThan(days25);
        java.lang.String str27 = days20.toString();
        org.joda.time.DurationFieldType durationFieldType28 = days20.getFieldType();
        org.joda.time.Days days29 = days19.plus(days20);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableDuration31);
        org.joda.time.Period period34 = period32.minusYears(0);
        org.joda.time.Days days35 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period32);
        boolean boolean36 = days29.isGreaterThan(days35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant37, readableDuration38);
        org.joda.time.Period period41 = period39.minusYears(0);
        org.joda.time.Days days42 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period39);
        int int43 = days42.getDays();
        org.joda.time.Days days44 = days29.minus(days42);
        org.joda.time.Days days45 = days13.plus(days29);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = days29.getValue((-18));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -18");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P5D" + "'", str5, "P5D");
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "P5D" + "'", str21, "P5D");
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "P5D" + "'", str27, "P5D");
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(days45);
    }

    @Test
    public void test20519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20519");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.withDays(8);
        int int3 = period0.getSeconds();
        int int4 = period0.getHours();
        org.joda.time.Duration duration5 = period0.toStandardDuration();
        org.joda.time.Duration duration8 = new org.joda.time.Duration((long) 776, (long) (-97));
        int int9 = duration5.compareTo((org.joda.time.ReadableDuration) duration8);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test20520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20520");
        org.joda.time.Days days1 = org.joda.time.Days.days(44);
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.Days days3 = org.joda.time.Days.ONE;
        int int4 = days2.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days3);
        org.joda.time.Days days6 = days3.multipliedBy((int) '#');
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        org.joda.time.Days days8 = days6.minus(days7);
        org.joda.time.Days days10 = days6.dividedBy(105);
        java.lang.String str11 = days10.toString();
        boolean boolean12 = days1.isLessThan(days10);
        org.joda.time.Days days13 = null;
        boolean boolean14 = days10.isGreaterThan(days13);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0D" + "'", str11, "P0D");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20521");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        org.joda.time.PeriodType periodType18 = periodType8.withDaysRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withSecondsRemoved();
        org.joda.time.PeriodType periodType20 = periodType19.withMillisRemoved();
        org.joda.time.PeriodType periodType21 = periodType19.withDaysRemoved();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test20522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20522");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(2400000L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test20523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20523");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes9 = minutes8.negated();
        org.joda.time.PeriodType periodType10 = minutes8.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Duration duration17 = minutes16.toStandardDuration();
        org.joda.time.Period period18 = duration17.toPeriod();
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period23 = period21.minusMonths(0);
        org.joda.time.Minutes minutes24 = period23.toStandardMinutes();
        org.joda.time.Duration duration25 = minutes24.toStandardDuration();
        org.joda.time.Minutes minutes27 = minutes24.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration28 = minutes24.toStandardDuration();
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period33 = period31.minusMonths(0);
        org.joda.time.Minutes minutes34 = period33.toStandardMinutes();
        org.joda.time.Duration duration35 = minutes34.toStandardDuration();
        org.joda.time.Period period36 = duration35.toPeriod();
        boolean boolean37 = duration28.isLongerThan((org.joda.time.ReadableDuration) duration35);
        boolean boolean38 = duration17.isEqual((org.joda.time.ReadableDuration) duration28);
        long long39 = duration17.getStandardMinutes();
        java.lang.String str40 = duration17.toString();
        long long41 = duration17.getMillis();
        org.joda.time.Minutes minutes42 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration43 = minutes42.toStandardDuration();
        long long44 = duration43.getStandardSeconds();
        org.joda.time.Period period47 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period49 = period47.minusMonths(0);
        org.joda.time.Minutes minutes50 = period49.toStandardMinutes();
        org.joda.time.Duration duration51 = minutes50.toStandardDuration();
        org.joda.time.Minutes minutes53 = minutes50.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration54 = minutes50.toStandardDuration();
        org.joda.time.Period period57 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period59 = period57.minusMonths(0);
        org.joda.time.Minutes minutes60 = period59.toStandardMinutes();
        org.joda.time.Duration duration61 = minutes60.toStandardDuration();
        org.joda.time.Period period62 = duration61.toPeriod();
        boolean boolean63 = duration54.isLongerThan((org.joda.time.ReadableDuration) duration61);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.days();
        org.joda.time.Period period66 = duration54.toPeriodTo(readableInstant64, periodType65);
        org.joda.time.Duration duration67 = duration43.plus((org.joda.time.ReadableDuration) duration54);
        org.joda.time.Duration duration68 = duration67.toDuration();
        org.joda.time.Minutes minutes69 = duration68.toStandardMinutes();
        boolean boolean70 = duration17.isEqual((org.joda.time.ReadableDuration) duration68);
        org.joda.time.Minutes minutes71 = duration17.toStandardMinutes();
        org.joda.time.Minutes minutes72 = minutes8.minus(minutes71);
        int int73 = minutes71.getMinutes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT0S" + "'", str40, "PT0S");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-128849018880L) + "'", long44 == (-128849018880L));
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(minutes60);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(minutes69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(minutes71);
        org.junit.Assert.assertNotNull(minutes72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test20524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20524");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.time();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter2.withParseType(periodType19);
        java.util.Locale locale21 = null;
        org.joda.time.format.PeriodFormatter periodFormatter22 = periodFormatter2.withLocale(locale21);
        org.joda.time.format.PeriodPrinter periodPrinter23 = periodFormatter22.getPrinter();
        java.util.Locale locale24 = periodFormatter22.getLocale();
        java.util.Locale locale25 = null;
        org.joda.time.format.PeriodFormatter periodFormatter26 = periodFormatter22.withLocale(locale25);
        org.joda.time.format.PeriodParser periodParser27 = periodFormatter22.getParser();
        org.joda.time.format.PeriodParser periodParser28 = periodFormatter22.getParser();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(100L, chronology30);
        org.joda.time.Days days32 = org.joda.time.Days.ONE;
        org.joda.time.Days days33 = org.joda.time.Days.ONE;
        int int34 = days32.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days33);
        org.joda.time.Days days36 = days33.multipliedBy((int) '#');
        org.joda.time.Period period37 = days36.toPeriod();
        boolean boolean38 = period31.equals((java.lang.Object) period37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = periodFormatter22.print((org.joda.time.ReadablePeriod) period37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertNull(periodPrinter23);
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertNotNull(periodFormatter26);
        org.junit.Assert.assertNull(periodParser27);
        org.junit.Assert.assertNull(periodParser28);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test20525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20525");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (-10));
        org.joda.time.Duration duration3 = duration1.minus((-128849018880000L));
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType4);
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str8 = seconds7.toString();
        org.joda.time.DurationFieldType durationFieldType9 = seconds7.getFieldType();
        org.joda.time.Duration duration10 = seconds7.toStandardDuration();
        org.joda.time.Period period11 = new org.joda.time.Period();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Duration duration14 = duration13.toDuration();
        long long15 = duration13.getStandardSeconds();
        long long16 = duration13.getMillis();
        boolean boolean17 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration18 = duration10.toDuration();
        org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) duration10);
        boolean boolean20 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration10);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT0S" + "'", str8, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test20526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20526");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        org.joda.time.Duration duration15 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration13, (int) (short) 100);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = duration6.toPeriod(chronology16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration6.toIntervalFrom(readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = duration6.toPeriodFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = duration6.toPeriodFrom(readableInstant22);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test20527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20527");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Period period7 = period3.minusSeconds((int) (byte) 100);
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.days();
        boolean boolean13 = periodType11.isSupported(durationFieldType12);
        int int14 = period3.get(durationFieldType12);
        org.joda.time.Period period16 = period3.withHours(1);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period3.toDurationTo(readableInstant17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration18);
        org.joda.time.Period period21 = period19.withYears((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period19.toDurationFrom(readableInstant22);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
    }

    @Test
    public void test20528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20528");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(4);
        org.joda.time.Weeks weeks2 = seconds1.toStandardWeeks();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test20529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20529");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.Period period6 = period4.plusMonths((int) (short) 1);
        org.joda.time.Duration duration7 = period4.toStandardDuration();
        org.joda.time.Minutes minutes8 = duration7.toStandardMinutes();
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration7);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(minutes8);
    }

    @Test
    public void test20530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20530");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        org.joda.time.Minutes minutes16 = minutes13.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration17 = minutes13.toStandardDuration();
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Minutes minutes23 = period22.toStandardMinutes();
        org.joda.time.Duration duration24 = minutes23.toStandardDuration();
        org.joda.time.Period period25 = duration24.toPeriod();
        boolean boolean26 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration24);
        boolean boolean27 = duration6.isEqual((org.joda.time.ReadableDuration) duration17);
        long long28 = duration6.getStandardMinutes();
        java.lang.String str29 = duration6.toString();
        long long30 = duration6.getMillis();
        org.joda.time.Minutes minutes31 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        long long33 = duration32.getStandardSeconds();
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period36.minusMonths(0);
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Duration duration40 = minutes39.toStandardDuration();
        org.joda.time.Minutes minutes42 = minutes39.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration43 = minutes39.toStandardDuration();
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period48 = period46.minusMonths(0);
        org.joda.time.Minutes minutes49 = period48.toStandardMinutes();
        org.joda.time.Duration duration50 = minutes49.toStandardDuration();
        org.joda.time.Period period51 = duration50.toPeriod();
        boolean boolean52 = duration43.isLongerThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.days();
        org.joda.time.Period period55 = duration43.toPeriodTo(readableInstant53, periodType54);
        org.joda.time.Duration duration56 = duration32.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Duration duration57 = duration56.toDuration();
        org.joda.time.Minutes minutes58 = duration57.toStandardMinutes();
        boolean boolean59 = duration6.isEqual((org.joda.time.ReadableDuration) duration57);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration57, readableInstant60);
        org.joda.time.Period period63 = period61.plusHours((int) (byte) 0);
        org.joda.time.Period period65 = period61.withSeconds((-2147483646));
        org.joda.time.Period period67 = period65.withMinutes((-3));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT0S" + "'", str29, "PT0S");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-128849018880L) + "'", long33 == (-128849018880L));
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
    }

    @Test
    public void test20531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20531");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P10D");
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.Days days5 = days2.plus((int) (byte) 100);
        boolean boolean6 = days1.isLessThan(days5);
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        java.lang.String str8 = days7.toString();
        org.joda.time.Days days10 = days7.minus(8);
        org.joda.time.Days days12 = days10.minus((-10));
        org.joda.time.Days days13 = days1.plus(days12);
        org.joda.time.Days days14 = org.joda.time.Days.FIVE;
        java.lang.String str15 = days14.toString();
        org.joda.time.Days days16 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        org.joda.time.Days days19 = days16.minus(0);
        boolean boolean20 = days14.isLessThan(days19);
        boolean boolean21 = days12.isGreaterThan(days14);
        org.joda.time.Days days23 = org.joda.time.Days.days(1);
        org.joda.time.Duration duration24 = days23.toStandardDuration();
        org.joda.time.Days days25 = duration24.toStandardDays();
        org.joda.time.Days days26 = org.joda.time.Days.ONE;
        org.joda.time.Days days27 = org.joda.time.Days.ONE;
        int int28 = days26.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days27);
        org.joda.time.Days days30 = days26.multipliedBy(8);
        boolean boolean31 = days25.isGreaterThan(days30);
        boolean boolean32 = days12.isLessThan(days25);
        org.joda.time.Days days34 = org.joda.time.Days.days((int) (byte) 10);
        boolean boolean35 = days12.isGreaterThan(days34);
        java.lang.String str36 = days34.toString();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P5D" + "'", str8, "P5D");
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P5D" + "'", str15, "P5D");
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "P10D" + "'", str36, "P10D");
    }

    @Test
    public void test20532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20532");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes10 = minutes8.multipliedBy(2);
        org.joda.time.Period period11 = minutes10.toPeriod();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Minutes minutes22 = minutes15.minus(minutes21);
        int int23 = minutes22.size();
        org.joda.time.Minutes minutes24 = minutes10.plus(minutes22);
        int int25 = minutes22.getMinutes();
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Minutes minutes33 = minutes31.dividedBy((int) (byte) 100);
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period36.minusMonths(0);
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Duration duration40 = minutes39.toStandardDuration();
        org.joda.time.Minutes minutes42 = minutes39.multipliedBy((int) (short) 1);
        int int43 = minutes42.getMinutes();
        boolean boolean44 = minutes33.isGreaterThan(minutes42);
        org.joda.time.Minutes minutes45 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period50 = period48.minusMonths(0);
        org.joda.time.Minutes minutes51 = period50.toStandardMinutes();
        org.joda.time.Minutes minutes53 = minutes51.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes54 = minutes45.minus(minutes51);
        org.joda.time.Period period57 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period59 = period57.minusMonths(0);
        org.joda.time.Minutes minutes60 = period59.toStandardMinutes();
        org.joda.time.Minutes minutes62 = minutes60.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((java.lang.Object) minutes60, chronology63);
        org.joda.time.Minutes minutes65 = minutes45.minus(minutes60);
        org.joda.time.DurationFieldType durationFieldType67 = minutes65.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType68 = minutes65.getPeriodType();
        boolean boolean69 = minutes42.isGreaterThan(minutes65);
        org.joda.time.DurationFieldType durationFieldType70 = minutes65.getFieldType();
        org.joda.time.Period period73 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Minutes minutes74 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period73);
        org.joda.time.Period period77 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period79 = period77.minusMonths(0);
        org.joda.time.Minutes minutes80 = period79.toStandardMinutes();
        org.joda.time.Minutes minutes81 = minutes74.minus(minutes80);
        org.joda.time.Minutes minutes83 = minutes80.minus((-36));
        boolean boolean84 = minutes65.isLessThan(minutes80);
        org.joda.time.Minutes minutes86 = minutes80.multipliedBy(105);
        boolean boolean87 = minutes22.isGreaterThan(minutes86);
        org.joda.time.Minutes minutes89 = minutes22.minus(87);
        int int90 = minutes89.getMinutes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(minutes45);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(minutes60);
        org.junit.Assert.assertNotNull(minutes62);
        org.junit.Assert.assertNotNull(minutes65);
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(durationFieldType70);
        org.junit.Assert.assertNotNull(minutes74);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(minutes80);
        org.junit.Assert.assertNotNull(minutes81);
        org.junit.Assert.assertNotNull(minutes83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(minutes86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(minutes89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-87) + "'", int90 == (-87));
    }

    @Test
    public void test20533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20533");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        java.lang.String str1 = weeks0.toString();
        int int2 = weeks0.size();
        org.joda.time.PeriodType periodType3 = weeks0.getPeriodType();
        org.joda.time.Weeks weeks4 = null;
        org.joda.time.Weeks weeks5 = weeks0.minus(weeks4);
        org.joda.time.Weeks weeks7 = weeks5.plus(2);
        org.joda.time.Weeks weeks9 = weeks5.multipliedBy(11);
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks12 = weeks10.dividedBy(1);
        org.joda.time.Weeks weeks14 = weeks10.dividedBy(8);
        java.lang.String str15 = weeks14.toString();
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks18 = weeks17.negated();
        org.joda.time.Weeks weeks19 = weeks14.minus(weeks17);
        org.joda.time.Weeks weeks20 = weeks9.minus(weeks19);
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.weeks((-10));
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.weeks(1);
        boolean boolean25 = weeks22.isGreaterThan(weeks24);
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) weeks22);
        org.joda.time.Duration duration27 = weeks26.toStandardDuration();
        int int28 = weeks26.size();
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeks((-95));
        org.joda.time.Weeks weeks32 = weeks30.plus((int) (short) 1);
        org.joda.time.Duration duration33 = weeks32.toStandardDuration();
        org.joda.time.Weeks weeks34 = org.joda.time.Weeks.ZERO;
        java.lang.String str35 = weeks34.toString();
        int int36 = weeks34.size();
        org.joda.time.Period period37 = weeks34.toPeriod();
        org.joda.time.Weeks weeks38 = weeks32.plus(weeks34);
        org.joda.time.Weeks weeks39 = weeks26.minus(weeks32);
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks42 = org.joda.time.Weeks.weeks(1);
        boolean boolean43 = weeks40.isGreaterThan(weeks42);
        org.joda.time.Weeks weeks44 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean45 = weeks42.isGreaterThan(weeks44);
        boolean boolean46 = weeks32.isLessThan(weeks42);
        org.joda.time.Weeks weeks48 = weeks32.minus((-2147483647));
        org.joda.time.Weeks weeks49 = weeks19.plus(weeks32);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0W" + "'", str1, "P0W");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P268435455W" + "'", str15, "P268435455W");
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "P0W" + "'", str35, "P0W");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(weeks48);
        org.junit.Assert.assertNotNull(weeks49);
    }

    @Test
    public void test20534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20534");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.TWO;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.Hours hours4 = org.joda.time.Hours.hours(2147483647);
        boolean boolean5 = hours1.isGreaterThan(hours4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableDuration7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationTo(readableInstant9);
        org.joda.time.Hours hours11 = duration10.toStandardHours();
        org.joda.time.Hours hours13 = hours11.dividedBy(999);
        org.joda.time.Hours hours14 = hours1.minus(hours13);
        org.joda.time.Hours hours16 = hours13.plus((-2));
        org.joda.time.Hours hours18 = hours16.plus((-3));
        org.joda.time.MutablePeriod mutablePeriod19 = hours16.toMutablePeriod();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(mutablePeriod19);
    }

    @Test
    public void test20535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20535");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationFrom(readableInstant1);
        org.joda.time.Minutes minutes3 = period0.toStandardMinutes();
        org.joda.time.Minutes minutes5 = minutes3.multipliedBy(2147483647);
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        long long7 = duration6.getStandardMinutes();
        long long8 = duration6.getMillis();
        org.joda.time.Minutes minutes9 = duration6.toStandardMinutes();
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(minutes9);
    }

    @Test
    public void test20536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20536");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) 268435465);
        org.joda.time.Duration duration3 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration6 = duration3.plus((org.joda.time.ReadableDuration) duration5);
        org.joda.time.Period period7 = duration5.toPeriod();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period19 = period17.minusMonths(0);
        org.joda.time.Minutes minutes20 = period19.toStandardMinutes();
        org.joda.time.Duration duration21 = minutes20.toStandardDuration();
        boolean boolean22 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Period period23 = duration21.toPeriod();
        long long24 = duration21.getStandardSeconds();
        org.joda.time.Duration duration25 = duration21.toDuration();
        org.joda.time.Duration duration27 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration29 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration30 = duration27.plus((org.joda.time.ReadableDuration) duration29);
        long long31 = duration29.getMillis();
        int int32 = duration21.compareTo((org.joda.time.ReadableDuration) duration29);
        long long33 = duration29.getStandardDays();
        org.joda.time.Duration duration36 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration38 = duration36.plus((long) (-1));
        org.joda.time.Duration duration39 = duration29.plus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Duration duration40 = duration5.plus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Duration duration42 = duration40.minus((long) (-2));
        org.joda.time.Period period45 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period47 = period45.minusMonths(0);
        org.joda.time.Minutes minutes48 = period47.toStandardMinutes();
        org.joda.time.Duration duration49 = minutes48.toStandardDuration();
        org.joda.time.Minutes minutes51 = minutes48.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration52 = minutes48.toStandardDuration();
        org.joda.time.Period period55 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period56 = period55.negated();
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = period56.toDurationTo(readableInstant57);
        boolean boolean59 = duration52.isShorterThan((org.joda.time.ReadableDuration) duration58);
        org.joda.time.Duration duration62 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration63 = duration58.plus((org.joda.time.ReadableDuration) duration62);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Period period65 = duration63.toPeriodTo(readableInstant64);
        long long66 = duration63.getStandardSeconds();
        org.joda.time.Period period69 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period71 = period69.minusMonths(0);
        org.joda.time.Minutes minutes72 = period71.toStandardMinutes();
        org.joda.time.Duration duration73 = minutes72.toStandardDuration();
        org.joda.time.Period period76 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period78 = period76.minusMonths(0);
        org.joda.time.Minutes minutes79 = period78.toStandardMinutes();
        org.joda.time.Duration duration80 = minutes79.toStandardDuration();
        boolean boolean81 = duration73.isShorterThan((org.joda.time.ReadableDuration) duration80);
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.ReadableInstant readableInstant83 = null;
        org.joda.time.Duration duration84 = new org.joda.time.Duration(readableInstant82, readableInstant83);
        org.joda.time.Duration duration85 = duration73.minus((org.joda.time.ReadableDuration) duration84);
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.Period period87 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration73, readableInstant86);
        org.joda.time.Period period88 = duration73.toPeriod();
        org.joda.time.Duration duration90 = org.joda.time.Duration.standardDays(1L);
        boolean boolean91 = duration73.isEqual((org.joda.time.ReadableDuration) duration90);
        org.joda.time.Duration duration92 = duration63.minus((org.joda.time.ReadableDuration) duration90);
        org.joda.time.Duration duration93 = duration40.plus((org.joda.time.ReadableDuration) duration92);
        boolean boolean94 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration93);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 6000000L + "'", long31 == 6000000L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(minutes72);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(minutes79);
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(duration85);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(duration90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(duration92);
        org.junit.Assert.assertNotNull(duration93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test20537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20537");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.PeriodType periodType3 = seconds0.getPeriodType();
        int int4 = seconds0.size();
        org.joda.time.PeriodType periodType5 = seconds0.getPeriodType();
        org.joda.time.Seconds seconds7 = seconds0.minus((int) (byte) -1);
        org.joda.time.Seconds seconds9 = seconds7.dividedBy((int) (byte) 100);
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds12 = seconds10.minus((int) 'a');
        boolean boolean13 = seconds9.isLessThan(seconds10);
        java.lang.String str14 = seconds10.toString();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT2S" + "'", str14, "PT2S");
    }

    @Test
    public void test20538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20538");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(6000000L, chronology1);
    }

    @Test
    public void test20539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20539");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType2 = days0.getFieldType();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test20540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20540");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.Duration duration18 = duration6.minus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant19);
        org.joda.time.Period period21 = duration6.toPeriod();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = duration6.toPeriodTo(readableInstant22);
        org.joda.time.Period period24 = period23.normalizedStandard();
        org.joda.time.Period period26 = period23.withHours((int) (short) 0);
        int int27 = period26.getYears();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test20541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20541");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Period period9 = period5.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType10 = period5.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withMinutesRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withHoursRemoved();
        int int14 = periodType11.size();
        org.joda.time.Period period15 = new org.joda.time.Period((long) 1, periodType11);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType11);
        org.joda.time.Period period17 = period16.toPeriod();
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test20542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20542");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        int int2 = weeks1.getWeeks();
        org.joda.time.Period period3 = weeks1.toPeriod();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        boolean boolean7 = weeks4.isLessThan(weeks6);
        boolean boolean8 = weeks1.equals((java.lang.Object) weeks6);
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks11 = weeks10.negated();
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeksIn(readableInterval13);
        boolean boolean15 = weeks12.isLessThan(weeks14);
        boolean boolean16 = weeks11.isGreaterThan(weeks14);
        org.joda.time.Weeks weeks17 = null;
        org.joda.time.Weeks weeks18 = weeks14.minus(weeks17);
        org.joda.time.DurationFieldType durationFieldType19 = weeks18.getFieldType();
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks23 = weeks22.negated();
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.weeksIn(readableInterval25);
        boolean boolean27 = weeks24.isLessThan(weeks26);
        boolean boolean28 = weeks23.isGreaterThan(weeks26);
        boolean boolean29 = weeks20.isLessThan(weeks23);
        org.joda.time.Weeks weeks30 = weeks18.plus(weeks23);
        int int31 = weeks30.getWeeks();
        org.joda.time.Weeks weeks33 = org.joda.time.Weeks.weeks(1);
        int int34 = weeks33.getWeeks();
        org.joda.time.Period period35 = weeks33.toPeriod();
        org.joda.time.Weeks weeks36 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.Weeks weeks38 = org.joda.time.Weeks.weeksIn(readableInterval37);
        boolean boolean39 = weeks36.isLessThan(weeks38);
        boolean boolean40 = weeks33.equals((java.lang.Object) weeks38);
        org.joda.time.Weeks weeks42 = weeks38.multipliedBy((int) (short) 1);
        boolean boolean43 = weeks30.isGreaterThan(weeks38);
        boolean boolean44 = weeks6.isLessThan(weeks30);
        org.joda.time.Weeks weeks45 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks47 = org.joda.time.Weeks.weeks(1);
        boolean boolean48 = weeks45.isGreaterThan(weeks47);
        java.lang.Object obj49 = null;
        boolean boolean50 = weeks47.equals(obj49);
        org.joda.time.Weeks weeks52 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks54 = weeks52.dividedBy(100);
        org.joda.time.Weeks weeks55 = weeks47.minus(weeks54);
        org.joda.time.Weeks weeks57 = weeks54.plus(35);
        org.joda.time.Weeks weeks59 = weeks54.multipliedBy(10);
        org.joda.time.Duration duration60 = weeks54.toStandardDuration();
        org.joda.time.Weeks weeks62 = weeks54.multipliedBy((int) (short) 100);
        org.joda.time.Weeks weeks64 = weeks62.dividedBy(14400);
        org.joda.time.Weeks weeks66 = weeks62.plus(268435455);
        org.joda.time.ReadableInterval readableInterval67 = null;
        org.joda.time.Weeks weeks68 = org.joda.time.Weeks.weeksIn(readableInterval67);
        org.joda.time.Weeks weeks70 = weeks68.plus(11);
        boolean boolean71 = weeks62.isLessThan(weeks70);
        java.lang.String str72 = weeks70.toString();
        org.joda.time.Weeks weeks74 = org.joda.time.Weeks.weeks(100);
        org.joda.time.Weeks weeks75 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks77 = weeks75.dividedBy(1);
        org.joda.time.PeriodType periodType78 = weeks77.getPeriodType();
        org.joda.time.Weeks weeks79 = weeks74.minus(weeks77);
        org.joda.time.Weeks weeks80 = weeks70.minus(weeks74);
        org.joda.time.Weeks weeks81 = weeks30.plus(weeks74);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(weeks52);
        org.junit.Assert.assertNotNull(weeks54);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertNotNull(weeks57);
        org.junit.Assert.assertNotNull(weeks59);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(weeks62);
        org.junit.Assert.assertNotNull(weeks64);
        org.junit.Assert.assertNotNull(weeks66);
        org.junit.Assert.assertNotNull(weeks68);
        org.junit.Assert.assertNotNull(weeks70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "P11W" + "'", str72, "P11W");
        org.junit.Assert.assertNotNull(weeks74);
        org.junit.Assert.assertNotNull(weeks75);
        org.junit.Assert.assertNotNull(weeks77);
        org.junit.Assert.assertNotNull(periodType78);
        org.junit.Assert.assertNotNull(weeks79);
        org.junit.Assert.assertNotNull(weeks80);
        org.junit.Assert.assertNotNull(weeks81);
    }

    @Test
    public void test20543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20543");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration11 = duration8.plus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration4.withDurationAdded((org.joda.time.ReadableDuration) duration11, (int) (byte) 0);
        org.joda.time.Period period14 = duration4.toPeriod();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = duration4.toPeriod(chronology15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration4.toIntervalTo(readableInstant17);
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval18);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(minutes19);
    }

    @Test
    public void test20544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20544");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(104);
        org.joda.time.Period period2 = period1.toPeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
    }

    @Test
    public void test20545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20545");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str2 = periodType1.getName();
        int int3 = periodType1.size();
        org.joda.time.PeriodType periodType4 = periodType1.withMillisRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((-2000L), periodType1);
        int int6 = periodType1.size();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "YearMonthDay" + "'", str2, "YearMonthDay");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test20546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20546");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 999, (long) (-118));
    }

    @Test
    public void test20547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20547");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksIn(readableInterval1);
        boolean boolean3 = weeks0.isLessThan(weeks2);
        org.joda.time.Weeks weeks5 = weeks2.multipliedBy((int) (short) 100);
        org.joda.time.Weeks weeks6 = weeks2.negated();
        org.joda.time.DurationFieldType durationFieldType7 = weeks6.getFieldType();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test20548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20548");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT-604800S");
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test20549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20549");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.PeriodType periodType8 = periodFormatter7.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter9 = periodFormatter7.getPrinter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNull(periodPrinter9);
    }

    @Test
    public void test20550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20550");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(7);
        org.joda.time.Hours hours3 = hours1.plus((int) (byte) 1);
        org.joda.time.Hours hours4 = hours1.negated();
        org.joda.time.Hours hours6 = hours1.plus((int) (short) 1);
        org.joda.time.Hours hours7 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours8 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours10 = hours8.dividedBy(100);
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Period period17 = period15.minusSeconds(0);
        org.joda.time.Period period18 = period17.normalizedStandard();
        org.joda.time.Hours hours19 = period18.toStandardHours();
        boolean boolean20 = hours10.isLessThan(hours19);
        boolean boolean21 = hours7.isLessThan(hours10);
        org.joda.time.Duration duration22 = hours10.toStandardDuration();
        org.joda.time.PeriodType periodType23 = hours10.getPeriodType();
        org.joda.time.Hours hours24 = hours6.minus(hours10);
        org.joda.time.DurationFieldType durationFieldType25 = hours10.getFieldType();
        org.joda.time.Chronology chronology26 = null;
        boolean boolean27 = durationFieldType25.isSupported(chronology26);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test20551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20551");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withLocale(locale7);
        boolean boolean9 = periodFormatter8.isPrinter();
        org.joda.time.Period period11 = org.joda.time.Period.millis(0);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        boolean boolean13 = period11.isSupported(durationFieldType12);
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.ZERO;
        java.lang.String str15 = weeks14.toString();
        int int16 = weeks14.size();
        org.joda.time.PeriodType periodType17 = weeks14.getPeriodType();
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) period11, periodType17);
        org.joda.time.PeriodType periodType19 = periodType17.withDaysRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter8.withParseType(periodType19);
        java.util.Locale locale21 = null;
        org.joda.time.format.PeriodFormatter periodFormatter22 = periodFormatter20.withLocale(locale21);
        org.joda.time.PeriodType periodType23 = periodFormatter22.getParseType();
        org.joda.time.PeriodType periodType24 = periodFormatter22.getParseType();
        java.io.Writer writer25 = null;
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks28 = org.joda.time.Weeks.weeks(1);
        boolean boolean29 = weeks26.isGreaterThan(weeks28);
        org.joda.time.DurationFieldType durationFieldType30 = weeks28.getFieldType();
        org.joda.time.Weeks weeks31 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.Weeks weeks33 = org.joda.time.Weeks.weeksIn(readableInterval32);
        boolean boolean34 = weeks31.isLessThan(weeks33);
        org.joda.time.Weeks weeks36 = weeks33.multipliedBy(10);
        org.joda.time.Weeks weeks37 = weeks28.minus(weeks33);
        int int38 = weeks37.getWeeks();
        org.joda.time.Weeks weeks40 = weeks37.multipliedBy(87);
        int int41 = weeks40.getWeeks();
        org.joda.time.Duration duration44 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration46 = duration44.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration46, readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Interval interval50 = duration46.toIntervalFrom(readableInstant49);
        org.joda.time.Weeks weeks51 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval50);
        org.joda.time.Weeks weeks52 = weeks40.minus(weeks51);
        org.joda.time.Weeks weeks54 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks55 = weeks54.negated();
        org.joda.time.DurationFieldType durationFieldType56 = weeks55.getFieldType();
        org.joda.time.Weeks weeks58 = weeks55.dividedBy(2147483647);
        org.joda.time.Weeks weeks59 = weeks52.minus(weeks55);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter22.printTo(writer25, (org.joda.time.ReadablePeriod) weeks52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0W" + "'", str15, "P0W");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 87 + "'", int41 == 87);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertNotNull(weeks52);
        org.junit.Assert.assertNotNull(weeks54);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertNotNull(weeks58);
        org.junit.Assert.assertNotNull(weeks59);
    }

    @Test
    public void test20552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20552");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes2 = minutes0.dividedBy((int) (byte) -1);
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        org.joda.time.Minutes minutes9 = period8.toStandardMinutes();
        org.joda.time.Minutes minutes11 = minutes9.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes12 = minutes3.minus(minutes9);
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Minutes minutes21 = minutes19.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes22 = minutes13.minus(minutes19);
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period27 = period25.minusMonths(0);
        org.joda.time.Minutes minutes28 = period27.toStandardMinutes();
        org.joda.time.Duration duration29 = minutes28.toStandardDuration();
        org.joda.time.Minutes minutes31 = minutes28.multipliedBy((int) (short) 1);
        int int32 = minutes13.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes31);
        org.joda.time.Minutes minutes33 = minutes12.plus(minutes31);
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period36.minusMonths(0);
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Duration duration40 = minutes39.toStandardDuration();
        org.joda.time.Minutes minutes42 = minutes39.multipliedBy((int) (short) 1);
        java.lang.String str43 = minutes42.toString();
        org.joda.time.Minutes minutes44 = minutes33.minus(minutes42);
        int int45 = minutes42.getMinutes();
        org.joda.time.Minutes minutes47 = minutes42.plus((-36));
        org.joda.time.Minutes minutes48 = minutes2.plus(minutes42);
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period53 = period51.minusMonths(0);
        org.joda.time.Minutes minutes54 = period53.toStandardMinutes();
        org.joda.time.Duration duration55 = minutes54.toStandardDuration();
        org.joda.time.Period period58 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period60 = period58.minusMonths(0);
        org.joda.time.Minutes minutes61 = period60.toStandardMinutes();
        org.joda.time.Duration duration62 = minutes61.toStandardDuration();
        boolean boolean63 = duration55.isShorterThan((org.joda.time.ReadableDuration) duration62);
        org.joda.time.Period period64 = duration62.toPeriod();
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Interval interval66 = duration62.toIntervalTo(readableInstant65);
        org.joda.time.Minutes minutes67 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval66);
        org.joda.time.Minutes minutes69 = minutes67.plus((-1680));
        org.joda.time.Minutes minutes70 = minutes2.minus(minutes67);
        org.joda.time.Period period71 = new org.joda.time.Period((java.lang.Object) minutes70);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PT0M" + "'", str43, "PT0M");
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(minutes61);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(minutes67);
        org.junit.Assert.assertNotNull(minutes69);
        org.junit.Assert.assertNotNull(minutes70);
    }

    @Test
    public void test20553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20553");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks3 = weeks1.dividedBy(100);
        org.joda.time.Weeks weeks4 = weeks1.negated();
        java.lang.String str5 = weeks4.toString();
        org.joda.time.DurationFieldType durationFieldType6 = weeks4.getFieldType();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P-1W" + "'", str5, "P-1W");
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test20554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20554");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = days0.multipliedBy((int) (byte) -1);
        org.joda.time.Days days4 = days0.negated();
        org.joda.time.Days days5 = org.joda.time.Days.ONE;
        org.joda.time.Days days6 = org.joda.time.Days.ONE;
        int int7 = days5.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days6);
        org.joda.time.Days days9 = days6.multipliedBy((int) '#');
        org.joda.time.Days days10 = days4.minus(days6);
        org.joda.time.Days days12 = days4.minus((int) 'a');
        org.joda.time.Days days14 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days16 = days14.multipliedBy((int) (short) 100);
        org.joda.time.Days days17 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        org.joda.time.Days days20 = days17.minus(0);
        org.joda.time.Days days21 = days14.minus(days20);
        java.lang.String str22 = days21.toString();
        org.joda.time.Days days23 = days21.negated();
        org.joda.time.Days days25 = days21.dividedBy(14402);
        org.joda.time.PeriodType periodType26 = days25.getPeriodType();
        org.joda.time.Days days27 = days4.plus(days25);
        org.joda.time.Days days29 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days31 = days29.multipliedBy((int) (short) 100);
        org.joda.time.Days days32 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType33 = days32.getPeriodType();
        org.joda.time.Days days35 = days32.minus(0);
        org.joda.time.Days days36 = days29.minus(days35);
        org.joda.time.Days days38 = days29.minus(35);
        org.joda.time.Days days40 = days29.plus(14400);
        org.joda.time.Days days42 = days29.plus((int) (short) 1);
        org.joda.time.Days days44 = days29.minus((-4083));
        org.joda.time.Days days46 = days44.plus((-38));
        org.joda.time.Days days47 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType48 = days47.getPeriodType();
        org.joda.time.Days days49 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType50 = days49.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType51 = days49.getFieldType();
        boolean boolean52 = days47.isLessThan(days49);
        org.joda.time.Days days53 = days46.plus(days49);
        org.joda.time.MutablePeriod mutablePeriod54 = days49.toMutablePeriod();
        boolean boolean55 = days25.isLessThan(days49);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "P0D" + "'", str22, "P0D");
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(days46);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(days53);
        org.junit.Assert.assertNotNull(mutablePeriod54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test20555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20555");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Period period8 = period6.plusSeconds(8);
        org.joda.time.Duration duration10 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration13 = duration10.plus((org.joda.time.ReadableDuration) duration12);
        boolean boolean14 = period6.equals((java.lang.Object) duration10);
        org.joda.time.Days days15 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Days days16 = days15.negated();
        org.joda.time.Days days18 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days20 = days18.multipliedBy((int) (short) 100);
        org.joda.time.Days days21 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType22 = days21.getPeriodType();
        org.joda.time.Days days24 = days21.minus(0);
        org.joda.time.Days days25 = days18.minus(days24);
        org.joda.time.PeriodType periodType26 = days18.getPeriodType();
        org.joda.time.Days days28 = days18.dividedBy((int) 'a');
        org.joda.time.Days days30 = days28.dividedBy((int) '4');
        org.joda.time.Days days32 = days30.dividedBy(7);
        boolean boolean33 = days15.isLessThan(days30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType35 = days30.getFieldType(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2147483647");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test20556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20556");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((-128849018880L));
        org.joda.time.Duration duration2 = duration1.toDuration();
        org.joda.time.Duration duration4 = duration1.plus(0L);
        org.joda.time.Duration duration6 = new org.joda.time.Duration(6000000L);
        org.joda.time.Minutes minutes7 = duration6.toStandardMinutes();
        boolean boolean8 = duration4.isEqual((org.joda.time.ReadableDuration) duration6);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test20557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20557");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT2M31.200S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20558");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Interval interval3 = duration1.toIntervalTo(readableInstant2);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval3);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(minutes4);
    }

    @Test
    public void test20559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20559");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(400);
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test20560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20560");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) (-2), 8L, periodType2, chronology3);
        org.joda.time.Seconds seconds5 = period4.toStandardSeconds();
        org.joda.time.Seconds seconds7 = seconds5.minus(59);
        org.joda.time.Seconds seconds9 = seconds7.minus((-268435465));
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
    }

    @Test
    public void test20561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20561");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Period period8 = duration7.toPeriod();
        org.joda.time.Duration duration10 = duration7.plus((long) (byte) 0);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.Period period12 = duration10.toPeriod();
        org.joda.time.Period period13 = period12.toPeriod();
        org.joda.time.Period period15 = period13.plusHours(3);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period13.toDurationFrom(readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = new org.joda.time.Duration(readableInstant18, readableInstant19);
        org.joda.time.Minutes minutes21 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration22 = minutes21.toStandardDuration();
        long long23 = duration22.getStandardSeconds();
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period28 = period26.minusMonths(0);
        org.joda.time.Minutes minutes29 = period28.toStandardMinutes();
        org.joda.time.Duration duration30 = minutes29.toStandardDuration();
        org.joda.time.Minutes minutes32 = minutes29.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration33 = minutes29.toStandardDuration();
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period36.minusMonths(0);
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Duration duration40 = minutes39.toStandardDuration();
        org.joda.time.Period period41 = duration40.toPeriod();
        boolean boolean42 = duration33.isLongerThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.days();
        org.joda.time.Period period45 = duration33.toPeriodTo(readableInstant43, periodType44);
        org.joda.time.Duration duration46 = duration22.plus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Period period49 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period51 = period49.minusMonths(0);
        org.joda.time.Minutes minutes52 = period51.toStandardMinutes();
        org.joda.time.Duration duration53 = minutes52.toStandardDuration();
        org.joda.time.Period period56 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period58 = period56.minusMonths(0);
        org.joda.time.Minutes minutes59 = period58.toStandardMinutes();
        org.joda.time.Duration duration60 = minutes59.toStandardDuration();
        boolean boolean61 = duration53.isShorterThan((org.joda.time.ReadableDuration) duration60);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration60, readableInstant62);
        long long64 = duration60.getStandardHours();
        org.joda.time.Duration duration65 = duration33.minus((org.joda.time.ReadableDuration) duration60);
        int int66 = duration20.compareTo((org.joda.time.ReadableDuration) duration60);
        org.joda.time.Duration duration68 = duration60.minus((long) (byte) 1);
        org.joda.time.Period period71 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period72 = period71.negated();
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Duration duration74 = period72.toDurationTo(readableInstant73);
        int int75 = duration68.compareTo((org.joda.time.ReadableDuration) duration74);
        org.joda.time.Period period76 = duration74.toPeriod();
        boolean boolean77 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration74);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Period period79 = duration74.toPeriodTo(readableInstant78);
        org.joda.time.Duration duration81 = duration74.withMillis((long) (-612));
        org.joda.time.Duration duration84 = duration81.withDurationAdded((long) 200, 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-128849018880L) + "'", long23 == (-128849018880L));
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(minutes52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(duration81);
        org.junit.Assert.assertNotNull(duration84);
    }

    @Test
    public void test20562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20562");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.Period period6 = org.joda.time.Period.days(10);
        org.joda.time.Period period8 = period6.plusMonths((int) 'a');
        org.joda.time.Period period10 = period6.plusSeconds((int) (short) 100);
        org.joda.time.Period period12 = period10.minusMonths((int) 'a');
        org.joda.time.Period period13 = period2.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period15 = period13.withMonths((int) (byte) 1);
        org.joda.time.Period period16 = period15.toPeriod();
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds20 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds21 = seconds19.plus(seconds20);
        org.joda.time.Seconds seconds23 = seconds19.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds24 = seconds18.plus(seconds19);
        org.joda.time.Seconds seconds26 = seconds18.plus((int) '4');
        org.joda.time.Duration duration27 = seconds26.toStandardDuration();
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds30 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds31 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds32 = seconds30.plus(seconds31);
        org.joda.time.Seconds seconds34 = seconds30.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds35 = seconds29.plus(seconds30);
        org.joda.time.Seconds seconds37 = seconds29.plus((int) '4');
        org.joda.time.Duration duration38 = seconds37.toStandardDuration();
        boolean boolean39 = seconds26.isLessThan(seconds37);
        org.joda.time.Seconds seconds40 = seconds26.negated();
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period45 = period43.minusMonths(0);
        org.joda.time.Period period47 = period43.withMillis((int) (short) 0);
        int int48 = period47.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod49 = period47.toMutablePeriod();
        org.joda.time.Duration duration50 = period47.toStandardDuration();
        org.joda.time.Seconds seconds51 = duration50.toStandardSeconds();
        org.joda.time.Seconds seconds52 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds53 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds54 = seconds52.plus(seconds53);
        org.joda.time.Seconds seconds56 = seconds52.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds57 = seconds51.minus(seconds56);
        int int58 = seconds57.size();
        org.joda.time.Seconds seconds59 = seconds40.plus(seconds57);
        org.joda.time.DurationFieldType durationFieldType60 = seconds59.getFieldType();
        int int61 = period16.get(durationFieldType60);
        org.joda.time.Period period62 = period16.toPeriod();
        org.joda.time.Period period64 = period62.withMonths((int) (short) 100);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(seconds51);
        org.junit.Assert.assertNotNull(seconds52);
        org.junit.Assert.assertNotNull(seconds53);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertNotNull(seconds57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(seconds59);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
    }

    @Test
    public void test20563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20563");
        org.joda.time.Days days1 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        boolean boolean6 = periodType4.isSupported(durationFieldType5);
        org.joda.time.PeriodType periodType7 = periodType4.withMinutesRemoved();
        org.joda.time.Period period8 = new org.joda.time.Period((-128849018880L), periodType4);
        java.lang.String str9 = periodType4.toString();
        org.joda.time.PeriodType periodType10 = periodType4.withMinutesRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PeriodType[Days]" + "'", str9, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test20564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20564");
        org.joda.time.Period period4 = new org.joda.time.Period((int) ' ', (-200), (-200), (int) 'a');
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period9 = period7.minusMonths(0);
        org.joda.time.Period period11 = period9.minusSeconds(0);
        org.joda.time.Period period13 = period11.minusWeeks(10);
        org.joda.time.MutablePeriod mutablePeriod14 = period11.toMutablePeriod();
        int int16 = period11.getValue((int) (byte) 1);
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.weeks(1);
        boolean boolean20 = weeks17.isGreaterThan(weeks19);
        org.joda.time.DurationFieldType durationFieldType21 = weeks19.getFieldType();
        org.joda.time.Period period23 = period11.withFieldAdded(durationFieldType21, 2147483647);
        org.joda.time.Period period25 = period4.withField(durationFieldType21, 97);
        org.joda.time.Period period27 = period25.plusDays(244983);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(mutablePeriod14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
    }

    @Test
    public void test20565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20565");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.PeriodType periodType3 = seconds0.getPeriodType();
        int int4 = seconds0.size();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.seconds((int) (byte) 10);
        boolean boolean8 = seconds6.equals((java.lang.Object) "PeriodType[StandardNoMinutes]");
        org.joda.time.Seconds seconds9 = seconds0.plus(seconds6);
        org.joda.time.Seconds seconds11 = seconds6.dividedBy((int) (short) -1);
        org.joda.time.Duration duration12 = seconds6.toStandardDuration();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test20566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20566");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period1 = period0.toPeriod();
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period0.toDurationTo(readableInstant2);
        org.joda.time.Duration duration4 = duration3.toDuration();
        org.joda.time.Seconds seconds5 = duration3.toStandardSeconds();
        org.joda.time.Period period6 = seconds5.toPeriod();
        org.joda.time.Period period8 = period6.plusWeeks(44);
        org.joda.time.Period period9 = period6.toPeriod();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test20567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20567");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        boolean boolean6 = weeks3.isLessThan(weeks5);
        boolean boolean7 = weeks2.isGreaterThan(weeks5);
        org.joda.time.Weeks weeks8 = null;
        org.joda.time.Weeks weeks9 = weeks5.minus(weeks8);
        org.joda.time.Duration duration10 = weeks5.toStandardDuration();
        org.joda.time.PeriodType periodType11 = weeks5.getPeriodType();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test20568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20568");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Period period7 = period3.withMillis((int) (short) 0);
        int int8 = period7.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod9 = period7.toMutablePeriod();
        org.joda.time.Duration duration10 = period7.toStandardDuration();
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType12 = seconds11.getFieldType();
        org.joda.time.Seconds seconds13 = seconds11.negated();
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.seconds((int) '#');
        int int16 = seconds15.getSeconds();
        org.joda.time.Seconds seconds18 = seconds15.dividedBy((int) (short) 1);
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds20 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds21 = seconds19.plus(seconds20);
        java.lang.String str22 = seconds19.toString();
        org.joda.time.DurationFieldType durationFieldType23 = seconds19.getFieldType();
        org.joda.time.Seconds seconds25 = seconds19.multipliedBy(0);
        org.joda.time.Seconds seconds26 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration27 = seconds26.toStandardDuration();
        boolean boolean28 = seconds25.isGreaterThan(seconds26);
        org.joda.time.DurationFieldType durationFieldType30 = seconds25.getFieldType((int) (short) 0);
        boolean boolean31 = seconds18.isGreaterThan(seconds25);
        org.joda.time.Seconds seconds32 = seconds13.minus(seconds25);
        org.joda.time.Duration duration33 = seconds25.toStandardDuration();
        org.joda.time.Duration duration35 = org.joda.time.Duration.standardMinutes((long) 7);
        org.joda.time.Duration duration36 = org.joda.time.Duration.ZERO;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration36, readableInstant37);
        long long39 = duration36.getStandardHours();
        org.joda.time.Duration duration41 = duration36.withMillis((-60L));
        boolean boolean42 = duration35.isLongerThan((org.joda.time.ReadableDuration) duration36);
        boolean boolean43 = duration33.isEqual((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration36);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT2S" + "'", str22, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test20569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20569");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        int int3 = period2.getYears();
        org.joda.time.Period period5 = period2.minusSeconds(1);
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Minutes minutes14 = minutes12.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes15 = minutes6.minus(minutes12);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Minutes minutes23 = minutes21.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) minutes21, chronology24);
        org.joda.time.Minutes minutes26 = minutes6.minus(minutes21);
        org.joda.time.Minutes minutes28 = org.joda.time.Minutes.minutes(2147483647);
        org.joda.time.Minutes minutes29 = minutes26.minus(minutes28);
        org.joda.time.DurationFieldType durationFieldType30 = minutes28.getFieldType();
        org.joda.time.DurationFieldType durationFieldType31 = minutes28.getFieldType();
        org.joda.time.Period period33 = period2.withField(durationFieldType31, (int) '4');
        int int34 = period2.getMonths();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test20570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20570");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        org.joda.time.Duration duration15 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration13, (int) (short) 100);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardSeconds((long) 0);
        java.lang.String str18 = duration17.toString();
        org.joda.time.Duration duration20 = duration17.minus((long) 10);
        boolean boolean21 = duration13.isEqual((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = duration17.toPeriodTo(readableInstant22);
        long long24 = duration17.getStandardSeconds();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT0S" + "'", str18, "PT0S");
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test20571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20571");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.time();
        org.joda.time.PeriodType periodType2 = periodType1.withDaysRemoved();
        org.joda.time.Period period3 = new org.joda.time.Period(7730941129200000L, periodType1);
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        java.lang.String str5 = periodType4.toString();
        java.lang.String str6 = periodType4.getName();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PeriodType[Time]" + "'", str5, "PeriodType[Time]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
    }

    @Test
    public void test20572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20572");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 14400, (long) 59);
    }

    @Test
    public void test20573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20573");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (-2147483648));
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) (-2147483648));
        org.joda.time.Duration duration4 = duration1.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration6 = duration1.withMillis((long) 3);
        long long7 = duration6.getStandardMinutes();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test20574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20574");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.Seconds seconds4 = seconds1.plus((int) (byte) 0);
        org.joda.time.Seconds seconds6 = seconds1.minus(8);
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds11 = seconds9.multipliedBy(10);
        org.joda.time.Seconds seconds12 = seconds8.minus(seconds9);
        org.joda.time.Seconds seconds13 = seconds6.minus(seconds9);
        org.joda.time.Seconds seconds15 = seconds13.dividedBy(56);
        org.joda.time.Seconds seconds17 = seconds15.minus((-20));
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
    }

    @Test
    public void test20575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20575");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationFrom(readableInstant1);
        org.joda.time.Duration duration3 = duration2.toDuration();
        long long4 = duration2.getStandardSeconds();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(chronology5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration2.toIntervalTo(readableInstant7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = duration2.toPeriod(chronology9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationTo(readableInstant11);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test20576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20576");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        boolean boolean15 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Duration duration17 = duration7.plus((long) (short) 10);
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        int int23 = period22.getYears();
        org.joda.time.Period period25 = period22.plusYears((int) ' ');
        boolean boolean26 = duration17.equals((java.lang.Object) period25);
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period31 = period29.minusMonths(0);
        org.joda.time.Minutes minutes32 = period31.toStandardMinutes();
        org.joda.time.Duration duration33 = minutes32.toStandardDuration();
        org.joda.time.Period period34 = duration33.toPeriod();
        org.joda.time.Duration duration36 = duration33.plus((long) (byte) 0);
        org.joda.time.Duration duration38 = duration33.withMillis((long) 1);
        boolean boolean39 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration33);
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType41 = periodType40.withYearsRemoved();
        org.joda.time.PeriodType periodType42 = periodType41.withWeeksRemoved();
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration33, periodType41);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
    }

    @Test
    public void test20577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20577");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.Seconds seconds4 = seconds1.plus((int) (byte) 0);
        org.joda.time.Seconds seconds6 = seconds1.minus(8);
        org.joda.time.DurationFieldType durationFieldType7 = seconds1.getFieldType();
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds11 = seconds9.multipliedBy(10);
        org.joda.time.Seconds seconds12 = seconds8.minus(seconds9);
        org.joda.time.Seconds seconds13 = seconds1.plus(seconds12);
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Period period20 = period16.withMillis((int) (short) 0);
        int int21 = period20.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod22 = period20.toMutablePeriod();
        org.joda.time.Duration duration23 = period20.toStandardDuration();
        org.joda.time.Seconds seconds24 = duration23.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType25 = seconds24.getFieldType();
        org.joda.time.Seconds seconds26 = seconds1.plus(seconds24);
        org.joda.time.Seconds seconds27 = seconds1.negated();
        org.joda.time.Duration duration30 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration32 = duration30.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Interval interval36 = duration32.toIntervalFrom(readableInstant35);
        org.joda.time.Seconds seconds37 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval36);
        org.joda.time.Seconds seconds39 = seconds37.plus(0);
        org.joda.time.PeriodType periodType40 = seconds37.getPeriodType();
        org.joda.time.Seconds seconds41 = seconds37.negated();
        org.joda.time.Seconds seconds42 = seconds27.plus(seconds37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds44 = seconds27.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(seconds41);
        org.junit.Assert.assertNotNull(seconds42);
    }

    @Test
    public void test20578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20578");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        boolean boolean17 = duration9.isShorterThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = new org.joda.time.Duration(readableInstant18, readableInstant19);
        org.joda.time.Duration duration21 = duration9.minus((org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant22);
        org.joda.time.Duration duration25 = duration9.plus((long) 8);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Interval interval27 = duration25.toIntervalFrom(readableInstant26);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period32 = period30.minusMonths(0);
        org.joda.time.Minutes minutes33 = period32.toStandardMinutes();
        org.joda.time.Duration duration34 = minutes33.toStandardDuration();
        org.joda.time.Period period37 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period39 = period37.minusMonths(0);
        org.joda.time.Minutes minutes40 = period39.toStandardMinutes();
        org.joda.time.Duration duration41 = minutes40.toStandardDuration();
        boolean boolean42 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Duration duration44 = duration34.plus((long) (short) 10);
        org.joda.time.Duration duration46 = duration25.withDurationAdded((org.joda.time.ReadableDuration) duration44, (int) (byte) 0);
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration46);
        org.joda.time.Duration duration48 = duration46.toDuration();
        org.joda.time.Minutes minutes49 = duration46.toStandardMinutes();
        org.joda.time.Duration duration51 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration46, (int) (byte) 0);
        org.joda.time.Duration duration53 = duration1.plus((long) 6);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Period period55 = duration53.toPeriod(chronology54);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period55);
    }

    @Test
    public void test20579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20579");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Minutes minutes9 = minutes6.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration10 = minutes6.toStandardDuration();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Duration duration17 = minutes16.toStandardDuration();
        org.joda.time.Period period18 = duration17.toPeriod();
        boolean boolean19 = duration10.isLongerThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.days();
        org.joda.time.Period period22 = duration10.toPeriodTo(readableInstant20, periodType21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant23);
        long long25 = duration10.getStandardMinutes();
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Period period31 = period28.normalizedStandard();
        org.joda.time.Period period33 = period28.minusMinutes((int) '#');
        int int34 = period33.size();
        org.joda.time.PeriodType periodType35 = period33.getPeriodType();
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration10, periodType35);
        org.joda.time.Period period38 = period36.plusHours((int) (short) 0);
        org.joda.time.Period period40 = org.joda.time.Period.weeks(7);
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period45 = period43.minusMonths(0);
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.Duration duration47 = minutes46.toStandardDuration();
        org.joda.time.Minutes minutes49 = minutes46.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType50 = minutes46.getFieldType();
        org.joda.time.Period period52 = period40.withFieldAdded(durationFieldType50, (int) (byte) 1);
        org.joda.time.Period period54 = period40.minusMonths((-10));
        org.joda.time.Period period56 = period54.plusDays(10);
        org.joda.time.PeriodType periodType57 = period54.getPeriodType();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((java.lang.Object) period38, periodType57, chronology58);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(periodType57);
    }

    @Test
    public void test20580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20580");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period5 = period1.multipliedBy((int) (byte) 0);
        org.joda.time.Hours hours6 = period5.toStandardHours();
        org.joda.time.Period period8 = period5.minusDays((int) '4');
        org.joda.time.Period period10 = period8.minusYears((int) (short) -1);
        org.joda.time.Period period12 = period8.plusWeeks(87);
        org.joda.time.Period period14 = period12.minusMillis(3);
        org.joda.time.Period period16 = period14.plusSeconds((-35791394));
        org.joda.time.Hours hours17 = period14.toStandardHours();
        org.joda.time.Hours hours19 = hours17.plus((-105));
        org.joda.time.Hours hours21 = hours19.plus((-2147483596));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours21);
    }

    @Test
    public void test20581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20581");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-2), chronology1);
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = seconds6.plus(seconds7);
        org.joda.time.Seconds seconds10 = seconds6.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds11 = seconds5.plus(seconds6);
        org.joda.time.Seconds seconds13 = seconds5.plus((int) '4');
        org.joda.time.Duration duration14 = seconds13.toStandardDuration();
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds19 = seconds17.plus(seconds18);
        org.joda.time.Seconds seconds21 = seconds17.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds22 = seconds16.plus(seconds17);
        org.joda.time.Seconds seconds24 = seconds16.plus((int) '4');
        org.joda.time.Duration duration25 = seconds24.toStandardDuration();
        boolean boolean26 = seconds13.isLessThan(seconds24);
        boolean boolean27 = seconds3.isGreaterThan(seconds13);
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds30 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds31 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds32 = seconds30.plus(seconds31);
        org.joda.time.Seconds seconds34 = seconds30.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds35 = seconds29.plus(seconds30);
        org.joda.time.PeriodType periodType36 = seconds29.getPeriodType();
        org.joda.time.Seconds seconds37 = seconds3.plus(seconds29);
        org.joda.time.Seconds seconds39 = seconds3.plus(2);
        org.joda.time.Seconds seconds41 = org.joda.time.Seconds.parseSeconds("PT100S");
        org.joda.time.Duration duration44 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration46 = duration44.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration46, readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Interval interval50 = duration46.toIntervalFrom(readableInstant49);
        org.joda.time.Seconds seconds51 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval50);
        org.joda.time.Seconds seconds53 = seconds51.plus(0);
        org.joda.time.Seconds seconds54 = seconds41.plus(seconds53);
        org.joda.time.MutablePeriod mutablePeriod55 = seconds41.toMutablePeriod();
        org.joda.time.Seconds seconds56 = seconds3.minus(seconds41);
        org.joda.time.Period period57 = period2.plus((org.joda.time.ReadablePeriod) seconds56);
        java.lang.String str58 = seconds56.toString();
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertNotNull(seconds41);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(seconds51);
        org.junit.Assert.assertNotNull(seconds53);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(mutablePeriod55);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT-98S" + "'", str58, "PT-98S");
    }

    @Test
    public void test20582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20582");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(0);
        org.joda.time.PeriodType periodType2 = minutes1.getPeriodType();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        org.joda.time.Minutes minutes11 = minutes8.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes13 = minutes11.dividedBy((-36));
        org.joda.time.Period period15 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType17 = minutes16.getFieldType();
        int int18 = minutes16.getMinutes();
        org.joda.time.Minutes minutes19 = minutes11.minus(minutes16);
        org.joda.time.Minutes minutes20 = minutes16.negated();
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.minutes((int) (short) 1);
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period27 = period25.minusMonths(0);
        org.joda.time.Minutes minutes28 = period27.toStandardMinutes();
        org.joda.time.Duration duration29 = minutes28.toStandardDuration();
        org.joda.time.Minutes minutes31 = minutes28.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType32 = minutes28.getFieldType();
        org.joda.time.Minutes minutes33 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod34 = minutes33.toMutablePeriod();
        org.joda.time.Minutes minutes35 = minutes28.plus(minutes33);
        org.joda.time.Minutes minutes36 = minutes22.minus(minutes28);
        boolean boolean37 = minutes16.isLessThan(minutes36);
        org.joda.time.Period period40 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period42 = period40.minusMonths(0);
        org.joda.time.Minutes minutes43 = period42.toStandardMinutes();
        org.joda.time.Duration duration44 = minutes43.toStandardDuration();
        org.joda.time.Minutes minutes46 = minutes43.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration47 = minutes43.toStandardDuration();
        org.joda.time.Period period50 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period51 = period50.negated();
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period51.toDurationTo(readableInstant52);
        boolean boolean54 = duration47.isShorterThan((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Duration duration57 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration58 = duration53.plus((org.joda.time.ReadableDuration) duration57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Interval interval60 = duration57.toIntervalTo(readableInstant59);
        org.joda.time.Minutes minutes61 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval60);
        org.joda.time.Minutes minutes62 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval60);
        org.joda.time.Minutes minutes63 = minutes16.plus(minutes62);
        org.joda.time.Minutes minutes64 = minutes1.plus(minutes16);
        org.joda.time.Minutes minutes66 = minutes1.plus(35);
        org.joda.time.Period period67 = new org.joda.time.Period((java.lang.Object) minutes1);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14400 + "'", int18 == 14400);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(mutablePeriod34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(minutes61);
        org.junit.Assert.assertNotNull(minutes62);
        org.junit.Assert.assertNotNull(minutes63);
        org.junit.Assert.assertNotNull(minutes64);
        org.junit.Assert.assertNotNull(minutes66);
    }

    @Test
    public void test20583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20583");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        java.util.Locale locale18 = null;
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter2.withLocale(locale18);
        org.joda.time.format.PeriodParser periodParser20 = periodFormatter2.getParser();
        org.joda.time.format.PeriodParser periodParser21 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter22 = periodFormatter2.getPrinter();
        java.util.Locale locale23 = null;
        org.joda.time.format.PeriodFormatter periodFormatter24 = periodFormatter2.withLocale(locale23);
        java.util.Locale locale25 = null;
        org.joda.time.format.PeriodFormatter periodFormatter26 = periodFormatter2.withLocale(locale25);
        java.util.Locale locale27 = periodFormatter2.getLocale();
        boolean boolean28 = periodFormatter2.isParser();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNull(periodParser20);
        org.junit.Assert.assertNull(periodParser21);
        org.junit.Assert.assertNull(periodPrinter22);
        org.junit.Assert.assertNotNull(periodFormatter24);
        org.junit.Assert.assertNotNull(periodFormatter26);
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test20584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20584");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withSecondsRemoved();
        org.joda.time.Period period8 = duration2.toPeriodFrom(readableInstant3, periodType5);
        long long9 = duration2.getStandardHours();
        long long10 = duration2.getMillis();
        java.lang.String str11 = duration2.toString();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Period period18 = period14.minusSeconds((int) (byte) 100);
        org.joda.time.Days days19 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType20 = days19.getPeriodType();
        org.joda.time.PeriodType periodType21 = periodType20.withHoursRemoved();
        org.joda.time.PeriodType periodType22 = periodType20.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.days();
        boolean boolean24 = periodType22.isSupported(durationFieldType23);
        int int25 = period14.get(durationFieldType23);
        org.joda.time.Period period27 = period14.withHours(1);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period32 = period30.minusMonths(0);
        org.joda.time.Period period34 = period30.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType35 = period30.getPeriodType();
        org.joda.time.PeriodType periodType36 = periodType35.withMinutesRemoved();
        java.lang.String str37 = periodType36.toString();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) period14, periodType36, chronology38);
        org.joda.time.PeriodType periodType40 = periodType36.withHoursRemoved();
        org.joda.time.PeriodType periodType41 = periodType36.withMillisRemoved();
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2, periodType41);
        org.joda.time.Period period44 = period42.withDays((-10));
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period42.toDurationFrom(readableInstant45);
        long long47 = duration46.getStandardSeconds();
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100000L + "'", long10 == 100000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT100S" + "'", str11, "PT100S");
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str37, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 100L + "'", long47 == 100L);
    }

    @Test
    public void test20585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20585");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        java.lang.String str12 = periodType11.toString();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter7.withParseType(periodType11);
        org.joda.time.format.PeriodPrinter periodPrinter14 = periodFormatter7.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = periodFormatter7.parsePeriod("P1D");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[Days]" + "'", str12, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNull(periodPrinter14);
    }

    @Test
    public void test20586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20586");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        java.lang.String str12 = periodType11.toString();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter7.withParseType(periodType11);
        org.joda.time.PeriodType periodType14 = periodFormatter13.getParseType();
        org.joda.time.format.PeriodParser periodParser15 = periodFormatter13.getParser();
        java.util.Locale locale16 = null;
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter13.withLocale(locale16);
        java.util.Locale locale18 = null;
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter17.withLocale(locale18);
        org.joda.time.format.PeriodParser periodParser20 = periodFormatter17.getParser();
        org.joda.time.PeriodType periodType21 = periodFormatter17.getParseType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[Days]" + "'", str12, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNull(periodParser15);
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNull(periodParser20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test20587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20587");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 105);
        org.joda.time.Duration duration3 = duration1.withMillis(999L);
        org.joda.time.Duration duration5 = duration3.minus((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period8 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period9 = period8.toPeriod();
        org.joda.time.Period period11 = period8.plusMinutes(1);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period8.toDurationTo(readableInstant12);
        org.joda.time.Seconds seconds14 = period8.toStandardSeconds();
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds17 = seconds15.plus(seconds16);
        java.lang.String str18 = seconds15.toString();
        org.joda.time.DurationFieldType durationFieldType19 = seconds15.getFieldType();
        org.joda.time.Seconds seconds21 = seconds15.multipliedBy(0);
        org.joda.time.Seconds seconds23 = seconds15.dividedBy((-1));
        org.joda.time.Seconds seconds24 = seconds14.plus(seconds23);
        org.joda.time.Seconds seconds25 = seconds14.negated();
        org.joda.time.PeriodType periodType26 = seconds25.getPeriodType();
        org.joda.time.PeriodType periodType27 = periodType26.withMillisRemoved();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant6, periodType26);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT2S" + "'", str18, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test20588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20588");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration4 = duration1.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration6 = duration1.minus((long) (-1));
        org.joda.time.Period period8 = org.joda.time.Period.millis((int) '#');
        int int9 = period8.getYears();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.Period period11 = period8.withFields(readablePeriod10);
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period14.negated();
        int int16 = period14.getHours();
        org.joda.time.Period period18 = org.joda.time.Period.days(10);
        org.joda.time.Period period20 = period18.plusMonths((int) 'a');
        org.joda.time.Period period22 = period18.plusSeconds((int) (short) 100);
        org.joda.time.Period period24 = period22.minusMonths((int) 'a');
        org.joda.time.Period period25 = period14.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period26 = period8.minus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period28 = period8.minusWeeks((int) (byte) 1);
        org.joda.time.Period period30 = period28.withMonths((-4083));
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        boolean boolean33 = duration6.equals((java.lang.Object) readableInstant31);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test20589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20589");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        org.joda.time.PeriodType periodType9 = days1.getPeriodType();
        org.joda.time.Days days11 = days1.dividedBy((int) 'a');
        org.joda.time.Days days13 = days11.dividedBy((int) '4');
        org.joda.time.Days days15 = days13.dividedBy(7);
        org.joda.time.Days days17 = days13.minus(0);
        org.joda.time.Days days18 = days17.negated();
        java.lang.Class<?> wildcardClass19 = days17.getClass();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test20590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20590");
        org.joda.time.Period period4 = new org.joda.time.Period((-100), (-2400), (int) (short) 1, (-49));
    }

    @Test
    public void test20591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20591");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Minutes minutes8 = minutes6.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes0.minus(minutes6);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Minutes minutes17 = minutes15.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) minutes15, chronology18);
        org.joda.time.Minutes minutes20 = minutes0.minus(minutes15);
        org.joda.time.DurationFieldType durationFieldType22 = minutes20.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType23 = minutes20.getPeriodType();
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period28 = period26.minusMonths(0);
        org.joda.time.Minutes minutes29 = period28.toStandardMinutes();
        org.joda.time.Minutes minutes31 = minutes29.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) minutes29, chronology32);
        boolean boolean34 = minutes20.isGreaterThan(minutes29);
        org.joda.time.Minutes minutes35 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period40 = period38.minusMonths(0);
        org.joda.time.Minutes minutes41 = period40.toStandardMinutes();
        org.joda.time.Minutes minutes43 = minutes41.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes44 = minutes35.minus(minutes41);
        org.joda.time.Period period47 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period49 = period47.minusMonths(0);
        org.joda.time.Minutes minutes50 = period49.toStandardMinutes();
        org.joda.time.Duration duration51 = minutes50.toStandardDuration();
        org.joda.time.Minutes minutes53 = minutes50.multipliedBy((int) (short) 1);
        int int54 = minutes35.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes53);
        boolean boolean55 = minutes29.isGreaterThan(minutes35);
        org.joda.time.Minutes minutes56 = org.joda.time.Minutes.THREE;
        boolean boolean57 = minutes29.isLessThan(minutes56);
        int int58 = minutes56.getMinutes();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
    }

    @Test
    public void test20592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20592");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes2 = minutes0.dividedBy((int) (byte) -1);
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        org.joda.time.Minutes minutes9 = period8.toStandardMinutes();
        org.joda.time.Minutes minutes11 = minutes9.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes12 = minutes3.minus(minutes9);
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period15.minusMonths(0);
        org.joda.time.Minutes minutes18 = period17.toStandardMinutes();
        org.joda.time.Minutes minutes20 = minutes18.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) minutes18, chronology21);
        org.joda.time.Minutes minutes23 = minutes3.minus(minutes18);
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period27 = period26.negated();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationTo(readableInstant28);
        org.joda.time.Minutes minutes30 = period27.toStandardMinutes();
        org.joda.time.PeriodType periodType31 = minutes30.getPeriodType();
        boolean boolean32 = minutes18.isLessThan(minutes30);
        org.joda.time.Period period35 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period37 = period35.minusMonths(0);
        org.joda.time.Minutes minutes38 = period37.toStandardMinutes();
        org.joda.time.Duration duration39 = minutes38.toStandardDuration();
        org.joda.time.Minutes minutes41 = minutes38.multipliedBy((int) (short) 1);
        int int42 = minutes41.getMinutes();
        boolean boolean43 = minutes18.isLessThan(minutes41);
        boolean boolean44 = minutes2.isGreaterThan(minutes41);
        org.joda.time.Minutes minutes46 = minutes2.multipliedBy((int) (short) 0);
        org.joda.time.Minutes minutes47 = minutes2.negated();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(minutes47);
    }

    @Test
    public void test20593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20593");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT-0.010S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20594");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period2);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        org.joda.time.Minutes minutes9 = period8.toStandardMinutes();
        org.joda.time.Minutes minutes11 = minutes9.dividedBy((int) (byte) 100);
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Minutes minutes17 = period16.toStandardMinutes();
        org.joda.time.Duration duration18 = minutes17.toStandardDuration();
        org.joda.time.Minutes minutes20 = minutes17.multipliedBy((int) (short) 1);
        int int21 = minutes20.getMinutes();
        boolean boolean22 = minutes11.isGreaterThan(minutes20);
        boolean boolean23 = minutes3.isLessThan(minutes20);
        org.joda.time.Minutes minutes25 = minutes20.dividedBy(100);
        org.joda.time.Minutes minutes26 = minutes20.negated();
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period31 = period29.minusMonths(0);
        org.joda.time.Minutes minutes32 = period31.toStandardMinutes();
        org.joda.time.Duration duration33 = minutes32.toStandardDuration();
        org.joda.time.Period period35 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes36 = period35.toStandardMinutes();
        org.joda.time.Minutes minutes38 = minutes36.multipliedBy(1);
        boolean boolean39 = minutes32.isGreaterThan(minutes38);
        org.joda.time.Period period42 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period44 = period42.minusMonths(0);
        org.joda.time.Minutes minutes45 = period44.toStandardMinutes();
        org.joda.time.Duration duration46 = minutes45.toStandardDuration();
        org.joda.time.Minutes minutes48 = minutes45.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes50 = minutes48.dividedBy((-36));
        org.joda.time.Period period52 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes53 = period52.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType54 = minutes53.getFieldType();
        int int55 = minutes53.getMinutes();
        org.joda.time.Minutes minutes56 = minutes48.minus(minutes53);
        int int57 = minutes56.getMinutes();
        org.joda.time.Minutes minutes58 = minutes32.minus(minutes56);
        org.joda.time.Minutes minutes59 = minutes20.plus(minutes32);
        org.joda.time.Minutes minutes60 = null;
        org.joda.time.Minutes minutes61 = minutes20.plus(minutes60);
        org.joda.time.Minutes minutes63 = minutes61.multipliedBy((-12));
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(minutes45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(durationFieldType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 14400 + "'", int55 == 14400);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-14400) + "'", int57 == (-14400));
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertNotNull(minutes61);
        org.junit.Assert.assertNotNull(minutes63);
    }

    @Test
    public void test20595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20595");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(3);
        org.joda.time.Minutes minutes3 = minutes1.multipliedBy((int) (byte) 0);
        org.joda.time.Minutes minutes5 = minutes3.minus(3104);
        org.joda.time.DurationFieldType durationFieldType6 = minutes3.getFieldType();
        org.joda.time.Chronology chronology7 = null;
        boolean boolean8 = durationFieldType6.isSupported(chronology7);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20596");
        org.joda.time.Period period4 = new org.joda.time.Period(7, (int) 'a', (-2147483646), 0);
        org.joda.time.Period period6 = period4.minusHours(35);
        org.joda.time.Period period8 = period6.withYears(1491308);
        org.joda.time.Period period10 = period8.plusMillis(13);
        org.joda.time.MutablePeriod mutablePeriod11 = period8.toMutablePeriod();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test20597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20597");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days5 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days7 = days5.multipliedBy((int) (short) 100);
        org.joda.time.Duration duration8 = days5.toStandardDuration();
        org.joda.time.Duration duration10 = new org.joda.time.Duration((long) (byte) -1);
        long long11 = duration10.getMillis();
        int int12 = duration8.compareTo((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration14 = duration10.plus((long) 59);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Period period22 = period20.minusSeconds(0);
        org.joda.time.Period period24 = period22.minusWeeks(10);
        org.joda.time.Period period25 = period22.negated();
        org.joda.time.Period period27 = period22.minusMillis((int) (short) 0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray28 = period22.getFieldTypes();
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.forFields(durationFieldTypeArray28);
        org.joda.time.Period period30 = duration14.toPeriodTo(readableInstant15, periodType29);
        org.joda.time.format.PeriodFormatter periodFormatter31 = periodFormatter2.withParseType(periodType29);
        org.joda.time.Days days32 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType33 = days32.getPeriodType();
        org.joda.time.PeriodType periodType34 = periodType33.withHoursRemoved();
        org.joda.time.PeriodType periodType35 = periodType33.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.days();
        boolean boolean37 = periodType35.isSupported(durationFieldType36);
        org.joda.time.format.PeriodFormatter periodFormatter38 = periodFormatter31.withParseType(periodType35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(durationFieldTypeArray28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodFormatter31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(periodFormatter38);
    }

    @Test
    public void test20598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20598");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod8 = period6.toMutablePeriod();
        org.joda.time.Duration duration9 = period6.toStandardDuration();
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds13 = seconds11.plus(seconds12);
        org.joda.time.Seconds seconds15 = seconds11.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds16 = seconds10.minus(seconds15);
        java.lang.String str17 = seconds10.toString();
        org.joda.time.Seconds seconds19 = seconds10.plus((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType20 = seconds19.getFieldType();
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Period period27 = period23.minusSeconds(100);
        org.joda.time.Seconds seconds28 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds30 = seconds28.multipliedBy((int) (byte) 100);
        org.joda.time.PeriodType periodType31 = seconds30.getPeriodType();
        org.joda.time.Seconds seconds33 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str34 = seconds33.toString();
        org.joda.time.Period period37 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period39 = period37.minusMonths(0);
        int int40 = period39.getYears();
        org.joda.time.Period period41 = period39.toPeriod();
        org.joda.time.Seconds seconds42 = period39.toStandardSeconds();
        boolean boolean43 = seconds33.isLessThan(seconds42);
        org.joda.time.Seconds seconds44 = seconds30.plus(seconds42);
        org.joda.time.Seconds seconds45 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds47 = seconds45.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType48 = seconds45.getFieldType();
        org.joda.time.Seconds seconds49 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds50 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds51 = seconds49.plus(seconds50);
        org.joda.time.Seconds seconds53 = seconds49.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds54 = seconds45.plus(seconds49);
        org.joda.time.Seconds seconds55 = seconds30.plus(seconds54);
        org.joda.time.Seconds seconds57 = org.joda.time.Seconds.seconds((int) (short) 0);
        int int58 = seconds57.getSeconds();
        boolean boolean59 = seconds54.isGreaterThan(seconds57);
        org.joda.time.Period period60 = period23.minus((org.joda.time.ReadablePeriod) seconds54);
        org.joda.time.Seconds seconds61 = seconds19.minus(seconds54);
        org.joda.time.Seconds seconds63 = org.joda.time.Seconds.seconds((int) '#');
        int int64 = seconds63.getSeconds();
        boolean boolean65 = seconds54.isGreaterThan(seconds63);
        org.joda.time.DurationFieldType durationFieldType66 = seconds54.getFieldType();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0S" + "'", str17, "PT0S");
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT0S" + "'", str34, "PT0S");
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertNotNull(seconds45);
        org.junit.Assert.assertNotNull(seconds47);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertNotNull(seconds49);
        org.junit.Assert.assertNotNull(seconds50);
        org.junit.Assert.assertNotNull(seconds51);
        org.junit.Assert.assertNotNull(seconds53);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(seconds55);
        org.junit.Assert.assertNotNull(seconds57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(seconds61);
        org.junit.Assert.assertNotNull(seconds63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 35 + "'", int64 == 35);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(durationFieldType66);
    }

    @Test
    public void test20599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20599");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        boolean boolean12 = periodType10.isSupported(durationFieldType11);
        int int13 = period2.get(durationFieldType11);
        org.joda.time.Period period15 = period2.withHours(1);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Period period22 = period18.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType23 = period18.getPeriodType();
        org.joda.time.PeriodType periodType24 = periodType23.withMinutesRemoved();
        java.lang.String str25 = periodType24.toString();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) period2, periodType24, chronology26);
        org.joda.time.Period period28 = period2.toPeriod();
        org.joda.time.format.PeriodPrinter periodPrinter29 = null;
        org.joda.time.format.PeriodParser periodParser30 = null;
        org.joda.time.format.PeriodFormatter periodFormatter31 = new org.joda.time.format.PeriodFormatter(periodPrinter29, periodParser30);
        boolean boolean32 = periodFormatter31.isParser();
        java.util.Locale locale33 = null;
        org.joda.time.format.PeriodFormatter periodFormatter34 = periodFormatter31.withLocale(locale33);
        org.joda.time.PeriodType periodType35 = periodFormatter31.getParseType();
        boolean boolean36 = periodFormatter31.isParser();
        boolean boolean37 = periodFormatter31.isParser();
        org.joda.time.format.PeriodPrinter periodPrinter38 = periodFormatter31.getPrinter();
        java.util.Locale locale39 = null;
        org.joda.time.format.PeriodFormatter periodFormatter40 = periodFormatter31.withLocale(locale39);
        org.joda.time.Seconds seconds41 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds43 = seconds41.multipliedBy((int) (byte) 100);
        org.joda.time.PeriodType periodType44 = seconds43.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter45 = periodFormatter31.withParseType(periodType44);
        org.joda.time.format.PeriodParser periodParser46 = periodFormatter31.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = period2.toString(periodFormatter31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str25, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(periodFormatter34);
        org.junit.Assert.assertNull(periodType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(periodPrinter38);
        org.junit.Assert.assertNotNull(periodFormatter40);
        org.junit.Assert.assertNotNull(seconds41);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodFormatter45);
        org.junit.Assert.assertNull(periodParser46);
    }

    @Test
    public void test20600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20600");
        org.joda.time.Period period2 = new org.joda.time.Period(1123200000L, (long) 999);
        org.joda.time.Period period4 = period2.minusMinutes((-38));
        org.joda.time.Period period6 = period2.withWeeks(40);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test20601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20601");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(13194000L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test20602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20602");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((-128849018880L));
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test20603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20603");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalFrom(readableInstant7);
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Period period10 = weeks9.toPeriod();
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeks(1);
        boolean boolean14 = weeks11.isGreaterThan(weeks13);
        org.joda.time.Weeks weeks15 = weeks9.minus(weeks11);
        org.joda.time.Weeks weeks16 = weeks9.negated();
        org.joda.time.Weeks weeks18 = weeks9.multipliedBy((-35));
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeks((-35));
        org.joda.time.Weeks weeks22 = weeks20.plus(11);
        org.joda.time.Weeks weeks23 = weeks18.plus(weeks22);
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.ZERO;
        java.lang.String str25 = weeks24.toString();
        int int26 = weeks24.size();
        org.joda.time.PeriodType periodType27 = weeks24.getPeriodType();
        org.joda.time.Weeks weeks29 = weeks24.minus(7);
        org.joda.time.Weeks weeks31 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks32 = weeks31.negated();
        org.joda.time.Weeks weeks33 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.Weeks weeks35 = org.joda.time.Weeks.weeksIn(readableInterval34);
        boolean boolean36 = weeks33.isLessThan(weeks35);
        boolean boolean37 = weeks32.isGreaterThan(weeks35);
        org.joda.time.Weeks weeks38 = null;
        org.joda.time.Weeks weeks39 = weeks35.minus(weeks38);
        org.joda.time.DurationFieldType durationFieldType40 = weeks39.getFieldType();
        org.joda.time.Weeks weeks41 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks43 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks44 = weeks43.negated();
        org.joda.time.Weeks weeks45 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.Weeks weeks47 = org.joda.time.Weeks.weeksIn(readableInterval46);
        boolean boolean48 = weeks45.isLessThan(weeks47);
        boolean boolean49 = weeks44.isGreaterThan(weeks47);
        boolean boolean50 = weeks41.isLessThan(weeks44);
        org.joda.time.Weeks weeks51 = weeks39.plus(weeks44);
        org.joda.time.Weeks weeks53 = weeks44.minus(2);
        org.joda.time.Weeks weeks55 = weeks53.dividedBy((-10));
        org.joda.time.Weeks weeks56 = weeks55.negated();
        org.joda.time.Weeks weeks57 = weeks24.plus(weeks55);
        java.lang.String str58 = weeks55.toString();
        org.joda.time.DurationFieldType durationFieldType59 = weeks55.getFieldType();
        boolean boolean60 = weeks18.isLessThan(weeks55);
        org.joda.time.PeriodType periodType61 = weeks18.getPeriodType();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "P0W" + "'", str25, "P0W");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertNotNull(weeks43);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertNotNull(weeks53);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertNotNull(weeks56);
        org.junit.Assert.assertNotNull(weeks57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "P0W" + "'", str58, "P0W");
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(periodType61);
    }

    @Test
    public void test20604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20604");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withYearsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType9 = periodType6.withMonthsRemoved();
        org.joda.time.PeriodType periodType10 = periodType6.withDaysRemoved();
        org.joda.time.PeriodType periodType11 = periodType6.withMinutesRemoved();
        org.junit.Assert.assertNotNull(days0);
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
    }

    @Test
    public void test20605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20605");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("millis");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"millis\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20606");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period5.toDurationFrom(readableInstant7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = duration8.toPeriod(chronology9);
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) 100);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Days days14 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType15 = days14.getPeriodType();
        org.joda.time.PeriodType periodType16 = periodType15.withHoursRemoved();
        org.joda.time.PeriodType periodType17 = periodType15.withSecondsRemoved();
        org.joda.time.PeriodType periodType18 = periodType15.withMinutesRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withWeeksRemoved();
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType19);
        org.joda.time.Duration duration21 = duration8.minus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, readableInstant22, periodType23);
        org.joda.time.Days days25 = duration12.toStandardDays();
        org.joda.time.Period period26 = days25.toPeriod();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test20607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20607");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(2147483647L, chronology1);
    }

    @Test
    public void test20608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20608");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period5 = period1.multipliedBy((int) (byte) 0);
        org.joda.time.Period period6 = period1.negated();
        org.joda.time.Period period8 = period1.minusYears(2147483639);
        int int9 = period8.size();
        org.joda.time.Days days11 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType12 = days11.getPeriodType();
        org.joda.time.PeriodType periodType13 = periodType12.withWeeksRemoved();
        org.joda.time.Period period14 = new org.joda.time.Period((long) (byte) -1, periodType13);
        org.joda.time.PeriodType periodType15 = periodType13.withMillisRemoved();
        org.joda.time.PeriodType periodType16 = periodType13.withMonthsRemoved();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType18 = periodType17.withYearsRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withMinutesRemoved();
        org.joda.time.PeriodType periodType20 = periodType19.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.halfdays();
        java.lang.String str22 = durationFieldType21.toString();
        int int23 = periodType20.indexOf(durationFieldType21);
        boolean boolean24 = periodType13.isSupported(durationFieldType21);
        org.joda.time.PeriodType periodType25 = periodType13.withMillisRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period26 = period8.normalizedStandard(periodType25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "halfdays" + "'", str22, "halfdays");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test20609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20609");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-5), chronology1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period2);
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test20610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20610");
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withDaysRemoved();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((-612L), periodType12, chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = new org.joda.time.Period((-214748364), (-36), (-100), (-2147483548), (-214748364), 377884, 0, (-2147483645), periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test20611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20611");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes10 = minutes8.multipliedBy(2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = minutes8.getValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
    }

    @Test
    public void test20612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20612");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        java.lang.String str12 = periodType11.toString();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter7.withParseType(periodType11);
        org.joda.time.PeriodType periodType14 = periodFormatter13.getParseType();
        org.joda.time.PeriodType periodType15 = periodFormatter13.getParseType();
        org.joda.time.PeriodType periodType16 = periodType15.withYearsRemoved();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[Days]" + "'", str12, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test20613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20613");
        org.joda.time.Period period8 = new org.joda.time.Period((-97), (-2147483648), 103, 2, (-4083), (-87), (-2147483646), (-2147483646));
        org.joda.time.Period period10 = period8.withMillis((-14370));
        org.joda.time.Period period12 = period10.plusMillis(87);
        org.joda.time.Hours hours13 = org.joda.time.Hours.EIGHT;
        int int14 = hours13.getHours();
        org.joda.time.Hours hours15 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours16 = hours13.minus(hours15);
        org.joda.time.Hours hours18 = hours13.multipliedBy((int) 'a');
        org.joda.time.Hours hours19 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours20 = org.joda.time.Hours.TWO;
        org.joda.time.Hours hours21 = hours19.minus(hours20);
        org.joda.time.Hours hours22 = hours18.minus(hours21);
        org.joda.time.Hours hours24 = hours21.dividedBy((-2147483646));
        org.joda.time.Period period25 = period12.minus((org.joda.time.ReadablePeriod) hours24);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test20614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20614");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) '#');
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        long long5 = duration4.getMillis();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        org.joda.time.PeriodType periodType12 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType13 = periodType12.withMinutesRemoved();
        org.joda.time.Period period14 = new org.joda.time.Period((long) (byte) 0, periodType13);
        org.joda.time.Period period15 = duration4.toPeriodFrom(readableInstant6, periodType13);
        java.lang.String str16 = duration4.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-92275200000L) + "'", long5 == (-92275200000L));
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT-92275200S" + "'", str16, "PT-92275200S");
    }

    @Test
    public void test20615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20615");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Days days3 = days0.plus((int) (byte) 100);
        org.joda.time.Duration duration4 = days3.toStandardDuration();
        org.joda.time.Duration duration6 = duration4.plus((-128849018880000L));
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant9);
        java.lang.String str11 = duration8.toString();
        org.joda.time.Duration duration13 = org.joda.time.Duration.millis((long) 36);
        int int14 = duration8.compareTo((org.joda.time.ReadableDuration) duration13);
        boolean boolean15 = duration6.isEqual((org.joda.time.ReadableDuration) duration13);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT10S" + "'", str11, "PT10S");
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test20616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20616");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str2 = periodType1.getName();
        boolean boolean4 = periodType1.equals((java.lang.Object) true);
        org.joda.time.PeriodType periodType5 = periodType1.withMinutesRemoved();
        org.joda.time.PeriodType periodType6 = periodType1.withMonthsRemoved();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) (-5), periodType6, chronology7);
        org.joda.time.Period period10 = period8.withYears(5);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds((long) 97);
        boolean boolean13 = period10.equals((java.lang.Object) duration12);
        org.joda.time.Period period15 = period10.minusDays((-4083));
        int int16 = period10.getDays();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "YearMonthDay" + "'", str2, "YearMonthDay");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test20617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20617");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        int int5 = period4.getYears();
        org.joda.time.Period period7 = period4.plusYears((int) ' ');
        org.joda.time.Period period9 = period4.minusSeconds((int) (short) 0);
        org.joda.time.Hours hours10 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Hours hours12 = org.joda.time.Hours.hoursIn(readableInterval11);
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.Hours hours14 = org.joda.time.Hours.hoursIn(readableInterval13);
        org.joda.time.Hours hours16 = hours14.multipliedBy(8);
        org.joda.time.Hours hours17 = hours12.plus(hours14);
        org.joda.time.Period period19 = org.joda.time.Period.millis((int) '#');
        int int20 = period19.getYears();
        org.joda.time.Period period22 = period19.multipliedBy((int) (byte) 100);
        org.joda.time.Hours hours23 = period19.toStandardHours();
        int int24 = hours23.size();
        org.joda.time.Hours hours26 = hours23.multipliedBy(10);
        org.joda.time.Hours hours27 = hours12.minus(hours23);
        org.joda.time.PeriodType periodType28 = hours27.getPeriodType();
        org.joda.time.PeriodType periodType29 = periodType28.withHoursRemoved();
        org.joda.time.PeriodType periodType30 = periodType28.withDaysRemoved();
        boolean boolean31 = period9.equals((java.lang.Object) periodType30);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test20618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20618");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((-89));
        org.joda.time.Seconds seconds3 = seconds1.minus(525);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
    }

    @Test
    public void test20619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20619");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod8 = period6.toMutablePeriod();
        org.joda.time.Duration duration9 = period6.toStandardDuration();
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        org.joda.time.Seconds seconds11 = seconds10.negated();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Period period18 = period14.withMillis((int) (short) 0);
        int int19 = period18.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod20 = period18.toMutablePeriod();
        org.joda.time.Duration duration21 = period18.toStandardDuration();
        org.joda.time.Seconds seconds22 = duration21.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType23 = seconds22.getFieldType();
        org.joda.time.Seconds seconds24 = seconds22.negated();
        boolean boolean25 = seconds11.isGreaterThan(seconds22);
        org.joda.time.Seconds seconds27 = seconds11.plus(8);
        org.joda.time.Seconds seconds29 = seconds11.plus((int) (short) 1);
        org.joda.time.Duration duration30 = seconds29.toStandardDuration();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(duration30);
    }

    @Test
    public void test20620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20620");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.PeriodType periodType6 = periodFormatter2.getParseType();
        boolean boolean7 = periodFormatter2.isParser();
        boolean boolean8 = periodFormatter2.isParser();
        org.joda.time.format.PeriodPrinter periodPrinter9 = periodFormatter2.getPrinter();
        org.joda.time.PeriodType periodType10 = periodFormatter2.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = periodFormatter2.parsePeriod("DaysNoDays");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNull(periodType10);
    }

    @Test
    public void test20621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20621");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Hours hours2 = hours0.negated();
        org.joda.time.Duration duration3 = hours0.toStandardDuration();
        org.joda.time.Hours hours5 = hours0.dividedBy((int) (byte) 100);
        org.joda.time.PeriodType periodType6 = hours0.getPeriodType();
        org.joda.time.Hours hours7 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours9 = hours7.multipliedBy((int) 'a');
        org.joda.time.PeriodType periodType10 = hours7.getPeriodType();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Hours hours12 = org.joda.time.Hours.hoursIn(readableInterval11);
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.Hours hours14 = org.joda.time.Hours.hoursIn(readableInterval13);
        org.joda.time.Hours hours16 = hours14.multipliedBy(8);
        org.joda.time.Hours hours17 = hours12.plus(hours14);
        int int18 = hours14.size();
        org.joda.time.Hours hours19 = hours7.minus(hours14);
        boolean boolean20 = hours0.isLessThan(hours7);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20622");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 10);
        org.joda.time.Period period3 = period1.withMinutes((int) '#');
        org.joda.time.Period period5 = period3.plusWeeks(5);
        int int6 = period5.size();
        org.joda.time.Period period8 = period5.minusMillis(168);
        org.joda.time.format.PeriodPrinter periodPrinter9 = null;
        org.joda.time.format.PeriodParser periodParser10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = new org.joda.time.format.PeriodFormatter(periodPrinter9, periodParser10);
        boolean boolean12 = periodFormatter11.isParser();
        org.joda.time.Days days13 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        org.joda.time.PeriodType periodType15 = periodType14.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter16 = periodFormatter11.withParseType(periodType14);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.format.PeriodFormatter periodFormatter18 = periodFormatter16.withParseType(periodType17);
        java.util.Locale locale19 = periodFormatter18.getLocale();
        boolean boolean20 = periodFormatter18.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = period5.toString(periodFormatter18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodFormatter16);
        org.junit.Assert.assertNotNull(periodFormatter18);
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20623");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Minutes minutes8 = minutes6.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes0.minus(minutes6);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Minutes minutes18 = minutes16.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes19 = minutes10.minus(minutes16);
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Minutes minutes25 = period24.toStandardMinutes();
        org.joda.time.Duration duration26 = minutes25.toStandardDuration();
        org.joda.time.Minutes minutes28 = minutes25.multipliedBy((int) (short) 1);
        int int29 = minutes10.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes28);
        org.joda.time.Minutes minutes30 = minutes9.plus(minutes28);
        org.joda.time.Period period33 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period33.minusMonths(0);
        org.joda.time.Minutes minutes36 = period35.toStandardMinutes();
        org.joda.time.Duration duration37 = minutes36.toStandardDuration();
        org.joda.time.Minutes minutes39 = minutes36.multipliedBy((int) (short) 1);
        java.lang.String str40 = minutes39.toString();
        org.joda.time.Minutes minutes41 = minutes30.minus(minutes39);
        int int42 = minutes30.size();
        org.joda.time.Minutes minutes44 = minutes30.minus(36);
        org.joda.time.Minutes minutes46 = minutes44.multipliedBy((-23));
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT0M" + "'", str40, "PT0M");
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(minutes46);
    }

    @Test
    public void test20624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20624");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Days days3 = period2.toStandardDays();
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = days3.getPeriodType();
        java.lang.String str6 = periodType5.getName();
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Days" + "'", str6, "Days");
    }

    @Test
    public void test20625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20625");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) '#');
        org.joda.time.Period period3 = period1.withWeeks((int) (byte) 0);
        org.joda.time.Period period5 = period1.plusSeconds((int) '4');
        org.joda.time.Weeks weeks6 = period1.toStandardWeeks();
        org.joda.time.Period period7 = period1.toPeriod();
        int int8 = period7.getHours();
        org.joda.time.Period period10 = period7.withMinutes((-103));
        int int11 = period10.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test20626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20626");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration1 = seconds0.toStandardDuration();
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.Seconds seconds9 = seconds5.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds10 = seconds4.plus(seconds5);
        org.joda.time.Seconds seconds12 = seconds4.plus((int) '4');
        org.joda.time.Duration duration13 = seconds12.toStandardDuration();
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds18 = seconds16.plus(seconds17);
        org.joda.time.Seconds seconds20 = seconds16.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds21 = seconds15.plus(seconds16);
        org.joda.time.Seconds seconds23 = seconds15.plus((int) '4');
        org.joda.time.Duration duration24 = seconds23.toStandardDuration();
        boolean boolean25 = seconds12.isLessThan(seconds23);
        boolean boolean26 = seconds2.isGreaterThan(seconds12);
        boolean boolean27 = seconds0.isGreaterThan(seconds2);
        org.joda.time.Seconds seconds28 = seconds0.negated();
        org.joda.time.Duration duration29 = seconds0.toStandardDuration();
        org.joda.time.Seconds seconds30 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds32 = seconds30.minus((int) 'a');
        org.joda.time.Seconds seconds33 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds34 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds35 = seconds33.plus(seconds34);
        org.joda.time.Seconds seconds37 = seconds33.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds38 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds39 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds40 = seconds38.plus(seconds39);
        java.lang.String str41 = seconds38.toString();
        org.joda.time.DurationFieldType durationFieldType42 = seconds38.getFieldType();
        java.lang.String str43 = durationFieldType42.getName();
        boolean boolean44 = seconds33.isSupported(durationFieldType42);
        int int45 = seconds32.get(durationFieldType42);
        int int46 = seconds32.getSeconds();
        org.joda.time.Seconds seconds48 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str49 = seconds48.toString();
        org.joda.time.DurationFieldType durationFieldType50 = seconds48.getFieldType();
        org.joda.time.Duration duration51 = seconds48.toStandardDuration();
        java.lang.String str52 = seconds48.toString();
        boolean boolean53 = seconds32.isGreaterThan(seconds48);
        org.joda.time.Seconds seconds54 = seconds32.negated();
        boolean boolean55 = duration29.equals((java.lang.Object) seconds54);
        org.joda.time.Seconds seconds56 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds57 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds58 = seconds56.plus(seconds57);
        org.joda.time.PeriodType periodType59 = seconds56.getPeriodType();
        int int60 = seconds56.size();
        org.joda.time.Seconds seconds62 = org.joda.time.Seconds.seconds((int) (byte) 10);
        boolean boolean64 = seconds62.equals((java.lang.Object) "PeriodType[StandardNoMinutes]");
        org.joda.time.Seconds seconds65 = seconds56.plus(seconds62);
        org.joda.time.Seconds seconds66 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds67 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds68 = seconds66.plus(seconds67);
        java.lang.String str69 = seconds66.toString();
        org.joda.time.DurationFieldType durationFieldType70 = seconds66.getFieldType();
        org.joda.time.Seconds seconds72 = seconds66.multipliedBy(0);
        org.joda.time.Seconds seconds74 = seconds66.dividedBy((-1));
        org.joda.time.Seconds seconds75 = seconds65.plus(seconds66);
        org.joda.time.Seconds seconds76 = seconds54.minus(seconds66);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PT2S" + "'", str41, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "seconds" + "'", str43, "seconds");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-95) + "'", int45 == (-95));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-95) + "'", int46 == (-95));
        org.junit.Assert.assertNotNull(seconds48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PT0S" + "'", str49, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PT0S" + "'", str52, "PT0S");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertNotNull(seconds57);
        org.junit.Assert.assertNotNull(seconds58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(seconds62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(seconds65);
        org.junit.Assert.assertNotNull(seconds66);
        org.junit.Assert.assertNotNull(seconds67);
        org.junit.Assert.assertNotNull(seconds68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "PT2S" + "'", str69, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType70);
        org.junit.Assert.assertNotNull(seconds72);
        org.junit.Assert.assertNotNull(seconds74);
        org.junit.Assert.assertNotNull(seconds75);
        org.junit.Assert.assertNotNull(seconds76);
    }

    @Test
    public void test20627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20627");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 268435455, (long) (byte) -1, chronology2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        org.joda.time.Period period7 = period3.plusMonths(0);
        org.joda.time.Seconds seconds8 = period7.toStandardSeconds();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(seconds8);
    }

    @Test
    public void test20628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20628");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.time();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter2.withParseType(periodType19);
        java.util.Locale locale21 = null;
        org.joda.time.format.PeriodFormatter periodFormatter22 = periodFormatter20.withLocale(locale21);
        java.io.Writer writer23 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration29 = duration27.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Seconds seconds32 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds33 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds34 = seconds32.plus(seconds33);
        org.joda.time.PeriodType periodType35 = seconds32.getPeriodType();
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period39 = period38.negated();
        org.joda.time.DurationFieldType durationFieldType41 = period38.getFieldType((int) (short) 1);
        int int42 = periodType35.indexOf(durationFieldType41);
        org.joda.time.Period period43 = new org.joda.time.Period((long) ' ', periodType35);
        org.joda.time.Period period44 = duration27.toPeriodTo(readableInstant30, periodType35);
        org.joda.time.PeriodType periodType45 = period44.getPeriodType();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((-2147483648L), periodType45, chronology46);
        org.joda.time.Period period49 = period47.withSeconds(572);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter20.printTo(writer23, (org.joda.time.ReadablePeriod) period47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period49);
    }

    @Test
    public void test20629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20629");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(100L, periodType1);
        org.joda.time.Period period4 = period2.withYears(1);
        int int5 = period4.getSeconds();
        org.joda.time.Period period6 = period4.normalizedStandard();
        int int7 = period4.getYears();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test20630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20630");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period5.toDurationFrom(readableInstant7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = duration8.toPeriod(chronology9);
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Duration duration17 = minutes16.toStandardDuration();
        org.joda.time.Period period18 = duration17.toPeriod();
        org.joda.time.Duration duration20 = duration17.plus((long) (byte) 0);
        org.joda.time.Duration duration22 = duration17.withMillis((long) 1);
        org.joda.time.Minutes minutes23 = duration17.toStandardMinutes();
        org.joda.time.Duration duration25 = duration8.withDurationAdded((org.joda.time.ReadableDuration) duration17, 10);
        org.joda.time.Duration duration27 = duration8.plus((long) 268435465);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period32 = period30.minusMonths(0);
        org.joda.time.Minutes minutes33 = period32.toStandardMinutes();
        org.joda.time.Duration duration34 = minutes33.toStandardDuration();
        org.joda.time.Period period37 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period39 = period37.minusMonths(0);
        org.joda.time.Minutes minutes40 = period39.toStandardMinutes();
        org.joda.time.Duration duration41 = minutes40.toStandardDuration();
        boolean boolean42 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Period period43 = duration34.toPeriod();
        org.joda.time.Minutes minutes44 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration45 = minutes44.toStandardDuration();
        long long46 = duration45.getStandardSeconds();
        org.joda.time.Period period49 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period51 = period49.minusMonths(0);
        org.joda.time.Minutes minutes52 = period51.toStandardMinutes();
        org.joda.time.Duration duration53 = minutes52.toStandardDuration();
        org.joda.time.Minutes minutes55 = minutes52.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration56 = minutes52.toStandardDuration();
        org.joda.time.Period period59 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period61 = period59.minusMonths(0);
        org.joda.time.Minutes minutes62 = period61.toStandardMinutes();
        org.joda.time.Duration duration63 = minutes62.toStandardDuration();
        org.joda.time.Period period64 = duration63.toPeriod();
        boolean boolean65 = duration56.isLongerThan((org.joda.time.ReadableDuration) duration63);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.days();
        org.joda.time.Period period68 = duration56.toPeriodTo(readableInstant66, periodType67);
        org.joda.time.Duration duration69 = duration45.plus((org.joda.time.ReadableDuration) duration56);
        org.joda.time.Duration duration70 = duration69.toDuration();
        int int71 = duration34.compareTo((org.joda.time.ReadableDuration) duration69);
        int int72 = duration8.compareTo((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Period period76 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period78 = period76.minusMonths(0);
        org.joda.time.Minutes minutes79 = period78.toStandardMinutes();
        org.joda.time.Minutes minutes81 = minutes79.dividedBy((int) (byte) 100);
        int int82 = minutes81.getMinutes();
        org.joda.time.PeriodType periodType83 = minutes81.getPeriodType();
        org.joda.time.Period period84 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration34, readableInstant73, periodType83);
        org.joda.time.PeriodType periodType85 = periodType83.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType87 = periodType85.getFieldType(708);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 708");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-128849018880L) + "'", long46 == (-128849018880L));
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(minutes52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(minutes62);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(minutes79);
        org.junit.Assert.assertNotNull(minutes81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(periodType83);
        org.junit.Assert.assertNotNull(periodType85);
    }

    @Test
    public void test20631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20631");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter3.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter3.withLocale(locale5);
        org.joda.time.PeriodType periodType7 = periodFormatter6.getParseType();
        org.joda.time.format.PeriodParser periodParser8 = periodFormatter6.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter9 = periodFormatter6.getPrinter();
        java.util.Locale locale10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter6.withLocale(locale10);
        boolean boolean12 = periodFormatter6.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = org.joda.time.Period.parse("hours", periodFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNull(periodType7);
        org.junit.Assert.assertNull(periodParser8);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test20632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20632");
        org.joda.time.Period period1 = org.joda.time.Period.months(44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days2 = period1.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test20633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20633");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        org.joda.time.Duration duration15 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration13, (int) (short) 100);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = duration6.toPeriod(chronology16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration6.toIntervalFrom(readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = duration6.toPeriodFrom(readableInstant20);
        org.joda.time.Duration duration23 = duration6.withMillis(120L);
        org.joda.time.Duration duration24 = duration23.toDuration();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration24);
    }

    @Test
    public void test20634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20634");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod8 = period6.toMutablePeriod();
        org.joda.time.Duration duration9 = period6.toStandardDuration();
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        org.joda.time.Seconds seconds11 = seconds10.negated();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Period period18 = period14.withMillis((int) (short) 0);
        int int19 = period18.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod20 = period18.toMutablePeriod();
        org.joda.time.Duration duration21 = period18.toStandardDuration();
        org.joda.time.Seconds seconds22 = duration21.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType23 = seconds22.getFieldType();
        org.joda.time.Seconds seconds24 = seconds22.negated();
        boolean boolean25 = seconds11.isGreaterThan(seconds22);
        org.joda.time.Seconds seconds27 = seconds11.plus(8);
        org.joda.time.Seconds seconds29 = seconds11.plus((int) (short) 1);
        org.joda.time.Seconds seconds31 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds32 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds33 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds34 = seconds32.plus(seconds33);
        org.joda.time.Seconds seconds36 = seconds32.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds37 = seconds31.plus(seconds32);
        org.joda.time.Seconds seconds39 = seconds31.plus((int) '4');
        org.joda.time.Duration duration40 = seconds39.toStandardDuration();
        org.joda.time.Seconds seconds42 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds43 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds44 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds45 = seconds43.plus(seconds44);
        org.joda.time.Seconds seconds47 = seconds43.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds48 = seconds42.plus(seconds43);
        org.joda.time.Seconds seconds50 = seconds42.plus((int) '4');
        org.joda.time.Duration duration51 = seconds50.toStandardDuration();
        boolean boolean52 = seconds39.isLessThan(seconds50);
        org.joda.time.Seconds seconds54 = org.joda.time.Seconds.parseSeconds("PT0H");
        boolean boolean55 = seconds39.isLessThan(seconds54);
        org.joda.time.Seconds seconds56 = seconds29.plus(seconds54);
        org.joda.time.Seconds seconds58 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds59 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds60 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds61 = seconds59.plus(seconds60);
        org.joda.time.Seconds seconds63 = seconds59.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds64 = seconds58.plus(seconds59);
        org.joda.time.Seconds seconds66 = seconds59.multipliedBy((int) (short) 1);
        org.joda.time.Seconds seconds68 = seconds66.dividedBy((int) 'a');
        org.joda.time.Seconds seconds69 = seconds54.plus(seconds68);
        org.joda.time.PeriodType periodType70 = seconds69.getPeriodType();
        java.lang.String str71 = periodType70.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertNotNull(seconds45);
        org.junit.Assert.assertNotNull(seconds47);
        org.junit.Assert.assertNotNull(seconds48);
        org.junit.Assert.assertNotNull(seconds50);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertNotNull(seconds58);
        org.junit.Assert.assertNotNull(seconds59);
        org.junit.Assert.assertNotNull(seconds60);
        org.junit.Assert.assertNotNull(seconds61);
        org.junit.Assert.assertNotNull(seconds63);
        org.junit.Assert.assertNotNull(seconds64);
        org.junit.Assert.assertNotNull(seconds66);
        org.junit.Assert.assertNotNull(seconds68);
        org.junit.Assert.assertNotNull(seconds69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "PeriodType[Seconds]" + "'", str71, "PeriodType[Seconds]");
    }

    @Test
    public void test20635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20635");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        boolean boolean4 = periodFormatter2.isParser();
        boolean boolean5 = periodFormatter2.isParser();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Period period23 = period19.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType24 = period19.getPeriodType();
        org.joda.time.PeriodType periodType25 = periodType24.withMinutesRemoved();
        org.joda.time.PeriodType periodType26 = periodType25.withHoursRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) (-1), periodType25, chronology28);
        org.joda.time.Period period30 = new org.joda.time.Period((int) '#', (int) (short) 10, 14400, 2, (int) (short) 1, 0, (int) (short) 1, (int) ' ', periodType25);
        java.lang.String str31 = periodType25.getName();
        org.joda.time.format.PeriodFormatter periodFormatter32 = periodFormatter2.withParseType(periodType25);
        boolean boolean33 = periodFormatter2.isParser();
        java.util.Locale locale34 = null;
        org.joda.time.format.PeriodFormatter periodFormatter35 = periodFormatter2.withLocale(locale34);
        org.joda.time.format.PeriodPrinter periodPrinter36 = periodFormatter2.getPrinter();
        org.joda.time.format.PeriodParser periodParser37 = periodFormatter2.getParser();
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StandardNoMinutes" + "'", str31, "StandardNoMinutes");
        org.junit.Assert.assertNotNull(periodFormatter32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(periodFormatter35);
        org.junit.Assert.assertNull(periodPrinter36);
        org.junit.Assert.assertNull(periodParser37);
    }

    @Test
    public void test20636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20636");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.Period period8 = period6.minusWeeks(10);
        int int9 = period6.getWeeks();
        org.joda.time.Period period11 = period6.withMinutes(2);
        org.joda.time.Period period13 = period6.withMinutes(1);
        org.joda.time.Period period15 = period6.minusMinutes(8);
        org.joda.time.Days days17 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        org.joda.time.PeriodType periodType19 = periodType18.withHoursRemoved();
        org.joda.time.Period period20 = new org.joda.time.Period((long) 2, periodType19);
        org.joda.time.Period period21 = period6.normalizedStandard(periodType19);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test20637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20637");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        boolean boolean15 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = new org.joda.time.Duration(readableInstant16, readableInstant17);
        org.joda.time.Duration duration19 = duration7.minus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = duration19.toPeriodTo(readableInstant20);
        long long22 = duration19.getStandardDays();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration25 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration28 = duration25.plus((org.joda.time.ReadableDuration) duration27);
        long long29 = duration27.getMillis();
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType31 = periodType30.withMillisRemoved();
        org.joda.time.Period period33 = org.joda.time.Period.millis(0);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.months();
        boolean boolean35 = period33.isSupported(durationFieldType34);
        java.lang.String str36 = durationFieldType34.getName();
        int int37 = periodType30.indexOf(durationFieldType34);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration27, periodType30);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration19, periodType30);
        java.lang.String str40 = period39.toString();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 6000000L + "'", long29 == 6000000L);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "months" + "'", str36, "months");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "P0D" + "'", str40, "P0D");
    }

    @Test
    public void test20638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20638");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        java.lang.String str9 = days8.toString();
        org.joda.time.DurationFieldType durationFieldType10 = days8.getFieldType();
        org.joda.time.Days days12 = org.joda.time.Days.days((int) '4');
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) days12, chronology13);
        int int15 = days12.getDays();
        java.lang.String str16 = days12.toString();
        org.joda.time.Days days17 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        org.joda.time.Days days19 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType20 = days19.getPeriodType();
        org.joda.time.Days days22 = days19.minus(0);
        org.joda.time.Days days23 = days22.negated();
        boolean boolean24 = days17.isGreaterThan(days22);
        org.joda.time.Days days26 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days28 = days26.multipliedBy((int) (short) 100);
        org.joda.time.Days days29 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType30 = days29.getPeriodType();
        org.joda.time.Days days32 = days29.minus(0);
        org.joda.time.Days days33 = days26.minus(days32);
        org.joda.time.Days days34 = days22.minus(days26);
        boolean boolean35 = days12.isLessThan(days22);
        org.joda.time.Days days36 = days8.minus(days12);
        org.joda.time.Days days38 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days40 = days38.multipliedBy((int) (short) 100);
        org.joda.time.Days days41 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType42 = days41.getPeriodType();
        org.joda.time.Days days44 = days41.minus(0);
        org.joda.time.Days days45 = days38.minus(days44);
        java.lang.String str46 = days45.toString();
        org.joda.time.DurationFieldType durationFieldType47 = days45.getFieldType();
        org.joda.time.Days days49 = days45.plus(14400);
        org.joda.time.Days days51 = days45.minus((-10));
        org.joda.time.Days days52 = null;
        org.joda.time.Days days53 = days51.plus(days52);
        boolean boolean54 = days12.isGreaterThan(days51);
        org.joda.time.Days days56 = days12.dividedBy((int) 'a');
        org.joda.time.Duration duration57 = days56.toStandardDuration();
        org.joda.time.PeriodType periodType58 = days56.getPeriodType();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0D" + "'", str9, "P0D");
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P52D" + "'", str16, "P52D");
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(days45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "P0D" + "'", str46, "P0D");
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertNotNull(days53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(periodType58);
    }

    @Test
    public void test20639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20639");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) 0);
        java.lang.String str2 = duration1.toString();
        org.joda.time.Duration duration4 = duration1.minus((long) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = duration4.toPeriodTo(readableInstant5);
        org.joda.time.Period period7 = duration4.toPeriod();
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        long long10 = duration9.getStandardSeconds();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Duration duration17 = minutes16.toStandardDuration();
        org.joda.time.Minutes minutes19 = minutes16.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration20 = minutes16.toStandardDuration();
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Duration duration27 = minutes26.toStandardDuration();
        org.joda.time.Period period28 = duration27.toPeriod();
        boolean boolean29 = duration20.isLongerThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.days();
        org.joda.time.Period period32 = duration20.toPeriodTo(readableInstant30, periodType31);
        org.joda.time.Duration duration33 = duration9.plus((org.joda.time.ReadableDuration) duration20);
        java.lang.String str34 = duration9.toString();
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours((long) (byte) 100);
        boolean boolean37 = duration9.isEqual((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Duration duration38 = duration4.minus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Period period41 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period43 = period41.minusMonths(0);
        org.joda.time.Period period44 = period41.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod45 = period44.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period44.toDurationFrom(readableInstant46);
        org.joda.time.Period period50 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period52 = period50.minusMonths(0);
        org.joda.time.Minutes minutes53 = period52.toStandardMinutes();
        org.joda.time.Duration duration54 = minutes53.toStandardDuration();
        org.joda.time.Period period57 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period59 = period57.minusMonths(0);
        org.joda.time.Minutes minutes60 = period59.toStandardMinutes();
        org.joda.time.Duration duration61 = minutes60.toStandardDuration();
        org.joda.time.Duration duration63 = duration54.withDurationAdded((org.joda.time.ReadableDuration) duration61, (int) (short) 100);
        org.joda.time.Duration duration65 = duration47.withDurationAdded((org.joda.time.ReadableDuration) duration63, 3);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Interval interval67 = duration63.toIntervalFrom(readableInstant66);
        org.joda.time.Duration duration70 = duration63.withDurationAdded(11L, (int) (byte) 100);
        org.joda.time.Duration duration71 = duration63.toDuration();
        boolean boolean72 = duration38.isEqual((org.joda.time.ReadableDuration) duration71);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-128849018880L) + "'", long10 == (-128849018880L));
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT-128849018880S" + "'", str34, "PT-128849018880S");
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(mutablePeriod45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(minutes60);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test20640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20640");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str2 = seconds1.toString();
        org.joda.time.DurationFieldType durationFieldType3 = seconds1.getFieldType();
        org.joda.time.Duration duration4 = seconds1.toStandardDuration();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) 8);
        long long7 = duration6.getMillis();
        boolean boolean8 = duration4.isLongerThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant9);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 480000L + "'", long7 == 480000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test20641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20641");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withSecondsRemoved();
        org.joda.time.Period period12 = duration6.toPeriodFrom(readableInstant7, periodType9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 1, periodType9, chronology13);
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter2.withParseType(periodType9);
        java.util.Locale locale16 = null;
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withLocale(locale16);
        org.joda.time.format.PeriodPrinter periodPrinter18 = periodFormatter2.getPrinter();
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period23 = period21.minusMonths(0);
        org.joda.time.Period period25 = period21.minusSeconds((int) (byte) 100);
        org.joda.time.Days days26 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType27 = days26.getPeriodType();
        org.joda.time.PeriodType periodType28 = periodType27.withHoursRemoved();
        org.joda.time.PeriodType periodType29 = periodType27.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.days();
        boolean boolean31 = periodType29.isSupported(durationFieldType30);
        int int32 = period21.get(durationFieldType30);
        org.joda.time.Period period34 = period21.withHours(1);
        org.joda.time.Period period37 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period39 = period37.minusMonths(0);
        org.joda.time.Period period41 = period37.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType42 = period37.getPeriodType();
        org.joda.time.PeriodType periodType43 = periodType42.withMinutesRemoved();
        java.lang.String str44 = periodType43.toString();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) period21, periodType43, chronology45);
        org.joda.time.PeriodType periodType47 = periodType43.withDaysRemoved();
        org.joda.time.PeriodType periodType48 = periodType47.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter49 = periodFormatter2.withParseType(periodType48);
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNull(periodPrinter18);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str44, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodFormatter49);
    }

    @Test
    public void test20642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20642");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) '#', 87, 13, 0, (int) (short) -1, 2147483645, 100, 87, periodType8);
        org.joda.time.Period period11 = period9.minusMillis(100);
        int int12 = period9.getSeconds();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test20643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20643");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days8);
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration14 = duration12.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Interval interval18 = duration14.toIntervalFrom(readableInstant17);
        org.joda.time.Days days19 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Days days21 = days19.minus((int) '4');
        org.joda.time.Days days22 = days9.minus(days21);
        org.joda.time.PeriodType periodType23 = days21.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType24 = days21.getFieldType();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(durationFieldType24);
    }

    @Test
    public void test20644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20644");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeks(1);
        boolean boolean3 = weeks0.isGreaterThan(weeks2);
        java.lang.Object obj4 = null;
        boolean boolean5 = weeks2.equals(obj4);
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks9 = weeks7.dividedBy(100);
        org.joda.time.Weeks weeks10 = weeks2.minus(weeks9);
        org.joda.time.Weeks weeks12 = weeks9.plus(35);
        org.joda.time.Weeks weeks14 = weeks9.multipliedBy(10);
        org.joda.time.Duration duration15 = weeks9.toStandardDuration();
        org.joda.time.Weeks weeks17 = weeks9.multipliedBy((int) (short) 100);
        org.joda.time.Weeks weeks19 = weeks17.dividedBy(14400);
        org.joda.time.PeriodType periodType20 = weeks17.getPeriodType();
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks24 = weeks22.dividedBy(100);
        org.joda.time.Weeks weeks25 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks27 = org.joda.time.Weeks.weeks(1);
        boolean boolean28 = weeks25.isGreaterThan(weeks27);
        java.lang.Object obj29 = null;
        boolean boolean30 = weeks27.equals(obj29);
        org.joda.time.Weeks weeks32 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks34 = weeks32.dividedBy(100);
        org.joda.time.Weeks weeks35 = weeks27.minus(weeks34);
        org.joda.time.Weeks weeks37 = weeks34.plus(35);
        org.joda.time.Weeks weeks38 = weeks22.minus(weeks37);
        boolean boolean39 = weeks17.isLessThan(weeks38);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test20645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20645");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 10, chronology1);
        org.joda.time.Period period4 = period2.plusHours((int) ' ');
        int int5 = period2.getDays();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test20646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20646");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.PeriodType periodType8 = periodFormatter2.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter9 = periodFormatter2.getPrinter();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Period period18 = period14.minusSeconds((int) (byte) 100);
        org.joda.time.Days days19 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType20 = days19.getPeriodType();
        org.joda.time.PeriodType periodType21 = periodType20.withHoursRemoved();
        org.joda.time.PeriodType periodType22 = periodType20.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.days();
        boolean boolean24 = periodType22.isSupported(durationFieldType23);
        int int25 = period14.get(durationFieldType23);
        org.joda.time.Period period27 = period14.withHours(1);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.yearDay();
        boolean boolean29 = period27.equals((java.lang.Object) periodType28);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType28);
        org.joda.time.PeriodType periodType31 = periodType28.withHoursRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter32 = periodFormatter2.withParseType(periodType28);
        java.util.Locale locale33 = periodFormatter2.getLocale();
        org.joda.time.format.PeriodPrinter periodPrinter34 = periodFormatter2.getPrinter();
        org.joda.time.format.PeriodPrinter periodPrinter35 = periodFormatter2.getPrinter();
        org.joda.time.format.PeriodPrinter periodPrinter36 = periodFormatter2.getPrinter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNull(periodType8);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodFormatter32);
        org.junit.Assert.assertNull(locale33);
        org.junit.Assert.assertNull(periodPrinter34);
        org.junit.Assert.assertNull(periodPrinter35);
        org.junit.Assert.assertNull(periodPrinter36);
    }

    @Test
    public void test20647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20647");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        int int1 = hours0.getHours();
        org.joda.time.Hours hours3 = hours0.dividedBy(8);
        org.joda.time.Hours hours5 = hours3.plus((int) 'a');
        org.joda.time.Hours hours7 = hours5.dividedBy((-1));
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Period period14 = period10.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType15 = period10.getPeriodType();
        org.joda.time.Hours hours16 = period10.toStandardHours();
        org.joda.time.Period period18 = org.joda.time.Period.millis((int) '#');
        int int19 = period18.getYears();
        org.joda.time.Hours hours20 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period18);
        boolean boolean21 = hours16.isLessThan(hours20);
        org.joda.time.Hours hours22 = org.joda.time.Hours.FIVE;
        boolean boolean23 = hours20.isGreaterThan(hours22);
        org.joda.time.Hours hours24 = hours22.negated();
        org.joda.time.Hours hours25 = hours7.minus(hours22);
        org.joda.time.PeriodType periodType26 = hours25.getPeriodType();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(periodType26);
    }

    @Test
    public void test20648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20648");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(0L);
        org.joda.time.Duration duration3 = org.joda.time.Duration.millis((long) 3);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = duration3.toPeriodFrom(readableInstant4);
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes8 = minutes6.minus(2147483645);
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        org.joda.time.Duration duration10 = duration3.minus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Duration duration11 = duration1.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((long) '#');
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardSeconds((long) 10);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Duration duration22 = minutes21.toStandardDuration();
        org.joda.time.Minutes minutes24 = minutes21.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration25 = minutes21.toStandardDuration();
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        org.joda.time.Period period33 = duration32.toPeriod();
        boolean boolean34 = duration25.isLongerThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Interval interval36 = duration32.toIntervalTo(readableInstant35);
        boolean boolean37 = duration15.isLongerThan((org.joda.time.ReadableDuration) duration32);
        boolean boolean38 = duration13.isLongerThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration39 = duration1.plus((org.joda.time.ReadableDuration) duration32);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(duration39);
    }

    @Test
    public void test20649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20649");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Minutes minutes8 = minutes6.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes0.minus(minutes6);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Minutes minutes18 = minutes16.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes19 = minutes10.minus(minutes16);
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Minutes minutes25 = period24.toStandardMinutes();
        org.joda.time.Duration duration26 = minutes25.toStandardDuration();
        org.joda.time.Minutes minutes28 = minutes25.multipliedBy((int) (short) 1);
        int int29 = minutes10.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes28);
        org.joda.time.Minutes minutes30 = minutes9.plus(minutes28);
        org.joda.time.PeriodType periodType31 = minutes9.getPeriodType();
        org.joda.time.Minutes minutes33 = minutes9.minus((int) (short) 10);
        org.joda.time.Minutes minutes35 = org.joda.time.Minutes.minutes(14400);
        org.joda.time.Minutes minutes36 = minutes9.plus(minutes35);
        org.joda.time.DurationFieldType durationFieldType37 = minutes35.getFieldType();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(durationFieldType37);
    }

    @Test
    public void test20650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20650");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, chronology1);
        org.joda.time.PeriodType periodType3 = period2.getPeriodType();
        org.joda.time.Seconds seconds4 = period2.toStandardSeconds();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.seconds(0);
        org.joda.time.Seconds seconds7 = seconds4.minus(seconds6);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
    }

    @Test
    public void test20651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20651");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        boolean boolean12 = periodType10.isSupported(durationFieldType11);
        int int13 = period2.get(durationFieldType11);
        int int14 = period2.getDays();
        int int15 = period2.getMillis();
        org.joda.time.Period period16 = period2.negated();
        org.joda.time.Period period18 = period16.withHours(8);
        org.joda.time.Period period20 = period18.withMonths(6);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test20652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20652");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((-200));
        org.joda.time.Weeks weeks3 = weeks1.plus((-483));
        int int4 = weeks3.getWeeks();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-683) + "'", int4 == (-683));
    }

    @Test
    public void test20653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20653");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy((int) (byte) 100);
        org.joda.time.PeriodType periodType3 = seconds2.getPeriodType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str6 = seconds5.toString();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        int int12 = period11.getYears();
        org.joda.time.Period period13 = period11.toPeriod();
        org.joda.time.Seconds seconds14 = period11.toStandardSeconds();
        boolean boolean15 = seconds5.isLessThan(seconds14);
        org.joda.time.Seconds seconds16 = seconds2.plus(seconds14);
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds19 = seconds17.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType20 = seconds17.getFieldType();
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds22 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds23 = seconds21.plus(seconds22);
        org.joda.time.Seconds seconds25 = seconds21.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds26 = seconds17.plus(seconds21);
        org.joda.time.Seconds seconds27 = seconds2.plus(seconds26);
        org.joda.time.Seconds seconds29 = seconds2.minus(11);
        org.joda.time.Seconds seconds31 = seconds2.plus(0);
        org.joda.time.MutablePeriod mutablePeriod32 = seconds2.toMutablePeriod();
        java.lang.String str33 = mutablePeriod32.toString();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0S" + "'", str6, "PT0S");
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PT0S" + "'", str33, "PT0S");
    }

    @Test
    public void test20654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20654");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.Duration duration8 = seconds2.toStandardDuration();
        org.joda.time.Period period10 = org.joda.time.Period.hours((int) '#');
        org.joda.time.Seconds seconds11 = period10.toStandardSeconds();
        boolean boolean12 = seconds2.isLessThan(seconds11);
        org.joda.time.PeriodType periodType13 = seconds2.getPeriodType();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test20655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20655");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period8 = duration6.toPeriod();
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration10 = minutes9.toStandardDuration();
        long long11 = duration10.getStandardSeconds();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Minutes minutes17 = period16.toStandardMinutes();
        org.joda.time.Duration duration18 = minutes17.toStandardDuration();
        org.joda.time.Minutes minutes20 = minutes17.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration21 = minutes17.toStandardDuration();
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period26 = period24.minusMonths(0);
        org.joda.time.Minutes minutes27 = period26.toStandardMinutes();
        org.joda.time.Duration duration28 = minutes27.toStandardDuration();
        org.joda.time.Period period29 = duration28.toPeriod();
        boolean boolean30 = duration21.isLongerThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.days();
        org.joda.time.Period period33 = duration21.toPeriodTo(readableInstant31, periodType32);
        org.joda.time.Duration duration34 = duration10.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Period period37 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period39 = period37.minusMonths(0);
        org.joda.time.Minutes minutes40 = period39.toStandardMinutes();
        org.joda.time.Duration duration41 = minutes40.toStandardDuration();
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period46 = period44.minusMonths(0);
        org.joda.time.Minutes minutes47 = period46.toStandardMinutes();
        org.joda.time.Duration duration48 = minutes47.toStandardDuration();
        boolean boolean49 = duration41.isShorterThan((org.joda.time.ReadableDuration) duration48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration48, readableInstant50);
        long long52 = duration48.getStandardHours();
        org.joda.time.Duration duration53 = duration21.minus((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration54 = duration6.plus((org.joda.time.ReadableDuration) duration53);
        long long55 = duration6.getStandardHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-128849018880L) + "'", long11 == (-128849018880L));
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test20656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20656");
        org.joda.time.Days days1 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType2.withMinutesRemoved();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) -1, periodType5, chronology6);
        org.joda.time.Period period9 = period7.multipliedBy(2147483647);
        org.joda.time.Period period10 = period7.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod11 = period7.toMutablePeriod();
        org.joda.time.format.PeriodPrinter periodPrinter12 = null;
        org.joda.time.format.PeriodParser periodParser13 = null;
        org.joda.time.format.PeriodFormatter periodFormatter14 = new org.joda.time.format.PeriodFormatter(periodPrinter12, periodParser13);
        boolean boolean15 = periodFormatter14.isParser();
        java.util.Locale locale16 = null;
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter14.withLocale(locale16);
        boolean boolean18 = periodFormatter14.isParser();
        java.util.Locale locale19 = null;
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter14.withLocale(locale19);
        java.util.Locale locale21 = null;
        org.joda.time.format.PeriodFormatter periodFormatter22 = periodFormatter20.withLocale(locale21);
        org.joda.time.PeriodType periodType23 = periodFormatter22.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = period7.toString(periodFormatter22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertNull(periodType23);
    }

    @Test
    public void test20657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20657");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        java.lang.String str12 = periodType11.toString();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter7.withParseType(periodType11);
        org.joda.time.PeriodType periodType14 = periodFormatter13.getParseType();
        org.joda.time.format.PeriodParser periodParser15 = periodFormatter13.getParser();
        java.util.Locale locale16 = null;
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter13.withLocale(locale16);
        java.util.Locale locale18 = null;
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter13.withLocale(locale18);
        boolean boolean20 = periodFormatter19.isParser();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[Days]" + "'", str12, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNull(periodParser15);
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20658");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        java.lang.String str9 = days8.toString();
        org.joda.time.Days days10 = days8.negated();
        org.joda.time.Days days11 = org.joda.time.Days.FIVE;
        java.lang.String str12 = days11.toString();
        org.joda.time.Days days14 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days15 = days11.minus(days14);
        org.joda.time.DurationFieldType durationFieldType16 = days11.getFieldType();
        boolean boolean17 = days10.isLessThan(days11);
        org.joda.time.Days days18 = org.joda.time.Days.FIVE;
        java.lang.String str19 = days18.toString();
        org.joda.time.Days days21 = days18.multipliedBy((int) (byte) -1);
        org.joda.time.Days days22 = days18.negated();
        org.joda.time.Days days23 = org.joda.time.Days.ONE;
        org.joda.time.Days days24 = org.joda.time.Days.ONE;
        int int25 = days23.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days24);
        org.joda.time.Days days27 = days24.multipliedBy((int) '#');
        org.joda.time.Days days28 = days22.minus(days24);
        boolean boolean29 = days11.isGreaterThan(days28);
        org.joda.time.Duration duration30 = days28.toStandardDuration();
        org.joda.time.Days days32 = days28.minus(35);
        org.joda.time.Days days34 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days36 = days34.multipliedBy((int) (short) 100);
        org.joda.time.Days days37 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType38 = days37.getPeriodType();
        org.joda.time.Days days40 = days37.minus(0);
        org.joda.time.Days days41 = days34.minus(days40);
        org.joda.time.Days days43 = days34.minus(35);
        org.joda.time.Days days45 = days34.plus(14400);
        org.joda.time.Days days47 = days34.plus((int) (short) 1);
        org.joda.time.Days days49 = days34.minus((-4083));
        org.joda.time.Days days51 = days49.plus((-38));
        org.joda.time.Days days52 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType53 = days52.getPeriodType();
        org.joda.time.Days days54 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType55 = days54.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType56 = days54.getFieldType();
        boolean boolean57 = days52.isLessThan(days54);
        org.joda.time.Days days58 = days51.plus(days54);
        org.joda.time.MutablePeriod mutablePeriod59 = days54.toMutablePeriod();
        boolean boolean60 = days32.isGreaterThan(days54);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0D" + "'", str9, "P0D");
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P5D" + "'", str12, "P5D");
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P5D" + "'", str19, "P5D");
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days45);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertNotNull(days52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(days54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(days58);
        org.junit.Assert.assertNotNull(mutablePeriod59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test20659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20659");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT52S");
        org.joda.time.Period period3 = period1.withMonths(118);
        java.lang.String str4 = period1.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT52S" + "'", str4, "PT52S");
    }

    @Test
    public void test20660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20660");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = new org.joda.time.Duration(readableInstant15, readableInstant16);
        org.joda.time.Duration duration18 = duration6.minus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant19);
        org.joda.time.Duration duration22 = duration6.plus((long) 8);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Interval interval24 = duration22.toIntervalFrom(readableInstant23);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period29 = period27.minusMonths(0);
        org.joda.time.Minutes minutes30 = period29.toStandardMinutes();
        org.joda.time.Duration duration31 = minutes30.toStandardDuration();
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period36 = period34.minusMonths(0);
        org.joda.time.Minutes minutes37 = period36.toStandardMinutes();
        org.joda.time.Duration duration38 = minutes37.toStandardDuration();
        boolean boolean39 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Duration duration41 = duration31.plus((long) (short) 10);
        org.joda.time.Duration duration43 = duration22.withDurationAdded((org.joda.time.ReadableDuration) duration41, (int) (byte) 0);
        org.joda.time.Duration duration44 = duration41.toDuration();
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardHours((long) 4);
        org.joda.time.Duration duration47 = duration41.minus((org.joda.time.ReadableDuration) duration46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Interval interval49 = duration41.toIntervalTo(readableInstant48);
        org.joda.time.Minutes minutes50 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval49);
        org.joda.time.Minutes minutes51 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval49);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertNotNull(minutes51);
    }

    @Test
    public void test20661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20661");
        org.joda.time.Period period4 = new org.joda.time.Period(600, 13, (int) (byte) 100, (-1491308));
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period4);
        org.junit.Assert.assertNotNull(weeks5);
    }

    @Test
    public void test20662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20662");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeks(1);
        boolean boolean3 = weeks0.isGreaterThan(weeks2);
        java.lang.Object obj4 = null;
        boolean boolean5 = weeks2.equals(obj4);
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks9 = weeks7.dividedBy(100);
        org.joda.time.Weeks weeks10 = weeks2.minus(weeks9);
        org.joda.time.Weeks weeks12 = weeks9.plus(35);
        org.joda.time.Weeks weeks14 = weeks9.multipliedBy(10);
        org.joda.time.Duration duration15 = weeks9.toStandardDuration();
        org.joda.time.Weeks weeks17 = weeks9.multipliedBy((int) (short) 100);
        int int18 = weeks9.getWeeks();
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period23 = period21.minusMonths(0);
        org.joda.time.Period period25 = period21.withMillis((int) (short) 0);
        int int26 = period25.getSeconds();
        org.joda.time.Period period28 = period25.withDays((int) 'a');
        org.joda.time.Period period30 = period28.minusMinutes(4);
        org.joda.time.Period period32 = period28.plusYears(2147483647);
        org.joda.time.PeriodType periodType33 = period32.getPeriodType();
        org.joda.time.Weeks weeks34 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval35 = null;
        org.joda.time.Weeks weeks36 = org.joda.time.Weeks.weeksIn(readableInterval35);
        boolean boolean37 = weeks34.isLessThan(weeks36);
        org.joda.time.Weeks weeks39 = weeks36.minus((-35791394));
        org.joda.time.Weeks weeks40 = weeks39.negated();
        boolean boolean41 = periodType33.equals((java.lang.Object) weeks39);
        org.joda.time.Weeks weeks42 = weeks9.minus(weeks39);
        org.joda.time.Period period44 = org.joda.time.Period.minutes(1);
        org.joda.time.Weeks weeks45 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks47 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks48 = weeks47.negated();
        org.joda.time.Weeks weeks49 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.Weeks weeks51 = org.joda.time.Weeks.weeksIn(readableInterval50);
        boolean boolean52 = weeks49.isLessThan(weeks51);
        boolean boolean53 = weeks48.isGreaterThan(weeks51);
        boolean boolean54 = weeks45.isLessThan(weeks48);
        int int55 = weeks48.getWeeks();
        org.joda.time.PeriodType periodType56 = weeks48.getPeriodType();
        org.joda.time.Period period57 = period44.minus((org.joda.time.ReadablePeriod) weeks48);
        org.joda.time.Weeks weeks59 = weeks48.dividedBy((-23));
        org.joda.time.Weeks weeks60 = weeks42.minus(weeks48);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertNotNull(weeks48);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(weeks59);
        org.junit.Assert.assertNotNull(weeks60);
    }

    @Test
    public void test20663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20663");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT604700.010S");
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test20664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20664");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes2 = minutes0.plus(1);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        org.joda.time.Minutes minutes11 = minutes8.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType12 = minutes8.getFieldType();
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod14 = minutes13.toMutablePeriod();
        org.joda.time.Minutes minutes15 = minutes8.plus(minutes13);
        boolean boolean16 = minutes2.isLessThan(minutes8);
        org.joda.time.PeriodType periodType17 = minutes8.getPeriodType();
        java.lang.String str18 = periodType17.getName();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(mutablePeriod14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Minutes" + "'", str18, "Minutes");
    }

    @Test
    public void test20665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20665");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.withDays(8);
        int int3 = period0.getSeconds();
        int int4 = period0.getHours();
        org.joda.time.Duration duration5 = period0.toStandardDuration();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds8 = seconds6.multipliedBy((int) (byte) 100);
        org.joda.time.PeriodType periodType9 = seconds8.getPeriodType();
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str12 = seconds11.toString();
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period15.minusMonths(0);
        int int18 = period17.getYears();
        org.joda.time.Period period19 = period17.toPeriod();
        org.joda.time.Seconds seconds20 = period17.toStandardSeconds();
        boolean boolean21 = seconds11.isLessThan(seconds20);
        org.joda.time.Seconds seconds22 = seconds8.plus(seconds20);
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds25 = seconds23.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType26 = seconds23.getFieldType();
        org.joda.time.Seconds seconds27 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds28 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds29 = seconds27.plus(seconds28);
        org.joda.time.Seconds seconds31 = seconds27.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds32 = seconds23.plus(seconds27);
        org.joda.time.Seconds seconds33 = seconds8.plus(seconds32);
        org.joda.time.Seconds seconds35 = seconds32.dividedBy((-35));
        org.joda.time.Duration duration36 = seconds35.toStandardDuration();
        long long37 = duration36.getMillis();
        org.joda.time.Duration duration39 = duration36.plus(7200000L);
        boolean boolean40 = duration5.isEqual((org.joda.time.ReadableDuration) duration36);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT0S" + "'", str12, "PT0S");
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test20666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20666");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.multipliedBy((int) 'a');
        org.joda.time.PeriodType periodType3 = hours0.getPeriodType();
        int int4 = hours0.getHours();
        org.joda.time.Hours hours6 = org.joda.time.Hours.hours((int) (byte) 0);
        boolean boolean7 = hours0.isGreaterThan(hours6);
        org.joda.time.Period period9 = org.joda.time.Period.days(10);
        org.joda.time.Period period11 = period9.plusMonths((int) 'a');
        org.joda.time.Period period13 = period9.plusSeconds((int) (short) 100);
        org.joda.time.Period period15 = period13.plusMinutes(3);
        org.joda.time.Period period16 = period15.normalizedStandard();
        org.joda.time.Period period18 = period16.withDays(4);
        org.joda.time.Hours hours19 = period18.toStandardHours();
        org.joda.time.Hours hours21 = hours19.dividedBy(87);
        org.joda.time.Hours hours23 = hours19.dividedBy(59);
        org.joda.time.Hours hours25 = org.joda.time.Hours.hours((int) (short) 10);
        org.joda.time.Hours hours26 = hours23.plus(hours25);
        org.joda.time.Hours hours27 = hours6.plus(hours26);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours27);
    }

    @Test
    public void test20667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20667");
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Period period7 = period3.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType8 = period3.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (short) -1, periodType10, chronology11);
        org.joda.time.Period period14 = period12.plusYears(2);
        int[] intArray15 = period14.getValues();
        org.joda.time.PeriodType periodType16 = period14.getPeriodType();
        org.joda.time.Period period18 = period14.plusYears((-23));
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[2, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test20668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20668");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        java.lang.String str1 = weeks0.toString();
        int int2 = weeks0.size();
        org.joda.time.PeriodType periodType3 = weeks0.getPeriodType();
        org.joda.time.Weeks weeks4 = null;
        org.joda.time.Weeks weeks5 = weeks0.minus(weeks4);
        org.joda.time.Weeks weeks7 = weeks5.plus(2);
        org.joda.time.Weeks weeks9 = weeks5.multipliedBy(11);
        org.joda.time.Weeks weeks11 = weeks9.minus(0);
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks14 = weeks13.negated();
        org.joda.time.Weeks weeks15 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeksIn(readableInterval16);
        boolean boolean18 = weeks15.isLessThan(weeks17);
        boolean boolean19 = weeks14.isGreaterThan(weeks17);
        org.joda.time.Weeks weeks20 = null;
        org.joda.time.Weeks weeks21 = weeks17.minus(weeks20);
        org.joda.time.DurationFieldType durationFieldType22 = weeks21.getFieldType();
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks25 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks26 = weeks25.negated();
        org.joda.time.Weeks weeks27 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval28 = null;
        org.joda.time.Weeks weeks29 = org.joda.time.Weeks.weeksIn(readableInterval28);
        boolean boolean30 = weeks27.isLessThan(weeks29);
        boolean boolean31 = weeks26.isGreaterThan(weeks29);
        boolean boolean32 = weeks23.isLessThan(weeks26);
        org.joda.time.Weeks weeks33 = weeks21.plus(weeks26);
        org.joda.time.Weeks weeks34 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks36 = org.joda.time.Weeks.weeks(1);
        boolean boolean37 = weeks34.isGreaterThan(weeks36);
        org.joda.time.DurationFieldType durationFieldType38 = weeks36.getFieldType();
        org.joda.time.Weeks weeks39 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.Weeks weeks41 = org.joda.time.Weeks.weeksIn(readableInterval40);
        boolean boolean42 = weeks39.isLessThan(weeks41);
        org.joda.time.Weeks weeks44 = weeks41.multipliedBy(10);
        org.joda.time.Weeks weeks45 = weeks36.minus(weeks41);
        int int46 = weeks45.getWeeks();
        org.joda.time.Weeks weeks48 = weeks45.multipliedBy(2147483647);
        org.joda.time.Weeks weeks49 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.Weeks weeks51 = org.joda.time.Weeks.weeksIn(readableInterval50);
        boolean boolean52 = weeks49.isLessThan(weeks51);
        org.joda.time.Weeks weeks53 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks55 = weeks53.dividedBy(1);
        boolean boolean56 = weeks49.isGreaterThan(weeks55);
        java.lang.String str57 = weeks49.toString();
        int int58 = weeks48.compareTo((org.joda.time.base.BaseSingleFieldPeriod) weeks49);
        org.joda.time.Weeks weeks60 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks61 = weeks60.negated();
        org.joda.time.Weeks weeks62 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval63 = null;
        org.joda.time.Weeks weeks64 = org.joda.time.Weeks.weeksIn(readableInterval63);
        boolean boolean65 = weeks62.isLessThan(weeks64);
        boolean boolean66 = weeks61.isGreaterThan(weeks64);
        org.joda.time.Weeks weeks68 = weeks64.dividedBy(52);
        boolean boolean69 = weeks48.isGreaterThan(weeks64);
        org.joda.time.Weeks weeks70 = weeks26.minus(weeks48);
        boolean boolean71 = weeks11.isLessThan(weeks26);
        java.lang.String str72 = weeks26.toString();
        org.joda.time.Weeks weeks74 = weeks26.dividedBy(244983);
        org.joda.time.Weeks weeks76 = org.joda.time.Weeks.parseWeeks("P97W");
        org.joda.time.Weeks weeks77 = weeks74.plus(weeks76);
        java.lang.String str78 = weeks74.toString();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0W" + "'", str1, "P0W");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(weeks48);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(weeks53);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "P2147483647W" + "'", str57, "P2147483647W");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(weeks60);
        org.junit.Assert.assertNotNull(weeks61);
        org.junit.Assert.assertNotNull(weeks62);
        org.junit.Assert.assertNotNull(weeks64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(weeks68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(weeks70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "P-1W" + "'", str72, "P-1W");
        org.junit.Assert.assertNotNull(weeks74);
        org.junit.Assert.assertNotNull(weeks76);
        org.junit.Assert.assertNotNull(weeks77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "P0W" + "'", str78, "P0W");
    }

    @Test
    public void test20669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20669");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType1 = periodType0.withMillisRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withYearsRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test20670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20670");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-2147483646), chronology1);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        org.joda.time.Minutes minutes11 = minutes8.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration12 = minutes8.toStandardDuration();
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period15.negated();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationTo(readableInstant17);
        boolean boolean19 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration23 = duration18.plus((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, readableInstant24);
        org.joda.time.Period period27 = org.joda.time.Period.millis(0);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.months();
        boolean boolean29 = period27.isSupported(durationFieldType28);
        int int30 = period25.get(durationFieldType28);
        org.joda.time.Period period32 = period2.withField(durationFieldType28, 2);
        org.joda.time.Period period34 = period32.minusDays(35);
        org.joda.time.Period period36 = period34.multipliedBy(97);
        org.joda.time.DurationFieldType durationFieldType37 = null;
        int int38 = period36.get(durationFieldType37);
        org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) period36);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test20671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20671");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Period period4 = period1.withWeeks((-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period1.toDurationFrom(readableInstant5);
        org.joda.time.DurationFieldType durationFieldType8 = period1.getFieldType(1);
        org.joda.time.Period period10 = period1.plusMonths(0);
        org.joda.time.Hours hours11 = period10.toStandardHours();
        org.joda.time.Period period12 = period10.toPeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test20672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20672");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Period period4 = period1.plusMinutes(1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period1.toDurationTo(readableInstant5);
        org.joda.time.Seconds seconds7 = period1.toStandardSeconds();
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str10 = seconds9.toString();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        int int16 = period15.getYears();
        org.joda.time.Period period17 = period15.toPeriod();
        org.joda.time.Seconds seconds18 = period15.toStandardSeconds();
        boolean boolean19 = seconds9.isLessThan(seconds18);
        java.lang.String str20 = seconds18.toString();
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds22 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds23 = seconds21.plus(seconds22);
        java.lang.String str24 = seconds21.toString();
        org.joda.time.DurationFieldType durationFieldType25 = seconds21.getFieldType();
        org.joda.time.Seconds seconds27 = seconds21.multipliedBy(0);
        org.joda.time.Seconds seconds28 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration29 = seconds28.toStandardDuration();
        boolean boolean30 = seconds27.isGreaterThan(seconds28);
        org.joda.time.Seconds seconds31 = seconds18.plus(seconds28);
        boolean boolean32 = seconds7.isLessThan(seconds28);
        org.joda.time.PeriodType periodType33 = seconds28.getPeriodType();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0S" + "'", str10, "PT0S");
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT0S" + "'", str20, "PT0S");
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT2S" + "'", str24, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test20673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20673");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Period period8 = duration7.toPeriod();
        org.joda.time.Duration duration10 = duration7.plus((long) (byte) 0);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.Period period12 = duration10.toPeriod();
        int int13 = period12.getHours();
        org.joda.time.Period period15 = period12.minusWeeks(2147483647);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = period15.multipliedBy((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483647 * -2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test20674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20674");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(0L, 7200000L, chronology2);
        org.joda.time.Period period5 = period3.withMonths((-14392));
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test20675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20675");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.Weeks weeks3 = weeks1.plus((-97));
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) weeks1);
        org.joda.time.Period period6 = org.joda.time.Period.hours(2147483645);
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeks(1);
        boolean boolean11 = weeks8.isGreaterThan(weeks10);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean13 = weeks10.isGreaterThan(weeks12);
        org.joda.time.Weeks weeks15 = weeks10.multipliedBy(0);
        boolean boolean16 = weeks7.isGreaterThan(weeks10);
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.weeksIn(readableInterval17);
        org.joda.time.Weeks weeks20 = weeks18.plus((-97));
        boolean boolean21 = weeks7.isGreaterThan(weeks18);
        org.joda.time.Weeks weeks22 = weeks4.plus(weeks18);
        org.joda.time.Period period24 = org.joda.time.Period.millis((int) '#');
        int int25 = period24.getYears();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.Period period27 = period24.withFields(readablePeriod26);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period31 = period30.negated();
        int int32 = period30.getHours();
        org.joda.time.Period period34 = org.joda.time.Period.days(10);
        org.joda.time.Period period36 = period34.plusMonths((int) 'a');
        org.joda.time.Period period38 = period34.plusSeconds((int) (short) 100);
        org.joda.time.Period period40 = period38.minusMonths((int) 'a');
        org.joda.time.Period period41 = period30.withFields((org.joda.time.ReadablePeriod) period40);
        org.joda.time.Period period42 = period24.minus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.Period period44 = period24.withSeconds(1);
        int int45 = period24.getYears();
        org.joda.time.Weeks weeks46 = org.joda.time.Weeks.ZERO;
        java.lang.String str47 = weeks46.toString();
        int int48 = weeks46.size();
        org.joda.time.PeriodType periodType49 = weeks46.getPeriodType();
        org.joda.time.Weeks weeks51 = weeks46.minus(7);
        org.joda.time.Period period52 = period24.withFields((org.joda.time.ReadablePeriod) weeks51);
        org.joda.time.PeriodType periodType53 = weeks51.getPeriodType();
        org.joda.time.Weeks weeks55 = weeks51.minus((int) (short) 1);
        org.joda.time.Weeks weeks57 = weeks51.plus((-2));
        boolean boolean58 = weeks18.isGreaterThan(weeks51);
        org.joda.time.Weeks weeks59 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks61 = org.joda.time.Weeks.weeks(1);
        boolean boolean62 = weeks59.isGreaterThan(weeks61);
        org.joda.time.DurationFieldType durationFieldType63 = weeks61.getFieldType();
        org.joda.time.Weeks weeks64 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.Weeks weeks66 = org.joda.time.Weeks.weeksIn(readableInterval65);
        boolean boolean67 = weeks64.isLessThan(weeks66);
        org.joda.time.Weeks weeks69 = weeks66.multipliedBy(10);
        org.joda.time.Weeks weeks70 = weeks61.minus(weeks66);
        org.joda.time.Weeks weeks72 = weeks70.multipliedBy((-9500));
        boolean boolean73 = weeks51.isLessThan(weeks72);
        int int74 = weeks51.size();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(weeks46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "P0W" + "'", str47, "P0W");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertNotNull(weeks57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(weeks59);
        org.junit.Assert.assertNotNull(weeks61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertNotNull(weeks64);
        org.junit.Assert.assertNotNull(weeks66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(weeks69);
        org.junit.Assert.assertNotNull(weeks70);
        org.junit.Assert.assertNotNull(weeks72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
    }

    @Test
    public void test20676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20676");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("P1W");
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        org.joda.time.Weeks weeks5 = weeks3.dividedBy((int) (byte) -1);
        org.joda.time.Weeks weeks6 = null;
        org.joda.time.Weeks weeks7 = weeks5.minus(weeks6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) weeks5, chronology8);
        org.joda.time.Duration duration10 = weeks5.toStandardDuration();
        org.joda.time.Weeks weeks12 = weeks5.multipliedBy(59);
        boolean boolean13 = weeks1.isGreaterThan(weeks5);
        org.joda.time.Weeks weeks15 = weeks1.minus(2147483645);
        org.joda.time.Weeks weeks16 = weeks1.negated();
        java.lang.String str17 = weeks16.toString();
        org.joda.time.PeriodType periodType18 = weeks16.getPeriodType();
        org.joda.time.PeriodType periodType19 = periodType18.withYearsRemoved();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P-1W" + "'", str17, "P-1W");
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test20677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20677");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays(10L);
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.PeriodType periodType5 = seconds2.getPeriodType();
        int int6 = seconds2.size();
        org.joda.time.PeriodType periodType7 = seconds2.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.Period period9 = duration1.toPeriod(periodType8);
        int[] intArray10 = period9.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = period9.withMinutes(87);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
    }

    @Test
    public void test20678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20678");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT12S");
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Period period7 = period4.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period7.toDurationFrom(readableInstant9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = duration10.toPeriod(chronology11);
        org.joda.time.Duration duration14 = new org.joda.time.Duration((long) 100);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Days days16 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        org.joda.time.PeriodType periodType18 = periodType17.withHoursRemoved();
        org.joda.time.PeriodType periodType19 = periodType17.withSecondsRemoved();
        org.joda.time.PeriodType periodType20 = periodType17.withMinutesRemoved();
        org.joda.time.PeriodType periodType21 = periodType20.withWeeksRemoved();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, readableInstant15, periodType21);
        org.joda.time.Duration duration23 = duration10.minus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Interval interval27 = duration25.toIntervalFrom(readableInstant26);
        org.joda.time.Duration duration29 = duration14.withDurationAdded((org.joda.time.ReadableDuration) duration25, 56);
        boolean boolean30 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration25);
        long long31 = duration25.getStandardDays();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test20679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20679");
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Period period7 = period3.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType8 = period3.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (short) -1, periodType10, chronology11);
        org.joda.time.Period period13 = period12.normalizedStandard();
        org.joda.time.Period period15 = period12.minusMillis(2);
        org.joda.time.Period period17 = period15.withMonths(118);
        java.lang.String str18 = period15.toString();
        org.joda.time.Period period20 = period15.plusSeconds(1491373);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT0.003S" + "'", str18, "PT0.003S");
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test20680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20680");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) 97);
        org.joda.time.Duration duration2 = new org.joda.time.Duration((java.lang.Object) duration1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.format.PeriodPrinter periodPrinter6 = null;
        org.joda.time.format.PeriodParser periodParser7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = new org.joda.time.format.PeriodFormatter(periodPrinter6, periodParser7);
        boolean boolean9 = periodFormatter8.isParser();
        org.joda.time.Days days10 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType11 = days10.getPeriodType();
        org.joda.time.PeriodType periodType12 = periodType11.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter8.withParseType(periodType11);
        org.joda.time.Days days14 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType15 = days14.getPeriodType();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.PeriodType periodType17 = periodType15.withYearsRemoved();
        java.lang.String str18 = periodType17.toString();
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter13.withParseType(periodType17);
        org.joda.time.PeriodType periodType20 = periodFormatter19.getParseType();
        java.util.Locale locale21 = periodFormatter19.getLocale();
        java.util.Locale locale22 = periodFormatter19.getLocale();
        org.joda.time.format.PeriodParser periodParser23 = periodFormatter19.getParser();
        org.joda.time.PeriodType periodType24 = periodFormatter19.getParseType();
        org.joda.time.Period period25 = duration2.toPeriodFrom(readableInstant5, periodType24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Interval interval27 = duration2.toIntervalFrom(readableInstant26);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PeriodType[Days]" + "'", str18, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNull(locale21);
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNull(periodParser23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(interval27);
    }

    @Test
    public void test20681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20681");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period5.toDurationFrom(readableInstant7);
        org.joda.time.PeriodType periodType9 = period5.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType11 = periodType9.getFieldType(0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(durationFieldType11);
    }

    @Test
    public void test20682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20682");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        org.joda.time.Minutes minutes16 = minutes13.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration17 = minutes13.toStandardDuration();
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Minutes minutes23 = period22.toStandardMinutes();
        org.joda.time.Duration duration24 = minutes23.toStandardDuration();
        org.joda.time.Period period25 = duration24.toPeriod();
        boolean boolean26 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration24);
        boolean boolean27 = duration6.isEqual((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        boolean boolean29 = duration6.equals((java.lang.Object) period28);
        org.joda.time.Period period30 = new org.joda.time.Period((java.lang.Object) duration6);
        org.joda.time.Minutes minutes31 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        long long33 = duration32.getStandardSeconds();
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period36.minusMonths(0);
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Duration duration40 = minutes39.toStandardDuration();
        org.joda.time.Minutes minutes42 = minutes39.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration43 = minutes39.toStandardDuration();
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period48 = period46.minusMonths(0);
        org.joda.time.Minutes minutes49 = period48.toStandardMinutes();
        org.joda.time.Duration duration50 = minutes49.toStandardDuration();
        org.joda.time.Period period51 = duration50.toPeriod();
        boolean boolean52 = duration43.isLongerThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.days();
        org.joda.time.Period period55 = duration43.toPeriodTo(readableInstant53, periodType54);
        org.joda.time.Duration duration56 = duration32.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Duration duration57 = duration56.toDuration();
        org.joda.time.Duration duration58 = duration56.toDuration();
        org.joda.time.Duration duration60 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration56, (int) '4');
        org.joda.time.Duration duration62 = org.joda.time.Duration.standardHours(52000L);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Interval interval64 = duration62.toIntervalTo(readableInstant63);
        org.joda.time.Period period66 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period67 = period66.toPeriod();
        org.joda.time.Period period69 = period66.plusMinutes(1);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Duration duration71 = period66.toDurationTo(readableInstant70);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Period period73 = duration71.toPeriodTo(readableInstant72);
        boolean boolean74 = duration62.isShorterThan((org.joda.time.ReadableDuration) duration71);
        boolean boolean75 = duration6.isLongerThan((org.joda.time.ReadableDuration) duration71);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-128849018880L) + "'", long33 == (-128849018880L));
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test20683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20683");
        org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT5200H");
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test20684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20684");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(0);
        org.joda.time.Days days2 = period1.toStandardDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test20685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20685");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Minutes minutes8 = minutes6.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes0.minus(minutes6);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Minutes minutes18 = minutes16.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes19 = minutes10.minus(minutes16);
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Minutes minutes25 = period24.toStandardMinutes();
        org.joda.time.Duration duration26 = minutes25.toStandardDuration();
        org.joda.time.Minutes minutes28 = minutes25.multipliedBy((int) (short) 1);
        int int29 = minutes10.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes28);
        org.joda.time.Minutes minutes30 = minutes9.plus(minutes28);
        org.joda.time.Minutes minutes31 = minutes28.negated();
        org.joda.time.Period period32 = minutes28.toPeriod();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test20686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20686");
        org.joda.time.Period period1 = org.joda.time.Period.days((-14392));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test20687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20687");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (short) 10);
        org.joda.time.Period period3 = period1.withHours((int) (byte) 10);
        int int4 = period3.size();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period3.toDurationFrom(readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds((long) 10);
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds13 = seconds11.plus(seconds12);
        org.joda.time.Seconds seconds15 = seconds11.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds16 = seconds10.plus(seconds11);
        org.joda.time.Duration duration17 = seconds11.toStandardDuration();
        org.joda.time.Duration duration18 = duration8.minus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType21 = periodType20.withDaysRemoved();
        java.lang.String str22 = periodType21.getName();
        org.joda.time.PeriodType periodType23 = periodType21.withDaysRemoved();
        org.joda.time.Period period24 = duration18.toPeriodFrom(readableInstant19, periodType21);
        org.joda.time.Seconds seconds26 = org.joda.time.Seconds.parseSeconds("PT60S");
        org.joda.time.Duration duration27 = seconds26.toStandardDuration();
        boolean boolean28 = periodType21.equals((java.lang.Object) duration27);
        boolean boolean29 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period32 = new org.joda.time.Period((-128849018880L), periodType31);
        org.joda.time.PeriodType periodType33 = periodType31.withMillisRemoved();
        org.joda.time.PeriodType periodType34 = periodType31.withDaysRemoved();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = duration27.toPeriod(periodType34, chronology35);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "YearMonthDayTimeNoDays" + "'", str22, "YearMonthDayTimeNoDays");
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period36);
    }

    @Test
    public void test20688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20688");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalFrom(readableInstant7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval8);
        int int10 = minutes9.getMinutes();
        org.joda.time.Minutes minutes11 = minutes9.negated();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(minutes11);
    }

    @Test
    public void test20689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20689");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
        org.joda.time.Duration duration8 = minutes7.toStandardDuration();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Duration duration15 = minutes14.toStandardDuration();
        boolean boolean16 = duration8.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = new org.joda.time.Duration(readableInstant17, readableInstant18);
        org.joda.time.Duration duration20 = duration8.minus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant21);
        org.joda.time.Duration duration24 = duration8.plus((long) 8);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Interval interval26 = duration24.toIntervalFrom(readableInstant25);
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period31 = period29.minusMonths(0);
        org.joda.time.Minutes minutes32 = period31.toStandardMinutes();
        org.joda.time.Duration duration33 = minutes32.toStandardDuration();
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period36.minusMonths(0);
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Duration duration40 = minutes39.toStandardDuration();
        boolean boolean41 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration43 = duration33.plus((long) (short) 10);
        org.joda.time.Duration duration45 = duration24.withDurationAdded((org.joda.time.ReadableDuration) duration43, (int) (byte) 0);
        boolean boolean46 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Duration duration48 = duration43.withMillis(100L);
        org.joda.time.Period period50 = org.joda.time.Period.millis(0);
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.months();
        boolean boolean52 = period50.isSupported(durationFieldType51);
        java.lang.String str53 = durationFieldType51.getName();
        org.joda.time.Chronology chronology54 = null;
        boolean boolean55 = durationFieldType51.isSupported(chronology54);
        java.lang.String str56 = durationFieldType51.toString();
        boolean boolean57 = duration43.equals((java.lang.Object) durationFieldType51);
        java.lang.String str58 = durationFieldType51.getName();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "months" + "'", str53, "months");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "months" + "'", str56, "months");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "months" + "'", str58, "months");
    }

    @Test
    public void test20690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20690");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period5.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period5.minusDays((-36));
        org.joda.time.Period period12 = period5.plusDays(2147483647);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test20691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20691");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.Period period7 = period2.minusMinutes((int) '#');
        int int8 = period7.size();
        org.joda.time.PeriodType periodType9 = period7.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test20692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20692");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Period period8 = period2.multipliedBy((int) '4');
        org.joda.time.Duration duration11 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration13 = duration11.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant14);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Duration duration22 = minutes21.toStandardDuration();
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period27 = period25.minusMonths(0);
        org.joda.time.Minutes minutes28 = period27.toStandardMinutes();
        org.joda.time.Duration duration29 = minutes28.toStandardDuration();
        boolean boolean30 = duration22.isShorterThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = new org.joda.time.Duration(readableInstant31, readableInstant32);
        org.joda.time.Duration duration34 = duration22.minus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration35 = duration22.toDuration();
        boolean boolean36 = duration13.isEqual((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Period period39 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period41 = period39.minusMonths(0);
        org.joda.time.Minutes minutes42 = period41.toStandardMinutes();
        org.joda.time.Duration duration43 = minutes42.toStandardDuration();
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period48 = period46.minusMonths(0);
        org.joda.time.Minutes minutes49 = period48.toStandardMinutes();
        org.joda.time.Duration duration50 = minutes49.toStandardDuration();
        boolean boolean51 = duration43.isShorterThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = new org.joda.time.Duration(readableInstant52, readableInstant53);
        org.joda.time.Duration duration55 = duration43.minus((org.joda.time.ReadableDuration) duration54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration43, readableInstant56);
        org.joda.time.Period period58 = duration43.toPeriod();
        boolean boolean59 = duration35.equals((java.lang.Object) period58);
        org.joda.time.Period period60 = period8.minus((org.joda.time.ReadablePeriod) period58);
        org.joda.time.Period period62 = period60.multipliedBy(14400);
        org.joda.time.Period period64 = period62.plusWeeks((-97));
        org.joda.time.Period period66 = period64.withSeconds(2147483647);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
    }

    @Test
    public void test20693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20693");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Minutes minutes7 = minutes5.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes5.plus(8);
        org.joda.time.Minutes minutes11 = minutes5.dividedBy((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType12 = minutes11.getFieldType();
        org.joda.time.Minutes minutes13 = minutes11.negated();
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) minutes13);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period19 = period17.minusMonths(0);
        org.joda.time.Minutes minutes20 = period19.toStandardMinutes();
        org.joda.time.Minutes minutes22 = minutes20.multipliedBy((int) (byte) 1);
        org.joda.time.Minutes minutes24 = minutes20.minus(14400);
        boolean boolean25 = minutes13.isGreaterThan(minutes20);
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Minutes minutes33 = minutes31.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((java.lang.Object) minutes31, chronology34);
        org.joda.time.Period period36 = minutes31.toPeriod();
        org.joda.time.Minutes minutes37 = org.joda.time.Minutes.MAX_VALUE;
        boolean boolean38 = minutes31.isLessThan(minutes37);
        org.joda.time.Minutes minutes40 = minutes31.multipliedBy(14405);
        org.joda.time.Minutes minutes41 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period46 = period44.minusMonths(0);
        org.joda.time.Minutes minutes47 = period46.toStandardMinutes();
        org.joda.time.Minutes minutes49 = minutes47.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes50 = minutes41.minus(minutes47);
        org.joda.time.Minutes minutes51 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period54 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period56 = period54.minusMonths(0);
        org.joda.time.Minutes minutes57 = period56.toStandardMinutes();
        org.joda.time.Minutes minutes59 = minutes57.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes60 = minutes51.minus(minutes57);
        org.joda.time.Period period63 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period65 = period63.minusMonths(0);
        org.joda.time.Minutes minutes66 = period65.toStandardMinutes();
        org.joda.time.Duration duration67 = minutes66.toStandardDuration();
        org.joda.time.Minutes minutes69 = minutes66.multipliedBy((int) (short) 1);
        int int70 = minutes51.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes69);
        org.joda.time.Minutes minutes71 = minutes50.plus(minutes69);
        org.joda.time.Period period74 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period76 = period74.minusMonths(0);
        org.joda.time.Minutes minutes77 = period76.toStandardMinutes();
        org.joda.time.Minutes minutes79 = minutes77.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((java.lang.Object) minutes77, chronology80);
        org.joda.time.Period period82 = minutes77.toPeriod();
        org.joda.time.Minutes minutes83 = org.joda.time.Minutes.MAX_VALUE;
        boolean boolean84 = minutes77.isLessThan(minutes83);
        org.joda.time.Minutes minutes85 = minutes71.minus(minutes77);
        org.joda.time.Minutes minutes87 = minutes85.multipliedBy(59);
        org.joda.time.Minutes minutes89 = minutes85.plus(8);
        boolean boolean90 = minutes31.isGreaterThan(minutes85);
        org.joda.time.Minutes minutes92 = minutes31.dividedBy((int) ' ');
        org.joda.time.Minutes minutes93 = minutes20.plus(minutes92);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(minutes57);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertNotNull(minutes60);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(minutes66);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(minutes69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(minutes71);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(minutes77);
        org.junit.Assert.assertNotNull(minutes79);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(minutes83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(minutes85);
        org.junit.Assert.assertNotNull(minutes87);
        org.junit.Assert.assertNotNull(minutes89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(minutes92);
        org.junit.Assert.assertNotNull(minutes93);
    }

    @Test
    public void test20694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20694");
        org.joda.time.Hours hours3 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours4 = org.joda.time.Hours.SIX;
        org.joda.time.Hours hours5 = hours3.minus(hours4);
        org.joda.time.PeriodType periodType6 = hours4.getPeriodType();
        org.joda.time.Period period7 = new org.joda.time.Period(6000000L, periodType6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(10L, (long) (short) 1, periodType6, chronology8);
        java.lang.String str10 = periodType6.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = periodType6.getFieldType((-101));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hours" + "'", str10, "Hours");
    }

    @Test
    public void test20695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20695");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT432000S");
        java.lang.String str2 = duration1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withSecondsRemoved();
        org.joda.time.Period period11 = duration5.toPeriodFrom(readableInstant6, periodType8);
        long long12 = duration5.getStandardHours();
        org.joda.time.Days days13 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = duration5.toPeriod(periodType14, chronology15);
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Period period23 = period19.minusSeconds((int) (byte) 100);
        org.joda.time.Period period25 = period19.multipliedBy((int) '4');
        org.joda.time.DurationFieldType durationFieldType27 = period25.getFieldType(2);
        boolean boolean28 = periodType14.isSupported(durationFieldType27);
        org.joda.time.Period period29 = duration1.toPeriodFrom(readableInstant3, periodType14);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT432000S" + "'", str2, "PT432000S");
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test20696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20696");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 105, 0L);
    }

    @Test
    public void test20697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20697");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes10 = minutes8.multipliedBy(2);
        org.joda.time.PeriodType periodType11 = minutes10.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Minutes minutes15 = period12.toStandardMinutes();
        org.joda.time.Minutes minutes17 = minutes15.multipliedBy(2147483647);
        org.joda.time.Minutes minutes19 = minutes15.minus(36);
        org.joda.time.Minutes minutes21 = minutes15.multipliedBy(87);
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period27 = period25.minusMonths(0);
        org.joda.time.Minutes minutes28 = period27.toStandardMinutes();
        org.joda.time.Minutes minutes30 = minutes28.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes31 = minutes22.minus(minutes28);
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period36 = period34.minusMonths(0);
        org.joda.time.Minutes minutes37 = period36.toStandardMinutes();
        org.joda.time.Minutes minutes39 = minutes37.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((java.lang.Object) minutes37, chronology40);
        org.joda.time.Minutes minutes42 = minutes22.minus(minutes37);
        org.joda.time.DurationFieldType durationFieldType44 = minutes42.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType45 = minutes42.getPeriodType();
        org.joda.time.Minutes minutes46 = minutes42.negated();
        org.joda.time.DurationFieldType durationFieldType47 = minutes42.getFieldType();
        org.joda.time.Minutes minutes48 = minutes21.minus(minutes42);
        org.joda.time.Minutes minutes49 = minutes42.negated();
        org.joda.time.Minutes minutes50 = minutes10.plus(minutes49);
        org.joda.time.Minutes minutes52 = minutes50.plus((-39));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertNotNull(minutes52);
    }

    @Test
    public void test20698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20698");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Hours hours2 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType3 = hours2.getFieldType();
        org.joda.time.DurationFieldType durationFieldType4 = hours2.getFieldType();
        org.joda.time.Period period5 = period1.plus((org.joda.time.ReadablePeriod) hours2);
        org.joda.time.PeriodType periodType6 = period1.getPeriodType();
        org.joda.time.Period period8 = period1.minusYears((int) (byte) 0);
        org.joda.time.Period period10 = period8.withMonths(11);
        org.joda.time.Period period12 = period10.minusMonths(6);
        org.joda.time.Period period14 = period10.minusHours(12);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test20699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20699");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.format.PeriodPrinter periodPrinter3 = null;
        org.joda.time.format.PeriodParser periodParser4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = new org.joda.time.format.PeriodFormatter(periodPrinter3, periodParser4);
        boolean boolean6 = periodFormatter5.isParser();
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter5.withParseType(periodType8);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 8, periodType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodFormatter10);
    }

    @Test
    public void test20700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20700");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.parseMinutes("PT0H");
        org.joda.time.Minutes minutes11 = minutes5.minus(minutes10);
        org.joda.time.Period period12 = minutes10.toPeriod();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test20701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20701");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) 2);
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) (-97), (-128849018880L));
        boolean boolean5 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period6 = duration1.toPeriod();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test20702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20702");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((-10));
        org.joda.time.Hours hours2 = org.joda.time.Hours.MIN_VALUE;
        boolean boolean3 = hours1.isLessThan(hours2);
        org.joda.time.Hours hours5 = hours1.multipliedBy(52);
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Period period12 = period8.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType13 = period8.getPeriodType();
        org.joda.time.Hours hours14 = period8.toStandardHours();
        org.joda.time.Hours hours15 = hours1.minus(hours14);
        java.lang.String str16 = hours1.toString();
        org.joda.time.Hours hours18 = hours1.multipliedBy((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType20 = hours1.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT-10H" + "'", str16, "PT-10H");
        org.junit.Assert.assertNotNull(hours18);
    }

    @Test
    public void test20703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20703");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) 0);
        java.lang.String str2 = duration1.toString();
        org.joda.time.Seconds seconds3 = duration1.toStandardSeconds();
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds6 = seconds4.multipliedBy((int) (byte) 100);
        org.joda.time.PeriodType periodType7 = seconds6.getPeriodType();
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str10 = seconds9.toString();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        int int16 = period15.getYears();
        org.joda.time.Period period17 = period15.toPeriod();
        org.joda.time.Seconds seconds18 = period15.toStandardSeconds();
        boolean boolean19 = seconds9.isLessThan(seconds18);
        org.joda.time.Seconds seconds20 = seconds6.plus(seconds18);
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration22 = seconds21.toStandardDuration();
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds26 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds27 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds28 = seconds26.plus(seconds27);
        org.joda.time.Seconds seconds30 = seconds26.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds31 = seconds25.plus(seconds26);
        org.joda.time.Seconds seconds33 = seconds25.plus((int) '4');
        org.joda.time.Duration duration34 = seconds33.toStandardDuration();
        org.joda.time.Seconds seconds36 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds37 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds38 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds39 = seconds37.plus(seconds38);
        org.joda.time.Seconds seconds41 = seconds37.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds42 = seconds36.plus(seconds37);
        org.joda.time.Seconds seconds44 = seconds36.plus((int) '4');
        org.joda.time.Duration duration45 = seconds44.toStandardDuration();
        boolean boolean46 = seconds33.isLessThan(seconds44);
        boolean boolean47 = seconds23.isGreaterThan(seconds33);
        boolean boolean48 = seconds21.isGreaterThan(seconds23);
        boolean boolean49 = seconds20.isGreaterThan(seconds21);
        boolean boolean50 = seconds3.isGreaterThan(seconds21);
        org.joda.time.PeriodType periodType51 = seconds21.getPeriodType();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0S" + "'", str10, "PT0S");
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertNotNull(seconds41);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(periodType51);
    }

    @Test
    public void test20704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20704");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 26, chronology1);
        org.joda.time.Period period4 = period2.multipliedBy((-14405));
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test20705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20705");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT100S");
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration6 = duration4.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Interval interval10 = duration6.toIntervalFrom(readableInstant9);
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval10);
        org.joda.time.Seconds seconds13 = seconds11.plus(0);
        org.joda.time.Seconds seconds14 = seconds1.plus(seconds13);
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds17 = seconds15.plus(seconds16);
        org.joda.time.PeriodType periodType18 = seconds15.getPeriodType();
        int int19 = seconds15.size();
        org.joda.time.PeriodType periodType20 = seconds15.getPeriodType();
        org.joda.time.Seconds seconds21 = seconds1.plus(seconds15);
        org.joda.time.PeriodType periodType22 = seconds1.getPeriodType();
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds25 = seconds23.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType26 = seconds23.getFieldType();
        org.joda.time.Seconds seconds28 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str29 = seconds28.toString();
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period34 = period32.minusMonths(0);
        int int35 = period34.getYears();
        org.joda.time.Period period36 = period34.toPeriod();
        org.joda.time.Seconds seconds37 = period34.toStandardSeconds();
        boolean boolean38 = seconds28.isLessThan(seconds37);
        org.joda.time.Seconds seconds39 = seconds23.minus(seconds37);
        boolean boolean40 = seconds1.isGreaterThan(seconds39);
        org.joda.time.Seconds seconds42 = seconds39.plus(2147483639);
        org.joda.time.Duration duration43 = seconds39.toStandardDuration();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT0S" + "'", str29, "PT0S");
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertNotNull(duration43);
    }

    @Test
    public void test20706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20706");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withSecondsRemoved();
        org.joda.time.Period period8 = duration2.toPeriodFrom(readableInstant3, periodType5);
        long long9 = duration2.getMillis();
        org.joda.time.Days days12 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType13 = days12.getPeriodType();
        org.joda.time.PeriodType periodType14 = periodType13.withHoursRemoved();
        org.joda.time.PeriodType periodType15 = periodType13.withSecondsRemoved();
        org.joda.time.PeriodType periodType16 = periodType13.withMinutesRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withWeeksRemoved();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(10L, (long) (byte) -1, periodType17, chronology18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2, periodType17);
        org.joda.time.Period period21 = duration2.toPeriod();
        long long22 = duration2.getMillis();
        java.lang.Object obj23 = null;
        boolean boolean24 = duration2.equals(obj23);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100000L + "'", long9 == 100000L);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100000L + "'", long22 == 100000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test20707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20707");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getMillis();
        org.joda.time.Period period9 = duration1.toPeriod();
        org.joda.time.Period period10 = period9.toPeriod();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100000L + "'", long8 == 100000L);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test20708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20708");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT1S");
        org.joda.time.Seconds seconds2 = null;
        org.joda.time.Seconds seconds3 = seconds1.minus(seconds2);
        org.joda.time.Seconds seconds5 = seconds1.dividedBy(3104);
        org.joda.time.Seconds seconds7 = seconds5.dividedBy(100);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
    }

    @Test
    public void test20709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20709");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        java.lang.String str3 = seconds0.toString();
        org.joda.time.Seconds seconds5 = seconds0.minus(87);
        org.joda.time.Seconds seconds7 = seconds0.plus((int) (byte) 100);
        int int8 = seconds0.getSeconds();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT2S" + "'", str3, "PT2S");
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test20710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20710");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType6 = days4.getFieldType();
        boolean boolean7 = days2.isLessThan(days4);
        boolean boolean8 = days1.isGreaterThan(days4);
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.Days days12 = days9.plus((int) (byte) 100);
        boolean boolean13 = days4.isGreaterThan(days12);
        org.joda.time.Days days15 = days4.minus((-35));
        org.joda.time.Days days17 = days15.plus(1491308);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days17);
    }

    @Test
    public void test20711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20711");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 2147483644);
    }

    @Test
    public void test20712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20712");
        org.joda.time.Period period4 = new org.joda.time.Period(20, (int) (short) 10, (int) '4', (-12));
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration9 = duration7.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Interval interval13 = duration9.toIntervalFrom(readableInstant12);
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval13);
        org.joda.time.Period period15 = weeks14.toPeriod();
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.weeks(1);
        boolean boolean19 = weeks16.isGreaterThan(weeks18);
        org.joda.time.Weeks weeks20 = weeks14.minus(weeks16);
        org.joda.time.Weeks weeks21 = weeks14.negated();
        org.joda.time.Weeks weeks23 = weeks14.multipliedBy((-35));
        org.joda.time.Weeks weeks25 = org.joda.time.Weeks.weeks((-35));
        org.joda.time.Weeks weeks27 = weeks25.plus(11);
        org.joda.time.Weeks weeks28 = weeks23.plus(weeks27);
        org.joda.time.Weeks weeks30 = weeks28.minus((int) (byte) 100);
        org.joda.time.Weeks weeks31 = null;
        org.joda.time.Weeks weeks32 = weeks28.plus(weeks31);
        org.joda.time.DurationFieldType durationFieldType33 = weeks28.getFieldType();
        org.joda.time.Period period35 = period4.withField(durationFieldType33, 1680);
        org.joda.time.Period period37 = period4.minusHours((-118));
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test20713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20713");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT-27H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20714");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        java.lang.String str12 = periodType11.toString();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter7.withParseType(periodType11);
        org.joda.time.PeriodType periodType14 = periodFormatter13.getParseType();
        org.joda.time.format.PeriodParser periodParser15 = periodFormatter13.getParser();
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.years();
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter13.withParseType(periodType16);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter17.withParseType(periodType18);
        org.joda.time.format.PeriodPrinter periodPrinter20 = periodFormatter19.getPrinter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[Days]" + "'", str12, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNull(periodParser15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNull(periodPrinter20);
    }

    @Test
    public void test20715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20715");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(14400);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationTo(readableInstant2);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test20716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20716");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) '#');
        org.joda.time.Period period3 = period1.withWeeks((int) (byte) 0);
        org.joda.time.Period period5 = period1.plusMillis(0);
        org.joda.time.Period period7 = period5.withMonths((int) (short) -1);
        org.joda.time.Weeks weeks8 = period5.toStandardWeeks();
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks14 = weeks13.negated();
        org.joda.time.Weeks weeks15 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeksIn(readableInterval16);
        boolean boolean18 = weeks15.isLessThan(weeks17);
        boolean boolean19 = weeks14.isGreaterThan(weeks17);
        boolean boolean20 = weeks11.isLessThan(weeks14);
        int int21 = weeks14.getWeeks();
        org.joda.time.PeriodType periodType22 = weeks14.getPeriodType();
        org.joda.time.Period period23 = period10.minus((org.joda.time.ReadablePeriod) weeks14);
        org.joda.time.Weeks weeks24 = weeks14.negated();
        org.joda.time.Weeks weeks25 = weeks24.negated();
        org.joda.time.Duration duration28 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration30 = duration28.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Interval interval34 = duration30.toIntervalFrom(readableInstant33);
        org.joda.time.Weeks weeks35 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval34);
        org.joda.time.Period period36 = weeks35.toPeriod();
        org.joda.time.Weeks weeks37 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks39 = org.joda.time.Weeks.weeks(1);
        boolean boolean40 = weeks37.isGreaterThan(weeks39);
        org.joda.time.Weeks weeks41 = weeks35.minus(weeks37);
        org.joda.time.Weeks weeks42 = weeks35.negated();
        org.joda.time.Weeks weeks44 = weeks35.multipliedBy((-35));
        org.joda.time.Weeks weeks46 = org.joda.time.Weeks.weeks((-35));
        org.joda.time.Weeks weeks48 = weeks46.plus(11);
        org.joda.time.Weeks weeks49 = weeks44.plus(weeks48);
        org.joda.time.Weeks weeks50 = weeks25.plus(weeks44);
        boolean boolean51 = weeks8.isLessThan(weeks50);
        org.joda.time.Period period54 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period55 = period54.negated();
        int int56 = period54.getHours();
        int int57 = period54.getMonths();
        org.joda.time.Weeks weeks58 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period54);
        org.joda.time.Duration duration59 = weeks58.toStandardDuration();
        org.joda.time.Weeks weeks60 = weeks50.minus(weeks58);
        org.joda.time.Weeks weeks62 = weeks50.multipliedBy(200);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertNotNull(weeks46);
        org.junit.Assert.assertNotNull(weeks48);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertNotNull(weeks50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(weeks58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(weeks60);
        org.junit.Assert.assertNotNull(weeks62);
    }

    @Test
    public void test20717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20717");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withLocale(locale7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter8.withParseType(periodType9);
        java.util.Locale locale11 = null;
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter10.withLocale(locale11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertNotNull(periodFormatter12);
    }

    @Test
    public void test20718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20718");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = seconds3.plus(seconds4);
        org.joda.time.Seconds seconds7 = seconds3.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds8 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds10 = seconds3.multipliedBy((int) (short) 1);
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds13 = seconds11.plus(seconds12);
        org.joda.time.PeriodType periodType14 = seconds11.getPeriodType();
        int int15 = seconds11.size();
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.seconds((int) (byte) 10);
        boolean boolean19 = seconds17.equals((java.lang.Object) "PeriodType[StandardNoMinutes]");
        org.joda.time.Seconds seconds20 = seconds11.plus(seconds17);
        org.joda.time.Seconds seconds22 = seconds20.plus((int) (short) 0);
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds25 = seconds23.minus((int) 'a');
        int int26 = seconds23.size();
        int int27 = seconds23.getSeconds();
        org.joda.time.Seconds seconds28 = seconds20.plus(seconds23);
        org.joda.time.Seconds seconds30 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds31 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds32 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds33 = seconds31.plus(seconds32);
        org.joda.time.Seconds seconds35 = seconds31.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds36 = seconds30.plus(seconds31);
        org.joda.time.Seconds seconds38 = seconds30.plus((int) '4');
        org.joda.time.Duration duration39 = seconds38.toStandardDuration();
        org.joda.time.Seconds seconds41 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds42 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds43 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds44 = seconds42.plus(seconds43);
        org.joda.time.Seconds seconds46 = seconds42.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds47 = seconds41.plus(seconds42);
        org.joda.time.Seconds seconds49 = seconds41.plus((int) '4');
        org.joda.time.Duration duration50 = seconds49.toStandardDuration();
        boolean boolean51 = seconds38.isLessThan(seconds49);
        org.joda.time.Seconds seconds52 = seconds38.negated();
        org.joda.time.Seconds seconds53 = seconds28.plus(seconds52);
        org.joda.time.Seconds seconds54 = seconds3.plus(seconds28);
        org.joda.time.Seconds seconds56 = seconds3.dividedBy(87);
        org.joda.time.PeriodType periodType57 = seconds3.getPeriodType();
        org.joda.time.PeriodType periodType58 = periodType57.withMillisRemoved();
        org.joda.time.Period period60 = org.joda.time.Period.minutes((int) (short) 10);
        org.joda.time.Period period62 = period60.withHours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType64 = period62.getFieldType(3);
        int int65 = periodType58.indexOf(durationFieldType64);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period((-1814399990L), periodType58, chronology66);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period69 = period67.withMillis(26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(seconds41);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertNotNull(seconds46);
        org.junit.Assert.assertNotNull(seconds47);
        org.junit.Assert.assertNotNull(seconds49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(seconds52);
        org.junit.Assert.assertNotNull(seconds53);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test20719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20719");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(100);
        java.lang.String str2 = weeks1.toString();
        java.lang.String str3 = weeks1.toString();
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks6 = weeks5.negated();
        org.joda.time.Weeks weeks8 = weeks5.dividedBy(11);
        org.joda.time.Weeks weeks9 = weeks1.minus(weeks5);
        java.lang.String str10 = weeks5.toString();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P100W" + "'", str2, "P100W");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P100W" + "'", str3, "P100W");
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P1W" + "'", str10, "P1W");
    }

    @Test
    public void test20720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20720");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds10 = seconds8.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType11 = seconds8.getFieldType();
        int int12 = seconds8.getSeconds();
        org.joda.time.Seconds seconds13 = seconds8.negated();
        org.joda.time.Seconds seconds14 = seconds1.plus(seconds13);
        org.joda.time.Duration duration15 = seconds13.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration19 = org.joda.time.Duration.parse("PT99.640S");
        org.joda.time.Duration duration22 = duration19.withDurationAdded(10L, (int) (short) 10);
        org.joda.time.Duration duration24 = duration19.minus((long) 13);
        org.joda.time.Duration duration26 = duration24.withMillis(0L);
        org.joda.time.format.PeriodPrinter periodPrinter28 = null;
        org.joda.time.format.PeriodParser periodParser29 = null;
        org.joda.time.format.PeriodFormatter periodFormatter30 = new org.joda.time.format.PeriodFormatter(periodPrinter28, periodParser29);
        boolean boolean31 = periodFormatter30.isParser();
        org.joda.time.Seconds seconds33 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds34 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds35 = seconds33.plus(seconds34);
        org.joda.time.PeriodType periodType36 = seconds33.getPeriodType();
        org.joda.time.Period period39 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period40 = period39.negated();
        org.joda.time.DurationFieldType durationFieldType42 = period39.getFieldType((int) (short) 1);
        int int43 = periodType36.indexOf(durationFieldType42);
        org.joda.time.Period period44 = new org.joda.time.Period((long) ' ', periodType36);
        org.joda.time.format.PeriodFormatter periodFormatter45 = periodFormatter30.withParseType(periodType36);
        org.joda.time.PeriodType periodType46 = periodType36.withDaysRemoved();
        org.joda.time.Period period47 = new org.joda.time.Period(10L, periodType36);
        org.joda.time.PeriodType periodType48 = periodType36.withSecondsRemoved();
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration26, periodType48);
        org.joda.time.Period period50 = new org.joda.time.Period(36L, periodType48);
        org.joda.time.Seconds seconds51 = period50.toStandardSeconds();
        org.joda.time.Seconds seconds52 = seconds13.plus(seconds51);
        org.joda.time.Seconds seconds53 = seconds51.negated();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(seconds51);
        org.junit.Assert.assertNotNull(seconds52);
        org.junit.Assert.assertNotNull(seconds53);
    }

    @Test
    public void test20721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20721");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.PeriodType periodType3 = seconds0.getPeriodType();
        int int4 = seconds0.size();
        org.joda.time.PeriodType periodType5 = seconds0.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Period period13 = period9.withMillis((int) (short) 0);
        int int14 = period13.getSeconds();
        org.joda.time.Period period16 = period13.withDays((int) 'a');
        boolean boolean17 = periodType6.equals((java.lang.Object) period16);
        org.joda.time.Period period19 = period16.withMinutes((int) (byte) 100);
        org.joda.time.Period period21 = period16.minusHours(1491373);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test20722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20722");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (byte) 10);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.weeksIn(readableInterval3);
        org.joda.time.Weeks weeks6 = weeks4.dividedBy(11);
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeks(35);
        org.joda.time.Weeks weeks10 = weeks8.multipliedBy(5);
        org.joda.time.Period period11 = weeks10.toPeriod();
        boolean boolean12 = weeks4.isGreaterThan(weeks10);
        org.joda.time.Weeks weeks14 = weeks10.plus((int) (byte) 100);
        org.joda.time.Weeks weeks15 = weeks2.minus(weeks14);
        org.joda.time.Weeks weeks17 = weeks14.minus(85);
        org.joda.time.Weeks weeks19 = weeks14.dividedBy((-36));
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks19);
    }

    @Test
    public void test20723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20723");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Minutes minutes7 = minutes5.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes5.plus(8);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes12 = minutes10.plus(1);
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Minutes minutes21 = minutes19.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes22 = minutes13.minus(minutes19);
        org.joda.time.Minutes minutes24 = org.joda.time.Minutes.minutes((int) (short) -1);
        org.joda.time.Minutes minutes25 = minutes22.plus(minutes24);
        boolean boolean26 = minutes10.isGreaterThan(minutes22);
        org.joda.time.Minutes minutes28 = minutes10.dividedBy(7);
        org.joda.time.Minutes minutes30 = minutes28.plus(268435465);
        org.joda.time.Minutes minutes31 = minutes9.minus(minutes28);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(minutes31);
    }

    @Test
    public void test20724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20724");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10000L);
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration6 = duration4.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant7);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Duration duration15 = minutes14.toStandardDuration();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Duration duration22 = minutes21.toStandardDuration();
        boolean boolean23 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = new org.joda.time.Duration(readableInstant24, readableInstant25);
        org.joda.time.Duration duration27 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration28 = duration15.toDuration();
        boolean boolean29 = duration6.isEqual((org.joda.time.ReadableDuration) duration28);
        long long30 = duration28.getStandardDays();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = duration28.toPeriod(chronology31);
        org.joda.time.Duration duration35 = duration28.withDurationAdded(0L, (int) ' ');
        org.joda.time.Duration duration37 = duration35.withMillis((long) (-4083));
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period42 = new org.joda.time.Period((long) (byte) 1, (long) (-36), periodType41);
        org.joda.time.PeriodType periodType43 = periodType41.withMinutesRemoved();
        org.joda.time.PeriodType periodType44 = periodType41.withMinutesRemoved();
        org.joda.time.Period period45 = duration37.toPeriodTo(readableInstant38, periodType41);
        boolean boolean46 = duration1.isEqual((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Duration duration48 = duration37.withMillis((long) (-1));
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(duration48);
    }

    @Test
    public void test20725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20725");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy((int) (byte) 100);
        org.joda.time.PeriodType periodType3 = seconds2.getPeriodType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str6 = seconds5.toString();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        int int12 = period11.getYears();
        org.joda.time.Period period13 = period11.toPeriod();
        org.joda.time.Seconds seconds14 = period11.toStandardSeconds();
        boolean boolean15 = seconds5.isLessThan(seconds14);
        org.joda.time.Seconds seconds16 = seconds2.plus(seconds14);
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds19 = seconds17.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType20 = seconds17.getFieldType();
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds22 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds23 = seconds21.plus(seconds22);
        org.joda.time.Seconds seconds25 = seconds21.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds26 = seconds17.plus(seconds21);
        org.joda.time.Seconds seconds27 = seconds2.plus(seconds26);
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.seconds((int) (short) 0);
        int int30 = seconds29.getSeconds();
        boolean boolean31 = seconds26.isGreaterThan(seconds29);
        org.joda.time.Seconds seconds32 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds33 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds34 = seconds32.plus(seconds33);
        java.lang.String str35 = seconds32.toString();
        org.joda.time.DurationFieldType durationFieldType36 = seconds32.getFieldType();
        java.lang.String str37 = seconds32.toString();
        org.joda.time.Seconds seconds38 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds40 = seconds38.multipliedBy(10);
        org.joda.time.Duration duration41 = seconds38.toStandardDuration();
        boolean boolean42 = seconds32.isLessThan(seconds38);
        org.joda.time.Seconds seconds43 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds44 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds45 = seconds43.plus(seconds44);
        org.joda.time.PeriodType periodType46 = seconds43.getPeriodType();
        int int47 = seconds43.size();
        org.joda.time.Seconds seconds49 = org.joda.time.Seconds.seconds((int) (byte) 10);
        boolean boolean51 = seconds49.equals((java.lang.Object) "PeriodType[StandardNoMinutes]");
        org.joda.time.Seconds seconds52 = seconds43.plus(seconds49);
        org.joda.time.Seconds seconds54 = seconds52.plus((int) (short) 0);
        org.joda.time.Seconds seconds55 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds57 = seconds55.minus((int) 'a');
        int int58 = seconds55.size();
        int int59 = seconds55.getSeconds();
        org.joda.time.Seconds seconds60 = seconds52.plus(seconds55);
        org.joda.time.Seconds seconds62 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds63 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds64 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds65 = seconds63.plus(seconds64);
        org.joda.time.Seconds seconds67 = seconds63.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds68 = seconds62.plus(seconds63);
        org.joda.time.Seconds seconds70 = seconds62.plus((int) '4');
        org.joda.time.Duration duration71 = seconds70.toStandardDuration();
        org.joda.time.Seconds seconds73 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds74 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds75 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds76 = seconds74.plus(seconds75);
        org.joda.time.Seconds seconds78 = seconds74.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds79 = seconds73.plus(seconds74);
        org.joda.time.Seconds seconds81 = seconds73.plus((int) '4');
        org.joda.time.Duration duration82 = seconds81.toStandardDuration();
        boolean boolean83 = seconds70.isLessThan(seconds81);
        org.joda.time.Seconds seconds84 = seconds70.negated();
        org.joda.time.Seconds seconds85 = seconds60.plus(seconds84);
        org.joda.time.Seconds seconds86 = seconds38.minus(seconds85);
        org.joda.time.Seconds seconds87 = seconds26.minus(seconds38);
        org.joda.time.MutablePeriod mutablePeriod88 = seconds26.toMutablePeriod();
        org.joda.time.Seconds seconds89 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds90 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds91 = seconds89.plus(seconds90);
        java.lang.String str92 = seconds89.toString();
        org.joda.time.Seconds seconds94 = seconds89.minus(87);
        org.joda.time.Seconds seconds95 = seconds26.minus(seconds94);
        org.joda.time.Seconds seconds97 = seconds26.minus((-13));
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0S" + "'", str6, "PT0S");
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT2S" + "'", str35, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PT2S" + "'", str37, "PT2S");
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertNotNull(seconds45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(seconds49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(seconds52);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(seconds55);
        org.junit.Assert.assertNotNull(seconds57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(seconds60);
        org.junit.Assert.assertNotNull(seconds62);
        org.junit.Assert.assertNotNull(seconds63);
        org.junit.Assert.assertNotNull(seconds64);
        org.junit.Assert.assertNotNull(seconds65);
        org.junit.Assert.assertNotNull(seconds67);
        org.junit.Assert.assertNotNull(seconds68);
        org.junit.Assert.assertNotNull(seconds70);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(seconds73);
        org.junit.Assert.assertNotNull(seconds74);
        org.junit.Assert.assertNotNull(seconds75);
        org.junit.Assert.assertNotNull(seconds76);
        org.junit.Assert.assertNotNull(seconds78);
        org.junit.Assert.assertNotNull(seconds79);
        org.junit.Assert.assertNotNull(seconds81);
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(seconds84);
        org.junit.Assert.assertNotNull(seconds85);
        org.junit.Assert.assertNotNull(seconds86);
        org.junit.Assert.assertNotNull(seconds87);
        org.junit.Assert.assertNotNull(mutablePeriod88);
        org.junit.Assert.assertNotNull(seconds89);
        org.junit.Assert.assertNotNull(seconds90);
        org.junit.Assert.assertNotNull(seconds91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "PT2S" + "'", str92, "PT2S");
        org.junit.Assert.assertNotNull(seconds94);
        org.junit.Assert.assertNotNull(seconds95);
        org.junit.Assert.assertNotNull(seconds97);
    }

    @Test
    public void test20726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20726");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period4.negated();
        int int6 = period4.getHours();
        org.joda.time.Period period8 = org.joda.time.Period.days(10);
        org.joda.time.Period period10 = period8.plusMonths((int) 'a');
        org.joda.time.Period period12 = period8.plusSeconds((int) (short) 100);
        org.joda.time.Period period14 = period12.minusMonths((int) 'a');
        org.joda.time.Period period15 = period4.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Hours hours16 = period4.toStandardHours();
        int int17 = hours16.getHours();
        org.joda.time.Hours hours18 = hours0.plus(hours16);
        org.joda.time.Hours hours19 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours21 = hours19.dividedBy(100);
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period26 = period24.minusMonths(0);
        org.joda.time.Period period28 = period26.minusSeconds(0);
        org.joda.time.Period period29 = period28.normalizedStandard();
        org.joda.time.Hours hours30 = period29.toStandardHours();
        boolean boolean31 = hours21.isLessThan(hours30);
        org.joda.time.Period period33 = org.joda.time.Period.millis((int) '#');
        int int34 = period33.getYears();
        org.joda.time.Hours hours35 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period37 = period33.multipliedBy((int) (byte) 0);
        org.joda.time.Hours hours38 = period37.toStandardHours();
        org.joda.time.Hours hours39 = hours21.minus(hours38);
        boolean boolean40 = hours16.isLessThan(hours38);
        org.joda.time.Hours hours41 = org.joda.time.Hours.ONE;
        java.lang.String str42 = hours41.toString();
        org.joda.time.Hours hours43 = hours41.negated();
        org.joda.time.Hours hours44 = hours38.plus(hours41);
        org.joda.time.Duration duration45 = hours38.toStandardDuration();
        long long46 = duration45.getStandardSeconds();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(hours38);
        org.junit.Assert.assertNotNull(hours39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(hours41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT1H" + "'", str42, "PT1H");
        org.junit.Assert.assertNotNull(hours43);
        org.junit.Assert.assertNotNull(hours44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
    }

    @Test
    public void test20727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20727");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType2 = periodType1.withMillisRemoved();
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 0, periodType1);
        org.joda.time.PeriodType periodType4 = periodType1.withWeeksRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMillisRemoved();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test20728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20728");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.Period period6 = org.joda.time.Period.days(10);
        org.joda.time.Period period8 = period6.plusMonths((int) 'a');
        org.joda.time.Period period10 = period6.plusSeconds((int) (short) 100);
        org.joda.time.Period period12 = period10.minusMonths((int) 'a');
        org.joda.time.Period period13 = period2.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Hours hours14 = period2.toStandardHours();
        org.joda.time.Hours hours16 = hours14.minus((int) '#');
        org.joda.time.Hours hours17 = org.joda.time.Hours.ONE;
        int int18 = hours17.getHours();
        org.joda.time.Hours hours20 = hours17.multipliedBy((-95));
        org.joda.time.Hours hours22 = hours20.dividedBy((int) (short) 1);
        org.joda.time.Hours hours23 = hours14.plus(hours20);
        org.joda.time.Period period25 = org.joda.time.Period.millis((int) '#');
        int int26 = period25.getYears();
        org.joda.time.Hours hours27 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period25);
        int int28 = hours27.getHours();
        org.joda.time.Hours hours30 = hours27.multipliedBy((int) (short) 1);
        org.joda.time.Hours hours32 = hours27.multipliedBy((int) (short) 100);
        org.joda.time.Hours hours33 = hours23.minus(hours32);
        org.joda.time.DurationFieldType durationFieldType34 = hours33.getFieldType();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((java.lang.Object) hours33, chronology35);
        org.joda.time.Period period38 = period36.minusHours(4);
        org.joda.time.Period period39 = period38.negated();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period41 = period38.withMinutes(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
    }

    @Test
    public void test20729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20729");
        org.joda.time.Days days1 = org.joda.time.Days.days(400);
        org.joda.time.Duration duration2 = days1.toStandardDuration();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardHours((long) (short) 100);
        org.joda.time.Days days5 = duration4.toStandardDays();
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period9 = period8.negated();
        int int10 = period8.getHours();
        int int11 = period8.getWeeks();
        org.joda.time.Days days13 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days15 = days13.multipliedBy((int) (short) 100);
        org.joda.time.Days days16 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        org.joda.time.Days days19 = days16.minus(0);
        org.joda.time.Days days20 = days13.minus(days19);
        org.joda.time.Days days21 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days20);
        boolean boolean22 = period8.equals((java.lang.Object) days20);
        org.joda.time.PeriodType periodType23 = days20.getPeriodType();
        org.joda.time.Days days24 = days5.plus(days20);
        org.joda.time.PeriodType periodType25 = days5.getPeriodType();
        org.joda.time.Days days27 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days28 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType29 = days28.getPeriodType();
        org.joda.time.Days days30 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType31 = days30.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType32 = days30.getFieldType();
        boolean boolean33 = days28.isLessThan(days30);
        boolean boolean34 = days27.isGreaterThan(days30);
        org.joda.time.Days days35 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType36 = days35.getPeriodType();
        org.joda.time.Days days38 = days35.plus((int) (byte) 100);
        boolean boolean39 = days30.isGreaterThan(days38);
        org.joda.time.Days days41 = days30.plus((-116));
        org.joda.time.Days days43 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days45 = days43.multipliedBy((int) (short) 100);
        org.joda.time.Days days46 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType47 = days46.getPeriodType();
        org.joda.time.Days days49 = days46.minus(0);
        org.joda.time.Days days50 = days43.minus(days49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant51, readableDuration52);
        org.joda.time.Period period55 = period53.minusYears(0);
        org.joda.time.Days days56 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Days days57 = days49.plus(days56);
        org.joda.time.Days days59 = days49.plus((int) (short) 1);
        org.joda.time.Days days60 = org.joda.time.Days.ONE;
        org.joda.time.Days days61 = org.joda.time.Days.ONE;
        int int62 = days60.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days61);
        org.joda.time.Days days64 = days61.multipliedBy((int) '#');
        org.joda.time.Days days65 = org.joda.time.Days.SIX;
        org.joda.time.Days days66 = days64.minus(days65);
        org.joda.time.Days days67 = days65.negated();
        boolean boolean68 = days49.isGreaterThan(days67);
        boolean boolean69 = days30.isLessThan(days67);
        boolean boolean70 = days5.isGreaterThan(days30);
        boolean boolean71 = duration2.equals((java.lang.Object) boolean70);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days45);
        org.junit.Assert.assertNotNull(days46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(days50);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertNotNull(days57);
        org.junit.Assert.assertNotNull(days59);
        org.junit.Assert.assertNotNull(days60);
        org.junit.Assert.assertNotNull(days61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(days64);
        org.junit.Assert.assertNotNull(days65);
        org.junit.Assert.assertNotNull(days66);
        org.junit.Assert.assertNotNull(days67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test20730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20730");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.Period period8 = period6.plusHours(7);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Period period15 = period11.minusDays((int) (byte) 10);
        org.joda.time.Period period17 = period11.plusSeconds(87);
        org.joda.time.Period period19 = org.joda.time.Period.millis(0);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.months();
        boolean boolean21 = period19.isSupported(durationFieldType20);
        java.lang.String str22 = durationFieldType20.getName();
        org.joda.time.Chronology chronology23 = null;
        boolean boolean24 = durationFieldType20.isSupported(chronology23);
        java.lang.String str25 = durationFieldType20.toString();
        boolean boolean26 = period17.isSupported(durationFieldType20);
        boolean boolean27 = period8.isSupported(durationFieldType20);
        org.joda.time.Days days28 = period8.toStandardDays();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "months" + "'", str22, "months");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "months" + "'", str25, "months");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(days28);
    }

    @Test
    public void test20731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20731");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((-2697));
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test20732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20732");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-14370));
        org.joda.time.Period period3 = period1.plusHours((-2147483645));
        int int4 = period3.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test20733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20733");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod8 = period6.toMutablePeriod();
        org.joda.time.Duration duration9 = period6.toStandardDuration();
        org.joda.time.Period period11 = period6.withSeconds((-2));
        org.joda.time.Period period13 = period6.minusWeeks((-683));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test20734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20734");
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        java.lang.String str3 = days2.toString();
        org.joda.time.Days days5 = days2.multipliedBy((int) (byte) -1);
        org.joda.time.Days days6 = days2.negated();
        org.joda.time.Duration duration7 = days2.toStandardDuration();
        org.joda.time.Days days8 = duration7.toStandardDays();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = duration7.toPeriod(chronology9);
        long long11 = duration7.getMillis();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((java.lang.Object) long11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period19 = period17.minusMonths(0);
        org.joda.time.Period period20 = period17.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod21 = period20.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period20.toDurationFrom(readableInstant22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = duration23.toPeriod(chronology24);
        org.joda.time.Duration duration27 = new org.joda.time.Duration((long) 100);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Days days29 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType30 = days29.getPeriodType();
        org.joda.time.PeriodType periodType31 = periodType30.withHoursRemoved();
        org.joda.time.PeriodType periodType32 = periodType30.withSecondsRemoved();
        org.joda.time.PeriodType periodType33 = periodType30.withMinutesRemoved();
        org.joda.time.PeriodType periodType34 = periodType33.withWeeksRemoved();
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, readableInstant28, periodType34);
        org.joda.time.Duration duration36 = duration23.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.dayTime();
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, readableInstant37, periodType38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Period period41 = duration27.toPeriodFrom(readableInstant40);
        org.joda.time.Days days43 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days45 = days43.multipliedBy((int) (short) 100);
        org.joda.time.Days days46 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType47 = days46.getPeriodType();
        org.joda.time.Days days49 = days46.minus(0);
        org.joda.time.Days days50 = days43.minus(days49);
        org.joda.time.Days days52 = days43.minus(35);
        org.joda.time.Days days54 = days43.plus(14400);
        org.joda.time.PeriodType periodType55 = days43.getPeriodType();
        org.joda.time.PeriodType periodType56 = days43.getPeriodType();
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration27, periodType56);
        org.joda.time.PeriodType periodType58 = periodType56.withMinutesRemoved();
        org.joda.time.Period period59 = duration12.toPeriodFrom(readableInstant13, periodType58);
        java.lang.String str60 = periodType58.toString();
        org.joda.time.Period period61 = new org.joda.time.Period((long) 572, (long) (-2147483596), periodType58);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P5D" + "'", str3, "P5D");
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 432000000L + "'", long11 == 432000000L);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days45);
        org.junit.Assert.assertNotNull(days46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(days50);
        org.junit.Assert.assertNotNull(days52);
        org.junit.Assert.assertNotNull(days54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PeriodType[Days]" + "'", str60, "PeriodType[Days]");
    }

    @Test
    public void test20735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20735");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        java.lang.Object obj8 = null;
        boolean boolean9 = period6.equals(obj8);
        org.joda.time.Period period11 = period6.withWeeks((int) '#');
        org.joda.time.Period period12 = period6.negated();
        org.joda.time.Period period14 = period12.minusSeconds((int) (short) 0);
        org.joda.time.Period period16 = period14.plusSeconds(4);
        org.joda.time.Period period18 = period14.multipliedBy(87);
        org.joda.time.Period period20 = period14.minusMillis((-100));
        int int21 = period14.getMinutes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test20736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20736");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.FIVE;
        java.lang.String str2 = days1.toString();
        org.joda.time.Days days4 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days5 = days1.minus(days4);
        org.joda.time.Duration duration6 = days5.toStandardDuration();
        org.joda.time.Duration duration8 = org.joda.time.Duration.parse("PT0.011S");
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.time();
        org.joda.time.Period period10 = duration8.toPeriod(periodType9);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration6, periodType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period11.minusWeeks(26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P5D" + "'", str2, "P5D");
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test20737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20737");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant15);
        java.lang.String str17 = duration13.toString();
        long long18 = duration13.getMillis();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Minutes minutes25 = period24.toStandardMinutes();
        org.joda.time.Duration duration26 = minutes25.toStandardDuration();
        org.joda.time.Minutes minutes28 = minutes25.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType29 = minutes28.getPeriodType();
        org.joda.time.PeriodType periodType30 = minutes28.getPeriodType();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant19, periodType30);
        org.joda.time.Period period32 = period31.normalizedStandard();
        org.joda.time.Period period34 = period32.minusWeeks((-5));
        org.joda.time.Period period36 = period32.plusWeeks(14402);
        org.joda.time.Period period38 = period32.plusMonths((-64));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0S" + "'", str17, "PT0S");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test20738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20738");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) (short) 0);
        org.joda.time.Seconds seconds3 = seconds1.plus((int) (byte) 100);
        org.joda.time.Seconds seconds5 = seconds3.dividedBy((int) (byte) 100);
        org.joda.time.Seconds seconds7 = seconds3.minus(0);
        org.joda.time.Duration duration8 = seconds3.toStandardDuration();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Duration duration10 = duration8.plus(readableDuration9);
        org.joda.time.Duration duration12 = duration10.plus((-1491308L));
        long long13 = duration12.getStandardMinutes();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-23L) + "'", long13 == (-23L));
    }

    @Test
    public void test20739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20739");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        java.lang.String str1 = weeks0.toString();
        org.joda.time.Duration duration2 = weeks0.toStandardDuration();
        int int3 = weeks0.getWeeks();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str5 = periodType4.getName();
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.ONE;
        boolean boolean7 = periodType4.equals((java.lang.Object) weeks6);
        org.joda.time.Weeks weeks9 = weeks6.plus((int) (byte) 100);
        org.joda.time.Weeks weeks10 = weeks0.plus(weeks9);
        int int11 = weeks10.getWeeks();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0W" + "'", str1, "P0W");
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "YearMonthDay" + "'", str5, "YearMonthDay");
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test20740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20740");
        org.joda.time.Period period1 = org.joda.time.Period.months((-4));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test20741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20741");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        boolean boolean12 = periodType10.isSupported(durationFieldType11);
        int int13 = period2.get(durationFieldType11);
        org.joda.time.Period period15 = period2.withHours(1);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Period period22 = period18.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType23 = period18.getPeriodType();
        org.joda.time.PeriodType periodType24 = periodType23.withMinutesRemoved();
        java.lang.String str25 = periodType24.toString();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) period2, periodType24, chronology26);
        org.joda.time.PeriodType periodType28 = periodType24.withHoursRemoved();
        org.joda.time.PeriodType periodType29 = periodType24.withMillisRemoved();
        org.joda.time.PeriodType periodType30 = periodType24.withMillisRemoved();
        org.joda.time.PeriodType periodType31 = periodType30.withDaysRemoved();
        org.joda.time.format.PeriodPrinter periodPrinter32 = null;
        org.joda.time.format.PeriodParser periodParser33 = null;
        org.joda.time.format.PeriodFormatter periodFormatter34 = new org.joda.time.format.PeriodFormatter(periodPrinter32, periodParser33);
        org.joda.time.format.PeriodPrinter periodPrinter35 = periodFormatter34.getPrinter();
        org.joda.time.Duration duration38 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Days days40 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType41 = days40.getPeriodType();
        org.joda.time.PeriodType periodType42 = periodType41.withHoursRemoved();
        org.joda.time.PeriodType periodType43 = periodType41.withSecondsRemoved();
        org.joda.time.Period period44 = duration38.toPeriodFrom(readableInstant39, periodType41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (short) 1, periodType41, chronology45);
        org.joda.time.format.PeriodFormatter periodFormatter47 = periodFormatter34.withParseType(periodType41);
        org.joda.time.format.PeriodPrinter periodPrinter48 = periodFormatter47.getPrinter();
        boolean boolean49 = periodType30.equals((java.lang.Object) periodFormatter47);
        org.joda.time.Days days52 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType53 = days52.getPeriodType();
        org.joda.time.PeriodType periodType54 = periodType53.withWeeksRemoved();
        org.joda.time.Period period55 = new org.joda.time.Period((long) (-1), (long) (byte) -1, periodType54);
        org.joda.time.PeriodType periodType56 = periodType54.withMinutesRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter57 = periodFormatter47.withParseType(periodType56);
        org.joda.time.format.PeriodPrinter periodPrinter58 = periodFormatter57.getPrinter();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str25, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNull(periodPrinter35);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodFormatter47);
        org.junit.Assert.assertNull(periodPrinter48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(days52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(periodFormatter57);
        org.junit.Assert.assertNull(periodPrinter58);
    }

    @Test
    public void test20742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20742");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.format.PeriodFormatter periodFormatter9 = periodFormatter7.withParseType(periodType8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Period period18 = period14.minusSeconds((int) (byte) 100);
        org.joda.time.Days days19 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType20 = days19.getPeriodType();
        org.joda.time.PeriodType periodType21 = periodType20.withHoursRemoved();
        org.joda.time.PeriodType periodType22 = periodType20.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.days();
        boolean boolean24 = periodType22.isSupported(durationFieldType23);
        int int25 = period14.get(durationFieldType23);
        org.joda.time.Period period27 = period14.withHours(1);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period32 = period30.minusMonths(0);
        org.joda.time.Period period34 = period30.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType35 = period30.getPeriodType();
        org.joda.time.PeriodType periodType36 = periodType35.withMinutesRemoved();
        java.lang.String str37 = periodType36.toString();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) period14, periodType36, chronology38);
        org.joda.time.PeriodType periodType40 = periodType36.withHoursRemoved();
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType36);
        org.joda.time.PeriodType periodType42 = periodType36.withSecondsRemoved();
        org.joda.time.PeriodType periodType43 = periodType36.withYearsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter44 = periodFormatter7.withParseType(periodType43);
        org.joda.time.PeriodType periodType45 = periodFormatter7.getParseType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str37, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodFormatter44);
        org.junit.Assert.assertNotNull(periodType45);
    }

    @Test
    public void test20743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20743");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(400);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test20744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20744");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period1);
        int int4 = hours3.getHours();
        org.joda.time.MutablePeriod mutablePeriod5 = hours3.toMutablePeriod();
        org.joda.time.Hours hours6 = hours3.negated();
        org.joda.time.Hours hours8 = hours3.multipliedBy((int) (byte) 100);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Period period15 = period13.minusSeconds(0);
        org.joda.time.Period period17 = period15.minusWeeks(10);
        org.joda.time.Hours hours18 = org.joda.time.Hours.ZERO;
        org.joda.time.Duration duration19 = hours18.toStandardDuration();
        org.joda.time.Period period20 = period17.minus((org.joda.time.ReadablePeriod) hours18);
        org.joda.time.Hours hours21 = org.joda.time.Hours.FIVE;
        org.joda.time.MutablePeriod mutablePeriod22 = hours21.toMutablePeriod();
        org.joda.time.Hours hours23 = hours18.plus(hours21);
        org.joda.time.Hours hours25 = hours18.minus((-8));
        org.joda.time.Hours hours26 = hours8.minus(hours18);
        org.joda.time.Hours hours28 = hours8.plus(7);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours28);
    }

    @Test
    public void test20745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20745");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.Duration duration8 = seconds2.toStandardDuration();
        org.joda.time.Period period10 = org.joda.time.Period.hours((int) '#');
        org.joda.time.Seconds seconds11 = period10.toStandardSeconds();
        boolean boolean12 = seconds2.isLessThan(seconds11);
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds17 = seconds15.plus(seconds16);
        org.joda.time.Seconds seconds19 = seconds15.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds20 = seconds14.plus(seconds15);
        org.joda.time.Seconds seconds22 = seconds15.multipliedBy((int) (short) 1);
        org.joda.time.Seconds seconds24 = seconds22.multipliedBy((int) '4');
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds27 = seconds25.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType28 = seconds25.getFieldType();
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds30 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds31 = seconds29.plus(seconds30);
        org.joda.time.Seconds seconds33 = seconds29.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds34 = seconds25.plus(seconds29);
        org.joda.time.Seconds seconds35 = seconds24.plus(seconds29);
        org.joda.time.Seconds seconds36 = seconds2.plus(seconds24);
        org.joda.time.PeriodType periodType37 = seconds24.getPeriodType();
        org.joda.time.Seconds seconds39 = seconds24.minus(168);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(seconds39);
    }

    @Test
    public void test20746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20746");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalFrom(readableInstant7);
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Period period10 = weeks9.toPeriod();
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeks(1);
        boolean boolean14 = weeks11.isGreaterThan(weeks13);
        org.joda.time.Weeks weeks15 = weeks9.minus(weeks11);
        org.joda.time.Weeks weeks16 = weeks9.negated();
        org.joda.time.Weeks weeks18 = weeks9.dividedBy((int) (byte) 1);
        org.joda.time.Weeks weeks20 = weeks9.multipliedBy((-2147483647));
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks20);
    }

    @Test
    public void test20747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20747");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.PeriodType periodType3 = seconds0.getPeriodType();
        int int4 = seconds0.size();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.seconds((int) (byte) 10);
        boolean boolean8 = seconds6.equals((java.lang.Object) "PeriodType[StandardNoMinutes]");
        org.joda.time.Seconds seconds9 = seconds0.plus(seconds6);
        org.joda.time.Seconds seconds11 = seconds9.plus((int) (short) 0);
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds14 = seconds12.minus((int) 'a');
        int int15 = seconds12.size();
        int int16 = seconds12.getSeconds();
        org.joda.time.Seconds seconds17 = seconds9.plus(seconds12);
        org.joda.time.Seconds seconds19 = seconds17.dividedBy(118);
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds22 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds24 = seconds22.plus(seconds23);
        org.joda.time.Seconds seconds26 = seconds22.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds27 = seconds21.plus(seconds22);
        org.joda.time.Seconds seconds29 = seconds22.multipliedBy((int) (short) 1);
        org.joda.time.Seconds seconds31 = seconds29.multipliedBy((int) '4');
        org.joda.time.Seconds seconds33 = seconds31.multipliedBy(87);
        org.joda.time.Duration duration34 = seconds33.toStandardDuration();
        org.joda.time.Seconds seconds35 = seconds19.minus(seconds33);
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period40 = period38.minusMonths(0);
        org.joda.time.Period period42 = period38.withMillis((int) (short) 0);
        int int43 = period42.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod44 = period42.toMutablePeriod();
        org.joda.time.Duration duration45 = period42.toStandardDuration();
        org.joda.time.Seconds seconds46 = duration45.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType47 = seconds46.getFieldType();
        org.joda.time.Seconds seconds49 = seconds46.plus(35);
        org.joda.time.Period period52 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period54 = period52.minusMonths(0);
        org.joda.time.Period period56 = period54.minusSeconds(0);
        int int57 = period54.getMonths();
        org.joda.time.Seconds seconds58 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period54);
        org.joda.time.DurationFieldType durationFieldType59 = seconds58.getFieldType();
        boolean boolean60 = seconds49.isLessThan(seconds58);
        org.joda.time.Seconds seconds61 = seconds33.minus(seconds58);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds63 = seconds33.minus((-2147483639));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 9048 + 2147483639");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(seconds46);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertNotNull(seconds49);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(seconds58);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(seconds61);
    }

    @Test
    public void test20748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20748");
        org.joda.time.Period period4 = new org.joda.time.Period(26, (-7), (int) (short) 100, (-2704));
    }

    @Test
    public void test20749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20749");
        org.joda.time.Duration duration2 = new org.joda.time.Duration(2L, 11000L);
        org.joda.time.ReadableDuration readableDuration3 = null;
        boolean boolean4 = duration2.isEqual(readableDuration3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test20750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20750");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withSecondsRemoved();
        org.joda.time.Period period12 = duration6.toPeriodFrom(readableInstant7, periodType9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 1, periodType9, chronology13);
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter2.withParseType(periodType9);
        boolean boolean16 = periodFormatter2.isParser();
        org.joda.time.format.PeriodPrinter periodPrinter17 = periodFormatter2.getPrinter();
        java.util.Locale locale18 = periodFormatter2.getLocale();
        boolean boolean19 = periodFormatter2.isPrinter();
        java.lang.StringBuffer stringBuffer20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableDuration22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationTo(readableInstant24);
        org.joda.time.Hours hours26 = duration25.toStandardHours();
        org.joda.time.Hours hours28 = hours26.dividedBy(999);
        org.joda.time.Hours hours30 = hours26.minus(2147483645);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer20, (org.joda.time.ReadablePeriod) hours30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(periodPrinter17);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(hours30);
    }

    @Test
    public void test20751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20751");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Hours hours1 = org.joda.time.Hours.hoursIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Hours hours3 = org.joda.time.Hours.hoursIn(readableInterval2);
        org.joda.time.Hours hours5 = hours3.multipliedBy(8);
        org.joda.time.Hours hours6 = hours1.plus(hours3);
        org.joda.time.Hours hours7 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours9 = hours7.dividedBy(100);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Period period16 = period14.minusSeconds(0);
        org.joda.time.Period period17 = period16.normalizedStandard();
        org.joda.time.Hours hours18 = period17.toStandardHours();
        boolean boolean19 = hours9.isLessThan(hours18);
        org.joda.time.Period period21 = org.joda.time.Period.millis((int) '#');
        int int22 = period21.getYears();
        org.joda.time.Hours hours23 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period21.multipliedBy((int) (byte) 0);
        org.joda.time.Hours hours26 = period25.toStandardHours();
        org.joda.time.Hours hours27 = hours9.minus(hours26);
        org.joda.time.Hours hours28 = hours1.minus(hours9);
        org.joda.time.Duration duration29 = hours28.toStandardDuration();
        org.joda.time.format.PeriodPrinter periodPrinter30 = null;
        org.joda.time.format.PeriodParser periodParser31 = null;
        org.joda.time.format.PeriodFormatter periodFormatter32 = new org.joda.time.format.PeriodFormatter(periodPrinter30, periodParser31);
        boolean boolean33 = periodFormatter32.isParser();
        java.util.Locale locale34 = null;
        org.joda.time.format.PeriodFormatter periodFormatter35 = periodFormatter32.withLocale(locale34);
        org.joda.time.PeriodType periodType36 = periodFormatter32.getParseType();
        java.util.Locale locale37 = null;
        org.joda.time.format.PeriodFormatter periodFormatter38 = periodFormatter32.withLocale(locale37);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType40 = periodType39.withMinutesRemoved();
        org.joda.time.PeriodType periodType41 = periodType40.withWeeksRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter42 = periodFormatter32.withParseType(periodType41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) duration29, periodType41, chronology43);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(periodFormatter35);
        org.junit.Assert.assertNull(periodType36);
        org.junit.Assert.assertNotNull(periodFormatter38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodFormatter42);
    }

    @Test
    public void test20752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20752");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        java.lang.String str1 = weeks0.toString();
        int int2 = weeks0.size();
        org.joda.time.PeriodType periodType3 = weeks0.getPeriodType();
        org.joda.time.Weeks weeks4 = null;
        org.joda.time.Weeks weeks5 = weeks0.minus(weeks4);
        org.joda.time.Weeks weeks7 = weeks5.plus(2);
        org.joda.time.Weeks weeks9 = weeks5.multipliedBy(11);
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks12 = weeks10.dividedBy(1);
        org.joda.time.Weeks weeks14 = weeks10.dividedBy(8);
        java.lang.String str15 = weeks14.toString();
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks18 = weeks17.negated();
        org.joda.time.Weeks weeks19 = weeks14.minus(weeks17);
        org.joda.time.Weeks weeks20 = weeks9.minus(weeks19);
        org.joda.time.Weeks weeks22 = weeks19.dividedBy((-612));
        org.joda.time.Weeks weeks23 = weeks19.negated();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0W" + "'", str1, "P0W");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P268435455W" + "'", str15, "P268435455W");
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks23);
    }

    @Test
    public void test20753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20753");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Minutes minutes8 = minutes6.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes0.minus(minutes6);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        org.joda.time.Minutes minutes18 = minutes15.multipliedBy((int) (short) 1);
        int int19 = minutes0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes18);
        org.joda.time.DurationFieldType durationFieldType20 = minutes18.getFieldType();
        org.joda.time.Minutes minutes21 = minutes18.negated();
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period26 = period24.minusMonths(0);
        org.joda.time.Minutes minutes27 = period26.toStandardMinutes();
        org.joda.time.Minutes minutes29 = minutes27.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes31 = minutes27.plus(8);
        org.joda.time.DurationFieldType durationFieldType32 = minutes31.getFieldType();
        org.joda.time.PeriodType periodType33 = minutes31.getPeriodType();
        org.joda.time.Minutes minutes34 = minutes21.minus(minutes31);
        org.joda.time.Period period37 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period39 = period37.minusMonths(0);
        org.joda.time.Minutes minutes40 = period39.toStandardMinutes();
        org.joda.time.Minutes minutes42 = minutes40.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes44 = minutes40.plus(8);
        org.joda.time.Minutes minutes46 = minutes40.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes47 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period50 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period52 = period50.minusMonths(0);
        org.joda.time.Minutes minutes53 = period52.toStandardMinutes();
        org.joda.time.Minutes minutes55 = minutes53.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes56 = minutes47.minus(minutes53);
        org.joda.time.Period period59 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period61 = period59.minusMonths(0);
        org.joda.time.Minutes minutes62 = period61.toStandardMinutes();
        org.joda.time.Minutes minutes64 = minutes62.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((java.lang.Object) minutes62, chronology65);
        org.joda.time.Minutes minutes67 = minutes47.minus(minutes62);
        org.joda.time.DurationFieldType durationFieldType69 = minutes67.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType70 = minutes67.getPeriodType();
        org.joda.time.Minutes minutes71 = minutes67.negated();
        org.joda.time.DurationFieldType durationFieldType72 = minutes67.getFieldType();
        org.joda.time.Minutes minutes73 = minutes40.plus(minutes67);
        org.joda.time.Minutes minutes75 = minutes40.minus(52);
        org.joda.time.Minutes minutes76 = minutes40.negated();
        org.joda.time.DurationFieldType durationFieldType77 = minutes40.getFieldType();
        boolean boolean78 = minutes21.isLessThan(minutes40);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(minutes62);
        org.junit.Assert.assertNotNull(minutes64);
        org.junit.Assert.assertNotNull(minutes67);
        org.junit.Assert.assertNotNull(durationFieldType69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(minutes71);
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertNotNull(minutes73);
        org.junit.Assert.assertNotNull(minutes75);
        org.junit.Assert.assertNotNull(minutes76);
        org.junit.Assert.assertNotNull(durationFieldType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test20754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20754");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((-7));
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
        org.joda.time.Duration duration8 = minutes7.toStandardDuration();
        org.joda.time.Minutes minutes10 = minutes7.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.parseMinutes("PT0H");
        org.joda.time.Minutes minutes13 = minutes7.minus(minutes12);
        org.joda.time.PeriodType periodType14 = minutes7.getPeriodType();
        boolean boolean15 = minutes1.isGreaterThan(minutes7);
        org.joda.time.Period period17 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes18 = period17.toStandardMinutes();
        org.joda.time.Minutes minutes20 = minutes18.multipliedBy(1);
        boolean boolean21 = minutes1.isGreaterThan(minutes20);
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.ZERO;
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration25 = duration24.toDuration();
        org.joda.time.Minutes minutes26 = duration24.toStandardMinutes();
        org.joda.time.Minutes minutes27 = minutes22.minus(minutes26);
        org.joda.time.Minutes minutes28 = minutes27.negated();
        org.joda.time.Minutes minutes30 = minutes28.dividedBy(5);
        org.joda.time.Minutes minutes31 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period36 = period34.minusMonths(0);
        org.joda.time.Minutes minutes37 = period36.toStandardMinutes();
        org.joda.time.Minutes minutes39 = minutes37.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes40 = minutes31.minus(minutes37);
        org.joda.time.Minutes minutes41 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period46 = period44.minusMonths(0);
        org.joda.time.Minutes minutes47 = period46.toStandardMinutes();
        org.joda.time.Minutes minutes49 = minutes47.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes50 = minutes41.minus(minutes47);
        org.joda.time.Period period53 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period55 = period53.minusMonths(0);
        org.joda.time.Minutes minutes56 = period55.toStandardMinutes();
        org.joda.time.Duration duration57 = minutes56.toStandardDuration();
        org.joda.time.Minutes minutes59 = minutes56.multipliedBy((int) (short) 1);
        int int60 = minutes41.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes59);
        org.joda.time.Minutes minutes61 = minutes40.plus(minutes59);
        org.joda.time.Period period64 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period66 = period64.minusMonths(0);
        org.joda.time.Minutes minutes67 = period66.toStandardMinutes();
        org.joda.time.Minutes minutes69 = minutes67.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((java.lang.Object) minutes67, chronology70);
        org.joda.time.Period period72 = minutes67.toPeriod();
        org.joda.time.Minutes minutes73 = org.joda.time.Minutes.MAX_VALUE;
        boolean boolean74 = minutes67.isLessThan(minutes73);
        org.joda.time.Minutes minutes75 = minutes61.minus(minutes67);
        org.joda.time.Minutes minutes77 = minutes75.multipliedBy(59);
        org.joda.time.Minutes minutes79 = minutes75.plus(8);
        boolean boolean80 = minutes30.isLessThan(minutes79);
        org.joda.time.Period period83 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period85 = period83.minusMonths(0);
        org.joda.time.Minutes minutes86 = period85.toStandardMinutes();
        org.joda.time.Minutes minutes88 = minutes86.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.Period period90 = new org.joda.time.Period((java.lang.Object) minutes86, chronology89);
        org.joda.time.Period period91 = minutes86.toPeriod();
        org.joda.time.Minutes minutes92 = org.joda.time.Minutes.MAX_VALUE;
        boolean boolean93 = minutes86.isLessThan(minutes92);
        org.joda.time.PeriodType periodType94 = minutes92.getPeriodType();
        boolean boolean95 = minutes79.isLessThan(minutes92);
        java.lang.String str96 = minutes92.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes97 = minutes1.minus(minutes92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -7 + -2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(minutes61);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(minutes67);
        org.junit.Assert.assertNotNull(minutes69);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(minutes73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(minutes75);
        org.junit.Assert.assertNotNull(minutes77);
        org.junit.Assert.assertNotNull(minutes79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(minutes86);
        org.junit.Assert.assertNotNull(minutes88);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(minutes92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(periodType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "PT2147483647M" + "'", str96, "PT2147483647M");
    }

    @Test
    public void test20755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20755");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.time();
        org.joda.time.PeriodType periodType19 = periodType18.withDaysRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter2.withParseType(periodType19);
        java.util.Locale locale21 = null;
        org.joda.time.format.PeriodFormatter periodFormatter22 = periodFormatter2.withLocale(locale21);
        org.joda.time.format.PeriodPrinter periodPrinter23 = periodFormatter22.getPrinter();
        java.util.Locale locale24 = periodFormatter22.getLocale();
        org.joda.time.format.PeriodPrinter periodPrinter25 = periodFormatter22.getPrinter();
        org.joda.time.PeriodType periodType26 = periodFormatter22.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period28 = periodFormatter22.parsePeriod("P");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertNull(periodPrinter23);
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertNull(periodPrinter25);
        org.junit.Assert.assertNull(periodType26);
    }

    @Test
    public void test20756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20756");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardHours((long) 32);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.Period period5 = period3.minusDays(36);
        org.joda.time.Period period7 = period3.withSeconds((-135));
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test20757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20757");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Interval interval3 = duration1.toIntervalFrom(readableInstant2);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval3);
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval3);
        org.joda.time.Minutes minutes7 = minutes5.multipliedBy(1491308);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
    }

    @Test
    public void test20758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20758");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(105L, (long) (-52), chronology2);
    }

    @Test
    public void test20759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20759");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.Seconds seconds9 = seconds1.plus((int) '4');
        org.joda.time.Duration duration10 = seconds9.toStandardDuration();
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds15 = seconds13.plus(seconds14);
        org.joda.time.Seconds seconds17 = seconds13.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds18 = seconds12.plus(seconds13);
        org.joda.time.Seconds seconds20 = seconds12.plus((int) '4');
        org.joda.time.Duration duration21 = seconds20.toStandardDuration();
        boolean boolean22 = seconds9.isLessThan(seconds20);
        org.joda.time.Seconds seconds23 = seconds9.negated();
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period28 = period26.minusMonths(0);
        org.joda.time.Period period30 = period26.withMillis((int) (short) 0);
        int int31 = period30.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod32 = period30.toMutablePeriod();
        org.joda.time.Duration duration33 = period30.toStandardDuration();
        org.joda.time.Seconds seconds34 = duration33.toStandardSeconds();
        org.joda.time.Seconds seconds35 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds36 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds37 = seconds35.plus(seconds36);
        org.joda.time.Seconds seconds39 = seconds35.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds40 = seconds34.minus(seconds39);
        int int41 = seconds40.size();
        org.joda.time.Seconds seconds42 = seconds23.plus(seconds40);
        org.joda.time.Period period45 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period47 = period45.minusMonths(0);
        org.joda.time.Period period49 = period45.withMillis((int) (short) 0);
        int int50 = period49.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod51 = period49.toMutablePeriod();
        org.joda.time.Duration duration52 = period49.toStandardDuration();
        org.joda.time.Seconds seconds53 = duration52.toStandardSeconds();
        org.joda.time.Seconds seconds54 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds55 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds56 = seconds54.plus(seconds55);
        org.joda.time.Seconds seconds58 = seconds54.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds59 = seconds53.minus(seconds58);
        int int60 = seconds59.size();
        org.joda.time.Seconds seconds61 = seconds42.minus(seconds59);
        org.joda.time.Seconds seconds63 = seconds42.multipliedBy((-14405));
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod51);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(seconds53);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(seconds55);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertNotNull(seconds58);
        org.junit.Assert.assertNotNull(seconds59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(seconds61);
        org.junit.Assert.assertNotNull(seconds63);
    }

    @Test
    public void test20760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20760");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.Weeks weeks3 = weeks1.dividedBy((int) (byte) -1);
        org.joda.time.Weeks weeks4 = null;
        org.joda.time.Weeks weeks5 = weeks3.minus(weeks4);
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeks(1);
        boolean boolean9 = weeks6.isGreaterThan(weeks8);
        java.lang.Object obj10 = null;
        boolean boolean11 = weeks8.equals(obj10);
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks15 = weeks13.dividedBy(100);
        org.joda.time.Weeks weeks16 = weeks8.minus(weeks15);
        org.joda.time.Weeks weeks17 = weeks3.plus(weeks8);
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeks(1);
        boolean boolean21 = weeks18.isGreaterThan(weeks20);
        java.lang.Object obj22 = null;
        boolean boolean23 = weeks20.equals(obj22);
        org.joda.time.Weeks weeks25 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks27 = weeks25.dividedBy(100);
        org.joda.time.Weeks weeks28 = weeks20.minus(weeks27);
        org.joda.time.Weeks weeks30 = weeks27.plus(35);
        org.joda.time.Weeks weeks32 = weeks27.multipliedBy(10);
        org.joda.time.Duration duration33 = weeks27.toStandardDuration();
        org.joda.time.Weeks weeks35 = weeks27.multipliedBy((int) (short) 100);
        org.joda.time.Weeks weeks37 = weeks35.dividedBy(14400);
        org.joda.time.Weeks weeks38 = weeks8.plus(weeks37);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertNotNull(weeks38);
    }

    @Test
    public void test20761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20761");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period1.toDurationTo(readableInstant3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = period5.minusMinutes(2);
        int int8 = period5.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test20762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20762");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration4 = duration1.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration6 = duration1.minus((long) (-1));
        org.joda.time.ReadableDuration readableDuration7 = null;
        boolean boolean8 = duration1.isShorterThan(readableDuration7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, readableInstant9);
        org.joda.time.Seconds seconds11 = duration1.toStandardSeconds();
        long long12 = duration1.getStandardSeconds();
        org.joda.time.Seconds seconds13 = duration1.toStandardSeconds();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(seconds13);
    }

    @Test
    public void test20763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20763");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), chronology1);
        org.joda.time.Period period4 = period2.minusHours(70);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test20764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20764");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 100);
        int int2 = period1.size();
        org.joda.time.Seconds seconds3 = period1.toStandardSeconds();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) seconds3, chronology4);
        org.joda.time.Period period7 = org.joda.time.Period.hours((-63));
        boolean boolean8 = period5.equals((java.lang.Object) period7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test20765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20765");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalFrom(readableInstant7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Duration duration10 = minutes9.toStandardDuration();
        org.joda.time.Duration duration12 = duration10.plus((-1814399990L));
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test20766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20766");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksIn(readableInterval1);
        boolean boolean3 = weeks0.isLessThan(weeks2);
        org.joda.time.Weeks weeks5 = weeks2.multipliedBy(10);
        org.joda.time.Weeks weeks6 = weeks2.negated();
        org.joda.time.Duration duration7 = weeks2.toStandardDuration();
        org.joda.time.Duration duration10 = new org.joda.time.Duration((-268435465L), 7200000L);
        org.joda.time.Duration duration12 = duration7.withDurationAdded((org.joda.time.ReadableDuration) duration10, (-15));
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = duration7.toPeriodFrom(readableInstant13);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test20767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20767");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        java.lang.String str12 = periodType11.toString();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter7.withParseType(periodType11);
        org.joda.time.PeriodType periodType14 = periodFormatter13.getParseType();
        java.util.Locale locale15 = periodFormatter13.getLocale();
        java.util.Locale locale16 = periodFormatter13.getLocale();
        boolean boolean17 = periodFormatter13.isPrinter();
        java.util.Locale locale18 = null;
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter13.withLocale(locale18);
        boolean boolean20 = periodFormatter13.isPrinter();
        java.util.Locale locale21 = null;
        org.joda.time.format.PeriodFormatter periodFormatter22 = periodFormatter13.withLocale(locale21);
        org.joda.time.format.PeriodPrinter periodPrinter23 = periodFormatter22.getPrinter();
        java.util.Locale locale24 = periodFormatter22.getLocale();
        boolean boolean25 = periodFormatter22.isPrinter();
        java.lang.StringBuffer stringBuffer26 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 35, (long) (byte) 1);
        org.joda.time.Period period30 = period29.toPeriod();
        org.joda.time.Seconds seconds31 = period30.toStandardSeconds();
        org.joda.time.PeriodType periodType32 = seconds31.getPeriodType();
        org.joda.time.PeriodType periodType33 = seconds31.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter22.printTo(stringBuffer26, (org.joda.time.ReadablePeriod) seconds31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PeriodType[Days]" + "'", str12, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertNull(periodPrinter23);
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test20768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20768");
        org.joda.time.Period period8 = new org.joda.time.Period((-36), (-2), (-5), 100, 11, (-95), 7, (int) (byte) 10);
        org.joda.time.Period period10 = period8.minusSeconds(37);
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Period period16 = period13.normalizedStandard();
        org.joda.time.Period period18 = period13.minusMinutes((int) '#');
        org.joda.time.Duration duration21 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration23 = duration21.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Seconds seconds26 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds27 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds28 = seconds26.plus(seconds27);
        org.joda.time.PeriodType periodType29 = seconds26.getPeriodType();
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period33 = period32.negated();
        org.joda.time.DurationFieldType durationFieldType35 = period32.getFieldType((int) (short) 1);
        int int36 = periodType29.indexOf(durationFieldType35);
        org.joda.time.Period period37 = new org.joda.time.Period((long) ' ', periodType29);
        org.joda.time.Period period38 = duration21.toPeriodTo(readableInstant24, periodType29);
        org.joda.time.DurationFieldType durationFieldType40 = period38.getFieldType((int) (byte) 0);
        java.lang.String str41 = durationFieldType40.getName();
        boolean boolean42 = period18.isSupported(durationFieldType40);
        org.joda.time.Period period44 = period18.withSeconds(4);
        org.joda.time.Period period45 = period44.toPeriod();
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.years();
        java.lang.String str47 = durationFieldType46.getName();
        java.lang.String str48 = durationFieldType46.getName();
        int int49 = period45.get(durationFieldType46);
        int int50 = period10.indexOf(durationFieldType46);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "seconds" + "'", str41, "seconds");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "years" + "'", str47, "years");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "years" + "'", str48, "years");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test20769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20769");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType5 = periodType4.withYearsRemoved();
        int int6 = periodType5.size();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) 2147483647, 480000L, periodType5, chronology7);
        org.joda.time.PeriodType periodType9 = periodType5.withYearsRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType5);
        org.joda.time.Hours hours13 = org.joda.time.Hours.hours((int) (byte) 100);
        org.joda.time.Hours hours14 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours16 = hours14.multipliedBy((int) 'a');
        boolean boolean17 = hours13.isGreaterThan(hours14);
        org.joda.time.PeriodType periodType18 = hours14.getPeriodType();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(0L, periodType18, chronology19);
        org.joda.time.Chronology chronology21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) periodType5, periodType18, chronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test20770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20770");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        boolean boolean8 = periodFormatter7.isPrinter();
        boolean boolean9 = periodFormatter7.isParser();
        boolean boolean10 = periodFormatter7.isPrinter();
        java.util.Locale locale11 = null;
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter7.withLocale(locale11);
        java.util.Locale locale13 = null;
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter12.withLocale(locale13);
        java.util.Locale locale15 = null;
        org.joda.time.format.PeriodFormatter periodFormatter16 = periodFormatter14.withLocale(locale15);
        boolean boolean17 = periodFormatter16.isPrinter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNotNull(periodFormatter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20771");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT1878163320S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20772");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        java.lang.String str1 = weeks0.toString();
        int int2 = weeks0.size();
        org.joda.time.PeriodType periodType3 = weeks0.getPeriodType();
        org.joda.time.Weeks weeks5 = weeks0.minus(7);
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks8 = weeks7.negated();
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.weeksIn(readableInterval10);
        boolean boolean12 = weeks9.isLessThan(weeks11);
        boolean boolean13 = weeks8.isGreaterThan(weeks11);
        org.joda.time.Weeks weeks14 = null;
        org.joda.time.Weeks weeks15 = weeks11.minus(weeks14);
        org.joda.time.DurationFieldType durationFieldType16 = weeks15.getFieldType();
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks20 = weeks19.negated();
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval22 = null;
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.weeksIn(readableInterval22);
        boolean boolean24 = weeks21.isLessThan(weeks23);
        boolean boolean25 = weeks20.isGreaterThan(weeks23);
        boolean boolean26 = weeks17.isLessThan(weeks20);
        org.joda.time.Weeks weeks27 = weeks15.plus(weeks20);
        org.joda.time.Weeks weeks29 = weeks20.minus(2);
        org.joda.time.Weeks weeks31 = weeks29.dividedBy((-10));
        org.joda.time.Weeks weeks32 = weeks31.negated();
        org.joda.time.Weeks weeks33 = weeks0.plus(weeks31);
        org.joda.time.Weeks weeks35 = weeks33.dividedBy(6);
        org.joda.time.Weeks weeks37 = weeks35.minus((-14370));
        org.joda.time.Duration duration40 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration42 = duration40.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration42, readableInstant43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Interval interval46 = duration42.toIntervalFrom(readableInstant45);
        org.joda.time.Weeks weeks47 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval46);
        org.joda.time.Weeks weeks48 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval46);
        org.joda.time.Weeks weeks49 = weeks48.negated();
        org.joda.time.Weeks weeks50 = weeks35.plus(weeks49);
        org.joda.time.Weeks weeks52 = weeks50.multipliedBy(11);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0W" + "'", str1, "P0W");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertNotNull(weeks48);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertNotNull(weeks50);
        org.junit.Assert.assertNotNull(weeks52);
    }

    @Test
    public void test20773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20773");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 1, (long) (-36), periodType2);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        int int9 = period8.getYears();
        org.joda.time.Period period10 = period8.toPeriod();
        org.joda.time.Seconds seconds11 = period8.toStandardSeconds();
        org.joda.time.Period period12 = period3.withFields((org.joda.time.ReadablePeriod) seconds11);
        org.joda.time.Seconds seconds14 = seconds11.minus((int) ' ');
        org.joda.time.Duration duration15 = seconds11.toStandardDuration();
        java.lang.String str16 = seconds11.toString();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT0S" + "'", str16, "PT0S");
    }

    @Test
    public void test20774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20774");
        org.joda.time.Period period2 = new org.joda.time.Period(120000L, (-128849018880000L));
        org.joda.time.Period period4 = period2.minusHours(87);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test20775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20775");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        org.joda.time.Duration duration15 = duration6.withDurationAdded((org.joda.time.ReadableDuration) duration13, (int) (short) 100);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = duration6.toPeriod(chronology16);
        org.joda.time.Period period19 = period17.plusMinutes(6);
        org.joda.time.Duration duration20 = period19.toStandardDuration();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = duration20.toPeriod(chronology21);
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period27 = period25.minusMonths(0);
        org.joda.time.Period period29 = period25.withMillis((int) (short) 0);
        int int30 = period29.getSeconds();
        java.lang.Object obj31 = null;
        boolean boolean32 = period29.equals(obj31);
        org.joda.time.Period period34 = period29.withWeeks((int) '#');
        org.joda.time.Period period36 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes37 = period36.toStandardMinutes();
        org.joda.time.Period period39 = period36.minusMonths(100);
        org.joda.time.Period period41 = period39.minusYears((int) (short) 10);
        org.joda.time.Period period42 = period34.plus((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Minutes minutes43 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period48 = period46.minusMonths(0);
        org.joda.time.Minutes minutes49 = period48.toStandardMinutes();
        org.joda.time.Minutes minutes51 = minutes49.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes52 = minutes43.minus(minutes49);
        org.joda.time.Minutes minutes53 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period56 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period58 = period56.minusMonths(0);
        org.joda.time.Minutes minutes59 = period58.toStandardMinutes();
        org.joda.time.Minutes minutes61 = minutes59.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes62 = minutes53.minus(minutes59);
        org.joda.time.Period period65 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period67 = period65.minusMonths(0);
        org.joda.time.Minutes minutes68 = period67.toStandardMinutes();
        org.joda.time.Duration duration69 = minutes68.toStandardDuration();
        org.joda.time.Minutes minutes71 = minutes68.multipliedBy((int) (short) 1);
        int int72 = minutes53.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes71);
        org.joda.time.Minutes minutes73 = minutes52.plus(minutes71);
        org.joda.time.Period period76 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period78 = period76.minusMonths(0);
        org.joda.time.Minutes minutes79 = period78.toStandardMinutes();
        org.joda.time.Minutes minutes81 = minutes79.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.Period period83 = new org.joda.time.Period((java.lang.Object) minutes79, chronology82);
        org.joda.time.Period period84 = minutes79.toPeriod();
        org.joda.time.Minutes minutes85 = org.joda.time.Minutes.MAX_VALUE;
        boolean boolean86 = minutes79.isLessThan(minutes85);
        org.joda.time.Minutes minutes87 = minutes73.minus(minutes79);
        org.joda.time.DurationFieldType durationFieldType88 = minutes79.getFieldType();
        org.joda.time.Period period90 = period42.withFieldAdded(durationFieldType88, 10);
        boolean boolean91 = period22.isSupported(durationFieldType88);
        org.joda.time.Period period92 = period22.toPeriod();
        org.joda.time.Minutes minutes93 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period22);
        org.joda.time.ReadableInstant readableInstant94 = null;
        org.joda.time.Duration duration95 = period22.toDurationFrom(readableInstant94);
        long long96 = duration95.getStandardSeconds();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertNotNull(minutes52);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertNotNull(minutes61);
        org.junit.Assert.assertNotNull(minutes62);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(minutes68);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(minutes71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(minutes73);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(minutes79);
        org.junit.Assert.assertNotNull(minutes81);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(minutes85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(minutes87);
        org.junit.Assert.assertNotNull(durationFieldType88);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(minutes93);
        org.junit.Assert.assertNotNull(duration95);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 360L + "'", long96 == 360L);
    }

    @Test
    public void test20776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20776");
        org.joda.time.Days days0 = org.joda.time.Days.TWO;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.Days days5 = period4.toStandardDays();
        org.joda.time.Days days7 = days5.minus(7);
        org.joda.time.Days days9 = org.joda.time.Days.days(1);
        org.joda.time.Days days11 = org.joda.time.Days.days((int) (short) 100);
        boolean boolean12 = days9.isLessThan(days11);
        org.joda.time.Days days13 = days5.plus(days11);
        boolean boolean14 = days1.isLessThan(days5);
        org.joda.time.Days days16 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days18 = days16.multipliedBy((int) (short) 100);
        org.joda.time.Days days19 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType20 = days19.getPeriodType();
        org.joda.time.Days days22 = days19.minus(0);
        org.joda.time.Days days23 = days16.minus(days22);
        org.joda.time.Days days24 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableDuration26);
        org.joda.time.Days days28 = period27.toStandardDays();
        org.joda.time.Days days30 = days28.minus(7);
        org.joda.time.Days days32 = org.joda.time.Days.days(1);
        org.joda.time.Days days34 = org.joda.time.Days.days((int) (short) 100);
        boolean boolean35 = days32.isLessThan(days34);
        org.joda.time.Days days36 = days28.plus(days34);
        boolean boolean37 = days24.isLessThan(days28);
        int int38 = days5.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days24);
        org.joda.time.Period period39 = days5.toPeriod();
        org.joda.time.Period period40 = period39.negated();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
    }

    @Test
    public void test20777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20777");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getStandardHours();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Interval interval10 = duration1.toIntervalFrom(readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, readableInstant11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) duration1, chronology13);
        org.joda.time.Duration duration15 = duration1.toDuration();
        org.joda.time.Duration duration16 = duration15.toDuration();
        org.joda.time.Duration duration18 = org.joda.time.Duration.parse("PT99.640S");
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period23 = period21.minusMonths(0);
        org.joda.time.Period period25 = period21.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType26 = period21.getPeriodType();
        org.joda.time.PeriodType periodType27 = periodType26.withMinutesRemoved();
        org.joda.time.PeriodType periodType28 = periodType27.withMinutesRemoved();
        boolean boolean29 = duration18.equals((java.lang.Object) periodType28);
        org.joda.time.Duration duration30 = duration16.minus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Days days34 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType35 = days34.getPeriodType();
        org.joda.time.PeriodType periodType36 = periodType35.withHoursRemoved();
        org.joda.time.PeriodType periodType37 = periodType35.withSecondsRemoved();
        org.joda.time.Period period38 = duration32.toPeriodFrom(readableInstant33, periodType35);
        org.joda.time.Days days39 = duration32.toStandardDays();
        org.joda.time.Days days40 = org.joda.time.Days.MIN_VALUE;
        boolean boolean41 = days39.isLessThan(days40);
        org.joda.time.Period period42 = days40.toPeriod();
        org.joda.time.Period period45 = new org.joda.time.Period((long) 35, (long) (byte) 1);
        org.joda.time.Period period46 = period45.toPeriod();
        org.joda.time.Days days47 = period46.toStandardDays();
        int int48 = days40.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days47);
        org.joda.time.Days days50 = days40.plus(14400);
        org.joda.time.Duration duration51 = days40.toStandardDuration();
        boolean boolean52 = duration18.equals((java.lang.Object) duration51);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(days50);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test20778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20778");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 10, (int) (short) 100, (int) (short) 1, (int) '4');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds((long) 'a');
        org.joda.time.Duration duration10 = duration8.minus(1298798109705600000L);
        boolean boolean11 = duration6.isLongerThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = duration6.toPeriodTo(readableInstant12);
        org.joda.time.Duration duration15 = duration6.withMillis((-2000L));
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
    }

    @Test
    public void test20779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20779");
        org.joda.time.Period period1 = new org.joda.time.Period(100000L);
        org.joda.time.Period period3 = period1.minusYears(100);
        org.joda.time.Weeks weeks4 = period1.toStandardWeeks();
        org.joda.time.Weeks weeks6 = weeks4.minus((-10));
        org.joda.time.Period period8 = org.joda.time.Period.hours(2147483645);
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeks(1);
        boolean boolean13 = weeks10.isGreaterThan(weeks12);
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean15 = weeks12.isGreaterThan(weeks14);
        org.joda.time.Weeks weeks17 = weeks12.multipliedBy(0);
        boolean boolean18 = weeks9.isGreaterThan(weeks12);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeksIn(readableInterval19);
        org.joda.time.Weeks weeks22 = weeks20.plus((-97));
        boolean boolean23 = weeks9.isGreaterThan(weeks20);
        org.joda.time.Weeks weeks24 = weeks4.minus(weeks20);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(weeks24);
    }

    @Test
    public void test20780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20780");
        org.joda.time.Period period4 = new org.joda.time.Period(101, (-683), (-8), 0);
    }

    @Test
    public void test20781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20781");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Duration duration2 = seconds1.toStandardDuration();
        org.joda.time.PeriodType periodType3 = seconds1.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMonthsRemoved();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test20782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20782");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationFrom(readableInstant1);
        org.joda.time.Duration duration3 = duration2.toDuration();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = duration2.toPeriodFrom(readableInstant4);
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Minutes minutes14 = minutes12.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes15 = minutes6.minus(minutes12);
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Minutes minutes22 = period21.toStandardMinutes();
        org.joda.time.Minutes minutes24 = minutes22.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes25 = minutes16.minus(minutes22);
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        org.joda.time.Minutes minutes34 = minutes31.multipliedBy((int) (short) 1);
        int int35 = minutes16.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes34);
        org.joda.time.Minutes minutes36 = minutes15.plus(minutes34);
        org.joda.time.Period period39 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period41 = period39.minusMonths(0);
        org.joda.time.Minutes minutes42 = period41.toStandardMinutes();
        org.joda.time.Duration duration43 = minutes42.toStandardDuration();
        org.joda.time.Minutes minutes45 = minutes42.multipliedBy((int) (short) 1);
        java.lang.String str46 = minutes45.toString();
        org.joda.time.Minutes minutes47 = minutes36.minus(minutes45);
        org.joda.time.Minutes minutes49 = minutes36.minus((-95));
        org.joda.time.Duration duration50 = minutes36.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Period period52 = duration50.toPeriodFrom(readableInstant51);
        boolean boolean53 = period5.equals((java.lang.Object) period52);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(minutes45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PT0M" + "'", str46, "PT0M");
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test20783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20783");
        java.lang.Object obj10 = null;
        org.joda.time.Period period12 = org.joda.time.Period.millis(0);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.months();
        boolean boolean14 = period12.isSupported(durationFieldType13);
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds17 = seconds15.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType18 = seconds15.getFieldType();
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds20 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds21 = seconds19.plus(seconds20);
        org.joda.time.Seconds seconds23 = seconds19.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds24 = seconds15.plus(seconds19);
        org.joda.time.Period period25 = period12.withFields((org.joda.time.ReadablePeriod) seconds19);
        org.joda.time.Period period27 = period12.plusWeeks((-10));
        org.joda.time.PeriodType periodType28 = period27.getPeriodType();
        org.joda.time.Period period29 = new org.joda.time.Period(obj10, periodType28);
        org.joda.time.PeriodType periodType30 = periodType28.withMonthsRemoved();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 2, (long) 36, periodType28, chronology31);
        org.joda.time.Period period33 = new org.joda.time.Period(37, 97, (int) (byte) 0, 2147483647, (-207432000), 4, (-213044), 26, periodType28);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test20784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20784");
        org.joda.time.Period period1 = org.joda.time.Period.millis((-36));
        int int2 = period1.getMillis();
        org.joda.time.PeriodType periodType3 = period1.getPeriodType();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test20785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20785");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Minutes minutes9 = minutes6.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration10 = minutes6.toStandardDuration();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Duration duration17 = minutes16.toStandardDuration();
        org.joda.time.Period period18 = duration17.toPeriod();
        boolean boolean19 = duration10.isLongerThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Duration duration22 = duration17.withDurationAdded(11L, (int) (byte) 10);
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period27 = period25.minusMonths(0);
        org.joda.time.Minutes minutes28 = period27.toStandardMinutes();
        org.joda.time.Duration duration29 = minutes28.toStandardDuration();
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period34 = period32.minusMonths(0);
        org.joda.time.Minutes minutes35 = period34.toStandardMinutes();
        org.joda.time.Duration duration36 = minutes35.toStandardDuration();
        boolean boolean37 = duration29.isShorterThan((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Duration duration39 = duration29.plus((long) (short) 10);
        long long40 = duration39.getStandardSeconds();
        org.joda.time.Duration duration41 = duration39.toDuration();
        java.lang.String str42 = duration39.toString();
        boolean boolean43 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration39);
        org.joda.time.Duration duration44 = duration39.toDuration();
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration44);
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period49 = period48.negated();
        org.joda.time.DurationFieldType durationFieldType51 = period48.getFieldType((int) (short) 1);
        org.joda.time.Period period53 = period45.withField(durationFieldType51, 2147483645);
        int[] intArray54 = period53.getValues();
        org.joda.time.Period period56 = period53.withYears((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks57 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as years is not precise in the period P10Y2147483645MT0.010S");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT0.010S" + "'", str42, "PT0.010S");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[0, 2147483645, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(period56);
    }

    @Test
    public void test20786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20786");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        boolean boolean12 = periodType10.isSupported(durationFieldType11);
        int int13 = period2.get(durationFieldType11);
        org.joda.time.Period period15 = period2.withHours(1);
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        org.joda.time.Period period18 = period15.plusMinutes(36);
        org.joda.time.Period period20 = period18.plusMonths((-10));
        java.lang.String str21 = period18.toString();
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology23 = null;
        boolean boolean24 = durationFieldType22.isSupported(chronology23);
        org.joda.time.Period period26 = period18.withFieldAdded(durationFieldType22, (-7));
        java.lang.String str27 = durationFieldType22.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT1H36M0.036S" + "'", str21, "PT1H36M0.036S");
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "years" + "'", str27, "years");
    }

    @Test
    public void test20787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20787");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 70, (long) (short) 1);
        org.joda.time.Duration duration4 = duration2.plus((long) (-4188));
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test20788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20788");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        org.joda.time.DurationFieldType durationFieldType14 = period11.getFieldType((int) (short) 1);
        int int15 = periodType8.indexOf(durationFieldType14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) ' ', periodType8);
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter2.withParseType(periodType8);
        java.util.Locale locale18 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str20 = periodType19.getName();
        org.joda.time.PeriodType periodType21 = periodType19.withHoursRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter22 = periodFormatter2.withParseType(periodType19);
        boolean boolean23 = periodFormatter22.isPrinter();
        boolean boolean24 = periodFormatter22.isPrinter();
        java.util.Locale locale25 = null;
        org.joda.time.format.PeriodFormatter periodFormatter26 = periodFormatter22.withLocale(locale25);
        java.lang.StringBuffer stringBuffer27 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 4, (-128849018880L), chronology30);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter22.printTo(stringBuffer27, (org.joda.time.ReadablePeriod) period31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "YearMonthDay" + "'", str20, "YearMonthDay");
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodFormatter26);
    }

    @Test
    public void test20789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20789");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-11));
        org.joda.time.Period period3 = period1.plusMinutes((-2147483645));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test20790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20790");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration4 = duration1.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration6 = duration1.plus((long) 2147483647);
        org.joda.time.Duration duration7 = duration6.toDuration();
        java.lang.Object obj8 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 35, (long) (byte) 1);
        org.joda.time.Period period12 = period11.toPeriod();
        org.joda.time.Seconds seconds13 = period12.toStandardSeconds();
        org.joda.time.PeriodType periodType14 = seconds13.getPeriodType();
        org.joda.time.PeriodType periodType15 = seconds13.getPeriodType();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(obj8, periodType15, chronology16);
        org.joda.time.Period period18 = duration6.toPeriod(periodType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration19 = new org.joda.time.Duration((java.lang.Object) period18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test20791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20791");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = days0.multipliedBy((int) (byte) -1);
        org.joda.time.Days days4 = days0.negated();
        org.joda.time.Duration duration5 = days0.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant6);
        java.lang.Object obj8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(obj8);
        org.joda.time.Period period11 = period9.minusWeeks((int) (short) 100);
        org.joda.time.Period period12 = period7.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = period11.plusYears((-36));
        org.joda.time.Period period16 = period14.minusMillis((int) ' ');
        org.joda.time.Period period18 = period14.withDays((-2147483640));
        org.joda.time.Period period20 = period14.multipliedBy((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType22 = period20.getFieldType((-483));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -483");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test20792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20792");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) '#');
        org.joda.time.Period period3 = period1.withWeeks((int) (byte) 0);
        org.joda.time.Period period5 = period1.plusSeconds((int) '4');
        org.joda.time.Weeks weeks6 = period1.toStandardWeeks();
        org.joda.time.Duration duration7 = weeks6.toStandardDuration();
        org.joda.time.Weeks weeks8 = weeks6.negated();
        org.joda.time.Weeks weeks9 = weeks8.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks9);
    }

    @Test
    public void test20793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20793");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((-480L), chronology1);
    }

    @Test
    public void test20794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20794");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Period period4 = period1.withWeeks((-1));
        org.joda.time.Period period5 = period1.toPeriod();
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks8 = weeks6.dividedBy(1);
        org.joda.time.PeriodType periodType9 = weeks8.getPeriodType();
        java.lang.String str10 = periodType9.getName();
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) period1, periodType9);
        org.joda.time.Period period12 = period11.normalizedStandard();
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = period11.getFieldTypes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Weeks" + "'", str10, "Weeks");
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
    }

    @Test
    public void test20795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20795");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds((long) 0);
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        org.joda.time.Period period14 = duration13.toPeriod();
        org.joda.time.Duration duration16 = duration13.plus((long) (byte) 0);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration16);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) duration16, periodType18, chronology19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration3, readableInstant5, periodType18);
        org.joda.time.DurationFieldType[] durationFieldTypeArray22 = period21.getFieldTypes();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.forFields(durationFieldTypeArray22);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.forFields(durationFieldTypeArray22);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.forFields(durationFieldTypeArray22);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.forFields(durationFieldTypeArray22);
        org.joda.time.DurationFieldType durationFieldType27 = null;
        int int28 = periodType26.indexOf(durationFieldType27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (-1), periodType26, chronology29);
        org.joda.time.PeriodType periodType31 = periodType26.withDaysRemoved();
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(durationFieldTypeArray22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(periodType31);
    }

    @Test
    public void test20796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20796");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType3 = seconds0.getFieldType();
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = seconds4.plus(seconds5);
        org.joda.time.Seconds seconds8 = seconds4.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds9 = seconds0.plus(seconds4);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) seconds4, chronology10);
        org.joda.time.Seconds seconds12 = null;
        boolean boolean13 = seconds4.isGreaterThan(seconds12);
        org.joda.time.Seconds seconds15 = seconds4.minus(52);
        int int16 = seconds15.getSeconds();
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.parseSeconds("PT100S");
        org.joda.time.Duration duration21 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration23 = duration21.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Interval interval27 = duration23.toIntervalFrom(readableInstant26);
        org.joda.time.Seconds seconds28 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval27);
        org.joda.time.Seconds seconds30 = seconds28.plus(0);
        org.joda.time.Seconds seconds31 = seconds18.plus(seconds30);
        org.joda.time.MutablePeriod mutablePeriod32 = seconds30.toMutablePeriod();
        org.joda.time.Seconds seconds34 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds35 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds36 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds37 = seconds35.plus(seconds36);
        org.joda.time.Seconds seconds39 = seconds35.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds40 = seconds34.plus(seconds35);
        org.joda.time.Seconds seconds42 = seconds34.plus((int) '4');
        org.joda.time.Seconds seconds43 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds45 = seconds43.multipliedBy(10);
        org.joda.time.Duration duration46 = seconds43.toStandardDuration();
        org.joda.time.Seconds seconds48 = seconds43.minus(3);
        org.joda.time.Seconds seconds49 = seconds34.plus(seconds43);
        org.joda.time.Seconds seconds50 = seconds30.plus(seconds43);
        boolean boolean51 = seconds15.isGreaterThan(seconds43);
        org.joda.time.Duration duration52 = seconds43.toStandardDuration();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-50) + "'", int16 == (-50));
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds37);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(seconds45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(seconds48);
        org.junit.Assert.assertNotNull(seconds49);
        org.junit.Assert.assertNotNull(seconds50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(duration52);
    }

    @Test
    public void test20797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20797");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(432000L, chronology1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period2);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = period2.getFieldTypes();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.forFields(durationFieldTypeArray4);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.forFields(durationFieldTypeArray4);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test20798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20798");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        java.lang.String str1 = weeks0.toString();
        int int2 = weeks0.size();
        org.joda.time.PeriodType periodType3 = weeks0.getPeriodType();
        org.joda.time.Weeks weeks5 = weeks0.minus(7);
        java.lang.String str6 = weeks0.toString();
        org.joda.time.Duration duration7 = weeks0.toStandardDuration();
        org.joda.time.Duration duration9 = duration7.plus((-2147483648L));
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = duration9.toPeriodFrom(readableInstant10);
        org.joda.time.DurationFieldType[] durationFieldTypeArray12 = period11.getFieldTypes();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.forFields(durationFieldTypeArray12);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0W" + "'", str1, "P0W");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0W" + "'", str6, "P0W");
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldTypeArray12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test20799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20799");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 23, (long) 3104);
    }

    @Test
    public void test20800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20800");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType7 = period2.getPeriodType();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period2.toDurationTo(readableInstant8);
        org.joda.time.Period period11 = period2.minusWeeks(7);
        org.joda.time.Period period13 = period11.plusDays(244983);
        org.joda.time.Period period15 = period13.withWeeks(4088);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test20801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20801");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.MutablePeriod mutablePeriod5 = period2.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod6 = period2.toMutablePeriod();
        org.joda.time.Period period8 = period2.minusMinutes((int) 'a');
        org.joda.time.Period period10 = period2.minusDays((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = period10.getValue(41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test20802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20802");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
        org.joda.time.Duration duration8 = minutes7.toStandardDuration();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Duration duration15 = minutes14.toStandardDuration();
        boolean boolean16 = duration8.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = new org.joda.time.Duration(readableInstant17, readableInstant18);
        org.joda.time.Duration duration20 = duration8.minus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant21);
        org.joda.time.Duration duration24 = duration8.plus((long) 8);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Interval interval26 = duration24.toIntervalFrom(readableInstant25);
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period31 = period29.minusMonths(0);
        org.joda.time.Minutes minutes32 = period31.toStandardMinutes();
        org.joda.time.Duration duration33 = minutes32.toStandardDuration();
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period36.minusMonths(0);
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Duration duration40 = minutes39.toStandardDuration();
        boolean boolean41 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration43 = duration33.plus((long) (short) 10);
        org.joda.time.Duration duration45 = duration24.withDurationAdded((org.joda.time.ReadableDuration) duration43, (int) (byte) 0);
        boolean boolean46 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Duration duration48 = duration43.withMillis(100L);
        org.joda.time.Period period49 = duration43.toPeriod();
        org.joda.time.Period period50 = duration43.toPeriod();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
    }

    @Test
    public void test20803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20803");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) '4');
        int int2 = period1.getSeconds();
        org.joda.time.Period period4 = period1.minusSeconds((-10));
        org.joda.time.Period period6 = period4.withMillis(1);
        org.joda.time.Period period7 = period4.normalizedStandard();
        org.joda.time.Period period8 = period4.normalizedStandard();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test20804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20804");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Minutes minutes8 = minutes6.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes0.minus(minutes6);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Minutes minutes18 = minutes16.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes19 = minutes10.minus(minutes16);
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Minutes minutes25 = period24.toStandardMinutes();
        org.joda.time.Duration duration26 = minutes25.toStandardDuration();
        org.joda.time.Minutes minutes28 = minutes25.multipliedBy((int) (short) 1);
        int int29 = minutes10.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes28);
        org.joda.time.Minutes minutes30 = minutes9.plus(minutes28);
        org.joda.time.Period period33 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period33.minusMonths(0);
        org.joda.time.Minutes minutes36 = period35.toStandardMinutes();
        org.joda.time.Minutes minutes38 = minutes36.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) minutes36, chronology39);
        org.joda.time.Period period41 = minutes36.toPeriod();
        org.joda.time.Minutes minutes42 = org.joda.time.Minutes.MAX_VALUE;
        boolean boolean43 = minutes36.isLessThan(minutes42);
        org.joda.time.Minutes minutes44 = minutes30.minus(minutes36);
        org.joda.time.Minutes minutes46 = minutes36.dividedBy((-36));
        org.joda.time.Minutes minutes48 = minutes46.dividedBy((int) (short) 1);
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period53 = period51.minusMonths(0);
        org.joda.time.Minutes minutes54 = period53.toStandardMinutes();
        org.joda.time.Duration duration55 = minutes54.toStandardDuration();
        org.joda.time.Minutes minutes57 = minutes54.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes59 = org.joda.time.Minutes.parseMinutes("PT0H");
        org.joda.time.Minutes minutes60 = minutes54.minus(minutes59);
        org.joda.time.Minutes minutes62 = minutes59.dividedBy(7);
        org.joda.time.Minutes minutes63 = minutes48.minus(minutes59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration64 = new org.joda.time.Duration((java.lang.Object) minutes63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Minutes");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(minutes57);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertNotNull(minutes60);
        org.junit.Assert.assertNotNull(minutes62);
        org.junit.Assert.assertNotNull(minutes63);
    }

    @Test
    public void test20805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20805");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        int int2 = weeks1.getWeeks();
        org.joda.time.Period period3 = weeks1.toPeriod();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        boolean boolean7 = weeks4.isLessThan(weeks6);
        boolean boolean8 = weeks1.equals((java.lang.Object) weeks6);
        java.lang.String str9 = weeks6.toString();
        org.joda.time.Weeks weeks11 = weeks6.dividedBy(1491308);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeksIn(readableInterval13);
        boolean boolean15 = weeks12.isLessThan(weeks14);
        org.joda.time.Weeks weeks17 = weeks14.multipliedBy((int) (short) 100);
        org.joda.time.Duration duration18 = weeks14.toStandardDuration();
        boolean boolean19 = weeks6.equals((java.lang.Object) duration18);
        org.joda.time.Duration duration21 = duration18.withMillis(84L);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0W" + "'", str9, "P0W");
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(duration21);
    }

    @Test
    public void test20806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20806");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        org.joda.time.Minutes minutes16 = minutes13.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration17 = minutes13.toStandardDuration();
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Minutes minutes23 = period22.toStandardMinutes();
        org.joda.time.Duration duration24 = minutes23.toStandardDuration();
        org.joda.time.Period period25 = duration24.toPeriod();
        boolean boolean26 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration24);
        boolean boolean27 = duration6.isEqual((org.joda.time.ReadableDuration) duration17);
        long long28 = duration6.getStandardMinutes();
        java.lang.String str29 = duration6.toString();
        long long30 = duration6.getMillis();
        org.joda.time.Minutes minutes31 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        long long33 = duration32.getStandardSeconds();
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period36.minusMonths(0);
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Duration duration40 = minutes39.toStandardDuration();
        org.joda.time.Minutes minutes42 = minutes39.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration43 = minutes39.toStandardDuration();
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period48 = period46.minusMonths(0);
        org.joda.time.Minutes minutes49 = period48.toStandardMinutes();
        org.joda.time.Duration duration50 = minutes49.toStandardDuration();
        org.joda.time.Period period51 = duration50.toPeriod();
        boolean boolean52 = duration43.isLongerThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.days();
        org.joda.time.Period period55 = duration43.toPeriodTo(readableInstant53, periodType54);
        org.joda.time.Duration duration56 = duration32.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Duration duration57 = duration56.toDuration();
        org.joda.time.Minutes minutes58 = duration57.toStandardMinutes();
        boolean boolean59 = duration6.isEqual((org.joda.time.ReadableDuration) duration57);
        org.joda.time.Minutes minutes60 = duration6.toStandardMinutes();
        org.joda.time.Minutes minutes62 = org.joda.time.Minutes.minutes(0);
        java.lang.String str63 = minutes62.toString();
        boolean boolean64 = minutes60.isLessThan(minutes62);
        org.joda.time.Period period67 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period69 = period67.minusMonths(0);
        org.joda.time.Minutes minutes70 = period69.toStandardMinutes();
        org.joda.time.Minutes minutes72 = minutes70.dividedBy((int) (byte) 100);
        org.joda.time.Period period75 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period77 = period75.minusMonths(0);
        org.joda.time.Minutes minutes78 = period77.toStandardMinutes();
        org.joda.time.Duration duration79 = minutes78.toStandardDuration();
        org.joda.time.Minutes minutes81 = minutes78.multipliedBy((int) (short) 1);
        int int82 = minutes81.getMinutes();
        boolean boolean83 = minutes72.isGreaterThan(minutes81);
        org.joda.time.Minutes minutes84 = minutes62.plus(minutes72);
        org.joda.time.Minutes minutes85 = minutes72.negated();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT0S" + "'", str29, "PT0S");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-128849018880L) + "'", long33 == (-128849018880L));
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(minutes60);
        org.junit.Assert.assertNotNull(minutes62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PT0M" + "'", str63, "PT0M");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(minutes70);
        org.junit.Assert.assertNotNull(minutes72);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(minutes78);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(minutes81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(minutes84);
        org.junit.Assert.assertNotNull(minutes85);
    }

    @Test
    public void test20807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20807");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0.036S");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = duration1.toPeriod(chronology2);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withSecondsRemoved();
        org.joda.time.Period period11 = duration5.toPeriodFrom(readableInstant6, periodType8);
        long long12 = duration5.getStandardHours();
        org.joda.time.Duration duration15 = duration5.withDurationAdded(10L, (-36));
        org.joda.time.Period period16 = duration15.toPeriod();
        java.lang.String str17 = duration15.toString();
        org.joda.time.Duration duration18 = duration1.minus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = duration1.toPeriodFrom(readableInstant19);
        int int21 = period20.getSeconds();
        org.joda.time.Period period22 = period20.negated();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT99.640S" + "'", str17, "PT99.640S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test20808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20808");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days8);
        org.joda.time.Days days11 = days8.dividedBy(3);
        org.joda.time.PeriodType periodType12 = days8.getPeriodType();
        java.lang.String str13 = days8.toString();
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Period period19 = period16.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period19.toDurationFrom(readableInstant21);
        org.joda.time.Period period24 = period19.minusDays((-36));
        org.joda.time.Days days25 = period19.toStandardDays();
        org.joda.time.Days days27 = days25.plus((-89));
        org.joda.time.Days days28 = days8.minus(days27);
        int int29 = days8.size();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P0D" + "'", str13, "P0D");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test20809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20809");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(10000L);
        org.joda.time.Duration duration3 = duration1.minus((long) (-95));
        org.joda.time.Minutes minutes4 = duration1.toStandardMinutes();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(minutes4);
    }

    @Test
    public void test20810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20810");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isParser();
        org.joda.time.format.PeriodPrinter periodPrinter7 = periodFormatter2.getPrinter();
        org.joda.time.PeriodType periodType8 = periodFormatter2.getParseType();
        org.joda.time.Period period10 = org.joda.time.Period.hours(2147483645);
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeks(1);
        boolean boolean15 = weeks12.isGreaterThan(weeks14);
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean17 = weeks14.isGreaterThan(weeks16);
        org.joda.time.Weeks weeks19 = weeks14.multipliedBy(0);
        boolean boolean20 = weeks11.isGreaterThan(weeks14);
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.weeksIn(readableInterval21);
        org.joda.time.Weeks weeks24 = weeks22.plus((-97));
        boolean boolean25 = weeks11.isGreaterThan(weeks22);
        org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) weeks11);
        org.joda.time.Weeks weeks27 = org.joda.time.Weeks.ZERO;
        java.lang.String str28 = weeks27.toString();
        org.joda.time.Weeks weeks30 = weeks27.multipliedBy(7);
        org.joda.time.PeriodType periodType31 = weeks30.getPeriodType();
        org.joda.time.Weeks weeks32 = weeks30.negated();
        int int33 = weeks32.getWeeks();
        org.joda.time.Weeks weeks35 = org.joda.time.Weeks.weeks((-10));
        org.joda.time.Weeks weeks37 = org.joda.time.Weeks.weeks(1);
        boolean boolean38 = weeks35.isGreaterThan(weeks37);
        org.joda.time.Weeks weeks39 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) weeks35);
        org.joda.time.Weeks weeks40 = org.joda.time.Weeks.ZERO;
        java.lang.String str41 = weeks40.toString();
        org.joda.time.Weeks weeks43 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks44 = weeks43.negated();
        org.joda.time.Weeks weeks45 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.Weeks weeks47 = org.joda.time.Weeks.weeksIn(readableInterval46);
        boolean boolean48 = weeks45.isLessThan(weeks47);
        boolean boolean49 = weeks44.isGreaterThan(weeks47);
        org.joda.time.Weeks weeks51 = weeks47.plus((int) (short) 100);
        org.joda.time.Weeks weeks52 = weeks40.plus(weeks51);
        org.joda.time.Weeks weeks53 = weeks52.negated();
        java.lang.String str54 = weeks53.toString();
        java.lang.String str55 = weeks53.toString();
        org.joda.time.Weeks weeks57 = weeks53.multipliedBy((-35));
        boolean boolean58 = weeks39.isGreaterThan(weeks53);
        org.joda.time.Weeks weeks59 = weeks32.plus(weeks53);
        boolean boolean60 = weeks11.isGreaterThan(weeks53);
        org.joda.time.MutablePeriod mutablePeriod61 = weeks53.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int64 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod61, "PT14M", (-268435465));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(periodPrinter7);
        org.junit.Assert.assertNull(periodType8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "P0W" + "'", str28, "P0W");
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "P0W" + "'", str41, "P0W");
        org.junit.Assert.assertNotNull(weeks43);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertNotNull(weeks52);
        org.junit.Assert.assertNotNull(weeks53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "P-100W" + "'", str54, "P-100W");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "P-100W" + "'", str55, "P-100W");
        org.junit.Assert.assertNotNull(weeks57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(weeks59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(mutablePeriod61);
    }

    @Test
    public void test20811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20811");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        java.lang.Object obj8 = null;
        boolean boolean9 = period6.equals(obj8);
        org.joda.time.Period period11 = period6.withWeeks((int) '#');
        org.joda.time.Period period13 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Period period16 = period13.minusMonths(100);
        org.joda.time.Period period18 = period16.minusYears((int) (short) 10);
        org.joda.time.Period period19 = period11.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType20 = period19.getPeriodType();
        org.joda.time.Period period22 = period19.withSeconds(1);
        org.joda.time.Period period24 = period19.withDays((-1));
        int int25 = period24.getWeeks();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
    }

    @Test
    public void test20812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20812");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationTo(readableInstant14);
        boolean boolean16 = duration9.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration20 = duration15.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Period period27 = period23.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType28 = period23.getPeriodType();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = duration15.toPeriod(periodType28, chronology29);
        org.joda.time.Period period33 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period33.minusMonths(0);
        org.joda.time.Minutes minutes36 = period35.toStandardMinutes();
        org.joda.time.Duration duration37 = minutes36.toStandardDuration();
        org.joda.time.Minutes minutes39 = minutes36.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration40 = minutes36.toStandardDuration();
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period44 = period43.negated();
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationTo(readableInstant45);
        boolean boolean47 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration46);
        org.joda.time.Duration duration50 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration51 = duration46.plus((org.joda.time.ReadableDuration) duration50);
        boolean boolean52 = duration15.isLongerThan((org.joda.time.ReadableDuration) duration51);
        org.joda.time.Duration duration54 = org.joda.time.Duration.millis((long) ' ');
        boolean boolean55 = duration51.isShorterThan((org.joda.time.ReadableDuration) duration54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = duration54.toPeriod(chronology56);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(period57);
    }

    @Test
    public void test20813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20813");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        java.lang.String str2 = weeks1.toString();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks5 = weeks4.negated();
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeksIn(readableInterval7);
        boolean boolean9 = weeks6.isLessThan(weeks8);
        boolean boolean10 = weeks5.isGreaterThan(weeks8);
        org.joda.time.Weeks weeks11 = null;
        org.joda.time.Weeks weeks12 = weeks8.minus(weeks11);
        org.joda.time.Duration duration15 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration17 = duration15.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Interval interval21 = duration17.toIntervalFrom(readableInstant20);
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval21);
        int int24 = weeks23.getWeeks();
        org.joda.time.Weeks weeks25 = weeks8.plus(weeks23);
        boolean boolean26 = weeks1.isGreaterThan(weeks25);
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.Weeks weeks28 = org.joda.time.Weeks.weeksIn(readableInterval27);
        org.joda.time.Weeks weeks30 = weeks28.plus((-97));
        org.joda.time.Weeks weeks32 = weeks30.minus(5);
        org.joda.time.Weeks weeks33 = weeks1.minus(weeks32);
        org.joda.time.DurationFieldType durationFieldType34 = weeks32.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks36 = weeks32.multipliedBy((-268435455));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -102 * -268435455");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P1W" + "'", str2, "P1W");
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(durationFieldType34);
    }

    @Test
    public void test20814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20814");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((-4083));
        int int2 = hours1.size();
        org.joda.time.Period period4 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Hours hours5 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType6 = hours5.getFieldType();
        org.joda.time.DurationFieldType durationFieldType7 = hours5.getFieldType();
        org.joda.time.Period period8 = period4.plus((org.joda.time.ReadablePeriod) hours5);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period11.negated();
        int int13 = period11.getHours();
        org.joda.time.Period period15 = org.joda.time.Period.days(10);
        org.joda.time.Period period17 = period15.plusMonths((int) 'a');
        org.joda.time.Period period19 = period15.plusSeconds((int) (short) 100);
        org.joda.time.Period period21 = period19.minusMonths((int) 'a');
        org.joda.time.Period period22 = period11.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Hours hours23 = period11.toStandardHours();
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period27 = period26.negated();
        org.joda.time.Period period28 = period11.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period30 = period28.plusWeeks(6);
        org.joda.time.Hours hours31 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Hours hours32 = hours5.minus(hours31);
        org.joda.time.Hours hours33 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType34 = hours33.getFieldType();
        org.joda.time.Period period37 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period37.negated();
        int int39 = period37.getHours();
        org.joda.time.Period period41 = org.joda.time.Period.days(10);
        org.joda.time.Period period43 = period41.plusMonths((int) 'a');
        org.joda.time.Period period45 = period41.plusSeconds((int) (short) 100);
        org.joda.time.Period period47 = period45.minusMonths((int) 'a');
        org.joda.time.Period period48 = period37.withFields((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Hours hours49 = period37.toStandardHours();
        int int50 = hours49.getHours();
        org.joda.time.Hours hours51 = hours33.plus(hours49);
        org.joda.time.Hours hours52 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours54 = hours52.dividedBy(100);
        org.joda.time.Period period57 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period59 = period57.minusMonths(0);
        org.joda.time.Period period61 = period59.minusSeconds(0);
        org.joda.time.Period period62 = period61.normalizedStandard();
        org.joda.time.Hours hours63 = period62.toStandardHours();
        boolean boolean64 = hours54.isLessThan(hours63);
        org.joda.time.Period period66 = org.joda.time.Period.millis((int) '#');
        int int67 = period66.getYears();
        org.joda.time.Hours hours68 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period66);
        org.joda.time.Period period70 = period66.multipliedBy((int) (byte) 0);
        org.joda.time.Hours hours71 = period70.toStandardHours();
        org.joda.time.Hours hours72 = hours54.minus(hours71);
        boolean boolean73 = hours49.isLessThan(hours71);
        org.joda.time.Hours hours74 = org.joda.time.Hours.ONE;
        java.lang.String str75 = hours74.toString();
        org.joda.time.Hours hours76 = hours74.negated();
        org.joda.time.Hours hours77 = hours71.plus(hours74);
        org.joda.time.Hours hours78 = org.joda.time.Hours.THREE;
        boolean boolean79 = hours71.isLessThan(hours78);
        java.lang.String str80 = hours71.toString();
        org.joda.time.Hours hours81 = hours5.minus(hours71);
        org.joda.time.Hours hours83 = hours5.plus(0);
        org.joda.time.Hours hours85 = hours5.dividedBy((-38));
        org.joda.time.Hours hours86 = hours1.plus(hours85);
        org.joda.time.Period period87 = hours85.toPeriod();
        org.joda.time.Period period89 = period87.minusDays(101);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(hours31);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(hours49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(hours51);
        org.junit.Assert.assertNotNull(hours52);
        org.junit.Assert.assertNotNull(hours54);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(hours63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(hours68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(hours71);
        org.junit.Assert.assertNotNull(hours72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(hours74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "PT1H" + "'", str75, "PT1H");
        org.junit.Assert.assertNotNull(hours76);
        org.junit.Assert.assertNotNull(hours77);
        org.junit.Assert.assertNotNull(hours78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "PT0H" + "'", str80, "PT0H");
        org.junit.Assert.assertNotNull(hours81);
        org.junit.Assert.assertNotNull(hours83);
        org.junit.Assert.assertNotNull(hours85);
        org.junit.Assert.assertNotNull(hours86);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
    }

    @Test
    public void test20815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20815");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.TWO;
        org.joda.time.Days days2 = days1.negated();
        boolean boolean3 = days0.isLessThan(days1);
        org.joda.time.Days days5 = days0.plus((-5));
        java.lang.String str6 = days5.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P1D" + "'", str6, "P1D");
    }

    @Test
    public void test20816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20816");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(11L);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.PeriodType periodType8 = period6.getPeriodType();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = duration3.toPeriod(periodType8, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 105, (long) 5, periodType8, chronology11);
        int int13 = period12.getMillis();
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-100) + "'", int13 == (-100));
    }

    @Test
    public void test20817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20817");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT431999.999S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20818");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (-97));
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Duration duration3 = duration1.plus(readableDuration2);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test20819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20819");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (-95));
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test20820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20820");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationTo(readableInstant14);
        boolean boolean16 = duration9.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Duration duration19 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration20 = duration15.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = duration20.toPeriodTo(readableInstant21);
        long long23 = duration20.getStandardSeconds();
        org.joda.time.Minutes minutes24 = duration20.toStandardMinutes();
        org.joda.time.Duration duration25 = minutes24.toStandardDuration();
        java.lang.String str26 = minutes24.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT0M" + "'", str26, "PT0M");
    }

    @Test
    public void test20821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20821");
        org.joda.time.Period period3 = org.joda.time.Period.weeks((-95));
        org.joda.time.Period period5 = period3.withMinutes(14405);
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        org.joda.time.Minutes minutes13 = minutes11.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes15 = minutes11.plus(8);
        org.joda.time.Minutes minutes17 = minutes11.dividedBy((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType18 = minutes17.getFieldType();
        java.lang.String str19 = durationFieldType18.getName();
        boolean boolean20 = period3.isSupported(durationFieldType18);
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Duration duration27 = minutes26.toStandardDuration();
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period32 = period30.minusMonths(0);
        org.joda.time.Minutes minutes33 = period32.toStandardMinutes();
        org.joda.time.Duration duration34 = minutes33.toStandardDuration();
        boolean boolean35 = duration27.isShorterThan((org.joda.time.ReadableDuration) duration34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = new org.joda.time.Duration(readableInstant36, readableInstant37);
        org.joda.time.Duration duration39 = duration27.minus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, readableInstant40);
        org.joda.time.Duration duration43 = duration27.plus((long) 8);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Interval interval45 = duration43.toIntervalFrom(readableInstant44);
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period50 = period48.minusMonths(0);
        org.joda.time.Minutes minutes51 = period50.toStandardMinutes();
        org.joda.time.Duration duration52 = minutes51.toStandardDuration();
        org.joda.time.Period period55 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period57 = period55.minusMonths(0);
        org.joda.time.Minutes minutes58 = period57.toStandardMinutes();
        org.joda.time.Duration duration59 = minutes58.toStandardDuration();
        boolean boolean60 = duration52.isShorterThan((org.joda.time.ReadableDuration) duration59);
        org.joda.time.Duration duration62 = duration52.plus((long) (short) 10);
        org.joda.time.Duration duration64 = duration43.withDurationAdded((org.joda.time.ReadableDuration) duration62, (int) (byte) 0);
        org.joda.time.Duration duration65 = duration62.toDuration();
        org.joda.time.Duration duration67 = org.joda.time.Duration.standardHours((long) 4);
        org.joda.time.Duration duration68 = duration62.minus((org.joda.time.ReadableDuration) duration67);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Period period72 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period74 = period72.minusMonths(0);
        org.joda.time.Period period76 = period74.minusSeconds(0);
        org.joda.time.Period period78 = period76.minusWeeks(10);
        org.joda.time.Period period79 = period76.negated();
        org.joda.time.Period period81 = period76.minusMillis((int) (short) 0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray82 = period76.getFieldTypes();
        org.joda.time.PeriodType periodType83 = org.joda.time.PeriodType.forFields(durationFieldTypeArray82);
        org.joda.time.Period period84 = duration68.toPeriodFrom(readableInstant69, periodType83);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.Period period86 = new org.joda.time.Period((java.lang.Object) period3, periodType83, chronology85);
        org.joda.time.PeriodType periodType87 = periodType83.withMillisRemoved();
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.Period period89 = new org.joda.time.Period((long) 32, (long) 97, periodType87, chronology88);
        org.joda.time.Period period91 = period89.minusYears((-14398));
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "minutes" + "'", str19, "minutes");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(durationFieldTypeArray82);
        org.junit.Assert.assertNotNull(periodType83);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(periodType87);
        org.junit.Assert.assertNotNull(period91);
    }

    @Test
    public void test20822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20822");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis(1491308L);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test20823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20823");
        org.joda.time.Period period1 = org.joda.time.Period.millis(0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.months();
        boolean boolean3 = period1.isSupported(durationFieldType2);
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = seconds4.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType7 = seconds4.getFieldType();
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds10 = seconds8.plus(seconds9);
        org.joda.time.Seconds seconds12 = seconds8.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds13 = seconds4.plus(seconds8);
        org.joda.time.Period period14 = period1.withFields((org.joda.time.ReadablePeriod) seconds8);
        org.joda.time.Period period16 = period1.plusWeeks((-10));
        int int17 = period1.getMonths();
        int int18 = period1.getMonths();
        org.joda.time.Period period20 = period1.plusSeconds((-2704));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test20824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20824");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.Period period8 = period6.minusWeeks(10);
        org.joda.time.Period period9 = period6.negated();
        org.joda.time.Period period11 = period6.minusMillis((int) (short) 0);
        org.joda.time.Period period13 = period6.minusWeeks(0);
        org.joda.time.Period period15 = period13.minusSeconds(4);
        org.joda.time.Period period17 = period15.withHours(572);
        java.lang.String str18 = period15.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT-4.036S" + "'", str18, "PT-4.036S");
    }

    @Test
    public void test20825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20825");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksIn(readableInterval1);
        boolean boolean3 = weeks0.isLessThan(weeks2);
        org.joda.time.Weeks weeks5 = weeks2.multipliedBy(10);
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.ZERO;
        java.lang.String str7 = weeks6.toString();
        int int8 = weeks6.size();
        org.joda.time.PeriodType periodType9 = weeks6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = weeks6.toMutablePeriod();
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks13 = weeks12.negated();
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeksIn(readableInterval15);
        boolean boolean17 = weeks14.isLessThan(weeks16);
        boolean boolean18 = weeks13.isGreaterThan(weeks16);
        org.joda.time.Weeks weeks19 = null;
        org.joda.time.Weeks weeks20 = weeks16.minus(weeks19);
        org.joda.time.DurationFieldType durationFieldType21 = weeks20.getFieldType();
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks25 = weeks24.negated();
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.Weeks weeks28 = org.joda.time.Weeks.weeksIn(readableInterval27);
        boolean boolean29 = weeks26.isLessThan(weeks28);
        boolean boolean30 = weeks25.isGreaterThan(weeks28);
        boolean boolean31 = weeks22.isLessThan(weeks25);
        org.joda.time.Weeks weeks32 = weeks20.plus(weeks25);
        org.joda.time.Weeks weeks34 = weeks25.minus(2);
        org.joda.time.Weeks weeks36 = weeks34.dividedBy((-10));
        org.joda.time.Weeks weeks37 = weeks36.negated();
        boolean boolean38 = weeks6.isLessThan(weeks37);
        org.joda.time.Weeks weeks39 = weeks2.minus(weeks37);
        org.joda.time.PeriodType periodType40 = weeks39.getPeriodType();
        org.joda.time.PeriodType periodType41 = periodType40.withYearsRemoved();
        org.joda.time.PeriodType periodType42 = periodType41.withMinutesRemoved();
        int int43 = periodType41.size();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0W" + "'", str7, "P0W");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test20826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20826");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((-40320L), chronology1);
        org.joda.time.Weeks weeks3 = period2.toStandardWeeks();
        org.junit.Assert.assertNotNull(weeks3);
    }

    @Test
    public void test20827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20827");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) 'a');
        java.lang.String str2 = seconds1.toString();
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = seconds3.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType6 = seconds3.getFieldType();
        int int7 = seconds3.getSeconds();
        org.joda.time.Duration duration8 = seconds3.toStandardDuration();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) seconds3, chronology9);
        org.joda.time.Seconds seconds11 = seconds1.minus(seconds3);
        org.joda.time.Duration duration12 = seconds3.toStandardDuration();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT97S" + "'", str2, "PT97S");
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test20828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20828");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(100, (int) (short) 1, (int) (short) 10, (int) (byte) -1, (int) (byte) 10, (int) '4', (int) (short) 100, (-1), periodType8);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Period period16 = period12.minusSeconds((int) (byte) 100);
        org.joda.time.Days days17 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        org.joda.time.PeriodType periodType19 = periodType18.withHoursRemoved();
        org.joda.time.PeriodType periodType20 = periodType18.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.days();
        boolean boolean22 = periodType20.isSupported(durationFieldType21);
        int int23 = period12.get(durationFieldType21);
        int int24 = period12.getDays();
        org.joda.time.Period period26 = period12.plusHours((int) '#');
        org.joda.time.Period period28 = period26.plusMonths((int) (short) 1);
        boolean boolean29 = period9.equals((java.lang.Object) period28);
        int int30 = period28.getMonths();
        org.joda.time.Period period32 = period28.plusWeeks(0);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test20829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20829");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType7 = period2.getPeriodType();
        org.joda.time.Hours hours8 = period2.toStandardHours();
        org.joda.time.Period period10 = org.joda.time.Period.millis((int) '#');
        int int11 = period10.getYears();
        org.joda.time.Hours hours12 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period10);
        boolean boolean13 = hours8.isLessThan(hours12);
        org.joda.time.Hours hours14 = org.joda.time.Hours.FIVE;
        boolean boolean15 = hours12.isGreaterThan(hours14);
        org.joda.time.Hours hours17 = hours12.dividedBy((-8));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(hours17);
    }

    @Test
    public void test20830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20830");
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Period period7 = period3.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType8 = period3.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (short) -1, periodType10, chronology11);
        org.joda.time.Period period14 = period12.plusSeconds(14400);
        org.joda.time.Period period16 = period12.withMillis(105);
        org.joda.time.Period period17 = period16.normalizedStandard();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test20831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20831");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.parse("PT0.036S");
        long long3 = duration2.getStandardHours();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withSecondsRemoved();
        org.joda.time.Period period12 = duration6.toPeriodFrom(readableInstant7, periodType9);
        long long13 = duration6.getStandardHours();
        long long14 = duration6.getMillis();
        java.lang.String str15 = duration6.toString();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Period period22 = period18.minusSeconds((int) (byte) 100);
        org.joda.time.Days days23 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType24 = days23.getPeriodType();
        org.joda.time.PeriodType periodType25 = periodType24.withHoursRemoved();
        org.joda.time.PeriodType periodType26 = periodType24.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.days();
        boolean boolean28 = periodType26.isSupported(durationFieldType27);
        int int29 = period18.get(durationFieldType27);
        org.joda.time.Period period31 = period18.withHours(1);
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period36 = period34.minusMonths(0);
        org.joda.time.Period period38 = period34.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType39 = period34.getPeriodType();
        org.joda.time.PeriodType periodType40 = periodType39.withMinutesRemoved();
        java.lang.String str41 = periodType40.toString();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((java.lang.Object) period18, periodType40, chronology42);
        org.joda.time.PeriodType periodType44 = periodType40.withHoursRemoved();
        org.joda.time.PeriodType periodType45 = periodType40.withMillisRemoved();
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration6, periodType45);
        org.joda.time.PeriodType periodType47 = periodType45.withWeeksRemoved();
        org.joda.time.PeriodType periodType48 = periodType45.withYearsRemoved();
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2, periodType48);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100000L + "'", long14 == 100000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT100S" + "'", str15, "PT100S");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str41, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
    }

    @Test
    public void test20832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20832");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Minutes minutes8 = minutes6.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes0.minus(minutes6);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Minutes minutes17 = minutes15.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) minutes15, chronology18);
        org.joda.time.Minutes minutes20 = minutes0.minus(minutes15);
        org.joda.time.Duration duration21 = minutes0.toStandardDuration();
        org.joda.time.Minutes minutes23 = minutes0.minus(36);
        org.joda.time.Period period24 = new org.joda.time.Period();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.Minutes minutes27 = period24.toStandardMinutes();
        org.joda.time.Minutes minutes29 = minutes27.multipliedBy(2147483647);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period34 = period32.minusMonths(0);
        org.joda.time.Minutes minutes35 = period34.toStandardMinutes();
        org.joda.time.Duration duration36 = minutes35.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Interval interval38 = duration36.toIntervalFrom(readableInstant37);
        org.joda.time.Period period41 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Minutes minutes42 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period41);
        org.joda.time.Period period45 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period47 = period45.minusMonths(0);
        org.joda.time.Minutes minutes48 = period47.toStandardMinutes();
        org.joda.time.Minutes minutes49 = minutes42.minus(minutes48);
        int int50 = minutes49.size();
        boolean boolean51 = duration36.equals((java.lang.Object) minutes49);
        org.joda.time.Minutes minutes53 = minutes49.multipliedBy(0);
        boolean boolean54 = minutes29.isLessThan(minutes53);
        org.joda.time.Duration duration56 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration57 = duration56.toDuration();
        org.joda.time.Minutes minutes58 = duration56.toStandardMinutes();
        org.joda.time.Minutes minutes59 = minutes58.negated();
        org.joda.time.Minutes minutes61 = minutes59.multipliedBy((-10));
        org.joda.time.ReadableInterval readableInterval62 = null;
        org.joda.time.Minutes minutes63 = org.joda.time.Minutes.minutesIn(readableInterval62);
        org.joda.time.Period period65 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes66 = period65.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType67 = minutes66.getFieldType();
        org.joda.time.Minutes minutes68 = minutes63.minus(minutes66);
        org.joda.time.Minutes minutes69 = minutes61.minus(minutes68);
        org.joda.time.Duration duration70 = minutes69.toStandardDuration();
        boolean boolean71 = minutes53.isGreaterThan(minutes69);
        org.joda.time.Minutes minutes72 = minutes23.plus(minutes53);
        org.joda.time.Minutes minutes74 = minutes53.dividedBy((-2));
        int int75 = minutes53.getMinutes();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertNotNull(minutes61);
        org.junit.Assert.assertNotNull(minutes63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(minutes66);
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertNotNull(minutes68);
        org.junit.Assert.assertNotNull(minutes69);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(minutes72);
        org.junit.Assert.assertNotNull(minutes74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test20833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20833");
        org.joda.time.Days days1 = org.joda.time.Days.days(11);
        org.joda.time.Days days3 = days1.plus(8);
        org.joda.time.Days days5 = days3.plus((int) (byte) -1);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
    }

    @Test
    public void test20834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20834");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(47L);
        java.lang.String str2 = duration1.toString();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT2820S" + "'", str2, "PT2820S");
    }

    @Test
    public void test20835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20835");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (short) 10);
        org.joda.time.Period period3 = period1.withHours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType5 = period3.getFieldType(3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DurationField durationField7 = durationFieldType5.getField(chronology6);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test20836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20836");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        org.joda.time.Minutes minutes16 = minutes13.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration17 = minutes13.toStandardDuration();
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Minutes minutes23 = period22.toStandardMinutes();
        org.joda.time.Duration duration24 = minutes23.toStandardDuration();
        org.joda.time.Period period25 = duration24.toPeriod();
        boolean boolean26 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration24);
        boolean boolean27 = duration6.isEqual((org.joda.time.ReadableDuration) duration17);
        long long28 = duration6.getStandardMinutes();
        java.lang.String str29 = duration6.toString();
        long long30 = duration6.getMillis();
        org.joda.time.Minutes minutes31 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        long long33 = duration32.getStandardSeconds();
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period36.minusMonths(0);
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Duration duration40 = minutes39.toStandardDuration();
        org.joda.time.Minutes minutes42 = minutes39.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration43 = minutes39.toStandardDuration();
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period48 = period46.minusMonths(0);
        org.joda.time.Minutes minutes49 = period48.toStandardMinutes();
        org.joda.time.Duration duration50 = minutes49.toStandardDuration();
        org.joda.time.Period period51 = duration50.toPeriod();
        boolean boolean52 = duration43.isLongerThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.days();
        org.joda.time.Period period55 = duration43.toPeriodTo(readableInstant53, periodType54);
        org.joda.time.Duration duration56 = duration32.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Duration duration57 = duration56.toDuration();
        org.joda.time.Minutes minutes58 = duration57.toStandardMinutes();
        boolean boolean59 = duration6.isEqual((org.joda.time.ReadableDuration) duration57);
        long long60 = duration57.getStandardDays();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT0S" + "'", str29, "PT0S");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-128849018880L) + "'", long33 == (-128849018880L));
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1491308L) + "'", long60 == (-1491308L));
    }

    @Test
    public void test20837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20837");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.Days days3 = org.joda.time.Days.ONE;
        int int4 = days2.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days3);
        org.joda.time.Days days6 = days3.multipliedBy((int) '#');
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        org.joda.time.Days days8 = days6.minus(days7);
        org.joda.time.PeriodType periodType9 = days6.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test20838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20838");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        boolean boolean6 = weeks3.isLessThan(weeks5);
        boolean boolean7 = weeks2.isGreaterThan(weeks5);
        org.joda.time.Weeks weeks8 = null;
        org.joda.time.Weeks weeks9 = weeks5.minus(weeks8);
        org.joda.time.DurationFieldType durationFieldType10 = weeks9.getFieldType();
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks14 = weeks13.negated();
        org.joda.time.Weeks weeks15 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeksIn(readableInterval16);
        boolean boolean18 = weeks15.isLessThan(weeks17);
        boolean boolean19 = weeks14.isGreaterThan(weeks17);
        boolean boolean20 = weeks11.isLessThan(weeks14);
        org.joda.time.Weeks weeks21 = weeks9.plus(weeks14);
        org.joda.time.Weeks weeks23 = weeks14.minus(2);
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks26 = weeks24.dividedBy(1);
        org.joda.time.Weeks weeks28 = weeks24.dividedBy(8);
        org.joda.time.Weeks weeks29 = weeks23.plus(weeks24);
        org.joda.time.Weeks weeks30 = null;
        boolean boolean31 = weeks29.isLessThan(weeks30);
        org.joda.time.Weeks weeks32 = weeks29.negated();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(weeks32);
    }

    @Test
    public void test20839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20839");
        org.joda.time.Duration duration2 = new org.joda.time.Duration(8L, (long) 168);
    }

    @Test
    public void test20840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20840");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Duration duration9 = duration6.plus((long) (byte) 0);
        org.joda.time.Period period10 = duration6.toPeriod();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Minutes minutes17 = period16.toStandardMinutes();
        org.joda.time.Duration duration18 = minutes17.toStandardDuration();
        org.joda.time.Period period19 = duration18.toPeriod();
        org.joda.time.Duration duration21 = duration18.plus((long) (byte) 0);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) duration21, periodType23, chronology24);
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        org.joda.time.Minutes minutes34 = minutes31.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration35 = minutes31.toStandardDuration();
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period40 = period38.minusMonths(0);
        org.joda.time.Minutes minutes41 = period40.toStandardMinutes();
        org.joda.time.Duration duration42 = minutes41.toStandardDuration();
        org.joda.time.Period period43 = duration42.toPeriod();
        boolean boolean44 = duration35.isLongerThan((org.joda.time.ReadableDuration) duration42);
        boolean boolean45 = duration21.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Duration duration46 = duration6.minus((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Minutes minutes47 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration48 = minutes47.toStandardDuration();
        long long49 = duration48.getStandardSeconds();
        org.joda.time.Period period52 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period54 = period52.minusMonths(0);
        org.joda.time.Minutes minutes55 = period54.toStandardMinutes();
        org.joda.time.Duration duration56 = minutes55.toStandardDuration();
        org.joda.time.Minutes minutes58 = minutes55.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration59 = minutes55.toStandardDuration();
        org.joda.time.Period period62 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period64 = period62.minusMonths(0);
        org.joda.time.Minutes minutes65 = period64.toStandardMinutes();
        org.joda.time.Duration duration66 = minutes65.toStandardDuration();
        org.joda.time.Period period67 = duration66.toPeriod();
        boolean boolean68 = duration59.isLongerThan((org.joda.time.ReadableDuration) duration66);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.PeriodType periodType70 = org.joda.time.PeriodType.days();
        org.joda.time.Period period71 = duration59.toPeriodTo(readableInstant69, periodType70);
        org.joda.time.Duration duration72 = duration48.plus((org.joda.time.ReadableDuration) duration59);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.Period period74 = duration59.toPeriod(chronology73);
        boolean boolean75 = duration6.isEqual((org.joda.time.ReadableDuration) duration59);
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.Period period80 = new org.joda.time.Period((long) (-2), 8L, periodType78, chronology79);
        org.joda.time.Duration duration81 = period80.toStandardDuration();
        boolean boolean82 = duration6.isLongerThan((org.joda.time.ReadableDuration) duration81);
        org.joda.time.Duration duration83 = duration6.toDuration();
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.Period period85 = duration83.toPeriodTo(readableInstant84);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-128849018880L) + "'", long49 == (-128849018880L));
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(minutes65);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(duration81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(duration83);
        org.junit.Assert.assertNotNull(period85);
    }

    @Test
    public void test20841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20841");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 1491373);
        org.joda.time.Period period3 = period1.minusSeconds(268435455);
        org.junit.Assert.assertNotNull(period3);
    }
}

