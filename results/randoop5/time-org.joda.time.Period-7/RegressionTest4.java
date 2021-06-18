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
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) 10);
        int int2 = period1.size();
        org.joda.time.Period period4 = period1.plusMonths(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 35);
        org.joda.time.Seconds seconds2 = period1.toStandardSeconds();
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        int int6 = period5.getSeconds();
        org.joda.time.Period period8 = period5.plusMinutes(8);
        org.joda.time.Period period10 = period8.plusYears(11);
        org.joda.time.Period period12 = period8.plusDays((int) (byte) 100);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        int int10 = period9.getDays();
        org.joda.time.Period period12 = period9.withYears(35);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType12);
        org.joda.time.Period period14 = period3.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = period14.minusMonths((int) (short) 100);
        org.joda.time.Period period18 = period14.minusWeeks(97);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        org.joda.time.Period period25 = period21.plusMonths(0);
        org.joda.time.Period period27 = period25.plusMonths((int) '#');
        org.joda.time.Period period29 = period25.plusMinutes((int) (short) 100);
        org.joda.time.Period period31 = period29.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) period29, periodType32);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 'a', periodType35, chronology36);
        org.joda.time.Hours hours38 = period37.toStandardHours();
        org.joda.time.Period period40 = period37.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, readableInstant42, periodType43);
        org.joda.time.DurationFieldType durationFieldType46 = period44.getFieldType((int) (byte) 0);
        org.joda.time.Period period48 = period37.withField(durationFieldType46, 1);
        int int49 = period33.get(durationFieldType46);
        int int50 = period18.get(durationFieldType46);
        org.joda.time.Period period52 = period18.plusWeeks(3);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(hours38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(period52);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period7.plusWeeks((int) (short) 10);
        org.joda.time.Period period11 = period7.withMonths((int) (short) 0);
        org.joda.time.Period period13 = period11.withMonths((int) (byte) -1);
        org.joda.time.Period period15 = period13.plusMonths(0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.withHours(0);
        org.joda.time.Hours hours6 = period3.toStandardHours();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period3.toDurationFrom(readableInstant7);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period3.toDurationTo(readableInstant12);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration13, periodType14);
        org.joda.time.Period period17 = period15.plusSeconds((int) '#');
        org.joda.time.Period period19 = period17.withHours((int) (byte) 1);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.Period period12 = period8.plusMinutes((int) (short) 100);
        org.joda.time.Period period14 = period12.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) period12, periodType15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period12.toDurationTo(readableInstant17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration18);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration18);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.minusSeconds((int) ' ');
        org.joda.time.Period period13 = period11.minusHours((-1));
        org.joda.time.Period period15 = period13.withMillis(98);
        org.joda.time.Period period17 = period15.withMonths((int) (byte) 10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.Period period11 = period7.plusMonths(0);
        org.joda.time.Period period13 = period11.plusMonths((int) '#');
        org.joda.time.Period period15 = period11.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType16 = period11.getPeriodType();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType16, chronology17);
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (-100), periodType16, chronology20);
        org.joda.time.Period period23 = period21.withDays(0);
        org.joda.time.Duration duration24 = period21.toStandardDuration();
        org.joda.time.Period period26 = period21.multipliedBy((-101));
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.Period period5 = period3.plusHours(1);
        org.joda.time.Weeks weeks6 = period5.toStandardWeeks();
        org.joda.time.Weeks weeks7 = period5.toStandardWeeks();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period5.toDurationTo(readableInstant8);
        org.joda.time.Period period11 = period5.withWeeks(1);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        org.joda.time.Period period35 = period31.plusMonths(0);
        org.joda.time.Period period37 = period35.plusMonths((int) '#');
        org.joda.time.Period period39 = period35.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType40 = period35.getPeriodType();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) -1, periodType40, chronology41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant22, (org.joda.time.ReadableDuration) duration27, periodType40);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType40, chronology44);
        org.joda.time.Period period46 = new org.joda.time.Period((int) (byte) 1, 1, 1, (int) (byte) -1, (int) ' ', (int) (short) 100, (-100), 0, periodType40);
        org.joda.time.Period period47 = period5.normalizedStandard(periodType40);
        java.lang.String str48 = period5.toString();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PT1H0.068S" + "'", str48, "PT1H0.068S");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period6.plusWeeks((int) (byte) 1);
        org.joda.time.Period period14 = period12.plusDays((-100));
        org.joda.time.Hours hours15 = period12.toStandardHours();
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(hours15);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 1, chronology1);
        int int3 = period2.getSeconds();
        int int4 = period2.getSeconds();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType11);
        org.joda.time.Period period14 = period12.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period12.toDurationTo(readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period19.plusMonths(0);
        org.joda.time.Period period25 = period23.plusMonths((int) '#');
        org.joda.time.Period period27 = period23.plusMinutes((int) (short) 100);
        org.joda.time.Period period29 = period27.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType31 = period27.getFieldType((int) (byte) 0);
        org.joda.time.Hours hours32 = period27.toStandardHours();
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableInstant34);
        org.joda.time.Period period36 = period35.normalizedStandard();
        org.joda.time.Period period38 = period35.plusMinutes((int) ' ');
        org.joda.time.Period period39 = period38.normalizedStandard();
        org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) period39);
        org.joda.time.format.PeriodFormatter periodFormatter41 = null;
        java.lang.String str42 = period40.toString(periodFormatter41);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant53, readableInstant54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = period55.toDurationFrom(readableInstant56);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant59, readableInstant60);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Duration duration63 = period61.toDurationFrom(readableInstant62);
        org.joda.time.Period period65 = period61.plusMonths(0);
        org.joda.time.Period period67 = period65.plusMonths((int) '#');
        org.joda.time.Period period69 = period65.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType70 = period65.getPeriodType();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period((long) (short) -1, periodType70, chronology71);
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant52, (org.joda.time.ReadableDuration) duration57, periodType70);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((long) (short) 100, periodType70, chronology74);
        org.joda.time.Period period76 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType70);
        org.joda.time.Period period77 = new org.joda.time.Period((java.lang.Object) str42, periodType70);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period((java.lang.Object) hours32, periodType70, chronology78);
        org.joda.time.Period period80 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration16, periodType70);
        org.joda.time.Period period81 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant7, periodType70);
        int int82 = period81.getMonths();
        int int83 = period81.getHours();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(hours32);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT32M" + "'", str42, "PT32M");
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.Period period9 = period5.plusMonths(0);
        org.joda.time.Period period11 = period9.plusMonths((int) '#');
        org.joda.time.Period period13 = period9.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType14 = period9.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) -1, periodType14, chronology15);
        org.joda.time.Period period17 = period1.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Hours hours18 = period17.toStandardHours();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 'a', periodType20, chronology21);
        org.joda.time.Period period24 = period22.withMinutes(0);
        org.joda.time.Period period26 = period24.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod27 = period24.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, readableInstant29, periodType30);
        org.joda.time.Period period33 = period31.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType36);
        org.joda.time.DurationFieldType durationFieldType39 = period37.getFieldType((int) (byte) 0);
        int int40 = period33.indexOf(durationFieldType39);
        org.joda.time.Period period42 = period24.withFieldAdded(durationFieldType39, 10);
        org.joda.time.Period period44 = period17.withField(durationFieldType39, 97);
        org.joda.time.Period period46 = period44.plusYears(52);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType14 = period10.getFieldType((int) (byte) 0);
        org.joda.time.Hours hours15 = period10.toStandardHours();
        int int16 = period10.getSeconds();
        org.joda.time.Period period18 = period10.withMonths(98);
        org.joda.time.Period period19 = period10.negated();
        org.joda.time.Period period21 = period10.withHours((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant31, readableInstant32, periodType33);
        org.joda.time.MutablePeriod mutablePeriod35 = period34.toMutablePeriod();
        org.joda.time.Period period36 = period30.plus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant37, readableInstant38, periodType39);
        org.joda.time.Period period42 = period40.plusMonths((int) '4');
        org.joda.time.Period period43 = period34.withFields((org.joda.time.ReadablePeriod) period42);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) 'a', periodType47, chronology48);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) 'a', periodType51, chronology52);
        org.joda.time.Hours hours54 = period53.toStandardHours();
        org.joda.time.Period period55 = period49.withFields((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Period period57 = period49.withYears(10);
        org.joda.time.Period period58 = period57.toPeriod();
        org.joda.time.Period period60 = period57.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant63, readableInstant64);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.Duration duration67 = period65.toDurationFrom(readableInstant66);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant69, readableInstant70);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Duration duration73 = period71.toDurationFrom(readableInstant72);
        org.joda.time.Period period75 = period71.plusMonths(0);
        org.joda.time.Period period77 = period75.plusMonths((int) '#');
        org.joda.time.Period period79 = period75.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType80 = period75.getPeriodType();
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.Period period82 = new org.joda.time.Period((long) (short) -1, periodType80, chronology81);
        org.joda.time.Period period83 = new org.joda.time.Period(readableInstant62, (org.joda.time.ReadableDuration) duration67, periodType80);
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.Period period85 = new org.joda.time.Period((long) (byte) 0, periodType80, chronology84);
        org.joda.time.Period period86 = period60.normalizedStandard(periodType80);
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.Period period88 = new org.joda.time.Period(0L, (long) 8, periodType80, chronology87);
        org.joda.time.Period period89 = new org.joda.time.Period((java.lang.Object) period34, periodType80);
        org.joda.time.Period period90 = new org.joda.time.Period(readableInstant26, readableInstant27, periodType80);
        org.joda.time.Period period91 = new org.joda.time.Period((long) (short) 0, periodType80);
        org.joda.time.Period period92 = new org.joda.time.Period((long) (short) -1, (long) 'a', periodType80);
        org.joda.time.Period period93 = new org.joda.time.Period((long) 10, periodType80);
        org.joda.time.Period period94 = period21.normalizedStandard(periodType80);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(mutablePeriod35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(hours54);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period94);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.Period period5 = period4.normalizedStandard();
        org.joda.time.Period period7 = period4.plusMinutes((int) ' ');
        org.joda.time.Duration duration8 = period4.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.Period period12 = period11.normalizedStandard();
        org.joda.time.Period period14 = period12.withMinutes((-1));
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', periodType18, chronology19);
        org.joda.time.Period period22 = period20.withMinutes(0);
        org.joda.time.Period period24 = period22.minusSeconds((int) (short) 100);
        org.joda.time.Period period26 = period24.withWeeks((int) (short) -1);
        org.joda.time.Period period27 = period16.minus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period29 = period27.minusDays(10);
        org.joda.time.Period period32 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period34 = period32.plusMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant37, readableInstant38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationFrom(readableInstant40);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period45.toDurationFrom(readableInstant46);
        org.joda.time.Period period49 = period45.plusMonths(0);
        org.joda.time.Period period51 = period49.plusMonths((int) '#');
        org.joda.time.Period period53 = period49.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType54 = period49.getPeriodType();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) (short) -1, periodType54, chronology55);
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration41, periodType54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) (short) 100, periodType54, chronology58);
        org.joda.time.Period period60 = period34.withPeriodType(periodType54);
        org.joda.time.Period period62 = period60.plusMillis((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Period period77 = new org.joda.time.Period(readableInstant75, readableInstant76);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period(readableInstant78, readableInstant79, periodType80);
        org.joda.time.MutablePeriod mutablePeriod82 = period81.toMutablePeriod();
        org.joda.time.Period period83 = period77.plus((org.joda.time.ReadablePeriod) period81);
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.ReadableInstant readableInstant85 = null;
        org.joda.time.PeriodType periodType86 = null;
        org.joda.time.Period period87 = new org.joda.time.Period(readableInstant84, readableInstant85, periodType86);
        org.joda.time.Period period89 = period87.plusMonths((int) '4');
        org.joda.time.Period period90 = period81.withFields((org.joda.time.ReadablePeriod) period89);
        org.joda.time.PeriodType periodType91 = period89.getPeriodType();
        org.joda.time.Period period92 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType91);
        org.joda.time.Period period93 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType91);
        org.joda.time.Period period94 = new org.joda.time.Period(readableInstant63, readableInstant64, periodType91);
        org.joda.time.Period period95 = period60.withPeriodType(periodType91);
        org.joda.time.Period period96 = period27.withPeriodType(periodType91);
        org.joda.time.Period period97 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration8, periodType91);
        org.joda.time.Period period98 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration8);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(mutablePeriod82);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(periodType91);
        org.junit.Assert.assertNotNull(period95);
        org.junit.Assert.assertNotNull(period96);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Days days9 = period8.toStandardDays();
        int int10 = period8.getSeconds();
        org.joda.time.Period period12 = period8.minusWeeks((int) (short) 10);
        org.joda.time.Period period14 = period12.minusDays((int) '4');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.Period period4 = new org.joda.time.Period(97, (int) (short) 0, 100, (int) (short) 100);
        org.joda.time.Period period6 = period4.plusMillis((int) (byte) 10);
        org.joda.time.Period period8 = org.joda.time.Period.years((int) (byte) 10);
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = period8.toString(periodFormatter9);
        org.joda.time.Period period11 = new org.joda.time.Period();
        org.joda.time.DurationFieldType durationFieldType13 = period11.getFieldType(1);
        org.joda.time.Period period15 = period8.withFieldAdded(durationFieldType13, (int) '#');
        boolean boolean16 = period4.isSupported(durationFieldType13);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P10Y" + "'", str10, "P10Y");
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.Period period1 = org.joda.time.Period.hours((-101));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 'a', periodType8, chronology9);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 'a', periodType12, chronology13);
        org.joda.time.Hours hours15 = period14.toStandardHours();
        org.joda.time.Period period16 = period10.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period18 = period10.withYears(10);
        org.joda.time.Period period19 = period18.toPeriod();
        org.joda.time.Period period21 = period18.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.Period period36 = period32.plusMonths(0);
        org.joda.time.Period period38 = period36.plusMonths((int) '#');
        org.joda.time.Period period40 = period36.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType41 = period36.getPeriodType();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (short) -1, periodType41, chronology42);
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration28, periodType41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (byte) 0, periodType41, chronology45);
        org.joda.time.Period period47 = period21.normalizedStandard(periodType41);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(0L, (long) 8, periodType41, chronology48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) (-1), periodType41, chronology50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType41);
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType55 = period53.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period47);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period5.plusYears((int) (byte) 0);
        org.joda.time.Period period11 = period5.withMonths(0);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 'a', periodType13, chronology14);
        org.joda.time.Period period17 = period15.withMinutes(0);
        org.joda.time.Period period19 = period17.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod20 = period17.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.Period period27 = period23.plusMonths(0);
        org.joda.time.Period period29 = period27.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period27.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period27.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType36);
        org.joda.time.Period period39 = period37.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, readableInstant41, periodType42);
        org.joda.time.Period period45 = period43.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant46, readableInstant47, periodType48);
        org.joda.time.DurationFieldType durationFieldType51 = period49.getFieldType((int) (byte) 0);
        int int52 = period45.indexOf(durationFieldType51);
        int int53 = period37.get(durationFieldType51);
        org.joda.time.Period period55 = period27.withField(durationFieldType51, (int) (short) 0);
        int int56 = mutablePeriod20.indexOf(durationFieldType51);
        int int57 = period11.get(durationFieldType51);
        org.joda.time.Period period59 = period11.minusMinutes((-1));
        org.joda.time.Days days60 = period11.toStandardDays();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(days60);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears(10);
        org.joda.time.Period period12 = period11.toPeriod();
        org.joda.time.Period period14 = period11.plusMillis(1);
        int int15 = period14.getMinutes();
        org.joda.time.Period period17 = period14.withYears((-3));
        org.joda.time.Period period19 = period17.plusHours((-100));
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.Period period8 = new org.joda.time.Period(97, (int) ' ', 52, 32, (int) '4', (int) (short) 10, 0, (int) 'a');
        org.joda.time.Period period10 = period8.withMillis(0);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(0L, chronology1);
        org.joda.time.Period period4 = period2.withMinutes((int) '#');
        org.joda.time.Period period6 = period4.withMinutes((int) (short) 0);
        org.joda.time.Period period8 = period6.plusWeeks(197);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType13);
        org.joda.time.MutablePeriod mutablePeriod15 = period14.toMutablePeriod();
        org.joda.time.Period period16 = period10.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType19);
        org.joda.time.Period period22 = period20.plusMonths((int) '4');
        org.joda.time.Period period23 = period14.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.PeriodType periodType24 = period22.getPeriodType();
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType24);
        org.joda.time.Period period26 = new org.joda.time.Period((long) 0, periodType24);
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) 100, periodType24);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType24);
        org.joda.time.Period period29 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType24);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.Period period7 = period6.normalizedStandard();
        org.joda.time.Period period9 = period6.withWeeks(1);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 'a', periodType11, chronology12);
        org.joda.time.Period period15 = period13.withMinutes(0);
        org.joda.time.Period period16 = period6.minus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period18 = period15.minusMillis((int) ' ');
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 'a', periodType20, chronology21);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) 'a', periodType24, chronology25);
        org.joda.time.Hours hours27 = period26.toStandardHours();
        org.joda.time.Period period28 = period22.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period30 = period22.withYears(10);
        org.joda.time.Period period31 = period30.toPeriod();
        org.joda.time.Period period33 = period30.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant42, readableInstant43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationFrom(readableInstant45);
        org.joda.time.Period period48 = period44.plusMonths(0);
        org.joda.time.Period period50 = period48.plusMonths((int) '#');
        org.joda.time.Period period52 = period48.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType53 = period48.getPeriodType();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((long) (short) -1, periodType53, chronology54);
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant35, (org.joda.time.ReadableDuration) duration40, periodType53);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((long) (byte) 0, periodType53, chronology57);
        org.joda.time.Period period59 = period33.normalizedStandard(periodType53);
        org.joda.time.Period period60 = period15.normalizedStandard(periodType53);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((long) 'a', (long) 0, periodType53, chronology61);
        org.joda.time.Period period63 = new org.joda.time.Period((long) 97, (long) (short) 1, periodType53);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(hours27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period60);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(100L, (long) ' ', chronology15);
        org.joda.time.Period period18 = period16.plusHours(1);
        org.joda.time.Weeks weeks19 = period18.toStandardWeeks();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology22);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) str24);
        org.joda.time.Period period27 = period25.plusSeconds((int) 'a');
        org.joda.time.Period period29 = period25.plusYears((int) (byte) 0);
        org.joda.time.Period period31 = period25.withMonths(0);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 'a', periodType33, chronology34);
        org.joda.time.Period period37 = period35.withMinutes(0);
        org.joda.time.Period period39 = period37.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod40 = period37.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period47.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period47.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, readableInstant55, periodType56);
        org.joda.time.Period period59 = period57.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, readableInstant61, periodType62);
        org.joda.time.Period period65 = period63.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, readableInstant67, periodType68);
        org.joda.time.DurationFieldType durationFieldType71 = period69.getFieldType((int) (byte) 0);
        int int72 = period65.indexOf(durationFieldType71);
        int int73 = period57.get(durationFieldType71);
        org.joda.time.Period period75 = period47.withField(durationFieldType71, (int) (short) 0);
        int int76 = mutablePeriod40.indexOf(durationFieldType71);
        int int77 = period31.get(durationFieldType71);
        org.joda.time.Period period79 = period18.withFieldAdded(durationFieldType71, (int) (byte) 1);
        org.joda.time.Period period81 = period2.withField(durationFieldType71, 0);
        java.lang.Class<?> wildcardClass82 = durationFieldType71.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period83 = new org.joda.time.Period((java.lang.Object) durationFieldType71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0.011S" + "'", str24, "PT0.011S");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        int int7 = period6.getYears();
        org.joda.time.Period period9 = period6.withMonths((int) (byte) 100);
        org.joda.time.Period period10 = period6.negated();
        org.joda.time.Period period12 = period10.plusMinutes(3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = org.joda.time.Period.weeks((int) (short) -1);
        org.joda.time.Duration duration3 = period2.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.Period period14 = period10.plusMonths(0);
        org.joda.time.Period period16 = period14.plusMonths((int) '#');
        org.joda.time.Period period18 = period14.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType19 = period14.getPeriodType();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (short) -1, periodType19, chronology20);
        org.joda.time.Period period22 = period6.minus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period24 = period6.plusWeeks((int) (byte) 0);
        org.joda.time.Duration duration25 = period6.toStandardDuration();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology28);
        java.lang.String str30 = period29.toString();
        org.joda.time.Period period31 = new org.joda.time.Period((java.lang.Object) str30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.Period period38 = period34.plusMonths(0);
        org.joda.time.Period period40 = period38.plusMonths((int) '#');
        org.joda.time.Period period42 = period38.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType43 = period38.getPeriodType();
        org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) str30, periodType43);
        org.joda.time.PeriodType periodType45 = period44.getPeriodType();
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration25, periodType45);
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3, periodType45);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT0.011S" + "'", str30, "PT0.011S");
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType45);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.Period period8 = new org.joda.time.Period(8, (int) (short) 100, 10, 8, (int) 'a', (int) (short) 100, (int) ' ', 0);
        org.joda.time.Period period10 = period8.plusDays(32);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Period period15 = period11.plusMonths(0);
        org.joda.time.Period period17 = period15.plusMonths((int) '#');
        org.joda.time.Period period19 = period15.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType20 = period15.getPeriodType();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType20, chronology21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType20);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType20);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) ' ', 0L, periodType20, chronology25);
        org.joda.time.Period period27 = new org.joda.time.Period(100L, periodType20);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = period27.getValue((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Period period15 = period11.plusMonths(0);
        org.joda.time.Period period17 = period15.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period15.toDurationFrom(readableInstant18);
        org.joda.time.Period period21 = period15.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType24);
        org.joda.time.Period period27 = period25.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, readableInstant29, periodType30);
        org.joda.time.Period period33 = period31.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType36);
        org.joda.time.DurationFieldType durationFieldType39 = period37.getFieldType((int) (byte) 0);
        int int40 = period33.indexOf(durationFieldType39);
        int int41 = period25.get(durationFieldType39);
        org.joda.time.Period period43 = period15.withField(durationFieldType39, (int) (short) 0);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(100L, (long) ' ', chronology46);
        org.joda.time.Period period49 = period47.plusHours(1);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant52, readableInstant53);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = period54.toDurationFrom(readableInstant55);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant58, readableInstant59);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = period60.toDurationFrom(readableInstant61);
        org.joda.time.Period period64 = period60.plusMonths(0);
        org.joda.time.Period period66 = period64.plusMonths((int) '#');
        org.joda.time.Period period68 = period64.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType69 = period64.getPeriodType();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((long) (short) -1, periodType69, chronology70);
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant51, (org.joda.time.ReadableDuration) duration56, periodType69);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period((long) (byte) 0, periodType69, chronology73);
        org.joda.time.Period period75 = period49.withPeriodType(periodType69);
        org.joda.time.Period period76 = period15.withPeriodType(periodType69);
        org.joda.time.Period period77 = new org.joda.time.Period((int) '#', (int) ' ', 0, (int) (short) -1, 100, (int) (byte) 100, (int) (byte) 0, 97, periodType69);
        org.joda.time.Period period78 = new org.joda.time.Period((long) (byte) -1, periodType69);
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period(readableInstant79, readableInstant80);
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.ReadableInstant readableInstant83 = null;
        org.joda.time.PeriodType periodType84 = null;
        org.joda.time.Period period85 = new org.joda.time.Period(readableInstant82, readableInstant83, periodType84);
        org.joda.time.MutablePeriod mutablePeriod86 = period85.toMutablePeriod();
        org.joda.time.Period period87 = period81.plus((org.joda.time.ReadablePeriod) period85);
        org.joda.time.Period period89 = period85.withMonths((int) (byte) 0);
        org.joda.time.Period period91 = period89.withHours((int) (byte) 100);
        org.joda.time.Period period92 = new org.joda.time.Period((java.lang.Object) period89);
        org.joda.time.Period period93 = period78.minus((org.joda.time.ReadablePeriod) period92);
        int int94 = period78.getMillis();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(mutablePeriod86);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period5.plusYears((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
        org.joda.time.Period period26 = period22.plusMonths(0);
        org.joda.time.Period period28 = period26.plusMonths((int) '#');
        org.joda.time.Period period30 = period26.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType31 = period26.getPeriodType();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) (short) -1, periodType31, chronology32);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration18, periodType31);
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType31);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(100L, periodType31, chronology36);
        org.joda.time.Period period38 = period9.withPeriodType(periodType31);
        org.joda.time.Period period40 = period9.minusMillis((int) '#');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant42, readableInstant43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationFrom(readableInstant45);
        org.joda.time.Period period48 = period44.plusMonths(0);
        org.joda.time.Period period50 = period48.plusMonths((int) '#');
        org.joda.time.Period period52 = period48.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType53 = period48.getPeriodType();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((long) (short) -1, periodType53, chronology54);
        org.joda.time.Period period56 = period9.withPeriodType(periodType53);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(period56);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        org.joda.time.Period period18 = period14.plusMonths(0);
        org.joda.time.Period period20 = period18.plusMonths((int) '#');
        org.joda.time.Period period22 = period18.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType23 = period18.getPeriodType();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) -1, periodType23, chronology24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration10, periodType23);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType23);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 32, (long) (short) 0, periodType23, chronology28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration31);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(duration31);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period6.plusMillis((int) '4');
        org.joda.time.Period period14 = period12.withHours((int) (byte) 10);
        org.joda.time.PeriodType periodType15 = period14.getPeriodType();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.Period period13 = period11.withMinutes(0);
        org.joda.time.Period period15 = period13.minusSeconds((int) (short) 100);
        org.joda.time.Period period17 = period15.withWeeks((int) (short) -1);
        org.joda.time.Period period18 = period7.minus((org.joda.time.ReadablePeriod) period17);
        int int19 = period17.getSeconds();
        int int20 = period17.getMinutes();
        java.lang.Object obj21 = null;
        boolean boolean22 = period17.equals(obj21);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-100) + "'", int19 == (-100));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.Period period9 = org.joda.time.Period.millis((int) (short) -1);
        org.joda.time.PeriodType periodType10 = period9.getPeriodType();
        org.joda.time.Period period11 = new org.joda.time.Period((int) (short) 1, (int) (byte) 0, (int) (short) 1, 10, 10, 32, (int) (short) 1, (int) (short) 100, periodType10);
        org.joda.time.Period period13 = period11.plusYears(32);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.Period period8 = period2.withMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period2.toDurationTo(readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = period23.toMutablePeriod();
        org.joda.time.Period period25 = period19.plus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, readableInstant27, periodType28);
        org.joda.time.Period period31 = period29.plusMonths((int) '4');
        org.joda.time.Period period32 = period23.withFields((org.joda.time.ReadablePeriod) period31);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) 'a', periodType36, chronology37);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 'a', periodType40, chronology41);
        org.joda.time.Hours hours43 = period42.toStandardHours();
        org.joda.time.Period period44 = period38.withFields((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Period period46 = period38.withYears(10);
        org.joda.time.Period period47 = period46.toPeriod();
        org.joda.time.Period period49 = period46.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant52, readableInstant53);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = period54.toDurationFrom(readableInstant55);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant58, readableInstant59);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = period60.toDurationFrom(readableInstant61);
        org.joda.time.Period period64 = period60.plusMonths(0);
        org.joda.time.Period period66 = period64.plusMonths((int) '#');
        org.joda.time.Period period68 = period64.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType69 = period64.getPeriodType();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((long) (short) -1, periodType69, chronology70);
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant51, (org.joda.time.ReadableDuration) duration56, periodType69);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period((long) (byte) 0, periodType69, chronology73);
        org.joda.time.Period period75 = period49.normalizedStandard(periodType69);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.Period period77 = new org.joda.time.Period(0L, (long) 8, periodType69, chronology76);
        org.joda.time.Period period78 = new org.joda.time.Period((java.lang.Object) period23, periodType69);
        org.joda.time.Period period79 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType69);
        org.joda.time.Period period80 = new org.joda.time.Period((long) (short) 0, periodType69);
        org.joda.time.Period period81 = new org.joda.time.Period((long) (short) -1, (long) 'a', periodType69);
        org.joda.time.Period period82 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant11, periodType69);
        int[] intArray83 = period82.getValues();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(mutablePeriod24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(hours43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.Period period7 = period5.plusMonths(100);
        org.joda.time.Period period8 = period5.normalizedStandard();
        org.joda.time.Period period10 = period5.minusMillis(98);
        int[] intArray11 = period10.getValues();
        org.joda.time.Period period13 = period10.minusMonths(52);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 1, 0, 0, 0, 0, -98]");
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Period period6 = period3.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType9);
        org.joda.time.DurationFieldType durationFieldType12 = period10.getFieldType((int) (byte) 0);
        org.joda.time.Period period14 = period3.withField(durationFieldType12, 1);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        org.joda.time.Period period21 = period17.plusMonths(0);
        org.joda.time.Period period23 = period21.plusMonths((int) '#');
        org.joda.time.Period period25 = period21.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.Period period32 = period28.plusMonths(0);
        org.joda.time.Period period34 = period32.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period32.toDurationFrom(readableInstant35);
        org.joda.time.Period period38 = period32.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.Period period44 = period42.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, readableInstant46, periodType47);
        org.joda.time.Period period50 = period48.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant51, readableInstant52, periodType53);
        org.joda.time.DurationFieldType durationFieldType56 = period54.getFieldType((int) (byte) 0);
        int int57 = period50.indexOf(durationFieldType56);
        int int58 = period42.get(durationFieldType56);
        org.joda.time.Period period60 = period32.withField(durationFieldType56, (int) (short) 0);
        boolean boolean61 = period25.isSupported(durationFieldType56);
        org.joda.time.Period period63 = period14.withFieldAdded(durationFieldType56, 1);
        java.lang.Class<?> wildcardClass64 = period14.getClass();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((java.lang.Object) period14, chronology65);
        int[] intArray67 = period14.getValues();
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1, 0, 0, 0, 0, 0, 0, 97]");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.Period period4 = new org.joda.time.Period((int) ' ', 8, (int) (short) 1, (int) '4');
        org.joda.time.Period period6 = period4.withYears(32);
        org.joda.time.Period period8 = org.joda.time.Period.years(0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology11);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) str13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        org.joda.time.Period period21 = period17.plusMonths(0);
        org.joda.time.Period period23 = period21.plusMonths((int) '#');
        org.joda.time.Period period25 = period21.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType26 = period21.getPeriodType();
        org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) str13, periodType26);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 'a', periodType29, chronology30);
        org.joda.time.Period period33 = period31.withMinutes(0);
        org.joda.time.Period period35 = period33.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod36 = period33.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant37, readableInstant38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationFrom(readableInstant40);
        org.joda.time.Period period43 = period39.plusMonths(0);
        org.joda.time.Period period45 = period43.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period43.toDurationFrom(readableInstant46);
        org.joda.time.Period period49 = period43.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant50, readableInstant51, periodType52);
        org.joda.time.Period period55 = period53.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant56, readableInstant57, periodType58);
        org.joda.time.Period period61 = period59.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant62, readableInstant63, periodType64);
        org.joda.time.DurationFieldType durationFieldType67 = period65.getFieldType((int) (byte) 0);
        int int68 = period61.indexOf(durationFieldType67);
        int int69 = period53.get(durationFieldType67);
        org.joda.time.Period period71 = period43.withField(durationFieldType67, (int) (short) 0);
        int int72 = mutablePeriod36.indexOf(durationFieldType67);
        int int73 = period27.get(durationFieldType67);
        org.joda.time.Period period75 = period8.withField(durationFieldType67, 0);
        org.joda.time.Period period76 = period6.minus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period78 = period6.minusYears(0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT0.011S" + "'", str13, "PT0.011S");
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(mutablePeriod36);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(100L, chronology1);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 'a', periodType4, chronology5);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 'a', periodType8, chronology9);
        org.joda.time.Hours hours11 = period10.toStandardHours();
        org.joda.time.Period period12 = period6.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period6.withYears(10);
        org.joda.time.Period period15 = period2.plus((org.joda.time.ReadablePeriod) period6);
        int int16 = period2.getMonths();
        org.joda.time.Period period18 = period2.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
        org.joda.time.Period period26 = period22.plusMonths(0);
        org.joda.time.Period period28 = period26.plusMonths((int) '#');
        org.joda.time.Period period30 = period26.plusMinutes((int) (short) 100);
        org.joda.time.Period period32 = period30.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) period30, periodType33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period30.toDurationTo(readableInstant35);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.Period period44 = period42.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period42.toDurationTo(readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration46, readableInstant47);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant56, readableInstant57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = period58.toDurationFrom(readableInstant59);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant62, readableInstant63);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Duration duration66 = period64.toDurationFrom(readableInstant65);
        org.joda.time.Period period68 = period64.plusMonths(0);
        org.joda.time.Period period70 = period68.plusMonths((int) '#');
        org.joda.time.Period period72 = period68.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType73 = period68.getPeriodType();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((long) (short) -1, periodType73, chronology74);
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant55, (org.joda.time.ReadableDuration) duration60, periodType73);
        org.joda.time.Period period77 = new org.joda.time.Period(readableInstant53, readableInstant54, periodType73);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period((long) (-100), (long) (-100), periodType73, chronology78);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((long) 0, (long) 100, periodType73, chronology80);
        org.joda.time.Period period82 = period48.withPeriodType(periodType73);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((long) (byte) 10, (long) '4', periodType73, chronology83);
        org.joda.time.Period period85 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration36, periodType73);
        org.joda.time.Period period86 = period18.withPeriodType(periodType73);
        org.joda.time.Period period87 = period18.toPeriod();
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period87);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.joda.time.Period period1 = org.joda.time.Period.months(8);
        org.joda.time.Period period3 = period1.plusYears((-1));
        int int4 = period3.getMinutes();
        org.joda.time.Period period5 = period3.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.Period period17 = period13.plusMonths(0);
        org.joda.time.Period period19 = period17.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period17.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period17.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.Period period29 = period27.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant30, readableInstant31, periodType32);
        org.joda.time.Period period35 = period33.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, readableInstant37, periodType38);
        org.joda.time.DurationFieldType durationFieldType41 = period39.getFieldType((int) (byte) 0);
        int int42 = period35.indexOf(durationFieldType41);
        int int43 = period27.get(durationFieldType41);
        org.joda.time.Period period45 = period17.withField(durationFieldType41, (int) (short) 0);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(100L, (long) ' ', chronology48);
        org.joda.time.Period period51 = period49.plusHours(1);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant54, readableInstant55);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = period56.toDurationFrom(readableInstant57);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant60, readableInstant61);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Duration duration64 = period62.toDurationFrom(readableInstant63);
        org.joda.time.Period period66 = period62.plusMonths(0);
        org.joda.time.Period period68 = period66.plusMonths((int) '#');
        org.joda.time.Period period70 = period66.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType71 = period66.getPeriodType();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period((long) (short) -1, periodType71, chronology72);
        org.joda.time.Period period74 = new org.joda.time.Period(readableInstant53, (org.joda.time.ReadableDuration) duration58, periodType71);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period((long) (byte) 0, periodType71, chronology75);
        org.joda.time.Period period77 = period51.withPeriodType(periodType71);
        org.joda.time.Period period78 = period17.withPeriodType(periodType71);
        org.joda.time.Period period79 = new org.joda.time.Period((int) '#', (int) ' ', 0, (int) (short) -1, 100, (int) (byte) 100, (int) (byte) 0, 97, periodType71);
        org.joda.time.Period period80 = new org.joda.time.Period((long) (byte) -1, periodType71);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.Period period82 = new org.joda.time.Period(0L, (long) (byte) -1, periodType71, chronology81);
        int int83 = period82.getDays();
        org.joda.time.Period period85 = period82.minusMinutes((int) (short) 0);
        int int86 = period85.getYears();
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.Period period4 = new org.joda.time.Period(0, 10, 1, (-1));
        org.joda.time.Hours hours5 = period4.toStandardHours();
        org.joda.time.MutablePeriod mutablePeriod6 = period4.toMutablePeriod();
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.Period period1 = org.joda.time.Period.hours(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType4);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.Period period8 = period5.minusMinutes((int) (byte) 100);
        org.joda.time.Seconds seconds9 = period8.toStandardSeconds();
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) period8);
        org.joda.time.format.PeriodFormatter periodFormatter11 = null;
        java.lang.String str12 = period8.toString(periodFormatter11);
        org.joda.time.Period period14 = period8.withSeconds((int) (short) 1);
        org.joda.time.Period period16 = period8.plusSeconds((int) '4');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.Period period20 = period19.normalizedStandard();
        org.joda.time.Period period22 = period19.withWeeks(1);
        org.joda.time.Period period23 = period8.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period24 = period1.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period26 = period1.minusSeconds((int) (short) 1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT-100M" + "'", str12, "PT-100M");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        int int7 = period2.getWeeks();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = period2.normalizedStandard(periodType8);
        org.joda.time.Period period11 = period9.minusMonths((int) ' ');
        org.joda.time.Period period13 = period9.withSeconds((int) (short) -1);
        org.joda.time.Period period15 = period13.multipliedBy((int) 'a');
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 100, (long) 10);
        org.joda.time.PeriodType periodType3 = period2.getPeriodType();
        org.joda.time.Period period4 = period2.normalizedStandard();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.Period period11 = period7.plusMonths(0);
        org.joda.time.Period period13 = period7.plusWeeks((int) ' ');
        org.joda.time.Period period15 = period7.plusDays(10);
        org.joda.time.Period period17 = period15.minusSeconds((-100));
        org.joda.time.Period period19 = org.joda.time.Period.weeks((int) 'a');
        org.joda.time.Period period21 = period19.withMinutes(52);
        org.joda.time.Period period23 = period19.withSeconds((int) (short) 10);
        org.joda.time.Period period24 = period15.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period26 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 'a', periodType28, chronology29);
        org.joda.time.DurationFieldType durationFieldType31 = null;
        int int32 = period30.get(durationFieldType31);
        org.joda.time.Period period33 = period26.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period35 = period26.minusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray36 = period35.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period35.toDurationTo(readableInstant37);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 'a', periodType40, chronology41);
        org.joda.time.Period period44 = period42.withMinutes(0);
        org.joda.time.Period period46 = period44.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod47 = period44.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant48, readableInstant49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationFrom(readableInstant51);
        org.joda.time.Period period54 = period50.plusMonths(0);
        org.joda.time.Period period56 = period54.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = period54.toDurationFrom(readableInstant57);
        org.joda.time.Period period60 = period54.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, readableInstant62, periodType63);
        org.joda.time.Period period66 = period64.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant67, readableInstant68, periodType69);
        org.joda.time.Period period72 = period70.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant73, readableInstant74, periodType75);
        org.joda.time.DurationFieldType durationFieldType78 = period76.getFieldType((int) (byte) 0);
        int int79 = period72.indexOf(durationFieldType78);
        int int80 = period64.get(durationFieldType78);
        org.joda.time.Period period82 = period54.withField(durationFieldType78, (int) (short) 0);
        int int83 = mutablePeriod47.indexOf(durationFieldType78);
        org.joda.time.Period period85 = period35.withFieldAdded(durationFieldType78, (int) (byte) 100);
        int int86 = period19.get(durationFieldType78);
        int int87 = period4.indexOf(durationFieldType78);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(durationFieldTypeArray36);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(mutablePeriod47);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology15);
        java.lang.String str17 = period16.toString();
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) str17);
        org.joda.time.Period period20 = period18.plusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray21 = period20.getFieldTypes();
        org.joda.time.Period period23 = period20.withSeconds((int) (short) 10);
        org.joda.time.Period period25 = period23.minusDays((int) '4');
        org.joda.time.DurationFieldType durationFieldType27 = period25.getFieldType((int) (byte) 1);
        org.joda.time.Period period29 = period12.withField(durationFieldType27, 1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0.011S" + "'", str17, "PT0.011S");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(durationFieldTypeArray21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 10, (long) 8, chronology2);
        org.joda.time.Period period5 = period3.minusHours((int) ' ');
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, (long) (-1), chronology4);
        int int6 = period5.getHours();
        org.joda.time.Period period8 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period10 = period8.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType13);
        org.joda.time.Period period16 = period14.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType19);
        org.joda.time.DurationFieldType durationFieldType22 = period20.getFieldType((int) (byte) 0);
        int int23 = period16.indexOf(durationFieldType22);
        org.joda.time.Period period25 = period8.withFieldAdded(durationFieldType22, 1);
        org.joda.time.Period period27 = period25.plusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType28 = period27.getPeriodType();
        org.joda.time.Period period29 = period5.withPeriodType(periodType28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Hours hours10 = period9.toStandardHours();
        org.joda.time.Period period11 = period5.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period5.withYears(10);
        org.joda.time.Period period14 = period13.toPeriod();
        org.joda.time.Period period16 = period13.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.Period period35 = period31.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType36 = period31.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) -1, periodType36, chronology37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration23, periodType36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) (byte) 0, periodType36, chronology40);
        org.joda.time.Period period42 = period16.normalizedStandard(periodType36);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(0L, (long) 8, periodType36, chronology43);
        org.joda.time.Period period46 = period44.minusMonths(32);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period46);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period6.withHours((-100));
        org.joda.time.MutablePeriod mutablePeriod9 = period6.toMutablePeriod();
        int int10 = period6.getMonths();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = period11.minusMillis((int) ' ');
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType16, chronology17);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 'a', periodType20, chronology21);
        org.joda.time.Hours hours23 = period22.toStandardHours();
        org.joda.time.Period period24 = period18.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period26 = period18.withYears(10);
        org.joda.time.Period period27 = period26.toPeriod();
        org.joda.time.Period period29 = period26.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant38, readableInstant39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        org.joda.time.Period period44 = period40.plusMonths(0);
        org.joda.time.Period period46 = period44.plusMonths((int) '#');
        org.joda.time.Period period48 = period44.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType49 = period44.getPeriodType();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) (short) -1, periodType49, chronology50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration36, periodType49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (byte) 0, periodType49, chronology53);
        org.joda.time.Period period55 = period29.normalizedStandard(periodType49);
        org.joda.time.Period period56 = period11.normalizedStandard(periodType49);
        org.joda.time.Period period58 = period11.minusSeconds((-100));
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(10L, (long) (short) 0, periodType61, chronology62);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant69, readableInstant70);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant72, readableInstant73, periodType74);
        org.joda.time.MutablePeriod mutablePeriod76 = period75.toMutablePeriod();
        org.joda.time.Period period77 = period71.plus((org.joda.time.ReadablePeriod) period75);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period(readableInstant78, readableInstant79, periodType80);
        org.joda.time.Period period83 = period81.plusMonths((int) '4');
        org.joda.time.Period period84 = period75.withFields((org.joda.time.ReadablePeriod) period83);
        org.joda.time.PeriodType periodType85 = period83.getPeriodType();
        org.joda.time.Period period86 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType85);
        org.joda.time.Period period87 = new org.joda.time.Period((long) (-100), (long) (short) 10, periodType85);
        org.joda.time.Period period88 = new org.joda.time.Period(0L, periodType85);
        org.joda.time.Period period89 = new org.joda.time.Period((java.lang.Object) chronology62, periodType85);
        org.joda.time.Period period90 = period11.normalizedStandard(periodType85);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(mutablePeriod76);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(periodType85);
        org.junit.Assert.assertNotNull(period90);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.minusMinutes((int) (byte) 100);
        org.joda.time.Seconds seconds7 = period6.toStandardSeconds();
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.Period period10 = period8.withMillis((int) (byte) 1);
        org.joda.time.Period period11 = period10.toPeriod();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) 10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType14 = period10.getFieldType((int) (byte) 0);
        java.lang.String str15 = period10.toString();
        org.joda.time.Period period17 = period10.minusYears((int) (byte) 1);
        org.joda.time.Period period19 = period17.withHours((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationTo(readableInstant20);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT100M" + "'", str15, "PT100M");
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period7 = period4.plusDays((int) (byte) 10);
        org.joda.time.Period period9 = period7.plusMillis(8);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period2.plusWeeks((int) ' ');
        org.joda.time.Period period10 = period2.plusMinutes((-1));
        org.joda.time.Period period11 = period2.normalizedStandard();
        org.joda.time.Period period13 = period2.plusMinutes(97);
        org.joda.time.Period period15 = period13.withSeconds((-31));
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.Period period8 = period2.withMonths((int) '4');
        org.joda.time.Period period10 = period8.plusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = period10.getFieldTypes();
        org.joda.time.Period period13 = period10.plusWeeks((int) ' ');
        org.joda.time.Period period15 = period10.minusMillis((int) (short) 10);
        int int16 = period10.getSeconds();
        org.joda.time.Period period18 = period10.withSeconds((int) '#');
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, chronology1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.minusSeconds((int) (short) 0);
        org.joda.time.Period period8 = period2.withMillis(10);
        org.joda.time.Period period10 = period8.minusHours((int) (byte) 0);
        org.joda.time.Period period12 = period10.withSeconds(3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.Period period2 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 'a', periodType4, chronology5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int int8 = period6.get(durationFieldType7);
        org.joda.time.Period period9 = period2.withFields((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period11 = period9.multipliedBy((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.Period period15 = period14.normalizedStandard();
        org.joda.time.Period period17 = period14.plusMinutes((int) ' ');
        org.joda.time.Period period18 = period17.normalizedStandard();
        org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) period18);
        org.joda.time.format.PeriodFormatter periodFormatter20 = null;
        java.lang.String str21 = period19.toString(periodFormatter20);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant38, readableInstant39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        org.joda.time.Period period44 = period40.plusMonths(0);
        org.joda.time.Period period46 = period44.plusMonths((int) '#');
        org.joda.time.Period period48 = period44.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType49 = period44.getPeriodType();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) (short) -1, periodType49, chronology50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration36, periodType49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (short) 100, periodType49, chronology53);
        org.joda.time.Period period55 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType49);
        org.joda.time.Period period56 = new org.joda.time.Period((java.lang.Object) str21, periodType49);
        org.joda.time.Period period57 = period11.withPeriodType(periodType49);
        org.joda.time.Period period58 = new org.joda.time.Period(100L, periodType49);
        org.joda.time.Duration duration59 = period58.toStandardDuration();
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT32M" + "'", str21, "PT32M");
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(duration59);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) ' ');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType19);
        org.joda.time.MutablePeriod mutablePeriod21 = period20.toMutablePeriod();
        org.joda.time.Period period22 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType25);
        org.joda.time.Period period28 = period26.plusMonths((int) '4');
        org.joda.time.Period period29 = period20.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.PeriodType periodType30 = period28.getPeriodType();
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType30);
        org.joda.time.Period period32 = period11.withPeriodType(periodType30);
        org.joda.time.DurationFieldType[] durationFieldTypeArray33 = period11.getFieldTypes();
        org.joda.time.Period period35 = period11.minusSeconds(97);
        org.joda.time.Period period37 = period11.minusSeconds((int) ' ');
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(durationFieldTypeArray33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes((int) (short) 10);
        org.joda.time.Period period7 = period5.plusMinutes((-1));
        int int8 = period7.getWeeks();
        org.joda.time.Period period10 = period7.withMinutes((int) (byte) 10);
        org.joda.time.Period period12 = period7.minusMillis(97);
        org.joda.time.Period period14 = period12.withMillis((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 100, 100L, chronology2);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '4', (long) 0);
        org.joda.time.Period period7 = period3.withFields((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period9 = period6.minusMinutes((int) (byte) 1);
        int int10 = period6.getMinutes();
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.joda.time.Period period1 = org.joda.time.Period.hours(1);
        org.joda.time.Period period3 = period1.plusSeconds(100);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.Period period13 = period9.plusMonths(0);
        org.joda.time.Period period15 = period13.plusMonths((int) '#');
        org.joda.time.Period period17 = period13.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType18 = period13.getPeriodType();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType18, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 'a', periodType18, chronology21);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = period22.withPeriodType(periodType23);
        org.joda.time.Period period26 = period24.minusMinutes(11);
        org.joda.time.Period period28 = period24.plusHours((int) '4');
        org.joda.time.Period period29 = period3.withFields((org.joda.time.ReadablePeriod) period24);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) period9);
        org.joda.time.Period period11 = period9.toPeriod();
        org.joda.time.Period period13 = period11.plusMinutes(0);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period3.toDurationTo(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period10 = org.joda.time.Period.seconds(1);
        org.joda.time.Period period12 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period14 = period12.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.Period period20 = period18.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.DurationFieldType durationFieldType26 = period24.getFieldType((int) (byte) 0);
        int int27 = period20.indexOf(durationFieldType26);
        org.joda.time.Period period29 = period12.withFieldAdded(durationFieldType26, 1);
        org.joda.time.Period period31 = period29.plusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType32 = period31.getPeriodType();
        org.joda.time.Period period33 = period10.withPeriodType(periodType32);
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, readableInstant8, periodType32);
        int int35 = period34.getDays();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (-100), chronology37);
        org.joda.time.Period period39 = period38.negated();
        org.joda.time.Period period40 = period34.minus((org.joda.time.ReadablePeriod) period39);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.joda.time.Period period1 = org.joda.time.Period.months(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration2 = period1.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.Period period9 = period5.plusMonths(0);
        org.joda.time.Period period11 = period9.plusMonths((int) '#');
        org.joda.time.Period period13 = period9.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType14 = period9.getPeriodType();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) -1, periodType14, chronology15);
        org.joda.time.Period period17 = period1.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period19 = period1.plusWeeks((int) (byte) 0);
        org.joda.time.Duration duration20 = period1.toStandardDuration();
        org.joda.time.Period period22 = period1.withMonths(0);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 35, (long) (-101));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.minusDays(8);
        org.joda.time.Period period7 = period3.minusWeeks(100);
        org.joda.time.Period period9 = period7.minusWeeks((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType19);
        org.joda.time.MutablePeriod mutablePeriod21 = period20.toMutablePeriod();
        org.joda.time.Period period22 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType25);
        org.joda.time.Period period28 = period26.plusMonths((int) '4');
        org.joda.time.Period period29 = period20.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.PeriodType periodType30 = period28.getPeriodType();
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType30);
        org.joda.time.Period period32 = new org.joda.time.Period((long) (-100), (long) (short) 10, periodType30);
        org.joda.time.Period period34 = period32.withYears((int) (byte) 0);
        org.joda.time.Hours hours35 = period32.toStandardHours();
        org.joda.time.Period period37 = period32.plusDays(52);
        org.joda.time.Period period38 = period7.minus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period40 = period7.withSeconds((int) '4');
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = period11.minusMillis((int) ' ');
        org.joda.time.Period period16 = period14.plusMillis((int) (short) 10);
        org.joda.time.Period period18 = period16.minusMillis((int) (byte) 0);
        org.joda.time.Hours hours19 = period18.toStandardHours();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(hours19);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType8);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.Period period11 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.Period period17 = period15.plusMonths((int) '4');
        org.joda.time.Period period18 = period9.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.PeriodType periodType19 = period17.getPeriodType();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((-1L), (long) 98, periodType19, chronology20);
        org.joda.time.Period period22 = new org.joda.time.Period((long) (short) 0, periodType19);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Hours hours10 = period9.toStandardHours();
        org.joda.time.Period period11 = period5.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period5.withYears(10);
        org.joda.time.Period period15 = period5.minusWeeks((int) (short) -1);
        java.lang.String str16 = period5.toString();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period5.toDurationFrom(readableInstant17);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, readableInstant29, periodType30);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        org.joda.time.Period period33 = period27.plus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType36);
        org.joda.time.Period period39 = period37.plusMonths((int) '4');
        org.joda.time.Period period40 = period31.withFields((org.joda.time.ReadablePeriod) period39);
        org.joda.time.PeriodType periodType41 = period39.getPeriodType();
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType41);
        org.joda.time.Period period43 = new org.joda.time.Period((long) 'a', (long) 10, periodType41);
        org.joda.time.Period period44 = new org.joda.time.Period((long) (short) 100, 100L, periodType41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) duration18, periodType41, chronology45);
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration18);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period51 = org.joda.time.Period.seconds(1);
        org.joda.time.Period period53 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period55 = period53.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant56, readableInstant57, periodType58);
        org.joda.time.Period period61 = period59.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant62, readableInstant63, periodType64);
        org.joda.time.DurationFieldType durationFieldType67 = period65.getFieldType((int) (byte) 0);
        int int68 = period61.indexOf(durationFieldType67);
        org.joda.time.Period period70 = period53.withFieldAdded(durationFieldType67, 1);
        org.joda.time.Period period72 = period70.plusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType73 = period72.getPeriodType();
        org.joda.time.Period period74 = period51.withPeriodType(periodType73);
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant48, readableInstant49, periodType73);
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration18, periodType73);
        org.joda.time.Period period78 = period76.withWeeks(52);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT0.097S" + "'", str16, "PT0.097S");
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period78);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period6.plusMonths(0);
        org.joda.time.Period period12 = period10.plusMonths((int) '#');
        org.joda.time.Period period14 = period10.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType15 = period10.getPeriodType();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (short) -1, periodType15, chronology16);
        org.joda.time.Period period18 = period2.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Hours hours19 = period18.toStandardHours();
        org.joda.time.Period period21 = period18.plusMonths((int) ' ');
        org.joda.time.Period period22 = period18.negated();
        int int23 = period22.getWeeks();
        org.joda.time.Period period25 = period22.minusHours((-100));
        org.joda.time.Duration duration26 = period25.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant35, readableInstant36, periodType37);
        org.joda.time.MutablePeriod mutablePeriod39 = period38.toMutablePeriod();
        org.joda.time.Period period40 = period34.plus((org.joda.time.ReadablePeriod) period38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, readableInstant42, periodType43);
        org.joda.time.Period period46 = period44.plusMonths((int) '4');
        org.joda.time.Period period47 = period38.withFields((org.joda.time.ReadablePeriod) period46);
        org.joda.time.PeriodType periodType48 = period46.getPeriodType();
        org.joda.time.Period period49 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType48);
        org.joda.time.Period period50 = new org.joda.time.Period((long) 'a', (long) 10, periodType48);
        org.joda.time.Period period51 = new org.joda.time.Period(1L, periodType48);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration26, periodType48);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(mutablePeriod39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(periodType48);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((-1L), 100L, chronology2);
        int int4 = period3.getSeconds();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.Period period11 = period7.plusMonths(0);
        org.joda.time.Period period13 = period11.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period11.toDurationFrom(readableInstant14);
        org.joda.time.Period period17 = period11.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType20);
        org.joda.time.Period period23 = period21.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.Period period29 = period27.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant30, readableInstant31, periodType32);
        org.joda.time.DurationFieldType durationFieldType35 = period33.getFieldType((int) (byte) 0);
        int int36 = period29.indexOf(durationFieldType35);
        int int37 = period21.get(durationFieldType35);
        org.joda.time.Period period39 = period11.withField(durationFieldType35, (int) (short) 0);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(100L, (long) ' ', chronology42);
        org.joda.time.Period period45 = period43.plusHours(1);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant48, readableInstant49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationFrom(readableInstant51);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant54, readableInstant55);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = period56.toDurationFrom(readableInstant57);
        org.joda.time.Period period60 = period56.plusMonths(0);
        org.joda.time.Period period62 = period60.plusMonths((int) '#');
        org.joda.time.Period period64 = period60.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType65 = period60.getPeriodType();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period((long) (short) -1, periodType65, chronology66);
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant47, (org.joda.time.ReadableDuration) duration52, periodType65);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period((long) (byte) 0, periodType65, chronology69);
        org.joda.time.Period period71 = period45.withPeriodType(periodType65);
        org.joda.time.Period period72 = period11.withPeriodType(periodType65);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Period period77 = new org.joda.time.Period(readableInstant75, readableInstant76);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Duration duration79 = period77.toDurationFrom(readableInstant78);
        org.joda.time.Period period81 = period77.plusMonths(0);
        org.joda.time.Period period83 = period81.plusMonths((int) '#');
        org.joda.time.Period period85 = period81.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType86 = period81.getPeriodType();
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.Period period88 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType86, chronology87);
        org.joda.time.Seconds seconds89 = period88.toStandardSeconds();
        org.joda.time.Period period90 = period72.minus((org.joda.time.ReadablePeriod) seconds89);
        org.joda.time.Period period92 = period72.withMinutes(0);
        org.joda.time.Period period93 = period3.withFields((org.joda.time.ReadablePeriod) period72);
        org.joda.time.Period period95 = period72.minusMonths((int) (byte) 1);
        int int96 = period95.getYears();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(periodType86);
        org.junit.Assert.assertNotNull(seconds89);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertNotNull(period95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 32);
        org.joda.time.Period period3 = period1.plusMonths((int) (short) 10);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        int int5 = period3.getMillis();
        org.joda.time.Period period7 = period3.minusMillis((int) (short) 1);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        org.joda.time.Period period25 = period21.plusMonths(0);
        org.joda.time.Period period27 = period25.plusMonths((int) '#');
        org.joda.time.Period period29 = period25.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType30 = period25.getPeriodType();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) (short) -1, periodType30, chronology31);
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant12, (org.joda.time.ReadableDuration) duration17, periodType30);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType30);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (-100), (long) (-100), periodType30, chronology35);
        org.joda.time.Period period37 = new org.joda.time.Period(100, (int) '4', 10, 0, (int) (short) 1, (int) ' ', (int) (short) 0, (int) (byte) 10, periodType30);
        int[] intArray38 = period37.getValues();
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 52, 10, 0, 1, 32, 0, 10]");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.joda.time.Period period4 = new org.joda.time.Period((-3), (int) (byte) -1, (int) (byte) 10, 0);
        org.joda.time.Period period7 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period9 = period7.minusYears(100);
        org.joda.time.Period period10 = period9.negated();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType13);
        org.joda.time.Period period16 = period14.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType19);
        org.joda.time.DurationFieldType durationFieldType22 = period20.getFieldType((int) (byte) 0);
        int int23 = period16.indexOf(durationFieldType22);
        org.joda.time.Period period25 = period9.withField(durationFieldType22, 10);
        int[] intArray26 = period25.getValues();
        org.joda.time.Period period28 = period25.plusHours(11);
        boolean boolean29 = period4.equals((java.lang.Object) 11);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 0, 0, 0, 0, 0, 0, -1]");
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.Period period7 = period5.plusMonths(100);
        org.joda.time.Period period8 = period5.normalizedStandard();
        org.joda.time.Period period10 = period5.minusSeconds(98);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.Period period17 = period13.plusMonths(0);
        org.joda.time.Period period19 = period17.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period17.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period17.minusMinutes((int) (byte) -1);
        org.joda.time.Seconds seconds24 = period17.toStandardSeconds();
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) period17);
        org.joda.time.Period period27 = period25.withMinutes((int) '#');
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 'a', periodType29, chronology30);
        org.joda.time.Period period33 = period31.withMinutes(0);
        org.joda.time.Period period35 = period33.minusSeconds((int) (short) 100);
        org.joda.time.Period period37 = period35.minusMinutes(100);
        org.joda.time.Period period39 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period41 = period39.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant42, readableInstant43, periodType44);
        org.joda.time.Period period47 = period45.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant48, readableInstant49, periodType50);
        org.joda.time.DurationFieldType durationFieldType53 = period51.getFieldType((int) (byte) 0);
        int int54 = period47.indexOf(durationFieldType53);
        org.joda.time.Period period56 = period39.withFieldAdded(durationFieldType53, 1);
        org.joda.time.Period period57 = period56.negated();
        org.joda.time.Period period58 = period37.plus((org.joda.time.ReadablePeriod) period56);
        org.joda.time.Period period60 = period37.minusSeconds((int) '#');
        org.joda.time.Period period62 = period60.minusMillis((-1));
        int int63 = period60.getMinutes();
        org.joda.time.Period period64 = period27.withFields((org.joda.time.ReadablePeriod) period60);
        org.joda.time.Seconds seconds65 = period60.toStandardSeconds();
        boolean boolean66 = period5.equals((java.lang.Object) period60);
        org.joda.time.Period period68 = period60.withYears(35);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-100) + "'", int63 == (-100));
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(seconds65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(period68);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        org.joda.time.Period period7 = period5.minusMinutes((int) (short) 100);
        org.joda.time.Period period9 = period5.minusSeconds((int) (short) -1);
        org.joda.time.Period period11 = period5.withMillis((int) (short) -1);
        org.joda.time.Period period13 = period5.multipliedBy(0);
        org.joda.time.Period period15 = period13.plusYears(197);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Period period6 = period3.plusSeconds((int) (byte) 1);
        org.joda.time.Period period8 = period6.withWeeks(1);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period5 = period4.toPeriod();
        int int6 = period4.getMonths();
        org.joda.time.Period period8 = period4.minusDays(0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 52, (long) (byte) -1, chronology2);
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = period3.getFieldTypes();
        org.junit.Assert.assertNotNull(durationFieldTypeArray4);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        int int7 = period6.getYears();
        org.joda.time.Period period9 = period6.withMonths((int) (byte) 100);
        int int10 = period6.getYears();
        org.joda.time.Period period12 = period6.minusHours((int) '4');
        org.joda.time.Period period14 = period6.plusMillis(35);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((int) (byte) 100, (int) (byte) -1, 10, 97);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.Period period24 = period20.plusMonths(0);
        org.joda.time.Period period26 = period24.plusMonths((int) '#');
        org.joda.time.Period period28 = period24.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType29 = period24.getPeriodType();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) -1, periodType29, chronology30);
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration16, periodType29);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, readableInstant35);
        org.joda.time.Period period38 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 'a', periodType40, chronology41);
        org.joda.time.DurationFieldType durationFieldType43 = null;
        int int44 = period42.get(durationFieldType43);
        org.joda.time.Period period45 = period38.withFields((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Period period47 = period45.multipliedBy((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant48, readableInstant49);
        org.joda.time.Period period51 = period50.normalizedStandard();
        org.joda.time.Period period53 = period50.plusMinutes((int) ' ');
        org.joda.time.Period period54 = period53.normalizedStandard();
        org.joda.time.Period period55 = new org.joda.time.Period((java.lang.Object) period54);
        org.joda.time.format.PeriodFormatter periodFormatter56 = null;
        java.lang.String str57 = period55.toString(periodFormatter56);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant68, readableInstant69);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Duration duration72 = period70.toDurationFrom(readableInstant71);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant74, readableInstant75);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.Duration duration78 = period76.toDurationFrom(readableInstant77);
        org.joda.time.Period period80 = period76.plusMonths(0);
        org.joda.time.Period period82 = period80.plusMonths((int) '#');
        org.joda.time.Period period84 = period80.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType85 = period80.getPeriodType();
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.Period period87 = new org.joda.time.Period((long) (short) -1, periodType85, chronology86);
        org.joda.time.Period period88 = new org.joda.time.Period(readableInstant67, (org.joda.time.ReadableDuration) duration72, periodType85);
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.Period period90 = new org.joda.time.Period((long) (short) 100, periodType85, chronology89);
        org.joda.time.Period period91 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType85);
        org.joda.time.Period period92 = new org.joda.time.Period((java.lang.Object) str57, periodType85);
        org.joda.time.Period period93 = period47.withPeriodType(periodType85);
        org.joda.time.Period period94 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration16, periodType85);
        org.joda.time.Period period95 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, readableInstant9, periodType85);
        int int96 = period95.getMinutes();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PT32M" + "'", str57, "PT32M");
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(duration78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(periodType85);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 59 + "'", int96 == 59);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = period11.minusMillis((int) ' ');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.Period period34 = period30.plusMonths(0);
        org.joda.time.Period period36 = period34.plusMonths((int) '#');
        org.joda.time.Period period38 = period34.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType39 = period34.getPeriodType();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) (short) -1, periodType39, chronology40);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant21, (org.joda.time.ReadableDuration) duration26, periodType39);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType39);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) (-100), (long) (-100), periodType39, chronology44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) 0, (long) 100, periodType39, chronology46);
        org.joda.time.PeriodType periodType48 = period47.getPeriodType();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) 'a', periodType50, chronology51);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) 'a', periodType54, chronology55);
        org.joda.time.Hours hours57 = period56.toStandardHours();
        org.joda.time.Period period58 = period52.withFields((org.joda.time.ReadablePeriod) period56);
        org.joda.time.Period period60 = period52.withYears(10);
        org.joda.time.Period period61 = period60.toPeriod();
        org.joda.time.Period period63 = period60.plusHours((int) (short) -1);
        org.joda.time.Period period65 = period63.plusHours(98);
        boolean boolean66 = period47.equals((java.lang.Object) 98);
        int int67 = period47.getDays();
        org.joda.time.Period period68 = period14.minus((org.joda.time.ReadablePeriod) period47);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(hours57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(period68);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        org.joda.time.Period period18 = period14.plusMonths(0);
        org.joda.time.Period period20 = period18.plusMonths((int) '#');
        org.joda.time.Period period22 = period18.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType23 = period18.getPeriodType();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) -1, periodType23, chronology24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration10, periodType23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType23, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', periodType23, chronology29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period31 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period6.plusMonths(0);
        org.joda.time.Period period12 = period10.plusMonths((int) '#');
        org.joda.time.Period period14 = period10.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType15 = period10.getPeriodType();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (short) -1, periodType15, chronology16);
        org.joda.time.Period period18 = period2.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period17.toDurationTo(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.Period period27 = period23.plusMonths(0);
        org.joda.time.Period period29 = period27.plusMonths((int) '#');
        org.joda.time.Period period31 = period27.plusMinutes((int) (short) 100);
        org.joda.time.Period period33 = period31.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((java.lang.Object) period31, periodType34);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = period35.normalizedStandard(periodType36);
        org.joda.time.MutablePeriod mutablePeriod38 = period35.toMutablePeriod();
        org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) period35);
        org.joda.time.PeriodType periodType40 = period35.getPeriodType();
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration20, periodType40);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant47, readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationFrom(readableInstant50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant53, readableInstant54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = period55.toDurationFrom(readableInstant56);
        org.joda.time.Period period59 = period55.plusMonths(0);
        org.joda.time.Period period61 = period59.plusMonths((int) '#');
        org.joda.time.Period period63 = period59.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType64 = period59.getPeriodType();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((long) (short) -1, periodType64, chronology65);
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant46, (org.joda.time.ReadableDuration) duration51, periodType64);
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType64);
        org.joda.time.Period period69 = new org.joda.time.Period((long) '4', 0L, periodType64);
        org.joda.time.Period period70 = period41.withPeriodType(periodType64);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(mutablePeriod38);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(period70);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.withYears((int) ' ');
        org.joda.time.Period period13 = period11.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 'a', periodType15, chronology16);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 'a', periodType19, chronology20);
        org.joda.time.Hours hours22 = period21.toStandardHours();
        org.joda.time.Period period23 = period17.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period17.withYears(10);
        org.joda.time.Period period26 = period25.toPeriod();
        org.joda.time.Period period28 = period25.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = period33.toDurationFrom(readableInstant34);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant37, readableInstant38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationFrom(readableInstant40);
        org.joda.time.Period period43 = period39.plusMonths(0);
        org.joda.time.Period period45 = period43.plusMonths((int) '#');
        org.joda.time.Period period47 = period43.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType48 = period43.getPeriodType();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) (short) -1, periodType48, chronology49);
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant30, (org.joda.time.ReadableDuration) duration35, periodType48);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) (byte) 0, periodType48, chronology52);
        org.joda.time.Period period54 = period28.normalizedStandard(periodType48);
        int[] intArray55 = period54.getValues();
        int int56 = period54.size();
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = period54.toDurationTo(readableInstant57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant62, readableInstant63);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Duration duration66 = period64.toDurationFrom(readableInstant65);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant68, readableInstant69);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Duration duration72 = period70.toDurationFrom(readableInstant71);
        org.joda.time.Period period74 = period70.plusMonths(0);
        org.joda.time.Period period76 = period74.plusMonths((int) '#');
        org.joda.time.Period period78 = period74.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType79 = period74.getPeriodType();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((long) (short) -1, periodType79, chronology80);
        org.joda.time.Period period82 = new org.joda.time.Period(readableInstant61, (org.joda.time.ReadableDuration) duration66, periodType79);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((long) (short) 100, periodType79, chronology83);
        org.joda.time.Period period85 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration58, readableInstant59, periodType79);
        org.joda.time.Period period86 = period13.withPeriodType(periodType79);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[10, 0, 0, 0, 0, 0, 0, 98]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 8 + "'", int56 == 8);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertNotNull(period86);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) '4');
        org.joda.time.Period period3 = org.joda.time.Period.weeks((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) (short) 0, chronology8);
        org.joda.time.Period period11 = period9.minusMillis((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.Period period15 = period14.normalizedStandard();
        org.joda.time.Period period17 = period14.withWeeks(1);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 'a', periodType19, chronology20);
        org.joda.time.Period period23 = period21.withMinutes(0);
        org.joda.time.Period period24 = period14.minus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period26 = period23.minusMillis((int) ' ');
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 'a', periodType28, chronology29);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) 'a', periodType32, chronology33);
        org.joda.time.Hours hours35 = period34.toStandardHours();
        org.joda.time.Period period36 = period30.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period38 = period30.withYears(10);
        org.joda.time.Period period39 = period38.toPeriod();
        org.joda.time.Period period41 = period38.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant44, readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = period46.toDurationFrom(readableInstant47);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant50, readableInstant51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = period52.toDurationFrom(readableInstant53);
        org.joda.time.Period period56 = period52.plusMonths(0);
        org.joda.time.Period period58 = period56.plusMonths((int) '#');
        org.joda.time.Period period60 = period56.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType61 = period56.getPeriodType();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period((long) (short) -1, periodType61, chronology62);
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant43, (org.joda.time.ReadableDuration) duration48, periodType61);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((long) (byte) 0, periodType61, chronology65);
        org.joda.time.Period period67 = period41.normalizedStandard(periodType61);
        org.joda.time.Period period68 = period23.normalizedStandard(periodType61);
        org.joda.time.Period period69 = period9.withPeriodType(periodType61);
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant6, periodType61);
        org.joda.time.Period period71 = period1.withPeriodType(periodType61);
        org.joda.time.Period period73 = period71.plusWeeks((-10));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period73);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Days days8 = period5.toStandardDays();
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period5);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 100, (long) (-1), chronology12);
        org.joda.time.Period period15 = period13.withHours(0);
        org.joda.time.Period period17 = period13.plusSeconds(0);
        org.joda.time.Period period18 = period9.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.Period period24 = period22.plusMonths((int) '4');
        org.joda.time.Period period26 = period24.withYears(0);
        org.joda.time.Period period27 = period9.minus((org.joda.time.ReadablePeriod) period24);
        int int28 = period24.getDays();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 1, (int) (short) 10, 0, (int) (short) -1, (int) (short) -1, (int) (byte) 100, (int) '4', 100);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period3 = org.joda.time.Period.millis(1);
        org.joda.time.Period period5 = period3.withWeeks((int) (short) 0);
        org.joda.time.Period period6 = period1.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period7 = period6.toPeriod();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.Period period24 = period20.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType25, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType25);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType25);
        org.joda.time.Period period30 = new org.joda.time.Period((java.lang.Object) period6, periodType25);
        org.joda.time.Period period32 = period6.minusMonths((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds33 = period6.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.minusMinutes(100);
        org.joda.time.Period period11 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period13 = period11.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) (byte) 0);
        int int26 = period19.indexOf(durationFieldType25);
        org.joda.time.Period period28 = period11.withFieldAdded(durationFieldType25, 1);
        org.joda.time.Period period29 = period28.negated();
        org.joda.time.Period period30 = period9.plus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period9.minusSeconds((int) '#');
        org.joda.time.Period period34 = period32.minusMillis((-1));
        org.joda.time.Period period36 = period32.minusSeconds(10);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) 'a', periodType39, chronology40);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) 'a', periodType43, chronology44);
        org.joda.time.Hours hours46 = period45.toStandardHours();
        org.joda.time.Period period47 = period41.withFields((org.joda.time.ReadablePeriod) period45);
        org.joda.time.Period period49 = period41.withYears(10);
        org.joda.time.Period period50 = period49.toPeriod();
        org.joda.time.Period period52 = period49.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant55, readableInstant56);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Duration duration59 = period57.toDurationFrom(readableInstant58);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant61, readableInstant62);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Duration duration65 = period63.toDurationFrom(readableInstant64);
        org.joda.time.Period period67 = period63.plusMonths(0);
        org.joda.time.Period period69 = period67.plusMonths((int) '#');
        org.joda.time.Period period71 = period67.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType72 = period67.getPeriodType();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period((long) (short) -1, periodType72, chronology73);
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant54, (org.joda.time.ReadableDuration) duration59, periodType72);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.Period period77 = new org.joda.time.Period((long) (byte) 0, periodType72, chronology76);
        org.joda.time.Period period78 = period52.normalizedStandard(periodType72);
        org.joda.time.Period period80 = period78.withMillis((int) (byte) 10);
        org.joda.time.PeriodType periodType81 = period78.getPeriodType();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.Period period83 = new org.joda.time.Period((long) (-1), periodType81, chronology82);
        org.joda.time.Period period84 = period32.withPeriodType(periodType81);
        org.joda.time.Hours hours85 = period84.toStandardHours();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(hours46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(periodType81);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(hours85);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.joda.time.Period period2 = org.joda.time.Period.seconds((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period5.withWeeks(1);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 'a', periodType10, chronology11);
        org.joda.time.Period period14 = period12.withMinutes(0);
        org.joda.time.Period period15 = period5.minus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period17 = period14.minusMillis((int) ' ');
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 'a', periodType19, chronology20);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 'a', periodType23, chronology24);
        org.joda.time.Hours hours26 = period25.toStandardHours();
        org.joda.time.Period period27 = period21.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period29 = period21.withYears(10);
        org.joda.time.Period period30 = period29.toPeriod();
        org.joda.time.Period period32 = period29.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationFrom(readableInstant38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.Period period51 = period47.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType52 = period47.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (short) -1, periodType52, chronology53);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration39, periodType52);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) (byte) 0, periodType52, chronology56);
        org.joda.time.Period period58 = period32.normalizedStandard(periodType52);
        org.joda.time.Period period59 = period14.normalizedStandard(periodType52);
        int int60 = period59.getMonths();
        org.joda.time.PeriodType periodType61 = period59.getPeriodType();
        org.joda.time.Period period62 = period2.withPeriodType(periodType61);
        org.joda.time.Period period63 = new org.joda.time.Period((long) (-1), periodType61);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(period62);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period10 = period1.minusSeconds((int) 'a');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.Period period17 = period13.plusMonths(0);
        org.joda.time.Period period19 = period17.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period17.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period17.minusMinutes((int) (byte) -1);
        org.joda.time.Seconds seconds24 = period17.toStandardSeconds();
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) period17);
        org.joda.time.Period period27 = period25.withMinutes((int) '#');
        int int28 = period27.getMillis();
        org.joda.time.Period period29 = period1.withFields((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Period period31 = period27.withMinutes((int) (byte) 0);
        org.joda.time.Period period33 = period27.minusHours(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.Period period8 = period2.withMonths((int) '4');
        org.joda.time.Period period10 = period8.plusSeconds((int) (byte) 10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 100, (long) (-1), chronology13);
        org.joda.time.Period period16 = period14.plusMinutes((int) (short) 10);
        org.joda.time.Period period18 = period16.plusMinutes((-1));
        int int19 = period18.getWeeks();
        org.joda.time.Period period21 = period18.withMinutes((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.Period period28 = period24.plusMonths(0);
        org.joda.time.Period period30 = period28.plusMonths((int) '#');
        org.joda.time.Period period32 = period28.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = period35.toDurationFrom(readableInstant36);
        org.joda.time.Period period39 = period35.plusMonths(0);
        org.joda.time.Period period41 = period39.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period39.toDurationFrom(readableInstant42);
        org.joda.time.Period period45 = period39.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant46, readableInstant47, periodType48);
        org.joda.time.Period period51 = period49.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant52, readableInstant53, periodType54);
        org.joda.time.Period period57 = period55.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant58, readableInstant59, periodType60);
        org.joda.time.DurationFieldType durationFieldType63 = period61.getFieldType((int) (byte) 0);
        int int64 = period57.indexOf(durationFieldType63);
        int int65 = period49.get(durationFieldType63);
        org.joda.time.Period period67 = period39.withField(durationFieldType63, (int) (short) 0);
        boolean boolean68 = period32.isSupported(durationFieldType63);
        org.joda.time.Period period70 = period21.withField(durationFieldType63, (int) ' ');
        org.joda.time.Period period72 = period8.withField(durationFieldType63, (-1));
        java.lang.Class<?> wildcardClass73 = period72.getClass();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        int int7 = period6.getYears();
        org.joda.time.Period period9 = period6.withMonths((int) (byte) 100);
        int[] intArray10 = period9.getValues();
        org.joda.time.Period period12 = period9.minusMonths((int) (short) 10);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.Period period5 = period3.plusHours(1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.Period period24 = period20.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, periodType25, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration12, periodType25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 0, periodType25, chronology29);
        org.joda.time.Period period31 = period5.withPeriodType(periodType25);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) (short) 10, chronology33);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) 'a', periodType36, chronology37);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 'a', periodType40, chronology41);
        org.joda.time.Hours hours43 = period42.toStandardHours();
        org.joda.time.Period period44 = period38.withFields((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Period period46 = period38.withYears(10);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant47, readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period49.plusMonths(0);
        org.joda.time.Period period55 = period49.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant56, readableInstant57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = period58.toDurationFrom(readableInstant59);
        org.joda.time.Period period62 = period58.plusMonths(0);
        org.joda.time.Period period64 = period62.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Duration duration66 = period62.toDurationFrom(readableInstant65);
        org.joda.time.Period period68 = period62.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant69, readableInstant70, periodType71);
        org.joda.time.Period period74 = period72.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period(readableInstant75, readableInstant76, periodType77);
        org.joda.time.Period period80 = period78.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period(readableInstant81, readableInstant82, periodType83);
        org.joda.time.DurationFieldType durationFieldType86 = period84.getFieldType((int) (byte) 0);
        int int87 = period80.indexOf(durationFieldType86);
        int int88 = period72.get(durationFieldType86);
        org.joda.time.Period period90 = period62.withField(durationFieldType86, (int) (short) 0);
        int int91 = period55.indexOf(durationFieldType86);
        int int92 = period46.get(durationFieldType86);
        int int93 = period34.get(durationFieldType86);
        org.joda.time.Period period95 = period31.withFieldAdded(durationFieldType86, (int) (byte) -1);
        int int96 = period95.getMonths();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(hours43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(durationFieldType86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 10 + "'", int92 == 10);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(period95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((-1L), 100L, chronology2);
        org.joda.time.Period period5 = period3.minusHours(100);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.Period period16 = new org.joda.time.Period(8, 0, 97, (int) (byte) 10, 52, 0, 17, (int) (short) 100);
        org.joda.time.Period period17 = period5.minus((org.joda.time.ReadablePeriod) period16);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = period2.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.Period period17 = period16.normalizedStandard();
        org.joda.time.Period period19 = period16.withWeeks(1);
        int int20 = period19.getWeeks();
        org.joda.time.Period period21 = period2.minus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationTo(readableInstant22);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.Period period34 = period30.plusMonths(0);
        org.joda.time.Period period36 = period34.plusMonths((int) '#');
        org.joda.time.Period period38 = period34.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType39 = period34.getPeriodType();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) (short) -1, periodType39, chronology40);
        org.joda.time.Period period42 = period26.minus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant53, readableInstant54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = period55.toDurationFrom(readableInstant56);
        org.joda.time.Period period59 = period55.plusMonths(0);
        org.joda.time.Period period61 = period59.plusMonths((int) '#');
        org.joda.time.Period period63 = period59.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType64 = period59.getPeriodType();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((long) (short) -1, periodType64, chronology65);
        org.joda.time.Period period67 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType64);
        org.joda.time.Period period68 = new org.joda.time.Period((long) (byte) 10, periodType64);
        org.joda.time.Period period69 = period41.withPeriodType(periodType64);
        org.joda.time.Period period70 = new org.joda.time.Period((long) 11, periodType64);
        org.joda.time.Period period71 = new org.joda.time.Period((java.lang.Object) readableInstant22, periodType64);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(period69);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.Period period7 = period5.plusDays((int) (short) 100);
        org.joda.time.Days days8 = period7.toStandardDays();
        org.joda.time.Period period10 = period7.plusMillis((int) (short) -1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(11);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) '4', (-1L), periodType4, chronology5);
        org.joda.time.Period period7 = period6.toPeriod();
        org.joda.time.Days days8 = period6.toStandardDays();
        boolean boolean9 = period1.equals((java.lang.Object) days8);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) ' ');
        org.joda.time.Period period3 = period1.withSeconds(35);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.minusYears(100);
        org.joda.time.Period period5 = period4.negated();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType11);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        org.joda.time.Period period14 = period8.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period12.withMonths((int) (byte) 0);
        org.joda.time.Period period18 = period16.minusSeconds((-1));
        org.joda.time.Period period20 = period18.minusHours((-1));
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) 'a', periodType26, chronology27);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 'a', periodType30, chronology31);
        org.joda.time.Hours hours33 = period32.toStandardHours();
        org.joda.time.Period period34 = period28.withFields((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period36 = period28.withYears(10);
        org.joda.time.Period period37 = period36.toPeriod();
        org.joda.time.Period period39 = period36.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant42, readableInstant43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationFrom(readableInstant45);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant48, readableInstant49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationFrom(readableInstant51);
        org.joda.time.Period period54 = period50.plusMonths(0);
        org.joda.time.Period period56 = period54.plusMonths((int) '#');
        org.joda.time.Period period58 = period54.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType59 = period54.getPeriodType();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((long) (short) -1, periodType59, chronology60);
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant41, (org.joda.time.ReadableDuration) duration46, periodType59);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((long) (byte) 0, periodType59, chronology63);
        org.joda.time.Period period65 = period39.normalizedStandard(periodType59);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(0L, (long) 8, periodType59, chronology66);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period((long) ' ', periodType59, chronology68);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(10L, periodType59, chronology70);
        org.joda.time.Period period72 = period18.plus((org.joda.time.ReadablePeriod) period71);
        boolean boolean73 = period5.equals((java.lang.Object) period72);
        int int74 = period5.getSeconds();
        org.joda.time.Period period76 = org.joda.time.Period.hours((int) (byte) -1);
        org.joda.time.Period period77 = period5.withFields((org.joda.time.ReadablePeriod) period76);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period77);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.joda.time.Period period8 = new org.joda.time.Period(10, (int) (byte) 100, 52, (int) (byte) 100, (int) (short) 10, (int) (byte) -1, (int) '4', (-100));
        org.joda.time.Period period10 = period8.minusSeconds((int) ' ');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.Period period27 = period23.plusMonths(0);
        org.joda.time.Period period29 = period27.plusMonths((int) '#');
        org.joda.time.Period period31 = period27.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType32 = period27.getPeriodType();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) (short) -1, periodType32, chronology33);
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration19, periodType32);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant48, readableInstant49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant51, readableInstant52, periodType53);
        org.joda.time.MutablePeriod mutablePeriod55 = period54.toMutablePeriod();
        org.joda.time.Period period56 = period50.plus((org.joda.time.ReadablePeriod) period54);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant57, readableInstant58, periodType59);
        org.joda.time.Period period62 = period60.plusMonths((int) '4');
        org.joda.time.Period period63 = period54.withFields((org.joda.time.ReadablePeriod) period62);
        org.joda.time.PeriodType periodType64 = period62.getPeriodType();
        org.joda.time.Period period65 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType64);
        org.joda.time.Period period66 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType64);
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant36, readableInstant37, periodType64);
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant13, (org.joda.time.ReadableDuration) duration19, periodType64);
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType64);
        org.joda.time.Period period70 = period8.withPeriodType(periodType64);
        java.lang.String str71 = period70.toString();
        int int72 = period70.getHours();
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(mutablePeriod55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "P10Y100M52W100DT10H-1M51.900S" + "'", str71, "P10Y100M52W100DT10H-1M51.900S");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period6.minusSeconds((int) '#');
        org.joda.time.Period period10 = period6.minusYears((int) (short) 100);
        org.joda.time.Period period12 = period6.minusMillis((int) (byte) -1);
        int int13 = period12.size();
        org.joda.time.Period period15 = period12.minusMonths(32);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.Days days17 = period16.toStandardDays();
        int int18 = period16.getMonths();
        org.joda.time.Period period20 = period16.plusMillis(98);
        org.joda.time.Period period22 = period20.withDays((int) (short) 10);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) ' ');
        int int12 = period7.getDays();
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.years((int) (byte) -1);
        int int4 = period3.getSeconds();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        org.joda.time.Period period35 = period31.plusMonths(0);
        org.joda.time.Period period37 = period35.plusMonths((int) '#');
        org.joda.time.Period period39 = period35.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType40 = period35.getPeriodType();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) -1, periodType40, chronology41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant22, (org.joda.time.ReadableDuration) duration27, periodType40);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) (short) 100, periodType40, chronology44);
        org.joda.time.Period period46 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType40);
        org.joda.time.Period period47 = new org.joda.time.Period((int) (byte) 1, 97, (-100), (int) (short) 1, (int) 'a', 100, (int) 'a', (int) '#', periodType40);
        org.joda.time.Period period48 = period3.withPeriodType(periodType40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period49 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(period48);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        org.joda.time.Period period21 = period17.plusMonths(0);
        org.joda.time.Period period23 = period21.plusMonths((int) '#');
        org.joda.time.Period period25 = period21.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType26 = period21.getPeriodType();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (short) -1, periodType26, chronology27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration13, periodType26);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant30);
        org.joda.time.PeriodType periodType32 = period31.getPeriodType();
        org.joda.time.Period period33 = new org.joda.time.Period((int) (short) 0, (int) (byte) 0, 0, 35, 10, 8, (int) '4', 35, periodType32);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType32);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period2.withYears((int) (byte) -1);
        org.joda.time.Period period15 = new org.joda.time.Period(97, (int) (short) 0, 100, (int) (short) 100);
        org.joda.time.Period period17 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 'a', periodType19, chronology20);
        org.joda.time.Hours hours22 = period21.toStandardHours();
        org.joda.time.Period period24 = period21.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, readableInstant26, periodType27);
        org.joda.time.DurationFieldType durationFieldType30 = period28.getFieldType((int) (byte) 0);
        org.joda.time.Period period32 = period21.withField(durationFieldType30, 1);
        boolean boolean33 = period17.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType36);
        org.joda.time.Period period39 = period37.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, readableInstant41, periodType42);
        org.joda.time.DurationFieldType durationFieldType45 = period43.getFieldType((int) (byte) 0);
        int int46 = period39.indexOf(durationFieldType45);
        org.joda.time.Period period48 = period17.withFieldAdded(durationFieldType45, (int) (short) 0);
        int int49 = period15.get(durationFieldType45);
        int int50 = period2.get(durationFieldType45);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology53);
        java.lang.String str55 = period54.toString();
        org.joda.time.Period period56 = new org.joda.time.Period((java.lang.Object) str55);
        org.joda.time.Period period57 = period56.normalizedStandard();
        org.joda.time.Period period59 = period57.withHours((-100));
        org.joda.time.Period period60 = period2.withFields((org.joda.time.ReadablePeriod) period57);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PT0.011S" + "'", str55, "PT0.011S");
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period60);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.MutablePeriod mutablePeriod18 = period17.toMutablePeriod();
        org.joda.time.Period period19 = period13.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.Period period25 = period23.plusMonths((int) '4');
        org.joda.time.Period period26 = period17.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.PeriodType periodType27 = period25.getPeriodType();
        org.joda.time.Period period28 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType27);
        org.joda.time.Period period29 = new org.joda.time.Period((long) 'a', (long) 10, periodType27);
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) 100, 100L, periodType27);
        org.joda.time.Period period31 = period3.withPeriodType(periodType27);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant42, readableInstant43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationFrom(readableInstant45);
        org.joda.time.Period period48 = period44.plusMonths(0);
        org.joda.time.Period period50 = period48.plusMonths((int) '#');
        org.joda.time.Period period52 = period48.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType53 = period48.getPeriodType();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType53, chronology54);
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant38, readableInstant39, periodType53);
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant36, readableInstant37, periodType53);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) ' ', 0L, periodType53, chronology58);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((long) (-3), (long) 100, periodType53, chronology60);
        org.joda.time.Period period62 = period31.withFields((org.joda.time.ReadablePeriod) period61);
        int int63 = period31.getHours();
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.minusMinutes(100);
        org.joda.time.Period period11 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period13 = period11.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.DurationFieldType durationFieldType25 = period23.getFieldType((int) (byte) 0);
        int int26 = period19.indexOf(durationFieldType25);
        org.joda.time.Period period28 = period11.withFieldAdded(durationFieldType25, 1);
        org.joda.time.Period period29 = period28.negated();
        org.joda.time.Period period30 = period9.plus((org.joda.time.ReadablePeriod) period28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) 100);
        org.joda.time.Period period3 = period1.plusMinutes(17);
        org.joda.time.Period period5 = period1.plusYears((-101));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.Period period9 = period7.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.DurationFieldType durationFieldType15 = period13.getFieldType((int) (byte) 0);
        int int16 = period9.indexOf(durationFieldType15);
        org.joda.time.Period period18 = period1.withFieldAdded(durationFieldType15, 1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.Period period22 = period21.normalizedStandard();
        int int23 = period21.getMillis();
        org.joda.time.Period period24 = period18.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period26 = period18.withWeeks((int) (byte) 0);
        org.joda.time.Period period28 = period18.plusMinutes(97);
        org.joda.time.Period period30 = period18.withMinutes((-31));
        org.joda.time.Period period32 = period18.withWeeks(197);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.Period period9 = period7.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.DurationFieldType durationFieldType15 = period13.getFieldType((int) (byte) 0);
        int int16 = period9.indexOf(durationFieldType15);
        org.joda.time.Period period18 = period1.withFieldAdded(durationFieldType15, 1);
        org.joda.time.Period period19 = period18.negated();
        org.joda.time.Period period21 = period19.withMonths(10);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((java.lang.Object) period19, chronology22);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period14.toMutablePeriod();
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) period14);
        int int19 = period14.getDays();
        org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) period14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType22 = period14.getFieldType((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Duration duration6 = period2.toStandardDuration();
        org.joda.time.Period period8 = period2.withYears((int) 'a');
        org.joda.time.Period period10 = period8.minusWeeks(0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (long) (short) 10);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 100);
        org.joda.time.Period period3 = period1.withMillis(10);
        org.joda.time.Period period5 = period1.plusDays(0);
        org.joda.time.Period period7 = period1.minusSeconds(0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period3.toDurationTo(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.Period period13 = period9.minusDays(17);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes((int) (short) 10);
        org.joda.time.Period period7 = period5.plusMinutes((-1));
        int int8 = period7.getWeeks();
        org.joda.time.Period period10 = period7.withMinutes((int) (byte) 10);
        org.joda.time.Period period12 = period7.withHours(0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-100), chronology1);
        org.joda.time.Period period3 = period2.negated();
        org.joda.time.Period period5 = org.joda.time.Period.days((int) (byte) 100);
        org.joda.time.Period period7 = period5.withMonths((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.Period period14 = period10.plusMonths(0);
        org.joda.time.Period period16 = period14.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period14.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period14.minusMinutes((int) (byte) -1);
        org.joda.time.Seconds seconds21 = period14.toStandardSeconds();
        org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) period14);
        org.joda.time.Period period24 = period22.plusSeconds((int) (byte) 1);
        org.joda.time.Period period26 = period22.withWeeks((int) (byte) 10);
        boolean boolean27 = period5.equals((java.lang.Object) period22);
        int int28 = period5.getWeeks();
        org.joda.time.Period period29 = period5.toPeriod();
        org.joda.time.Period period30 = period5.negated();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant42, readableInstant43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationFrom(readableInstant45);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant48, readableInstant49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationFrom(readableInstant51);
        org.joda.time.Period period54 = period50.plusMonths(0);
        org.joda.time.Period period56 = period54.plusMonths((int) '#');
        org.joda.time.Period period58 = period54.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType59 = period54.getPeriodType();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((long) (short) -1, periodType59, chronology60);
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant41, (org.joda.time.ReadableDuration) duration46, periodType59);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType59, chronology63);
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration36, readableInstant38, periodType59);
        org.joda.time.Period period66 = new org.joda.time.Period((java.lang.Object) readableInstant38);
        org.joda.time.Period period68 = period66.minusMinutes((int) (byte) 1);
        org.joda.time.Period period69 = period5.minus((org.joda.time.ReadablePeriod) period68);
        org.joda.time.Period period70 = period2.withFields((org.joda.time.ReadablePeriod) period69);
        int int71 = period2.getDays();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 1);
        org.joda.time.Period period3 = period1.withDays(1);
        org.joda.time.Period period4 = period1.normalizedStandard();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(100L, chronology6);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 'a', periodType13, chronology14);
        org.joda.time.Hours hours16 = period15.toStandardHours();
        org.joda.time.Period period17 = period11.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period19 = period11.withYears(10);
        org.joda.time.Period period20 = period7.plus((org.joda.time.ReadablePeriod) period11);
        int int21 = period7.getMonths();
        org.joda.time.Period period23 = period7.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.Period period35 = period31.plusMinutes((int) (short) 100);
        org.joda.time.Period period37 = period35.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) period35, periodType38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period35.toDurationTo(readableInstant40);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType46);
        org.joda.time.Period period49 = period47.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period47.toDurationTo(readableInstant50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration51, readableInstant52);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant61, readableInstant62);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Duration duration65 = period63.toDurationFrom(readableInstant64);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant67, readableInstant68);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Duration duration71 = period69.toDurationFrom(readableInstant70);
        org.joda.time.Period period73 = period69.plusMonths(0);
        org.joda.time.Period period75 = period73.plusMonths((int) '#');
        org.joda.time.Period period77 = period73.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType78 = period73.getPeriodType();
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.Period period80 = new org.joda.time.Period((long) (short) -1, periodType78, chronology79);
        org.joda.time.Period period81 = new org.joda.time.Period(readableInstant60, (org.joda.time.ReadableDuration) duration65, periodType78);
        org.joda.time.Period period82 = new org.joda.time.Period(readableInstant58, readableInstant59, periodType78);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period((long) (-100), (long) (-100), periodType78, chronology83);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.Period period86 = new org.joda.time.Period((long) 0, (long) 100, periodType78, chronology85);
        org.joda.time.Period period87 = period53.withPeriodType(periodType78);
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.Period period89 = new org.joda.time.Period((long) (byte) 10, (long) '4', periodType78, chronology88);
        org.joda.time.Period period90 = new org.joda.time.Period(readableInstant24, (org.joda.time.ReadableDuration) duration41, periodType78);
        org.joda.time.Period period91 = period23.withPeriodType(periodType78);
        org.joda.time.Period period92 = period1.withPeriodType(periodType78);
        org.joda.time.DurationFieldType durationFieldType93 = null;
        boolean boolean94 = period92.isSupported(durationFieldType93);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(periodType78);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.Period period9 = period7.multipliedBy((int) (byte) -1);
        org.joda.time.Period period11 = period9.minusSeconds(8);
        int int12 = period11.size();
        int int13 = period11.getMinutes();
        org.joda.time.Period period15 = period11.plusHours((int) (byte) -1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((-3));
        org.joda.time.Period period3 = period1.minusHours(0);
        org.joda.time.Period period4 = period3.negated();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.MutablePeriod mutablePeriod14 = period13.toMutablePeriod();
        org.joda.time.Period period15 = period9.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, readableInstant17, periodType18);
        org.joda.time.Period period21 = period19.plusMonths((int) '4');
        org.joda.time.Period period22 = period13.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) 'a', periodType26, chronology27);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 'a', periodType30, chronology31);
        org.joda.time.Hours hours33 = period32.toStandardHours();
        org.joda.time.Period period34 = period28.withFields((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period36 = period28.withYears(10);
        org.joda.time.Period period37 = period36.toPeriod();
        org.joda.time.Period period39 = period36.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant42, readableInstant43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationFrom(readableInstant45);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant48, readableInstant49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationFrom(readableInstant51);
        org.joda.time.Period period54 = period50.plusMonths(0);
        org.joda.time.Period period56 = period54.plusMonths((int) '#');
        org.joda.time.Period period58 = period54.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType59 = period54.getPeriodType();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((long) (short) -1, periodType59, chronology60);
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant41, (org.joda.time.ReadableDuration) duration46, periodType59);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((long) (byte) 0, periodType59, chronology63);
        org.joda.time.Period period65 = period39.normalizedStandard(periodType59);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(0L, (long) 8, periodType59, chronology66);
        org.joda.time.Period period68 = new org.joda.time.Period((java.lang.Object) period13, periodType59);
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType59);
        org.joda.time.Hours hours70 = period69.toStandardHours();
        org.joda.time.PeriodType periodType71 = period69.getPeriodType();
        org.joda.time.Period period72 = period3.withPeriodType(periodType71);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(mutablePeriod14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(hours33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(hours70);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(period72);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.withYears((int) ' ');
        org.joda.time.Period period13 = period11.withWeeks((int) ' ');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 100, (long) (-1), chronology16);
        org.joda.time.Period period19 = period17.plusMinutes((int) (short) 10);
        org.joda.time.Period period21 = period19.plusMinutes((-1));
        int int22 = period21.getWeeks();
        org.joda.time.Period period24 = period21.withMinutes((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.Period period35 = period31.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        org.joda.time.Period period42 = period38.plusMonths(0);
        org.joda.time.Period period44 = period42.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period42.toDurationFrom(readableInstant45);
        org.joda.time.Period period48 = period42.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, readableInstant50, periodType51);
        org.joda.time.Period period54 = period52.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant55, readableInstant56, periodType57);
        org.joda.time.Period period60 = period58.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, readableInstant62, periodType63);
        org.joda.time.DurationFieldType durationFieldType66 = period64.getFieldType((int) (byte) 0);
        int int67 = period60.indexOf(durationFieldType66);
        int int68 = period52.get(durationFieldType66);
        org.joda.time.Period period70 = period42.withField(durationFieldType66, (int) (short) 0);
        boolean boolean71 = period35.isSupported(durationFieldType66);
        org.joda.time.Period period73 = period24.withField(durationFieldType66, (int) ' ');
        org.joda.time.Period period75 = period73.minusHours((-100));
        org.joda.time.Period period76 = period13.withFields((org.joda.time.ReadablePeriod) period75);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period76);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 'a', periodType19, chronology20);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 'a', periodType23, chronology24);
        org.joda.time.Hours hours26 = period25.toStandardHours();
        org.joda.time.Period period27 = period21.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period29 = period21.withYears(10);
        org.joda.time.Period period30 = period29.toPeriod();
        org.joda.time.Period period32 = period29.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationFrom(readableInstant38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.Period period51 = period47.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType52 = period47.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (short) -1, periodType52, chronology53);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration39, periodType52);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) (byte) 0, periodType52, chronology56);
        org.joda.time.Period period58 = period32.normalizedStandard(periodType52);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(0L, (long) 8, periodType52, chronology59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((long) ' ', periodType52, chronology61);
        org.joda.time.Period period63 = new org.joda.time.Period((java.lang.Object) period14, periodType52);
        org.joda.time.Period period68 = new org.joda.time.Period(100, (int) '4', 8, (int) (byte) -1);
        org.joda.time.Period period69 = period63.withFields((org.joda.time.ReadablePeriod) period68);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period69);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 0);
        org.joda.time.Period period3 = period1.withMillis(3);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.Period period9 = period7.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.DurationFieldType durationFieldType15 = period13.getFieldType((int) (byte) 0);
        int int16 = period9.indexOf(durationFieldType15);
        org.joda.time.Period period18 = period1.withFieldAdded(durationFieldType15, 1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.Period period22 = period21.normalizedStandard();
        int int23 = period21.getMillis();
        org.joda.time.Period period24 = period18.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period26 = period18.withWeeks((int) (byte) 0);
        org.joda.time.Period period28 = period18.plusMinutes(97);
        org.joda.time.Period period30 = period18.minusMonths(17);
        java.lang.String str31 = period18.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "P1Y-1M" + "'", str31, "P1Y-1M");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(197);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType16, chronology17);
        org.joda.time.Hours hours19 = period18.toStandardHours();
        org.joda.time.Period period21 = period18.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType24);
        org.joda.time.DurationFieldType durationFieldType27 = period25.getFieldType((int) (byte) 0);
        org.joda.time.Period period29 = period18.withField(durationFieldType27, 1);
        int int30 = period14.get(durationFieldType27);
        int int31 = period14.getWeeks();
        org.joda.time.Period period33 = period14.plusMonths((int) (byte) 1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.Period period17 = period13.plusMonths(0);
        org.joda.time.Period period19 = period17.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period17.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period17.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.Period period29 = period27.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant30, readableInstant31, periodType32);
        org.joda.time.Period period35 = period33.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, readableInstant37, periodType38);
        org.joda.time.DurationFieldType durationFieldType41 = period39.getFieldType((int) (byte) 0);
        int int42 = period35.indexOf(durationFieldType41);
        int int43 = period27.get(durationFieldType41);
        org.joda.time.Period period45 = period17.withField(durationFieldType41, (int) (short) 0);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(100L, (long) ' ', chronology48);
        org.joda.time.Period period51 = period49.plusHours(1);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant54, readableInstant55);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = period56.toDurationFrom(readableInstant57);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant60, readableInstant61);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Duration duration64 = period62.toDurationFrom(readableInstant63);
        org.joda.time.Period period66 = period62.plusMonths(0);
        org.joda.time.Period period68 = period66.plusMonths((int) '#');
        org.joda.time.Period period70 = period66.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType71 = period66.getPeriodType();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period((long) (short) -1, periodType71, chronology72);
        org.joda.time.Period period74 = new org.joda.time.Period(readableInstant53, (org.joda.time.ReadableDuration) duration58, periodType71);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period((long) (byte) 0, periodType71, chronology75);
        org.joda.time.Period period77 = period51.withPeriodType(periodType71);
        org.joda.time.Period period78 = period17.withPeriodType(periodType71);
        org.joda.time.Period period79 = new org.joda.time.Period((int) '#', (int) ' ', 0, (int) (short) -1, 100, (int) (byte) 100, (int) (byte) 0, 97, periodType71);
        org.joda.time.Period period80 = new org.joda.time.Period((long) (byte) -1, periodType71);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.Period period82 = new org.joda.time.Period(0L, (long) (byte) -1, periodType71, chronology81);
        int int83 = period82.getDays();
        org.joda.time.Period period85 = period82.minusMinutes((int) (short) 0);
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.Period period87 = new org.joda.time.Period((java.lang.Object) period85, chronology86);
        int int88 = period87.getDays();
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 1);
        org.joda.time.Weeks weeks2 = period1.toStandardWeeks();
        org.joda.time.Period period4 = period1.minusWeeks(32);
        org.joda.time.Period period6 = period1.plusYears((int) (byte) -1);
        org.joda.time.Period period8 = period1.plusMonths((-101));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 1, 10, 0, (int) (short) 10);
        int int5 = period4.getSeconds();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        org.joda.time.Period period10 = period8.plusMonths((int) '#');
        org.joda.time.Period period12 = period8.plusMinutes((int) (short) 100);
        org.joda.time.Period period14 = period12.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType16 = period12.getFieldType((int) (byte) 0);
        java.lang.String str17 = period12.toString();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period12.toDurationFrom(readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.Period period27 = period23.plusMonths(0);
        org.joda.time.Period period29 = period27.plusMonths((int) '#');
        org.joda.time.Period period31 = period27.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType32 = period27.getPeriodType();
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration19, readableInstant20, periodType32);
        org.joda.time.Period period38 = new org.joda.time.Period(97, (int) (short) 0, 100, (int) (short) 100);
        org.joda.time.Period period40 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) 'a', periodType42, chronology43);
        org.joda.time.Hours hours45 = period44.toStandardHours();
        org.joda.time.Period period47 = period44.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant48, readableInstant49, periodType50);
        org.joda.time.DurationFieldType durationFieldType53 = period51.getFieldType((int) (byte) 0);
        org.joda.time.Period period55 = period44.withField(durationFieldType53, 1);
        boolean boolean56 = period40.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant57, readableInstant58, periodType59);
        org.joda.time.Period period62 = period60.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period(readableInstant63, readableInstant64, periodType65);
        org.joda.time.DurationFieldType durationFieldType68 = period66.getFieldType((int) (byte) 0);
        int int69 = period62.indexOf(durationFieldType68);
        org.joda.time.Period period71 = period40.withFieldAdded(durationFieldType68, (int) (short) 0);
        int int72 = period38.get(durationFieldType68);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant73, readableInstant74);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Duration duration77 = period75.toDurationFrom(readableInstant76);
        org.joda.time.Period period79 = period75.plusMonths(0);
        org.joda.time.Period period81 = period79.plusMonths((int) '#');
        org.joda.time.Period period83 = period79.plusMinutes((int) (short) 100);
        org.joda.time.Period period85 = period83.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType87 = period83.getFieldType((int) (byte) 0);
        boolean boolean88 = period38.isSupported(durationFieldType87);
        org.joda.time.Period period90 = period33.withFieldAdded(durationFieldType87, (int) (short) -1);
        org.joda.time.Period period92 = period1.withField(durationFieldType87, (-3));
        org.joda.time.MutablePeriod mutablePeriod93 = period92.toMutablePeriod();
        int int94 = period92.getSeconds();
        org.joda.time.Period period96 = period92.multipliedBy((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT100M" + "'", str17, "PT100M");
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(hours45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(durationFieldType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(mutablePeriod93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(period96);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.joda.time.Period period1 = org.joda.time.Period.years(32);
        org.joda.time.Period period3 = period1.plusDays(52);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.minusSeconds((-1));
        org.joda.time.Period period14 = period12.minusHours((-1));
        org.joda.time.Period period16 = period12.withWeeks((-1));
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.Period period4 = period3.normalizedStandard();
        org.joda.time.Period period6 = period3.withWeeks(1);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 'a', periodType8, chronology9);
        org.joda.time.Period period12 = period10.withMinutes(0);
        org.joda.time.Period period13 = period3.minus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.DurationFieldType[] durationFieldTypeArray14 = period3.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.Period period18 = period17.normalizedStandard();
        org.joda.time.Period period20 = period17.withWeeks(1);
        int int21 = period20.getWeeks();
        org.joda.time.Period period22 = period3.minus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationTo(readableInstant23);
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration24);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldTypeArray14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period7.getFieldTypes();
        org.joda.time.Period period10 = period7.withDays((int) (byte) 10);
        org.joda.time.Period period12 = period7.withHours(32);
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = period12.getFieldTypes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 0, chronology1);
        org.joda.time.Period period4 = period2.minusMillis((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.Period period8 = period7.normalizedStandard();
        org.joda.time.Period period10 = period7.withWeeks(1);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 'a', periodType12, chronology13);
        org.joda.time.Period period16 = period14.withMinutes(0);
        org.joda.time.Period period17 = period7.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period19 = period16.minusMillis((int) ' ');
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 'a', periodType21, chronology22);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) 'a', periodType25, chronology26);
        org.joda.time.Hours hours28 = period27.toStandardHours();
        org.joda.time.Period period29 = period23.withFields((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Period period31 = period23.withYears(10);
        org.joda.time.Period period32 = period31.toPeriod();
        org.joda.time.Period period34 = period31.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant37, readableInstant38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationFrom(readableInstant40);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period45.toDurationFrom(readableInstant46);
        org.joda.time.Period period49 = period45.plusMonths(0);
        org.joda.time.Period period51 = period49.plusMonths((int) '#');
        org.joda.time.Period period53 = period49.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType54 = period49.getPeriodType();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) (short) -1, periodType54, chronology55);
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration41, periodType54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) (byte) 0, periodType54, chronology58);
        org.joda.time.Period period60 = period34.normalizedStandard(periodType54);
        org.joda.time.Period period61 = period16.normalizedStandard(periodType54);
        org.joda.time.Period period62 = period2.withPeriodType(periodType54);
        org.joda.time.Period period64 = period2.withMinutes((int) (short) -1);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(hours28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.joda.time.Period period1 = org.joda.time.Period.days(1);
        org.joda.time.Period period3 = period1.withSeconds(8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.MutablePeriod mutablePeriod17 = period16.toMutablePeriod();
        org.joda.time.Period period18 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.Period period24 = period22.plusMonths((int) '4');
        org.joda.time.Period period25 = period16.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.PeriodType periodType26 = period24.getPeriodType();
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period((long) (-100), (long) (short) 10, periodType26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 0, 10L, periodType26, chronology29);
        org.joda.time.Period period31 = period3.normalizedStandard(periodType26);
        org.joda.time.Period period33 = period31.minusHours((int) (byte) 0);
        org.joda.time.Period period35 = period33.withMonths(11);
        org.joda.time.Seconds seconds36 = period33.toStandardSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(seconds36);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.Period period10 = period9.normalizedStandard();
        org.joda.time.Period period12 = period9.plusMinutes((int) ' ');
        org.joda.time.Period period13 = period6.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) period9, chronology14);
        int[] intArray16 = period9.getValues();
        int int17 = period9.getDays();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) 1);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) period1, chronology2);
        org.joda.time.Period period5 = period1.plusYears((int) (short) -1);
        org.joda.time.Period period7 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period9 = org.joda.time.Period.millis(1);
        org.joda.time.Period period11 = period9.withWeeks((int) (short) 0);
        org.joda.time.Period period12 = period7.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.Period period16 = period15.normalizedStandard();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType25);
        org.joda.time.Period period27 = period16.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period28 = period12.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType31);
        org.joda.time.Period period34 = period32.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period32.toDurationTo(readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration36, readableInstant37);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 'a', periodType40, chronology41);
        org.joda.time.Period period44 = period42.withMinutes(0);
        org.joda.time.Period period46 = period44.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod47 = period44.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant48, readableInstant49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationFrom(readableInstant51);
        org.joda.time.Period period54 = period50.plusMonths(0);
        org.joda.time.Period period56 = period54.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = period54.toDurationFrom(readableInstant57);
        org.joda.time.Period period60 = period54.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, readableInstant62, periodType63);
        org.joda.time.Period period66 = period64.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant67, readableInstant68, periodType69);
        org.joda.time.Period period72 = period70.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant73, readableInstant74, periodType75);
        org.joda.time.DurationFieldType durationFieldType78 = period76.getFieldType((int) (byte) 0);
        int int79 = period72.indexOf(durationFieldType78);
        int int80 = period64.get(durationFieldType78);
        org.joda.time.Period period82 = period54.withField(durationFieldType78, (int) (short) 0);
        int int83 = mutablePeriod47.indexOf(durationFieldType78);
        boolean boolean84 = period38.isSupported(durationFieldType78);
        org.joda.time.Period period86 = period12.withField(durationFieldType78, (int) (short) 10);
        org.joda.time.Period period88 = period5.withField(durationFieldType78, 0);
        org.joda.time.Period period90 = period5.minusMonths((int) 'a');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(mutablePeriod47);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(period90);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.joda.time.Period period8 = new org.joda.time.Period(1, (-1), 8, (int) ' ', 100, (-31), 100, (-101));
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        int int5 = period3.getMillis();
        org.joda.time.Period period7 = period3.plusWeeks((-1));
        org.joda.time.Period period9 = period3.minusYears((int) (byte) -1);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.withYears((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period3.toDurationTo(readableInstant12);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration13, periodType14);
        org.joda.time.Period period17 = period15.plusSeconds((int) '#');
        org.joda.time.Period period19 = period15.minusMonths(10);
        org.joda.time.Period period22 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) 'a', periodType24, chronology25);
        org.joda.time.DurationFieldType durationFieldType27 = null;
        int int28 = period26.get(durationFieldType27);
        org.joda.time.Period period29 = period22.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period31 = period29.multipliedBy((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.Period period35 = period34.normalizedStandard();
        org.joda.time.Period period37 = period34.plusMinutes((int) ' ');
        org.joda.time.Period period38 = period37.normalizedStandard();
        org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) period38);
        org.joda.time.format.PeriodFormatter periodFormatter40 = null;
        java.lang.String str41 = period39.toString(periodFormatter40);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant52, readableInstant53);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = period54.toDurationFrom(readableInstant55);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant58, readableInstant59);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = period60.toDurationFrom(readableInstant61);
        org.joda.time.Period period64 = period60.plusMonths(0);
        org.joda.time.Period period66 = period64.plusMonths((int) '#');
        org.joda.time.Period period68 = period64.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType69 = period64.getPeriodType();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((long) (short) -1, periodType69, chronology70);
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant51, (org.joda.time.ReadableDuration) duration56, periodType69);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period((long) (short) 100, periodType69, chronology73);
        org.joda.time.Period period75 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType69);
        org.joda.time.Period period76 = new org.joda.time.Period((java.lang.Object) str41, periodType69);
        org.joda.time.Period period77 = period31.withPeriodType(periodType69);
        org.joda.time.Period period78 = new org.joda.time.Period((long) (byte) -1, periodType69);
        org.joda.time.Period period79 = new org.joda.time.Period((java.lang.Object) period15, periodType69);
        org.joda.time.Period period81 = period79.withWeeks(8);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PT32M" + "'", str41, "PT32M");
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period81);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        int int7 = period2.getWeeks();
        org.joda.time.Period period9 = period2.withYears(11);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes((int) (short) 10);
        org.joda.time.Period period7 = period3.plusMonths((-100));
        org.joda.time.Period period9 = period3.plusYears(32);
        org.joda.time.Period period11 = period9.plusSeconds(97);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days12 = period9.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.MutablePeriod mutablePeriod19 = period18.toMutablePeriod();
        org.joda.time.Period period20 = period14.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.Period period26 = period24.plusMonths((int) '4');
        org.joda.time.Period period27 = period18.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.PeriodType periodType28 = period26.getPeriodType();
        org.joda.time.Period period29 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType28);
        org.joda.time.Period period30 = new org.joda.time.Period((long) 'a', (long) 10, periodType28);
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) 100, 100L, periodType28);
        org.joda.time.Period period32 = period4.withPeriodType(periodType28);
        org.joda.time.Duration duration33 = period32.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant37, readableInstant38);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period39.toDurationFrom(readableInstant40);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period45.toDurationFrom(readableInstant46);
        org.joda.time.Period period49 = period45.plusMonths(0);
        org.joda.time.Period period51 = period49.plusMonths((int) '#');
        org.joda.time.Period period53 = period49.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType54 = period49.getPeriodType();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) (short) -1, periodType54, chronology55);
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant36, (org.joda.time.ReadableDuration) duration41, periodType54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType54, chronology58);
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration33, periodType54);
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((long) 'a', periodType62, chronology63);
        org.joda.time.Hours hours65 = period64.toStandardHours();
        org.joda.time.Period period67 = period64.plusSeconds((int) (byte) 1);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(100L, chronology69);
        org.joda.time.PeriodType periodType72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period((long) 'a', periodType72, chronology73);
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period((long) 'a', periodType76, chronology77);
        org.joda.time.Hours hours79 = period78.toStandardHours();
        org.joda.time.Period period80 = period74.withFields((org.joda.time.ReadablePeriod) period78);
        org.joda.time.Period period82 = period74.withYears(10);
        org.joda.time.Period period83 = period70.plus((org.joda.time.ReadablePeriod) period74);
        org.joda.time.Period period84 = period64.minus((org.joda.time.ReadablePeriod) period83);
        org.joda.time.Period period86 = period83.minusSeconds((int) '#');
        org.joda.time.Period period87 = period60.plus((org.joda.time.ReadablePeriod) period86);
        org.joda.time.Period period89 = period87.minusHours((int) (byte) 1);
        int int90 = period87.getDays();
        org.joda.time.Period period92 = period87.withMillis((-3));
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(hours65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(hours79);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(period92);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period4 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period6 = org.joda.time.Period.millis(1);
        org.joda.time.Period period8 = period6.withWeeks((int) (short) 0);
        org.joda.time.Period period9 = period4.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationTo(readableInstant10);
        org.joda.time.Period period13 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period15 = period13.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, readableInstant17, periodType18);
        org.joda.time.Period period21 = period19.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType24);
        org.joda.time.DurationFieldType durationFieldType27 = period25.getFieldType((int) (byte) 0);
        int int28 = period21.indexOf(durationFieldType27);
        org.joda.time.Period period30 = period13.withFieldAdded(durationFieldType27, 1);
        org.joda.time.Period period32 = period30.plusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType33 = period32.getPeriodType();
        org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) readableInstant10, periodType33);
        org.joda.time.Period period35 = new org.joda.time.Period((long) 32, periodType33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period36 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(100L, (long) ' ', chronology15);
        org.joda.time.Period period18 = period16.plusHours(1);
        org.joda.time.Weeks weeks19 = period18.toStandardWeeks();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology22);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) str24);
        org.joda.time.Period period27 = period25.plusSeconds((int) 'a');
        org.joda.time.Period period29 = period25.plusYears((int) (byte) 0);
        org.joda.time.Period period31 = period25.withMonths(0);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 'a', periodType33, chronology34);
        org.joda.time.Period period37 = period35.withMinutes(0);
        org.joda.time.Period period39 = period37.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod40 = period37.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period47.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period47.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, readableInstant55, periodType56);
        org.joda.time.Period period59 = period57.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, readableInstant61, periodType62);
        org.joda.time.Period period65 = period63.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, readableInstant67, periodType68);
        org.joda.time.DurationFieldType durationFieldType71 = period69.getFieldType((int) (byte) 0);
        int int72 = period65.indexOf(durationFieldType71);
        int int73 = period57.get(durationFieldType71);
        org.joda.time.Period period75 = period47.withField(durationFieldType71, (int) (short) 0);
        int int76 = mutablePeriod40.indexOf(durationFieldType71);
        int int77 = period31.get(durationFieldType71);
        org.joda.time.Period period79 = period18.withFieldAdded(durationFieldType71, (int) (byte) 1);
        org.joda.time.Period period81 = period2.withField(durationFieldType71, 0);
        org.joda.time.Period period82 = period81.toPeriod();
        org.joda.time.Period period84 = period81.plusMillis((int) (short) 10);
        org.joda.time.Period period86 = period84.withDays((int) (byte) 100);
        org.joda.time.PeriodType periodType87 = period86.getPeriodType();
        org.joda.time.Period period89 = period86.plusSeconds((int) (short) 1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0.011S" + "'", str24, "PT0.011S");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(periodType87);
        org.junit.Assert.assertNotNull(period89);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.plusMonths(0);
        org.joda.time.Period period9 = period3.plusWeeks((int) ' ');
        org.joda.time.Period period11 = period3.plusDays(10);
        org.joda.time.Duration duration12 = period11.toStandardDuration();
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.Period period15 = period13.withMonths(98);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT1H0.068S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 1);
        org.joda.time.Period period3 = period1.withDays(1);
        org.joda.time.Period period5 = period1.withSeconds(98);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
        org.joda.time.Period period22 = period18.plusMonths(0);
        org.joda.time.Period period24 = period22.plusMonths((int) '#');
        org.joda.time.Period period26 = period22.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType27 = period22.getPeriodType();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) (short) -1, periodType27, chronology28);
        org.joda.time.Period period30 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType27);
        org.joda.time.Period period31 = new org.joda.time.Period((long) (byte) 10, periodType27);
        org.joda.time.Period period32 = period1.normalizedStandard(periodType27);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.joda.time.Period period10 = new org.joda.time.Period(10, (int) (byte) 100, 52, (int) (byte) 100, (int) (short) 10, (int) (byte) -1, (int) '4', (-100));
        org.joda.time.PeriodType periodType11 = period10.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period((long) (-100), (long) 59, periodType11);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType4);
        org.joda.time.Period period7 = period5.minusMillis((int) '4');
        int int8 = period7.getSeconds();
        org.joda.time.Period period10 = period7.withHours(100);
        org.joda.time.Period period12 = period7.withMinutes((int) 'a');
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType16, chronology17);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 'a', periodType20, chronology21);
        org.joda.time.Hours hours23 = period22.toStandardHours();
        org.joda.time.Period period24 = period18.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period26 = period18.withYears(10);
        org.joda.time.Period period27 = period26.toPeriod();
        org.joda.time.Period period29 = period26.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant38, readableInstant39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        org.joda.time.Period period44 = period40.plusMonths(0);
        org.joda.time.Period period46 = period44.plusMonths((int) '#');
        org.joda.time.Period period48 = period44.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType49 = period44.getPeriodType();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) (short) -1, periodType49, chronology50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration36, periodType49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (byte) 0, periodType49, chronology53);
        org.joda.time.Period period55 = period29.normalizedStandard(periodType49);
        org.joda.time.Period period57 = period55.withMillis((int) (byte) 10);
        org.joda.time.PeriodType periodType58 = period55.getPeriodType();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((long) (short) 10, (long) 'a', periodType58, chronology59);
        org.joda.time.Period period61 = period12.withFields((org.joda.time.ReadablePeriod) period60);
        org.joda.time.PeriodType periodType62 = period61.getPeriodType();
        org.joda.time.Period period63 = new org.joda.time.Period(0L, (long) 0, periodType62);
        org.joda.time.Period period65 = period63.minusMinutes((int) (short) 10);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(period65);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.Period period3 = period1.withMonths(11);
        org.joda.time.Period period5 = period3.withWeeks(98);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period5, chronology6);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(8, (int) (short) 100, 10, 8, (int) 'a', (int) (short) 100, (int) ' ', 0);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 'a', periodType15, chronology16);
        org.joda.time.Hours hours18 = period17.toStandardHours();
        org.joda.time.Duration duration19 = period17.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant28, readableInstant29, periodType30);
        org.joda.time.MutablePeriod mutablePeriod32 = period31.toMutablePeriod();
        org.joda.time.Period period33 = period27.plus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType36);
        org.joda.time.Period period39 = period37.plusMonths((int) '4');
        org.joda.time.Period period40 = period31.withFields((org.joda.time.ReadablePeriod) period39);
        org.joda.time.PeriodType periodType41 = period39.getPeriodType();
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType41);
        org.joda.time.Period period43 = new org.joda.time.Period((long) 0, periodType41);
        org.joda.time.Period period44 = new org.joda.time.Period((long) (short) 100, periodType41);
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration19, readableInstant20, periodType41);
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, readableInstant13, periodType41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period47 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(periodType41);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.Period period5 = period3.plusHours(1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.Period period24 = period20.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, periodType25, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration12, periodType25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 0, periodType25, chronology29);
        org.joda.time.Period period31 = period5.withPeriodType(periodType25);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) (short) 10, chronology33);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) 'a', periodType36, chronology37);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 'a', periodType40, chronology41);
        org.joda.time.Hours hours43 = period42.toStandardHours();
        org.joda.time.Period period44 = period38.withFields((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Period period46 = period38.withYears(10);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant47, readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period49.plusMonths(0);
        org.joda.time.Period period55 = period49.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant56, readableInstant57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = period58.toDurationFrom(readableInstant59);
        org.joda.time.Period period62 = period58.plusMonths(0);
        org.joda.time.Period period64 = period62.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Duration duration66 = period62.toDurationFrom(readableInstant65);
        org.joda.time.Period period68 = period62.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant69, readableInstant70, periodType71);
        org.joda.time.Period period74 = period72.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period(readableInstant75, readableInstant76, periodType77);
        org.joda.time.Period period80 = period78.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period(readableInstant81, readableInstant82, periodType83);
        org.joda.time.DurationFieldType durationFieldType86 = period84.getFieldType((int) (byte) 0);
        int int87 = period80.indexOf(durationFieldType86);
        int int88 = period72.get(durationFieldType86);
        org.joda.time.Period period90 = period62.withField(durationFieldType86, (int) (short) 0);
        int int91 = period55.indexOf(durationFieldType86);
        int int92 = period46.get(durationFieldType86);
        int int93 = period34.get(durationFieldType86);
        org.joda.time.Period period95 = period31.withFieldAdded(durationFieldType86, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant96 = null;
        org.joda.time.Duration duration97 = period31.toDurationTo(readableInstant96);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(hours43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(durationFieldType86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 10 + "'", int92 == 10);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(period95);
        org.junit.Assert.assertNotNull(duration97);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 1);
        org.joda.time.Period period3 = period1.minusMonths((-1));
        int int4 = period1.getMillis();
        org.joda.time.PeriodType periodType5 = period1.getPeriodType();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Hours hours9 = period6.toStandardHours();
        org.joda.time.Period period10 = period6.normalizedStandard();
        int int11 = period10.getWeeks();
        org.joda.time.Period period13 = period10.minusMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType20);
        org.joda.time.Period period23 = period21.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period21.toDurationTo(readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationFrom(readableInstant38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.Period period51 = period47.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType52 = period47.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (short) -1, periodType52, chronology53);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration39, periodType52);
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant32, readableInstant33, periodType52);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((long) (-100), (long) (-100), periodType52, chronology57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((long) 0, (long) 100, periodType52, chronology59);
        org.joda.time.Period period61 = period27.withPeriodType(periodType52);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period((long) (byte) 10, (long) '4', periodType52, chronology62);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) 10, (long) (short) 0, periodType52, chronology64);
        org.joda.time.Period period66 = new org.joda.time.Period((java.lang.Object) period13, periodType52);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period61);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period6.plusMonths(0);
        org.joda.time.Period period12 = period10.plusMonths((int) '#');
        org.joda.time.Period period14 = period10.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType15 = period10.getPeriodType();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType15, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) 'a', periodType15, chronology18);
        org.joda.time.Period period20 = new org.joda.time.Period((long) (short) 10, periodType15);
        org.joda.time.Period period22 = period20.plusDays((int) (byte) 0);
        org.joda.time.Period period24 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period26 = org.joda.time.Period.millis(1);
        org.joda.time.Period period28 = period26.withWeeks((int) (short) 0);
        org.joda.time.Period period29 = period24.plus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationTo(readableInstant30);
        org.joda.time.Period period33 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period35 = period33.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, readableInstant37, periodType38);
        org.joda.time.Period period41 = period39.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant42, readableInstant43, periodType44);
        org.joda.time.DurationFieldType durationFieldType47 = period45.getFieldType((int) (byte) 0);
        int int48 = period41.indexOf(durationFieldType47);
        org.joda.time.Period period50 = period33.withFieldAdded(durationFieldType47, 1);
        org.joda.time.Period period52 = period50.plusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType53 = period52.getPeriodType();
        org.joda.time.Period period54 = new org.joda.time.Period((java.lang.Object) readableInstant30, periodType53);
        org.joda.time.Period period55 = period54.toPeriod();
        org.joda.time.format.PeriodFormatter periodFormatter56 = null;
        java.lang.String str57 = period54.toString(periodFormatter56);
        org.joda.time.Period period58 = period22.plus((org.joda.time.ReadablePeriod) period54);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PT0S" + "'", str57, "PT0S");
        org.junit.Assert.assertNotNull(period58);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period3 = org.joda.time.Period.millis(1);
        org.joda.time.Period period5 = period3.withWeeks((int) (short) 0);
        org.joda.time.Period period6 = period1.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationTo(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) 10, chronology15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.Period period22 = period21.normalizedStandard();
        org.joda.time.Period period24 = period21.plusMinutes((int) ' ');
        org.joda.time.Period period25 = period24.normalizedStandard();
        org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) period25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period36.plusMonths(0);
        org.joda.time.Period period42 = period40.plusMonths((int) '#');
        org.joda.time.Period period44 = period40.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType45 = period40.getPeriodType();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) (short) -1, periodType45, chronology46);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant27, (org.joda.time.ReadableDuration) duration32, periodType45);
        org.joda.time.Period period49 = period26.withPeriodType(periodType45);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((java.lang.Object) period16, periodType45, chronology50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) (short) 10, (long) 10, periodType45, chronology52);
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant11, periodType45);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant55);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = period56.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period49);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.joda.time.Period period8 = new org.joda.time.Period(8, (int) (short) 100, 10, 8, (int) 'a', (int) (short) 100, (int) ' ', 0);
        int int9 = period8.getHours();
        org.joda.time.Period period11 = period8.minusSeconds((int) 'a');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.Period period11 = period10.normalizedStandard();
        int int12 = period10.getMillis();
        org.joda.time.Period period14 = period10.withHours((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period10.toDurationFrom(readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 'a', periodType19, chronology20);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 'a', periodType23, chronology24);
        org.joda.time.Hours hours26 = period25.toStandardHours();
        org.joda.time.Period period27 = period21.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) period27);
        org.joda.time.PeriodType periodType29 = period28.getPeriodType();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, readableInstant17, periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period((int) (short) -1, 100, (int) ' ', (int) (byte) 1, 0, 52, (int) (short) -1, 8, periodType29);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.joda.time.Period period4 = org.joda.time.Period.millis((int) ' ');
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType16, chronology17);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 'a', periodType20, chronology21);
        org.joda.time.Hours hours23 = period22.toStandardHours();
        org.joda.time.Period period24 = period18.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period26 = period18.withYears(10);
        org.joda.time.Period period27 = period26.toPeriod();
        org.joda.time.Period period29 = period26.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant38, readableInstant39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        org.joda.time.Period period44 = period40.plusMonths(0);
        org.joda.time.Period period46 = period44.plusMonths((int) '#');
        org.joda.time.Period period48 = period44.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType49 = period44.getPeriodType();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) (short) -1, periodType49, chronology50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration36, periodType49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (byte) 0, periodType49, chronology53);
        org.joda.time.Period period55 = period29.normalizedStandard(periodType49);
        org.joda.time.Period period56 = new org.joda.time.Period((int) (short) 1, 10, (int) '4', (int) '#', 0, (int) (byte) -1, 0, 10, periodType49);
        org.joda.time.Period period57 = new org.joda.time.Period((-1L), (long) '4', periodType49);
        org.joda.time.Period period58 = period4.normalizedStandard(periodType49);
        org.joda.time.Period period59 = new org.joda.time.Period((long) (short) -1, (long) '#', periodType49);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period(0L, periodType49, chronology60);
        org.joda.time.Period period63 = period61.plusMonths((int) '4');
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period63);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.minusYears(100);
        int int5 = period4.getWeeks();
        org.joda.time.format.PeriodFormatter periodFormatter6 = null;
        java.lang.String str7 = period4.toString(periodFormatter6);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P-100YT0.001S" + "'", str7, "P-100YT0.001S");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        int int5 = period3.getMillis();
        org.joda.time.Days days6 = period3.toStandardDays();
        int int7 = period3.getSeconds();
        int int8 = period3.getMillis();
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType11);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        org.joda.time.Period period14 = period8.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.Period period20 = period18.plusMonths((int) '4');
        org.joda.time.Period period21 = period12.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.PeriodType periodType22 = period20.getPeriodType();
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) 'a', (long) 10, periodType22);
        org.joda.time.Period period25 = new org.joda.time.Period(1L, periodType22);
        org.joda.time.Period period26 = new org.joda.time.Period(100L, periodType22);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 97, chronology28);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.MutablePeriod mutablePeriod43 = period42.toMutablePeriod();
        org.joda.time.Period period44 = period38.plus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, readableInstant46, periodType47);
        org.joda.time.Period period50 = period48.plusMonths((int) '4');
        org.joda.time.Period period51 = period42.withFields((org.joda.time.ReadablePeriod) period50);
        org.joda.time.PeriodType periodType52 = period50.getPeriodType();
        org.joda.time.Period period53 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType52);
        org.joda.time.Period period54 = new org.joda.time.Period((long) 'a', (long) 10, periodType52);
        org.joda.time.Period period55 = new org.joda.time.Period((long) (short) 100, 100L, periodType52);
        org.joda.time.Period period56 = period29.withPeriodType(periodType52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period57 = new org.joda.time.Period((java.lang.Object) 100L, periodType52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period56);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(98);
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.Period period14 = period10.plusMonths(0);
        org.joda.time.Period period16 = period14.plusMonths((int) '#');
        org.joda.time.Period period18 = period14.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType19 = period14.getPeriodType();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (short) -1, periodType19, chronology20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration6, periodType19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 0, periodType19, chronology23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = period31.toDurationFrom(readableInstant34);
        org.joda.time.Period period37 = period31.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, readableInstant39, periodType40);
        org.joda.time.Period period43 = period41.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType46);
        org.joda.time.Period period49 = period47.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant50, readableInstant51, periodType52);
        org.joda.time.DurationFieldType durationFieldType55 = period53.getFieldType((int) (byte) 0);
        int int56 = period49.indexOf(durationFieldType55);
        int int57 = period41.get(durationFieldType55);
        org.joda.time.Period period59 = period31.withField(durationFieldType55, (int) (short) 0);
        boolean boolean60 = period24.isSupported(durationFieldType55);
        org.joda.time.Period period62 = period24.withMinutes(10);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((long) 100, (long) (-1), chronology65);
        org.joda.time.Period period68 = period66.plusMinutes((int) (short) 10);
        org.joda.time.Period period70 = period68.plusMinutes((-1));
        int int71 = period70.getWeeks();
        org.joda.time.Period period73 = period70.withMinutes((int) (byte) 10);
        org.joda.time.Period period75 = period70.minusMillis(97);
        org.joda.time.Period period77 = period75.withMillis((int) '4');
        org.joda.time.Period period78 = period62.plus((org.joda.time.ReadablePeriod) period75);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period78);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period10 = period1.minusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray11 = period10.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days12 = period10.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(durationFieldTypeArray11);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.minusDays(8);
        org.joda.time.Days days6 = period5.toStandardDays();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period5.toDurationTo(readableInstant7);
        java.lang.Object obj9 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.Period period24 = period20.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, periodType25, chronology26);
        org.joda.time.Period period28 = period12.minus((org.joda.time.ReadablePeriod) period27);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant39, readableInstant40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationFrom(readableInstant42);
        org.joda.time.Period period45 = period41.plusMonths(0);
        org.joda.time.Period period47 = period45.plusMonths((int) '#');
        org.joda.time.Period period49 = period45.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType50 = period45.getPeriodType();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) (short) -1, periodType50, chronology51);
        org.joda.time.Period period53 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType50);
        org.joda.time.Period period54 = new org.joda.time.Period((long) (byte) 10, periodType50);
        org.joda.time.Period period55 = period27.withPeriodType(periodType50);
        org.joda.time.Period period56 = new org.joda.time.Period((long) 11, periodType50);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(obj9, periodType50, chronology57);
        org.joda.time.Period period59 = period5.withFields((org.joda.time.ReadablePeriod) period58);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period59);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) -1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, (long) (-1), chronology4);
        org.joda.time.Period period7 = period5.withMonths((int) (short) 0);
        org.joda.time.Period period9 = period7.minusSeconds((int) (byte) 10);
        org.joda.time.Period period11 = period7.withWeeks((int) (byte) 100);
        org.joda.time.Period period13 = period7.minusHours((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period20.toDurationFrom(readableInstant23);
        org.joda.time.Period period26 = period20.minusMinutes((int) (byte) -1);
        org.joda.time.Duration duration27 = period26.toStandardDuration();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology30);
        java.lang.String str32 = period31.toString();
        org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) str32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period36.plusMonths(0);
        org.joda.time.Period period42 = period40.plusMonths((int) '#');
        org.joda.time.Period period44 = period40.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType45 = period40.getPeriodType();
        org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) str32, periodType45);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) 'a', periodType48, chronology49);
        org.joda.time.Period period52 = period50.withMinutes(0);
        org.joda.time.Period period54 = period52.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod55 = period52.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant56, readableInstant57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = period58.toDurationFrom(readableInstant59);
        org.joda.time.Period period62 = period58.plusMonths(0);
        org.joda.time.Period period64 = period62.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Duration duration66 = period62.toDurationFrom(readableInstant65);
        org.joda.time.Period period68 = period62.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant69, readableInstant70, periodType71);
        org.joda.time.Period period74 = period72.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period(readableInstant75, readableInstant76, periodType77);
        org.joda.time.Period period80 = period78.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period(readableInstant81, readableInstant82, periodType83);
        org.joda.time.DurationFieldType durationFieldType86 = period84.getFieldType((int) (byte) 0);
        int int87 = period80.indexOf(durationFieldType86);
        int int88 = period72.get(durationFieldType86);
        org.joda.time.Period period90 = period62.withField(durationFieldType86, (int) (short) 0);
        int int91 = mutablePeriod55.indexOf(durationFieldType86);
        int int92 = period46.get(durationFieldType86);
        int int93 = period26.indexOf(durationFieldType86);
        boolean boolean94 = period13.isSupported(durationFieldType86);
        org.joda.time.Period period96 = period1.withFieldAdded(durationFieldType86, (-1));
        org.joda.time.Period period98 = period96.minusMinutes(1);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PT0.011S" + "'", str32, "PT0.011S");
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(mutablePeriod55);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(durationFieldType86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(period96);
        org.junit.Assert.assertNotNull(period98);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.Period period9 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.Period period15 = period13.plusMonths((int) '4');
        org.joda.time.Period period16 = period7.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType17 = period15.getPeriodType();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.Period period35 = period31.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType36 = period31.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) -1, periodType36, chronology37);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant18, (org.joda.time.ReadableDuration) duration23, periodType36);
        org.joda.time.Period period40 = period15.normalizedStandard(periodType36);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 35, periodType36, chronology41);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period40);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.joda.time.Period period1 = org.joda.time.Period.days(98);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', (long) 0, chronology4);
        org.joda.time.Period period6 = new org.joda.time.Period();
        org.joda.time.Period period8 = period6.minusDays((int) (short) 0);
        org.joda.time.Period period10 = period8.plusSeconds((int) (short) -1);
        org.joda.time.Period period12 = period10.withMillis((int) (short) 0);
        org.joda.time.Period period14 = period10.minusSeconds((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.Period period20 = period18.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant21, readableInstant22, periodType23);
        org.joda.time.Period period26 = period24.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant27, readableInstant28, periodType29);
        org.joda.time.DurationFieldType durationFieldType32 = period30.getFieldType((int) (byte) 0);
        int int33 = period26.indexOf(durationFieldType32);
        int int34 = period18.get(durationFieldType32);
        int int35 = period10.indexOf(durationFieldType32);
        org.joda.time.Period period37 = period5.withField(durationFieldType32, 0);
        org.joda.time.Period period39 = period1.withField(durationFieldType32, (int) (short) -1);
        int int40 = period1.getSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 0, 1, (int) (byte) 0, (int) '4');
        org.joda.time.Period period6 = org.joda.time.Period.weeks(97);
        org.joda.time.Period period7 = period4.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period9 = period7.multipliedBy((-100));
        org.joda.time.Period period11 = period7.withDays((-31));
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType4);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant16, readableInstant17, periodType18);
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        org.joda.time.Period period21 = period15.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType24);
        org.joda.time.Period period27 = period25.plusMonths((int) '4');
        org.joda.time.Period period28 = period19.withFields((org.joda.time.ReadablePeriod) period27);
        org.joda.time.PeriodType periodType29 = period27.getPeriodType();
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period((long) 'a', (long) 10, periodType29);
        org.joda.time.Period period32 = new org.joda.time.Period((long) (short) 100, 100L, periodType29);
        org.joda.time.Period period33 = period5.withPeriodType(periodType29);
        org.joda.time.Duration duration34 = period33.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant38, readableInstant39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = period40.toDurationFrom(readableInstant41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant44, readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = period46.toDurationFrom(readableInstant47);
        org.joda.time.Period period50 = period46.plusMonths(0);
        org.joda.time.Period period52 = period50.plusMonths((int) '#');
        org.joda.time.Period period54 = period50.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType55 = period50.getPeriodType();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) (short) -1, periodType55, chronology56);
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant37, (org.joda.time.ReadableDuration) duration42, periodType55);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType55, chronology59);
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration34, periodType55);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant67, readableInstant68);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Duration duration71 = period69.toDurationFrom(readableInstant70);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant73, readableInstant74);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Duration duration77 = period75.toDurationFrom(readableInstant76);
        org.joda.time.Period period79 = period75.plusMonths(0);
        org.joda.time.Period period81 = period79.plusMonths((int) '#');
        org.joda.time.Period period83 = period79.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType84 = period79.getPeriodType();
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.Period period86 = new org.joda.time.Period((long) (short) -1, periodType84, chronology85);
        org.joda.time.Period period87 = new org.joda.time.Period(readableInstant66, (org.joda.time.ReadableDuration) duration71, periodType84);
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.Period period89 = new org.joda.time.Period((long) (short) 100, periodType84, chronology88);
        org.joda.time.Period period90 = new org.joda.time.Period((long) ' ', (long) (short) 1, periodType84);
        org.joda.time.Period period91 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration34, readableInstant62, periodType84);
        org.joda.time.Period period92 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration34);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(periodType84);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 0, 1L, chronology2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, (long) (-1), chronology6);
        org.joda.time.Period period9 = period7.plusMinutes((int) (short) 10);
        org.joda.time.Period period11 = period9.plusMinutes((-1));
        int int12 = period11.getWeeks();
        org.joda.time.Period period14 = period11.withMinutes((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        org.joda.time.Period period21 = period17.plusMonths(0);
        org.joda.time.Period period23 = period21.plusMonths((int) '#');
        org.joda.time.Period period25 = period21.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.Period period32 = period28.plusMonths(0);
        org.joda.time.Period period34 = period32.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period32.toDurationFrom(readableInstant35);
        org.joda.time.Period period38 = period32.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.Period period44 = period42.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, readableInstant46, periodType47);
        org.joda.time.Period period50 = period48.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant51, readableInstant52, periodType53);
        org.joda.time.DurationFieldType durationFieldType56 = period54.getFieldType((int) (byte) 0);
        int int57 = period50.indexOf(durationFieldType56);
        int int58 = period42.get(durationFieldType56);
        org.joda.time.Period period60 = period32.withField(durationFieldType56, (int) (short) 0);
        boolean boolean61 = period25.isSupported(durationFieldType56);
        org.joda.time.Period period63 = period14.withField(durationFieldType56, (int) ' ');
        int int64 = period3.indexOf(durationFieldType56);
        int int65 = period3.getSeconds();
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(durationFieldType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(0L, 0L, chronology2);
        org.joda.time.Period period5 = period3.withHours((int) 'a');
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology8);
        org.joda.time.Period period10 = period5.minus((org.joda.time.ReadablePeriod) period9);
        int int11 = period5.getWeeks();
        org.joda.time.MutablePeriod mutablePeriod12 = period5.toMutablePeriod();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod12);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(100L, (long) ' ', chronology2);
        org.joda.time.Period period5 = period3.plusHours(1);
        int int6 = period5.getSeconds();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(100L, (long) ' ', chronology15);
        org.joda.time.Period period18 = period16.plusHours(1);
        org.joda.time.Weeks weeks19 = period18.toStandardWeeks();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology22);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) str24);
        org.joda.time.Period period27 = period25.plusSeconds((int) 'a');
        org.joda.time.Period period29 = period25.plusYears((int) (byte) 0);
        org.joda.time.Period period31 = period25.withMonths(0);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 'a', periodType33, chronology34);
        org.joda.time.Period period37 = period35.withMinutes(0);
        org.joda.time.Period period39 = period37.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod40 = period37.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period47.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period47.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, readableInstant55, periodType56);
        org.joda.time.Period period59 = period57.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, readableInstant61, periodType62);
        org.joda.time.Period period65 = period63.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, readableInstant67, periodType68);
        org.joda.time.DurationFieldType durationFieldType71 = period69.getFieldType((int) (byte) 0);
        int int72 = period65.indexOf(durationFieldType71);
        int int73 = period57.get(durationFieldType71);
        org.joda.time.Period period75 = period47.withField(durationFieldType71, (int) (short) 0);
        int int76 = mutablePeriod40.indexOf(durationFieldType71);
        int int77 = period31.get(durationFieldType71);
        org.joda.time.Period period79 = period18.withFieldAdded(durationFieldType71, (int) (byte) 1);
        org.joda.time.Period period81 = period2.withField(durationFieldType71, 0);
        org.joda.time.Period period82 = period81.toPeriod();
        org.joda.time.Period period84 = period82.plusMonths(100);
        java.lang.String str85 = period82.toString();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0.011S" + "'", str24, "PT0.011S");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(durationFieldType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "PT0S" + "'", str85, "PT0S");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period6.plusMillis((int) '4');
        org.joda.time.Period period14 = period12.withHours((int) (byte) 10);
        org.joda.time.Period period16 = period12.plusSeconds(0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType19);
        org.joda.time.MutablePeriod mutablePeriod21 = period20.toMutablePeriod();
        int int22 = period20.getMillis();
        org.joda.time.Period period24 = period20.plusSeconds((int) ' ');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.Period period28 = period27.normalizedStandard();
        org.joda.time.Period period30 = period27.withWeeks(1);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) 'a', periodType32, chronology33);
        org.joda.time.Period period36 = period34.withMinutes(0);
        org.joda.time.Period period37 = period27.minus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, readableInstant39, periodType40);
        org.joda.time.DurationFieldType durationFieldType43 = period41.getFieldType((int) (byte) 0);
        int int44 = period36.indexOf(durationFieldType43);
        boolean boolean45 = period20.isSupported(durationFieldType43);
        int int46 = period16.get(durationFieldType43);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.Period period17 = period13.plusMonths(0);
        org.joda.time.Period period19 = period17.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period17.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period17.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.Period period29 = period27.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant30, readableInstant31, periodType32);
        org.joda.time.Period period35 = period33.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant36, readableInstant37, periodType38);
        org.joda.time.DurationFieldType durationFieldType41 = period39.getFieldType((int) (byte) 0);
        int int42 = period35.indexOf(durationFieldType41);
        int int43 = period27.get(durationFieldType41);
        org.joda.time.Period period45 = period17.withField(durationFieldType41, (int) (short) 0);
        boolean boolean46 = period10.isSupported(durationFieldType41);
        org.joda.time.Period period48 = period10.minusYears(32);
        int int49 = period10.getWeeks();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        org.joda.time.Period period17 = period11.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType20);
        org.joda.time.Period period23 = period21.plusMonths((int) '4');
        org.joda.time.Period period24 = period15.withFields((org.joda.time.ReadablePeriod) period23);
        org.joda.time.PeriodType periodType25 = period23.getPeriodType();
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType25);
        org.joda.time.Period period27 = new org.joda.time.Period((long) 'a', (long) 10, periodType25);
        org.joda.time.Period period28 = new org.joda.time.Period((long) (short) 100, 100L, periodType25);
        org.joda.time.Period period29 = new org.joda.time.Period((long) ' ', periodType25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.Period period24 = period20.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType25, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType25);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType25);
        org.joda.time.Period period30 = new org.joda.time.Period(8, (int) (short) 10, 52, 97, (int) '#', (int) (byte) 100, (int) (short) 10, 52, periodType25);
        int int31 = period30.getMillis();
        org.joda.time.Period period33 = period30.withHours(17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days34 = period30.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.Period period16 = period10.plusSeconds((int) '4');
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.Period period13 = period11.withMinutes(0);
        org.joda.time.Period period15 = period13.minusSeconds((int) (short) 100);
        org.joda.time.Period period17 = period15.withWeeks((int) (short) -1);
        org.joda.time.Period period18 = period7.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period20 = period18.minusDays(10);
        org.joda.time.Period period23 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period25 = period23.plusMillis((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period36.plusMonths(0);
        org.joda.time.Period period42 = period40.plusMonths((int) '#');
        org.joda.time.Period period44 = period40.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType45 = period40.getPeriodType();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) (short) -1, periodType45, chronology46);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant27, (org.joda.time.ReadableDuration) duration32, periodType45);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) (short) 100, periodType45, chronology49);
        org.joda.time.Period period51 = period25.withPeriodType(periodType45);
        org.joda.time.Period period53 = period51.plusMillis((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant66, readableInstant67);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant69, readableInstant70, periodType71);
        org.joda.time.MutablePeriod mutablePeriod73 = period72.toMutablePeriod();
        org.joda.time.Period period74 = period68.plus((org.joda.time.ReadablePeriod) period72);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period(readableInstant75, readableInstant76, periodType77);
        org.joda.time.Period period80 = period78.plusMonths((int) '4');
        org.joda.time.Period period81 = period72.withFields((org.joda.time.ReadablePeriod) period80);
        org.joda.time.PeriodType periodType82 = period80.getPeriodType();
        org.joda.time.Period period83 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType82);
        org.joda.time.Period period84 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType82);
        org.joda.time.Period period85 = new org.joda.time.Period(readableInstant54, readableInstant55, periodType82);
        org.joda.time.Period period86 = period51.withPeriodType(periodType82);
        org.joda.time.Period period87 = period18.withPeriodType(periodType82);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType89 = period87.getFieldType((-101));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(mutablePeriod73);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period87);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType3);
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.Period period7 = period4.minusMinutes((int) (byte) 100);
        org.joda.time.Minutes minutes8 = period4.toStandardMinutes();
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) period4);
        org.joda.time.Period period11 = period4.minusYears((int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period4.toDurationTo(readableInstant12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology18);
        java.lang.String str20 = period19.toString();
        org.joda.time.Period period21 = new org.joda.time.Period((java.lang.Object) str20);
        org.joda.time.Period period23 = period21.plusSeconds((int) 'a');
        org.joda.time.Period period25 = org.joda.time.Period.seconds((int) (short) 1);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) period25, chronology26);
        org.joda.time.Period period29 = period25.plusYears((int) (short) -1);
        org.joda.time.PeriodType periodType30 = period29.getPeriodType();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((java.lang.Object) period21, periodType30, chronology31);
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant15, periodType30);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT0.011S" + "'", str20, "PT0.011S");
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period6.plusMonths(0);
        org.joda.time.Period period12 = period10.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period10.toDurationFrom(readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.MutablePeriod mutablePeriod23 = period22.toMutablePeriod();
        org.joda.time.Period period24 = period18.plus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, readableInstant26, periodType27);
        org.joda.time.Period period30 = period28.plusMonths((int) '4');
        org.joda.time.Period period31 = period22.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.PeriodType periodType32 = period30.getPeriodType();
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, readableInstant15, periodType32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 100, (long) (-1), chronology36);
        org.joda.time.Period period39 = period37.plusMinutes((int) (short) 10);
        org.joda.time.Period period41 = period39.plusMinutes((-1));
        int int42 = period41.getWeeks();
        org.joda.time.Period period44 = period41.withMinutes((int) (byte) 10);
        org.joda.time.Period period45 = period44.negated();
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant46, readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = period48.toDurationFrom(readableInstant49);
        org.joda.time.Period period52 = period48.plusMonths(0);
        org.joda.time.Period period54 = period48.plusWeeks((int) ' ');
        org.joda.time.Period period56 = period48.plusMinutes((-1));
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant62, readableInstant63);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.Duration duration66 = period64.toDurationFrom(readableInstant65);
        org.joda.time.Period period68 = period64.plusMonths(0);
        org.joda.time.Period period70 = period68.plusMonths((int) '#');
        org.joda.time.Period period72 = period68.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType73 = period68.getPeriodType();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType73, chronology74);
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant58, readableInstant59, periodType73);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period((long) (-100), periodType73, chronology77);
        org.joda.time.Period period79 = period56.withPeriodType(periodType73);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((java.lang.Object) period44, periodType73, chronology80);
        org.joda.time.Period period82 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration14, periodType73);
        org.joda.time.Period period83 = new org.joda.time.Period((long) 100, periodType73);
        org.joda.time.Period period84 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType73);
        int int85 = period84.getSeconds();
        org.joda.time.Period period87 = period84.multipliedBy(52);
        org.joda.time.DurationFieldType[] durationFieldTypeArray88 = period87.getFieldTypes();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(durationFieldTypeArray88);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType14 = period10.getFieldType((int) (byte) 0);
        org.joda.time.Seconds seconds15 = period10.toStandardSeconds();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(seconds15);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 10, (long) 8, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) period3, chronology4);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType20);
        org.joda.time.MutablePeriod mutablePeriod22 = period21.toMutablePeriod();
        org.joda.time.Period period23 = period17.plus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.Period period29 = period27.plusMonths((int) '4');
        org.joda.time.Period period30 = period21.withFields((org.joda.time.ReadablePeriod) period29);
        org.joda.time.PeriodType periodType31 = period29.getPeriodType();
        org.joda.time.Period period32 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType31);
        org.joda.time.Period period33 = new org.joda.time.Period((long) 'a', (long) 10, periodType31);
        org.joda.time.Period period34 = new org.joda.time.Period((long) (short) 100, 100L, periodType31);
        org.joda.time.Period period35 = new org.joda.time.Period((long) ' ', periodType31);
        org.joda.time.Period period36 = new org.joda.time.Period(8, (int) (short) -1, 0, 35, 0, (int) (short) 0, 52, (int) (byte) 10, periodType31);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Days days9 = period8.toStandardDays();
        int int10 = period8.getSeconds();
        org.joda.time.Period period12 = period8.minusWeeks((int) (short) 10);
        org.joda.time.Period period14 = period8.withSeconds((-101));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.joda.time.Period period1 = org.joda.time.Period.hours(11);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 1);
        org.joda.time.Period period3 = period1.withDays(1);
        org.joda.time.Period period5 = period1.withSeconds(98);
        org.joda.time.Period period7 = period5.plusWeeks((int) (byte) 0);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = period7.withPeriodType(periodType8);
        org.joda.time.Period period11 = period9.withSeconds(11);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = period23.toMutablePeriod();
        org.joda.time.Period period25 = period19.plus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, readableInstant27, periodType28);
        org.joda.time.Period period31 = period29.plusMonths((int) '4');
        org.joda.time.Period period32 = period23.withFields((org.joda.time.ReadablePeriod) period31);
        org.joda.time.PeriodType periodType33 = period31.getPeriodType();
        org.joda.time.Period period34 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType33);
        org.joda.time.Period period35 = new org.joda.time.Period((long) (-100), (long) (short) 10, periodType33);
        org.joda.time.Period period36 = new org.joda.time.Period(0L, periodType33);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period42.toDurationFrom(readableInstant43);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant46, readableInstant47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = period48.toDurationFrom(readableInstant49);
        org.joda.time.Period period52 = period48.plusMonths(0);
        org.joda.time.Period period54 = period52.plusMonths((int) '#');
        org.joda.time.Period period56 = period52.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType57 = period52.getPeriodType();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((long) (short) -1, periodType57, chronology58);
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant39, (org.joda.time.ReadableDuration) duration44, periodType57);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType57, chronology61);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((long) 100, (long) (-1), chronology65);
        org.joda.time.Period period68 = period66.plusMinutes((int) (short) 10);
        org.joda.time.Period period70 = period68.plusMinutes((-1));
        int int71 = period70.getWeeks();
        org.joda.time.Period period73 = period70.withMinutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType75 = period73.getFieldType(0);
        org.joda.time.Period period77 = period62.withFieldAdded(durationFieldType75, (int) (short) 100);
        int int78 = period36.get(durationFieldType75);
        org.joda.time.Period period80 = period11.withField(durationFieldType75, (int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutablePeriod24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(durationFieldType75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(period80);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period4 = period2.plusWeeks((int) 'a');
        org.joda.time.Period period6 = period4.withMonths((-10));
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 100, (long) 10);
        org.joda.time.Seconds seconds3 = period2.toStandardSeconds();
        org.junit.Assert.assertNotNull(seconds3);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.joda.time.Period period8 = new org.joda.time.Period(10, (int) (byte) 100, 52, (int) (byte) 100, (int) (short) 10, (int) (byte) -1, (int) '4', (-100));
        org.joda.time.Period period10 = period8.minusSeconds((int) ' ');
        org.joda.time.Period period12 = period10.plusDays(1);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period2.plusWeeks((int) ' ');
        org.joda.time.Period period10 = period2.plusMinutes((-1));
        org.joda.time.Period period11 = period2.normalizedStandard();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.Period period17 = period15.plusMonths((int) '4');
        org.joda.time.Period period19 = period17.withYears(0);
        org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) period17);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.Period period27 = period23.plusMonths(0);
        org.joda.time.Period period29 = period27.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period27.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period27.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType36);
        org.joda.time.Period period39 = period37.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant40, readableInstant41, periodType42);
        org.joda.time.Period period45 = period43.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant46, readableInstant47, periodType48);
        org.joda.time.DurationFieldType durationFieldType51 = period49.getFieldType((int) (byte) 0);
        int int52 = period45.indexOf(durationFieldType51);
        int int53 = period37.get(durationFieldType51);
        org.joda.time.Period period55 = period27.withField(durationFieldType51, (int) (short) 0);
        int int56 = period17.indexOf(durationFieldType51);
        org.joda.time.Period period58 = period2.withFieldAdded(durationFieldType51, (int) '#');
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((long) 100, (long) (-1), chronology63);
        org.joda.time.Period period66 = period64.plusMinutes((int) (short) 10);
        org.joda.time.Period period68 = period66.plusMinutes((-1));
        int int69 = period68.getWeeks();
        org.joda.time.Period period71 = period68.withMinutes((int) (byte) 10);
        org.joda.time.PeriodType periodType72 = period71.getPeriodType();
        org.joda.time.Period period73 = new org.joda.time.Period((long) 52, (long) 1, periodType72);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((java.lang.Object) period58, periodType72, chronology74);
        java.lang.Class<?> wildcardClass76 = periodType72.getClass();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.Period period20 = period16.plusMonths(0);
        org.joda.time.Period period22 = period20.plusMonths((int) '#');
        org.joda.time.Period period24 = period20.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType25, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType25);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType25);
        org.joda.time.Period period30 = new org.joda.time.Period(8, (int) (short) 10, 52, 97, (int) '#', (int) (byte) 100, (int) (short) 10, 52, periodType25);
        org.joda.time.Period period32 = period30.minusMinutes((int) 'a');
        org.joda.time.Period period33 = period32.toPeriod();
        org.joda.time.Period period35 = period33.minusMonths(97);
        org.joda.time.Period period37 = period33.withMinutes(1);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        int int4 = period3.getYears();
        int int5 = period3.getMonths();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.Days days17 = period16.toStandardDays();
        int int18 = period16.getMonths();
        org.joda.time.Period period20 = period16.multipliedBy(100);
        org.joda.time.Period period22 = period20.plusDays(3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        int int11 = period10.getMinutes();
        int int12 = period10.getWeeks();
        org.joda.time.Days days13 = period10.toStandardDays();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) period10, chronology14);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(days13);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, (long) (-1), chronology4);
        org.joda.time.Period period7 = period5.plusMinutes((int) (short) 10);
        org.joda.time.Period period9 = period7.plusMinutes((-1));
        int int10 = period9.getWeeks();
        org.joda.time.Period period12 = period9.withMinutes((int) (byte) 10);
        org.joda.time.PeriodType periodType13 = period12.getPeriodType();
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType13);
        org.joda.time.Period period16 = period14.minusDays((int) '4');
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.lang.Object obj0 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 'a', periodType2, chronology3);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) 'a', periodType6, chronology7);
        org.joda.time.Hours hours9 = period8.toStandardHours();
        org.joda.time.Period period10 = period4.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period4.withYears(10);
        org.joda.time.Period period13 = period12.toPeriod();
        org.joda.time.Period period15 = period12.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.Period period30 = period26.plusMonths(0);
        org.joda.time.Period period32 = period30.plusMonths((int) '#');
        org.joda.time.Period period34 = period30.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType35 = period30.getPeriodType();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) (short) -1, periodType35, chronology36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration22, periodType35);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (byte) 0, periodType35, chronology39);
        org.joda.time.Period period41 = period15.normalizedStandard(periodType35);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(obj0, periodType35, chronology42);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period41);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.plusMonths((int) '4');
        org.joda.time.Period period7 = period5.withYears(0);
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) period5);
        org.joda.time.Period period10 = period5.minusMinutes(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType3);
        org.joda.time.Period period6 = period4.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period4.toDurationTo(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant9);
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration8);
        org.joda.time.Period period13 = period11.withDays((-1));
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType9);
        org.joda.time.MutablePeriod mutablePeriod11 = period10.toMutablePeriod();
        org.joda.time.Period period12 = period6.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.Period period18 = period16.plusMonths((int) '4');
        org.joda.time.Period period19 = period10.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 'a', periodType23, chronology24);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 'a', periodType27, chronology28);
        org.joda.time.Hours hours30 = period29.toStandardHours();
        org.joda.time.Period period31 = period25.withFields((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Period period33 = period25.withYears(10);
        org.joda.time.Period period34 = period33.toPeriod();
        org.joda.time.Period period36 = period33.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant39, readableInstant40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period41.toDurationFrom(readableInstant42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant45, readableInstant46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = period47.toDurationFrom(readableInstant48);
        org.joda.time.Period period51 = period47.plusMonths(0);
        org.joda.time.Period period53 = period51.plusMonths((int) '#');
        org.joda.time.Period period55 = period51.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType56 = period51.getPeriodType();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((long) (short) -1, periodType56, chronology57);
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant38, (org.joda.time.ReadableDuration) duration43, periodType56);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((long) (byte) 0, periodType56, chronology60);
        org.joda.time.Period period62 = period36.normalizedStandard(periodType56);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(0L, (long) 8, periodType56, chronology63);
        org.joda.time.Period period65 = new org.joda.time.Period((java.lang.Object) period10, periodType56);
        org.joda.time.Period period66 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType56);
        org.joda.time.Period period67 = period1.withPeriodType(periodType56);
        org.joda.time.DurationFieldType durationFieldType68 = null;
        int int69 = period67.indexOf(durationFieldType68);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType11);
        org.joda.time.Period period14 = period12.plusMonths((int) '4');
        org.joda.time.Period period15 = period6.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.PeriodType periodType16 = period14.getPeriodType();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.Period period30 = period26.plusMonths(0);
        org.joda.time.Period period32 = period30.plusMonths((int) '#');
        org.joda.time.Period period34 = period30.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType35 = period30.getPeriodType();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) (short) -1, periodType35, chronology36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant17, (org.joda.time.ReadableDuration) duration22, periodType35);
        org.joda.time.Period period39 = period14.normalizedStandard(periodType35);
        org.joda.time.Period period41 = period14.withYears(98);
        org.joda.time.Period period42 = new org.joda.time.Period((java.lang.Object) period41);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) '4', (-1L), periodType3, chronology4);
        org.joda.time.Period period7 = period5.minusSeconds((int) '#');
        org.joda.time.Period period9 = period5.withMonths((int) (byte) -1);
        org.joda.time.Period period11 = period5.minusSeconds((int) (short) 10);
        org.joda.time.Period period13 = period11.multipliedBy((int) (short) 10);
        org.joda.time.Period period15 = period11.withSeconds((int) (byte) 10);
        org.joda.time.Duration duration16 = period15.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period20.toDurationFrom(readableInstant21);
        org.joda.time.Period period24 = period20.plusMonths(0);
        org.joda.time.Period period26 = period24.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period24.toDurationFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant33, readableInstant34, periodType35);
        org.joda.time.MutablePeriod mutablePeriod37 = period36.toMutablePeriod();
        org.joda.time.Period period38 = period32.plus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.Period period44 = period42.plusMonths((int) '4');
        org.joda.time.Period period45 = period36.withFields((org.joda.time.ReadablePeriod) period44);
        org.joda.time.PeriodType periodType46 = period44.getPeriodType();
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration28, readableInstant29, periodType46);
        org.joda.time.Period period48 = new org.joda.time.Period((long) 32, periodType46);
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration16, periodType46);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(mutablePeriod37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(periodType46);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 0, 97, 98, 10, 100, 11, (int) (byte) 1, 1, periodType8);
        org.joda.time.Period period11 = period9.minusMonths(10);
        org.joda.time.Period period13 = period9.plusMonths(197);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period10, periodType13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = period14.normalizedStandard(periodType15);
        org.joda.time.Days days17 = period16.toStandardDays();
        int int18 = period16.getMonths();
        org.joda.time.Period period20 = period16.minusMillis(8);
        org.joda.time.Period period22 = period16.withYears(100);
        org.joda.time.Period period24 = period22.plusMonths((-31));
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        int int11 = period10.getMinutes();
        int int12 = period10.getWeeks();
        org.joda.time.Period period14 = period10.plusDays(8);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.Period period9 = period7.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.DurationFieldType durationFieldType15 = period13.getFieldType((int) (byte) 0);
        int int16 = period9.indexOf(durationFieldType15);
        org.joda.time.Period period18 = period1.withFieldAdded(durationFieldType15, 1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.Period period22 = period21.normalizedStandard();
        int int23 = period21.getMillis();
        org.joda.time.Period period24 = period18.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period18.toPeriod();
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', (long) '4', periodType28, chronology29);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Duration duration37 = period35.toDurationFrom(readableInstant36);
        org.joda.time.Period period39 = period35.plusMonths(0);
        org.joda.time.Period period41 = period39.plusMonths((int) '#');
        org.joda.time.Period period43 = period39.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType44 = period39.getPeriodType();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType44, chronology45);
        org.joda.time.Period period47 = period30.normalizedStandard(periodType44);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant48, readableInstant49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period50.toDurationFrom(readableInstant51);
        org.joda.time.Period period54 = period50.plusMonths(0);
        org.joda.time.Period period56 = period54.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = period54.toDurationFrom(readableInstant57);
        org.joda.time.Period period60 = period54.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant61, readableInstant62);
        org.joda.time.Period period64 = period63.normalizedStandard();
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType73);
        org.joda.time.Period period75 = period64.withFields((org.joda.time.ReadablePeriod) period74);
        org.joda.time.Period period77 = period75.minusMonths((int) (short) 100);
        org.joda.time.Period period79 = period77.minusHours((int) '4');
        org.joda.time.DurationFieldType durationFieldType81 = period79.getFieldType((int) (byte) 1);
        boolean boolean82 = period60.isSupported(durationFieldType81);
        org.joda.time.Period period84 = period47.withFieldAdded(durationFieldType81, (int) (byte) 0);
        org.joda.time.Period period85 = period18.minus((org.joda.time.ReadablePeriod) period84);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(durationFieldType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period85);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationFrom(readableInstant15);
        org.joda.time.Period period18 = period14.plusMonths(0);
        org.joda.time.Period period20 = period18.plusMonths((int) '#');
        org.joda.time.Period period22 = period18.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType23 = period18.getPeriodType();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) -1, periodType23, chronology24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration10, periodType23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) (byte) 0, periodType23, chronology27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType23);
        org.joda.time.Period period30 = new org.joda.time.Period((long) 1, (long) 59, periodType23);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.joda.time.Period period1 = org.joda.time.Period.hours(1);
        org.joda.time.format.PeriodFormatter periodFormatter2 = null;
        java.lang.String str3 = period1.toString(periodFormatter2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) '4', periodType6, chronology7);
        org.joda.time.Period period10 = period8.plusMillis(0);
        org.joda.time.Period period12 = org.joda.time.Period.hours((int) (byte) 1);
        org.joda.time.Period period14 = org.joda.time.Period.years(0);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology17);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) str19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.Period period27 = period23.plusMonths(0);
        org.joda.time.Period period29 = period27.plusMonths((int) '#');
        org.joda.time.Period period31 = period27.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType32 = period27.getPeriodType();
        org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) str19, periodType32);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 'a', periodType35, chronology36);
        org.joda.time.Period period39 = period37.withMinutes(0);
        org.joda.time.Period period41 = period39.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod42 = period39.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period45.toDurationFrom(readableInstant46);
        org.joda.time.Period period49 = period45.plusMonths(0);
        org.joda.time.Period period51 = period49.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period49.toDurationFrom(readableInstant52);
        org.joda.time.Period period55 = period49.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant56, readableInstant57, periodType58);
        org.joda.time.Period period61 = period59.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant62, readableInstant63, periodType64);
        org.joda.time.Period period67 = period65.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant68, readableInstant69, periodType70);
        org.joda.time.DurationFieldType durationFieldType73 = period71.getFieldType((int) (byte) 0);
        int int74 = period67.indexOf(durationFieldType73);
        int int75 = period59.get(durationFieldType73);
        org.joda.time.Period period77 = period49.withField(durationFieldType73, (int) (short) 0);
        int int78 = mutablePeriod42.indexOf(durationFieldType73);
        int int79 = period33.get(durationFieldType73);
        org.joda.time.Period period81 = period14.withField(durationFieldType73, 0);
        int int82 = period12.get(durationFieldType73);
        int int83 = period10.indexOf(durationFieldType73);
        org.joda.time.Period period85 = period1.withFieldAdded(durationFieldType73, (int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT1H" + "'", str3, "PT1H");
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0.011S" + "'", str19, "PT0.011S");
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(mutablePeriod42);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(durationFieldType73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(period85);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        org.joda.time.Period period12 = period10.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType14 = period10.getFieldType((int) (byte) 0);
        java.lang.String str15 = period10.toString();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period10.toDurationFrom(readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period21.toDurationFrom(readableInstant22);
        org.joda.time.Period period25 = period21.plusMonths(0);
        org.joda.time.Period period27 = period25.plusMonths((int) '#');
        org.joda.time.Period period29 = period25.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType30 = period25.getPeriodType();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration17, readableInstant18, periodType30);
        org.joda.time.Period period36 = new org.joda.time.Period(97, (int) (short) 0, 100, (int) (short) 100);
        org.joda.time.Period period38 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 'a', periodType40, chronology41);
        org.joda.time.Hours hours43 = period42.toStandardHours();
        org.joda.time.Period period45 = period42.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant46, readableInstant47, periodType48);
        org.joda.time.DurationFieldType durationFieldType51 = period49.getFieldType((int) (byte) 0);
        org.joda.time.Period period53 = period42.withField(durationFieldType51, 1);
        boolean boolean54 = period38.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant55, readableInstant56, periodType57);
        org.joda.time.Period period60 = period58.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, readableInstant62, periodType63);
        org.joda.time.DurationFieldType durationFieldType66 = period64.getFieldType((int) (byte) 0);
        int int67 = period60.indexOf(durationFieldType66);
        org.joda.time.Period period69 = period38.withFieldAdded(durationFieldType66, (int) (short) 0);
        int int70 = period36.get(durationFieldType66);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant71, readableInstant72);
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.Duration duration75 = period73.toDurationFrom(readableInstant74);
        org.joda.time.Period period77 = period73.plusMonths(0);
        org.joda.time.Period period79 = period77.plusMonths((int) '#');
        org.joda.time.Period period81 = period77.plusMinutes((int) (short) 100);
        org.joda.time.Period period83 = period81.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType85 = period81.getFieldType((int) (byte) 0);
        boolean boolean86 = period36.isSupported(durationFieldType85);
        org.joda.time.Period period88 = period31.withFieldAdded(durationFieldType85, (int) (short) -1);
        int int89 = period88.getWeeks();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT100M" + "'", str15, "PT100M");
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(hours43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(durationFieldType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Hours hours9 = period6.toStandardHours();
        org.joda.time.Period period10 = period6.normalizedStandard();
        org.joda.time.Period period12 = period10.withMinutes(100);
        org.joda.time.Period period14 = period10.withYears((int) (short) 0);
        org.joda.time.Period period16 = period10.minusMinutes((int) (byte) 10);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period7.plusWeeks((int) (short) 10);
        org.joda.time.Period period11 = period7.minusMillis((int) (byte) 1);
        org.joda.time.Period period12 = period11.normalizedStandard();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType20);
        org.joda.time.MutablePeriod mutablePeriod22 = period21.toMutablePeriod();
        org.joda.time.Period period23 = period17.plus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.Period period29 = period27.plusMonths((int) '4');
        org.joda.time.Period period30 = period21.withFields((org.joda.time.ReadablePeriod) period29);
        org.joda.time.PeriodType periodType31 = period29.getPeriodType();
        org.joda.time.Period period32 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant33, readableInstant34);
        org.joda.time.Period period36 = period35.normalizedStandard();
        org.joda.time.Period period38 = period35.plusMinutes((int) ' ');
        org.joda.time.Period period39 = period38.normalizedStandard();
        org.joda.time.Period period41 = period39.plusMinutes((-1));
        org.joda.time.Period period43 = period41.plusYears(8);
        org.joda.time.Period period44 = period32.withFields((org.joda.time.ReadablePeriod) period41);
        org.joda.time.Period period45 = period12.minus((org.joda.time.ReadablePeriod) period41);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period45);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period5.withWeeks(1);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 'a', periodType10, chronology11);
        org.joda.time.Period period14 = period12.withMinutes(0);
        org.joda.time.Period period15 = period5.minus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period17 = period14.minusMillis((int) ' ');
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 'a', periodType19, chronology20);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 'a', periodType23, chronology24);
        org.joda.time.Hours hours26 = period25.toStandardHours();
        org.joda.time.Period period27 = period21.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period29 = period21.withYears(10);
        org.joda.time.Period period30 = period29.toPeriod();
        org.joda.time.Period period32 = period29.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationFrom(readableInstant38);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant41, readableInstant42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = period43.toDurationFrom(readableInstant44);
        org.joda.time.Period period47 = period43.plusMonths(0);
        org.joda.time.Period period49 = period47.plusMonths((int) '#');
        org.joda.time.Period period51 = period47.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType52 = period47.getPeriodType();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((long) (short) -1, periodType52, chronology53);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration39, periodType52);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) (byte) 0, periodType52, chronology56);
        org.joda.time.Period period58 = period32.normalizedStandard(periodType52);
        org.joda.time.Period period59 = period14.normalizedStandard(periodType52);
        int int60 = period59.getMonths();
        org.joda.time.PeriodType periodType61 = period59.getPeriodType();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period((long) (short) 0, (long) (byte) 1, periodType61, chronology62);
        org.joda.time.Period period64 = new org.joda.time.Period((long) (-3), periodType61);
        org.joda.time.Period period66 = period64.multipliedBy((int) (short) 0);
        org.joda.time.Period period68 = period66.minusMillis((int) (byte) 100);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) 10);
        org.joda.time.Period period3 = period1.withMonths(11);
        org.joda.time.Period period5 = period3.withWeeks(98);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period3.indexOf(durationFieldType6);
        int int8 = period3.getMonths();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.Period period13 = period9.plusMonths(0);
        org.joda.time.Period period15 = period13.plusMonths((int) '#');
        org.joda.time.Period period17 = period13.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType18 = period13.getPeriodType();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) (short) -1, periodType18, chronology19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5, periodType18);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.Period period25 = period24.normalizedStandard();
        org.joda.time.Period period27 = period24.withWeeks(1);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 'a', periodType29, chronology30);
        org.joda.time.Period period33 = period31.withMinutes(0);
        org.joda.time.Period period34 = period24.minus((org.joda.time.ReadablePeriod) period33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationFrom(readableInstant38);
        org.joda.time.Period period41 = period37.plusMonths(0);
        org.joda.time.Period period43 = period37.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant44, readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = period46.toDurationFrom(readableInstant47);
        org.joda.time.Period period50 = period46.plusMonths(0);
        org.joda.time.Period period52 = period50.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Duration duration54 = period50.toDurationFrom(readableInstant53);
        org.joda.time.Period period56 = period50.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant57, readableInstant58, periodType59);
        org.joda.time.Period period62 = period60.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period(readableInstant63, readableInstant64, periodType65);
        org.joda.time.Period period68 = period66.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant69, readableInstant70, periodType71);
        org.joda.time.DurationFieldType durationFieldType74 = period72.getFieldType((int) (byte) 0);
        int int75 = period68.indexOf(durationFieldType74);
        int int76 = period60.get(durationFieldType74);
        org.joda.time.Period period78 = period50.withField(durationFieldType74, (int) (short) 0);
        int int79 = period43.indexOf(durationFieldType74);
        org.joda.time.Period period81 = period33.withField(durationFieldType74, (int) (short) 0);
        int int82 = period21.indexOf(durationFieldType74);
        org.joda.time.Period period83 = period21.toPeriod();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(durationFieldType74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(period83);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.minusDays(8);
        org.joda.time.DurationFieldType[] durationFieldTypeArray6 = period5.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period19.plusMonths(0);
        org.joda.time.Period period25 = period23.plusMonths((int) '#');
        org.joda.time.Period period27 = period23.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType28 = period23.getPeriodType();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) -1, periodType28, chronology29);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration15, periodType28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) (byte) 0, periodType28, chronology32);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType28);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((java.lang.Object) period5, periodType28, chronology35);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(durationFieldTypeArray6);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.Period period12 = period11.normalizedStandard();
        org.joda.time.Period period14 = period11.plusMinutes((int) ' ');
        org.joda.time.Duration duration15 = period11.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.Period period32 = period28.plusMonths(0);
        org.joda.time.Period period34 = period32.plusMonths((int) '#');
        org.joda.time.Period period36 = period32.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType37 = period32.getPeriodType();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (short) -1, periodType37, chronology38);
        org.joda.time.Period period40 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType37);
        org.joda.time.Period period41 = new org.joda.time.Period((long) (byte) 10, periodType37);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((java.lang.Object) period11, periodType37, chronology42);
        org.joda.time.Period period44 = new org.joda.time.Period((-1L), periodType37);
        org.joda.time.Period period45 = new org.joda.time.Period(0, 52, (-3), 98, (int) (short) -1, (int) (short) 10, (int) ' ', (-100), periodType37);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(0L, chronology2);
        org.joda.time.Period period5 = period3.withMonths((int) (short) 100);
        int int6 = period5.getHours();
        int int7 = period5.getMinutes();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period5.toDurationFrom(readableInstant8);
        org.joda.time.Period period11 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period13 = org.joda.time.Period.millis(1);
        org.joda.time.Period period15 = period13.withWeeks((int) (short) 0);
        org.joda.time.Period period16 = period11.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationTo(readableInstant17);
        org.joda.time.Period period20 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period22 = period20.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType25);
        org.joda.time.Period period28 = period26.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType31);
        org.joda.time.DurationFieldType durationFieldType34 = period32.getFieldType((int) (byte) 0);
        int int35 = period28.indexOf(durationFieldType34);
        org.joda.time.Period period37 = period20.withFieldAdded(durationFieldType34, 1);
        org.joda.time.Period period39 = period37.plusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType40 = period39.getPeriodType();
        org.joda.time.Period period41 = new org.joda.time.Period((java.lang.Object) readableInstant17, periodType40);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration9, periodType40);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType40);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Period period11 = period9.withMinutes(0);
        org.joda.time.Period period12 = period2.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period13 = period11.normalizedStandard();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.withMonths((int) (byte) 0);
        org.joda.time.Period period12 = period10.minusSeconds((-1));
        int int13 = period10.getMillis();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant14, readableInstant15);
        org.joda.time.Period period17 = period16.normalizedStandard();
        org.joda.time.Period period19 = period16.withWeeks(1);
        org.joda.time.Period period21 = period19.plusMonths(100);
        org.joda.time.Period period22 = period10.withFields((org.joda.time.ReadablePeriod) period21);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) 'a');
        org.joda.time.Period period3 = period1.withMinutes(52);
        int int4 = period1.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period6.plusMinutes((int) (short) 100);
        int int11 = period6.getMillis();
        org.joda.time.Period period12 = period6.negated();
        org.joda.time.Period period14 = period12.minusDays((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        org.joda.time.Period period21 = period17.plusMonths(0);
        org.joda.time.Period period23 = period21.plusMonths((int) '#');
        org.joda.time.Period period25 = period21.plusMinutes((int) (short) 100);
        org.joda.time.Period period27 = period25.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType29 = period25.getFieldType((int) (byte) 0);
        org.joda.time.Hours hours30 = period25.toStandardHours();
        org.joda.time.Period period31 = period14.plus((org.joda.time.ReadablePeriod) hours30);
        org.joda.time.format.PeriodFormatter periodFormatter32 = null;
        java.lang.String str33 = period14.toString(periodFormatter32);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(hours30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PT0S" + "'", str33, "PT0S");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.withWeeks(1);
        org.joda.time.Period period7 = period2.withMonths(10);
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        int[] intArray9 = mutablePeriod8.getValues();
        org.joda.time.Chronology chronology10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) intArray9, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: [I");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 10, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType8);
        org.joda.time.Period period11 = period9.withYears((int) ' ');
        org.joda.time.Period period13 = period11.withWeeks((int) ' ');
        int int14 = period13.size();
        org.joda.time.Period period16 = period13.withWeeks((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period20 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period22 = org.joda.time.Period.millis(1);
        org.joda.time.Period period24 = period22.withWeeks((int) (short) 0);
        org.joda.time.Period period25 = period20.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationTo(readableInstant26);
        org.joda.time.Period period29 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period31 = period29.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, readableInstant33, periodType34);
        org.joda.time.Period period37 = period35.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, readableInstant39, periodType40);
        org.joda.time.DurationFieldType durationFieldType43 = period41.getFieldType((int) (byte) 0);
        int int44 = period37.indexOf(durationFieldType43);
        org.joda.time.Period period46 = period29.withFieldAdded(durationFieldType43, 1);
        org.joda.time.Period period48 = period46.plusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType49 = period48.getPeriodType();
        org.joda.time.Period period50 = new org.joda.time.Period((java.lang.Object) readableInstant26, periodType49);
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType49);
        org.joda.time.Period period52 = period13.normalizedStandard(periodType49);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period52);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(100L, (long) ' ', chronology4);
        org.joda.time.Period period7 = period5.plusHours(1);
        org.joda.time.Weeks weeks8 = period7.toStandardWeeks();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology11);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) str13);
        org.joda.time.Period period16 = period14.plusSeconds((int) 'a');
        org.joda.time.Period period18 = period14.plusYears((int) (byte) 0);
        org.joda.time.Period period20 = period14.withMonths(0);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) 'a', periodType22, chronology23);
        org.joda.time.Period period26 = period24.withMinutes(0);
        org.joda.time.Period period28 = period26.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod29 = period26.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.Period period36 = period32.plusMonths(0);
        org.joda.time.Period period38 = period36.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period36.toDurationFrom(readableInstant39);
        org.joda.time.Period period42 = period36.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant43, readableInstant44, periodType45);
        org.joda.time.Period period48 = period46.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant49, readableInstant50, periodType51);
        org.joda.time.Period period54 = period52.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant55, readableInstant56, periodType57);
        org.joda.time.DurationFieldType durationFieldType60 = period58.getFieldType((int) (byte) 0);
        int int61 = period54.indexOf(durationFieldType60);
        int int62 = period46.get(durationFieldType60);
        org.joda.time.Period period64 = period36.withField(durationFieldType60, (int) (short) 0);
        int int65 = mutablePeriod29.indexOf(durationFieldType60);
        int int66 = period20.get(durationFieldType60);
        org.joda.time.Period period68 = period7.withFieldAdded(durationFieldType60, (int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Duration duration70 = period68.toDurationTo(readableInstant69);
        org.joda.time.Period period71 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration70);
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration70);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT0.011S" + "'", str13, "PT0.011S");
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(durationFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(duration70);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Duration duration5 = period3.toStandardDuration();
        org.joda.time.Period period7 = period3.withDays((int) (short) 0);
        org.joda.time.Period period9 = period3.plusYears((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = period9.getClass();
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.Period period7 = period5.minusMonths(35);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.Period period14 = period10.plusMonths(0);
        org.joda.time.Period period16 = period14.plusMonths((int) '#');
        org.joda.time.Period period18 = period14.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType19 = period14.getPeriodType();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType19, chronology20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType19);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType19);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) ' ', 0L, periodType19, chronology24);
        org.joda.time.Period period27 = period25.plusMinutes(0);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period27);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.Period period9 = period7.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType12);
        org.joda.time.DurationFieldType durationFieldType15 = period13.getFieldType((int) (byte) 0);
        int int16 = period9.indexOf(durationFieldType15);
        org.joda.time.Period period18 = period1.withFieldAdded(durationFieldType15, 1);
        org.joda.time.Period period20 = period18.plusSeconds((int) (byte) 1);
        int int21 = period18.size();
        org.joda.time.Period period23 = period18.minusSeconds((-3));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.plusMonths(0);
        org.joda.time.Period period9 = period7.plusMonths((int) '#');
        org.joda.time.Period period11 = period7.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType12 = period7.getPeriodType();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) "PT0.090S", periodType12, chronology13);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period3 = org.joda.time.Period.millis(1);
        org.joda.time.Period period5 = period3.withWeeks((int) (short) 0);
        org.joda.time.Period period6 = period1.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationTo(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) 10, chronology15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period16.toDurationFrom(readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant19, readableInstant20);
        org.joda.time.Period period22 = period21.normalizedStandard();
        org.joda.time.Period period24 = period21.plusMinutes((int) ' ');
        org.joda.time.Period period25 = period24.normalizedStandard();
        org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) period25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period30.toDurationFrom(readableInstant31);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period36.plusMonths(0);
        org.joda.time.Period period42 = period40.plusMonths((int) '#');
        org.joda.time.Period period44 = period40.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType45 = period40.getPeriodType();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) (short) -1, periodType45, chronology46);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant27, (org.joda.time.ReadableDuration) duration32, periodType45);
        org.joda.time.Period period49 = period26.withPeriodType(periodType45);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((java.lang.Object) period16, periodType45, chronology50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) (short) 10, (long) 10, periodType45, chronology52);
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant11, periodType45);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration8, readableInstant55);
        org.joda.time.Period period58 = period56.withWeeks((int) '4');
        org.joda.time.Period period60 = org.joda.time.Period.months(8);
        org.joda.time.Period period62 = period60.plusYears((-1));
        org.joda.time.Period period64 = period60.plusMinutes(97);
        org.joda.time.Period period65 = period56.minus((org.joda.time.ReadablePeriod) period64);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period((java.lang.Object) period64, chronology66);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period65);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.Period period8 = period4.plusMonths(0);
        int int9 = period4.getWeeks();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = period4.normalizedStandard(periodType10);
        org.joda.time.Period period12 = period1.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology15);
        java.lang.String str17 = period16.toString();
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) str17);
        org.joda.time.Period period20 = period18.plusSeconds((int) 'a');
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.Period period36 = period32.plusMonths(0);
        org.joda.time.Period period38 = period36.plusMonths((int) '#');
        org.joda.time.Period period40 = period36.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType41 = period36.getPeriodType();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (short) -1, periodType41, chronology42);
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration28, periodType41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType41, chronology45);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) 100, (long) (-1), chronology49);
        org.joda.time.Period period52 = period50.plusMinutes((int) (short) 10);
        org.joda.time.Period period54 = period52.plusMinutes((-1));
        int int55 = period54.getWeeks();
        org.joda.time.Period period57 = period54.withMinutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType59 = period57.getFieldType(0);
        org.joda.time.Period period61 = period46.withFieldAdded(durationFieldType59, (int) (short) 100);
        org.joda.time.Period period63 = period20.withFieldAdded(durationFieldType59, 52);
        org.joda.time.Period period64 = period11.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.format.PeriodFormatter periodFormatter65 = null;
        java.lang.String str66 = period11.toString(periodFormatter65);
        org.joda.time.Period period68 = period11.withYears(52);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period((long) 100, (long) (-1), chronology71);
        org.joda.time.Period period74 = period72.plusMinutes((int) (short) 10);
        org.joda.time.Period period76 = period74.plusMinutes((-1));
        int int77 = period76.getWeeks();
        org.joda.time.Period period79 = period76.withMinutes((int) (byte) 10);
        org.joda.time.PeriodType periodType80 = period79.getPeriodType();
        org.joda.time.Period period81 = period68.withPeriodType(periodType80);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0.011S" + "'", str17, "PT0.011S");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "PT0S" + "'", str66, "PT0S");
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertNotNull(period81);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Period period16 = period12.plusMonths(0);
        org.joda.time.Period period18 = period16.plusMonths((int) '#');
        org.joda.time.Period period20 = period16.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType21 = period16.getPeriodType();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, periodType21, chronology22);
        org.joda.time.Period period24 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType21);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (byte) 10, periodType21);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) period25, periodType26);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 'a', periodType29, chronology30);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 'a', periodType33, chronology34);
        org.joda.time.Hours hours36 = period35.toStandardHours();
        org.joda.time.Period period37 = period31.withFields((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Period period39 = period35.minusSeconds((int) ' ');
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant42, readableInstant43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, readableInstant46, periodType47);
        org.joda.time.MutablePeriod mutablePeriod49 = period48.toMutablePeriod();
        org.joda.time.Period period50 = period44.plus((org.joda.time.ReadablePeriod) period48);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant51, readableInstant52, periodType53);
        org.joda.time.Period period56 = period54.plusMonths((int) '4');
        org.joda.time.Period period57 = period48.withFields((org.joda.time.ReadablePeriod) period56);
        org.joda.time.PeriodType periodType58 = period56.getPeriodType();
        org.joda.time.Period period59 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType58);
        org.joda.time.Period period60 = period39.withPeriodType(periodType58);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = period60.toDurationTo(readableInstant61);
        boolean boolean63 = period25.equals((java.lang.Object) readableInstant61);
        org.joda.time.Hours hours64 = period25.toStandardHours();
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(hours36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(mutablePeriod49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(hours64);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(8);
        org.joda.time.Period period3 = period1.multipliedBy(100);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period6.plusMonths(0);
        org.joda.time.Period period12 = period10.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period10.toDurationFrom(readableInstant13);
        org.joda.time.Period period16 = period10.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType19);
        org.joda.time.Period period22 = period20.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType25);
        org.joda.time.Period period28 = period26.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType31);
        org.joda.time.DurationFieldType durationFieldType34 = period32.getFieldType((int) (byte) 0);
        int int35 = period28.indexOf(durationFieldType34);
        int int36 = period20.get(durationFieldType34);
        org.joda.time.Period period38 = period10.withField(durationFieldType34, (int) (short) 0);
        boolean boolean39 = period3.isSupported(durationFieldType34);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 8, (long) (byte) 1, chronology2);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.withWeeks((int) (short) -1);
        org.joda.time.Period period11 = period9.minusSeconds((int) (byte) 1);
        org.joda.time.Period period13 = period9.minusMonths(11);
        org.joda.time.Period period15 = period13.minusMonths((-100));
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant8, readableInstant9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.Period period14 = period10.plusMonths(0);
        org.joda.time.Period period16 = period14.plusMonths((int) '#');
        org.joda.time.Period period18 = period14.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType19 = period14.getPeriodType();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (short) -1, periodType19, chronology20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration6, periodType19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 0, periodType19, chronology23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.Period period31 = period27.plusMonths(0);
        org.joda.time.Period period33 = period31.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = period31.toDurationFrom(readableInstant34);
        org.joda.time.Period period37 = period31.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, readableInstant39, periodType40);
        org.joda.time.Period period43 = period41.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType46);
        org.joda.time.Period period49 = period47.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant50, readableInstant51, periodType52);
        org.joda.time.DurationFieldType durationFieldType55 = period53.getFieldType((int) (byte) 0);
        int int56 = period49.indexOf(durationFieldType55);
        int int57 = period41.get(durationFieldType55);
        org.joda.time.Period period59 = period31.withField(durationFieldType55, (int) (short) 0);
        boolean boolean60 = period24.isSupported(durationFieldType55);
        org.joda.time.Period period62 = period24.withMinutes(10);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant66, readableInstant67);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Duration duration70 = period68.toDurationFrom(readableInstant69);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period(readableInstant72, readableInstant73);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.Duration duration76 = period74.toDurationFrom(readableInstant75);
        org.joda.time.Period period78 = period74.plusMonths(0);
        org.joda.time.Period period80 = period78.plusMonths((int) '#');
        org.joda.time.Period period82 = period78.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType83 = period78.getPeriodType();
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.Period period85 = new org.joda.time.Period((long) (short) -1, periodType83, chronology84);
        org.joda.time.Period period86 = new org.joda.time.Period(readableInstant65, (org.joda.time.ReadableDuration) duration70, periodType83);
        org.joda.time.Period period87 = new org.joda.time.Period(readableInstant63, readableInstant64, periodType83);
        org.joda.time.Period period88 = period24.normalizedStandard(periodType83);
        org.joda.time.Hours hours89 = period24.toStandardHours();
        java.lang.String str90 = period24.toString();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(periodType83);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(hours89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "PT0S" + "'", str90, "PT0S");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.Period period23 = period19.plusMonths(0);
        org.joda.time.Period period25 = period23.plusMonths((int) '#');
        org.joda.time.Period period27 = period23.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType28 = period23.getPeriodType();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) -1, periodType28, chronology29);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration15, periodType28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType28, chronology32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 100, (long) (-1), chronology36);
        org.joda.time.Period period39 = period37.plusMinutes((int) (short) 10);
        org.joda.time.Period period41 = period39.plusMinutes((-1));
        int int42 = period41.getWeeks();
        org.joda.time.Period period44 = period41.withMinutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType46 = period44.getFieldType(0);
        org.joda.time.Period period48 = period33.withFieldAdded(durationFieldType46, (int) (short) 100);
        org.joda.time.Period period50 = period7.withFieldAdded(durationFieldType46, 52);
        org.joda.time.Period period52 = period50.plusWeeks(197);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = org.joda.time.Period.hours((int) (byte) 1);
        org.joda.time.Period period4 = period2.withDays(1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period2.toDurationFrom(readableInstant5);
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration6);
        org.joda.time.Period period9 = period7.minusDays(0);
        org.joda.time.Period period11 = period7.minusHours(100);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(11);
        org.joda.time.Period period3 = period1.withMillis(52);
        org.joda.time.Weeks weeks4 = period3.toStandardWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(weeks4);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = period11.toDurationFrom(readableInstant12);
        org.joda.time.Period period15 = period11.plusMonths(0);
        org.joda.time.Period period17 = period15.plusMonths((int) '#');
        org.joda.time.Period period19 = period15.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType20 = period15.getPeriodType();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) (short) -1, periodType20, chronology21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration7, periodType20);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.MutablePeriod mutablePeriod43 = period42.toMutablePeriod();
        org.joda.time.Period period44 = period38.plus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant45, readableInstant46, periodType47);
        org.joda.time.Period period50 = period48.plusMonths((int) '4');
        org.joda.time.Period period51 = period42.withFields((org.joda.time.ReadablePeriod) period50);
        org.joda.time.PeriodType periodType52 = period50.getPeriodType();
        org.joda.time.Period period53 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType52);
        org.joda.time.Period period54 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType52);
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType52);
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration7, periodType52);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((long) (short) -1, periodType52, chronology57);
        org.joda.time.Period period60 = period58.multipliedBy(52);
        org.joda.time.Days days61 = period60.toStandardDays();
        org.joda.time.Period period63 = period60.plusMillis((-101));
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(days61);
        org.junit.Assert.assertNotNull(period63);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) ' ');
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, (long) (-1), chronology14);
        org.joda.time.Period period17 = period15.plusMinutes((int) (short) 10);
        org.joda.time.Period period19 = period17.plusMinutes((-1));
        int int20 = period19.getWeeks();
        org.joda.time.Period period22 = period19.withMinutes((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period25.plusMonths(0);
        org.joda.time.Period period31 = period29.plusMonths((int) '#');
        org.joda.time.Period period33 = period29.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant34, readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.Period period40 = period36.plusMonths(0);
        org.joda.time.Period period42 = period40.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period40.toDurationFrom(readableInstant43);
        org.joda.time.Period period46 = period40.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.Period period52 = period50.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, readableInstant54, periodType55);
        org.joda.time.Period period58 = period56.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant59, readableInstant60, periodType61);
        org.joda.time.DurationFieldType durationFieldType64 = period62.getFieldType((int) (byte) 0);
        int int65 = period58.indexOf(durationFieldType64);
        int int66 = period50.get(durationFieldType64);
        org.joda.time.Period period68 = period40.withField(durationFieldType64, (int) (short) 0);
        boolean boolean69 = period33.isSupported(durationFieldType64);
        org.joda.time.Period period71 = period22.withField(durationFieldType64, (int) ' ');
        org.joda.time.Period period73 = period11.withField(durationFieldType64, 100);
        org.joda.time.Period period75 = period73.plusWeeks((int) (byte) -1);
        org.joda.time.Period period77 = period73.plusDays((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration78 = period77.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.joda.time.Period period8 = new org.joda.time.Period((-101), (int) (short) 100, (int) (byte) -1, 98, 0, (int) (byte) 1, 0, 0);
        org.joda.time.Period period10 = period8.minusSeconds(59);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.joda.time.Period period4 = new org.joda.time.Period(10, 59, 52, (-1));
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period6.toDurationFrom(readableInstant7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Period period16 = period12.plusMonths(0);
        org.joda.time.Period period18 = period16.plusMonths((int) '#');
        org.joda.time.Period period20 = period16.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType21 = period16.getPeriodType();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, periodType21, chronology22);
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration8, periodType21);
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType21);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(100L, periodType21, chronology26);
        org.joda.time.Period period29 = period27.plusMillis(8);
        org.joda.time.format.PeriodFormatter periodFormatter30 = null;
        java.lang.String str31 = period29.toString(periodFormatter30);
        org.joda.time.PeriodType periodType32 = period29.getPeriodType();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT0.108S" + "'", str31, "PT0.108S");
        org.junit.Assert.assertNotNull(periodType32);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT-10M");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType4);
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.Period period8 = period5.minusMinutes((int) (byte) 100);
        org.joda.time.Seconds seconds9 = period8.toStandardSeconds();
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) period8);
        org.joda.time.Period period12 = period10.withMillis((int) (byte) 1);
        org.joda.time.Period period14 = period12.plusSeconds((int) (byte) 1);
        org.joda.time.Period period16 = period12.withDays((int) (short) -1);
        org.joda.time.Period period17 = period16.toPeriod();
        org.joda.time.Period period18 = period1.minus((org.joda.time.ReadablePeriod) period17);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period2.plusWeeks((int) ' ');
        org.joda.time.Period period10 = period2.plusMinutes((-1));
        org.joda.time.Period period12 = period10.plusSeconds((-100));
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology15);
        java.lang.String str17 = period16.toString();
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) str17);
        org.joda.time.Period period19 = period18.normalizedStandard();
        org.joda.time.Period period21 = period19.withHours((-100));
        org.joda.time.Period period22 = period12.minus((org.joda.time.ReadablePeriod) period21);
        int int23 = period22.getMonths();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0.011S" + "'", str17, "PT0.011S");
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray8 = period7.getFieldTypes();
        org.joda.time.Period period10 = period7.withSeconds((int) (short) 10);
        org.joda.time.Period period12 = period7.minusMillis((int) '4');
        org.joda.time.Period period14 = period12.plusMinutes((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldTypeArray8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (short) 10, chronology11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.Period period18 = period17.normalizedStandard();
        org.joda.time.Period period20 = period17.plusMinutes((int) ' ');
        org.joda.time.Period period21 = period20.normalizedStandard();
        org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) period21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.Period period36 = period32.plusMonths(0);
        org.joda.time.Period period38 = period36.plusMonths((int) '#');
        org.joda.time.Period period40 = period36.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType41 = period36.getPeriodType();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (short) -1, periodType41, chronology42);
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant23, (org.joda.time.ReadableDuration) duration28, periodType41);
        org.joda.time.Period period45 = period22.withPeriodType(periodType41);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((java.lang.Object) period12, periodType41, chronology46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) (short) 10, (long) 10, periodType41, chronology48);
        org.joda.time.Period period50 = new org.joda.time.Period(0, 0, (int) (byte) 1, 100, (int) (short) 10, (int) ' ', (int) (short) 100, (int) (byte) 1, periodType41);
        int int51 = period50.size();
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 8 + "'", int51 == 8);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.Period period9 = period7.minusHours((int) (short) 10);
        org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) period9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period9.toDurationFrom(readableInstant11);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.Period period7 = period5.plusDays((int) (short) 100);
        org.joda.time.Days days8 = period7.toStandardDays();
        int int9 = period7.getHours();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-10));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period6.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period6.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType15);
        org.joda.time.Period period18 = period16.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.Period period24 = period22.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant25, readableInstant26, periodType27);
        org.joda.time.DurationFieldType durationFieldType30 = period28.getFieldType((int) (byte) 0);
        int int31 = period24.indexOf(durationFieldType30);
        int int32 = period16.get(durationFieldType30);
        org.joda.time.Period period34 = period6.withField(durationFieldType30, (int) (short) 0);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(100L, (long) ' ', chronology37);
        org.joda.time.Period period40 = period38.plusHours(1);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant43, readableInstant44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period45.toDurationFrom(readableInstant46);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant49, readableInstant50);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period51.toDurationFrom(readableInstant52);
        org.joda.time.Period period55 = period51.plusMonths(0);
        org.joda.time.Period period57 = period55.plusMonths((int) '#');
        org.joda.time.Period period59 = period55.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType60 = period55.getPeriodType();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((long) (short) -1, periodType60, chronology61);
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant42, (org.joda.time.ReadableDuration) duration47, periodType60);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) (byte) 0, periodType60, chronology64);
        org.joda.time.Period period66 = period40.withPeriodType(periodType60);
        org.joda.time.Period period67 = period6.withPeriodType(periodType60);
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant70, readableInstant71);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Duration duration74 = period72.toDurationFrom(readableInstant73);
        org.joda.time.Period period76 = period72.plusMonths(0);
        org.joda.time.Period period78 = period76.plusMonths((int) '#');
        org.joda.time.Period period80 = period76.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType81 = period76.getPeriodType();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.Period period83 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType81, chronology82);
        org.joda.time.Seconds seconds84 = period83.toStandardSeconds();
        org.joda.time.Period period85 = period67.minus((org.joda.time.ReadablePeriod) seconds84);
        org.joda.time.Period period87 = period67.withYears((int) (byte) 100);
        int int88 = period67.getHours();
        int int89 = period67.getMinutes();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(duration74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(periodType81);
        org.junit.Assert.assertNotNull(seconds84);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }
}

