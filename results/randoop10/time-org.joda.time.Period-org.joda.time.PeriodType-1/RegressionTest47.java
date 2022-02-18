import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest47 {

    public static boolean debug = false;

    @Test
    public void test23501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23501");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds((-314495L));
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        org.joda.time.Minutes minutes9 = period8.toStandardMinutes();
        org.joda.time.Duration duration10 = minutes9.toStandardDuration();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Duration duration17 = minutes16.toStandardDuration();
        boolean boolean18 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = new org.joda.time.Duration(readableInstant19, readableInstant20);
        org.joda.time.Duration duration22 = duration10.minus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant23);
        org.joda.time.Duration duration26 = duration10.plus((long) 8);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Interval interval28 = duration26.toIntervalFrom(readableInstant27);
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period33 = period31.minusMonths(0);
        org.joda.time.Minutes minutes34 = period33.toStandardMinutes();
        org.joda.time.Duration duration35 = minutes34.toStandardDuration();
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period40 = period38.minusMonths(0);
        org.joda.time.Minutes minutes41 = period40.toStandardMinutes();
        org.joda.time.Duration duration42 = minutes41.toStandardDuration();
        boolean boolean43 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Duration duration45 = duration35.plus((long) (short) 10);
        org.joda.time.Duration duration47 = duration26.withDurationAdded((org.joda.time.ReadableDuration) duration45, (int) (byte) 0);
        org.joda.time.Duration duration48 = duration45.toDuration();
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardHours((long) 4);
        org.joda.time.Duration duration51 = duration45.minus((org.joda.time.ReadableDuration) duration50);
        org.joda.time.Duration duration53 = duration51.withMillis((long) (short) 100);
        org.joda.time.PeriodType periodType56 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType57 = periodType56.withYearsRemoved();
        int int58 = periodType57.size();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((long) 2147483647, 480000L, periodType57, chronology59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = duration53.toPeriod(periodType57, chronology61);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Period period64 = duration3.toPeriod(periodType57, chronology63);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period65 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
    }

    @Test
    public void test23502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23502");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration4 = duration1.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration6 = duration1.minus((long) (-1));
        org.joda.time.ReadableDuration readableDuration7 = null;
        boolean boolean8 = duration1.isShorterThan(readableDuration7);
        org.joda.time.Period period10 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period11 = period10.toPeriod();
        org.joda.time.Period period13 = period10.plusMinutes(1);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period10.toDurationTo(readableInstant14);
        org.joda.time.Duration duration16 = duration1.minus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Seconds seconds17 = duration15.toStandardSeconds();
        org.joda.time.Seconds seconds19 = seconds17.plus((-110));
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds19);
    }

    @Test
    public void test23503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23503");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType7 = period2.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withMinutesRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Duration duration15 = minutes14.toStandardDuration();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Duration duration22 = minutes21.toStandardDuration();
        org.joda.time.Duration duration24 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration22, (int) (short) 100);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = duration24.toPeriod(chronology25);
        long long27 = duration24.getMillis();
        org.joda.time.Duration duration30 = duration24.withDurationAdded((long) 52, (-2));
        boolean boolean31 = periodType8.equals((java.lang.Object) duration24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType33 = periodType8.getFieldType((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test23504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23504");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        java.lang.String str10 = duration9.toString();
        long long11 = duration9.getStandardMinutes();
        org.joda.time.Duration duration14 = duration9.withDurationAdded((long) (-7), 18);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration18 = new org.joda.time.Duration((long) (byte) -1);
        long long19 = duration18.getStandardDays();
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration24 = duration22.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration24, readableInstant25);
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period31 = period29.minusMonths(0);
        org.joda.time.Minutes minutes32 = period31.toStandardMinutes();
        org.joda.time.Duration duration33 = minutes32.toStandardDuration();
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period36.minusMonths(0);
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Duration duration40 = minutes39.toStandardDuration();
        boolean boolean41 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = new org.joda.time.Duration(readableInstant42, readableInstant43);
        org.joda.time.Duration duration45 = duration33.minus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.Duration duration46 = duration33.toDuration();
        boolean boolean47 = duration24.isEqual((org.joda.time.ReadableDuration) duration46);
        org.joda.time.Period period50 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period52 = period50.minusMonths(0);
        org.joda.time.Minutes minutes53 = period52.toStandardMinutes();
        org.joda.time.Duration duration54 = minutes53.toStandardDuration();
        org.joda.time.Period period55 = duration54.toPeriod();
        org.joda.time.Duration duration57 = duration54.plus((long) (byte) 0);
        org.joda.time.Duration duration59 = duration54.withMillis((long) 1);
        boolean boolean60 = duration24.isEqual((org.joda.time.ReadableDuration) duration59);
        org.joda.time.Period period63 = new org.joda.time.Period((-128849018880000L), (-1L));
        org.joda.time.DurationFieldType[] durationFieldTypeArray64 = period63.getFieldTypes();
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.forFields(durationFieldTypeArray64);
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.forFields(durationFieldTypeArray64);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period((java.lang.Object) duration59, periodType66, chronology67);
        org.joda.time.PeriodType periodType69 = periodType66.withSecondsRemoved();
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration18, periodType69);
        org.joda.time.Period period71 = duration14.toPeriodTo(readableInstant15, periodType69);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.Period period73 = duration14.toPeriod(chronology72);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0S" + "'", str10, "PT0S");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray64);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period73);
    }

    @Test
    public void test23505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23505");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration2 = minutes1.toStandardDuration();
        long long3 = duration2.getStandardSeconds();
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        org.joda.time.Minutes minutes9 = period8.toStandardMinutes();
        org.joda.time.Duration duration10 = minutes9.toStandardDuration();
        org.joda.time.Minutes minutes12 = minutes9.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration13 = minutes9.toStandardDuration();
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Duration duration20 = minutes19.toStandardDuration();
        org.joda.time.Period period21 = duration20.toPeriod();
        boolean boolean22 = duration13.isLongerThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.days();
        org.joda.time.Period period25 = duration13.toPeriodTo(readableInstant23, periodType24);
        org.joda.time.Duration duration26 = duration2.plus((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period31 = period29.minusMonths(0);
        org.joda.time.Minutes minutes32 = period31.toStandardMinutes();
        org.joda.time.Duration duration33 = minutes32.toStandardDuration();
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period36.minusMonths(0);
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Duration duration40 = minutes39.toStandardDuration();
        boolean boolean41 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration40, readableInstant42);
        long long44 = duration40.getStandardHours();
        org.joda.time.Duration duration45 = duration13.minus((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardSeconds((long) 0);
        java.lang.String str48 = duration47.toString();
        org.joda.time.Duration duration50 = duration47.minus((long) 10);
        org.joda.time.Duration duration52 = duration45.withDurationAdded((org.joda.time.ReadableDuration) duration47, (int) 'a');
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration52);
        long long54 = duration52.getMillis();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-128849018880L) + "'", long3 == (-128849018880L));
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PT0S" + "'", str48, "PT0S");
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    }

    @Test
    public void test23506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23506");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), chronology1);
        org.joda.time.Period period4 = period2.minusMonths((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant7);
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds11 = seconds9.multipliedBy(10);
        org.joda.time.Duration duration12 = seconds9.toStandardDuration();
        org.joda.time.Duration duration14 = duration12.withMillis((long) (-5));
        long long15 = duration14.getMillis();
        org.joda.time.Duration duration18 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration20 = duration18.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration20, readableInstant21);
        org.joda.time.Duration duration24 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration27 = duration24.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration29 = duration20.withDurationAdded((org.joda.time.ReadableDuration) duration27, (int) (byte) 0);
        org.joda.time.Seconds seconds30 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration31 = seconds30.toStandardDuration();
        int int32 = duration29.compareTo((org.joda.time.ReadableDuration) duration31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period37 = new org.joda.time.Period((long) (byte) 1, (long) (-36), periodType36);
        org.joda.time.PeriodType periodType38 = periodType36.withMinutesRemoved();
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration31, readableInstant33, periodType36);
        boolean boolean40 = duration14.isLongerThan((org.joda.time.ReadableDuration) duration31);
        org.joda.time.Duration duration43 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration45 = duration43.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration45, readableInstant46);
        org.joda.time.Duration duration49 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration51 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration52 = duration49.plus((org.joda.time.ReadableDuration) duration51);
        org.joda.time.Duration duration54 = duration45.withDurationAdded((org.joda.time.ReadableDuration) duration52, (int) (byte) 0);
        org.joda.time.Seconds seconds55 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration56 = seconds55.toStandardDuration();
        int int57 = duration54.compareTo((org.joda.time.ReadableDuration) duration56);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period62 = new org.joda.time.Period((long) (byte) 1, (long) (-36), periodType61);
        org.joda.time.PeriodType periodType63 = periodType61.withMinutesRemoved();
        org.joda.time.Period period64 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration56, readableInstant58, periodType61);
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType68 = periodType67.withMinutesRemoved();
        org.joda.time.PeriodType periodType69 = periodType68.withWeeksRemoved();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((long) (byte) -1, (long) (short) -1, periodType68, chronology70);
        org.joda.time.Period period73 = org.joda.time.Period.seconds((int) '4');
        org.joda.time.Seconds seconds74 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds75 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds76 = seconds74.plus(seconds75);
        org.joda.time.PeriodType periodType77 = seconds74.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType78 = seconds74.getFieldType();
        int int79 = period73.indexOf(durationFieldType78);
        int int80 = periodType68.indexOf(durationFieldType78);
        int int81 = periodType61.indexOf(durationFieldType78);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.Period period83 = duration31.toPeriod(periodType61, chronology82);
        org.joda.time.Duration duration84 = duration6.minus((org.joda.time.ReadableDuration) duration31);
        org.joda.time.ReadableInstant readableInstant85 = null;
        org.joda.time.Period period86 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration31, readableInstant85);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-5L) + "'", long15 == (-5L));
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(seconds55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(seconds74);
        org.junit.Assert.assertNotNull(seconds75);
        org.junit.Assert.assertNotNull(seconds76);
        org.junit.Assert.assertNotNull(periodType77);
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 6 + "'", int79 == 6);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(duration84);
    }

    @Test
    public void test23507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23507");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        long long2 = duration1.getMillis();
        org.joda.time.Days days3 = duration1.toStandardDays();
        org.joda.time.Days days5 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.Days days7 = days5.minus((int) '4');
        org.joda.time.Days days9 = days7.dividedBy((int) (short) 10);
        int int10 = days7.getDays();
        org.joda.time.PeriodType periodType11 = days7.getPeriodType();
        org.joda.time.Days days13 = days7.plus((-105));
        boolean boolean14 = days3.isGreaterThan(days7);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100000L + "'", long2 == 100000L);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-53) + "'", int10 == (-53));
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test23508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23508");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = seconds1.plus(seconds2);
        org.joda.time.PeriodType periodType4 = seconds1.getPeriodType();
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType4);
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Seconds seconds7 = period6.toStandardSeconds();
        org.joda.time.Period period9 = period6.plusHours((-100));
        org.joda.time.Period period11 = period6.withMillis(97);
        org.joda.time.Period period13 = period11.withSeconds(90);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test23509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23509");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT2S");
        int int2 = period1.getHours();
        org.joda.time.Period period4 = period1.withMonths((int) ' ');
        org.joda.time.Period period6 = period1.withWeeks((int) ' ');
        org.joda.time.Period period8 = period6.withMinutes((-35));
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds12 = seconds10.minus((int) 'a');
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds15 = seconds13.plus(seconds14);
        org.joda.time.Seconds seconds17 = seconds13.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds20 = seconds18.plus(seconds19);
        java.lang.String str21 = seconds18.toString();
        org.joda.time.DurationFieldType durationFieldType22 = seconds18.getFieldType();
        java.lang.String str23 = durationFieldType22.getName();
        boolean boolean24 = seconds13.isSupported(durationFieldType22);
        int int25 = seconds12.get(durationFieldType22);
        org.joda.time.Chronology chronology26 = null;
        boolean boolean27 = durationFieldType22.isSupported(chronology26);
        int int28 = periodType9.indexOf(durationFieldType22);
        org.joda.time.Period period29 = period6.normalizedStandard(periodType9);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period34 = period32.minusMonths(0);
        org.joda.time.Period period36 = period32.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType37 = period32.getPeriodType();
        org.joda.time.PeriodType periodType38 = periodType37.withMinutesRemoved();
        org.joda.time.PeriodType periodType39 = periodType38.withHoursRemoved();
        org.joda.time.PeriodType periodType40 = periodType38.withHoursRemoved();
        org.joda.time.PeriodType periodType41 = periodType38.withMonthsRemoved();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((java.lang.Object) period29, periodType41, chronology42);
        org.joda.time.Period period45 = period29.minusMinutes((-14400));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT2S" + "'", str21, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "seconds" + "'", str23, "seconds");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-95) + "'", int25 == (-95));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period45);
    }

    @Test
    public void test23510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23510");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period1);
        int int4 = hours3.getHours();
        org.joda.time.Days days5 = hours3.toStandardDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(days5);
    }

    @Test
    public void test23511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23511");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("P214748364W");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23512");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.Seconds seconds9 = seconds1.plus((int) '4');
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds12 = seconds10.plus(seconds11);
        org.joda.time.Seconds seconds14 = seconds10.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds15 = seconds1.plus(seconds10);
        org.joda.time.Seconds seconds17 = seconds10.minus((int) ' ');
        java.lang.String str18 = seconds10.toString();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT2S" + "'", str18, "PT2S");
    }

    @Test
    public void test23513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23513");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) (byte) -1);
        java.lang.String str2 = days1.toString();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P-1D" + "'", str2, "P-1D");
    }

    @Test
    public void test23514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23514");
        org.joda.time.Period period1 = org.joda.time.Period.years((-14400));
        org.joda.time.Period period2 = period1.negated();
        org.joda.time.Period period3 = period2.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test23515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23515");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks5 = weeks4.negated();
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeksIn(readableInterval7);
        boolean boolean9 = weeks6.isLessThan(weeks8);
        boolean boolean10 = weeks5.isGreaterThan(weeks8);
        boolean boolean11 = weeks2.isLessThan(weeks5);
        int int12 = weeks5.getWeeks();
        org.joda.time.PeriodType periodType13 = weeks5.getPeriodType();
        org.joda.time.Period period14 = period1.minus((org.joda.time.ReadablePeriod) weeks5);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period1.toDurationFrom(readableInstant15);
        org.joda.time.Period period18 = period1.minusMillis((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test23516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23516");
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
        org.joda.time.DurationFieldType durationFieldType31 = days28.getFieldType();
        org.joda.time.Days days33 = days28.multipliedBy((-213044));
        java.lang.String str34 = days33.toString();
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
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "P1278264D" + "'", str34, "P1278264D");
    }

    @Test
    public void test23517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23517");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(10);
        org.joda.time.Period period3 = period1.minusMillis(0);
        org.joda.time.Period period5 = period3.withMonths(1);
        org.joda.time.Period period7 = period5.withMonths(52);
        org.joda.time.Period period9 = org.joda.time.Period.days(10);
        org.joda.time.Period period11 = period9.plusMonths((int) 'a');
        org.joda.time.Period period13 = period9.plusSeconds((int) (short) 100);
        org.joda.time.Period period15 = period9.withMinutes(1);
        org.joda.time.Days days16 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableDuration18);
        org.joda.time.Days days20 = period19.toStandardDays();
        org.joda.time.Days days22 = days20.minus(7);
        org.joda.time.Days days23 = days16.plus(days22);
        org.joda.time.DurationFieldType durationFieldType24 = days23.getFieldType();
        org.joda.time.Period period26 = period7.withField(durationFieldType24, (-4188));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test23518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23518");
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
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardDays((long) 7);
        org.joda.time.Duration duration26 = duration17.minus((org.joda.time.ReadableDuration) duration25);
        long long27 = duration17.getStandardSeconds();
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period32 = period30.minusMonths(0);
        org.joda.time.Minutes minutes33 = period32.toStandardMinutes();
        org.joda.time.Duration duration34 = minutes33.toStandardDuration();
        org.joda.time.Period period37 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period39 = period37.minusMonths(0);
        org.joda.time.Minutes minutes40 = period39.toStandardMinutes();
        org.joda.time.Duration duration41 = minutes40.toStandardDuration();
        boolean boolean42 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = new org.joda.time.Duration(readableInstant43, readableInstant44);
        org.joda.time.Duration duration46 = duration34.minus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Period period47 = duration45.toPeriod();
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = duration45.toPeriodFrom(readableInstant48);
        int int50 = duration17.compareTo((org.joda.time.ReadableDuration) duration45);
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
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test23519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23519");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardSeconds((long) 0);
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        org.joda.time.Duration duration12 = minutes11.toStandardDuration();
        org.joda.time.Period period13 = duration12.toPeriod();
        org.joda.time.Duration duration15 = duration12.plus((long) (byte) 0);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) duration15, periodType17, chronology18);
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration2, readableInstant4, periodType17);
        java.lang.String str21 = duration2.toString();
        org.joda.time.Duration duration24 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration26 = duration24.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration26, readableInstant27);
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period33 = period31.minusMonths(0);
        org.joda.time.Minutes minutes34 = period33.toStandardMinutes();
        org.joda.time.Duration duration35 = minutes34.toStandardDuration();
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period40 = period38.minusMonths(0);
        org.joda.time.Minutes minutes41 = period40.toStandardMinutes();
        org.joda.time.Duration duration42 = minutes41.toStandardDuration();
        boolean boolean43 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = new org.joda.time.Duration(readableInstant44, readableInstant45);
        org.joda.time.Duration duration47 = duration35.minus((org.joda.time.ReadableDuration) duration46);
        org.joda.time.Duration duration48 = duration35.toDuration();
        boolean boolean49 = duration26.isEqual((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Period period52 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period54 = period52.minusMonths(0);
        org.joda.time.Minutes minutes55 = period54.toStandardMinutes();
        org.joda.time.Duration duration56 = minutes55.toStandardDuration();
        org.joda.time.Period period57 = duration56.toPeriod();
        org.joda.time.Duration duration59 = duration56.plus((long) (byte) 0);
        org.joda.time.Duration duration61 = duration56.withMillis((long) 1);
        boolean boolean62 = duration26.isEqual((org.joda.time.ReadableDuration) duration61);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Interval interval64 = duration26.toIntervalTo(readableInstant63);
        boolean boolean65 = duration2.isShorterThan((org.joda.time.ReadableDuration) duration26);
        java.lang.String str66 = duration26.toString();
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT0S" + "'", str21, "PT0S");
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "PT0.010S" + "'", str66, "PT0.010S");
    }

    @Test
    public void test23520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23520");
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
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = duration4.toPeriodFrom(readableInstant39);
        org.joda.time.Minutes minutes41 = duration4.toStandardMinutes();
        org.joda.time.PeriodType periodType42 = minutes41.getPeriodType();
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
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(periodType42);
    }

    @Test
    public void test23521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23521");
        org.joda.time.Period period8 = new org.joda.time.Period(268435455, (int) 'a', 3, 0, (-10), (-2147483596), 104, 14405);
        org.joda.time.Period period10 = period8.plusSeconds(1491308);
        org.joda.time.Period period11 = period10.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType13 = period11.getFieldType(52000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test23522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23522");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy((int) (byte) 100);
        org.joda.time.Seconds seconds4 = seconds0.multipliedBy((int) (byte) 0);
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.seconds(10);
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds9 = seconds7.plus(seconds8);
        org.joda.time.Seconds seconds11 = seconds8.plus((int) (byte) 0);
        org.joda.time.Seconds seconds13 = seconds8.minus(8);
        org.joda.time.Seconds seconds15 = seconds13.plus(1);
        org.joda.time.Seconds seconds16 = seconds13.negated();
        org.joda.time.Seconds seconds17 = seconds6.plus(seconds16);
        boolean boolean18 = seconds4.isLessThan(seconds16);
        int int19 = seconds4.size();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test23523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23523");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.ONE;
        boolean boolean4 = seconds1.isGreaterThan(seconds3);
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.seconds((int) (short) 0);
        org.joda.time.Seconds seconds7 = null;
        org.joda.time.Seconds seconds8 = seconds6.plus(seconds7);
        boolean boolean9 = seconds3.isLessThan(seconds8);
        org.joda.time.Seconds seconds10 = null;
        org.joda.time.Seconds seconds11 = seconds3.plus(seconds10);
        org.joda.time.Duration duration14 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration16 = duration14.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Interval interval20 = duration16.toIntervalFrom(readableInstant19);
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval20);
        org.joda.time.Seconds seconds23 = seconds21.plus(0);
        org.joda.time.Seconds seconds24 = seconds11.plus(seconds23);
        org.joda.time.Seconds seconds26 = seconds11.dividedBy(7);
        org.joda.time.DurationFieldType durationFieldType27 = seconds26.getFieldType();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(durationFieldType27);
    }

    @Test
    public void test23524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23524");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) 1);
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.Days days5 = days2.minus(0);
        org.joda.time.Days days6 = days5.negated();
        org.joda.time.Duration duration7 = days5.toStandardDuration();
        long long8 = duration7.getStandardHours();
        org.joda.time.Days days9 = duration7.toStandardDays();
        org.joda.time.Period period10 = period1.withFields((org.joda.time.ReadablePeriod) days9);
        int int11 = period1.getHours();
        org.joda.time.Period period13 = period1.minusYears((int) (byte) -1);
        org.joda.time.Period period15 = period13.minusDays(6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 120L + "'", long8 == 120L);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test23525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23525");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        java.lang.String str1 = weeks0.toString();
        int int2 = weeks0.size();
        org.joda.time.PeriodType periodType3 = weeks0.getPeriodType();
        org.joda.time.Weeks weeks5 = weeks0.minus(7);
        java.lang.String str6 = weeks0.toString();
        java.lang.String str7 = weeks0.toString();
        org.joda.time.DurationFieldType durationFieldType8 = weeks0.getFieldType();
        org.joda.time.Weeks weeks10 = weeks0.multipliedBy(5);
        org.joda.time.PeriodType periodType11 = weeks10.getPeriodType();
        org.joda.time.Weeks weeks13 = weeks10.dividedBy(18);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0W" + "'", str1, "P0W");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0W" + "'", str6, "P0W");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0W" + "'", str7, "P0W");
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(weeks13);
    }

    @Test
    public void test23526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23526");
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period3.negated();
        int int5 = period3.getHours();
        org.joda.time.Period period7 = org.joda.time.Period.days(10);
        org.joda.time.Period period9 = period7.plusMonths((int) 'a');
        org.joda.time.Period period11 = period7.plusSeconds((int) (short) 100);
        org.joda.time.Period period13 = period11.minusMonths((int) 'a');
        org.joda.time.Period period14 = period3.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Hours hours15 = period3.toStandardHours();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period19 = period18.negated();
        org.joda.time.Period period20 = period3.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period22 = period20.plusWeeks(6);
        org.joda.time.Hours hours23 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Hours hours25 = hours23.minus(0);
        org.joda.time.PeriodType periodType26 = hours23.getPeriodType();
        org.joda.time.Period period27 = new org.joda.time.Period(604800000L, periodType26);
        org.joda.time.Period period29 = period27.minusHours(4088);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test23527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23527");
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
        long long25 = duration22.getStandardDays();
        java.lang.String str26 = duration22.toString();
        org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) str26);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT0.008S" + "'", str26, "PT0.008S");
    }

    @Test
    public void test23528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23528");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-36), (int) (short) 10, 5, (-95), 8, (int) ' ', 2147483647, (-10), periodType8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationTo(readableInstant10);
        java.lang.String str12 = duration11.toString();
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        long long15 = duration14.getStandardSeconds();
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
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.days();
        org.joda.time.Period period37 = duration25.toPeriodTo(readableInstant35, periodType36);
        org.joda.time.Duration duration38 = duration14.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Period period41 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period43 = period41.minusMonths(0);
        org.joda.time.Minutes minutes44 = period43.toStandardMinutes();
        org.joda.time.Duration duration45 = minutes44.toStandardDuration();
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period50 = period48.minusMonths(0);
        org.joda.time.Minutes minutes51 = period50.toStandardMinutes();
        org.joda.time.Duration duration52 = minutes51.toStandardDuration();
        boolean boolean53 = duration45.isShorterThan((org.joda.time.ReadableDuration) duration52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration52, readableInstant54);
        long long56 = duration52.getStandardHours();
        org.joda.time.Duration duration57 = duration25.minus((org.joda.time.ReadableDuration) duration52);
        org.joda.time.Duration duration59 = org.joda.time.Duration.standardSeconds((long) 0);
        java.lang.String str60 = duration59.toString();
        org.joda.time.Duration duration62 = duration59.minus((long) 10);
        org.joda.time.Duration duration64 = duration57.withDurationAdded((org.joda.time.ReadableDuration) duration59, (int) 'a');
        boolean boolean66 = duration64.equals((java.lang.Object) "P35W");
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType70 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period71 = new org.joda.time.Period((long) (byte) 1, (long) (-36), periodType70);
        org.joda.time.PeriodType periodType72 = periodType70.withMinutesRemoved();
        org.joda.time.PeriodType periodType73 = periodType70.withDaysRemoved();
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration64, readableInstant67, periodType70);
        boolean boolean75 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration64);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT1032695166.990S" + "'", str12, "PT1032695166.990S");
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-128849018880L) + "'", long15 == (-128849018880L));
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
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PT0S" + "'", str60, "PT0S");
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test23529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23529");
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
        org.joda.time.Duration duration44 = duration43.toDuration();
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Period period46 = duration44.toPeriodFrom(readableInstant45);
        org.joda.time.Period period48 = period46.minusHours(1);
        org.joda.time.Period period50 = period48.minusMinutes((-38));
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) (-36), chronology52);
        org.joda.time.Period period55 = period53.withMinutes(14400);
        org.joda.time.Period period57 = period53.multipliedBy((int) (short) 1);
        org.joda.time.Period period59 = period53.minusHours((-95));
        org.joda.time.Period period61 = period59.minusWeeks(87);
        org.joda.time.Period period62 = period50.withFields((org.joda.time.ReadablePeriod) period59);
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
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period62);
    }

    @Test
    public void test23530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23530");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration6.toIntervalFrom(readableInstant7);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period15.minusMonths(0);
        org.joda.time.Minutes minutes18 = period17.toStandardMinutes();
        org.joda.time.Minutes minutes19 = minutes12.minus(minutes18);
        int int20 = minutes19.size();
        boolean boolean21 = duration6.equals((java.lang.Object) minutes19);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardMinutes((long) (-36));
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardSeconds((long) 10);
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
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Interval interval46 = duration42.toIntervalTo(readableInstant45);
        boolean boolean47 = duration25.isLongerThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Duration duration50 = duration42.withDurationAdded((long) 10, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = duration50.toPeriodTo(readableInstant51, periodType52);
        boolean boolean54 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Interval interval56 = duration50.toIntervalTo(readableInstant55);
        org.joda.time.Minutes minutes57 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval56);
        org.joda.time.Minutes minutes58 = minutes19.minus(minutes57);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration25);
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
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(minutes57);
        org.junit.Assert.assertNotNull(minutes58);
    }

    @Test
    public void test23531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23531");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalFrom(readableInstant7);
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.PeriodType periodType10 = weeks9.getPeriodType();
        int int12 = weeks9.getValue((int) (byte) 0);
        org.joda.time.Duration duration13 = weeks9.toStandardDuration();
        java.lang.String str14 = weeks9.toString();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P0W" + "'", str14, "P0W");
    }

    @Test
    public void test23532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23532");
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
        org.joda.time.Duration duration19 = duration6.toDuration();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant20);
        org.joda.time.Period period23 = period21.withHours((int) (byte) -1);
        org.joda.time.Period period24 = period23.negated();
        org.joda.time.Period period26 = period23.minusMonths(2);
        org.joda.time.Period period28 = period26.minusDays(5);
        int int29 = period28.getMonths();
        org.joda.time.Period period31 = period28.plusYears(118);
        org.joda.time.Period period33 = period31.withHours(1491308);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2) + "'", int29 == (-2));
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test23533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23533");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days1 = org.joda.time.Days.ONE;
        int int2 = days0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days1);
        org.joda.time.Days days4 = days1.multipliedBy((int) '#');
        org.joda.time.Days days5 = org.joda.time.Days.SIX;
        org.joda.time.Days days6 = days4.minus(days5);
        org.joda.time.Days days8 = days4.dividedBy(105);
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType10 = days8.getFieldType();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(durationFieldType10);
    }

    @Test
    public void test23534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23534");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableDuration10);
        org.joda.time.Period period13 = period11.minusYears(0);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Days days15 = days7.plus(days14);
        org.joda.time.Days days17 = days14.multipliedBy(1);
        org.joda.time.Days days19 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days21 = days19.multipliedBy((int) (short) 100);
        org.joda.time.Days days22 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType23 = days22.getPeriodType();
        org.joda.time.Days days25 = days22.minus(0);
        org.joda.time.Days days26 = days19.minus(days25);
        java.lang.String str27 = days26.toString();
        org.joda.time.DurationFieldType durationFieldType28 = days26.getFieldType();
        org.joda.time.Days days30 = days26.plus(14400);
        boolean boolean31 = days17.isGreaterThan(days26);
        org.joda.time.Days days32 = org.joda.time.Days.FIVE;
        java.lang.String str33 = days32.toString();
        org.joda.time.Days days35 = days32.multipliedBy((int) (byte) -1);
        org.joda.time.Days days36 = days32.negated();
        org.joda.time.Days days37 = org.joda.time.Days.ONE;
        org.joda.time.Days days38 = org.joda.time.Days.ONE;
        int int39 = days37.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days38);
        org.joda.time.Days days41 = days38.multipliedBy((int) '#');
        org.joda.time.Days days42 = days36.minus(days38);
        org.joda.time.Duration duration45 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration47 = duration45.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration47, readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Interval interval51 = duration47.toIntervalFrom(readableInstant50);
        org.joda.time.Days days52 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval51);
        org.joda.time.Days days54 = days52.minus((int) '4');
        org.joda.time.Days days56 = days52.minus((int) 'a');
        org.joda.time.Days days57 = days38.plus(days56);
        org.joda.time.PeriodType periodType58 = days56.getPeriodType();
        org.joda.time.Days days59 = days17.plus(days56);
        org.joda.time.Days days61 = days59.multipliedBy((-87));
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "P0D" + "'", str27, "P0D");
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "P5D" + "'", str33, "P5D");
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(days52);
        org.junit.Assert.assertNotNull(days54);
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertNotNull(days57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(days59);
        org.junit.Assert.assertNotNull(days61);
    }

    @Test
    public void test23535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23535");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period9 = period7.minusMonths(0);
        org.joda.time.Minutes minutes10 = period9.toStandardMinutes();
        org.joda.time.Duration duration11 = minutes10.toStandardDuration();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Minutes minutes17 = period16.toStandardMinutes();
        org.joda.time.Duration duration18 = minutes17.toStandardDuration();
        boolean boolean19 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.Duration duration21 = duration11.plus((long) (short) 10);
        org.joda.time.Period period22 = duration11.toPeriod();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period28 = period26.minusMonths(0);
        org.joda.time.Minutes minutes29 = period28.toStandardMinutes();
        org.joda.time.Duration duration30 = minutes29.toStandardDuration();
        org.joda.time.Period period31 = duration30.toPeriod();
        org.joda.time.Duration duration33 = duration30.plus((long) (byte) 0);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Period period35 = duration33.toPeriod();
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.days();
        org.joda.time.Period period37 = duration33.toPeriod(periodType36);
        boolean boolean38 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str45 = periodType44.getName();
        boolean boolean47 = periodType44.equals((java.lang.Object) true);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant42, readableInstant43, periodType44);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) 0, (long) (-10), periodType44, chronology49);
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration33, periodType44);
        org.joda.time.Period period52 = duration1.toPeriodFrom(readableInstant2, periodType44);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "YearMonthDay" + "'", str45, "YearMonthDay");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(period52);
    }

    @Test
    public void test23536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23536");
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
        int int40 = weeks37.getWeeks();
        org.joda.time.Weeks weeks42 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks43 = weeks42.negated();
        org.joda.time.Weeks weeks44 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.Weeks weeks46 = org.joda.time.Weeks.weeksIn(readableInterval45);
        boolean boolean47 = weeks44.isLessThan(weeks46);
        boolean boolean48 = weeks43.isGreaterThan(weeks46);
        org.joda.time.Weeks weeks49 = weeks37.minus(weeks46);
        int int50 = weeks37.getWeeks();
        org.joda.time.PeriodType periodType51 = weeks37.getPeriodType();
        org.joda.time.PeriodType periodType52 = periodType51.withMillisRemoved();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertNotNull(weeks43);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertNotNull(weeks46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(periodType52);
    }

    @Test
    public void test23537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23537");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-38), chronology1);
    }

    @Test
    public void test23538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23538");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(35);
        org.joda.time.Weeks weeks3 = weeks1.multipliedBy(5);
        org.joda.time.Weeks weeks5 = weeks1.dividedBy((-36));
        int int6 = weeks1.getWeeks();
        org.joda.time.MutablePeriod mutablePeriod7 = weeks1.toMutablePeriod();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(mutablePeriod7);
    }

    @Test
    public void test23539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23539");
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
        org.joda.time.Hours hours18 = hours14.dividedBy((-5));
        org.joda.time.Hours hours19 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours21 = hours19.plus(36);
        org.joda.time.Hours hours22 = hours14.plus(hours21);
        org.joda.time.Hours hours23 = hours22.negated();
        org.joda.time.Hours hours24 = null;
        org.joda.time.Hours hours25 = hours22.plus(hours24);
        org.joda.time.Hours hours26 = org.joda.time.Hours.ONE;
        int int27 = hours26.getHours();
        org.joda.time.Hours hours29 = hours26.dividedBy(8);
        org.joda.time.Hours hours31 = hours29.plus((int) 'a');
        org.joda.time.Hours hours33 = hours29.minus((int) (short) -1);
        org.joda.time.Hours hours35 = hours33.multipliedBy(3);
        org.joda.time.PeriodType periodType36 = hours33.getPeriodType();
        org.joda.time.PeriodType periodType37 = hours33.getPeriodType();
        org.joda.time.Hours hours38 = hours25.plus(hours33);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(hours31);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(hours38);
    }

    @Test
    public void test23540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23540");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalFrom(readableInstant7);
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval8);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
    }

    @Test
    public void test23541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23541");
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
        org.joda.time.Period period19 = duration6.toPeriodTo(readableInstant18);
        org.joda.time.Period period21 = period19.minusMillis(0);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((java.lang.Object) period19, chronology22);
        org.joda.time.Period period24 = period19.negated();
        int int25 = period24.getWeeks();
        org.joda.time.Period period27 = period24.withWeeks((-2147480046));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period27);
    }

    @Test
    public void test23542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23542");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Period period8 = duration7.toPeriod();
        org.joda.time.Duration duration10 = duration7.plus((long) (byte) 0);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) duration10, periodType12, chronology13);
        org.joda.time.PeriodType periodType15 = periodType12.withDaysRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withDaysRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withWeeksRemoved();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test23543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23543");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str4 = periodType3.getName();
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.ONE;
        boolean boolean6 = periodType3.equals((java.lang.Object) weeks5);
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, readableInstant2, periodType3);
        org.joda.time.Period period9 = period7.minusDays((-95));
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "YearMonthDay" + "'", str4, "YearMonthDay");
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test23544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23544");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(10);
        int int2 = weeks1.getWeeks();
        org.joda.time.Duration duration3 = weeks1.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType4 = weeks1.getFieldType();
        org.joda.time.Weeks weeks6 = weeks1.minus((-612));
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(weeks6);
    }

    @Test
    public void test23545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23545");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 20);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test23546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23546");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0M");
        int int2 = period1.getSeconds();
        int int3 = period1.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test23547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23547");
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
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds20 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds22 = seconds20.plus(seconds21);
        org.joda.time.Seconds seconds24 = seconds20.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds25 = seconds19.plus(seconds20);
        org.joda.time.Seconds seconds27 = seconds20.multipliedBy((int) (short) 1);
        org.joda.time.Seconds seconds29 = seconds27.multipliedBy((int) '4');
        org.joda.time.Seconds seconds30 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds32 = seconds30.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType33 = seconds30.getFieldType();
        org.joda.time.Seconds seconds34 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds35 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds36 = seconds34.plus(seconds35);
        org.joda.time.Seconds seconds38 = seconds34.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds39 = seconds30.plus(seconds34);
        org.joda.time.Seconds seconds40 = seconds29.plus(seconds34);
        org.joda.time.Seconds seconds41 = seconds10.minus(seconds29);
        org.joda.time.Seconds seconds43 = seconds10.dividedBy((-8));
        org.joda.time.Seconds seconds45 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds46 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds47 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds48 = seconds46.plus(seconds47);
        org.joda.time.Seconds seconds50 = seconds46.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds51 = seconds45.plus(seconds46);
        org.joda.time.Seconds seconds53 = seconds45.plus((int) '4');
        org.joda.time.Duration duration54 = seconds53.toStandardDuration();
        org.joda.time.Seconds seconds56 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds57 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds58 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds59 = seconds57.plus(seconds58);
        org.joda.time.Seconds seconds61 = seconds57.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds62 = seconds56.plus(seconds57);
        org.joda.time.Seconds seconds64 = seconds56.plus((int) '4');
        org.joda.time.Duration duration65 = seconds64.toStandardDuration();
        boolean boolean66 = seconds53.isLessThan(seconds64);
        org.joda.time.Seconds seconds67 = seconds53.negated();
        java.lang.String str68 = seconds53.toString();
        org.joda.time.Seconds seconds69 = seconds53.negated();
        org.joda.time.Seconds seconds71 = org.joda.time.Seconds.seconds(56);
        org.joda.time.Seconds seconds73 = seconds71.plus(11);
        org.joda.time.Seconds seconds75 = org.joda.time.Seconds.seconds((int) '#');
        int int76 = seconds75.getSeconds();
        org.joda.time.Seconds seconds78 = seconds75.dividedBy((int) (short) 1);
        int int79 = seconds78.getSeconds();
        boolean boolean80 = seconds71.isLessThan(seconds78);
        org.joda.time.Seconds seconds81 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds82 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds83 = seconds81.plus(seconds82);
        java.lang.String str84 = seconds81.toString();
        org.joda.time.DurationFieldType durationFieldType85 = seconds81.getFieldType();
        java.lang.String str86 = seconds81.toString();
        org.joda.time.Seconds seconds87 = seconds78.minus(seconds81);
        org.joda.time.Seconds seconds88 = seconds53.minus(seconds78);
        org.joda.time.Seconds seconds89 = seconds43.plus(seconds78);
        org.joda.time.Seconds seconds91 = seconds43.plus(57);
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
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds35);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertNotNull(seconds41);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(seconds45);
        org.junit.Assert.assertNotNull(seconds46);
        org.junit.Assert.assertNotNull(seconds47);
        org.junit.Assert.assertNotNull(seconds48);
        org.junit.Assert.assertNotNull(seconds50);
        org.junit.Assert.assertNotNull(seconds51);
        org.junit.Assert.assertNotNull(seconds53);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertNotNull(seconds57);
        org.junit.Assert.assertNotNull(seconds58);
        org.junit.Assert.assertNotNull(seconds59);
        org.junit.Assert.assertNotNull(seconds61);
        org.junit.Assert.assertNotNull(seconds62);
        org.junit.Assert.assertNotNull(seconds64);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(seconds67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "PT52S" + "'", str68, "PT52S");
        org.junit.Assert.assertNotNull(seconds69);
        org.junit.Assert.assertNotNull(seconds71);
        org.junit.Assert.assertNotNull(seconds73);
        org.junit.Assert.assertNotNull(seconds75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 35 + "'", int76 == 35);
        org.junit.Assert.assertNotNull(seconds78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 35 + "'", int79 == 35);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(seconds81);
        org.junit.Assert.assertNotNull(seconds82);
        org.junit.Assert.assertNotNull(seconds83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "PT2S" + "'", str84, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "PT2S" + "'", str86, "PT2S");
        org.junit.Assert.assertNotNull(seconds87);
        org.junit.Assert.assertNotNull(seconds88);
        org.junit.Assert.assertNotNull(seconds89);
        org.junit.Assert.assertNotNull(seconds91);
    }

    @Test
    public void test23548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23548");
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
        org.joda.time.PeriodType periodType67 = minutes1.getPeriodType();
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
        org.junit.Assert.assertNotNull(periodType67);
    }

    @Test
    public void test23549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23549");
        org.joda.time.Period period1 = org.joda.time.Period.years(5);
        org.joda.time.Period period3 = period1.minusDays(0);
        org.joda.time.Period period5 = period3.minusMinutes((-200));
        org.joda.time.Period period7 = period5.plusMonths(59);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test23550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23550");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT0H");
        org.joda.time.DurationFieldType durationFieldType2 = minutes1.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes4 = minutes1.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test23551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23551");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(4088);
        org.joda.time.Days days2 = seconds1.toStandardDays();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test23552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23552");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        java.lang.Object obj8 = null;
        boolean boolean9 = period6.equals(obj8);
        org.joda.time.Period period11 = period6.withWeeks((int) '#');
        org.joda.time.Period period13 = period11.plusMillis((-1));
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Duration duration20 = minutes19.toStandardDuration();
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Duration duration27 = minutes26.toStandardDuration();
        boolean boolean28 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, readableInstant29);
        java.lang.String str31 = duration27.toString();
        long long32 = duration27.getMillis();
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period36.minusMonths(0);
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Duration duration40 = minutes39.toStandardDuration();
        org.joda.time.Minutes minutes42 = minutes39.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType43 = minutes42.getPeriodType();
        org.joda.time.PeriodType periodType44 = minutes42.getPeriodType();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, readableInstant33, periodType44);
        boolean boolean46 = period11.equals((java.lang.Object) period45);
        org.joda.time.Period period48 = period11.minusSeconds(0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT0S" + "'", str31, "PT0S");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(period48);
    }

    @Test
    public void test23553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23553");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 56, (long) (byte) 1, chronology2);
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.Hours hours5 = period3.toStandardHours();
        int int6 = period3.size();
        int int7 = period3.getWeeks();
        int int8 = period3.getWeeks();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test23554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23554");
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
        org.joda.time.Seconds seconds30 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds31 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds32 = seconds30.plus(seconds31);
        org.joda.time.Seconds seconds34 = seconds31.plus((int) (byte) 0);
        org.joda.time.Seconds seconds36 = seconds34.minus((int) (byte) -1);
        org.joda.time.Seconds seconds37 = null;
        org.joda.time.Seconds seconds38 = seconds36.minus(seconds37);
        int int39 = seconds36.getSeconds();
        boolean boolean40 = seconds11.isGreaterThan(seconds36);
        org.joda.time.Seconds seconds42 = seconds36.plus((-7));
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
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(seconds42);
    }

    @Test
    public void test23555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23555");
        org.joda.time.Period period4 = new org.joda.time.Period(0, (-97), (-2), 5);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationTo(readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Days days10 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType11 = days10.getPeriodType();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withSecondsRemoved();
        org.joda.time.Period period14 = duration8.toPeriodFrom(readableInstant9, periodType11);
        long long15 = duration8.getStandardHours();
        org.joda.time.Duration duration18 = duration8.withDurationAdded(10L, (-36));
        java.lang.String str19 = duration18.toString();
        org.joda.time.Duration duration21 = duration18.plus((-1L));
        org.joda.time.Duration duration22 = duration21.toDuration();
        org.joda.time.Duration duration23 = duration6.minus((org.joda.time.ReadableDuration) duration22);
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period28 = period26.minusMonths(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.Duration duration31 = duration30.toDuration();
        org.joda.time.Duration duration33 = duration30.minus((long) (-3));
        org.joda.time.Duration duration34 = duration22.plus((org.joda.time.ReadableDuration) duration33);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT99.640S" + "'", str19, "PT99.640S");
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(duration34);
    }

    @Test
    public void test23556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23556");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) (-8));
        long long2 = duration1.getStandardDays();
        org.joda.time.Days days4 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days6 = days4.multipliedBy((int) (short) 100);
        org.joda.time.Duration duration7 = days4.toStandardDuration();
        org.joda.time.Duration duration9 = new org.joda.time.Duration((long) (byte) -1);
        long long10 = duration9.getMillis();
        int int11 = duration7.compareTo((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Duration duration13 = duration9.plus((long) 59);
        int int14 = duration1.compareTo((org.joda.time.ReadableDuration) duration9);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test23557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23557");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(0L, (-128849018880L), periodType2, chronology3);
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period7.negated();
        int int9 = period7.getHours();
        org.joda.time.MutablePeriod mutablePeriod10 = period7.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod11 = period7.toMutablePeriod();
        org.joda.time.Period period13 = period7.minusMinutes((int) 'a');
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.Days days15 = org.joda.time.Days.daysIn(readableInterval14);
        org.joda.time.Period period16 = period7.minus((org.joda.time.ReadablePeriod) days15);
        boolean boolean17 = periodType2.equals((java.lang.Object) period7);
        org.joda.time.Period period19 = period7.plusMinutes((-53));
        org.joda.time.Period period21 = period19.withMinutes(14400);
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardHours((long) 14400);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardHours((long) ' ');
        org.joda.time.Duration duration27 = duration23.withDurationAdded((org.joda.time.ReadableDuration) duration25, 999);
        org.joda.time.Duration duration29 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Days days31 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType32 = days31.getPeriodType();
        org.joda.time.PeriodType periodType33 = periodType32.withHoursRemoved();
        org.joda.time.PeriodType periodType34 = periodType32.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.days();
        boolean boolean36 = periodType34.isSupported(durationFieldType35);
        org.joda.time.PeriodType periodType37 = periodType34.withMinutesRemoved();
        int int38 = periodType34.size();
        org.joda.time.Period period39 = duration29.toPeriodFrom(readableInstant30, periodType34);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Days days41 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType42 = days41.getPeriodType();
        org.joda.time.PeriodType periodType43 = periodType42.withSecondsRemoved();
        org.joda.time.PeriodType periodType44 = periodType42.withYearsRemoved();
        java.lang.String str45 = periodType44.toString();
        org.joda.time.PeriodType periodType46 = periodType44.withHoursRemoved();
        java.lang.String str47 = periodType46.toString();
        org.joda.time.Period period48 = duration29.toPeriodTo(readableInstant40, periodType46);
        boolean boolean49 = duration23.isLongerThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Interval interval51 = duration29.toIntervalFrom(readableInstant50);
        boolean boolean52 = period19.equals((java.lang.Object) interval51);
        org.joda.time.Days days53 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval51);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PeriodType[Days]" + "'", str45, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PeriodType[Days]" + "'", str47, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(days53);
    }

    @Test
    public void test23558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23558");
        org.joda.time.Days days0 = org.joda.time.Days.TWO;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days3 = days0.multipliedBy((-10));
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.Period period6 = period4.withDays(8);
        int int7 = period4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.seconds();
        int int9 = period4.get(durationFieldType8);
        org.joda.time.Period period11 = period4.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period4.toPeriod();
        org.joda.time.Days days13 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        org.joda.time.Days days15 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType16 = days15.getPeriodType();
        org.joda.time.Days days18 = days15.minus(0);
        org.joda.time.Days days19 = days18.negated();
        boolean boolean20 = days13.isGreaterThan(days18);
        org.joda.time.Days days21 = days13.negated();
        org.joda.time.DurationFieldType durationFieldType22 = days13.getFieldType();
        org.joda.time.Days days24 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days26 = days24.multipliedBy((int) (short) 100);
        org.joda.time.Days days27 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType28 = days27.getPeriodType();
        org.joda.time.Days days30 = days27.minus(0);
        org.joda.time.Days days31 = days24.minus(days30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableDuration33);
        org.joda.time.Period period36 = period34.minusYears(0);
        org.joda.time.Days days37 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Days days38 = days30.plus(days37);
        org.joda.time.Period period40 = org.joda.time.Period.days(10);
        org.joda.time.Period period42 = period40.plusMonths((int) 'a');
        org.joda.time.Period period44 = period40.plusSeconds((int) (short) 100);
        org.joda.time.Period period46 = period40.withMinutes(1);
        org.joda.time.Days days47 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period40);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant48, readableDuration49);
        org.joda.time.Days days51 = period50.toStandardDays();
        org.joda.time.Days days53 = days51.minus(7);
        org.joda.time.Days days54 = days47.plus(days53);
        org.joda.time.DurationFieldType durationFieldType55 = days54.getFieldType();
        int int56 = days30.get(durationFieldType55);
        org.joda.time.Days days57 = days13.minus(days30);
        org.joda.time.Days days58 = days57.negated();
        org.joda.time.Period period59 = period12.minus((org.joda.time.ReadablePeriod) days57);
        org.joda.time.Days days61 = days57.multipliedBy((int) (byte) 0);
        org.joda.time.Days days62 = days57.negated();
        boolean boolean63 = days3.isLessThan(days62);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertNotNull(days53);
        org.junit.Assert.assertNotNull(days54);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5 + "'", int56 == 5);
        org.junit.Assert.assertNotNull(days57);
        org.junit.Assert.assertNotNull(days58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(days61);
        org.junit.Assert.assertNotNull(days62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test23559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23559");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (byte) 100);
        org.joda.time.Period period3 = period1.multipliedBy(87);
        org.joda.time.Period period5 = period1.plusSeconds(7);
        org.joda.time.Period period6 = period5.toPeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test23560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23560");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Period period4 = period1.multipliedBy((int) (byte) 100);
        org.joda.time.Hours hours5 = period1.toStandardHours();
        int int6 = hours5.size();
        org.joda.time.Hours hours8 = hours5.multipliedBy(10);
        org.joda.time.Hours hours10 = org.joda.time.Hours.hours(7);
        org.joda.time.Hours hours12 = hours10.plus((int) (byte) 1);
        org.joda.time.Hours hours13 = org.joda.time.Hours.ONE;
        int int14 = hours13.getHours();
        org.joda.time.Hours hours16 = hours13.dividedBy(8);
        org.joda.time.Hours hours17 = hours12.minus(hours13);
        org.joda.time.Hours hours19 = org.joda.time.Hours.hours((int) '4');
        org.joda.time.Hours hours21 = hours19.multipliedBy(52);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology23 = null;
        boolean boolean24 = durationFieldType22.isSupported(chronology23);
        int int25 = hours19.get(durationFieldType22);
        org.joda.time.Hours hours27 = hours19.multipliedBy((int) (byte) 100);
        org.joda.time.Hours hours28 = hours13.plus(hours27);
        org.joda.time.Hours hours29 = hours13.negated();
        org.joda.time.Hours hours31 = hours29.minus(3104);
        boolean boolean32 = hours5.isLessThan(hours29);
        org.joda.time.Hours hours34 = hours29.dividedBy(777);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(hours31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(hours34);
    }

    @Test
    public void test23561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23561");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT2S");
        int int2 = seconds1.size();
        org.joda.time.Days days3 = seconds1.toStandardDays();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test23562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23562");
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
        org.joda.time.Hours hours35 = hours23.minus((int) (byte) 10);
        org.joda.time.Duration duration37 = org.joda.time.Duration.parse("PT9072000S");
        org.joda.time.Hours hours38 = duration37.toStandardHours();
        org.joda.time.Hours hours39 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours41 = hours39.dividedBy(100);
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period46 = period44.minusMonths(0);
        org.joda.time.Period period48 = period46.minusSeconds(0);
        org.joda.time.Period period49 = period48.normalizedStandard();
        org.joda.time.Hours hours50 = period49.toStandardHours();
        boolean boolean51 = hours41.isLessThan(hours50);
        org.joda.time.Period period53 = org.joda.time.Period.millis((int) '#');
        int int54 = period53.getYears();
        org.joda.time.Hours hours55 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Period period57 = period53.multipliedBy((int) (byte) 0);
        org.joda.time.Hours hours58 = period57.toStandardHours();
        org.joda.time.Hours hours59 = hours41.minus(hours58);
        org.joda.time.Hours hours60 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours61 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours63 = hours61.dividedBy(100);
        org.joda.time.Period period66 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period68 = period66.minusMonths(0);
        org.joda.time.Period period70 = period68.minusSeconds(0);
        org.joda.time.Period period71 = period70.normalizedStandard();
        org.joda.time.Hours hours72 = period71.toStandardHours();
        boolean boolean73 = hours63.isLessThan(hours72);
        boolean boolean74 = hours60.isLessThan(hours63);
        org.joda.time.Duration duration75 = hours63.toStandardDuration();
        java.lang.String str76 = hours63.toString();
        org.joda.time.Period period78 = org.joda.time.Period.millis((int) '#');
        int int79 = period78.getYears();
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.Period period81 = period78.withFields(readablePeriod80);
        org.joda.time.Hours hours82 = period78.toStandardHours();
        org.joda.time.Hours hours83 = hours63.minus(hours82);
        org.joda.time.Hours hours84 = hours58.minus(hours63);
        boolean boolean85 = hours38.isGreaterThan(hours58);
        org.joda.time.Hours hours87 = hours58.plus((-1));
        org.joda.time.Hours hours88 = hours23.minus(hours58);
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
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(hours38);
        org.junit.Assert.assertNotNull(hours39);
        org.junit.Assert.assertNotNull(hours41);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(hours50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(hours55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(hours58);
        org.junit.Assert.assertNotNull(hours59);
        org.junit.Assert.assertNotNull(hours60);
        org.junit.Assert.assertNotNull(hours61);
        org.junit.Assert.assertNotNull(hours63);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(hours72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "PT0H" + "'", str76, "PT0H");
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(hours82);
        org.junit.Assert.assertNotNull(hours83);
        org.junit.Assert.assertNotNull(hours84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(hours87);
        org.junit.Assert.assertNotNull(hours88);
    }

    @Test
    public void test23563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23563");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.parseMinutes("PT0H");
        org.joda.time.Minutes minutes11 = minutes5.minus(minutes10);
        org.joda.time.Minutes minutes13 = minutes10.dividedBy(7);
        java.lang.String str14 = minutes13.toString();
        org.joda.time.Minutes minutes16 = minutes13.dividedBy(97);
        org.joda.time.PeriodType periodType17 = minutes13.getPeriodType();
        org.joda.time.PeriodType periodType18 = periodType17.withSecondsRemoved();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0M" + "'", str14, "PT0M");
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test23564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23564");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((-7L));
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test23565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23565");
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
        org.joda.time.Duration duration21 = weeks19.toStandardDuration();
        org.joda.time.Weeks weeks23 = weeks19.dividedBy(26);
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
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(weeks23);
    }

    @Test
    public void test23566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23566");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean4 = weeks2.isGreaterThan(weeks3);
        org.joda.time.Weeks weeks5 = null;
        org.joda.time.Weeks weeks6 = weeks2.minus(weeks5);
        org.joda.time.Period period7 = weeks2.toPeriod();
        org.joda.time.Weeks weeks8 = weeks2.negated();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(weeks8);
    }

    @Test
    public void test23567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23567");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) (byte) 10);
        boolean boolean3 = seconds1.equals((java.lang.Object) "PeriodType[StandardNoMinutes]");
        org.joda.time.Seconds seconds5 = seconds1.minus((-105));
        org.joda.time.Seconds seconds7 = seconds1.minus((-52));
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
    }

    @Test
    public void test23568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23568");
        org.joda.time.Period period4 = new org.joda.time.Period((-1), 10, 97, (int) (byte) -1);
        org.joda.time.Period period6 = period4.plusMillis(999);
        org.joda.time.Period period8 = period6.withMillis(126064);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test23569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23569");
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period19 = period17.minusMonths(0);
        org.joda.time.Minutes minutes20 = period19.toStandardMinutes();
        org.joda.time.Duration duration21 = minutes20.toStandardDuration();
        boolean boolean22 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration21, readableInstant23);
        java.lang.String str25 = duration21.toString();
        long long26 = duration21.getMillis();
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period32 = period30.minusMonths(0);
        org.joda.time.Minutes minutes33 = period32.toStandardMinutes();
        org.joda.time.Duration duration34 = minutes33.toStandardDuration();
        org.joda.time.Minutes minutes36 = minutes33.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType37 = minutes36.getPeriodType();
        org.joda.time.PeriodType periodType38 = minutes36.getPeriodType();
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration21, readableInstant27, periodType38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period40 = new org.joda.time.Period((-57), (-4188), (-100), 126000, (-13), 20, (-2704), (-100), periodType38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT0S" + "'", str25, "PT0S");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test23570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23570");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(105L);
        long long2 = duration1.getMillis();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 378000000L + "'", long2 == 378000000L);
    }

    @Test
    public void test23571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23571");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (-35));
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) 14400);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period9 = period7.minusMonths(0);
        org.joda.time.Minutes minutes10 = period9.toStandardMinutes();
        org.joda.time.Duration duration11 = minutes10.toStandardDuration();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Minutes minutes17 = period16.toStandardMinutes();
        org.joda.time.Duration duration18 = minutes17.toStandardDuration();
        boolean boolean19 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = new org.joda.time.Duration(readableInstant20, readableInstant21);
        org.joda.time.Duration duration23 = duration11.minus((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant24);
        org.joda.time.Duration duration27 = duration11.plus((long) 8);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration29 = duration3.plus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration30 = duration1.minus((org.joda.time.ReadableDuration) duration29);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration30);
    }

    @Test
    public void test23572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23572");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration11 = duration8.plus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration4.withDurationAdded((org.joda.time.ReadableDuration) duration11, (int) (byte) 0);
        org.joda.time.Period period14 = duration13.toPeriod();
        org.joda.time.Weeks weeks15 = org.joda.time.Weeks.THREE;
        org.joda.time.Duration duration16 = weeks15.toStandardDuration();
        org.joda.time.Duration duration17 = duration13.minus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Period period18 = duration16.toPeriod();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test23573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23573");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(3000L, (long) 18, chronology2);
    }

    @Test
    public void test23574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23574");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.format.PeriodPrinter periodPrinter2 = null;
        org.joda.time.format.PeriodParser periodParser3 = null;
        org.joda.time.format.PeriodFormatter periodFormatter4 = new org.joda.time.format.PeriodFormatter(periodPrinter2, periodParser3);
        boolean boolean5 = periodFormatter4.isParser();
        org.joda.time.Days days6 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter9 = periodFormatter4.withParseType(periodType7);
        org.joda.time.PeriodType periodType10 = periodFormatter4.getParseType();
        java.util.Locale locale11 = null;
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter4.withLocale(locale11);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.seconds();
        java.lang.String str14 = periodType13.getName();
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) locale11, periodType13);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertNull(periodType10);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Seconds" + "'", str14, "Seconds");
    }

    @Test
    public void test23575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23575");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (byte) 0);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks4 = weeks3.negated();
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        boolean boolean8 = weeks5.isLessThan(weeks7);
        boolean boolean9 = weeks4.isGreaterThan(weeks7);
        boolean boolean10 = weeks1.isLessThan(weeks7);
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks12 = weeks11.negated();
        boolean boolean13 = weeks7.isLessThan(weeks12);
        org.joda.time.Period period14 = weeks7.toPeriod();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test23576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23576");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis(86400000L);
        org.joda.time.Duration duration3 = duration1.withMillis(2400L);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test23577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23577");
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Minutes minutes22 = period21.toStandardMinutes();
        org.joda.time.Duration duration23 = minutes22.toStandardDuration();
        boolean boolean24 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(readableInstant25, readableInstant26);
        org.joda.time.Duration duration28 = duration16.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, readableInstant29);
        org.joda.time.Duration duration32 = duration16.plus((long) 8);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Interval interval34 = duration32.toIntervalFrom(readableInstant33);
        org.joda.time.Period period37 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period39 = period37.minusMonths(0);
        org.joda.time.Minutes minutes40 = period39.toStandardMinutes();
        org.joda.time.Duration duration41 = minutes40.toStandardDuration();
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period46 = period44.minusMonths(0);
        org.joda.time.Minutes minutes47 = period46.toStandardMinutes();
        org.joda.time.Duration duration48 = minutes47.toStandardDuration();
        boolean boolean49 = duration41.isShorterThan((org.joda.time.ReadableDuration) duration48);
        org.joda.time.Duration duration51 = duration41.plus((long) (short) 10);
        org.joda.time.Duration duration53 = duration32.withDurationAdded((org.joda.time.ReadableDuration) duration51, (int) (byte) 0);
        boolean boolean54 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration51);
        long long55 = duration51.getStandardHours();
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period61 = period59.minusMonths(0);
        org.joda.time.Period period63 = period59.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType64 = period59.getPeriodType();
        org.joda.time.PeriodType periodType65 = periodType64.withMinutesRemoved();
        org.joda.time.PeriodType periodType66 = periodType65.withMinutesRemoved();
        org.joda.time.Period period67 = duration51.toPeriodTo(readableInstant56, periodType66);
        org.joda.time.PeriodType periodType68 = periodType66.withHoursRemoved();
        org.joda.time.PeriodType periodType69 = periodType66.withHoursRemoved();
        org.joda.time.PeriodType periodType70 = periodType66.withMillisRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period71 = new org.joda.time.Period(2147483639, 70, (-95), (-35), 100, (-2147480046), (-2147483552), (-57), periodType66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(periodType70);
    }

    @Test
    public void test23578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23578");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.PeriodType periodType9 = minutes8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        java.lang.String str11 = periodType10.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PeriodType[MinutesNoMinutes]" + "'", str11, "PeriodType[MinutesNoMinutes]");
    }

    @Test
    public void test23579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23579");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT28800S");
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test23580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23580");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Duration duration9 = duration6.plus((long) (byte) 0);
        org.joda.time.Duration duration11 = duration6.withMillis((long) 1);
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Period period13 = period12.toPeriod();
        org.joda.time.Period period15 = period12.withDays(11);
        org.joda.time.Period period17 = period15.minusHours(1680);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test23581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23581");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 306783378, (long) (-213044));
    }

    @Test
    public void test23582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23582");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-36), chronology1);
        org.joda.time.Period period4 = period2.withMinutes(14400);
        org.joda.time.Hours hours5 = period2.toStandardHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(hours5);
    }

    @Test
    public void test23583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23583");
        org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT21474836H");
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test23584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23584");
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((long) (-1), (long) (byte) -1, periodType4);
        org.joda.time.PeriodType periodType6 = periodType4.withMinutesRemoved();
        int int7 = periodType6.size();
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test23585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23585");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(35);
        org.joda.time.Weeks weeks3 = weeks1.multipliedBy(5);
        org.joda.time.Weeks weeks5 = weeks1.plus(36);
        org.joda.time.Weeks weeks7 = weeks1.dividedBy(23);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
    }

    @Test
    public void test23586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23586");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Period period8 = duration7.toPeriod();
        org.joda.time.Duration duration10 = duration7.plus((long) (byte) 0);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) duration10, periodType12, chronology13);
        org.joda.time.PeriodType periodType15 = periodType12.withDaysRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withMonthsRemoved();
        org.joda.time.PeriodType periodType18 = periodType16.withWeeksRemoved();
        org.joda.time.PeriodType periodType19 = periodType16.withMillisRemoved();
        org.joda.time.PeriodType periodType20 = periodType16.withDaysRemoved();
        int int21 = periodType16.size();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test23587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23587");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes9 = minutes8.negated();
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Minutes minutes18 = minutes16.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes19 = minutes10.minus(minutes16);
        org.joda.time.Minutes minutes20 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Minutes minutes28 = minutes26.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes29 = minutes20.minus(minutes26);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period34 = period32.minusMonths(0);
        org.joda.time.Minutes minutes35 = period34.toStandardMinutes();
        org.joda.time.Duration duration36 = minutes35.toStandardDuration();
        org.joda.time.Minutes minutes38 = minutes35.multipliedBy((int) (short) 1);
        int int39 = minutes20.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes38);
        org.joda.time.Minutes minutes40 = minutes19.plus(minutes38);
        org.joda.time.Minutes minutes41 = minutes38.negated();
        org.joda.time.Minutes minutes42 = minutes8.minus(minutes41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType44 = minutes42.getFieldType(1491373);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1491373");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(minutes42);
    }

    @Test
    public void test23588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23588");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (short) 1);
        org.joda.time.Period period3 = period1.withMillis(2147483647);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(minutes4);
    }

    @Test
    public void test23589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23589");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        int int1 = hours0.getHours();
        org.joda.time.Hours hours3 = hours0.dividedBy(8);
        org.joda.time.Hours hours5 = hours3.plus((int) 'a');
        org.joda.time.Hours hours7 = hours5.dividedBy((-1));
        org.joda.time.Hours hours8 = org.joda.time.Hours.ONE;
        int int9 = hours8.getHours();
        org.joda.time.Hours hours11 = hours8.multipliedBy((-95));
        org.joda.time.Hours hours13 = hours11.dividedBy((int) (short) 1);
        org.joda.time.Hours hours14 = hours7.plus(hours11);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours14);
    }

    @Test
    public void test23590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23590");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        int int5 = period4.getYears();
        org.joda.time.Period period6 = period4.toPeriod();
        org.joda.time.Period period8 = period6.plusMinutes(100);
        org.joda.time.Period period10 = period6.minusMillis(1);
        int int11 = period6.getWeeks();
        int int12 = period6.getYears();
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = period6.getFieldTypes();
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period19 = period17.minusMonths(0);
        org.joda.time.Minutes minutes20 = period19.toStandardMinutes();
        org.joda.time.Duration duration21 = minutes20.toStandardDuration();
        org.joda.time.Minutes minutes23 = minutes20.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration24 = minutes20.toStandardDuration();
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period29 = period27.minusMonths(0);
        org.joda.time.Minutes minutes30 = period29.toStandardMinutes();
        org.joda.time.Duration duration31 = minutes30.toStandardDuration();
        org.joda.time.Period period32 = duration31.toPeriod();
        boolean boolean33 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.days();
        org.joda.time.Period period36 = duration24.toPeriodTo(readableInstant34, periodType35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = duration24.toPeriodFrom(readableInstant37);
        org.joda.time.Period period39 = period38.negated();
        int int40 = period39.getWeeks();
        org.joda.time.DurationFieldType[] durationFieldTypeArray41 = period39.getFieldTypes();
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.forFields(durationFieldTypeArray41);
        org.joda.time.PeriodType periodType43 = periodType42.withMillisRemoved();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) (-12), periodType43, chronology44);
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period50 = period48.minusMonths(0);
        org.joda.time.Minutes minutes51 = period50.toStandardMinutes();
        org.joda.time.Minutes minutes53 = minutes51.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((java.lang.Object) minutes51, chronology54);
        org.joda.time.Period period56 = minutes51.toPeriod();
        org.joda.time.Period period58 = period56.withWeeks((int) (short) -1);
        org.joda.time.Period period60 = period58.minusMonths((int) (byte) 10);
        org.joda.time.Period period62 = org.joda.time.Period.millis(0);
        org.joda.time.DurationFieldType durationFieldType63 = org.joda.time.DurationFieldType.months();
        boolean boolean64 = period62.isSupported(durationFieldType63);
        java.lang.String str65 = durationFieldType63.getName();
        org.joda.time.Chronology chronology66 = null;
        boolean boolean67 = durationFieldType63.isSupported(chronology66);
        boolean boolean68 = period60.isSupported(durationFieldType63);
        org.joda.time.Period period70 = period45.withField(durationFieldType63, (-2147483639));
        java.lang.String str71 = durationFieldType63.getName();
        boolean boolean72 = period6.isSupported(durationFieldType63);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "months" + "'", str65, "months");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "months" + "'", str71, "months");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test23591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23591");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Minutes minutes7 = minutes5.dividedBy((int) (byte) 100);
        int int8 = minutes7.size();
        org.joda.time.Minutes minutes10 = minutes7.dividedBy((int) (short) 100);
        org.joda.time.Duration duration11 = minutes7.toStandardDuration();
        java.lang.Object obj12 = null;
        boolean boolean13 = duration11.equals(obj12);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23592");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((-2147483552));
        org.joda.time.Duration duration2 = seconds1.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.format.PeriodPrinter periodPrinter5 = null;
        org.joda.time.format.PeriodParser periodParser6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = new org.joda.time.format.PeriodFormatter(periodPrinter5, periodParser6);
        boolean boolean8 = periodFormatter7.isParser();
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds12 = seconds10.plus(seconds11);
        org.joda.time.PeriodType periodType13 = seconds10.getPeriodType();
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period16.negated();
        org.joda.time.DurationFieldType durationFieldType19 = period16.getFieldType((int) (short) 1);
        int int20 = periodType13.indexOf(durationFieldType19);
        org.joda.time.Period period21 = new org.joda.time.Period((long) ' ', periodType13);
        org.joda.time.format.PeriodFormatter periodFormatter22 = periodFormatter7.withParseType(periodType13);
        org.joda.time.PeriodType periodType23 = periodType13.withDaysRemoved();
        org.joda.time.Period period24 = new org.joda.time.Period(10L, periodType13);
        org.joda.time.PeriodType periodType25 = periodType13.withMillisRemoved();
        int int26 = periodType25.size();
        org.joda.time.Period period27 = duration2.toPeriodFrom(readableInstant3, periodType25);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(period27);
    }

    @Test
    public void test23593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23593");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.minus((int) 'a');
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.Seconds seconds9 = seconds5.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds12 = seconds10.plus(seconds11);
        java.lang.String str13 = seconds10.toString();
        org.joda.time.DurationFieldType durationFieldType14 = seconds10.getFieldType();
        java.lang.String str15 = durationFieldType14.getName();
        boolean boolean16 = seconds5.isSupported(durationFieldType14);
        int int17 = seconds4.get(durationFieldType14);
        int int18 = seconds4.getSeconds();
        org.joda.time.Duration duration19 = seconds4.toStandardDuration();
        org.joda.time.Seconds seconds20 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) seconds4);
        org.joda.time.Seconds seconds21 = seconds20.negated();
        org.joda.time.PeriodType periodType22 = seconds20.getPeriodType();
        org.joda.time.Period period23 = new org.joda.time.Period(2147483648L, (long) (-2147483648), periodType22);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT2S" + "'", str13, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "seconds" + "'", str15, "seconds");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-95) + "'", int17 == (-95));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-95) + "'", int18 == (-95));
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test23594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23594");
        org.joda.time.Hours hours0 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours2 = hours0.dividedBy(100);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Period period9 = period7.minusSeconds(0);
        org.joda.time.Period period10 = period9.normalizedStandard();
        org.joda.time.Hours hours11 = period10.toStandardHours();
        boolean boolean12 = hours2.isLessThan(hours11);
        org.joda.time.Period period14 = org.joda.time.Period.millis((int) '#');
        int int15 = period14.getYears();
        org.joda.time.Hours hours16 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period18 = period14.multipliedBy((int) (byte) 0);
        org.joda.time.Hours hours19 = period18.toStandardHours();
        org.joda.time.Hours hours20 = hours2.minus(hours19);
        org.joda.time.Hours hours22 = hours19.dividedBy(11);
        int int23 = hours22.getHours();
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.Hours hours25 = org.joda.time.Hours.hoursIn(readableInterval24);
        org.joda.time.Hours hours27 = hours25.multipliedBy(8);
        org.joda.time.Hours hours29 = hours27.multipliedBy((int) ' ');
        org.joda.time.Hours hours30 = org.joda.time.Hours.ONE;
        int int31 = hours30.getHours();
        org.joda.time.Hours hours33 = hours30.multipliedBy((-95));
        boolean boolean34 = hours27.isLessThan(hours30);
        org.joda.time.Period period36 = org.joda.time.Period.millis((int) '#');
        int int37 = period36.getYears();
        org.joda.time.Hours hours38 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Hours hours40 = hours38.multipliedBy((int) (byte) 100);
        org.joda.time.Hours hours41 = hours27.plus(hours38);
        boolean boolean42 = hours22.isGreaterThan(hours38);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(hours38);
        org.junit.Assert.assertNotNull(hours40);
        org.junit.Assert.assertNotNull(hours41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test23595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23595");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(432000L, (long) 65, chronology2);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        java.lang.String str5 = days4.toString();
        org.joda.time.Days days6 = org.joda.time.Days.ONE;
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean8 = days6.isSupported(durationFieldType7);
        boolean boolean9 = days4.isGreaterThan(days6);
        int int10 = days6.getDays();
        org.joda.time.DurationFieldType durationFieldType11 = days6.getFieldType();
        org.joda.time.Days days12 = org.joda.time.Days.FIVE;
        java.lang.String str13 = days12.toString();
        org.joda.time.Days days15 = days12.multipliedBy((int) (byte) -1);
        org.joda.time.Days days16 = days12.negated();
        org.joda.time.Days days17 = org.joda.time.Days.ONE;
        org.joda.time.Days days18 = org.joda.time.Days.ONE;
        int int19 = days17.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days18);
        org.joda.time.Days days21 = days18.multipliedBy((int) '#');
        org.joda.time.Days days22 = days16.minus(days18);
        org.joda.time.Days days24 = days16.minus((int) 'a');
        org.joda.time.Days days25 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType26 = days25.getPeriodType();
        org.joda.time.Days days27 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType28 = days27.getPeriodType();
        org.joda.time.Days days30 = days27.minus(0);
        org.joda.time.Days days31 = days30.negated();
        boolean boolean32 = days25.isGreaterThan(days30);
        org.joda.time.Days days33 = days25.negated();
        org.joda.time.Days days35 = days25.multipliedBy(10);
        org.joda.time.Days days36 = days35.negated();
        boolean boolean37 = days24.isLessThan(days36);
        boolean boolean38 = days6.isGreaterThan(days24);
        org.joda.time.Period period39 = period3.withFields((org.joda.time.ReadablePeriod) days6);
        org.joda.time.MutablePeriod mutablePeriod40 = period3.toMutablePeriod();
        org.joda.time.Days days41 = period3.toStandardDays();
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P5D" + "'", str5, "P5D");
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P5D" + "'", str13, "P5D");
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(days41);
    }

    @Test
    public void test23596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23596");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((-1L));
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        org.joda.time.Duration duration12 = minutes11.toStandardDuration();
        org.joda.time.Period period13 = duration12.toPeriod();
        org.joda.time.Duration duration15 = duration12.plus((long) (byte) 0);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) duration15, periodType17, chronology18);
        org.joda.time.PeriodType periodType20 = periodType17.withDaysRemoved();
        org.joda.time.Period period21 = duration3.toPeriodTo(readableInstant4, periodType20);
        org.joda.time.PeriodType periodType22 = periodType20.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period23 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test23597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23597");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.millis((int) '#');
        int int4 = period3.getYears();
        org.joda.time.DurationFieldType[] durationFieldTypeArray5 = period3.getFieldTypes();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.forFields(durationFieldTypeArray5);
        org.joda.time.PeriodType periodType7 = periodType6.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test23598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23598");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((-10));
        org.joda.time.Hours hours2 = org.joda.time.Hours.ONE;
        java.lang.String str3 = hours2.toString();
        org.joda.time.Hours hours4 = hours1.plus(hours2);
        org.joda.time.Hours hours5 = org.joda.time.Hours.SIX;
        org.joda.time.Hours hours6 = hours5.negated();
        org.joda.time.Hours hours7 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType8 = hours7.getFieldType();
        org.joda.time.DurationFieldType durationFieldType9 = hours7.getFieldType();
        org.joda.time.Hours hours11 = hours7.dividedBy((-95));
        org.joda.time.DurationFieldType durationFieldType12 = hours7.getFieldType();
        org.joda.time.PeriodType periodType13 = hours7.getPeriodType();
        org.joda.time.Hours hours14 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours16 = hours14.dividedBy(100);
        org.joda.time.Hours hours18 = hours16.multipliedBy((int) ' ');
        boolean boolean19 = hours7.isLessThan(hours16);
        boolean boolean20 = hours6.isGreaterThan(hours16);
        org.joda.time.Hours hours22 = hours6.minus(52);
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.Hours hours24 = org.joda.time.Hours.hoursIn(readableInterval23);
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.Hours hours26 = org.joda.time.Hours.hoursIn(readableInterval25);
        org.joda.time.Hours hours28 = hours26.multipliedBy(8);
        org.joda.time.Hours hours29 = hours24.plus(hours26);
        org.joda.time.Hours hours30 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours32 = hours30.dividedBy(100);
        org.joda.time.Period period35 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period37 = period35.minusMonths(0);
        org.joda.time.Period period39 = period37.minusSeconds(0);
        org.joda.time.Period period40 = period39.normalizedStandard();
        org.joda.time.Hours hours41 = period40.toStandardHours();
        boolean boolean42 = hours32.isLessThan(hours41);
        org.joda.time.Period period44 = org.joda.time.Period.millis((int) '#');
        int int45 = period44.getYears();
        org.joda.time.Hours hours46 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Period period48 = period44.multipliedBy((int) (byte) 0);
        org.joda.time.Hours hours49 = period48.toStandardHours();
        org.joda.time.Hours hours50 = hours32.minus(hours49);
        org.joda.time.Hours hours51 = hours24.minus(hours32);
        int int52 = hours24.getHours();
        org.joda.time.Hours hours54 = hours24.dividedBy((-99));
        org.joda.time.Period period57 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period58 = period57.negated();
        int int59 = period57.getHours();
        org.joda.time.Period period61 = org.joda.time.Period.days(10);
        org.joda.time.Period period63 = period61.plusMonths((int) 'a');
        org.joda.time.Period period65 = period61.plusSeconds((int) (short) 100);
        org.joda.time.Period period67 = period65.minusMonths((int) 'a');
        org.joda.time.Period period68 = period57.withFields((org.joda.time.ReadablePeriod) period67);
        org.joda.time.Hours hours69 = period57.toStandardHours();
        org.joda.time.Hours hours71 = org.joda.time.Hours.hours(2147483647);
        org.joda.time.Hours hours72 = hours69.plus(hours71);
        org.joda.time.Hours hours73 = hours24.minus(hours71);
        boolean boolean74 = hours6.isLessThan(hours71);
        org.joda.time.Hours hours76 = hours6.multipliedBy(69);
        org.joda.time.Hours hours77 = hours6.negated();
        boolean boolean78 = hours4.isLessThan(hours6);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT1H" + "'", str3, "PT1H");
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(hours41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(hours46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(hours49);
        org.junit.Assert.assertNotNull(hours50);
        org.junit.Assert.assertNotNull(hours51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(hours54);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(hours69);
        org.junit.Assert.assertNotNull(hours71);
        org.junit.Assert.assertNotNull(hours72);
        org.junit.Assert.assertNotNull(hours73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(hours76);
        org.junit.Assert.assertNotNull(hours77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test23599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23599");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (short) 10);
        org.joda.time.Period period3 = period1.withHours((int) (byte) 10);
        int int4 = period3.size();
        org.joda.time.Period period7 = new org.joda.time.Period((long) (-35), 6000L);
        org.joda.time.Period period8 = period3.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period9 = period7.toPeriod();
        int int10 = period7.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test23600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23600");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) 0);
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
        org.joda.time.Duration duration46 = duration43.toDuration();
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
        org.joda.time.Duration duration73 = duration72.toDuration();
        org.joda.time.Duration duration74 = duration46.plus((org.joda.time.ReadableDuration) duration73);
        org.joda.time.Duration duration76 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration73, (-1));
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, readableInstant77);
        org.joda.time.Period period80 = period78.withDays((-107));
        org.joda.time.Period period82 = period80.plusMonths((-213044));
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
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
    }

    @Test
    public void test23601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23601");
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
        org.joda.time.DurationFieldType durationFieldType18 = days10.getFieldType();
        int int19 = days10.size();
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
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test23602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23602");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) '4');
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
        org.joda.time.Duration duration8 = minutes7.toStandardDuration();
        org.joda.time.Period period9 = duration8.toPeriod();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        org.joda.time.Minutes minutes18 = minutes15.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration19 = minutes15.toStandardDuration();
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Minutes minutes25 = period24.toStandardMinutes();
        org.joda.time.Duration duration26 = minutes25.toStandardDuration();
        org.joda.time.Period period27 = duration26.toPeriod();
        boolean boolean28 = duration19.isLongerThan((org.joda.time.ReadableDuration) duration26);
        boolean boolean29 = duration8.isEqual((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Duration duration31 = duration8.plus((long) (short) 100);
        boolean boolean32 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Duration duration34 = new org.joda.time.Duration((long) 100);
        int int35 = duration8.compareTo((org.joda.time.ReadableDuration) duration34);
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period40 = period38.minusMonths(0);
        org.joda.time.Minutes minutes41 = period40.toStandardMinutes();
        org.joda.time.Duration duration42 = minutes41.toStandardDuration();
        org.joda.time.Period period45 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period47 = period45.minusMonths(0);
        org.joda.time.Minutes minutes48 = period47.toStandardMinutes();
        org.joda.time.Duration duration49 = minutes48.toStandardDuration();
        boolean boolean50 = duration42.isShorterThan((org.joda.time.ReadableDuration) duration49);
        org.joda.time.Duration duration52 = duration42.plus((long) (short) 10);
        long long53 = duration52.getStandardSeconds();
        org.joda.time.Duration duration54 = duration52.toDuration();
        java.lang.String str55 = duration52.toString();
        org.joda.time.Duration duration57 = duration8.withDurationAdded((org.joda.time.ReadableDuration) duration52, 87);
        org.joda.time.Duration duration59 = duration57.plus((long) (-116));
        org.joda.time.Duration duration62 = duration57.withDurationAdded((-35791L), 268435455);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PT0.010S" + "'", str55, "PT0.010S");
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(duration62);
    }

    @Test
    public void test23603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23603");
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
        boolean boolean18 = periodFormatter13.isPrinter();
        org.joda.time.format.PeriodPrinter periodPrinter19 = periodFormatter13.getPrinter();
        java.util.Locale locale20 = null;
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter13.withLocale(locale20);
        java.util.Locale locale22 = periodFormatter21.getLocale();
        java.util.Locale locale23 = periodFormatter21.getLocale();
        org.joda.time.Period period25 = new org.joda.time.Period((long) (-1));
        org.joda.time.Days days26 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType27 = days26.getPeriodType();
        org.joda.time.PeriodType periodType28 = periodType27.withHoursRemoved();
        org.joda.time.PeriodType periodType29 = periodType27.withYearsRemoved();
        java.lang.String str30 = periodType27.toString();
        org.joda.time.Period period31 = period25.normalizedStandard(periodType27);
        org.joda.time.format.PeriodFormatter periodFormatter32 = periodFormatter21.withParseType(periodType27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period34 = periodFormatter32.parsePeriod("PT2M0.036S");
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
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(periodPrinter19);
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertNull(locale23);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PeriodType[Days]" + "'", str30, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodFormatter32);
    }

    @Test
    public void test23604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23604");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType();
        int int3 = hours0.getHours();
        org.joda.time.PeriodType periodType4 = hours0.getPeriodType();
        org.joda.time.Hours hours6 = org.joda.time.Hours.hours(2147483647);
        boolean boolean7 = hours0.isGreaterThan(hours6);
        org.joda.time.Hours hours8 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType9 = hours8.getFieldType();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period12.negated();
        int int14 = period12.getHours();
        org.joda.time.Period period16 = org.joda.time.Period.days(10);
        org.joda.time.Period period18 = period16.plusMonths((int) 'a');
        org.joda.time.Period period20 = period16.plusSeconds((int) (short) 100);
        org.joda.time.Period period22 = period20.minusMonths((int) 'a');
        org.joda.time.Period period23 = period12.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Hours hours24 = period12.toStandardHours();
        int int25 = hours24.getHours();
        org.joda.time.Hours hours26 = hours8.plus(hours24);
        org.joda.time.Hours hours28 = hours26.minus((int) (short) 0);
        boolean boolean29 = hours6.isLessThan(hours26);
        org.joda.time.Duration duration30 = hours26.toStandardDuration();
        org.joda.time.Duration duration31 = hours26.toStandardDuration();
        org.joda.time.Hours hours32 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType33 = hours32.getFieldType();
        org.joda.time.DurationFieldType durationFieldType34 = hours32.getFieldType();
        int int35 = hours32.getHours();
        org.joda.time.PeriodType periodType36 = hours32.getPeriodType();
        org.joda.time.Hours hours38 = hours32.plus((-2));
        int int39 = hours38.getHours();
        org.joda.time.Duration duration40 = hours38.toStandardDuration();
        org.joda.time.Duration duration41 = hours38.toStandardDuration();
        boolean boolean42 = hours26.isLessThan(hours38);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(hours38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483645 + "'", int39 == 2147483645);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test23605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23605");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Hours hours5 = hours3.minus((-116));
        org.joda.time.Hours hours7 = hours3.dividedBy((-5));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
    }

    @Test
    public void test23606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23606");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 126000, 24L, chronology2);
    }

    @Test
    public void test23607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23607");
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
        org.joda.time.Minutes minutes28 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration29 = minutes28.toStandardDuration();
        long long30 = duration29.getStandardSeconds();
        org.joda.time.Period period33 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period33.minusMonths(0);
        org.joda.time.Minutes minutes36 = period35.toStandardMinutes();
        org.joda.time.Duration duration37 = minutes36.toStandardDuration();
        org.joda.time.Minutes minutes39 = minutes36.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration40 = minutes36.toStandardDuration();
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period45 = period43.minusMonths(0);
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.Duration duration47 = minutes46.toStandardDuration();
        org.joda.time.Period period48 = duration47.toPeriod();
        boolean boolean49 = duration40.isLongerThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.days();
        org.joda.time.Period period52 = duration40.toPeriodTo(readableInstant50, periodType51);
        org.joda.time.Duration duration53 = duration29.plus((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Period period56 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period58 = period56.minusMonths(0);
        org.joda.time.Minutes minutes59 = period58.toStandardMinutes();
        org.joda.time.Duration duration60 = minutes59.toStandardDuration();
        org.joda.time.Period period63 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period65 = period63.minusMonths(0);
        org.joda.time.Minutes minutes66 = period65.toStandardMinutes();
        org.joda.time.Duration duration67 = minutes66.toStandardDuration();
        boolean boolean68 = duration60.isShorterThan((org.joda.time.ReadableDuration) duration67);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration67, readableInstant69);
        long long71 = duration67.getStandardHours();
        org.joda.time.Duration duration72 = duration40.minus((org.joda.time.ReadableDuration) duration67);
        org.joda.time.Duration duration74 = org.joda.time.Duration.standardSeconds((long) 0);
        java.lang.String str75 = duration74.toString();
        org.joda.time.Duration duration77 = duration74.minus((long) 10);
        org.joda.time.Duration duration79 = duration72.withDurationAdded((org.joda.time.ReadableDuration) duration74, (int) 'a');
        boolean boolean80 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Duration duration82 = duration17.plus(0L);
        long long83 = duration17.getStandardSeconds();
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
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-128849018880L) + "'", long30 == (-128849018880L));
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(minutes66);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "PT0S" + "'", str75, "PT0S");
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
    }

    @Test
    public void test23608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23608");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(2147483647);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test23609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23609");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Period period4 = period1.plusMinutes(1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period1.toDurationTo(readableInstant5);
        org.joda.time.Seconds seconds7 = period1.toStandardSeconds();
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds10 = seconds8.plus(seconds9);
        java.lang.String str11 = seconds8.toString();
        org.joda.time.DurationFieldType durationFieldType12 = seconds8.getFieldType();
        org.joda.time.Seconds seconds14 = seconds8.multipliedBy(0);
        org.joda.time.Seconds seconds16 = seconds8.dividedBy((-1));
        org.joda.time.Seconds seconds17 = seconds7.plus(seconds16);
        org.joda.time.Seconds seconds18 = seconds7.negated();
        org.joda.time.PeriodType periodType19 = seconds18.getPeriodType();
        org.joda.time.PeriodType periodType20 = periodType19.withSecondsRemoved();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT2S" + "'", str11, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test23610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23610");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) 14400);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardHours((long) ' ');
        org.joda.time.Duration duration5 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration3, 999);
        org.joda.time.Duration duration6 = duration1.toDuration();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test23611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23611");
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
        org.joda.time.DurationFieldType durationFieldType13 = days4.getFieldType();
        org.joda.time.Days days15 = days4.dividedBy(400);
        int int16 = days15.getDays();
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
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test23612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23612");
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Period period17 = period13.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType18 = period13.getPeriodType();
        org.joda.time.PeriodType periodType19 = periodType18.withMinutesRemoved();
        org.joda.time.PeriodType periodType20 = periodType19.withHoursRemoved();
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (-1), periodType19, chronology22);
        org.joda.time.Period period24 = new org.joda.time.Period((int) '#', (int) (short) 10, 14400, 2, (int) (short) 1, 0, (int) (short) 1, (int) ' ', periodType19);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.years();
        java.lang.String str26 = durationFieldType25.getName();
        java.lang.String str27 = durationFieldType25.getName();
        int int28 = period24.get(durationFieldType25);
        org.joda.time.Period period29 = period24.negated();
        org.joda.time.Period period31 = period24.withMillis(65);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "years" + "'", str26, "years");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "years" + "'", str27, "years");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
    }

    @Test
    public void test23613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23613");
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
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration19, readableInstant21);
        long long23 = duration19.getMillis();
        org.joda.time.ReadableInstant readableInstant24 = null;
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
        org.joda.time.Period period42 = duration31.toPeriod();
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period48 = period46.minusMonths(0);
        org.joda.time.Minutes minutes49 = period48.toStandardMinutes();
        org.joda.time.Duration duration50 = minutes49.toStandardDuration();
        org.joda.time.Period period51 = duration50.toPeriod();
        org.joda.time.Duration duration53 = duration50.plus((long) (byte) 0);
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant43, (org.joda.time.ReadableDuration) duration53);
        org.joda.time.Period period55 = duration53.toPeriod();
        org.joda.time.PeriodType periodType56 = org.joda.time.PeriodType.days();
        org.joda.time.Period period57 = duration53.toPeriod(periodType56);
        boolean boolean58 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration53);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period66 = period64.minusMonths(0);
        org.joda.time.Period period68 = period64.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType69 = period64.getPeriodType();
        org.joda.time.PeriodType periodType70 = periodType69.withMinutesRemoved();
        org.joda.time.PeriodType periodType71 = periodType70.withHoursRemoved();
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant60, readableInstant61, periodType70);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration53, readableInstant59, periodType70);
        org.joda.time.PeriodType periodType74 = periodType70.withDaysRemoved();
        org.joda.time.Period period75 = duration19.toPeriodTo(readableInstant24, periodType74);
        org.joda.time.Period period77 = period75.withWeeks((-683));
        org.joda.time.Period period78 = period77.toPeriod();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 11L + "'", long23 == 11L);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period78);
    }

    @Test
    public void test23614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23614");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) (byte) 100);
        org.joda.time.Minutes minutes3 = minutes1.multipliedBy((-2));
        org.joda.time.MutablePeriod mutablePeriod4 = minutes3.toMutablePeriod();
        org.joda.time.Minutes minutes5 = minutes3.negated();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) minutes3, chronology6);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(minutes5);
    }

    @Test
    public void test23615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23615");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((-3600000L));
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
        org.joda.time.Duration duration8 = minutes7.toStandardDuration();
        org.joda.time.Period period9 = duration8.toPeriod();
        org.joda.time.Duration duration11 = duration8.plus((long) (byte) 0);
        org.joda.time.Period period12 = duration8.toPeriod();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Duration duration20 = minutes19.toStandardDuration();
        org.joda.time.Period period21 = duration20.toPeriod();
        org.joda.time.Duration duration23 = duration20.plus((long) (byte) 0);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) duration23, periodType25, chronology26);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period32 = period30.minusMonths(0);
        org.joda.time.Minutes minutes33 = period32.toStandardMinutes();
        org.joda.time.Duration duration34 = minutes33.toStandardDuration();
        org.joda.time.Minutes minutes36 = minutes33.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration37 = minutes33.toStandardDuration();
        org.joda.time.Period period40 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period42 = period40.minusMonths(0);
        org.joda.time.Minutes minutes43 = period42.toStandardMinutes();
        org.joda.time.Duration duration44 = minutes43.toStandardDuration();
        org.joda.time.Period period45 = duration44.toPeriod();
        boolean boolean46 = duration37.isLongerThan((org.joda.time.ReadableDuration) duration44);
        boolean boolean47 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration44);
        org.joda.time.Duration duration48 = duration8.minus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.Duration duration50 = org.joda.time.Duration.standardSeconds((long) 10);
        org.joda.time.Period period53 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period55 = period53.minusMonths(0);
        org.joda.time.Minutes minutes56 = period55.toStandardMinutes();
        org.joda.time.Duration duration57 = minutes56.toStandardDuration();
        org.joda.time.Minutes minutes59 = minutes56.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration60 = minutes56.toStandardDuration();
        org.joda.time.Period period63 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period65 = period63.minusMonths(0);
        org.joda.time.Minutes minutes66 = period65.toStandardMinutes();
        org.joda.time.Duration duration67 = minutes66.toStandardDuration();
        org.joda.time.Period period68 = duration67.toPeriod();
        boolean boolean69 = duration60.isLongerThan((org.joda.time.ReadableDuration) duration67);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Interval interval71 = duration67.toIntervalTo(readableInstant70);
        boolean boolean72 = duration50.isLongerThan((org.joda.time.ReadableDuration) duration67);
        boolean boolean73 = duration48.isLongerThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.Duration duration75 = duration50.plus((long) (short) 100);
        boolean boolean76 = duration1.isEqual((org.joda.time.ReadableDuration) duration50);
        org.joda.time.Period period77 = duration50.toPeriod();
        org.joda.time.Period period79 = org.joda.time.Period.millis((int) '#');
        int int80 = period79.getYears();
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        org.joda.time.Period period82 = period79.withFields(readablePeriod81);
        org.joda.time.ReadableInstant readableInstant83 = null;
        org.joda.time.Duration duration84 = period79.toDurationTo(readableInstant83);
        org.joda.time.Duration duration85 = duration50.minus((org.joda.time.ReadableDuration) duration84);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(minutes66);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(duration84);
        org.junit.Assert.assertNotNull(duration85);
    }

    @Test
    public void test23616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23616");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        java.lang.String str9 = days8.toString();
        org.joda.time.Days days10 = org.joda.time.Days.ONE;
        boolean boolean11 = days8.isLessThan(days10);
        org.joda.time.Days days12 = days8.negated();
        java.lang.String str13 = days12.toString();
        org.joda.time.Days days14 = days12.negated();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0D" + "'", str9, "P0D");
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P0D" + "'", str13, "P0D");
        org.junit.Assert.assertNotNull(days14);
    }

    @Test
    public void test23617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23617");
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
        org.joda.time.PeriodType periodType34 = periodFormatter2.getParseType();
        org.joda.time.ReadWritablePeriod readWritablePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int38 = periodFormatter2.parseInto(readWritablePeriod35, "PT431999.999S", 395);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(periodType34);
    }

    @Test
    public void test23618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23618");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.withMillis(7);
        org.joda.time.Period period5 = period1.plusSeconds((int) '4');
        org.joda.time.Period period6 = period1.negated();
        org.joda.time.Duration duration9 = new org.joda.time.Duration((long) (byte) 1, (long) (-1));
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Minutes minutes22 = period21.toStandardMinutes();
        org.joda.time.Duration duration23 = minutes22.toStandardDuration();
        boolean boolean24 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Duration duration26 = duration16.plus((long) (short) 10);
        org.joda.time.Period period27 = duration16.toPeriod();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period33 = period31.minusMonths(0);
        org.joda.time.Minutes minutes34 = period33.toStandardMinutes();
        org.joda.time.Duration duration35 = minutes34.toStandardDuration();
        org.joda.time.Period period36 = duration35.toPeriod();
        org.joda.time.Duration duration38 = duration35.plus((long) (byte) 0);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration38);
        org.joda.time.Period period40 = duration38.toPeriod();
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.days();
        org.joda.time.Period period42 = duration38.toPeriod(periodType41);
        boolean boolean43 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period51 = period49.minusMonths(0);
        org.joda.time.Period period53 = period49.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType54 = period49.getPeriodType();
        org.joda.time.PeriodType periodType55 = periodType54.withMinutesRemoved();
        org.joda.time.PeriodType periodType56 = periodType55.withHoursRemoved();
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant45, readableInstant46, periodType55);
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration38, readableInstant44, periodType55);
        org.joda.time.PeriodType periodType59 = periodType55.withMonthsRemoved();
        org.joda.time.PeriodType periodType60 = periodType55.withMillisRemoved();
        org.joda.time.PeriodType periodType61 = periodType55.withYearsRemoved();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period((java.lang.Object) duration9, periodType55, chronology62);
        org.joda.time.Period period64 = period6.minus((org.joda.time.ReadablePeriod) period63);
        org.joda.time.Period period66 = period63.plusWeeks(101);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
    }

    @Test
    public void test23619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23619");
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
        long long26 = duration17.getStandardSeconds();
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Interval interval28 = duration17.toIntervalTo(readableInstant27);
        org.joda.time.Minutes minutes29 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval28);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(minutes29);
    }

    @Test
    public void test23620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23620");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.Weeks weeks3 = weeks1.plus((-97));
        org.joda.time.Weeks weeks5 = weeks3.minus(5);
        org.joda.time.Duration duration6 = weeks3.toStandardDuration();
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks9 = weeks8.negated();
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn(readableInterval11);
        boolean boolean13 = weeks10.isLessThan(weeks12);
        boolean boolean14 = weeks9.isGreaterThan(weeks12);
        org.joda.time.Weeks weeks16 = weeks9.plus((int) (short) 0);
        boolean boolean17 = weeks3.isGreaterThan(weeks9);
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeks(1);
        boolean boolean21 = weeks18.isGreaterThan(weeks20);
        java.lang.Object obj22 = null;
        boolean boolean23 = weeks20.equals(obj22);
        org.joda.time.Weeks weeks25 = weeks20.minus(0);
        int int26 = weeks25.getWeeks();
        org.joda.time.Weeks weeks28 = weeks25.dividedBy(268435465);
        org.joda.time.Weeks weeks30 = weeks25.dividedBy((-14400));
        org.joda.time.Weeks weeks32 = weeks30.multipliedBy(100);
        org.joda.time.Weeks weeks33 = weeks32.negated();
        org.joda.time.Weeks weeks34 = null;
        boolean boolean35 = weeks32.isGreaterThan(weeks34);
        org.joda.time.MutablePeriod mutablePeriod36 = weeks32.toMutablePeriod();
        boolean boolean37 = weeks9.isGreaterThan(weeks32);
        org.joda.time.Weeks weeks39 = weeks32.dividedBy((-100));
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(mutablePeriod36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(weeks39);
    }

    @Test
    public void test23621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23621");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(432000000L);
        org.joda.time.Minutes minutes2 = duration1.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType3 = minutes2.getFieldType();
        java.lang.String str4 = durationFieldType3.toString();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "minutes" + "'", str4, "minutes");
    }

    @Test
    public void test23622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23622");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Period period8 = period6.withYears((int) (short) 100);
        org.joda.time.Hours hours9 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Hours hours11 = hours9.multipliedBy(2);
        org.joda.time.MutablePeriod mutablePeriod12 = hours11.toMutablePeriod();
        org.joda.time.Hours hours14 = hours11.minus((-2147483646));
        org.joda.time.DurationFieldType durationFieldType15 = hours11.getFieldType();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(durationFieldType15);
    }

    @Test
    public void test23623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23623");
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
        org.joda.time.Weeks weeks25 = weeks23.minus((int) (byte) 100);
        org.joda.time.PeriodType periodType26 = weeks23.getPeriodType();
        org.joda.time.base.BaseSingleFieldPeriod baseSingleFieldPeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = weeks23.compareTo(baseSingleFieldPeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(periodType26);
    }

    @Test
    public void test23624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23624");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 102);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test23625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23625");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (short) 10, chronology11);
        org.joda.time.PeriodType periodType13 = period12.getPeriodType();
        org.joda.time.PeriodType periodType14 = periodType13.withMonthsRemoved();
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType13);
        org.joda.time.Period period16 = new org.joda.time.Period((-1491308), (-2147483640), 97, (-2697), (int) (short) 10, (-14392), (-39), (-2147483648), periodType13);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.days();
        java.lang.String str18 = durationFieldType17.toString();
        int int19 = periodType13.indexOf(durationFieldType17);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "days" + "'", str18, "days");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test23626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23626");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = seconds6.plus(seconds7);
        org.joda.time.PeriodType periodType9 = seconds6.getPeriodType();
        org.joda.time.Period period10 = new org.joda.time.Period((long) 'a', periodType9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((-2147483648L), periodType9, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (-2147483646), 52000L, periodType9, chronology13);
        org.joda.time.PeriodType periodType15 = periodType9.withYearsRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withMonthsRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType16);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test23627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23627");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) 0);
        java.lang.String str2 = duration1.toString();
        org.joda.time.Duration duration4 = duration1.minus((long) 10);
        java.lang.String str5 = duration1.toString();
        org.joda.time.Seconds seconds6 = duration1.toStandardSeconds();
        org.joda.time.Seconds seconds8 = seconds6.dividedBy((-5));
        org.joda.time.Seconds seconds9 = null;
        boolean boolean10 = seconds8.isGreaterThan(seconds9);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0S" + "'", str5, "PT0S");
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test23628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23628");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-1));
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration6 = duration4.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant7);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Days days12 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType13 = days12.getPeriodType();
        org.joda.time.PeriodType periodType14 = periodType13.withHoursRemoved();
        org.joda.time.PeriodType periodType15 = periodType13.withSecondsRemoved();
        org.joda.time.Period period16 = duration10.toPeriodFrom(readableInstant11, periodType13);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.minutes();
        boolean boolean18 = periodType13.equals((java.lang.Object) durationFieldType17);
        java.lang.String str19 = durationFieldType17.getName();
        org.joda.time.Period period21 = period8.withFieldAdded(durationFieldType17, 8);
        boolean boolean22 = period1.isSupported(durationFieldType17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration23 = new org.joda.time.Duration((java.lang.Object) period1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "minutes" + "'", str19, "minutes");
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test23629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23629");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalFrom(readableInstant7);
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Period period10 = weeks9.toPeriod();
        org.joda.time.Weeks weeks12 = weeks9.multipliedBy((-36));
        org.joda.time.Weeks weeks14 = weeks12.dividedBy((-10));
        org.joda.time.Period period16 = org.joda.time.Period.years(4);
        org.joda.time.Period period18 = period16.multipliedBy((-14400));
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.weeksIn(readableInterval20);
        boolean boolean22 = weeks19.isLessThan(weeks21);
        org.joda.time.Weeks weeks24 = weeks21.multipliedBy((int) (short) 100);
        org.joda.time.PeriodType periodType25 = weeks21.getPeriodType();
        org.joda.time.Period period26 = period18.withFields((org.joda.time.ReadablePeriod) weeks21);
        org.joda.time.Weeks weeks27 = weeks14.plus(weeks21);
        int int28 = weeks21.getWeeks();
        org.joda.time.Weeks weeks30 = weeks21.plus((-4));
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(weeks30);
    }

    @Test
    public void test23630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23630");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
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
        java.lang.String str40 = duration17.toString();
        boolean boolean41 = duration0.isLongerThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration0, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration0, readableInstant44, periodType45);
        org.joda.time.Duration duration48 = duration0.plus(2L);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Interval interval50 = duration48.toIntervalTo(readableInstant49);
        org.junit.Assert.assertNotNull(duration0);
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT0.010S" + "'", str40, "PT0.010S");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(interval50);
    }

    @Test
    public void test23631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23631");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
        org.joda.time.Duration duration8 = minutes7.toStandardDuration();
        org.joda.time.Period period9 = duration8.toPeriod();
        org.joda.time.Duration duration11 = duration8.plus((long) (byte) 0);
        org.joda.time.Duration duration13 = duration8.withMillis((long) 1);
        org.joda.time.Period period14 = duration13.toPeriod();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Duration duration22 = minutes21.toStandardDuration();
        org.joda.time.Period period23 = duration22.toPeriod();
        org.joda.time.Duration duration25 = duration22.plus((long) (byte) 0);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant15, (org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration27 = duration13.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration28 = duration13.toDuration();
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration13);
        java.lang.String str30 = duration13.toString();
        org.joda.time.Duration duration32 = duration13.minus((long) (-5));
        org.joda.time.Duration duration33 = org.joda.time.Duration.ZERO;
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period38 = period36.minusMonths(0);
        org.joda.time.Minutes minutes39 = period38.toStandardMinutes();
        org.joda.time.Duration duration40 = minutes39.toStandardDuration();
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period45 = period43.minusMonths(0);
        org.joda.time.Minutes minutes46 = period45.toStandardMinutes();
        org.joda.time.Duration duration47 = minutes46.toStandardDuration();
        boolean boolean48 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.Duration duration50 = duration40.plus((long) (short) 10);
        org.joda.time.Period period53 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period55 = period53.minusMonths(0);
        int int56 = period55.getYears();
        org.joda.time.Period period58 = period55.plusYears((int) ' ');
        boolean boolean59 = duration50.equals((java.lang.Object) period58);
        org.joda.time.Period period62 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period64 = period62.minusMonths(0);
        org.joda.time.Minutes minutes65 = period64.toStandardMinutes();
        org.joda.time.Duration duration66 = minutes65.toStandardDuration();
        org.joda.time.Period period67 = duration66.toPeriod();
        org.joda.time.Duration duration69 = duration66.plus((long) (byte) 0);
        org.joda.time.Duration duration71 = duration66.withMillis((long) 1);
        boolean boolean72 = duration50.isShorterThan((org.joda.time.ReadableDuration) duration66);
        java.lang.String str73 = duration50.toString();
        boolean boolean74 = duration33.isLongerThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration33, readableInstant75);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration33, readableInstant77, periodType78);
        org.joda.time.Duration duration80 = duration13.minus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Period period81 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration33);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT0.001S" + "'", str30, "PT0.001S");
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(minutes65);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "PT0.010S" + "'", str73, "PT0.010S");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(duration80);
    }

    @Test
    public void test23632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23632");
        org.joda.time.Days days1 = org.joda.time.Days.days(1);
        org.joda.time.Duration duration2 = days1.toStandardDuration();
        org.joda.time.Days days3 = duration2.toStandardDays();
        org.joda.time.Days days4 = org.joda.time.Days.ONE;
        org.joda.time.Days days5 = org.joda.time.Days.ONE;
        int int6 = days4.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days5);
        org.joda.time.Days days8 = days4.multipliedBy(8);
        boolean boolean9 = days3.isGreaterThan(days8);
        org.joda.time.Period period11 = org.joda.time.Period.millis(0);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Days days14 = days12.plus((int) ' ');
        boolean boolean15 = days3.isLessThan(days12);
        org.joda.time.Days days17 = days3.plus((-2122032));
        org.joda.time.Days days19 = days17.multipliedBy(94);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
    }

    @Test
    public void test23633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23633");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P-1889420D");
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test23634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23634");
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
        org.joda.time.Seconds seconds31 = seconds11.multipliedBy((-118));
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableDuration33);
        org.joda.time.Days days35 = period34.toStandardDays();
        org.joda.time.Days days37 = days35.minus(7);
        org.joda.time.Days days39 = org.joda.time.Days.days(1);
        org.joda.time.Days days41 = org.joda.time.Days.days((int) (short) 100);
        boolean boolean42 = days39.isLessThan(days41);
        org.joda.time.Days days43 = days35.plus(days41);
        org.joda.time.Days days44 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType45 = days44.getPeriodType();
        org.joda.time.Days days46 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType47 = days46.getPeriodType();
        org.joda.time.Days days49 = days46.minus(0);
        org.joda.time.Days days50 = days49.negated();
        boolean boolean51 = days44.isGreaterThan(days49);
        org.joda.time.Days days53 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days55 = days53.multipliedBy((int) (short) 100);
        org.joda.time.Days days56 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType57 = days56.getPeriodType();
        org.joda.time.Days days59 = days56.minus(0);
        org.joda.time.Days days60 = days53.minus(days59);
        org.joda.time.Days days61 = days49.minus(days53);
        org.joda.time.Days days62 = days35.plus(days61);
        org.joda.time.PeriodType periodType63 = days35.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            int int64 = seconds31.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Seconds cannot be compared to class org.joda.time.Days");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(days46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(days50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(days53);
        org.junit.Assert.assertNotNull(days55);
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(days59);
        org.junit.Assert.assertNotNull(days60);
        org.junit.Assert.assertNotNull(days61);
        org.junit.Assert.assertNotNull(days62);
        org.junit.Assert.assertNotNull(periodType63);
    }

    @Test
    public void test23635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23635");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (short) 10);
        org.joda.time.Period period3 = period1.withHours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType5 = period3.getFieldType(3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.centuries();
        int int7 = period3.get(durationFieldType6);
        java.lang.String str8 = durationFieldType6.toString();
        java.lang.String str9 = durationFieldType6.getName();
        org.joda.time.Chronology chronology10 = null;
        boolean boolean11 = durationFieldType6.isSupported(chronology10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuries" + "'", str8, "centuries");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "centuries" + "'", str9, "centuries");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test23636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23636");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.MutablePeriod mutablePeriod5 = period2.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod6 = period2.toMutablePeriod();
        org.joda.time.Period period7 = period2.negated();
        java.lang.String str8 = period7.toString();
        org.joda.time.Minutes minutes9 = period7.toStandardMinutes();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period7.toDurationFrom(readableInstant10);
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        long long14 = duration13.getStandardSeconds();
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period19 = period17.minusMonths(0);
        org.joda.time.Minutes minutes20 = period19.toStandardMinutes();
        org.joda.time.Duration duration21 = minutes20.toStandardDuration();
        org.joda.time.Minutes minutes23 = minutes20.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration24 = minutes20.toStandardDuration();
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period29 = period27.minusMonths(0);
        org.joda.time.Minutes minutes30 = period29.toStandardMinutes();
        org.joda.time.Duration duration31 = minutes30.toStandardDuration();
        org.joda.time.Period period32 = duration31.toPeriod();
        boolean boolean33 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.days();
        org.joda.time.Period period36 = duration24.toPeriodTo(readableInstant34, periodType35);
        org.joda.time.Duration duration37 = duration13.plus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Period period40 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period42 = period40.minusMonths(0);
        org.joda.time.Minutes minutes43 = period42.toStandardMinutes();
        org.joda.time.Duration duration44 = minutes43.toStandardDuration();
        org.joda.time.Period period47 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period49 = period47.minusMonths(0);
        org.joda.time.Minutes minutes50 = period49.toStandardMinutes();
        org.joda.time.Duration duration51 = minutes50.toStandardDuration();
        boolean boolean52 = duration44.isShorterThan((org.joda.time.ReadableDuration) duration51);
        boolean boolean53 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration44);
        org.joda.time.Duration duration55 = org.joda.time.Duration.standardHours(353203200L);
        org.joda.time.Duration duration57 = duration44.withDurationAdded((org.joda.time.ReadableDuration) duration55, 168);
        boolean boolean58 = duration11.isLongerThan((org.joda.time.ReadableDuration) duration55);
        java.lang.String str59 = duration55.toString();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT0.036S" + "'", str8, "PT0.036S");
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-128849018880L) + "'", long14 == (-128849018880L));
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "PT1271531520000S" + "'", str59, "PT1271531520000S");
    }

    @Test
    public void test23637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23637");
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
        org.joda.time.PeriodType periodType14 = periodType11.withHoursRemoved();
        org.joda.time.PeriodType periodType15 = periodType11.withDaysRemoved();
        org.joda.time.PeriodType periodType16 = periodType11.withYearsRemoved();
        int int17 = periodType16.size();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test23638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23638");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        org.joda.time.Period period10 = duration9.toPeriod();
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
        boolean boolean30 = duration9.isEqual((org.joda.time.ReadableDuration) duration20);
        long long31 = duration9.getStandardMinutes();
        java.lang.String str32 = duration9.toString();
        boolean boolean33 = duration2.isEqual((org.joda.time.ReadableDuration) duration9);
        java.lang.String str34 = duration9.toString();
        org.joda.time.Duration duration36 = duration9.minus(99900L);
        org.joda.time.Period period37 = duration36.toPeriod();
        org.joda.time.Period period39 = period37.minusHours(306783378);
        org.joda.time.Period period41 = period37.withMinutes((-89));
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period10);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT0S" + "'", str32, "PT0S");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT0S" + "'", str34, "PT0S");
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
    }

    @Test
    public void test23639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23639");
        org.joda.time.Period period1 = org.joda.time.Period.days(8);
        org.joda.time.format.PeriodPrinter periodPrinter3 = null;
        org.joda.time.format.PeriodParser periodParser4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = new org.joda.time.format.PeriodFormatter(periodPrinter3, periodParser4);
        boolean boolean6 = periodFormatter5.isParser();
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds10 = seconds8.plus(seconds9);
        org.joda.time.PeriodType periodType11 = seconds8.getPeriodType();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period14.negated();
        org.joda.time.DurationFieldType durationFieldType17 = period14.getFieldType((int) (short) 1);
        int int18 = periodType11.indexOf(durationFieldType17);
        org.joda.time.Period period19 = new org.joda.time.Period((long) ' ', periodType11);
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter5.withParseType(periodType11);
        org.joda.time.PeriodType periodType21 = periodType11.withDaysRemoved();
        org.joda.time.Period period22 = new org.joda.time.Period(10L, periodType11);
        org.joda.time.PeriodType periodType23 = periodType11.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = period1.withPeriodType(periodType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test23640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23640");
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
        org.joda.time.Minutes minutes25 = minutes20.plus(59);
        org.joda.time.PeriodType periodType26 = minutes20.getPeriodType();
        org.joda.time.Minutes minutes28 = minutes20.minus((-8));
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
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(minutes28);
    }

    @Test
    public void test23641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23641");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.Period period7 = period2.plusMillis(2147483645);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period2.toDurationFrom(readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType12 = periodType11.withMillisRemoved();
        org.joda.time.PeriodType periodType13 = periodType12.withWeeksRemoved();
        org.joda.time.Period period14 = duration9.toPeriodFrom(readableInstant10, periodType13);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test23642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23642");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.secondsIn(readableInterval0);
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = seconds4.plus(seconds5);
        org.joda.time.Seconds seconds8 = seconds4.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds9 = seconds3.plus(seconds4);
        org.joda.time.Seconds seconds11 = seconds3.plus((int) '4');
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds14 = seconds12.multipliedBy(10);
        org.joda.time.Duration duration15 = seconds12.toStandardDuration();
        org.joda.time.Seconds seconds17 = seconds12.minus(3);
        org.joda.time.Seconds seconds18 = seconds3.plus(seconds12);
        org.joda.time.Seconds seconds19 = seconds1.minus(seconds12);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
    }

    @Test
    public void test23643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23643");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        org.joda.time.Period period7 = period3.plusWeeks((int) (short) 10);
        org.joda.time.Period period9 = period7.plusDays((int) (short) 1);
        org.joda.time.Period period10 = period7.toPeriod();
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Period period17 = period14.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod18 = period17.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period17.toDurationFrom(readableInstant19);
        org.joda.time.Period period22 = period17.minusDays((-36));
        org.joda.time.Period period24 = period17.minusMonths((int) 'a');
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.centuries();
        int int26 = period17.indexOf(durationFieldType25);
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period31 = period29.minusMonths(0);
        org.joda.time.Minutes minutes32 = period31.toStandardMinutes();
        org.joda.time.Duration duration33 = minutes32.toStandardDuration();
        org.joda.time.Minutes minutes35 = minutes32.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes37 = org.joda.time.Minutes.parseMinutes("PT0H");
        org.joda.time.Minutes minutes38 = minutes32.minus(minutes37);
        org.joda.time.DurationFieldType durationFieldType39 = minutes37.getFieldType();
        int int40 = period17.indexOf(durationFieldType39);
        org.joda.time.Period period42 = period10.withField(durationFieldType39, (-2147483645));
        org.joda.time.Period period44 = period10.plusHours((-102));
        org.joda.time.Period period45 = period10.normalizedStandard();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period45);
    }

    @Test
    public void test23644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23644");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean4 = days2.isSupported(durationFieldType3);
        boolean boolean5 = days0.isGreaterThan(days2);
        org.joda.time.Days days7 = org.joda.time.Days.parseDays("P0W");
        org.joda.time.Days days8 = days2.plus(days7);
        int int9 = days8.getDays();
        java.lang.String str10 = days8.toString();
        org.joda.time.Days days11 = org.joda.time.Days.ONE;
        org.joda.time.Days days12 = org.joda.time.Days.ONE;
        int int13 = days11.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days12);
        org.joda.time.Days days15 = days12.multipliedBy((int) '#');
        org.joda.time.Days days16 = org.joda.time.Days.SIX;
        org.joda.time.Days days17 = days15.minus(days16);
        org.joda.time.Days days18 = org.joda.time.Days.FIVE;
        java.lang.String str19 = days18.toString();
        org.joda.time.Days days21 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days22 = days18.minus(days21);
        int int23 = days18.getDays();
        org.joda.time.Days days24 = days15.plus(days18);
        org.joda.time.Days days25 = days18.negated();
        org.joda.time.Days days26 = days18.negated();
        boolean boolean27 = days8.isGreaterThan(days18);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P1D" + "'", str10, "P1D");
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P5D" + "'", str19, "P5D");
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test23645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23645");
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
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.weeks((-10));
        org.joda.time.Hours hours22 = weeks21.toStandardHours();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = periodFormatter19.print((org.joda.time.ReadablePeriod) hours22);
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
        org.junit.Assert.assertNull(periodParser15);
        org.junit.Assert.assertNotNull(periodFormatter17);
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(hours22);
    }

    @Test
    public void test23646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23646");
        org.joda.time.Period period1 = org.joda.time.Period.months(200);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test23647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23647");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (byte) 1);
        long long2 = duration1.getStandardDays();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Interval interval4 = duration1.toIntervalTo(readableInstant3);
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(weeks5);
    }

    @Test
    public void test23648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23648");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) 14400);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period4.negated();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationTo(readableInstant6);
        boolean boolean8 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration7);
        org.joda.time.Duration duration9 = duration7.toDuration();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Days days14 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType15 = days14.getPeriodType();
        org.joda.time.PeriodType periodType16 = periodType15.withHoursRemoved();
        org.joda.time.PeriodType periodType17 = periodType15.withSecondsRemoved();
        org.joda.time.Period period18 = duration12.toPeriodFrom(readableInstant13, periodType15);
        long long19 = duration12.getMillis();
        org.joda.time.Days days22 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType23 = days22.getPeriodType();
        org.joda.time.PeriodType periodType24 = periodType23.withHoursRemoved();
        org.joda.time.PeriodType periodType25 = periodType23.withSecondsRemoved();
        org.joda.time.PeriodType periodType26 = periodType23.withMinutesRemoved();
        org.joda.time.PeriodType periodType27 = periodType26.withWeeksRemoved();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(10L, (long) (byte) -1, periodType27, chronology28);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration12, periodType27);
        org.joda.time.Duration duration31 = duration12.toDuration();
        org.joda.time.Duration duration32 = duration12.toDuration();
        org.joda.time.Duration duration35 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration37 = duration35.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration37, readableInstant38);
        org.joda.time.Duration duration41 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration44 = duration41.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Duration duration46 = duration37.withDurationAdded((org.joda.time.ReadableDuration) duration44, (int) (byte) 0);
        boolean boolean47 = duration12.isEqual((org.joda.time.ReadableDuration) duration37);
        boolean boolean48 = duration7.isEqual((org.joda.time.ReadableDuration) duration12);
        long long49 = duration12.getStandardMinutes();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100000L + "'", long19 == 100000L);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
    }

    @Test
    public void test23649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23649");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType7 = period2.getPeriodType();
        org.joda.time.Hours hours8 = period2.toStandardHours();
        org.joda.time.Period period10 = org.joda.time.Period.millis((int) '#');
        int int11 = period10.getYears();
        org.joda.time.Hours hours12 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period10);
        boolean boolean13 = hours8.isLessThan(hours12);
        org.joda.time.Hours hours14 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours16 = hours14.multipliedBy((int) 'a');
        org.joda.time.Hours hours18 = hours16.minus((int) (short) 10);
        int int19 = hours18.getHours();
        org.joda.time.Hours hours21 = hours18.minus(10);
        org.joda.time.Hours hours23 = hours21.dividedBy(2147483645);
        org.joda.time.Hours hours24 = hours12.minus(hours23);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 87 + "'", int19 == 87);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours24);
    }

    @Test
    public void test23650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23650");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.PeriodType periodType3 = seconds0.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType4 = seconds0.getFieldType();
        org.joda.time.PeriodType periodType5 = seconds0.getPeriodType();
        org.joda.time.Seconds seconds7 = seconds0.dividedBy((-97));
        org.joda.time.Seconds seconds8 = seconds0.negated();
        org.joda.time.Seconds seconds10 = seconds8.plus(87);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = seconds10.getValue(268435470);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 268435470");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds10);
    }

    @Test
    public void test23651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23651");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        int int5 = period2.getMonths();
        org.joda.time.Period period7 = period2.withMonths(2147483647);
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeksIn(readableInterval9);
        boolean boolean11 = weeks8.isLessThan(weeks10);
        org.joda.time.Weeks weeks13 = weeks10.multipliedBy((int) (short) 100);
        org.joda.time.Period period14 = period2.withFields((org.joda.time.ReadablePeriod) weeks13);
        org.joda.time.MutablePeriod mutablePeriod15 = weeks13.toMutablePeriod();
        org.joda.time.Weeks weeks17 = weeks13.minus(100);
        org.joda.time.Weeks weeks19 = weeks13.plus((int) (short) 10);
        org.joda.time.Duration duration20 = weeks19.toStandardDuration();
        java.lang.String str21 = weeks19.toString();
        java.lang.String str22 = weeks19.toString();
        org.joda.time.Weeks weeks24 = weeks19.minus(104);
        org.joda.time.PeriodType periodType25 = weeks24.getPeriodType();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "P10W" + "'", str21, "P10W");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "P10W" + "'", str22, "P10W");
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test23652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23652");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.Period period8 = period6.minusWeeks(10);
        org.joda.time.Hours hours9 = org.joda.time.Hours.ZERO;
        org.joda.time.Duration duration10 = hours9.toStandardDuration();
        org.joda.time.Period period11 = period8.minus((org.joda.time.ReadablePeriod) hours9);
        org.joda.time.Hours hours12 = org.joda.time.Hours.FIVE;
        org.joda.time.MutablePeriod mutablePeriod13 = hours12.toMutablePeriod();
        org.joda.time.Hours hours14 = hours9.plus(hours12);
        org.joda.time.Hours hours16 = hours9.minus((-8));
        org.joda.time.Hours hours18 = hours9.minus((-5));
        int int19 = hours18.getHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test23653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23653");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(0L, chronology1);
        org.joda.time.Period period4 = period2.minusDays((int) (byte) 1);
        org.joda.time.Period period6 = period4.plusDays((-2147483646));
        org.joda.time.Period period8 = period4.minusMonths((-6));
        int int9 = period8.size();
        org.joda.time.Period period12 = new org.joda.time.Period((long) (-2147483646), 0L);
        org.joda.time.Period period14 = period12.plusMinutes(35);
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds17 = seconds15.plus(seconds16);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        int int19 = seconds17.get(durationFieldType18);
        org.joda.time.DurationFieldType durationFieldType20 = seconds17.getFieldType();
        java.lang.String str21 = durationFieldType20.toString();
        boolean boolean22 = period12.isSupported(durationFieldType20);
        boolean boolean23 = period8.isSupported(durationFieldType20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DurationField durationField25 = durationFieldType20.getField(chronology24);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "seconds" + "'", str21, "seconds");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test23654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23654");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration1 = minutes0.toStandardDuration();
        long long2 = duration1.getStandardSeconds();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        org.joda.time.Minutes minutes11 = minutes8.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration12 = minutes8.toStandardDuration();
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period15.minusMonths(0);
        org.joda.time.Minutes minutes18 = period17.toStandardMinutes();
        org.joda.time.Duration duration19 = minutes18.toStandardDuration();
        org.joda.time.Period period20 = duration19.toPeriod();
        boolean boolean21 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.days();
        org.joda.time.Period period24 = duration12.toPeriodTo(readableInstant22, periodType23);
        org.joda.time.Duration duration25 = duration1.plus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = duration1.toPeriodFrom(readableInstant26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.eras();
        int int29 = period27.indexOf(durationFieldType28);
        org.joda.time.Period period31 = period27.withDays((int) (short) 1);
        org.joda.time.Period period33 = period31.minusMonths((-10));
        org.joda.time.Period period35 = period33.plusDays(2147483645);
        org.joda.time.Period period37 = period35.minusYears((int) ' ');
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-128849018880L) + "'", long2 == (-128849018880L));
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test23655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23655");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        org.joda.time.Period period17 = duration16.toPeriod();
        boolean boolean18 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.days();
        org.joda.time.Period period21 = duration9.toPeriodTo(readableInstant19, periodType20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = duration9.toPeriodFrom(readableInstant22);
        org.joda.time.Period period24 = period23.negated();
        org.joda.time.Period period26 = period24.minusHours(8);
        org.joda.time.PeriodType periodType27 = period24.getPeriodType();
        int int28 = period24.getMonths();
        org.joda.time.Period period30 = period24.plusMillis((-200));
        org.joda.time.Period period32 = org.joda.time.Period.millis(0);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.months();
        boolean boolean34 = period32.isSupported(durationFieldType33);
        java.lang.String str35 = durationFieldType33.getName();
        java.lang.String str36 = durationFieldType33.toString();
        java.lang.String str37 = durationFieldType33.getName();
        org.joda.time.Period period39 = period30.withField(durationFieldType33, (-63));
        org.joda.time.MutablePeriod mutablePeriod40 = period30.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = mutablePeriod40.toDurationFrom(readableInstant41);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "months" + "'", str35, "months");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "months" + "'", str36, "months");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "months" + "'", str37, "months");
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(duration42);
    }

    @Test
    public void test23656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23656");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period2);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        org.joda.time.Minutes minutes9 = period8.toStandardMinutes();
        org.joda.time.Minutes minutes10 = minutes3.minus(minutes9);
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Minutes minutes18 = minutes16.dividedBy((int) (byte) 100);
        int int19 = minutes18.getMinutes();
        org.joda.time.Minutes minutes21 = minutes18.minus(35);
        org.joda.time.Period period23 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes24 = period23.toStandardMinutes();
        org.joda.time.Minutes minutes26 = minutes24.multipliedBy(1);
        org.joda.time.Minutes minutes28 = minutes26.multipliedBy((int) (byte) 0);
        org.joda.time.Minutes minutes30 = minutes28.dividedBy(5);
        org.joda.time.Minutes minutes31 = minutes18.plus(minutes30);
        org.joda.time.Minutes minutes32 = minutes9.minus(minutes30);
        org.joda.time.Minutes minutes34 = minutes32.dividedBy(19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType36 = minutes34.getFieldType(118);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 118");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(minutes34);
    }

    @Test
    public void test23657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23657");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str3 = periodType2.getName();
        boolean boolean5 = periodType2.equals((java.lang.Object) true);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) readableInstant1);
        org.joda.time.Period period9 = period7.withYears(13);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardSeconds((long) 0);
        java.lang.String str12 = duration11.toString();
        org.joda.time.Duration duration14 = duration11.minus((long) 10);
        java.lang.String str15 = duration11.toString();
        java.lang.String str16 = duration11.toString();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Days days20 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType21 = days20.getPeriodType();
        org.joda.time.PeriodType periodType22 = periodType21.withHoursRemoved();
        org.joda.time.PeriodType periodType23 = periodType21.withYearsRemoved();
        org.joda.time.PeriodType periodType24 = periodType21.withSecondsRemoved();
        org.joda.time.PeriodType periodType25 = periodType21.withHoursRemoved();
        org.joda.time.PeriodType periodType26 = periodType25.withYearsRemoved();
        org.joda.time.PeriodType periodType27 = periodType26.withHoursRemoved();
        int int28 = periodType27.size();
        org.joda.time.PeriodType periodType29 = periodType27.withSecondsRemoved();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(120L, 0L, periodType29, chronology30);
        org.joda.time.PeriodType periodType32 = periodType29.withHoursRemoved();
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant17, periodType29);
        org.joda.time.Period period34 = period7.normalizedStandard(periodType29);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "YearMonthDay" + "'", str3, "YearMonthDay");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT0S" + "'", str12, "PT0S");
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0S" + "'", str15, "PT0S");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT0S" + "'", str16, "PT0S");
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test23658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23658");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks3 = weeks1.dividedBy(100);
        org.joda.time.Weeks weeks4 = weeks1.negated();
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        org.joda.time.Weeks weeks8 = weeks6.dividedBy((int) (byte) -1);
        org.joda.time.Weeks weeks9 = null;
        org.joda.time.Weeks weeks10 = weeks8.minus(weeks9);
        org.joda.time.Weeks weeks12 = weeks8.dividedBy(2147483647);
        boolean boolean13 = weeks4.isGreaterThan(weeks12);
        org.joda.time.Weeks weeks15 = weeks12.dividedBy(87);
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.parseWeeks("PT0S");
        org.joda.time.Weeks weeks19 = weeks17.multipliedBy(8);
        org.joda.time.Weeks weeks21 = weeks17.plus(7);
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.weeks(35);
        org.joda.time.Weeks weeks25 = weeks23.multipliedBy(5);
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.THREE;
        org.joda.time.Duration duration27 = weeks26.toStandardDuration();
        boolean boolean28 = weeks25.isGreaterThan(weeks26);
        org.joda.time.Weeks weeks29 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.Weeks weeks31 = org.joda.time.Weeks.weeksIn(readableInterval30);
        boolean boolean32 = weeks29.isLessThan(weeks31);
        org.joda.time.Weeks weeks34 = weeks31.multipliedBy(10);
        org.joda.time.Weeks weeks35 = org.joda.time.Weeks.ZERO;
        java.lang.String str36 = weeks35.toString();
        int int37 = weeks35.size();
        org.joda.time.PeriodType periodType38 = weeks35.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = weeks35.toMutablePeriod();
        org.joda.time.Weeks weeks41 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks42 = weeks41.negated();
        org.joda.time.Weeks weeks43 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.Weeks weeks45 = org.joda.time.Weeks.weeksIn(readableInterval44);
        boolean boolean46 = weeks43.isLessThan(weeks45);
        boolean boolean47 = weeks42.isGreaterThan(weeks45);
        org.joda.time.Weeks weeks48 = null;
        org.joda.time.Weeks weeks49 = weeks45.minus(weeks48);
        org.joda.time.DurationFieldType durationFieldType50 = weeks49.getFieldType();
        org.joda.time.Weeks weeks51 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks53 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks54 = weeks53.negated();
        org.joda.time.Weeks weeks55 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval56 = null;
        org.joda.time.Weeks weeks57 = org.joda.time.Weeks.weeksIn(readableInterval56);
        boolean boolean58 = weeks55.isLessThan(weeks57);
        boolean boolean59 = weeks54.isGreaterThan(weeks57);
        boolean boolean60 = weeks51.isLessThan(weeks54);
        org.joda.time.Weeks weeks61 = weeks49.plus(weeks54);
        org.joda.time.Weeks weeks63 = weeks54.minus(2);
        org.joda.time.Weeks weeks65 = weeks63.dividedBy((-10));
        org.joda.time.Weeks weeks66 = weeks65.negated();
        boolean boolean67 = weeks35.isLessThan(weeks66);
        org.joda.time.Weeks weeks68 = weeks31.minus(weeks66);
        org.joda.time.Weeks weeks70 = weeks31.multipliedBy(65);
        org.joda.time.Weeks weeks71 = weeks25.minus(weeks70);
        org.joda.time.Weeks weeks73 = org.joda.time.Weeks.weeks(3);
        org.joda.time.PeriodType periodType74 = weeks73.getPeriodType();
        org.joda.time.PeriodType periodType75 = weeks73.getPeriodType();
        org.joda.time.PeriodType periodType76 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str77 = periodType76.getName();
        org.joda.time.Weeks weeks78 = org.joda.time.Weeks.ONE;
        boolean boolean79 = periodType76.equals((java.lang.Object) weeks78);
        org.joda.time.Weeks weeks80 = weeks73.minus(weeks78);
        org.joda.time.Weeks weeks81 = weeks25.minus(weeks78);
        org.joda.time.Weeks weeks82 = org.joda.time.Weeks.THREE;
        java.lang.String str83 = weeks82.toString();
        org.joda.time.Weeks weeks84 = weeks78.minus(weeks82);
        boolean boolean85 = weeks17.isGreaterThan(weeks84);
        boolean boolean86 = weeks12.isGreaterThan(weeks84);
        int int87 = weeks12.getWeeks();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "P0W" + "'", str36, "P0W");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(mutablePeriod39);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertNotNull(weeks43);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertNotNull(weeks51);
        org.junit.Assert.assertNotNull(weeks53);
        org.junit.Assert.assertNotNull(weeks54);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertNotNull(weeks57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(weeks61);
        org.junit.Assert.assertNotNull(weeks63);
        org.junit.Assert.assertNotNull(weeks65);
        org.junit.Assert.assertNotNull(weeks66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(weeks68);
        org.junit.Assert.assertNotNull(weeks70);
        org.junit.Assert.assertNotNull(weeks71);
        org.junit.Assert.assertNotNull(weeks73);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertNotNull(periodType76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "YearMonthDay" + "'", str77, "YearMonthDay");
        org.junit.Assert.assertNotNull(weeks78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(weeks80);
        org.junit.Assert.assertNotNull(weeks81);
        org.junit.Assert.assertNotNull(weeks82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "P3W" + "'", str83, "P3W");
        org.junit.Assert.assertNotNull(weeks84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test23659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23659");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.PeriodType periodType1 = seconds0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType4 = periodType1.withMonthsRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period(5, 118, 7, 97, 65, 4, 65, (-10));
        org.joda.time.Period period15 = period13.withYears(70);
        org.joda.time.Duration duration18 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration20 = duration18.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration20, readableInstant21);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.seconds();
        boolean boolean24 = period22.isSupported(durationFieldType23);
        int int25 = period13.get(durationFieldType23);
        boolean boolean26 = periodType1.isSupported(durationFieldType23);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 65 + "'", int25 == 65);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test23660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23660");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(10);
        org.joda.time.Period period3 = period1.minusMillis(0);
        org.joda.time.Period period5 = period3.withMinutes(2147483645);
        org.joda.time.Period period7 = period3.withMinutes((-4083));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test23661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23661");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        int int5 = period4.getYears();
        org.joda.time.Period period7 = period4.plusYears((int) ' ');
        org.joda.time.Period period9 = period4.minusSeconds((int) (short) 0);
        org.joda.time.Period period11 = org.joda.time.Period.seconds(5);
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period14.negated();
        int int16 = period14.getHours();
        org.joda.time.Period period18 = org.joda.time.Period.days(10);
        org.joda.time.Period period20 = period18.plusMonths((int) 'a');
        org.joda.time.Period period22 = period18.plusSeconds((int) (short) 100);
        org.joda.time.Period period24 = period22.minusMonths((int) 'a');
        org.joda.time.Period period25 = period14.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Hours hours26 = period14.toStandardHours();
        org.joda.time.Hours hours28 = hours26.minus((int) '#');
        org.joda.time.Hours hours29 = org.joda.time.Hours.ONE;
        int int30 = hours29.getHours();
        org.joda.time.Hours hours32 = hours29.multipliedBy((-95));
        org.joda.time.Hours hours34 = hours32.dividedBy((int) (short) 1);
        org.joda.time.Hours hours35 = hours26.plus(hours32);
        org.joda.time.Period period37 = org.joda.time.Period.millis(0);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.months();
        boolean boolean39 = period37.isSupported(durationFieldType38);
        java.lang.String str40 = durationFieldType38.getName();
        boolean boolean41 = hours32.isSupported(durationFieldType38);
        int int42 = period11.get(durationFieldType38);
        org.joda.time.Period period44 = period9.withField(durationFieldType38, 118);
        int int45 = period44.getMinutes();
        org.joda.time.Period period47 = period44.plusSeconds((int) (short) 100);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(hours34);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "months" + "'", str40, "months");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(period47);
    }

    @Test
    public void test23662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23662");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        org.joda.time.Duration duration7 = duration5.withMillis((long) 59);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test23663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23663");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(11);
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration6 = duration4.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Interval interval10 = duration6.toIntervalFrom(readableInstant9);
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval10);
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval10);
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval10);
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = minutes13.get(durationFieldType14);
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Minutes minutes22 = period21.toStandardMinutes();
        org.joda.time.Minutes minutes24 = minutes22.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes25 = minutes16.minus(minutes22);
        org.joda.time.Minutes minutes26 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period31 = period29.minusMonths(0);
        org.joda.time.Minutes minutes32 = period31.toStandardMinutes();
        org.joda.time.Minutes minutes34 = minutes32.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes35 = minutes26.minus(minutes32);
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period40 = period38.minusMonths(0);
        org.joda.time.Minutes minutes41 = period40.toStandardMinutes();
        org.joda.time.Duration duration42 = minutes41.toStandardDuration();
        org.joda.time.Minutes minutes44 = minutes41.multipliedBy((int) (short) 1);
        int int45 = minutes26.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes44);
        org.joda.time.Minutes minutes46 = minutes25.plus(minutes44);
        boolean boolean47 = minutes13.isGreaterThan(minutes44);
        org.joda.time.Minutes minutes48 = minutes1.plus(minutes44);
        org.joda.time.Minutes minutes49 = minutes48.negated();
        java.lang.String str50 = minutes48.toString();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PT11M" + "'", str50, "PT11M");
    }

    @Test
    public void test23664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23664");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) 1);
        org.joda.time.Duration duration2 = period1.toStandardDuration();
        org.joda.time.Period period4 = period1.withHours(36);
        org.joda.time.Period period6 = period4.minusMillis((-5));
        org.joda.time.Period period8 = period6.withDays((-97));
        org.joda.time.Period period10 = period8.plusMonths(572);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test23665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23665");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(1123200000L, (-1298798110310400000L), chronology2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = duration5.toPeriodFrom(readableInstant6);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test23666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23666");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) 1);
        java.lang.String str2 = period1.toString();
        org.joda.time.Duration duration5 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration7 = duration5.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Interval interval11 = duration7.toIntervalFrom(readableInstant10);
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Minutes minutes14 = minutes12.multipliedBy((-95));
        org.joda.time.Minutes minutes16 = minutes14.minus((int) (byte) 1);
        org.joda.time.Minutes minutes17 = minutes16.negated();
        org.joda.time.Minutes minutes18 = minutes17.negated();
        org.joda.time.DurationFieldType durationFieldType19 = minutes18.getFieldType();
        boolean boolean20 = period1.isSupported(durationFieldType19);
        org.joda.time.Period period22 = period1.minusDays((-4083));
        org.joda.time.Period period24 = period22.plusSeconds((int) (short) -1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT1H" + "'", str2, "PT1H");
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test23667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23667");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        java.util.Locale locale3 = periodFormatter2.getLocale();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.util.Locale locale6 = periodFormatter5.getLocale();
        boolean boolean7 = periodFormatter5.isParser();
        java.util.Locale locale8 = periodFormatter5.getLocale();
        org.joda.time.format.PeriodPrinter periodPrinter9 = periodFormatter5.getPrinter();
        java.io.Writer writer10 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period13.negated();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationTo(readableInstant15);
        org.joda.time.Period period18 = period14.plusWeeks((int) (short) 10);
        org.joda.time.Period period20 = period18.plusDays((int) (short) 1);
        int int21 = period20.getWeeks();
        org.joda.time.Period period22 = period20.toPeriod();
        org.joda.time.Period period24 = period20.plusYears(87);
        org.joda.time.Period period26 = period20.minusSeconds((-2147483640));
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter5.printTo(writer10, (org.joda.time.ReadablePeriod) period26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(locale8);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test23668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23668");
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
        org.joda.time.Days days34 = org.joda.time.Days.ONE;
        org.joda.time.Days days35 = org.joda.time.Days.ONE;
        int int36 = days34.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days35);
        org.joda.time.Days days38 = days35.multipliedBy((int) '#');
        org.joda.time.Days days39 = org.joda.time.Days.SIX;
        org.joda.time.Days days40 = days38.minus(days39);
        org.joda.time.Days days42 = days38.dividedBy(105);
        org.joda.time.Period period44 = org.joda.time.Period.years(4);
        org.joda.time.Period period46 = period44.multipliedBy((-14400));
        org.joda.time.Days days47 = org.joda.time.Days.FOUR;
        org.joda.time.Days days48 = days47.negated();
        boolean boolean49 = period46.equals((java.lang.Object) days48);
        org.joda.time.Days days50 = org.joda.time.Days.ONE;
        org.joda.time.Days days51 = org.joda.time.Days.ONE;
        int int52 = days50.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days51);
        org.joda.time.Days days54 = days50.multipliedBy(8);
        boolean boolean55 = days48.isGreaterThan(days50);
        org.joda.time.Days days56 = days42.minus(days50);
        boolean boolean57 = days30.isGreaterThan(days50);
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
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(days48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(days50);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(days54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test23669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23669");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.Seconds seconds9 = seconds1.plus((int) '4');
        int int10 = seconds1.getSeconds();
        org.joda.time.PeriodType periodType11 = seconds1.getPeriodType();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test23670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23670");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = days0.multipliedBy((int) (byte) -1);
        org.joda.time.Days days4 = days0.negated();
        org.joda.time.Days days5 = org.joda.time.Days.ONE;
        org.joda.time.Days days6 = org.joda.time.Days.ONE;
        int int7 = days5.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days6);
        org.joda.time.Days days9 = days6.multipliedBy((int) '#');
        org.joda.time.Days days10 = days4.minus(days6);
        org.joda.time.MutablePeriod mutablePeriod11 = days4.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod12 = days4.toMutablePeriod();
        org.joda.time.Days days14 = days4.multipliedBy((int) ' ');
        org.joda.time.Days days15 = days14.negated();
        org.joda.time.Days days16 = org.joda.time.Days.ONE;
        org.joda.time.Days days17 = org.joda.time.Days.ONE;
        int int18 = days16.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days17);
        org.joda.time.Days days20 = days17.multipliedBy((int) '#');
        org.joda.time.Days days21 = org.joda.time.Days.SIX;
        org.joda.time.Days days22 = days20.minus(days21);
        org.joda.time.Days days24 = days20.plus((int) (byte) 100);
        org.joda.time.Days days26 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days28 = days26.multipliedBy((int) (short) 100);
        org.joda.time.Days days29 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType30 = days29.getPeriodType();
        org.joda.time.Days days32 = days29.minus(0);
        org.joda.time.Days days33 = days26.minus(days32);
        org.joda.time.PeriodType periodType34 = days26.getPeriodType();
        org.joda.time.Days days36 = days26.dividedBy((int) 'a');
        org.joda.time.Days days38 = days36.dividedBy((int) '4');
        org.joda.time.Days days40 = days38.dividedBy(7);
        boolean boolean41 = days24.isLessThan(days40);
        org.joda.time.Days days42 = days14.minus(days40);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(days42);
    }

    @Test
    public void test23671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23671");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withSecondsRemoved();
        org.joda.time.Period period9 = duration3.toPeriodFrom(readableInstant4, periodType6);
        long long10 = duration3.getStandardHours();
        org.joda.time.Duration duration13 = duration3.withDurationAdded(10L, (-36));
        org.joda.time.Period period14 = duration13.toPeriod();
        org.joda.time.Duration duration17 = duration13.withDurationAdded((long) ' ', (int) (byte) 0);
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Period period24 = period20.minusSeconds((int) (byte) 100);
        org.joda.time.Days days25 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType26 = days25.getPeriodType();
        org.joda.time.PeriodType periodType27 = periodType26.withHoursRemoved();
        org.joda.time.PeriodType periodType28 = periodType26.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.days();
        boolean boolean30 = periodType28.isSupported(durationFieldType29);
        int int31 = period20.get(durationFieldType29);
        org.joda.time.Period period33 = period20.withHours(1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = period20.toDurationTo(readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = duration35.toPeriodTo(readableInstant36);
        int int38 = duration17.compareTo((org.joda.time.ReadableDuration) duration35);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Days days43 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType44 = days43.getPeriodType();
        org.joda.time.PeriodType periodType45 = periodType44.withHoursRemoved();
        org.joda.time.PeriodType periodType46 = periodType44.withSecondsRemoved();
        org.joda.time.PeriodType periodType47 = periodType44.withMinutesRemoved();
        org.joda.time.PeriodType periodType48 = periodType47.withWeeksRemoved();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(10L, (long) (byte) -1, periodType48, chronology49);
        org.joda.time.PeriodType periodType51 = periodType48.withYearsRemoved();
        boolean boolean52 = periodType40.equals((java.lang.Object) periodType48);
        org.joda.time.Period period53 = duration35.toPeriodTo(readableInstant39, periodType48);
        org.joda.time.PeriodType periodType54 = periodType48.withDaysRemoved();
        org.joda.time.PeriodType periodType55 = periodType48.withYearsRemoved();
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType55);
        int int57 = period56.getSeconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period59 = period56.plusSeconds((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test23672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23672");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 56);
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration3 = seconds2.toStandardDuration();
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds9 = seconds7.plus(seconds8);
        org.joda.time.Seconds seconds11 = seconds7.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds12 = seconds6.plus(seconds7);
        org.joda.time.Seconds seconds14 = seconds6.plus((int) '4');
        org.joda.time.Duration duration15 = seconds14.toStandardDuration();
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds19 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds20 = seconds18.plus(seconds19);
        org.joda.time.Seconds seconds22 = seconds18.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds23 = seconds17.plus(seconds18);
        org.joda.time.Seconds seconds25 = seconds17.plus((int) '4');
        org.joda.time.Duration duration26 = seconds25.toStandardDuration();
        boolean boolean27 = seconds14.isLessThan(seconds25);
        boolean boolean28 = seconds4.isGreaterThan(seconds14);
        boolean boolean29 = seconds2.isGreaterThan(seconds4);
        org.joda.time.Period period30 = period1.minus((org.joda.time.ReadablePeriod) seconds2);
        org.joda.time.Seconds seconds32 = seconds2.plus(0);
        org.joda.time.Seconds seconds34 = org.joda.time.Seconds.seconds((int) (short) 0);
        org.joda.time.Seconds seconds36 = seconds34.plus((int) (byte) 100);
        org.joda.time.Seconds seconds38 = seconds36.dividedBy((int) (byte) 100);
        org.joda.time.Seconds seconds40 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds41 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds42 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds43 = seconds41.plus(seconds42);
        org.joda.time.Seconds seconds45 = seconds41.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds46 = seconds40.plus(seconds41);
        org.joda.time.Seconds seconds48 = seconds40.plus((int) '4');
        org.joda.time.Seconds seconds49 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds50 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds51 = seconds49.plus(seconds50);
        org.joda.time.Seconds seconds53 = seconds49.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds54 = seconds40.plus(seconds49);
        org.joda.time.Seconds seconds55 = seconds36.minus(seconds54);
        int int56 = seconds54.getSeconds();
        org.joda.time.Seconds seconds58 = seconds54.minus(65);
        org.joda.time.Seconds seconds60 = seconds54.multipliedBy((-95));
        org.joda.time.Seconds seconds62 = seconds60.multipliedBy(5);
        org.joda.time.Seconds seconds63 = seconds32.minus(seconds62);
        org.joda.time.Seconds seconds65 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds66 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds67 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds68 = seconds66.plus(seconds67);
        org.joda.time.Seconds seconds70 = seconds66.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds71 = seconds65.plus(seconds66);
        org.joda.time.DurationFieldType durationFieldType72 = seconds66.getFieldType();
        org.joda.time.Seconds seconds74 = org.joda.time.Seconds.seconds(100);
        boolean boolean75 = seconds66.isGreaterThan(seconds74);
        org.joda.time.Seconds seconds77 = seconds66.plus(105);
        org.joda.time.Seconds seconds78 = seconds63.minus(seconds66);
        org.joda.time.Period period83 = new org.joda.time.Period(999, 0, 8, 100);
        org.joda.time.Period period85 = period83.minusMinutes(36);
        int int86 = period83.size();
        org.joda.time.Seconds seconds87 = period83.toStandardSeconds();
        org.joda.time.Seconds seconds88 = seconds63.plus(seconds87);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertNotNull(seconds36);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertNotNull(seconds41);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertNotNull(seconds43);
        org.junit.Assert.assertNotNull(seconds45);
        org.junit.Assert.assertNotNull(seconds46);
        org.junit.Assert.assertNotNull(seconds48);
        org.junit.Assert.assertNotNull(seconds49);
        org.junit.Assert.assertNotNull(seconds50);
        org.junit.Assert.assertNotNull(seconds51);
        org.junit.Assert.assertNotNull(seconds53);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(seconds55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(seconds58);
        org.junit.Assert.assertNotNull(seconds60);
        org.junit.Assert.assertNotNull(seconds62);
        org.junit.Assert.assertNotNull(seconds63);
        org.junit.Assert.assertNotNull(seconds65);
        org.junit.Assert.assertNotNull(seconds66);
        org.junit.Assert.assertNotNull(seconds67);
        org.junit.Assert.assertNotNull(seconds68);
        org.junit.Assert.assertNotNull(seconds70);
        org.junit.Assert.assertNotNull(seconds71);
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertNotNull(seconds74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(seconds77);
        org.junit.Assert.assertNotNull(seconds78);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 8 + "'", int86 == 8);
        org.junit.Assert.assertNotNull(seconds87);
        org.junit.Assert.assertNotNull(seconds88);
    }

    @Test
    public void test23673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23673");
        org.joda.time.Hours hours0 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours2 = hours0.dividedBy(100);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Period period9 = period7.minusSeconds(0);
        org.joda.time.Period period10 = period9.normalizedStandard();
        org.joda.time.Hours hours11 = period10.toStandardHours();
        boolean boolean12 = hours2.isLessThan(hours11);
        org.joda.time.Period period14 = org.joda.time.Period.millis((int) '#');
        int int15 = period14.getYears();
        org.joda.time.Hours hours16 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period18 = period14.multipliedBy((int) (byte) 0);
        org.joda.time.Hours hours19 = period18.toStandardHours();
        org.joda.time.Hours hours20 = hours2.minus(hours19);
        org.joda.time.Hours hours21 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours22 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours24 = hours22.dividedBy(100);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period29 = period27.minusMonths(0);
        org.joda.time.Period period31 = period29.minusSeconds(0);
        org.joda.time.Period period32 = period31.normalizedStandard();
        org.joda.time.Hours hours33 = period32.toStandardHours();
        boolean boolean34 = hours24.isLessThan(hours33);
        boolean boolean35 = hours21.isLessThan(hours24);
        org.joda.time.Duration duration36 = hours24.toStandardDuration();
        java.lang.String str37 = hours24.toString();
        org.joda.time.Period period39 = org.joda.time.Period.millis((int) '#');
        int int40 = period39.getYears();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.Period period42 = period39.withFields(readablePeriod41);
        org.joda.time.Hours hours43 = period39.toStandardHours();
        org.joda.time.Hours hours44 = hours24.minus(hours43);
        org.joda.time.Hours hours45 = hours19.minus(hours24);
        org.joda.time.PeriodType periodType46 = hours45.getPeriodType();
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant47, readableDuration48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationTo(readableInstant50);
        org.joda.time.Hours hours52 = duration51.toStandardHours();
        org.joda.time.Hours hours54 = hours52.dividedBy(999);
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period58 = new org.joda.time.Period((long) (byte) 1, (long) (-36), periodType57);
        org.joda.time.PeriodType periodType59 = periodType57.withMinutesRemoved();
        org.joda.time.Period period60 = new org.joda.time.Period((java.lang.Object) hours52, periodType57);
        org.joda.time.Hours hours62 = hours52.plus((int) (short) -1);
        org.joda.time.Hours hours63 = hours45.minus(hours52);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PT0H" + "'", str37, "PT0H");
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(hours43);
        org.junit.Assert.assertNotNull(hours44);
        org.junit.Assert.assertNotNull(hours45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(hours52);
        org.junit.Assert.assertNotNull(hours54);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(hours62);
        org.junit.Assert.assertNotNull(hours63);
    }

    @Test
    public void test23674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23674");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        org.joda.time.Period period17 = duration16.toPeriod();
        boolean boolean18 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.days();
        org.joda.time.Period period21 = duration9.toPeriodTo(readableInstant19, periodType20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant22);
        org.joda.time.Minutes minutes24 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration25 = minutes24.toStandardDuration();
        long long26 = duration25.getStandardSeconds();
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period31 = period29.minusMonths(0);
        org.joda.time.Minutes minutes32 = period31.toStandardMinutes();
        org.joda.time.Duration duration33 = minutes32.toStandardDuration();
        org.joda.time.Minutes minutes35 = minutes32.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration36 = minutes32.toStandardDuration();
        org.joda.time.Period period39 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period41 = period39.minusMonths(0);
        org.joda.time.Minutes minutes42 = period41.toStandardMinutes();
        org.joda.time.Duration duration43 = minutes42.toStandardDuration();
        org.joda.time.Period period44 = duration43.toPeriod();
        boolean boolean45 = duration36.isLongerThan((org.joda.time.ReadableDuration) duration43);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.days();
        org.joda.time.Period period48 = duration36.toPeriodTo(readableInstant46, periodType47);
        org.joda.time.Duration duration49 = duration25.plus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Duration duration50 = duration49.toDuration();
        boolean boolean51 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration49);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period54 = duration49.toPeriodFrom(readableInstant52, periodType53);
        long long55 = duration49.getMillis();
        java.lang.String str56 = duration49.toString();
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant57, readableDuration58);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = period59.toDurationTo(readableInstant60);
        org.joda.time.Period period63 = period59.minusYears(2147483645);
        org.joda.time.Period period66 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period68 = period66.minusMonths(0);
        org.joda.time.Period period70 = period66.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType71 = period66.getPeriodType();
        org.joda.time.PeriodType periodType72 = periodType71.withMinutesRemoved();
        boolean boolean73 = period63.equals((java.lang.Object) periodType71);
        org.joda.time.PeriodType periodType74 = periodType71.withYearsRemoved();
        org.joda.time.Period period75 = duration49.toPeriod(periodType74);
        org.joda.time.Period period77 = period75.multipliedBy((int) 'a');
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-128849018880L) + "'", long26 == (-128849018880L));
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-128849018880000L) + "'", long55 == (-128849018880000L));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PT-128849018880S" + "'", str56, "PT-128849018880S");
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
    }

    @Test
    public void test23675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23675");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration4 = duration1.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration6 = duration1.plus((long) 2147483647);
        org.joda.time.Duration duration7 = duration1.toDuration();
        org.joda.time.Duration duration8 = duration1.toDuration();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test23676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23676");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        org.joda.time.Period period10 = duration9.toPeriod();
        org.joda.time.Duration duration12 = duration9.plus((long) (byte) 0);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) duration12, periodType14, chronology15);
        org.joda.time.PeriodType periodType17 = periodType14.withDaysRemoved();
        org.joda.time.PeriodType periodType18 = periodType17.withDaysRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withYearsRemoved();
        org.joda.time.PeriodType periodType20 = periodType19.withMinutesRemoved();
        org.joda.time.Period period21 = new org.joda.time.Period(99640L, (-660L), periodType20);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test23677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23677");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks3 = weeks2.negated();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        boolean boolean7 = weeks4.isLessThan(weeks6);
        boolean boolean8 = weeks3.isGreaterThan(weeks6);
        boolean boolean9 = weeks0.isLessThan(weeks3);
        int int10 = weeks3.getWeeks();
        org.joda.time.Duration duration11 = weeks3.toStandardDuration();
        org.joda.time.Duration duration12 = weeks3.toStandardDuration();
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks15 = weeks14.negated();
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.weeksIn(readableInterval17);
        boolean boolean19 = weeks16.isLessThan(weeks18);
        boolean boolean20 = weeks15.isGreaterThan(weeks18);
        org.joda.time.PeriodType periodType21 = weeks15.getPeriodType();
        org.joda.time.Duration duration22 = weeks15.toStandardDuration();
        org.joda.time.Weeks weeks23 = weeks3.minus(weeks15);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(weeks23);
    }

    @Test
    public void test23678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23678");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isPrinter();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str8 = periodType7.getName();
        org.joda.time.PeriodType periodType9 = periodType7.withHoursRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter2.withParseType(periodType7);
        org.joda.time.Days days11 = org.joda.time.Days.FIVE;
        java.lang.String str12 = days11.toString();
        org.joda.time.Days days14 = days11.multipliedBy((int) (byte) -1);
        org.joda.time.Days days15 = days11.negated();
        org.joda.time.Days days16 = org.joda.time.Days.ONE;
        org.joda.time.Days days17 = org.joda.time.Days.ONE;
        int int18 = days16.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days17);
        org.joda.time.Days days20 = days17.multipliedBy((int) '#');
        org.joda.time.Days days21 = days15.minus(days17);
        org.joda.time.DurationFieldType durationFieldType22 = days21.getFieldType();
        org.joda.time.Duration duration23 = days21.toStandardDuration();
        org.joda.time.Days days24 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days21);
        org.joda.time.PeriodType periodType25 = days21.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter26 = periodFormatter2.withParseType(periodType25);
        boolean boolean27 = periodFormatter26.isParser();
        org.joda.time.format.PeriodPrinter periodPrinter28 = periodFormatter26.getPrinter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "YearMonthDay" + "'", str8, "YearMonthDay");
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P5D" + "'", str12, "P5D");
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodFormatter26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(periodPrinter28);
    }

    @Test
    public void test23679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23679");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.MutablePeriod mutablePeriod5 = period2.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod6 = period2.toMutablePeriod();
        org.joda.time.Period period8 = period2.multipliedBy((int) (short) 1);
        org.joda.time.Period period10 = period8.minusHours(14400);
        org.joda.time.Period period12 = period10.withMillis((int) '4');
        org.joda.time.Period period14 = period10.withMonths((int) ' ');
        org.joda.time.format.PeriodPrinter periodPrinter16 = null;
        org.joda.time.format.PeriodParser periodParser17 = null;
        org.joda.time.format.PeriodFormatter periodFormatter18 = new org.joda.time.format.PeriodFormatter(periodPrinter16, periodParser17);
        boolean boolean19 = periodFormatter18.isParser();
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds22 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds23 = seconds21.plus(seconds22);
        org.joda.time.PeriodType periodType24 = seconds21.getPeriodType();
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period28 = period27.negated();
        org.joda.time.DurationFieldType durationFieldType30 = period27.getFieldType((int) (short) 1);
        int int31 = periodType24.indexOf(durationFieldType30);
        org.joda.time.Period period32 = new org.joda.time.Period((long) ' ', periodType24);
        org.joda.time.format.PeriodFormatter periodFormatter33 = periodFormatter18.withParseType(periodType24);
        org.joda.time.PeriodType periodType34 = periodType24.withDaysRemoved();
        org.joda.time.Period period35 = new org.joda.time.Period(10L, periodType24);
        org.joda.time.Period period36 = period35.normalizedStandard();
        org.joda.time.Period period38 = period36.withWeeks(1);
        org.joda.time.Period period40 = period38.minusMonths((-97));
        org.joda.time.Period period41 = period40.toPeriod();
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType43 = periodType42.withYearsRemoved();
        org.joda.time.PeriodType periodType44 = periodType42.withMillisRemoved();
        org.joda.time.Period period47 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Seconds seconds48 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds49 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds50 = seconds48.plus(seconds49);
        org.joda.time.Seconds seconds52 = seconds49.plus((int) (byte) 0);
        org.joda.time.Seconds seconds54 = seconds52.minus((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.months();
        int int56 = seconds52.get(durationFieldType55);
        boolean boolean57 = period47.isSupported(durationFieldType55);
        org.joda.time.Chronology chronology58 = null;
        boolean boolean59 = durationFieldType55.isSupported(chronology58);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DurationField durationField61 = durationFieldType55.getField(chronology60);
        java.lang.String str62 = durationFieldType55.getName();
        boolean boolean63 = periodType42.isSupported(durationFieldType55);
        int int64 = period40.get(durationFieldType55);
        org.joda.time.Period period66 = period10.withFieldAdded(durationFieldType55, (-2122032));
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Duration duration68 = period66.toDurationFrom(readableInstant67);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(seconds48);
        org.junit.Assert.assertNotNull(seconds49);
        org.junit.Assert.assertNotNull(seconds50);
        org.junit.Assert.assertNotNull(seconds52);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "months" + "'", str62, "months");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(duration68);
    }

    @Test
    public void test23680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23680");
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
        long long47 = duration43.getStandardHours();
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period53 = period51.minusMonths(0);
        org.joda.time.Period period55 = period51.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType56 = period51.getPeriodType();
        org.joda.time.PeriodType periodType57 = periodType56.withMinutesRemoved();
        org.joda.time.PeriodType periodType58 = periodType57.withMinutesRemoved();
        org.joda.time.Period period59 = duration43.toPeriodTo(readableInstant48, periodType58);
        org.joda.time.PeriodType periodType60 = periodType58.withHoursRemoved();
        org.joda.time.PeriodType periodType61 = periodType58.withHoursRemoved();
        org.joda.time.PeriodType periodType62 = periodType61.withSecondsRemoved();
        org.joda.time.PeriodType periodType63 = periodType61.withWeeksRemoved();
        org.joda.time.PeriodType periodType64 = periodType61.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType66 = periodType61.getFieldType(12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(periodType64);
    }

    @Test
    public void test23681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23681");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (-9500));
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration3 = new org.joda.time.Duration((java.lang.Object) seconds2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Seconds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test23682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23682");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.Days days3 = days1.minus((int) '4');
        org.joda.time.Days days5 = days3.dividedBy((int) (short) 10);
        org.joda.time.Days days6 = org.joda.time.Days.FIVE;
        java.lang.String str7 = days6.toString();
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.Days days11 = days8.minus(0);
        boolean boolean12 = days6.isLessThan(days11);
        java.lang.String str13 = days6.toString();
        org.joda.time.DurationFieldType durationFieldType14 = days6.getFieldType();
        org.joda.time.Days days15 = days5.plus(days6);
        org.joda.time.Days days17 = org.joda.time.Days.days((int) '4');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) days17, chronology18);
        int int20 = days17.getDays();
        org.joda.time.DurationFieldType durationFieldType21 = days17.getFieldType();
        boolean boolean22 = days6.isLessThan(days17);
        java.lang.String str23 = days17.toString();
        org.joda.time.Period period25 = org.joda.time.Period.days(10);
        org.joda.time.Period period27 = period25.plusMonths((int) 'a');
        org.joda.time.Period period29 = period25.plusSeconds((int) (short) 100);
        org.joda.time.Period period31 = period25.withMinutes(1);
        org.joda.time.Days days32 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period25);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableDuration34);
        org.joda.time.Days days36 = period35.toStandardDays();
        org.joda.time.Days days38 = days36.minus(7);
        org.joda.time.Days days39 = days32.plus(days38);
        org.joda.time.Days days40 = org.joda.time.Days.FIVE;
        java.lang.String str41 = days40.toString();
        org.joda.time.Days days43 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days44 = days40.minus(days43);
        org.joda.time.Days days46 = days43.minus((int) '#');
        org.joda.time.Days days47 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days48 = days46.plus(days47);
        org.joda.time.DurationFieldType durationFieldType49 = days48.getFieldType();
        org.joda.time.Days days50 = days48.negated();
        org.joda.time.Days days51 = days39.plus(days48);
        java.lang.String str52 = days39.toString();
        org.joda.time.PeriodType periodType53 = days39.getPeriodType();
        boolean boolean54 = days17.isLessThan(days39);
        java.lang.String str55 = days39.toString();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P5D" + "'", str7, "P5D");
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P5D" + "'", str13, "P5D");
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "P52D" + "'", str23, "P52D");
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "P5D" + "'", str41, "P5D");
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(days46);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(days48);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertNotNull(days50);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "P3D" + "'", str52, "P3D");
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "P3D" + "'", str55, "P3D");
    }

    @Test
    public void test23683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23683");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.withDays(8);
        org.joda.time.Period period4 = period0.plusMinutes((int) (byte) 0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray5 = period4.getFieldTypes();
        org.joda.time.Period period7 = period4.multipliedBy((int) 'a');
        org.joda.time.Period period8 = period7.normalizedStandard();
        org.joda.time.Period period9 = period8.toPeriod();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(durationFieldTypeArray5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test23684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23684");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(11L);
        org.joda.time.Minutes minutes2 = duration1.toStandardMinutes();
        int int3 = minutes2.getMinutes();
        org.joda.time.DurationFieldType durationFieldType4 = minutes2.getFieldType();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test23685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23685");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
        org.joda.time.Period period4 = period2.minusYears((-2));
        org.joda.time.Period period6 = period4.withDays((-118));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test23686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23686");
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
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period12);
        org.joda.time.PeriodType periodType14 = period12.getPeriodType();
        org.joda.time.PeriodType periodType15 = periodType14.withMonthsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter16 = periodFormatter8.withParseType(periodType14);
        java.util.Locale locale17 = periodFormatter16.getLocale();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodFormatter16);
        org.junit.Assert.assertNull(locale17);
    }

    @Test
    public void test23687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23687");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        org.joda.time.Days days10 = days1.minus(35);
        org.joda.time.Days days12 = days1.plus(14400);
        org.joda.time.Days days14 = days12.dividedBy((-36));
        org.joda.time.Days days15 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType16 = days15.getPeriodType();
        org.joda.time.Days days17 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        org.joda.time.Days days20 = days17.minus(0);
        org.joda.time.Days days21 = days20.negated();
        boolean boolean22 = days15.isGreaterThan(days20);
        org.joda.time.Days days23 = days12.minus(days20);
        org.joda.time.Days days24 = days20.negated();
        org.joda.time.Days days26 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days28 = days26.multipliedBy((int) (short) 100);
        org.joda.time.Days days29 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType30 = days29.getPeriodType();
        org.joda.time.Days days32 = days29.minus(0);
        org.joda.time.Days days33 = days26.minus(days32);
        org.joda.time.Days days34 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days33);
        org.joda.time.Days days36 = days33.dividedBy(3);
        org.joda.time.PeriodType periodType37 = days33.getPeriodType();
        org.joda.time.Days days38 = days20.minus(days33);
        java.lang.String str39 = days20.toString();
        org.joda.time.Days days41 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days43 = days41.multipliedBy((int) (short) 100);
        org.joda.time.Days days44 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType45 = days44.getPeriodType();
        org.joda.time.Days days47 = days44.minus(0);
        org.joda.time.Days days48 = days41.minus(days47);
        java.lang.String str49 = days48.toString();
        org.joda.time.Days days50 = days48.negated();
        org.joda.time.Days days51 = org.joda.time.Days.FIVE;
        java.lang.String str52 = days51.toString();
        org.joda.time.Days days54 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days55 = days51.minus(days54);
        org.joda.time.DurationFieldType durationFieldType56 = days51.getFieldType();
        boolean boolean57 = days50.isLessThan(days51);
        org.joda.time.Days days59 = days50.dividedBy(52);
        org.joda.time.Days days61 = days50.plus(268435465);
        boolean boolean62 = days20.isLessThan(days61);
        java.lang.String str63 = days61.toString();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "P5D" + "'", str39, "P5D");
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(days48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "P0D" + "'", str49, "P0D");
        org.junit.Assert.assertNotNull(days50);
        org.junit.Assert.assertNotNull(days51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "P5D" + "'", str52, "P5D");
        org.junit.Assert.assertNotNull(days54);
        org.junit.Assert.assertNotNull(days55);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(days59);
        org.junit.Assert.assertNotNull(days61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "P268435465D" + "'", str63, "P268435465D");
    }

    @Test
    public void test23688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23688");
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
        boolean boolean23 = periodFormatter22.isPrinter();
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str25 = periodType24.getName();
        org.joda.time.format.PeriodFormatter periodFormatter26 = periodFormatter22.withParseType(periodType24);
        boolean boolean27 = periodFormatter26.isPrinter();
        org.joda.time.Seconds seconds28 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds29 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds30 = seconds28.plus(seconds29);
        org.joda.time.PeriodType periodType31 = seconds28.getPeriodType();
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period34.negated();
        org.joda.time.DurationFieldType durationFieldType37 = period34.getFieldType((int) (short) 1);
        int int38 = periodType31.indexOf(durationFieldType37);
        org.joda.time.format.PeriodFormatter periodFormatter39 = periodFormatter26.withParseType(periodType31);
        java.util.Locale locale40 = periodFormatter26.getLocale();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "YearMonthDay" + "'", str25, "YearMonthDay");
        org.junit.Assert.assertNotNull(periodFormatter26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter39);
        org.junit.Assert.assertNull(locale40);
    }

    @Test
    public void test23689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23689");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        boolean boolean6 = weeks3.isLessThan(weeks5);
        boolean boolean7 = weeks2.isGreaterThan(weeks5);
        org.joda.time.Weeks weeks8 = null;
        org.joda.time.Weeks weeks9 = weeks5.minus(weeks8);
        org.joda.time.Weeks weeks11 = weeks9.minus(35);
        java.lang.String str12 = weeks11.toString();
        java.lang.String str13 = weeks11.toString();
        int int14 = weeks11.getWeeks();
        org.joda.time.Weeks weeks16 = weeks11.multipliedBy((-2));
        org.joda.time.Weeks weeks18 = weeks11.multipliedBy(36);
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.ZERO;
        java.lang.String str20 = weeks19.toString();
        org.joda.time.Duration duration21 = weeks19.toStandardDuration();
        int int22 = weeks19.getWeeks();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str24 = periodType23.getName();
        org.joda.time.Weeks weeks25 = org.joda.time.Weeks.ONE;
        boolean boolean26 = periodType23.equals((java.lang.Object) weeks25);
        org.joda.time.Weeks weeks28 = weeks25.plus((int) (byte) 100);
        org.joda.time.Weeks weeks29 = weeks19.plus(weeks28);
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.Weeks weeks31 = org.joda.time.Weeks.weeksIn(readableInterval30);
        org.joda.time.Weeks weeks33 = weeks31.dividedBy((int) (byte) -1);
        org.joda.time.Weeks weeks34 = null;
        org.joda.time.Weeks weeks35 = weeks33.minus(weeks34);
        org.joda.time.Weeks weeks37 = weeks33.dividedBy(2147483647);
        org.joda.time.Weeks weeks39 = weeks33.minus(8);
        boolean boolean40 = weeks28.isLessThan(weeks33);
        org.joda.time.Weeks weeks41 = weeks18.plus(weeks33);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P-35W" + "'", str12, "P-35W");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P-35W" + "'", str13, "P-35W");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-35) + "'", int14 == (-35));
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "P0W" + "'", str20, "P0W");
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "YearMonthDay" + "'", str24, "YearMonthDay");
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(weeks37);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(weeks41);
    }

    @Test
    public void test23690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23690");
        org.joda.time.Period period1 = org.joda.time.Period.hours(2147483645);
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeks(1);
        boolean boolean6 = weeks3.isGreaterThan(weeks5);
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean8 = weeks5.isGreaterThan(weeks7);
        org.joda.time.Weeks weeks10 = weeks5.multipliedBy(0);
        boolean boolean11 = weeks2.isGreaterThan(weeks5);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeksIn(readableInterval12);
        org.joda.time.Weeks weeks15 = weeks13.plus((-97));
        boolean boolean16 = weeks2.isGreaterThan(weeks13);
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) weeks2);
        java.lang.String str18 = weeks2.toString();
        org.joda.time.PeriodType periodType19 = weeks2.getPeriodType();
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration24 = duration22.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Interval interval28 = duration24.toIntervalFrom(readableInstant27);
        org.joda.time.Weeks weeks29 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval28);
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval28);
        org.joda.time.Weeks weeks31 = weeks30.negated();
        org.joda.time.Weeks weeks32 = weeks2.minus(weeks31);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "P12782640W" + "'", str18, "P12782640W");
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(weeks32);
    }

    @Test
    public void test23691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23691");
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
        org.joda.time.Days days33 = org.joda.time.Days.days(1);
        org.joda.time.Duration duration34 = days33.toStandardDuration();
        org.joda.time.Days days36 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days38 = days36.multipliedBy((int) (short) 100);
        org.joda.time.Days days39 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType40 = days39.getPeriodType();
        org.joda.time.Days days42 = days39.minus(0);
        org.joda.time.Days days43 = days36.minus(days42);
        org.joda.time.Days days44 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days43);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration49 = duration47.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration49, readableInstant50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Interval interval53 = duration49.toIntervalFrom(readableInstant52);
        org.joda.time.Days days54 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval53);
        org.joda.time.Days days56 = days54.minus((int) '4');
        org.joda.time.Days days57 = days44.minus(days56);
        org.joda.time.PeriodType periodType58 = days44.getPeriodType();
        org.joda.time.PeriodType periodType59 = periodType58.withSecondsRemoved();
        org.joda.time.PeriodType periodType60 = periodType59.withMinutesRemoved();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = duration34.toPeriod(periodType60, chronology61);
        org.joda.time.format.PeriodFormatter periodFormatter63 = periodFormatter31.withParseType(periodType60);
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
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(days54);
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertNotNull(days57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(periodFormatter63);
    }

    @Test
    public void test23692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23692");
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
        java.util.Locale locale10 = periodFormatter9.getLocale();
        boolean boolean11 = periodFormatter9.isParser();
        boolean boolean12 = periodFormatter9.isPrinter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23693");
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
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, readableInstant20);
        org.joda.time.Duration duration23 = duration7.plus((long) 8);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardSeconds((long) 10);
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
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Interval interval46 = duration42.toIntervalTo(readableInstant45);
        boolean boolean47 = duration25.isLongerThan((org.joda.time.ReadableDuration) duration42);
        int int48 = duration7.compareTo((org.joda.time.ReadableDuration) duration25);
        java.lang.String str49 = duration7.toString();
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration7);
        org.joda.time.Minutes minutes51 = duration7.toStandardMinutes();
        org.joda.time.Duration duration53 = org.joda.time.Duration.standardSeconds(3L);
        boolean boolean54 = duration7.isEqual((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = duration7.toPeriod(chronology55);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration25);
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
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PT0S" + "'", str49, "PT0S");
        org.junit.Assert.assertNotNull(minutes51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(period56);
    }

    @Test
    public void test23694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23694");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days1 = org.joda.time.Days.ONE;
        int int2 = days0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days1);
        org.joda.time.Days days4 = days1.multipliedBy((int) '#');
        org.joda.time.Days days5 = org.joda.time.Days.SIX;
        org.joda.time.Days days6 = days4.minus(days5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days8 = days4.minus((-2147483647));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 35 + 2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
    }

    @Test
    public void test23695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23695");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(7);
        org.joda.time.Hours hours3 = hours1.plus((int) (byte) 1);
        org.joda.time.Hours hours4 = hours1.negated();
        org.joda.time.Hours hours5 = hours1.negated();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours5);
    }

    @Test
    public void test23696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23696");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(105L);
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration6 = duration4.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Interval interval10 = duration6.toIntervalFrom(readableInstant9);
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval10);
        org.joda.time.Period period12 = weeks11.toPeriod();
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks15 = org.joda.time.Weeks.weeks(1);
        boolean boolean16 = weeks13.isGreaterThan(weeks15);
        org.joda.time.Weeks weeks17 = weeks11.minus(weeks13);
        org.joda.time.Weeks weeks18 = weeks11.negated();
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) weeks18);
        org.joda.time.Weeks weeks20 = null;
        boolean boolean21 = weeks18.isGreaterThan(weeks20);
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.weeks(1);
        boolean boolean25 = weeks22.isGreaterThan(weeks24);
        org.joda.time.DurationFieldType durationFieldType26 = weeks24.getFieldType();
        boolean boolean27 = weeks18.isSupported(durationFieldType26);
        org.joda.time.Weeks weeks29 = weeks18.plus(0);
        org.joda.time.Duration duration30 = weeks29.toStandardDuration();
        int int31 = duration1.compareTo((org.joda.time.ReadableDuration) duration30);
        long long32 = duration30.getStandardHours();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test23697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23697");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(10);
        java.lang.String str2 = hours1.toString();
        org.joda.time.Hours hours3 = hours1.negated();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT10H" + "'", str2, "PT10H");
        org.junit.Assert.assertNotNull(hours3);
    }

    @Test
    public void test23698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23698");
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
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period12);
        org.joda.time.PeriodType periodType14 = period12.getPeriodType();
        org.joda.time.PeriodType periodType15 = periodType14.withMonthsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter16 = periodFormatter8.withParseType(periodType14);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.format.PeriodFormatter periodFormatter18 = periodFormatter8.withParseType(periodType17);
        java.util.Locale locale19 = null;
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter18.withLocale(locale19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodFormatter16);
        org.junit.Assert.assertNotNull(periodFormatter18);
        org.junit.Assert.assertNotNull(periodFormatter20);
    }

    @Test
    public void test23699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23699");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = seconds3.plus(seconds4);
        org.joda.time.Seconds seconds7 = seconds4.plus((int) (byte) 0);
        org.joda.time.Seconds seconds9 = seconds7.minus((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.months();
        int int11 = seconds7.get(durationFieldType10);
        boolean boolean12 = period2.isSupported(durationFieldType10);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray14 = new org.joda.time.DurationFieldType[] { durationFieldType10, durationFieldType13 };
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.forFields(durationFieldTypeArray14);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.forFields(durationFieldTypeArray14);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.forFields(durationFieldTypeArray14);
        org.joda.time.PeriodType periodType18 = periodType17.withYearsRemoved();
        org.joda.time.PeriodType periodType19 = periodType18.withMonthsRemoved();
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(durationFieldTypeArray14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test23700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23700");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType3 = minutes2.getFieldType();
        int int4 = minutes2.getMinutes();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        org.joda.time.Minutes minutes13 = minutes11.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes14 = minutes5.minus(minutes11);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period19 = period17.minusMonths(0);
        org.joda.time.Minutes minutes20 = period19.toStandardMinutes();
        org.joda.time.Minutes minutes22 = minutes20.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) minutes20, chronology23);
        org.joda.time.Minutes minutes25 = minutes5.minus(minutes20);
        org.joda.time.DurationFieldType durationFieldType27 = minutes25.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType28 = minutes25.getPeriodType();
        org.joda.time.Minutes minutes29 = minutes25.negated();
        org.joda.time.Minutes minutes30 = minutes2.minus(minutes29);
        org.joda.time.DurationFieldType durationFieldType31 = minutes2.getFieldType();
        org.joda.time.Minutes minutes32 = org.joda.time.Minutes.ZERO;
        org.joda.time.Minutes minutes34 = minutes32.dividedBy((int) (byte) -1);
        org.joda.time.Minutes minutes35 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period40 = period38.minusMonths(0);
        org.joda.time.Minutes minutes41 = period40.toStandardMinutes();
        org.joda.time.Minutes minutes43 = minutes41.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes44 = minutes35.minus(minutes41);
        org.joda.time.Period period47 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period49 = period47.minusMonths(0);
        org.joda.time.Minutes minutes50 = period49.toStandardMinutes();
        org.joda.time.Minutes minutes52 = minutes50.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((java.lang.Object) minutes50, chronology53);
        org.joda.time.Minutes minutes55 = minutes35.minus(minutes50);
        org.joda.time.Period period58 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period59 = period58.negated();
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = period59.toDurationTo(readableInstant60);
        org.joda.time.Minutes minutes62 = period59.toStandardMinutes();
        org.joda.time.PeriodType periodType63 = minutes62.getPeriodType();
        boolean boolean64 = minutes50.isLessThan(minutes62);
        org.joda.time.Period period67 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period69 = period67.minusMonths(0);
        org.joda.time.Minutes minutes70 = period69.toStandardMinutes();
        org.joda.time.Duration duration71 = minutes70.toStandardDuration();
        org.joda.time.Minutes minutes73 = minutes70.multipliedBy((int) (short) 1);
        int int74 = minutes73.getMinutes();
        boolean boolean75 = minutes50.isLessThan(minutes73);
        boolean boolean76 = minutes34.isGreaterThan(minutes73);
        org.joda.time.Minutes minutes78 = minutes73.plus((int) (byte) 10);
        boolean boolean79 = minutes2.isGreaterThan(minutes78);
        org.joda.time.Period period82 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period84 = period82.minusMonths(0);
        org.joda.time.Minutes minutes85 = period84.toStandardMinutes();
        org.joda.time.Duration duration86 = minutes85.toStandardDuration();
        org.joda.time.Minutes minutes88 = minutes85.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes90 = minutes88.multipliedBy(2);
        boolean boolean91 = minutes78.isGreaterThan(minutes90);
        org.joda.time.Minutes minutes93 = minutes90.dividedBy((-105));
        int int94 = minutes90.size();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14400 + "'", int4 == 14400);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertNotNull(minutes52);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(minutes62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(minutes70);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(minutes73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(minutes78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(minutes85);
        org.junit.Assert.assertNotNull(duration86);
        org.junit.Assert.assertNotNull(minutes88);
        org.junit.Assert.assertNotNull(minutes90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(minutes93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
    }

    @Test
    public void test23701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23701");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration1 = minutes0.toStandardDuration();
        long long2 = duration1.getStandardSeconds();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Duration duration9 = minutes8.toStandardDuration();
        org.joda.time.Minutes minutes11 = minutes8.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration12 = minutes8.toStandardDuration();
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period15.minusMonths(0);
        org.joda.time.Minutes minutes18 = period17.toStandardMinutes();
        org.joda.time.Duration duration19 = minutes18.toStandardDuration();
        org.joda.time.Period period20 = duration19.toPeriod();
        boolean boolean21 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.days();
        org.joda.time.Period period24 = duration12.toPeriodTo(readableInstant22, periodType23);
        org.joda.time.Duration duration25 = duration1.plus((org.joda.time.ReadableDuration) duration12);
        java.lang.String str26 = duration1.toString();
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardDays(0L);
        boolean boolean29 = duration1.isEqual((org.joda.time.ReadableDuration) duration28);
        long long30 = duration1.getStandardDays();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = duration1.toPeriodTo(readableInstant31);
        org.joda.time.Duration duration34 = duration1.minus((-2L));
        org.joda.time.Duration duration35 = new org.joda.time.Duration((java.lang.Object) duration34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = duration35.toPeriod(chronology36);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-128849018880L) + "'", long2 == (-128849018880L));
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT-128849018880S" + "'", str26, "PT-128849018880S");
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1491308L) + "'", long30 == (-1491308L));
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test23702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23702");
        org.joda.time.Period period1 = org.joda.time.Period.millis(2400);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test23703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23703");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        int int2 = weeks1.getWeeks();
        org.joda.time.Period period3 = weeks1.toPeriod();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        boolean boolean7 = weeks4.isLessThan(weeks6);
        boolean boolean8 = weeks1.equals((java.lang.Object) weeks6);
        org.joda.time.Weeks weeks10 = weeks6.multipliedBy((int) (short) 1);
        org.joda.time.MutablePeriod mutablePeriod11 = weeks6.toMutablePeriod();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test23704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23704");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        boolean boolean6 = weeks3.isLessThan(weeks5);
        boolean boolean7 = weeks2.isGreaterThan(weeks5);
        org.joda.time.Weeks weeks9 = weeks5.dividedBy(52);
        org.joda.time.Weeks weeks11 = weeks5.plus(2147483647);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeks(1);
        boolean boolean15 = weeks12.isGreaterThan(weeks14);
        java.lang.Object obj16 = null;
        boolean boolean17 = weeks14.equals(obj16);
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks21 = weeks19.dividedBy(100);
        org.joda.time.Weeks weeks22 = weeks14.minus(weeks21);
        org.joda.time.Weeks weeks24 = weeks21.plus(35);
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.weeks(6);
        boolean boolean27 = weeks24.isGreaterThan(weeks26);
        org.joda.time.Weeks weeks28 = weeks11.minus(weeks26);
        org.joda.time.Weeks weeks30 = weeks11.minus(8);
        org.joda.time.Weeks weeks32 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks33 = weeks32.negated();
        org.joda.time.Weeks weeks34 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval35 = null;
        org.joda.time.Weeks weeks36 = org.joda.time.Weeks.weeksIn(readableInterval35);
        boolean boolean37 = weeks34.isLessThan(weeks36);
        boolean boolean38 = weeks33.isGreaterThan(weeks36);
        org.joda.time.PeriodType periodType39 = weeks33.getPeriodType();
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.Weeks weeks41 = org.joda.time.Weeks.weeksIn(readableInterval40);
        org.joda.time.Weeks weeks43 = weeks41.plus(11);
        org.joda.time.Weeks weeks45 = weeks41.plus((int) (short) 100);
        boolean boolean46 = weeks33.isLessThan(weeks41);
        int int47 = weeks33.getWeeks();
        org.joda.time.Weeks weeks48 = weeks30.minus(weeks33);
        org.joda.time.PeriodType periodType49 = weeks48.getPeriodType();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertNotNull(weeks43);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(weeks48);
        org.junit.Assert.assertNotNull(periodType49);
    }

    @Test
    public void test23705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23705");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Period period1 = new org.joda.time.Period((java.lang.Object) minutes0);
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        org.joda.time.Minutes minutes8 = period7.toStandardMinutes();
        org.joda.time.Minutes minutes10 = minutes8.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes11 = minutes2.minus(minutes8);
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period16 = period14.minusMonths(0);
        org.joda.time.Minutes minutes17 = period16.toStandardMinutes();
        org.joda.time.Minutes minutes19 = minutes17.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((java.lang.Object) minutes17, chronology20);
        org.joda.time.Minutes minutes22 = minutes2.minus(minutes17);
        org.joda.time.DurationFieldType durationFieldType24 = minutes22.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType25 = minutes22.getPeriodType();
        org.joda.time.Minutes minutes26 = minutes22.negated();
        org.joda.time.DurationFieldType durationFieldType27 = minutes22.getFieldType();
        org.joda.time.Period period29 = period1.withFieldAdded(durationFieldType27, 105);
        org.joda.time.Chronology chronology30 = null;
        boolean boolean31 = durationFieldType27.isSupported(chronology30);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test23706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23706");
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
        org.joda.time.Period period19 = duration6.toPeriodTo(readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = duration6.toPeriodFrom(readableInstant20);
        org.joda.time.Duration duration22 = period21.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period28 = period26.minusMonths(0);
        org.joda.time.Minutes minutes29 = period28.toStandardMinutes();
        org.joda.time.Duration duration30 = minutes29.toStandardDuration();
        org.joda.time.Period period31 = duration30.toPeriod();
        org.joda.time.Duration duration33 = duration30.plus((long) (byte) 0);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = duration33.toPeriod(chronology35);
        org.joda.time.Period period39 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period41 = period39.minusMonths(0);
        org.joda.time.Minutes minutes42 = period41.toStandardMinutes();
        org.joda.time.Duration duration43 = minutes42.toStandardDuration();
        org.joda.time.Period period44 = duration43.toPeriod();
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
        boolean boolean64 = duration43.isEqual((org.joda.time.ReadableDuration) duration54);
        org.joda.time.Duration duration66 = duration43.plus((long) (short) 100);
        org.joda.time.Duration duration68 = duration66.minus((long) '4');
        org.joda.time.Duration duration69 = duration33.minus((org.joda.time.ReadableDuration) duration68);
        long long70 = duration68.getStandardHours();
        org.joda.time.Duration duration71 = duration22.plus((org.joda.time.ReadableDuration) duration68);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period44);
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(duration71);
    }

    @Test
    public void test23707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23707");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 0);
        org.joda.time.Period period3 = period1.plusMonths((int) '4');
        org.joda.time.Period period5 = period3.withWeeks(14400);
        org.joda.time.Period period6 = period5.toPeriod();
        org.joda.time.Period period8 = period6.minusHours(194);
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds11 = seconds9.plus(seconds10);
        org.joda.time.Seconds seconds13 = seconds10.plus((int) (byte) 0);
        org.joda.time.Seconds seconds15 = seconds10.minus(8);
        org.joda.time.DurationFieldType durationFieldType16 = seconds10.getFieldType();
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds20 = seconds18.multipliedBy(10);
        org.joda.time.Seconds seconds21 = seconds17.minus(seconds18);
        org.joda.time.Seconds seconds22 = seconds10.plus(seconds21);
        org.joda.time.Seconds seconds24 = seconds22.plus(0);
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) seconds24);
        org.joda.time.Period period26 = period8.plus((org.joda.time.ReadablePeriod) seconds25);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test23708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23708");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = period0.toDurationFrom(readableInstant1);
        org.joda.time.Minutes minutes3 = period0.toStandardMinutes();
        org.joda.time.Minutes minutes5 = minutes3.multipliedBy(2147483647);
        org.joda.time.Period period6 = new org.joda.time.Period((java.lang.Object) minutes5);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes5);
    }

    @Test
    public void test23709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23709");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) 100);
        long long2 = duration1.getStandardMinutes();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test23710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23710");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) 56);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withYearsRemoved();
        org.joda.time.PeriodType periodType7 = periodType4.withHoursRemoved();
        org.joda.time.Period period8 = duration1.toPeriodTo(readableInstant2, periodType7);
        org.joda.time.Period period10 = org.joda.time.Period.seconds(8);
        org.joda.time.Duration duration11 = period10.toStandardDuration();
        boolean boolean12 = duration1.isEqual((org.joda.time.ReadableDuration) duration11);
        org.joda.time.Duration duration13 = duration1.toDuration();
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test23711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23711");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusDays((int) (byte) 10);
        org.joda.time.Period period8 = period2.plusSeconds(87);
        int int9 = period2.getMinutes();
        org.joda.time.DurationFieldType[] durationFieldTypeArray10 = period2.getFieldTypes();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.forFields(durationFieldTypeArray10);
        org.joda.time.PeriodType periodType12 = periodType11.withSecondsRemoved();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test23712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23712");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration9 = minutes5.toStandardDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.Duration duration16 = minutes15.toStandardDuration();
        org.joda.time.Period period17 = duration16.toPeriod();
        boolean boolean18 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.days();
        org.joda.time.Period period21 = duration9.toPeriodTo(readableInstant19, periodType20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = duration9.toPeriodFrom(readableInstant22);
        org.joda.time.Period period24 = period23.negated();
        org.joda.time.Period period26 = period24.minusHours(8);
        org.joda.time.Period period28 = period24.withSeconds((int) (short) 0);
        org.joda.time.Period period30 = period28.plusMonths((int) (byte) 10);
        int[] intArray31 = period28.getValues();
        int int32 = period28.getSeconds();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test23713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23713");
        org.joda.time.Period period1 = org.joda.time.Period.months(377884);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test23714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23714");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutesIn(readableInterval0);
        org.joda.time.Minutes minutes3 = minutes1.plus((int) (short) -1);
        org.joda.time.Minutes minutes4 = minutes3.negated();
        org.joda.time.PeriodType periodType5 = minutes4.getPeriodType();
        org.joda.time.Duration duration6 = minutes4.toStandardDuration();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test23715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23715");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days1 = org.joda.time.Days.ONE;
        int int2 = days0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days1);
        org.joda.time.Days days4 = days1.multipliedBy((int) '#');
        org.joda.time.Days days5 = org.joda.time.Days.SIX;
        org.joda.time.Days days6 = days4.minus(days5);
        org.joda.time.Days days8 = days4.dividedBy(105);
        org.joda.time.DurationFieldType durationFieldType9 = days4.getFieldType();
        org.joda.time.Days days11 = days4.multipliedBy((int) (byte) -1);
        org.joda.time.Days days13 = days4.minus((-4188));
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days13);
    }

    @Test
    public void test23716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23716");
        org.joda.time.Period period1 = org.joda.time.Period.months(400);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test23717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23717");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT-98S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23718");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.Period period6 = org.joda.time.Period.days(10);
        org.joda.time.Period period8 = period6.plusMonths((int) 'a');
        org.joda.time.Period period10 = period6.plusSeconds((int) (short) 100);
        org.joda.time.Period period12 = period10.minusMonths((int) 'a');
        org.joda.time.Period period13 = period2.withFields((org.joda.time.ReadablePeriod) period12);
        java.lang.String str14 = period12.toString();
        int int15 = period12.getMinutes();
        org.joda.time.Period period17 = period12.plusSeconds(0);
        org.joda.time.Period period18 = period17.negated();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P-97M10DT100S" + "'", str14, "P-97M10DT100S");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test23719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23719");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Period period4 = period2.minusYears(0);
        org.joda.time.Period period6 = period4.minusMillis(0);
        org.joda.time.Period period8 = period6.withYears((int) '#');
        org.joda.time.Hours hours9 = period6.toStandardHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
    }

    @Test
    public void test23720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23720");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isPrinter();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str8 = periodType7.getName();
        org.joda.time.PeriodType periodType9 = periodType7.withHoursRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter2.withParseType(periodType7);
        org.joda.time.format.PeriodPrinter periodPrinter11 = null;
        org.joda.time.format.PeriodParser periodParser12 = null;
        org.joda.time.format.PeriodFormatter periodFormatter13 = new org.joda.time.format.PeriodFormatter(periodPrinter11, periodParser12);
        boolean boolean14 = periodFormatter13.isParser();
        org.joda.time.Days days15 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType16 = days15.getPeriodType();
        org.joda.time.PeriodType periodType17 = periodType16.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter18 = periodFormatter13.withParseType(periodType16);
        boolean boolean19 = periodFormatter18.isPrinter();
        boolean boolean20 = periodFormatter18.isParser();
        org.joda.time.format.PeriodParser periodParser21 = periodFormatter18.getParser();
        org.joda.time.PeriodType periodType22 = periodFormatter18.getParseType();
        org.joda.time.format.PeriodFormatter periodFormatter23 = periodFormatter2.withParseType(periodType22);
        org.joda.time.PeriodType periodType24 = periodFormatter23.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter25 = periodFormatter23.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod27 = periodFormatter23.parseMutablePeriod("P-100W");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "YearMonthDay" + "'", str8, "YearMonthDay");
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodFormatter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(periodParser21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodFormatter23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNull(periodPrinter25);
    }

    @Test
    public void test23721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23721");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((-35));
        org.joda.time.Duration duration2 = hours1.toStandardDuration();
        org.joda.time.Duration duration5 = duration2.withDurationAdded(596L, (-97));
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test23722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23722");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutesIn(readableInterval0);
        org.joda.time.Minutes minutes3 = minutes1.plus((int) (short) -1);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        org.joda.time.Minutes minutes9 = period8.toStandardMinutes();
        org.joda.time.Duration duration10 = minutes9.toStandardDuration();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Duration duration17 = minutes16.toStandardDuration();
        boolean boolean18 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = new org.joda.time.Duration(readableInstant19, readableInstant20);
        org.joda.time.Duration duration22 = duration10.minus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Period period23 = duration10.toPeriod();
        org.joda.time.Duration duration25 = duration10.plus(0L);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Interval interval27 = duration25.toIntervalTo(readableInstant26);
        org.joda.time.Minutes minutes28 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval27);
        org.joda.time.Minutes minutes30 = minutes28.plus((-35));
        org.joda.time.Minutes minutes31 = minutes3.plus(minutes28);
        org.joda.time.PeriodType periodType32 = minutes28.getPeriodType();
        org.joda.time.Minutes minutes33 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) minutes28);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(minutes33);
    }

    @Test
    public void test23723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23723");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks3 = weeks1.dividedBy(100);
        org.joda.time.Weeks weeks4 = weeks1.negated();
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        org.joda.time.Weeks weeks8 = weeks6.dividedBy((int) (byte) -1);
        org.joda.time.Weeks weeks9 = null;
        org.joda.time.Weeks weeks10 = weeks8.minus(weeks9);
        org.joda.time.Weeks weeks12 = weeks8.dividedBy(2147483647);
        boolean boolean13 = weeks4.isGreaterThan(weeks12);
        org.joda.time.Weeks weeks14 = weeks4.negated();
        org.joda.time.Period period15 = weeks4.toPeriod();
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.weeks(1);
        boolean boolean19 = weeks16.isGreaterThan(weeks18);
        java.lang.Object obj20 = null;
        boolean boolean21 = weeks18.equals(obj20);
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks25 = weeks23.dividedBy(100);
        org.joda.time.Weeks weeks26 = weeks18.minus(weeks25);
        org.joda.time.Weeks weeks28 = weeks25.plus(35);
        org.joda.time.Weeks weeks30 = weeks25.multipliedBy(10);
        org.joda.time.Duration duration31 = weeks25.toStandardDuration();
        org.joda.time.Weeks weeks32 = weeks4.plus(weeks25);
        org.joda.time.Weeks weeks33 = org.joda.time.Weeks.ZERO;
        java.lang.String str34 = weeks33.toString();
        int int35 = weeks33.size();
        org.joda.time.PeriodType periodType36 = weeks33.getPeriodType();
        org.joda.time.Weeks weeks37 = null;
        org.joda.time.Weeks weeks38 = weeks33.minus(weeks37);
        org.joda.time.Weeks weeks39 = weeks25.plus(weeks33);
        org.joda.time.Weeks weeks40 = weeks39.negated();
        org.joda.time.Weeks weeks42 = org.joda.time.Weeks.weeks(10);
        org.joda.time.Weeks weeks44 = weeks42.minus(118);
        org.joda.time.PeriodType periodType45 = weeks42.getPeriodType();
        org.joda.time.Weeks weeks46 = weeks40.plus(weeks42);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "P0W" + "'", str34, "P0W");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(weeks46);
    }

    @Test
    public void test23724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23724");
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
        org.joda.time.Days days15 = days4.plus((-116));
        org.joda.time.DurationFieldType durationFieldType16 = days15.getFieldType();
        org.joda.time.Duration duration17 = days15.toStandardDuration();
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
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(duration17);
    }

    @Test
    public void test23725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23725");
        org.joda.time.Days days1 = org.joda.time.Days.days((-95));
        org.joda.time.Duration duration2 = days1.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        org.joda.time.Period period10 = period6.minusSeconds((int) (byte) 100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = period6.getFieldTypes();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.forFields(durationFieldTypeArray11);
        org.joda.time.PeriodType periodType13 = periodType12.withMonthsRemoved();
        org.joda.time.Period period14 = duration2.toPeriodFrom(readableInstant3, periodType12);
        java.lang.String str15 = duration2.toString();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT-8208000S" + "'", str15, "PT-8208000S");
    }

    @Test
    public void test23726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23726");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.parseMinutes("PT0H");
        org.joda.time.Minutes minutes11 = minutes5.minus(minutes10);
        org.joda.time.Minutes minutes13 = minutes10.dividedBy(7);
        org.joda.time.DurationFieldType durationFieldType14 = null;
        int int15 = minutes10.get(durationFieldType14);
        org.joda.time.PeriodType periodType16 = minutes10.getPeriodType();
        org.joda.time.Minutes minutes18 = minutes10.multipliedBy((-95));
        org.joda.time.Minutes minutes20 = minutes10.dividedBy(10);
        org.joda.time.Minutes minutes22 = minutes20.plus(40);
        org.joda.time.Minutes minutes23 = minutes22.negated();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes23);
    }

    @Test
    public void test23727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23727");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Duration duration9 = duration6.plus((long) (byte) 0);
        org.joda.time.Duration duration11 = duration6.withMillis((long) 1);
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Duration duration20 = minutes19.toStandardDuration();
        org.joda.time.Period period21 = duration20.toPeriod();
        org.joda.time.Duration duration23 = duration20.plus((long) (byte) 0);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration23);
        org.joda.time.Duration duration25 = duration11.plus((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Duration duration27 = duration23.minus((long) (-10));
        org.joda.time.ReadableDuration readableDuration28 = null;
        boolean boolean29 = duration23.isLongerThan(readableDuration28);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test23728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23728");
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
        org.joda.time.Seconds seconds44 = seconds40.dividedBy(999);
        org.joda.time.Seconds seconds46 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds47 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds48 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds49 = seconds47.plus(seconds48);
        org.joda.time.Seconds seconds51 = seconds47.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds52 = seconds46.plus(seconds47);
        org.joda.time.Seconds seconds54 = seconds47.multipliedBy((int) (short) 1);
        org.joda.time.Seconds seconds56 = seconds54.multipliedBy((int) '4');
        org.joda.time.Seconds seconds58 = seconds56.multipliedBy(87);
        org.joda.time.Seconds seconds60 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds61 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds62 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds63 = seconds61.plus(seconds62);
        org.joda.time.Seconds seconds65 = seconds61.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds66 = seconds60.plus(seconds61);
        org.joda.time.Seconds seconds68 = seconds61.multipliedBy((int) (short) 1);
        org.joda.time.Seconds seconds70 = seconds68.dividedBy((int) 'a');
        org.joda.time.Seconds seconds71 = seconds70.negated();
        org.joda.time.Seconds seconds72 = seconds56.minus(seconds71);
        int int73 = seconds72.getSeconds();
        org.joda.time.Seconds seconds74 = seconds40.plus(seconds72);
        org.joda.time.Seconds seconds76 = seconds74.dividedBy((-9500));
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
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertNotNull(seconds46);
        org.junit.Assert.assertNotNull(seconds47);
        org.junit.Assert.assertNotNull(seconds48);
        org.junit.Assert.assertNotNull(seconds49);
        org.junit.Assert.assertNotNull(seconds51);
        org.junit.Assert.assertNotNull(seconds52);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertNotNull(seconds56);
        org.junit.Assert.assertNotNull(seconds58);
        org.junit.Assert.assertNotNull(seconds60);
        org.junit.Assert.assertNotNull(seconds61);
        org.junit.Assert.assertNotNull(seconds62);
        org.junit.Assert.assertNotNull(seconds63);
        org.junit.Assert.assertNotNull(seconds65);
        org.junit.Assert.assertNotNull(seconds66);
        org.junit.Assert.assertNotNull(seconds68);
        org.junit.Assert.assertNotNull(seconds70);
        org.junit.Assert.assertNotNull(seconds71);
        org.junit.Assert.assertNotNull(seconds72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 104 + "'", int73 == 104);
        org.junit.Assert.assertNotNull(seconds74);
        org.junit.Assert.assertNotNull(seconds76);
    }

    @Test
    public void test23729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23729");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean4 = weeks2.isGreaterThan(weeks3);
        org.joda.time.Duration duration5 = weeks2.toStandardDuration();
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.ZERO;
        java.lang.String str7 = weeks6.toString();
        int int8 = weeks6.size();
        org.joda.time.PeriodType periodType9 = weeks6.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = weeks6.toMutablePeriod();
        org.joda.time.Weeks weeks11 = weeks2.minus(weeks6);
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.TWO;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeks(10);
        org.joda.time.Weeks weeks15 = weeks14.negated();
        java.lang.String str16 = weeks14.toString();
        boolean boolean17 = weeks12.isLessThan(weeks14);
        boolean boolean18 = weeks6.isLessThan(weeks14);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeksIn(readableInterval19);
        org.joda.time.Weeks weeks22 = weeks20.dividedBy(11);
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.weeks(35);
        org.joda.time.Weeks weeks26 = weeks24.multipliedBy(5);
        org.joda.time.Period period27 = weeks26.toPeriod();
        boolean boolean28 = weeks20.isGreaterThan(weeks26);
        org.joda.time.Weeks weeks29 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks30 = weeks29.negated();
        org.joda.time.Weeks weeks31 = org.joda.time.Weeks.ZERO;
        java.lang.String str32 = weeks31.toString();
        int int33 = weeks31.size();
        org.joda.time.PeriodType periodType34 = weeks31.getPeriodType();
        org.joda.time.Weeks weeks36 = weeks31.minus(7);
        java.lang.String str37 = weeks31.toString();
        org.joda.time.Weeks weeks38 = weeks31.negated();
        org.joda.time.Weeks weeks39 = weeks30.minus(weeks38);
        boolean boolean40 = weeks26.isGreaterThan(weeks38);
        org.joda.time.Weeks weeks41 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks43 = weeks41.dividedBy(1);
        org.joda.time.Weeks weeks44 = org.joda.time.Weeks.MIN_VALUE;
        boolean boolean45 = weeks43.isGreaterThan(weeks44);
        org.joda.time.Duration duration46 = weeks43.toStandardDuration();
        org.joda.time.Weeks weeks47 = weeks26.minus(weeks43);
        boolean boolean48 = weeks14.isGreaterThan(weeks47);
        java.lang.String str49 = weeks47.toString();
        org.joda.time.Weeks weeks50 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval51 = null;
        org.joda.time.Weeks weeks52 = org.joda.time.Weeks.weeksIn(readableInterval51);
        boolean boolean53 = weeks50.isLessThan(weeks52);
        org.joda.time.Weeks weeks55 = weeks52.multipliedBy(10);
        org.joda.time.Weeks weeks56 = org.joda.time.Weeks.ZERO;
        java.lang.String str57 = weeks56.toString();
        int int58 = weeks56.size();
        org.joda.time.PeriodType periodType59 = weeks56.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod60 = weeks56.toMutablePeriod();
        org.joda.time.Weeks weeks62 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks63 = weeks62.negated();
        org.joda.time.Weeks weeks64 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.Weeks weeks66 = org.joda.time.Weeks.weeksIn(readableInterval65);
        boolean boolean67 = weeks64.isLessThan(weeks66);
        boolean boolean68 = weeks63.isGreaterThan(weeks66);
        org.joda.time.Weeks weeks69 = null;
        org.joda.time.Weeks weeks70 = weeks66.minus(weeks69);
        org.joda.time.DurationFieldType durationFieldType71 = weeks70.getFieldType();
        org.joda.time.Weeks weeks72 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks74 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks75 = weeks74.negated();
        org.joda.time.Weeks weeks76 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval77 = null;
        org.joda.time.Weeks weeks78 = org.joda.time.Weeks.weeksIn(readableInterval77);
        boolean boolean79 = weeks76.isLessThan(weeks78);
        boolean boolean80 = weeks75.isGreaterThan(weeks78);
        boolean boolean81 = weeks72.isLessThan(weeks75);
        org.joda.time.Weeks weeks82 = weeks70.plus(weeks75);
        org.joda.time.Weeks weeks84 = weeks75.minus(2);
        org.joda.time.Weeks weeks86 = weeks84.dividedBy((-10));
        org.joda.time.Weeks weeks87 = weeks86.negated();
        boolean boolean88 = weeks56.isLessThan(weeks87);
        org.joda.time.Weeks weeks89 = weeks52.minus(weeks87);
        org.joda.time.Weeks weeks91 = weeks52.dividedBy(65);
        org.joda.time.Weeks weeks93 = weeks52.plus((-100));
        int int94 = weeks52.getWeeks();
        org.joda.time.Weeks weeks95 = weeks52.negated();
        org.joda.time.Weeks weeks96 = weeks47.minus(weeks52);
        org.joda.time.PeriodType periodType97 = weeks52.getPeriodType();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0W" + "'", str7, "P0W");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P10W" + "'", str16, "P10W");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "P0W" + "'", str32, "P0W");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "P0W" + "'", str37, "P0W");
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(weeks39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertNotNull(weeks43);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "P-2147483472W" + "'", str49, "P-2147483472W");
        org.junit.Assert.assertNotNull(weeks50);
        org.junit.Assert.assertNotNull(weeks52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertNotNull(weeks56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "P0W" + "'", str57, "P0W");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(mutablePeriod60);
        org.junit.Assert.assertNotNull(weeks62);
        org.junit.Assert.assertNotNull(weeks63);
        org.junit.Assert.assertNotNull(weeks64);
        org.junit.Assert.assertNotNull(weeks66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(weeks70);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertNotNull(weeks72);
        org.junit.Assert.assertNotNull(weeks74);
        org.junit.Assert.assertNotNull(weeks75);
        org.junit.Assert.assertNotNull(weeks76);
        org.junit.Assert.assertNotNull(weeks78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(weeks82);
        org.junit.Assert.assertNotNull(weeks84);
        org.junit.Assert.assertNotNull(weeks86);
        org.junit.Assert.assertNotNull(weeks87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(weeks89);
        org.junit.Assert.assertNotNull(weeks91);
        org.junit.Assert.assertNotNull(weeks93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(weeks95);
        org.junit.Assert.assertNotNull(weeks96);
        org.junit.Assert.assertNotNull(periodType97);
    }

    @Test
    public void test23730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23730");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.Period period6 = org.joda.time.Period.days(10);
        org.joda.time.Period period8 = period6.plusMonths((int) 'a');
        org.joda.time.Period period10 = period6.plusSeconds((int) (short) 100);
        org.joda.time.Period period12 = period10.minusMonths((int) 'a');
        org.joda.time.Period period13 = period2.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Hours hours14 = period2.toStandardHours();
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period17.negated();
        org.joda.time.Period period19 = period2.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period20 = period17.normalizedStandard();
        org.joda.time.Period period22 = period17.plusDays((-2147483596));
        org.joda.time.Period period24 = period17.minusMillis((-1491308));
        org.joda.time.Period period26 = period24.plusYears((-39));
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test23731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23731");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (-36));
        long long2 = duration1.getStandardMinutes();
        org.joda.time.Duration duration3 = duration1.toDuration();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period9 = period7.minusMonths(0);
        org.joda.time.Minutes minutes10 = period9.toStandardMinutes();
        org.joda.time.Duration duration11 = minutes10.toStandardDuration();
        org.joda.time.Minutes minutes13 = minutes10.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration14 = minutes10.toStandardDuration();
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period17.negated();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationTo(readableInstant19);
        boolean boolean21 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration24 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration25 = duration20.plus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration27 = duration24.withMillis(100L);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration27, periodType28);
        org.joda.time.Duration duration31 = org.joda.time.Duration.millis(0L);
        org.joda.time.Duration duration33 = duration27.withDurationAdded((org.joda.time.ReadableDuration) duration31, (int) (byte) 100);
        org.joda.time.Duration duration35 = duration27.plus((long) (short) 0);
        org.joda.time.Duration duration38 = new org.joda.time.Duration(432000L, (long) ' ');
        long long39 = duration38.getStandardDays();
        boolean boolean40 = duration35.isShorterThan((org.joda.time.ReadableDuration) duration38);
        int int41 = duration3.compareTo((org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration38, readableInstant42);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test23732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23732");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType7 = periodType6.withDaysRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withMillisRemoved();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(604800000L, (long) 70, periodType7, chronology9);
        java.lang.String str11 = periodType7.toString();
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType7);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType7);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PeriodType[YearMonthDayTimeNoDays]" + "'", str11, "PeriodType[YearMonthDayTimeNoDays]");
    }

    @Test
    public void test23733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23733");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT0M");
        int int2 = period1.getSeconds();
        int int3 = period1.getSeconds();
        org.joda.time.Period period5 = period1.plusWeeks(2147483645);
        org.joda.time.Period period7 = period1.minusWeeks((-53));
        org.joda.time.Period period9 = period7.minusDays(6);
        org.joda.time.Duration duration10 = org.joda.time.Duration.ZERO;
        org.joda.time.Minutes minutes11 = duration10.toStandardMinutes();
        org.joda.time.Minutes minutes13 = minutes11.plus(3);
        org.joda.time.Minutes minutes15 = minutes13.dividedBy(10);
        org.joda.time.Minutes minutes16 = minutes13.negated();
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Minutes minutes22 = period21.toStandardMinutes();
        org.joda.time.Minutes minutes24 = minutes22.dividedBy((int) (byte) 100);
        int int25 = minutes24.size();
        org.joda.time.PeriodType periodType26 = minutes24.getPeriodType();
        org.joda.time.Duration duration27 = minutes24.toStandardDuration();
        org.joda.time.Minutes minutes28 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period33 = period31.minusMonths(0);
        org.joda.time.Minutes minutes34 = period33.toStandardMinutes();
        org.joda.time.Minutes minutes36 = minutes34.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes37 = minutes28.minus(minutes34);
        org.joda.time.Period period40 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period42 = period40.minusMonths(0);
        org.joda.time.Minutes minutes43 = period42.toStandardMinutes();
        org.joda.time.Minutes minutes45 = minutes43.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((java.lang.Object) minutes43, chronology46);
        org.joda.time.Minutes minutes48 = minutes28.minus(minutes43);
        org.joda.time.Minutes minutes50 = minutes28.dividedBy((-5));
        boolean boolean51 = minutes24.isGreaterThan(minutes28);
        boolean boolean52 = minutes16.isLessThan(minutes28);
        org.joda.time.Minutes minutes54 = org.joda.time.Minutes.minutes(0);
        boolean boolean55 = minutes16.isLessThan(minutes54);
        org.joda.time.DurationFieldType durationFieldType56 = minutes54.getFieldType();
        int int57 = period9.get(durationFieldType56);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(minutes45);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(minutes50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test23734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23734");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = days0.minus(8);
        org.joda.time.Days days5 = days3.minus((-10));
        org.joda.time.Duration duration6 = days3.toStandardDuration();
        org.joda.time.Days days8 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days10 = days8.multipliedBy((int) (short) 100);
        org.joda.time.Days days11 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType12 = days11.getPeriodType();
        org.joda.time.Days days14 = days11.minus(0);
        org.joda.time.Days days15 = days8.minus(days14);
        java.lang.String str16 = days15.toString();
        org.joda.time.DurationFieldType durationFieldType17 = days15.getFieldType();
        org.joda.time.Days days19 = days15.plus(14400);
        boolean boolean20 = days3.isGreaterThan(days15);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P0D" + "'", str16, "P0D");
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23735");
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
        org.joda.time.Period period30 = period28.minusHours(4);
        org.joda.time.Period period32 = period30.withMillis(377884);
        org.joda.time.Period period34 = period32.minusMinutes((-97));
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
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test23736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23736");
        org.joda.time.Period period1 = org.joda.time.Period.millis(87);
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod3 = minutes2.toMutablePeriod();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period9 = period7.minusMonths(0);
        org.joda.time.Minutes minutes10 = period9.toStandardMinutes();
        org.joda.time.Minutes minutes12 = minutes10.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes13 = minutes4.minus(minutes10);
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Minutes minutes21 = minutes19.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((java.lang.Object) minutes19, chronology22);
        org.joda.time.Minutes minutes24 = minutes4.minus(minutes19);
        org.joda.time.DurationFieldType durationFieldType26 = minutes24.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType27 = minutes24.getPeriodType();
        org.joda.time.Minutes minutes29 = minutes24.plus(59);
        boolean boolean30 = minutes2.isLessThan(minutes24);
        org.joda.time.Period period31 = period1.minus((org.joda.time.ReadablePeriod) minutes2);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(period31);
    }

    @Test
    public void test23737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23737");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(268435465);
        org.joda.time.Duration duration3 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration6 = duration3.plus((org.joda.time.ReadableDuration) duration5);
        org.joda.time.Duration duration8 = duration3.minus((long) (-1));
        org.joda.time.Duration duration9 = duration3.toDuration();
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        boolean boolean11 = seconds1.isLessThan(seconds10);
        org.joda.time.PeriodType periodType12 = seconds1.getPeriodType();
        org.joda.time.Duration duration13 = seconds1.toStandardDuration();
        int int14 = seconds1.size();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test23738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23738");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Minutes minutes8 = minutes5.multipliedBy((int) (short) 1);
        org.joda.time.Minutes minutes10 = minutes5.multipliedBy((-1680));
        org.joda.time.Minutes minutes12 = minutes10.minus(56);
        org.joda.time.Minutes minutes14 = minutes10.dividedBy((-20));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes14);
    }

    @Test
    public void test23739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23739");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Period period4 = period1.plusMinutes(1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period1.toDurationTo(readableInstant5);
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period9 = period7.minusMonths(14405);
        org.joda.time.Period period11 = period9.plusMillis((-2));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test23740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23740");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes(14405);
        org.joda.time.Minutes minutes3 = minutes1.multipliedBy(69);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        org.joda.time.Minutes minutes9 = period8.toStandardMinutes();
        org.joda.time.Duration duration10 = minutes9.toStandardDuration();
        org.joda.time.Minutes minutes12 = minutes9.multipliedBy((int) (short) 1);
        java.lang.String str13 = minutes12.toString();
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration18 = duration16.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Interval interval22 = duration18.toIntervalFrom(readableInstant21);
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Minutes minutes25 = minutes23.multipliedBy((-95));
        org.joda.time.Minutes minutes26 = minutes12.minus(minutes25);
        boolean boolean27 = minutes3.isLessThan(minutes25);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT0M" + "'", str13, "PT0M");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test23741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23741");
        org.joda.time.Days days8 = org.joda.time.Days.ONE;
        org.joda.time.Days days9 = org.joda.time.Days.ONE;
        int int10 = days8.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days9);
        org.joda.time.Days days12 = days9.multipliedBy((int) '#');
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        org.joda.time.Days days14 = days12.minus(days13);
        org.joda.time.Days days16 = days12.dividedBy(105);
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        org.joda.time.PeriodType periodType18 = periodType17.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period(600, 17, (-2147483638), 0, (-2147482645), (-14370), 38, 306783378, periodType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test23742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23742");
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
        long long31 = duration30.getMillis();
        org.joda.time.Duration duration33 = duration30.plus((long) 87);
        org.joda.time.format.PeriodPrinter periodPrinter34 = null;
        org.joda.time.format.PeriodParser periodParser35 = null;
        org.joda.time.format.PeriodFormatter periodFormatter36 = new org.joda.time.format.PeriodFormatter(periodPrinter34, periodParser35);
        boolean boolean37 = periodFormatter36.isParser();
        org.joda.time.Days days38 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType39 = days38.getPeriodType();
        org.joda.time.PeriodType periodType40 = periodType39.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter41 = periodFormatter36.withParseType(periodType39);
        org.joda.time.PeriodType periodType42 = periodFormatter41.getParseType();
        java.util.Locale locale43 = periodFormatter41.getLocale();
        org.joda.time.PeriodType periodType44 = periodFormatter41.getParseType();
        org.joda.time.Period period45 = duration30.toPeriod(periodType44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period47 = period45.withMinutes((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-518400000L) + "'", long31 == (-518400000L));
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodFormatter41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(period45);
    }

    @Test
    public void test23743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23743");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.PeriodType periodType3 = seconds0.getPeriodType();
        org.joda.time.Seconds seconds5 = seconds0.minus(56);
        org.joda.time.Seconds seconds7 = seconds5.plus(118);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = seconds7.getFieldType((-64));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -64");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
    }

    @Test
    public void test23744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23744");
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
        org.joda.time.Days days16 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days18 = days16.multipliedBy((int) (short) 100);
        org.joda.time.Days days19 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType20 = days19.getPeriodType();
        org.joda.time.Days days22 = days19.minus(0);
        org.joda.time.Days days23 = days16.minus(days22);
        org.joda.time.Period period24 = period2.withFields((org.joda.time.ReadablePeriod) days22);
        org.joda.time.Period period26 = period24.plusHours((-2147483646));
        org.joda.time.Period period28 = period24.withSeconds((-63));
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
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test23745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23745");
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
        org.joda.time.Duration duration19 = minutes15.toStandardDuration();
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period23 = period22.negated();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationTo(readableInstant24);
        boolean boolean26 = duration19.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration29 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration30 = duration25.plus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Interval interval32 = duration29.toIntervalTo(readableInstant31);
        org.joda.time.Minutes minutes33 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval32);
        boolean boolean34 = minutes6.isGreaterThan(minutes33);
        org.joda.time.Period period35 = new org.joda.time.Period((java.lang.Object) minutes33);
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period40 = period38.minusMonths(0);
        org.joda.time.Minutes minutes41 = period40.toStandardMinutes();
        org.joda.time.Minutes minutes43 = minutes41.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes45 = minutes41.plus(8);
        org.joda.time.Minutes minutes47 = minutes41.dividedBy((int) (byte) 100);
        org.joda.time.Period period50 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period52 = period50.minusMonths(0);
        org.joda.time.Minutes minutes53 = period52.toStandardMinutes();
        org.joda.time.Duration duration54 = minutes53.toStandardDuration();
        org.joda.time.Minutes minutes56 = minutes53.multipliedBy((int) (short) 1);
        java.lang.String str57 = minutes56.toString();
        org.joda.time.Duration duration60 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration62 = duration60.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration62, readableInstant63);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Interval interval66 = duration62.toIntervalFrom(readableInstant65);
        org.joda.time.Minutes minutes67 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval66);
        org.joda.time.Minutes minutes69 = minutes67.multipliedBy((-95));
        org.joda.time.Minutes minutes70 = minutes56.minus(minutes69);
        boolean boolean71 = minutes41.isLessThan(minutes69);
        org.joda.time.Minutes minutes72 = minutes33.minus(minutes69);
        org.joda.time.Period period75 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Minutes minutes76 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period75);
        org.joda.time.Period period79 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period81 = period79.minusMonths(0);
        org.joda.time.Minutes minutes82 = period81.toStandardMinutes();
        org.joda.time.Minutes minutes83 = minutes76.minus(minutes82);
        org.joda.time.DurationFieldType durationFieldType84 = minutes82.getFieldType();
        org.joda.time.Minutes minutes85 = minutes69.plus(minutes82);
        org.joda.time.Minutes minutes87 = minutes82.plus((int) 'a');
        org.joda.time.DurationFieldType durationFieldType88 = minutes87.getFieldType();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(minutes45);
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PT0M" + "'", str57, "PT0M");
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(minutes67);
        org.junit.Assert.assertNotNull(minutes69);
        org.junit.Assert.assertNotNull(minutes70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(minutes72);
        org.junit.Assert.assertNotNull(minutes76);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(minutes82);
        org.junit.Assert.assertNotNull(minutes83);
        org.junit.Assert.assertNotNull(durationFieldType84);
        org.junit.Assert.assertNotNull(minutes85);
        org.junit.Assert.assertNotNull(minutes87);
        org.junit.Assert.assertNotNull(durationFieldType88);
    }
}

