import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType7);
        org.joda.time.Period period10 = period8.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period8.toDurationTo(readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, readableInstant13);
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
        org.joda.time.Period period48 = period14.withPeriodType(periodType39);
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType39);
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant1, readableInstant2, periodType39);
        org.joda.time.Period period51 = new org.joda.time.Period(0L, periodType39);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(period48);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 0, (-1), (int) (short) 100, (int) (short) 10, (-100), (-1), 100, 97);
        int int9 = period8.getSeconds();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.MutablePeriod mutablePeriod7 = period6.toMutablePeriod();
        org.joda.time.Period period8 = period2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period10 = period6.minusHours((-101));
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        org.joda.time.Period period42 = period9.minusMillis((int) (byte) 1);
        org.joda.time.Period period44 = period42.plusHours((int) ' ');
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
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.joda.time.Period period4 = new org.joda.time.Period(11, (-3), 1, 35);
        org.joda.time.Seconds seconds5 = period4.toStandardSeconds();
        org.junit.Assert.assertNotNull(seconds5);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period3 = period1.withSeconds(100);
        org.joda.time.Period period4 = period3.normalizedStandard();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period3.toDurationFrom(readableInstant5);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period25.plusMonths(0);
        org.joda.time.Period period31 = period29.plusMonths((int) '#');
        org.joda.time.Period period33 = period29.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType34 = period29.getPeriodType();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (short) -1, periodType34, chronology35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration21, periodType34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (byte) 0, periodType34, chronology38);
        org.joda.time.Period period40 = period14.normalizedStandard(periodType34);
        int int41 = period40.getDays();
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) 'a', periodType43, chronology44);
        org.joda.time.Period period47 = period45.withMinutes(0);
        int int48 = period47.getWeeks();
        int int49 = period47.getSeconds();
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant50, readableInstant51, periodType52);
        org.joda.time.Period period55 = period53.minusMillis((int) '4');
        int int56 = period55.getSeconds();
        org.joda.time.Period period58 = period55.withHours(100);
        int int59 = period55.getDays();
        org.joda.time.Period period60 = period47.plus((org.joda.time.ReadablePeriod) period55);
        org.joda.time.Period period63 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period65 = period63.minusYears(100);
        org.joda.time.Period period66 = period65.negated();
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
        org.joda.time.Period period81 = period65.withField(durationFieldType78, 10);
        int int82 = period60.indexOf(durationFieldType78);
        org.joda.time.Period period84 = period40.withField(durationFieldType78, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours85 = period40.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(period84);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        org.joda.time.Period period10 = period4.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType13);
        org.joda.time.Period period16 = period14.plusMonths((int) '4');
        org.joda.time.Period period17 = period8.withFields((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType18 = period16.getPeriodType();
        org.joda.time.Period period19 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.Period period23 = period22.normalizedStandard();
        org.joda.time.Period period25 = period22.plusMinutes((int) ' ');
        org.joda.time.Period period26 = period25.normalizedStandard();
        org.joda.time.Period period28 = period26.plusMinutes((-1));
        org.joda.time.Period period30 = period28.plusYears(8);
        org.joda.time.Period period31 = period19.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period28.toDurationTo(readableInstant32);
        org.joda.time.Period period35 = org.joda.time.Period.millis(1);
        org.joda.time.Period period37 = period35.withWeeks((int) (short) 0);
        org.joda.time.Period period39 = period35.plusHours((int) (short) 100);
        org.joda.time.Period period41 = period39.withWeeks(0);
        int int42 = period41.getMonths();
        boolean boolean43 = period28.equals((java.lang.Object) period41);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Days days6 = period3.toStandardDays();
        org.joda.time.Period period8 = period3.plusSeconds((int) (short) 0);
        org.joda.time.Period period10 = period8.plusMinutes(59);
        java.lang.Class<?> wildcardClass11 = period10.getClass();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        org.joda.time.Period period29 = new org.joda.time.Period(100L, periodType23, chronology28);
        org.joda.time.Period period31 = period29.plusMillis(8);
        org.joda.time.format.PeriodFormatter periodFormatter32 = null;
        java.lang.String str33 = period31.toString(periodFormatter32);
        org.joda.time.PeriodType periodType34 = period31.getPeriodType();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) 35, (long) 197, periodType34, chronology35);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PT0.108S" + "'", str33, "PT0.108S");
        org.junit.Assert.assertNotNull(periodType34);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (short) 10);
        org.joda.time.Period period3 = period1.withYears(97);
        int int4 = period3.getMonths();
        org.joda.time.Period period6 = period3.minusHours(3104);
        org.joda.time.Period period11 = new org.joda.time.Period((int) 'a', 11, (int) (byte) 100, (int) ' ');
        org.joda.time.Period period13 = org.joda.time.Period.days((int) (byte) 100);
        org.joda.time.Period period15 = period13.withMonths((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Duration duration20 = period18.toDurationFrom(readableInstant19);
        org.joda.time.Period period22 = period18.plusMonths(0);
        org.joda.time.Period period24 = period22.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period22.toDurationFrom(readableInstant25);
        org.joda.time.Period period28 = period22.minusMinutes((int) (byte) -1);
        org.joda.time.Seconds seconds29 = period22.toStandardSeconds();
        org.joda.time.Period period30 = new org.joda.time.Period((java.lang.Object) period22);
        org.joda.time.Period period32 = period30.plusSeconds((int) (byte) 1);
        org.joda.time.Period period34 = period30.withWeeks((int) (byte) 10);
        boolean boolean35 = period13.equals((java.lang.Object) period30);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        org.joda.time.Period period42 = period38.plusMonths(0);
        org.joda.time.Period period44 = period42.plusMonths((int) '#');
        org.joda.time.Period period46 = period42.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant47, readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period49.plusMonths(0);
        org.joda.time.Period period55 = period53.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = period53.toDurationFrom(readableInstant56);
        org.joda.time.Period period59 = period53.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant60, readableInstant61, periodType62);
        org.joda.time.Period period65 = period63.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, readableInstant67, periodType68);
        org.joda.time.Period period71 = period69.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant72, readableInstant73, periodType74);
        org.joda.time.DurationFieldType durationFieldType77 = period75.getFieldType((int) (byte) 0);
        int int78 = period71.indexOf(durationFieldType77);
        int int79 = period63.get(durationFieldType77);
        org.joda.time.Period period81 = period53.withField(durationFieldType77, (int) (short) 0);
        boolean boolean82 = period46.isSupported(durationFieldType77);
        boolean boolean83 = period13.isSupported(durationFieldType77);
        int int84 = period11.indexOf(durationFieldType77);
        boolean boolean85 = period6.isSupported(durationFieldType77);
        org.joda.time.format.PeriodFormatter periodFormatter86 = null;
        java.lang.String str87 = period6.toString(periodFormatter86);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(durationFieldType77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "P97Y10DT-3104H" + "'", str87, "P97Y10DT-3104H");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period7.plusWeeks((int) (short) 10);
        org.joda.time.Period period11 = period7.withMonths((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.MutablePeriod mutablePeriod19 = period18.toMutablePeriod();
        org.joda.time.Period period20 = period14.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period22 = period18.withMonths((int) (byte) 0);
        org.joda.time.Period period23 = period11.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period25 = period11.withDays(52);
        org.joda.time.Period period27 = period25.withSeconds(97);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
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
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant28, readableInstant29, periodType49);
        org.joda.time.Period period56 = period25.minus((org.joda.time.ReadablePeriod) period55);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period56);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, chronology1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.minusSeconds((int) (short) 0);
        org.joda.time.format.PeriodFormatter periodFormatter7 = null;
        java.lang.String str8 = period2.toString(periodFormatter7);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT0.010S" + "'", str8, "PT0.010S");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period6.plusMonths((int) '#');
        org.joda.time.Period period10 = period8.minusWeeks(0);
        int int11 = period8.getYears();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(0L, chronology9);
        org.joda.time.Period period12 = period10.withMinutes((int) '#');
        org.joda.time.Period period13 = period6.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period6);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        org.joda.time.Period period75 = period71.withDays(11);
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
        org.junit.Assert.assertNotNull(period75);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (byte) 0);
        org.joda.time.Period period2 = period1.toPeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.joda.time.Period period3 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period5 = org.joda.time.Period.millis(1);
        org.joda.time.Period period7 = period5.withWeeks((int) (short) 0);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period9 = period8.toPeriod();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
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
        org.joda.time.Period period29 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType27, chronology28);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType27);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant10, readableInstant11, periodType27);
        org.joda.time.Period period32 = new org.joda.time.Period((java.lang.Object) period8, periodType27);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) 10, (long) 11, periodType27, chronology33);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period3 = org.joda.time.Period.millis(1);
        org.joda.time.Period period5 = period3.withWeeks((int) (short) 0);
        org.joda.time.Period period6 = period1.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.Period period10 = period9.normalizedStandard();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType19);
        org.joda.time.Period period21 = period10.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period22 = period6.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType25);
        org.joda.time.Period period28 = period26.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period26.toDurationTo(readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration30, readableInstant31);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) 'a', periodType34, chronology35);
        org.joda.time.Period period38 = period36.withMinutes(0);
        org.joda.time.Period period40 = period38.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod41 = period38.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant42, readableInstant43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period44.toDurationFrom(readableInstant45);
        org.joda.time.Period period48 = period44.plusMonths(0);
        org.joda.time.Period period50 = period48.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Duration duration52 = period48.toDurationFrom(readableInstant51);
        org.joda.time.Period period54 = period48.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant55, readableInstant56, periodType57);
        org.joda.time.Period period60 = period58.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period(readableInstant61, readableInstant62, periodType63);
        org.joda.time.Period period66 = period64.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant67, readableInstant68, periodType69);
        org.joda.time.DurationFieldType durationFieldType72 = period70.getFieldType((int) (byte) 0);
        int int73 = period66.indexOf(durationFieldType72);
        int int74 = period58.get(durationFieldType72);
        org.joda.time.Period period76 = period48.withField(durationFieldType72, (int) (short) 0);
        int int77 = mutablePeriod41.indexOf(durationFieldType72);
        boolean boolean78 = period32.isSupported(durationFieldType72);
        org.joda.time.Period period80 = period6.withField(durationFieldType72, (int) (short) 10);
        org.joda.time.Period period82 = period6.plusMonths(0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(mutablePeriod41);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) ' ');
        org.joda.time.Period period13 = period11.minusWeeks((-100));
        org.joda.time.Period period14 = period11.toPeriod();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology18);
        java.lang.String str20 = period19.toString();
        org.joda.time.Period period21 = new org.joda.time.Period((java.lang.Object) str20);
        org.joda.time.Period period22 = period21.normalizedStandard();
        org.joda.time.PeriodType periodType23 = period22.getPeriodType();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) 0, periodType23, chronology24);
        int[] intArray26 = period25.getValues();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) period25, chronology27);
        boolean boolean29 = period11.equals((java.lang.Object) chronology27);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT0.011S" + "'", str20, "PT0.011S");
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period5 = period4.toPeriod();
        org.joda.time.Period period7 = period5.minusSeconds((int) '4');
        org.joda.time.Period period9 = period7.withMillis((int) '4');
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
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
        org.joda.time.Period period67 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType56);
        org.joda.time.Period period69 = period67.withHours((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(period69);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 'a', periodType4, chronology5);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 'a', periodType8, chronology9);
        org.joda.time.Hours hours11 = period10.toStandardHours();
        org.joda.time.Period period12 = period6.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period6.withYears(10);
        org.joda.time.Period period15 = period14.toPeriod();
        org.joda.time.Period period17 = period14.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
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
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration24, periodType37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (byte) 0, periodType37, chronology41);
        org.joda.time.Period period43 = period17.normalizedStandard(periodType37);
        org.joda.time.Period period45 = period43.withMillis((int) (byte) 10);
        org.joda.time.PeriodType periodType46 = period43.getPeriodType();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) (-1), periodType46, chronology47);
        org.joda.time.Period period49 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType46);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(periodType46);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Days days7 = period2.toStandardDays();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, chronology1);
        org.joda.time.Period period4 = period2.withMinutes((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.Period period11 = period7.plusMonths(0);
        org.joda.time.Period period13 = period7.plusWeeks((int) ' ');
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
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant27, readableInstant28, periodType29);
        org.joda.time.Period period32 = period30.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant33, readableInstant34, periodType35);
        org.joda.time.Period period38 = period36.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.DurationFieldType durationFieldType44 = period42.getFieldType((int) (byte) 0);
        int int45 = period38.indexOf(durationFieldType44);
        int int46 = period30.get(durationFieldType44);
        org.joda.time.Period period48 = period20.withField(durationFieldType44, (int) (short) 0);
        int int49 = period13.indexOf(durationFieldType44);
        boolean boolean50 = period4.isSupported(durationFieldType44);
        org.joda.time.Period period52 = period4.minusMillis(0);
        org.joda.time.Period period54 = period52.withSeconds(17);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P1DT0.097S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        org.joda.time.Period period91 = period88.withMinutes(97);
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
        org.junit.Assert.assertNotNull(period91);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.Period period9 = period6.plusMonths((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.Period period17 = period15.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period15.toDurationTo(readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
        org.joda.time.Period period26 = period22.plusMonths(0);
        org.joda.time.Period period28 = period26.plusMonths((int) '#');
        org.joda.time.Period period30 = period26.plusMinutes((int) (short) 100);
        org.joda.time.Period period32 = period30.minusWeeks(1);
        org.joda.time.DurationFieldType durationFieldType34 = period30.getFieldType((int) (byte) 0);
        org.joda.time.Hours hours35 = period30.toStandardHours();
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableInstant37);
        org.joda.time.Period period39 = period38.normalizedStandard();
        org.joda.time.Period period41 = period38.plusMinutes((int) ' ');
        org.joda.time.Period period42 = period41.normalizedStandard();
        org.joda.time.Period period43 = new org.joda.time.Period((java.lang.Object) period42);
        org.joda.time.format.PeriodFormatter periodFormatter44 = null;
        java.lang.String str45 = period43.toString(periodFormatter44);
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
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period((long) (short) 100, periodType73, chronology77);
        org.joda.time.Period period79 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType73);
        org.joda.time.Period period80 = new org.joda.time.Period((java.lang.Object) str45, periodType73);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.Period period82 = new org.joda.time.Period((java.lang.Object) hours35, periodType73, chronology81);
        org.joda.time.Period period83 = new org.joda.time.Period(readableInstant11, (org.joda.time.ReadableDuration) duration19, periodType73);
        org.joda.time.Period period84 = new org.joda.time.Period((long) (-1), periodType73);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.Period period86 = new org.joda.time.Period((java.lang.Object) period9, periodType73, chronology85);
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.Period period88 = new org.joda.time.Period((java.lang.Object) period9, chronology87);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(hours35);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PT32M" + "'", str45, "PT32M");
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(periodType73);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        org.joda.time.Period period14 = period1.multipliedBy((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.Period period18 = period17.normalizedStandard();
        org.joda.time.Period period20 = period18.withMinutes((-1));
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = period20.normalizedStandard(periodType21);
        org.joda.time.PeriodType periodType23 = period20.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) (short) -1, periodType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        int int4 = period3.getYears();
        org.joda.time.Period period6 = period3.minusWeeks(10);
        org.joda.time.Period period8 = period6.withMillis(10);
        org.joda.time.Period period10 = org.joda.time.Period.seconds(8);
        org.joda.time.format.PeriodFormatter periodFormatter11 = null;
        java.lang.String str12 = period10.toString(periodFormatter11);
        org.joda.time.Period period13 = period6.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.DurationFieldType durationFieldType15 = period6.getFieldType((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT8S" + "'", str12, "PT8S");
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType15);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.Period period4 = period3.normalizedStandard();
        org.joda.time.Period period6 = period3.plusMinutes((int) ' ');
        org.joda.time.Duration duration7 = period3.toStandardDuration();
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration7);
        org.joda.time.Period period10 = period8.plusDays(8);
        org.joda.time.PeriodType periodType11 = period8.getPeriodType();
        org.joda.time.Period period13 = period8.withMonths(59);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
        org.joda.time.Period period33 = period14.minus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Period period35 = period33.plusHours(0);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        org.joda.time.Period period42 = period38.plusMonths(0);
        org.joda.time.Period period44 = period42.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = period42.toDurationFrom(readableInstant45);
        org.joda.time.Period period48 = period42.minusMonths((int) (byte) 0);
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
        org.joda.time.Period period82 = period42.normalizedStandard(periodType73);
        org.joda.time.Period period83 = new org.joda.time.Period((java.lang.Object) period33, periodType73);
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.Duration duration85 = period33.toDurationTo(readableInstant84);
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.Period period87 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration85, readableInstant86);
        org.joda.time.Period period89 = period87.withMinutes((int) (short) 0);
        org.joda.time.Period period91 = period89.withWeeks((int) (byte) 1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(duration85);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period91);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.joda.time.Period period8 = new org.joda.time.Period((int) '#', (-3), 52, (int) ' ', (-3), (int) (short) 0, (-1), (int) (short) 100);
        org.joda.time.Period period10 = period8.plusDays((-100));
        int int11 = period10.getYears();
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period8.plusMonths(0);
        org.joda.time.Period period14 = period12.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period12.toDurationFrom(readableInstant15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant5, (org.joda.time.ReadableDuration) duration16);
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
        org.joda.time.Period period51 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType45);
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration16, periodType45);
        org.joda.time.Period period53 = new org.joda.time.Period((long) 8, (long) 0, periodType45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period54 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType45);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.joda.time.Period period8 = new org.joda.time.Period((int) '#', (-3), 52, (int) ' ', (-3), (int) (short) 0, (-1), (int) (short) 100);
        org.joda.time.Period period10 = period8.multipliedBy(32);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        org.joda.time.Period period5 = period3.withWeeks(100);
        org.joda.time.Period period7 = period3.minusHours((int) '#');
        org.joda.time.Period period9 = period7.minusMonths((-100));
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.joda.time.Period period1 = org.joda.time.Period.months(8);
        org.joda.time.Period period3 = period1.plusYears((-1));
        org.joda.time.Period period5 = period1.plusMinutes(97);
        int int6 = period1.getHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.joda.time.Period period8 = new org.joda.time.Period((-52), 11, 3, 3, (int) (byte) 1, 17, 97, (-3));
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        int int6 = period5.getWeeks();
        int int7 = period5.getSeconds();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType10);
        org.joda.time.Period period13 = period11.minusMillis((int) '4');
        int int14 = period13.getSeconds();
        org.joda.time.Period period16 = period13.withHours(100);
        int int17 = period13.getDays();
        org.joda.time.Period period18 = period5.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period20 = period5.plusWeeks((int) (byte) 1);
        int int21 = period5.size();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.joda.time.ReadableInstant readableInstant2 = null;
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
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant3, (org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.Period period38 = period34.plusMonths(0);
        org.joda.time.Period period40 = period38.plusMonths((int) '#');
        org.joda.time.Period period42 = period38.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType43 = period38.getPeriodType();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) (short) -1, periodType43, chronology44);
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration30, periodType43);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) (short) 100, periodType43, chronology47);
        org.joda.time.Period period49 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType43);
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration14, periodType43);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) 1, (long) (short) 100, periodType43, chronology51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant53, readableInstant54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = period55.toDurationFrom(readableInstant56);
        org.joda.time.Period period59 = period55.plusMonths(0);
        org.joda.time.Period period61 = period59.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Duration duration63 = period59.toDurationFrom(readableInstant62);
        org.joda.time.Period period65 = period59.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.Period period69 = new org.joda.time.Period(readableInstant66, readableInstant67, periodType68);
        org.joda.time.Period period71 = period69.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant72, readableInstant73, periodType74);
        org.joda.time.Period period77 = period75.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period(readableInstant78, readableInstant79, periodType80);
        org.joda.time.DurationFieldType durationFieldType83 = period81.getFieldType((int) (byte) 0);
        int int84 = period77.indexOf(durationFieldType83);
        int int85 = period69.get(durationFieldType83);
        org.joda.time.Period period87 = period59.withField(durationFieldType83, (int) (short) 0);
        org.joda.time.Period period89 = period87.plusHours((int) (byte) 1);
        int int90 = period89.getMinutes();
        org.joda.time.DurationFieldType durationFieldType92 = period89.getFieldType((int) (short) 0);
        int int93 = period52.get(durationFieldType92);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(durationFieldType83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(durationFieldType92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.joda.time.Period period4 = new org.joda.time.Period(0, 10, 1, (-1));
        org.joda.time.Hours hours5 = period4.toStandardHours();
        org.joda.time.MutablePeriod mutablePeriod6 = period4.toMutablePeriod();
        org.joda.time.Period period8 = period4.withHours((-52));
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(0L, chronology1);
        org.joda.time.Period period4 = period2.withMonths((int) (short) 100);
        org.joda.time.Period period6 = period4.withYears((int) (short) 100);
        org.joda.time.Period period8 = period4.withMillis((-100));
        org.joda.time.Period period10 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) 'a', periodType12, chronology13);
        org.joda.time.Hours hours15 = period14.toStandardHours();
        org.joda.time.Period period17 = period14.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType20);
        org.joda.time.DurationFieldType durationFieldType23 = period21.getFieldType((int) (byte) 0);
        org.joda.time.Period period25 = period14.withField(durationFieldType23, 1);
        boolean boolean26 = period10.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant27, readableInstant28, periodType29);
        org.joda.time.Period period32 = period30.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant33, readableInstant34, periodType35);
        org.joda.time.DurationFieldType durationFieldType38 = period36.getFieldType((int) (byte) 0);
        int int39 = period32.indexOf(durationFieldType38);
        org.joda.time.Period period41 = period10.withFieldAdded(durationFieldType38, (int) (short) 0);
        int int42 = period8.get(durationFieldType38);
        org.joda.time.Period period44 = period8.withDays((int) ' ');
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.minusMinutes((int) (byte) 100);
        org.joda.time.Minutes minutes7 = period3.toStandardMinutes();
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) period3);
        org.joda.time.Period period10 = period3.minusYears((int) 'a');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period3.toDurationTo(readableInstant11);
        org.joda.time.Period period13 = period3.normalizedStandard();
        org.joda.time.Period period15 = period13.withMonths((-3));
        int int16 = period15.getMinutes();
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Period period6 = period3.plusSeconds((int) (byte) 1);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(100L, chronology8);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 'a', periodType11, chronology12);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 'a', periodType15, chronology16);
        org.joda.time.Hours hours18 = period17.toStandardHours();
        org.joda.time.Period period19 = period13.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period21 = period13.withYears(10);
        org.joda.time.Period period22 = period9.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period23 = period3.minus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period25 = period3.minusMillis(97);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) '4', periodType2, chronology3);
        org.joda.time.Period period6 = period4.plusMillis(0);
        int int7 = period4.getMonths();
        int int8 = period4.getMillis();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 40, (long) (short) 1, chronology2);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Duration duration5 = period3.toStandardDuration();
        org.joda.time.Period period7 = period3.withDays((int) (short) 0);
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Period period10 = period7.minusDays((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.Period period14 = period13.normalizedStandard();
        org.joda.time.Period period16 = period14.withMinutes((-1));
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = period16.normalizedStandard(periodType17);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 'a', periodType20, chronology21);
        org.joda.time.Period period24 = period22.withMinutes(0);
        org.joda.time.Period period26 = period24.minusSeconds((int) (short) 100);
        org.joda.time.Period period28 = period26.withWeeks((int) (short) -1);
        org.joda.time.Period period29 = period18.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.DurationFieldType[] durationFieldTypeArray30 = period28.getFieldTypes();
        org.joda.time.Period period32 = period28.plusMinutes(17);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) 'a', periodType34, chronology35);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) 'a', periodType38, chronology39);
        org.joda.time.Hours hours41 = period40.toStandardHours();
        org.joda.time.Period period42 = period36.withFields((org.joda.time.ReadablePeriod) period40);
        org.joda.time.Period period44 = period36.withYears(10);
        org.joda.time.Period period46 = period36.minusWeeks((int) (short) -1);
        java.lang.String str47 = period36.toString();
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = period36.toDurationFrom(readableInstant48);
        org.joda.time.Period period50 = period32.minus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period51 = period10.withFields((org.joda.time.ReadablePeriod) period32);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(durationFieldTypeArray30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(hours41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PT0.097S" + "'", str47, "PT0.097S");
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period7.toString(periodFormatter8);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
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
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration24, periodType37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) 100, periodType37, chronology41);
        org.joda.time.Period period43 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType37);
        org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) str9, periodType37);
        org.joda.time.Period period46 = period44.minusWeeks(100);
        org.joda.time.Minutes minutes47 = period44.toStandardMinutes();
        org.joda.time.Period period49 = period44.plusMillis(3);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT32M" + "'", str9, "PT32M");
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(period49);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) -1);
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
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) -1, periodType16, chronology17);
        org.joda.time.Period period19 = period3.minus((org.joda.time.ReadablePeriod) period18);
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
        org.joda.time.Period period44 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType41);
        org.joda.time.Period period45 = new org.joda.time.Period((long) (byte) 10, periodType41);
        org.joda.time.Period period46 = period18.withPeriodType(periodType41);
        org.joda.time.Period period47 = new org.joda.time.Period((long) 0, (long) 1, periodType41);
        org.joda.time.PeriodType periodType48 = period47.getPeriodType();
        int int49 = period47.getSeconds();
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period2.plusWeeks((int) ' ');
        org.joda.time.Period period10 = period2.plusMinutes((-1));
        org.joda.time.Period period12 = period10.plusSeconds((-100));
        org.joda.time.Period period14 = org.joda.time.Period.parse("PT0.011S");
        boolean boolean15 = period12.equals((java.lang.Object) period14);
        org.joda.time.DurationFieldType[] durationFieldTypeArray16 = period12.getFieldTypes();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray16);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.plusMonths(0);
        org.joda.time.Period period9 = period3.plusWeeks((int) ' ');
        org.joda.time.Period period11 = period3.plusMinutes((-1));
        org.joda.time.Period period12 = period3.normalizedStandard();
        org.joda.time.Period period14 = period3.plusMinutes(97);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period3.toDurationFrom(readableInstant15);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
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
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration24, periodType37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType37, chronology41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration16, periodType37);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
        org.joda.time.Period period16 = period12.minusMinutes(10);
        org.joda.time.Hours hours17 = period16.toStandardHours();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(hours17);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 1, 10, 0, (int) (short) 10);
        int int5 = period4.getSeconds();
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
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType26, chronology30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) period4, periodType26, chronology32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) '4');
        org.joda.time.Period period3 = period1.withMinutes((int) (byte) 1);
        org.joda.time.Period period5 = period3.minusMinutes((-52));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-10), chronology1);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        org.joda.time.Period period40 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType35, chronology39);
        org.joda.time.Period period41 = period12.withPeriodType(periodType35);
        org.joda.time.Period period42 = period41.toPeriod();
        org.joda.time.Period period44 = period41.plusWeeks((int) (byte) -1);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT0.101S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(100L, chronology1);
        org.joda.time.Period period4 = period2.minusHours((int) (short) -1);
        org.joda.time.Period period6 = period4.minusMonths(11);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType11);
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType25);
        org.joda.time.MutablePeriod mutablePeriod27 = period26.toMutablePeriod();
        org.joda.time.Period period28 = period22.plus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType31);
        org.joda.time.Period period34 = period32.plusMonths((int) '4');
        org.joda.time.Period period35 = period26.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.PeriodType periodType36 = period34.getPeriodType();
        org.joda.time.Period period37 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType36);
        org.joda.time.Period period38 = new org.joda.time.Period((long) 'a', (long) 10, periodType36);
        org.joda.time.Period period39 = new org.joda.time.Period((long) (short) 100, 100L, periodType36);
        org.joda.time.Period period40 = period12.withPeriodType(periodType36);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (-1), (long) 32, periodType36, chronology41);
        org.joda.time.Period period43 = period6.plus((org.joda.time.ReadablePeriod) period42);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period43);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 100, (long) 10);
        org.joda.time.Seconds seconds3 = period2.toStandardSeconds();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period2.toDurationFrom(readableInstant4);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (long) 17);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) 0L, periodType3, chronology4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Period period6 = period3.plusSeconds((int) (byte) 1);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(100L, chronology8);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 'a', periodType11, chronology12);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 'a', periodType15, chronology16);
        org.joda.time.Hours hours18 = period17.toStandardHours();
        org.joda.time.Period period19 = period13.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period21 = period13.withYears(10);
        org.joda.time.Period period22 = period9.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period23 = period3.minus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period25 = period22.minusSeconds((int) '#');
        org.joda.time.Period period27 = period25.plusMinutes(100);
        org.joda.time.Period period29 = period25.minusMinutes(0);
        org.joda.time.Period period31 = period25.withHours(11);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant44, readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.MutablePeriod mutablePeriod51 = period50.toMutablePeriod();
        org.joda.time.Period period52 = period46.plus((org.joda.time.ReadablePeriod) period50);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, readableInstant54, periodType55);
        org.joda.time.Period period58 = period56.plusMonths((int) '4');
        org.joda.time.Period period59 = period50.withFields((org.joda.time.ReadablePeriod) period58);
        org.joda.time.PeriodType periodType60 = period58.getPeriodType();
        org.joda.time.Period period61 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType60);
        org.joda.time.Period period62 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType60);
        org.joda.time.Period period63 = new org.joda.time.Period(readableInstant32, readableInstant33, periodType60);
        org.joda.time.Chronology chronology64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period65 = new org.joda.time.Period((java.lang.Object) 11, periodType60, chronology64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(mutablePeriod51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(periodType60);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 100, (long) (short) 100, chronology2);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.withMonths((int) (short) 0);
        org.joda.time.Period period7 = period5.withSeconds((int) (short) -1);
        int int8 = period5.getHours();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        org.joda.time.Period period17 = period11.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Period period19 = period15.withMonths((int) (byte) 0);
        org.joda.time.Period period21 = period19.minusSeconds((-1));
        org.joda.time.Period period23 = period21.minusHours((-1));
        org.joda.time.Period period25 = period23.minusDays(100);
        org.joda.time.Period period27 = period23.minusMinutes((int) '4');
        org.joda.time.PeriodType periodType28 = period27.getPeriodType();
        org.joda.time.Period period29 = period5.normalizedStandard(periodType28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType31 = period5.getFieldType(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period29);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.Period period7 = period5.plusDays((int) (short) 100);
        int int8 = period5.getMonths();
        org.joda.time.Period period10 = period5.withDays((int) '4');
        org.joda.time.Period period12 = period10.withMillis(100);
        org.joda.time.Seconds seconds13 = period10.toStandardSeconds();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.joda.time.Period period8 = new org.joda.time.Period(8, (int) (short) 100, 10, 8, (int) 'a', (int) (short) 100, (int) ' ', 0);
        int int9 = period8.size();
        org.joda.time.Period period11 = period8.withYears((int) ' ');
        org.joda.time.Period period12 = period11.toPeriod();
        org.joda.time.Period period14 = period12.minusWeeks(17);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((-1L), 100L, chronology2);
        org.joda.time.Period period5 = period3.plusHours((int) (byte) 10);
        org.joda.time.Period period7 = period3.plusMonths((int) (short) -1);
        org.joda.time.Period period9 = period3.plusYears(32);
        org.joda.time.Period period10 = period3.toPeriod();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.joda.time.Period period8 = new org.joda.time.Period(0, (-101), (int) (short) -1, (int) (short) -1, 3, (-3), (-100), (int) '#');
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        org.joda.time.Seconds seconds13 = period6.toStandardSeconds();
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period6);
        int int15 = period14.getMinutes();
        org.joda.time.Period period16 = period14.normalizedStandard();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(10L, (long) (short) 0, periodType2, chronology3);
        org.joda.time.Period period6 = period4.plusWeeks((int) (short) 100);
        org.joda.time.Period period8 = period6.plusMillis(98);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, chronology1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.minusSeconds((int) (short) 0);
        org.joda.time.Period period8 = period2.withMillis(10);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant9, readableInstant10);
        org.joda.time.Period period12 = period11.normalizedStandard();
        org.joda.time.Period period14 = period11.withWeeks(1);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType16, chronology17);
        org.joda.time.Period period20 = period18.withMinutes(0);
        org.joda.time.Period period21 = period11.minus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.Period period28 = period24.plusMonths(0);
        org.joda.time.Period period30 = period24.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = period33.toDurationFrom(readableInstant34);
        org.joda.time.Period period37 = period33.plusMonths(0);
        org.joda.time.Period period39 = period37.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = period37.toDurationFrom(readableInstant40);
        org.joda.time.Period period43 = period37.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType46);
        org.joda.time.Period period49 = period47.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant50, readableInstant51, periodType52);
        org.joda.time.Period period55 = period53.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant56, readableInstant57, periodType58);
        org.joda.time.DurationFieldType durationFieldType61 = period59.getFieldType((int) (byte) 0);
        int int62 = period55.indexOf(durationFieldType61);
        int int63 = period47.get(durationFieldType61);
        org.joda.time.Period period65 = period37.withField(durationFieldType61, (int) (short) 0);
        int int66 = period30.indexOf(durationFieldType61);
        org.joda.time.Period period68 = period20.withField(durationFieldType61, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Duration duration70 = period68.toDurationFrom(readableInstant69);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration70, readableInstant71);
        org.joda.time.Period period73 = period8.withFields((org.joda.time.ReadablePeriod) period72);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(durationFieldType61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(period73);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        org.joda.time.Period period13 = period10.plusWeeks(1);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.Period period4 = period3.normalizedStandard();
        int int5 = period3.getMillis();
        org.joda.time.Period period7 = period3.withHours((int) (byte) 0);
        org.joda.time.Period period9 = period3.withMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period3.toDurationTo(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration11);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant15);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days82 = period68.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
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
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        int int27 = period26.getMinutes();
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        int int13 = period12.getSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period5.plusMinutes((int) ' ');
        org.joda.time.Duration duration9 = period5.toStandardDuration();
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) (-100));
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = period17.toDurationFrom(readableInstant18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant14, (org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = period33.toDurationFrom(readableInstant34);
        org.joda.time.Period period37 = period33.plusMonths(0);
        org.joda.time.Period period39 = period37.plusMonths((int) '#');
        org.joda.time.Period period41 = period37.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType42 = period37.getPeriodType();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (short) -1, periodType42, chronology43);
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant24, (org.joda.time.ReadableDuration) duration29, periodType42);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType42, chronology46);
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration19, readableInstant21, periodType42);
        org.joda.time.Period period49 = period13.withPeriodType(periodType42);
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant11, periodType42);
        org.joda.time.Period period52 = org.joda.time.Period.years((int) (byte) -1);
        int int53 = period52.getSeconds();
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period(readableInstant72, readableInstant73);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.Duration duration76 = period74.toDurationFrom(readableInstant75);
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.Period period80 = new org.joda.time.Period(readableInstant78, readableInstant79);
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.Duration duration82 = period80.toDurationFrom(readableInstant81);
        org.joda.time.Period period84 = period80.plusMonths(0);
        org.joda.time.Period period86 = period84.plusMonths((int) '#');
        org.joda.time.Period period88 = period84.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType89 = period84.getPeriodType();
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.Period period91 = new org.joda.time.Period((long) (short) -1, periodType89, chronology90);
        org.joda.time.Period period92 = new org.joda.time.Period(readableInstant71, (org.joda.time.ReadableDuration) duration76, periodType89);
        org.joda.time.Chronology chronology93 = null;
        org.joda.time.Period period94 = new org.joda.time.Period((long) (short) 100, periodType89, chronology93);
        org.joda.time.Period period95 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType89);
        org.joda.time.Period period96 = new org.joda.time.Period((int) (byte) 1, 97, (-100), (int) (short) 1, (int) 'a', 100, (int) 'a', (int) '#', periodType89);
        org.joda.time.Period period97 = period52.withPeriodType(periodType89);
        org.joda.time.Period period98 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration9, periodType89);
        org.joda.time.Period period99 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration9);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(periodType89);
        org.junit.Assert.assertNotNull(period97);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.joda.time.Period period2 = new org.joda.time.Period(10L, (long) (short) -1);
        org.joda.time.Period period4 = period2.plusMonths(0);
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
        org.joda.time.Period period34 = new org.joda.time.Period((long) 97, (long) (short) 100, periodType31);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (short) 100, (long) 1, periodType31, chronology35);
        org.joda.time.Period period37 = new org.joda.time.Period(0L, 0L, periodType31);
        org.joda.time.Period period39 = org.joda.time.Period.millis(1);
        org.joda.time.Period period41 = period39.withWeeks((int) (short) 0);
        org.joda.time.Period period43 = period39.plusHours((int) (short) 100);
        org.joda.time.Period period45 = period43.withWeeks(0);
        org.joda.time.Period period46 = period37.withFields((org.joda.time.ReadablePeriod) period45);
        org.joda.time.Period period47 = period4.minus((org.joda.time.ReadablePeriod) period45);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period47);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        org.joda.time.Period period27 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period29 = period27.plusMillis((int) 'a');
        boolean boolean30 = period25.equals((java.lang.Object) period29);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType39);
        org.joda.time.Period period42 = period40.withYears((int) ' ');
        org.joda.time.Period period44 = period42.withWeeks((int) ' ');
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
        org.joda.time.Period period88 = new org.joda.time.Period((long) 'a', periodType80, chronology87);
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.Period period90 = new org.joda.time.Period((java.lang.Object) period42, periodType80, chronology89);
        org.joda.time.Chronology chronology91 = null;
        org.joda.time.Period period92 = new org.joda.time.Period((java.lang.Object) period25, periodType80, chronology91);
        org.joda.time.PeriodType periodType93 = null;
        org.joda.time.Period period94 = new org.joda.time.Period((java.lang.Object) chronology91, periodType93);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
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
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
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
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', periodType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 'a', periodType4, chronology5);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 'a', periodType8, chronology9);
        org.joda.time.Hours hours11 = period10.toStandardHours();
        org.joda.time.Period period12 = period6.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period6.withYears(10);
        org.joda.time.Period period15 = period14.toPeriod();
        org.joda.time.Period period17 = period14.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
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
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration24, periodType37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (byte) 0, periodType37, chronology41);
        org.joda.time.Period period43 = period17.normalizedStandard(periodType37);
        org.joda.time.Period period45 = period43.withMillis((int) (byte) 10);
        org.joda.time.PeriodType periodType46 = period43.getPeriodType();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) 10, periodType46, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) (byte) 100, periodType46, chronology49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) (short) 0, periodType46, chronology51);
        org.joda.time.Period period54 = period52.plusMillis(52);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period54);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.Period period4 = period3.normalizedStandard();
        org.joda.time.Period period6 = period3.plusMinutes((int) ' ');
        org.joda.time.Period period7 = period6.normalizedStandard();
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) period7);
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = period8.toString(periodFormatter9);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period29.plusMonths(0);
        org.joda.time.Period period35 = period33.plusMonths((int) '#');
        org.joda.time.Period period37 = period33.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType38 = period33.getPeriodType();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (short) -1, periodType38, chronology39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration25, periodType38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (short) 100, periodType38, chronology42);
        org.joda.time.Period period44 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType38);
        org.joda.time.Period period45 = new org.joda.time.Period((java.lang.Object) str10, periodType38);
        org.joda.time.Period period47 = period45.minusWeeks(100);
        org.joda.time.Period period49 = period47.withWeeks((int) (short) 100);
        org.joda.time.Period period51 = period47.withMinutes((-100));
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period47.toDurationTo(readableInstant52);
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration53);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT32M" + "'", str10, "PT32M");
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(duration53);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) 1);
        int int2 = period1.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.joda.time.Period period1 = new org.joda.time.Period(1L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 'a', periodType7, chronology8);
        org.joda.time.Hours hours10 = period9.toStandardHours();
        org.joda.time.Duration duration11 = period9.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant12 = null;
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
        org.joda.time.Period period35 = new org.joda.time.Period((long) 0, periodType33);
        org.joda.time.Period period36 = new org.joda.time.Period((long) (short) 100, periodType33);
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant12, periodType33);
        org.joda.time.Period period38 = new org.joda.time.Period((long) (byte) 100, 10L, periodType33);
        org.joda.time.Period period39 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType33);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((java.lang.Object) period1, periodType33, chronology40);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(mutablePeriod24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((long) 'a', periodType29, chronology30);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 'a', periodType33, chronology34);
        org.joda.time.Hours hours36 = period35.toStandardHours();
        org.joda.time.Period period37 = period31.withFields((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Period period39 = period31.withYears(10);
        org.joda.time.Period period40 = period39.toPeriod();
        org.joda.time.Period period42 = period39.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant45, readableInstant46);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Duration duration49 = period47.toDurationFrom(readableInstant48);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant51, readableInstant52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = period53.toDurationFrom(readableInstant54);
        org.joda.time.Period period57 = period53.plusMonths(0);
        org.joda.time.Period period59 = period57.plusMonths((int) '#');
        org.joda.time.Period period61 = period57.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType62 = period57.getPeriodType();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.Period period64 = new org.joda.time.Period((long) (short) -1, periodType62, chronology63);
        org.joda.time.Period period65 = new org.joda.time.Period(readableInstant44, (org.joda.time.ReadableDuration) duration49, periodType62);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period((long) (byte) 0, periodType62, chronology66);
        org.joda.time.Period period68 = period42.normalizedStandard(periodType62);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(0L, (long) 8, periodType62, chronology69);
        org.joda.time.Period period71 = new org.joda.time.Period((java.lang.Object) period16, periodType62);
        org.joda.time.Period period72 = new org.joda.time.Period((int) 'a', 100, (int) (short) -1, 100, (int) (short) -1, (int) (byte) 1, 8, 100, periodType62);
        org.joda.time.Period period73 = new org.joda.time.Period((long) (byte) 10, (long) 3104, periodType62);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(hours36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(period68);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.PeriodType periodType7 = period6.getPeriodType();
        int int8 = period6.getDays();
        int int9 = period6.getHours();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.Period period7 = period5.withMinutes(0);
        org.joda.time.Period period9 = period7.minusSeconds((int) (short) 100);
        org.joda.time.Period period11 = period9.minusMinutes(100);
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
        org.joda.time.Period period31 = period30.negated();
        org.joda.time.Period period32 = period11.plus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period34 = period11.minusSeconds((int) '#');
        org.joda.time.Period period36 = period34.minusMillis((-1));
        org.joda.time.Period period38 = period34.minusSeconds(10);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 100, (long) (-1), chronology41);
        org.joda.time.Period period44 = period42.plusMinutes((int) (short) 10);
        org.joda.time.Period period46 = period44.plusMinutes((-1));
        int int47 = period46.getWeeks();
        org.joda.time.Period period49 = period46.withMinutes((int) (byte) 10);
        org.joda.time.PeriodType periodType50 = period49.getPeriodType();
        org.joda.time.Period period51 = period38.withPeriodType(periodType50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) (byte) 1, (long) (short) 0, periodType50, chronology52);
        org.joda.time.Period period55 = period53.minusMonths(32);
        org.joda.time.Period period58 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period60 = period58.minusYears(100);
        org.joda.time.Period period61 = period60.negated();
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
        org.joda.time.Period period76 = period60.withField(durationFieldType73, 10);
        org.joda.time.Period period78 = period76.minusMinutes((int) (short) 0);
        org.joda.time.Period period80 = period78.plusMillis((int) (short) 10);
        org.joda.time.Period period81 = period53.minus((org.joda.time.ReadablePeriod) period78);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(durationFieldType73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period81);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) 10, chronology25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = period26.toDurationFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableInstant30);
        org.joda.time.Period period32 = period31.normalizedStandard();
        org.joda.time.Period period34 = period31.plusMinutes((int) ' ');
        org.joda.time.Period period35 = period34.normalizedStandard();
        org.joda.time.Period period36 = new org.joda.time.Period((java.lang.Object) period35);
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
        org.joda.time.Period period59 = period36.withPeriodType(periodType55);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((java.lang.Object) period26, periodType55, chronology60);
        org.joda.time.Period period62 = new org.joda.time.Period((int) (byte) -1, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0, (int) (byte) 100, (int) ' ', 0, periodType55);
        org.joda.time.Period period63 = new org.joda.time.Period((int) 'a', (int) (byte) 100, (int) '4', (-100), 11, 0, 0, 32, periodType55);
        org.joda.time.Period period64 = new org.joda.time.Period(0, 197, (int) 'a', (int) (byte) 10, 3, 10, (int) (byte) 1, (int) (byte) -1, periodType55);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(period59);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.Period period13 = period7.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableInstant14, readableInstant15, periodType16);
        org.joda.time.Period period19 = period17.plusMonths((int) '4');
        org.joda.time.Period period20 = period11.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.PeriodType periodType21 = period19.getPeriodType();
        org.joda.time.Period period22 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType21);
        org.joda.time.Weeks weeks23 = period22.toStandardWeeks();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period22.toDurationFrom(readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant28, readableInstant29);
        org.joda.time.Period period31 = period30.normalizedStandard();
        org.joda.time.Period period33 = period31.withMinutes((-1));
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = period33.normalizedStandard(periodType34);
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
        org.joda.time.Period period59 = new org.joda.time.Period((java.lang.Object) periodType34, periodType53, chronology58);
        org.joda.time.Period period60 = new org.joda.time.Period(readableInstant26, readableInstant27, periodType53);
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration25, periodType53);
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType53);
        int int63 = period62.getYears();
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.Period period19 = period15.plusMonths(0);
        org.joda.time.Period period21 = period19.plusMonths((int) '#');
        org.joda.time.Period period23 = period19.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType24 = period19.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, periodType24, chronology25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration11, periodType24);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType24);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (-100), (long) (-100), periodType24, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 0, (long) 100, periodType24, chronology31);
        org.joda.time.PeriodType periodType33 = period32.getPeriodType();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 'a', periodType35, chronology36);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) 'a', periodType39, chronology40);
        org.joda.time.Hours hours42 = period41.toStandardHours();
        org.joda.time.Period period43 = period37.withFields((org.joda.time.ReadablePeriod) period41);
        org.joda.time.Period period45 = period37.withYears(10);
        org.joda.time.Period period46 = period45.toPeriod();
        org.joda.time.Period period48 = period45.plusHours((int) (short) -1);
        org.joda.time.Period period50 = period48.plusHours(98);
        boolean boolean51 = period32.equals((java.lang.Object) 98);
        int int52 = period32.getDays();
        org.joda.time.Period period54 = period32.plusHours((int) (byte) 1);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(hours42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(period54);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period7 = period3.plusMonths(0);
        org.joda.time.Period period9 = period7.plusMonths((int) '#');
        org.joda.time.Period period11 = period7.plusMinutes((int) (short) 100);
        org.joda.time.Period period13 = period11.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) period11, periodType14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period11.toDurationTo(readableInstant16);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, readableInstant21, periodType22);
        org.joda.time.Period period25 = period23.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period23.toDurationTo(readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
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
        org.joda.time.Period period58 = new org.joda.time.Period(readableInstant34, readableInstant35, periodType54);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((long) (-100), (long) (-100), periodType54, chronology59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((long) 0, (long) 100, periodType54, chronology61);
        org.joda.time.Period period63 = period29.withPeriodType(periodType54);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period((long) (byte) 10, (long) '4', periodType54, chronology64);
        org.joda.time.Period period66 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration17, periodType54);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period67 = new org.joda.time.Period((java.lang.Object) periodType54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(period63);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) '4');
        org.joda.time.Period period3 = period1.withYears(97);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.joda.time.Period period1 = org.joda.time.Period.hours(100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray2 = period1.getFieldTypes();
        org.joda.time.Period period4 = period1.withWeeks((int) (byte) 10);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldTypeArray2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.joda.time.Period period1 = org.joda.time.Period.hours(197);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        org.joda.time.Period period8 = period2.plusWeeks((int) ' ');
        org.joda.time.Period period10 = period2.plusMinutes((-1));
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
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
        org.joda.time.Period period29 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType27, chronology28);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) (-100), periodType27, chronology31);
        org.joda.time.Period period33 = period10.withPeriodType(periodType27);
        org.joda.time.Period period35 = org.joda.time.Period.minutes((int) (byte) -1);
        int int36 = period35.getMinutes();
        org.joda.time.Period period38 = period35.minusMinutes(52);
        org.joda.time.Period period39 = period10.withFields((org.joda.time.ReadablePeriod) period38);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period4 = period3.negated();
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) 100, (int) (byte) -1, 10, 97);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = period4.toDurationFrom(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.Period period13 = period9.plusMonths(0);
        org.joda.time.Period period15 = period9.plusWeeks((int) ' ');
        org.joda.time.Period period17 = period9.plusMinutes((-1));
        org.joda.time.Period period18 = period9.normalizedStandard();
        org.joda.time.Period period20 = period9.plusMinutes(97);
        boolean boolean21 = period4.equals((java.lang.Object) period9);
        org.joda.time.Minutes minutes22 = period4.toStandardMinutes();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(minutes22);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        int int14 = period13.getDays();
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.joda.time.Period period1 = org.joda.time.Period.months(32);
        org.joda.time.Period period3 = period1.withHours((int) (byte) 100);
        java.lang.String str4 = period3.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P32MT100H" + "'", str4, "P32MT100H");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.Period period17 = period13.plusMonths(0);
        org.joda.time.Period period19 = period17.plusMonths((int) '#');
        org.joda.time.Period period21 = period17.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType22 = period17.getPeriodType();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) (short) -1, periodType22, chronology23);
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration9, periodType22);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType22);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType22);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        int int7 = period2.getWeeks();
        int int8 = period2.size();
        org.joda.time.Period period10 = period2.minusDays((int) (byte) -1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology13);
        java.lang.String str15 = period14.toString();
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) str15);
        org.joda.time.Period period18 = period16.plusSeconds((int) 'a');
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
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType39, chronology43);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) 100, (long) (-1), chronology47);
        org.joda.time.Period period50 = period48.plusMinutes((int) (short) 10);
        org.joda.time.Period period52 = period50.plusMinutes((-1));
        int int53 = period52.getWeeks();
        org.joda.time.Period period55 = period52.withMinutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType57 = period55.getFieldType(0);
        org.joda.time.Period period59 = period44.withFieldAdded(durationFieldType57, (int) (short) 100);
        org.joda.time.Period period61 = period18.withFieldAdded(durationFieldType57, 52);
        int int62 = period2.indexOf(durationFieldType57);
        org.joda.time.Period period64 = period2.withWeeks((int) (byte) 1);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0.011S" + "'", str15, "PT0.011S");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(durationFieldType57);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(period64);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Weeks weeks1 = period0.toStandardWeeks();
        org.joda.time.Period period2 = period0.toPeriod();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        org.joda.time.Period period21 = period1.withWeeks(8);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant22, readableInstant23, periodType24);
        org.joda.time.Period period27 = period25.minusMillis((int) '4');
        org.joda.time.Period period29 = period27.minusMinutes((int) (short) 100);
        org.joda.time.Period period31 = period27.minusSeconds((int) (short) -1);
        org.joda.time.Period period33 = period27.withMillis((int) (short) -1);
        org.joda.time.Period period34 = period21.withFields((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Period period36 = period27.minusMonths((-1));
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("PT1H", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '#');
        org.joda.time.Period period8 = period4.withMonths((int) (byte) -1);
        org.joda.time.Period period10 = period4.minusSeconds((int) (short) 10);
        org.joda.time.Period period12 = period10.multipliedBy((int) (short) 10);
        org.joda.time.Period period14 = period10.withSeconds((int) (byte) 10);
        org.joda.time.Period period16 = period14.withDays((-52));
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes((int) (short) 10);
        org.joda.time.Period period7 = period5.plusMinutes((-1));
        int int8 = period7.getWeeks();
        org.joda.time.Period period10 = period7.withMinutes((int) (byte) 10);
        org.joda.time.Period period12 = period7.minusMillis(97);
        org.joda.time.Period period14 = period12.withMillis((int) '4');
        org.joda.time.Period period16 = period12.withHours((int) (short) 100);
        org.joda.time.Period period18 = period16.withYears((int) (byte) -1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        org.joda.time.Period period70 = new org.joda.time.Period((long) (short) 0, periodType59);
        org.joda.time.Period period71 = new org.joda.time.Period((long) (short) 1, (long) 32, periodType59);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.Period period73 = new org.joda.time.Period((long) (short) -1, (long) 11, periodType59, chronology72);
        int int74 = period73.getYears();
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
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.Hours hours12 = period11.toStandardHours();
        org.joda.time.Period period13 = period7.withFields((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period15 = period7.withYears(10);
        org.joda.time.Period period16 = period15.toPeriod();
        org.joda.time.Period period18 = period15.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period29.plusMonths(0);
        org.joda.time.Period period35 = period33.plusMonths((int) '#');
        org.joda.time.Period period37 = period33.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType38 = period33.getPeriodType();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (short) -1, periodType38, chronology39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration25, periodType38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 0, periodType38, chronology42);
        org.joda.time.Period period44 = period18.normalizedStandard(periodType38);
        org.joda.time.Period period46 = period44.withMillis((int) (byte) 10);
        org.joda.time.PeriodType periodType47 = period44.getPeriodType();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) 10, periodType47, chronology48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) (byte) 100, periodType47, chronology50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(0L, (long) (byte) 100, periodType47, chronology52);
        org.junit.Assert.assertNotNull(hours12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(periodType47);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        int[] intArray85 = period84.getValues();
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
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[0, 0, 0, 0, 0, -100, -135, 97]");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        org.joda.time.Period period20 = period17.plusMonths((int) ' ');
        org.joda.time.Period period21 = period20.toPeriod();
        org.joda.time.Period period23 = period21.withMonths(59);
        org.joda.time.Period period25 = period23.withMillis((-3));
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType4);
        org.joda.time.Period period7 = period5.minusMillis((int) '4');
        int int8 = period7.getSeconds();
        org.joda.time.Period period10 = period7.withHours(100);
        int int11 = period10.getYears();
        org.joda.time.Period period13 = org.joda.time.Period.seconds(1);
        org.joda.time.Period period15 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period17 = period15.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType20);
        org.joda.time.Period period23 = period21.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant24, readableInstant25, periodType26);
        org.joda.time.DurationFieldType durationFieldType29 = period27.getFieldType((int) (byte) 0);
        int int30 = period23.indexOf(durationFieldType29);
        org.joda.time.Period period32 = period15.withFieldAdded(durationFieldType29, 1);
        org.joda.time.Period period34 = period32.plusSeconds((int) (byte) 1);
        org.joda.time.PeriodType periodType35 = period34.getPeriodType();
        org.joda.time.Period period36 = period13.withPeriodType(periodType35);
        boolean boolean37 = period10.equals((java.lang.Object) periodType35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period38 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        org.joda.time.Period period6 = period5.toPeriod();
        org.joda.time.Period period7 = period5.toPeriod();
        org.joda.time.Period period9 = period7.withHours(98);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType11 = period7.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        org.joda.time.Period period12 = period10.plusMillis((int) (byte) 100);
        org.joda.time.Weeks weeks13 = period10.toStandardWeeks();
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(weeks13);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) -1, (long) (short) 100);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.Period period13 = period9.plusMonths(0);
        org.joda.time.Period period15 = period13.plusMonths((int) '#');
        org.joda.time.Period period17 = period13.plusMinutes((int) (short) 100);
        org.joda.time.Period period19 = period17.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((java.lang.Object) period17, periodType20);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = period21.normalizedStandard(periodType22);
        org.joda.time.Days days24 = period23.toStandardDays();
        org.joda.time.Period period25 = period6.plus((org.joda.time.ReadablePeriod) days24);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(0L, chronology1);
        org.joda.time.Period period4 = period2.withMonths((int) (short) 100);
        org.joda.time.Period period6 = period4.withYears((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.Period period10 = period9.normalizedStandard();
        org.joda.time.Period period12 = period9.withWeeks(1);
        org.joda.time.Period period14 = period12.plusMonths(100);
        org.joda.time.Period period15 = period12.normalizedStandard();
        org.joda.time.Period period16 = period6.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.Period period20 = period19.normalizedStandard();
        org.joda.time.Period period22 = period20.withMinutes((-1));
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = period22.normalizedStandard(periodType23);
        org.joda.time.Period period26 = period24.minusHours((int) (short) 10);
        org.joda.time.Period period27 = new org.joda.time.Period((java.lang.Object) period26);
        org.joda.time.Period period28 = period16.plus((org.joda.time.ReadablePeriod) period26);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
        int[] intArray33 = period9.getValues();
        java.lang.Class<?> wildcardClass34 = intArray33.getClass();
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
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0, 0, 0, -100, -100, 97]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
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
        org.joda.time.Period period33 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType32);
        org.joda.time.Period period34 = new org.joda.time.Period((int) '4', (int) (byte) 10, (int) (short) 10, 1, 0, 97, (int) (byte) 10, 1, periodType32);
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) ' ', 0L, periodType32, chronology36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType32);
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType32);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) str4);
        org.joda.time.Period period7 = period5.plusSeconds((int) 'a');
        org.joda.time.Period period9 = period7.plusWeeks((int) (short) 10);
        org.joda.time.Period period11 = period7.minusMillis((int) (byte) 1);
        org.joda.time.Period period13 = period11.minusMillis(0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0.011S" + "'", str4, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes((int) (short) 10);
        org.joda.time.Period period7 = period5.plusMinutes((-1));
        org.joda.time.Period period9 = period5.withMillis(0);
        org.joda.time.Period period10 = period9.toPeriod();
        org.joda.time.Period period12 = period9.minusMonths((int) (short) -1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) ' ');
        org.joda.time.Days days2 = period1.toStandardDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) -1, (long) (short) 100);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.Period period6 = period2.plusMillis((-3));
        org.joda.time.Period period8 = period6.plusSeconds((int) '4');
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) -1, 0, 97, 3104);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
        org.joda.time.Period period17 = period14.toPeriod();
        org.joda.time.Period period19 = period17.minusMinutes((int) '4');
        org.joda.time.Period period22 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period24 = period22.minusYears(100);
        org.joda.time.Period period25 = period24.negated();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, readableInstant27, periodType28);
        org.joda.time.Period period31 = period29.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableInstant32, readableInstant33, periodType34);
        org.joda.time.DurationFieldType durationFieldType37 = period35.getFieldType((int) (byte) 0);
        int int38 = period31.indexOf(durationFieldType37);
        org.joda.time.Period period40 = period24.withField(durationFieldType37, 10);
        int int41 = period19.get(durationFieldType37);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        org.joda.time.Period period7 = period5.minusMinutes((int) (short) 100);
        org.joda.time.Period period9 = period5.minusSeconds((int) (short) -1);
        org.joda.time.Period period11 = period5.withMillis((int) (short) -1);
        int int12 = period5.getMonths();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((-1), 0, (int) '#', (int) (short) 10, (int) (short) 0, 10, (int) (short) 1, (int) (byte) 10, periodType12);
        org.joda.time.Period period14 = period3.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = period14.minusMonths((int) (short) 100);
        org.joda.time.Period period18 = period16.minusMinutes(3);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.joda.time.Period period1 = org.joda.time.Period.months((-100));
        org.joda.time.DurationFieldType durationFieldType2 = null;
        boolean boolean3 = period1.isSupported(durationFieldType2);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 0, 1, (int) (byte) 0, (int) '4');
        org.joda.time.Period period6 = period4.minusMonths(8);
        org.joda.time.Period period8 = period6.withMonths(97);
        org.joda.time.Period period10 = period8.plusSeconds((-52));
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) '4');
        org.joda.time.Period period3 = period1.minusDays((int) (byte) 100);
        org.joda.time.Period period4 = period1.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.joda.time.Period period1 = org.joda.time.Period.years((-100));
        org.joda.time.Period period3 = period1.withMonths((-101));
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 0, (-1), (int) (byte) 0, (int) '4', 52, 197, 3, 35);
        org.joda.time.Period period10 = period8.minusWeeks((int) '4');
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        int int43 = period41.getWeeks();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology2);
        int int4 = period3.getYears();
        org.joda.time.Period period6 = period3.withSeconds(11);
        java.lang.String str7 = period6.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT10.989S" + "'", str7, "PT10.989S");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        org.joda.time.Period period18 = period15.plusYears(1);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
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
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType40, chronology41);
        org.joda.time.Period period43 = new org.joda.time.Period(readableInstant25, readableInstant26, periodType40);
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant23, readableInstant24, periodType40);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) ' ', 0L, periodType40, chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) (-3), (long) 100, periodType40, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((java.lang.Object) period18, periodType40, chronology49);
        org.joda.time.Period period51 = new org.joda.time.Period((long) 1, periodType40);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(periodType40);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
        int[] intArray86 = period84.getValues();
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
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[0, 0, 0, 0, 0, 0, 0, 17]");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType14, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 'a', periodType14, chronology17);
        org.joda.time.Hours hours19 = period18.toStandardHours();
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(hours19);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(10L, 1L, chronology2);
        int int4 = period3.getDays();
        org.joda.time.Period period6 = period3.withHours((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.joda.time.Period period1 = org.joda.time.Period.months(8);
        org.joda.time.Period period3 = period1.plusYears((-1));
        org.joda.time.Period period5 = period1.plusMinutes(97);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology8);
        java.lang.String str10 = period9.toString();
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) str10);
        org.joda.time.Period period13 = period11.plusSeconds((int) 'a');
        org.joda.time.Period period15 = period11.plusYears((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
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
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration24, periodType37);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant17, readableInstant18, periodType37);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(100L, periodType37, chronology42);
        org.joda.time.Period period44 = period15.withPeriodType(periodType37);
        boolean boolean45 = period1.equals((java.lang.Object) period15);
        org.joda.time.Period period47 = period15.plusMonths(3104);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0.011S" + "'", str10, "PT0.011S");
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(period47);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) 'a');
        org.joda.time.Period period3 = org.joda.time.Period.millis(1);
        org.joda.time.Period period5 = period3.withWeeks((int) (short) 0);
        org.joda.time.Period period6 = period1.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period8 = period5.minusSeconds((int) (short) 0);
        org.joda.time.DurationFieldType[] durationFieldTypeArray9 = period8.getFieldTypes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray9);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.Period period5 = period4.normalizedStandard();
        org.joda.time.Period period7 = period4.withWeeks(1);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 'a', periodType9, chronology10);
        org.joda.time.Period period13 = period11.withMinutes(0);
        org.joda.time.Period period14 = period4.minus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.DurationFieldType[] durationFieldTypeArray15 = period4.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant16, readableInstant17);
        org.joda.time.Period period19 = period18.normalizedStandard();
        org.joda.time.Period period21 = period18.withWeeks(1);
        int int22 = period21.getWeeks();
        org.joda.time.Period period23 = period4.minus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationTo(readableInstant24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology29);
        java.lang.String str31 = period30.toString();
        org.joda.time.PeriodType periodType32 = period30.getPeriodType();
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration25, periodType32);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationFrom(readableInstant38);
        org.joda.time.Period period41 = period37.plusMonths(0);
        org.joda.time.Period period43 = period41.plusMonths((int) '#');
        org.joda.time.Period period45 = period41.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType46 = period41.getPeriodType();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) (short) -1, periodType46, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((java.lang.Object) readableInstant0, periodType46, chronology49);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldTypeArray15);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT0.011S" + "'", str31, "PT0.011S");
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(periodType46);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        org.joda.time.PeriodType periodType20 = period18.getPeriodType();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((-1L), (long) 98, periodType20, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) (short) 0, 0L, periodType20, chronology23);
        org.joda.time.Period period26 = period24.minusMonths((int) ' ');
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.joda.time.Period period8 = new org.joda.time.Period(197, 0, (-100), 97, (int) (byte) 10, 17, 3, (-10));
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationFrom(readableInstant4);
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant7 = null;
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
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant7, periodType28);
        org.joda.time.Period period36 = period34.minusSeconds(1);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period36);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.hours((int) (byte) 1);
        org.joda.time.PeriodType periodType4 = period3.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(0L, chronology1);
        org.joda.time.Period period4 = period2.withMonths((int) (short) 100);
        int int5 = period2.getMillis();
        org.joda.time.Period period7 = period2.withYears(11);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.Period period19 = period15.plusMonths(0);
        org.joda.time.Period period21 = period19.plusMonths((int) '#');
        org.joda.time.Period period23 = period19.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType24 = period19.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, periodType24, chronology25);
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration11, periodType24);
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType24);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) (-100), (long) (-100), periodType24, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 0, (long) 100, periodType24, chronology31);
        org.joda.time.Period period34 = period32.withWeeks(1);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration36);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(59);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        int int6 = period5.getWeeks();
        int int7 = period5.getSeconds();
        org.joda.time.Period period9 = period5.withDays((-31));
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration15);
        int int17 = period16.getYears();
        org.joda.time.Period period19 = period16.withMonths((int) (byte) 100);
        org.joda.time.Period period20 = period16.negated();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = period16.toDurationFrom(readableInstant21);
        java.lang.String str23 = period16.toString();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableInstant25, readableInstant26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period27.toDurationFrom(readableInstant28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant31, readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = period33.toDurationFrom(readableInstant34);
        org.joda.time.Period period37 = period33.plusMonths(0);
        org.joda.time.Period period39 = period37.plusMonths((int) '#');
        org.joda.time.Period period41 = period37.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType42 = period37.getPeriodType();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) (short) -1, periodType42, chronology43);
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant24, (org.joda.time.ReadableDuration) duration29, periodType42);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology49);
        java.lang.String str51 = period50.toString();
        org.joda.time.Period period52 = new org.joda.time.Period((java.lang.Object) str51);
        org.joda.time.Period period53 = period52.normalizedStandard();
        org.joda.time.PeriodType periodType54 = period53.getPeriodType();
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration29, readableInstant46, periodType54);
        org.joda.time.Period period56 = period16.withPeriodType(periodType54);
        org.joda.time.Period period57 = period9.withPeriodType(periodType54);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT0S" + "'", str23, "PT0S");
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PT0.011S" + "'", str51, "PT0.011S");
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(periodType54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period57);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        int int7 = period2.getWeeks();
        int int8 = period2.size();
        org.joda.time.Period period10 = period2.minusDays((int) (byte) -1);
        org.joda.time.Period period12 = period10.withDays((int) (byte) -1);
        org.joda.time.Period period14 = period12.plusMillis((int) (short) 100);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
        org.joda.time.Period period13 = period11.normalizedStandard();
        int int14 = period11.getSeconds();
        org.joda.time.Days days15 = period11.toStandardDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(days15);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusMinutes((int) (short) 10);
        org.joda.time.Period period7 = period5.plusMinutes((-1));
        int int8 = period7.getWeeks();
        org.joda.time.Period period10 = period7.withMinutes((int) (byte) 10);
        org.joda.time.Period period11 = period10.negated();
        org.joda.time.Period period12 = period10.toPeriod();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant22);
        org.joda.time.PeriodType periodType24 = period23.getPeriodType();
        org.joda.time.Period period26 = period23.withMonths(10);
        org.joda.time.Period period28 = period26.plusMonths(35);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(0L, 0L, chronology2);
        org.joda.time.Period period5 = period3.withHours((int) 'a');
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology8);
        org.joda.time.Period period10 = period5.minus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period12 = period5.plusYears((int) (byte) -1);
        org.joda.time.Period period14 = period12.multipliedBy((int) '4');
        org.joda.time.Period period16 = period14.withSeconds(32);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) 10, 11, (int) (short) 100, 98);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        int int7 = period2.getWeeks();
        int int8 = period2.size();
        org.joda.time.Period period10 = period2.minusDays((int) (byte) -1);
        org.joda.time.Period period12 = period2.withMillis((int) (byte) -1);
        org.joda.time.Period period14 = period12.minusHours(17);
        int[] intArray15 = period12.getValues();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0, 0, 0, -1]");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', periodType16, chronology19);
        org.joda.time.Period period21 = new org.joda.time.Period((long) (short) 10, periodType16);
        org.joda.time.Period period22 = new org.joda.time.Period((long) 10, periodType16);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant5, readableInstant6, periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        org.joda.time.Period period10 = period4.plus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant11, readableInstant12, periodType13);
        org.joda.time.Period period16 = period14.plusMonths((int) '4');
        org.joda.time.Period period17 = period8.withFields((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType18 = period16.getPeriodType();
        org.joda.time.Period period19 = new org.joda.time.Period((long) ' ', (long) (short) 10, periodType18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.Period period23 = period22.normalizedStandard();
        org.joda.time.Period period25 = period22.plusMinutes((int) ' ');
        org.joda.time.Period period26 = period25.normalizedStandard();
        org.joda.time.Period period28 = period26.plusMinutes((-1));
        org.joda.time.Period period30 = period28.plusYears(8);
        org.joda.time.Period period31 = period19.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period33 = period31.withSeconds((int) (byte) 1);
        org.joda.time.Period period35 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period37 = period35.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant38, readableInstant39, periodType40);
        org.joda.time.Period period43 = period41.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant44, readableInstant45, periodType46);
        org.joda.time.DurationFieldType durationFieldType49 = period47.getFieldType((int) (byte) 0);
        int int50 = period43.indexOf(durationFieldType49);
        org.joda.time.Period period52 = period35.withFieldAdded(durationFieldType49, 1);
        org.joda.time.Period period54 = period52.plusSeconds((int) (byte) 1);
        int int55 = period52.size();
        org.joda.time.Period period57 = period52.minusSeconds((-3));
        org.joda.time.Period period58 = period33.minus((org.joda.time.ReadablePeriod) period52);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 8 + "'", int55 == 8);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period58);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period25.plusMonths(0);
        org.joda.time.Period period31 = period25.plusWeeks((int) ' ');
        org.joda.time.Period period33 = period25.plusMinutes((-1));
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
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
        org.joda.time.Period period52 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType50, chronology51);
        org.joda.time.Period period53 = new org.joda.time.Period(readableInstant35, readableInstant36, periodType50);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((long) (-100), periodType50, chronology54);
        org.joda.time.Period period56 = period33.withPeriodType(periodType50);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant22, periodType50);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant58);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(period56);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        org.joda.time.Period period65 = period63.minusMonths((-1));
        org.joda.time.Period period67 = period63.minusMinutes(98);
        org.joda.time.Period period70 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period72 = period70.minusYears(100);
        org.joda.time.Period period73 = period72.negated();
        org.joda.time.ReadableInstant readableInstant74 = null;
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Period period77 = new org.joda.time.Period(readableInstant74, readableInstant75, periodType76);
        org.joda.time.Period period79 = period77.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant80 = null;
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.Period period83 = new org.joda.time.Period(readableInstant80, readableInstant81, periodType82);
        org.joda.time.DurationFieldType durationFieldType85 = period83.getFieldType((int) (byte) 0);
        int int86 = period79.indexOf(durationFieldType85);
        org.joda.time.Period period88 = period72.withField(durationFieldType85, 10);
        org.joda.time.Period period90 = period67.withField(durationFieldType85, 3);
        org.joda.time.Period period92 = period90.withDays(11);
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
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(durationFieldType85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(period92);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period5.minusMonths((int) 'a');
        org.joda.time.Period period11 = period9.minusHours(10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant15, readableInstant16, periodType17);
        org.joda.time.MutablePeriod mutablePeriod19 = period18.toMutablePeriod();
        org.joda.time.Period period20 = period14.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period22 = period14.withYears((int) (byte) -1);
        org.joda.time.Period period24 = period22.minusMillis((int) '#');
        org.joda.time.Period period26 = period24.minusMillis((int) (short) 1);
        org.joda.time.Period period28 = period26.plusDays((int) '#');
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology31);
        java.lang.String str33 = period32.toString();
        org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) str33);
        org.joda.time.Period period36 = period34.plusSeconds((int) 'a');
        org.joda.time.DurationFieldType[] durationFieldTypeArray37 = period36.getFieldTypes();
        org.joda.time.Period period39 = period36.withSeconds((int) (short) 10);
        org.joda.time.Period period41 = period39.minusDays((int) '4');
        org.joda.time.DurationFieldType durationFieldType43 = period41.getFieldType((int) (byte) 1);
        boolean boolean44 = period28.isSupported(durationFieldType43);
        org.joda.time.Period period46 = period9.withField(durationFieldType43, (int) (short) 100);
        org.joda.time.Period period48 = period46.plusMillis((int) (byte) 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PT0.011S" + "'", str33, "PT0.011S");
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(durationFieldTypeArray37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        org.joda.time.Period period78 = period76.withYears((-3));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration79 = period78.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
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
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period5 = period4.toPeriod();
        int int6 = period4.getMonths();
        org.joda.time.Period period8 = period4.withMillis(97);
        org.joda.time.Period period10 = period8.plusMillis((int) (short) 1);
        org.joda.time.Period period12 = period8.minusWeeks((int) (byte) 10);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType8);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.Period period11 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period9.withMonths((int) (byte) 0);
        org.joda.time.Period period15 = period13.minusSeconds((-1));
        org.joda.time.Period period17 = period15.minusHours((-1));
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period29.plusMonths(0);
        org.joda.time.Period period35 = period33.plusMonths((int) '#');
        org.joda.time.Period period37 = period33.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType38 = period33.getPeriodType();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (short) -1, periodType38, chronology39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration25, periodType38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType38, chronology42);
        org.joda.time.Period period44 = period15.withPeriodType(periodType38);
        org.joda.time.Duration duration45 = period44.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period44.toDurationTo(readableInstant46);
        org.joda.time.Period period49 = org.joda.time.Period.years((int) (byte) 1);
        org.joda.time.PeriodType periodType50 = period49.getPeriodType();
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration47, periodType50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) 97, (long) 52, periodType50, chronology52);
        java.lang.Class<?> wildcardClass54 = period53.getClass();
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.plusYears(97);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(100L, (long) ' ', chronology8);
        org.joda.time.Period period11 = period9.plusHours(1);
        org.joda.time.Weeks weeks12 = period11.toStandardWeeks();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology15);
        java.lang.String str17 = period16.toString();
        org.joda.time.Period period18 = new org.joda.time.Period((java.lang.Object) str17);
        org.joda.time.Period period20 = period18.plusSeconds((int) 'a');
        org.joda.time.Period period22 = period18.plusYears((int) (byte) 0);
        org.joda.time.Period period24 = period18.withMonths(0);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) 'a', periodType26, chronology27);
        org.joda.time.Period period30 = period28.withMinutes(0);
        org.joda.time.Period period32 = period30.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod33 = period30.toMutablePeriod();
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
        int int69 = mutablePeriod33.indexOf(durationFieldType64);
        int int70 = period24.get(durationFieldType64);
        org.joda.time.Period period72 = period11.withFieldAdded(durationFieldType64, (int) (byte) 1);
        boolean boolean73 = period5.isSupported(durationFieldType64);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0.011S" + "'", str17, "PT0.011S");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(mutablePeriod33);
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
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.Period period33 = period32.normalizedStandard();
        org.joda.time.Period period35 = period32.withWeeks(1);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) 'a', periodType37, chronology38);
        org.joda.time.Period period41 = period39.withMinutes(0);
        org.joda.time.Period period42 = period32.minus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.DurationFieldType[] durationFieldTypeArray43 = period32.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant44, readableInstant45);
        org.joda.time.Period period47 = period46.normalizedStandard();
        org.joda.time.Period period49 = period46.withWeeks(1);
        int int50 = period49.getWeeks();
        org.joda.time.Period period51 = period32.minus((org.joda.time.ReadablePeriod) period49);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period51.toDurationTo(readableInstant52);
        org.joda.time.Period period54 = new org.joda.time.Period(readableInstant29, (org.joda.time.ReadableDuration) duration53);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology57);
        java.lang.String str59 = period58.toString();
        org.joda.time.PeriodType periodType60 = period58.getPeriodType();
        org.joda.time.Period period61 = new org.joda.time.Period(readableInstant28, (org.joda.time.ReadableDuration) duration53, periodType60);
        org.joda.time.Period period63 = org.joda.time.Period.days(1);
        org.joda.time.Period period65 = period63.withSeconds(8);
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period(readableInstant72, readableInstant73);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period(readableInstant75, readableInstant76, periodType77);
        org.joda.time.MutablePeriod mutablePeriod79 = period78.toMutablePeriod();
        org.joda.time.Period period80 = period74.plus((org.joda.time.ReadablePeriod) period78);
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period(readableInstant81, readableInstant82, periodType83);
        org.joda.time.Period period86 = period84.plusMonths((int) '4');
        org.joda.time.Period period87 = period78.withFields((org.joda.time.ReadablePeriod) period86);
        org.joda.time.PeriodType periodType88 = period86.getPeriodType();
        org.joda.time.Period period89 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType88);
        org.joda.time.Period period90 = new org.joda.time.Period((long) (-100), (long) (short) 10, periodType88);
        org.joda.time.Chronology chronology91 = null;
        org.joda.time.Period period92 = new org.joda.time.Period((long) 0, 10L, periodType88, chronology91);
        org.joda.time.Period period93 = period65.normalizedStandard(periodType88);
        org.joda.time.Period period94 = new org.joda.time.Period(readableInstant27, (org.joda.time.ReadableDuration) duration53, periodType88);
        org.joda.time.Period period95 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration24, readableInstant26, periodType88);
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
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(durationFieldTypeArray43);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "PT0.011S" + "'", str59, "PT0.011S");
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(mutablePeriod79);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(periodType88);
        org.junit.Assert.assertNotNull(period93);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 11, (long) 59);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period8 = period6.minusSeconds((int) '#');
        org.joda.time.Period period10 = period6.minusYears((int) (short) 100);
        org.joda.time.Period period12 = period6.minusMillis((int) (byte) -1);
        int int13 = period6.getWeeks();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.Period period8 = period2.withMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period2.toDurationTo(readableInstant9);
        org.joda.time.Period period12 = period2.withWeeks((-10));
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        org.joda.time.Period period20 = period2.plusWeeks((int) (byte) 0);
        org.joda.time.Duration duration21 = period2.toStandardDuration();
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration21);
        int int23 = period22.size();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period5 = period4.toPeriod();
        org.joda.time.Period period7 = period5.withYears(1);
        int int8 = period5.getWeeks();
        int[] intArray9 = period5.getValues();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, -53]");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, (long) (-101));
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        org.joda.time.DurationFieldType[] durationFieldTypeArray32 = period5.getFieldTypes();
        int[] intArray33 = period5.getValues();
        int int34 = period5.getHours();
        org.joda.time.Period period36 = period5.minusDays((int) ' ');
        org.joda.time.Period period38 = period5.plusWeeks((int) (short) 0);
        org.joda.time.Period period40 = period5.plusMonths(1);
        org.joda.time.Period period42 = period40.plusMinutes(97);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(durationFieldTypeArray32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0, 0, 1, 0, 0, -68]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationTo(readableInstant33);
        org.joda.time.Period period36 = org.joda.time.Period.years(1);
        org.joda.time.Period period37 = period36.negated();
        org.joda.time.Period period38 = period32.withFields((org.joda.time.ReadablePeriod) period36);
        org.joda.time.Period period40 = period32.minusSeconds((int) (short) 0);
        int int41 = period40.getMinutes();
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.joda.time.Period period1 = org.joda.time.Period.months(59);
        int int2 = period1.getMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, chronology1);
        org.joda.time.Period period4 = period2.withMinutes((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.Period period11 = period7.plusMonths(0);
        org.joda.time.Period period13 = period7.plusWeeks((int) ' ');
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
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant27, readableInstant28, periodType29);
        org.joda.time.Period period32 = period30.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant33, readableInstant34, periodType35);
        org.joda.time.Period period38 = period36.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.DurationFieldType durationFieldType44 = period42.getFieldType((int) (byte) 0);
        int int45 = period38.indexOf(durationFieldType44);
        int int46 = period30.get(durationFieldType44);
        org.joda.time.Period period48 = period20.withField(durationFieldType44, (int) (short) 0);
        int int49 = period13.indexOf(durationFieldType44);
        boolean boolean50 = period4.isSupported(durationFieldType44);
        org.joda.time.Period period52 = period4.minusMillis(0);
        org.joda.time.Period period55 = new org.joda.time.Period((long) 1, (long) (short) 0);
        boolean boolean56 = period52.equals((java.lang.Object) period55);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 1, (int) (short) 10, 97, (int) (byte) 1, 8, (int) (short) -1, 97, 8);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
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
        int int30 = period8.indexOf(durationFieldType26);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant35, readableInstant36);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Duration duration39 = period37.toDurationFrom(readableInstant38);
        org.joda.time.Period period41 = period37.plusMonths(0);
        org.joda.time.Period period43 = period41.plusMonths((int) '#');
        org.joda.time.Period period45 = period41.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType46 = period41.getPeriodType();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType46, chronology47);
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant31, readableInstant32, periodType46);
        org.joda.time.Period period50 = new org.joda.time.Period((java.lang.Object) period8, periodType46);
        org.joda.time.Period period52 = period8.plusSeconds((int) ' ');
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period52);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.withHours(0);
        org.joda.time.Hours hours6 = period3.toStandardHours();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period3.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period3.plusWeeks(0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(1);
        int int2 = period1.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) 'a');
        org.joda.time.Period period3 = period1.minusMinutes((int) (byte) 100);
        org.joda.time.Period period5 = period1.withSeconds(1);
        org.joda.time.Period period7 = period1.minusSeconds((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        org.joda.time.Seconds seconds13 = period6.toStandardSeconds();
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.Period period16 = period14.withMinutes((int) '#');
        int int17 = period14.getMinutes();
        org.joda.time.format.PeriodFormatter periodFormatter18 = null;
        java.lang.String str19 = period14.toString(periodFormatter18);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0S" + "'", str19, "PT0S");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.minusMinutes(100);
        org.joda.time.Period period11 = period9.withSeconds((int) (short) 1);
        org.joda.time.Seconds seconds12 = period11.toStandardSeconds();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(seconds12);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.Period period5 = period3.minusMillis((int) '4');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) (-100));
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period29.plusMonths(0);
        org.joda.time.Period period35 = period33.plusMonths((int) '#');
        org.joda.time.Period period37 = period33.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType38 = period33.getPeriodType();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (short) -1, periodType38, chronology39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration25, periodType38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType38, chronology42);
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, readableInstant17, periodType38);
        org.joda.time.Period period45 = period9.withPeriodType(periodType38);
        org.joda.time.Period period46 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType38);
        org.joda.time.Period period47 = period5.normalizedStandard(periodType38);
        org.joda.time.Period period48 = period5.normalizedStandard();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period48);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 10, (long) 17);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        org.joda.time.Period period12 = period10.plusMillis((int) (byte) 100);
        org.joda.time.Period period14 = period10.plusWeeks((int) '#');
        org.joda.time.Period period16 = period14.plusMinutes(11);
        org.joda.time.Period period18 = period16.minusHours((-31));
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.joda.time.Period period1 = org.joda.time.Period.hours(11);
        int int2 = period1.getHours();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 1);
        org.joda.time.PeriodType periodType2 = period1.getPeriodType();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period1.toDurationFrom(readableInstant3);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 32, (long) (byte) 1);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        org.joda.time.Period period19 = period15.plusMinutes(17);
        org.joda.time.Period period21 = period19.withDays((-1));
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 52, (long) 1, chronology2);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.joda.time.Period period1 = org.joda.time.Period.days(3104);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        org.joda.time.Period period84 = new org.joda.time.Period((long) 98, (long) 3, periodType73);
        org.joda.time.Period period86 = period84.plusWeeks((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(period86);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.joda.time.ReadableInstant readableInstant0 = null;
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
        org.joda.time.Period period15 = period12.plusHours((int) (short) -1);
        org.joda.time.Period period17 = period15.plusHours(98);
        org.joda.time.Period period19 = period17.plusWeeks(10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period17.toDurationFrom(readableInstant20);
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes23 = period22.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 100, 100L, chronology2);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '4', (long) 0);
        org.joda.time.Period period7 = period3.withFields((org.joda.time.ReadablePeriod) period6);
        org.joda.time.PeriodType periodType8 = period3.getPeriodType();
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(0);
        int int2 = period1.getMillis();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant3, readableInstant4, periodType5);
        org.joda.time.Period period8 = period6.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant9, readableInstant10, periodType11);
        org.joda.time.DurationFieldType durationFieldType14 = period12.getFieldType((int) (byte) 0);
        int int15 = period8.indexOf(durationFieldType14);
        org.joda.time.Period period17 = period1.withFieldAdded(durationFieldType14, 97);
        java.lang.Class<?> wildcardClass18 = period17.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) -1);
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
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) -1, periodType16, chronology17);
        org.joda.time.Period period19 = period3.minus((org.joda.time.ReadablePeriod) period18);
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
        org.joda.time.Period period44 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType41);
        org.joda.time.Period period45 = new org.joda.time.Period((long) (byte) 10, periodType41);
        org.joda.time.Period period46 = period18.withPeriodType(periodType41);
        org.joda.time.Period period47 = new org.joda.time.Period((long) 0, (long) 1, periodType41);
        org.joda.time.PeriodType periodType48 = period47.getPeriodType();
        org.joda.time.Period period50 = period47.plusMinutes(8);
        org.joda.time.Period period51 = period47.normalizedStandard();
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period5 = period4.toPeriod();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableInstant6, readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration10 = period8.toDurationFrom(readableInstant9);
        org.joda.time.Period period12 = period8.plusMonths(0);
        org.joda.time.Period period14 = period12.plusMonths((int) '#');
        org.joda.time.Period period16 = period12.plusMinutes((int) (short) 100);
        org.joda.time.Period period18 = period16.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) period16, periodType19);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = period20.normalizedStandard(periodType21);
        org.joda.time.Days days23 = period22.toStandardDays();
        int int24 = period22.getMonths();
        org.joda.time.Period period26 = period22.plusMillis(98);
        org.joda.time.Period period28 = period26.withDays((int) (short) 10);
        org.joda.time.Period period30 = period28.plusMillis((int) (byte) 1);
        org.joda.time.Period period31 = period5.withFields((org.joda.time.ReadablePeriod) period30);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
        org.joda.time.Period period33 = period31.withYears((-100));
        org.joda.time.DurationFieldType[] durationFieldTypeArray34 = period31.getFieldTypes();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(durationFieldTypeArray34);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
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
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration18, readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableInstant26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant29, readableInstant30, periodType31);
        org.joda.time.MutablePeriod mutablePeriod33 = period32.toMutablePeriod();
        org.joda.time.Period period34 = period28.plus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant35, readableInstant36, periodType37);
        org.joda.time.Period period40 = period38.plusMonths((int) '4');
        org.joda.time.Period period41 = period32.withFields((org.joda.time.ReadablePeriod) period40);
        org.joda.time.PeriodType periodType42 = period40.getPeriodType();
        org.joda.time.Period period43 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType42);
        org.joda.time.Period period44 = new org.joda.time.Period((long) 0, periodType42);
        org.joda.time.Period period45 = new org.joda.time.Period((long) (short) 100, periodType42);
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration18, readableInstant21, periodType42);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
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
        org.joda.time.Period period75 = new org.joda.time.Period(readableInstant48, readableInstant49, periodType69);
        org.joda.time.Period period76 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration18, readableInstant47, periodType69);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period77 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(periodType69);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (-31), (long) (-10), chronology2);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        org.joda.time.Period period33 = period31.plusWeeks(197);
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
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 'a', (long) 98);
        org.joda.time.Period period4 = period2.withYears((-3));
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
        org.joda.time.Period period77 = period75.withHours((-1));
        org.joda.time.Period period79 = period77.minusHours((int) (short) 1);
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
        org.junit.Assert.assertNotNull(period79);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        org.joda.time.Period period7 = period5.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = period7.withWeeks((int) (short) -1);
        int int10 = period7.size();
        org.joda.time.Period period12 = period7.withMonths((int) (byte) 10);
        int int13 = period12.getMinutes();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        org.joda.time.Period period12 = period10.minusMillis((int) '#');
        org.joda.time.Period period14 = period12.minusMillis((int) (short) 1);
        org.joda.time.MutablePeriod mutablePeriod15 = period14.toMutablePeriod();
        org.joda.time.Period period17 = period14.withMillis(0);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.joda.time.Period period8 = new org.joda.time.Period(8, (int) (short) 100, 10, 8, (int) 'a', (int) (short) 100, (int) ' ', 0);
        org.joda.time.Period period10 = period8.plusDays(32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.Period period7 = period5.plusDays((int) (short) 100);
        int int8 = period5.getMonths();
        org.joda.time.Period period10 = period5.withDays((int) '4');
        org.joda.time.Period period12 = period5.withSeconds((-100));
        org.joda.time.Period period14 = period12.multipliedBy(1);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology17);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) str19);
        org.joda.time.Period period22 = period20.plusSeconds((int) 'a');
        org.joda.time.Period period24 = period20.plusYears((int) (byte) 0);
        org.joda.time.Period period26 = period20.withMonths(0);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((long) 'a', periodType28, chronology29);
        org.joda.time.Period period32 = period30.withMinutes(0);
        org.joda.time.Period period34 = period32.minusSeconds((int) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod35 = period32.toMutablePeriod();
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
        int int71 = mutablePeriod35.indexOf(durationFieldType66);
        int int72 = period26.get(durationFieldType66);
        org.joda.time.Period period74 = period12.withFieldAdded(durationFieldType66, (int) '#');
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0.011S" + "'", str19, "PT0.011S");
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(mutablePeriod35);
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
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(period74);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
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
        org.joda.time.Period period95 = period78.negated();
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
        org.junit.Assert.assertNotNull(period95);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 0, 97, 98, 10, 100, 11, (int) (byte) 1, 1, periodType8);
        org.joda.time.Period period11 = period9.minusMonths(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days12 = period9.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period2.plusMinutes((int) ' ');
        org.joda.time.Period period6 = period5.normalizedStandard();
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period7.toString(periodFormatter8);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant20, readableInstant21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = period22.toDurationFrom(readableInstant23);
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
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant19, (org.joda.time.ReadableDuration) duration24, periodType37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) (short) 100, periodType37, chronology41);
        org.joda.time.Period period43 = new org.joda.time.Period(0, (int) 'a', (int) ' ', (int) (short) 100, (int) (byte) 0, (int) (byte) 10, 10, (int) (short) -1, periodType37);
        org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) str9, periodType37);
        org.joda.time.Period period46 = period44.minusWeeks(100);
        org.joda.time.Period period48 = period46.withWeeks((int) (short) 100);
        org.joda.time.Period period50 = period46.withMinutes((-100));
        int int51 = period46.getMinutes();
        org.joda.time.Period period53 = period46.minusHours((int) (short) 1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT32M" + "'", str9, "PT32M");
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 32 + "'", int51 == 32);
        org.junit.Assert.assertNotNull(period53);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        org.joda.time.Period period17 = new org.joda.time.Period((long) 100);
        org.joda.time.Period period20 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period22 = period20.minusYears(100);
        org.joda.time.Period period23 = period22.negated();
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
        org.joda.time.Period period38 = period22.withField(durationFieldType35, 10);
        boolean boolean39 = period17.isSupported(durationFieldType35);
        int int40 = period15.get(durationFieldType35);
        org.joda.time.Period period42 = period15.plusMonths((int) ' ');
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) '4', (-1L), periodType45, chronology46);
        org.joda.time.Period period49 = period47.minusSeconds((int) '#');
        org.joda.time.Period period50 = period15.withFields((org.joda.time.ReadablePeriod) period47);
        int int51 = period15.getDays();
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 0);
        org.joda.time.Period period3 = period1.withMillis(3);
        org.joda.time.format.PeriodFormatter periodFormatter4 = null;
        java.lang.String str5 = period3.toString(periodFormatter4);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0.003S" + "'", str5, "PT0.003S");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        org.joda.time.Seconds seconds13 = period6.toStandardSeconds();
        org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) period6);
        org.joda.time.Period period16 = period14.withMinutes((int) '#');
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', periodType18, chronology19);
        org.joda.time.Period period22 = period20.withMinutes(0);
        org.joda.time.Period period24 = period22.minusSeconds((int) (short) 100);
        org.joda.time.Period period26 = period24.minusMinutes(100);
        org.joda.time.Period period28 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period30 = period28.plusMillis((int) 'a');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant31, readableInstant32, periodType33);
        org.joda.time.Period period36 = period34.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableInstant37, readableInstant38, periodType39);
        org.joda.time.DurationFieldType durationFieldType42 = period40.getFieldType((int) (byte) 0);
        int int43 = period36.indexOf(durationFieldType42);
        org.joda.time.Period period45 = period28.withFieldAdded(durationFieldType42, 1);
        org.joda.time.Period period46 = period45.negated();
        org.joda.time.Period period47 = period26.plus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.Period period49 = period26.minusSeconds((int) '#');
        org.joda.time.Period period51 = period49.minusMillis((-1));
        int int52 = period49.getMinutes();
        org.joda.time.Period period53 = period16.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.Seconds seconds54 = period49.toStandardSeconds();
        int int55 = period49.getMillis();
        org.joda.time.Period period57 = period49.withYears((int) (byte) 100);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-100) + "'", int52 == (-100));
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(seconds54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
        org.junit.Assert.assertNotNull(period57);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        org.joda.time.Hours hours10 = period7.toStandardHours();
        org.joda.time.Period period11 = period7.normalizedStandard();
        org.joda.time.Period period13 = period11.withMinutes(100);
        org.joda.time.Duration duration14 = period11.toStandardDuration();
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration14);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) 'a', periodType17, chronology18);
        org.joda.time.Period period21 = period19.withMinutes(0);
        org.joda.time.Period period23 = period21.minusSeconds((int) (short) 100);
        org.joda.time.Hours hours24 = period23.toStandardHours();
        org.joda.time.Period period29 = new org.joda.time.Period(97, (int) (short) 0, 100, (int) (short) 100);
        org.joda.time.Period period31 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((long) 'a', periodType33, chronology34);
        org.joda.time.Hours hours36 = period35.toStandardHours();
        org.joda.time.Period period38 = period35.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.DurationFieldType durationFieldType44 = period42.getFieldType((int) (byte) 0);
        org.joda.time.Period period46 = period35.withField(durationFieldType44, 1);
        boolean boolean47 = period31.equals((java.lang.Object) 1);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant48, readableInstant49, periodType50);
        org.joda.time.Period period53 = period51.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant54, readableInstant55, periodType56);
        org.joda.time.DurationFieldType durationFieldType59 = period57.getFieldType((int) (byte) 0);
        int int60 = period53.indexOf(durationFieldType59);
        org.joda.time.Period period62 = period31.withFieldAdded(durationFieldType59, (int) (short) 0);
        int int63 = period29.get(durationFieldType59);
        org.joda.time.Period period65 = period23.withField(durationFieldType59, (int) (short) 100);
        org.joda.time.Period period67 = period15.withFieldAdded(durationFieldType59, 0);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(hours24);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(hours36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(10L, (long) (short) 0, periodType3, chronology4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period5.toDurationFrom(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration7, readableInstant8);
        org.joda.time.Period period10 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration7);
        org.joda.time.Period period13 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period15 = period13.plusMillis((int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        org.joda.time.Period period18 = period15.plusHours((int) (short) 10);
        org.joda.time.Seconds seconds19 = period18.toStandardSeconds();
        org.joda.time.Period period21 = period18.minusDays((int) '#');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.Period period28 = period24.plusMonths(0);
        org.joda.time.Period period30 = period28.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period28.toDurationFrom(readableInstant31);
        org.joda.time.Period period34 = period28.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant35, readableInstant36, periodType37);
        org.joda.time.Period period40 = period38.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, readableInstant42, periodType43);
        org.joda.time.Period period46 = period44.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.DurationFieldType durationFieldType52 = period50.getFieldType((int) (byte) 0);
        int int53 = period46.indexOf(durationFieldType52);
        int int54 = period38.get(durationFieldType52);
        org.joda.time.Period period56 = period28.withField(durationFieldType52, (int) (short) 0);
        boolean boolean57 = period21.isSupported(durationFieldType52);
        int int58 = period10.get(durationFieldType52);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.Period period3 = period1.plusMillis((int) 'a');
        org.joda.time.Period period4 = period3.normalizedStandard();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', periodType3, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = period5.get(durationFieldType6);
        org.joda.time.Period period8 = period1.withFields((org.joda.time.ReadablePeriod) period5);
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = period1.toString(periodFormatter9);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P-1M" + "'", str10, "P-1M");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P-100YT0.001S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = period5.normalizedStandard(periodType6);
        org.joda.time.PeriodType periodType8 = period5.getPeriodType();
        org.joda.time.Period period10 = period5.plusDays(17);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DurationFieldType durationFieldType5 = period3.getFieldType((int) (byte) 0);
        int int6 = period3.getWeeks();
        org.joda.time.Period period7 = period3.normalizedStandard();
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant1, readableInstant2);
        org.joda.time.Period period4 = period3.normalizedStandard();
        int int5 = period3.getMillis();
        org.joda.time.Period period7 = period3.withHours((int) (byte) 0);
        org.joda.time.Period period9 = period3.withMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period3.toDurationTo(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant12);
        org.joda.time.Period period15 = org.joda.time.Period.weeks((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) (short) 0, chronology20);
        org.joda.time.Period period23 = period21.minusMillis((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant24, readableInstant25);
        org.joda.time.Period period27 = period26.normalizedStandard();
        org.joda.time.Period period29 = period26.withWeeks(1);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 'a', periodType31, chronology32);
        org.joda.time.Period period35 = period33.withMinutes(0);
        org.joda.time.Period period36 = period26.minus((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Period period38 = period35.minusMillis((int) ' ');
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((long) 'a', periodType40, chronology41);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) 'a', periodType44, chronology45);
        org.joda.time.Hours hours47 = period46.toStandardHours();
        org.joda.time.Period period48 = period42.withFields((org.joda.time.ReadablePeriod) period46);
        org.joda.time.Period period50 = period42.withYears(10);
        org.joda.time.Period period51 = period50.toPeriod();
        org.joda.time.Period period53 = period50.plusMillis(1);
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
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period((long) (byte) 0, periodType73, chronology77);
        org.joda.time.Period period79 = period53.normalizedStandard(periodType73);
        org.joda.time.Period period80 = period35.normalizedStandard(periodType73);
        org.joda.time.Period period81 = period21.withPeriodType(periodType73);
        org.joda.time.Period period82 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration17, readableInstant18, periodType73);
        org.joda.time.Period period83 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration11, periodType73);
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.Period period85 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant84);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(hours47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period81);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
        org.joda.time.Period period58 = new org.joda.time.Period((long) 32, (long) (short) 0, periodType52, chronology57);
        org.joda.time.Period period59 = period29.withPeriodType(periodType52);
        int int60 = period59.getWeeks();
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.Period period5 = period3.withMinutes(0);
        int int6 = period3.getMillis();
        org.joda.time.Period period8 = period3.plusDays((-10));
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.Period period2 = period0.minusDays((int) (short) 0);
        org.joda.time.Period period4 = period0.plusWeeks((int) (byte) 10);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, (long) (-1), chronology2);
        org.joda.time.Period period5 = period3.withHours(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
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
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType26);
        org.joda.time.Period period31 = period3.minus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period33 = period31.minusHours((-3));
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Duration duration35 = period31.toDurationTo(readableInstant34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant47, readableInstant48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Duration duration51 = period49.toDurationFrom(readableInstant50);
        org.joda.time.Period period53 = period49.plusMonths(0);
        org.joda.time.Period period55 = period53.plusMonths((int) '#');
        org.joda.time.Period period57 = period53.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType58 = period53.getPeriodType();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((long) (short) -1, periodType58, chronology59);
        org.joda.time.Period period61 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType58);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period(0L, periodType58, chronology62);
        org.joda.time.Period period64 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration35, readableInstant36, periodType58);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(periodType58);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        int int5 = period3.getMillis();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration7 = period3.toDurationTo(readableInstant6);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
        org.joda.time.Period period87 = period67.minusMonths((int) (short) 100);
        org.joda.time.Period period89 = period67.withMinutes((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(period89);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        org.joda.time.Period period14 = period10.minusYears((-1));
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        org.joda.time.Period period94 = period92.multipliedBy((-3));
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
        org.junit.Assert.assertNotNull(period94);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        org.joda.time.Period period14 = period12.withMonths(0);
        org.joda.time.Period period16 = period14.minusHours(97);
        org.joda.time.Period period18 = period14.minusHours(100);
        int int19 = period18.getMinutes();
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((-3));
        org.joda.time.Period period3 = period1.minusHours(0);
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.joda.time.Period period4 = new org.joda.time.Period(32, (int) (byte) 0, (int) (byte) -1, 10);
        org.joda.time.format.PeriodFormatter periodFormatter5 = null;
        java.lang.String str6 = period4.toString(periodFormatter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT32H0.990S" + "'", str6, "PT32H0.990S");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period2 = org.joda.time.Period.years((-3));
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration4);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.hours((int) (byte) 1);
        org.joda.time.Period period5 = period3.withDays(1);
        org.joda.time.Period period6 = period3.normalizedStandard();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(100L, chronology8);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 'a', periodType11, chronology12);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 'a', periodType15, chronology16);
        org.joda.time.Hours hours18 = period17.toStandardHours();
        org.joda.time.Period period19 = period13.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period21 = period13.withYears(10);
        org.joda.time.Period period22 = period9.plus((org.joda.time.ReadablePeriod) period13);
        int int23 = period9.getMonths();
        org.joda.time.Period period25 = period9.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period29.plusMonths(0);
        org.joda.time.Period period35 = period33.plusMonths((int) '#');
        org.joda.time.Period period37 = period33.plusMinutes((int) (short) 100);
        org.joda.time.Period period39 = period37.withWeeks((int) ' ');
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((java.lang.Object) period37, periodType40);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.Duration duration43 = period37.toDurationTo(readableInstant42);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant46, readableInstant47, periodType48);
        org.joda.time.Period period51 = period49.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Duration duration53 = period49.toDurationTo(readableInstant52);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration53, readableInstant54);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.ReadableInstant readableInstant61 = null;
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
        org.joda.time.Period period84 = new org.joda.time.Period(readableInstant60, readableInstant61, periodType80);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.Period period86 = new org.joda.time.Period((long) (-100), (long) (-100), periodType80, chronology85);
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.Period period88 = new org.joda.time.Period((long) 0, (long) 100, periodType80, chronology87);
        org.joda.time.Period period89 = period55.withPeriodType(periodType80);
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.Period period91 = new org.joda.time.Period((long) (byte) 10, (long) '4', periodType80, chronology90);
        org.joda.time.Period period92 = new org.joda.time.Period(readableInstant26, (org.joda.time.ReadableDuration) duration43, periodType80);
        org.joda.time.Period period93 = period25.withPeriodType(periodType80);
        org.joda.time.Period period94 = period3.withPeriodType(periodType80);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period95 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(hours18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertNotNull(period94);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology3);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = new org.joda.time.Period((java.lang.Object) str5);
        org.joda.time.Period period7 = period6.normalizedStandard();
        org.joda.time.PeriodType periodType8 = period7.getPeriodType();
        int int9 = period7.getDays();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period7.toDurationFrom(readableInstant10);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 'a', periodType14, chronology15);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 'a', periodType18, chronology19);
        org.joda.time.Hours hours21 = period20.toStandardHours();
        org.joda.time.Period period22 = period16.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period24 = period16.withYears(10);
        org.joda.time.Period period25 = period24.toPeriod();
        org.joda.time.Period period27 = period24.plusMillis(1);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableInstant30, readableInstant31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Duration duration34 = period32.toDurationFrom(readableInstant33);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant36, readableInstant37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        org.joda.time.Period period42 = period38.plusMonths(0);
        org.joda.time.Period period44 = period42.plusMonths((int) '#');
        org.joda.time.Period period46 = period42.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType47 = period42.getPeriodType();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) (short) -1, periodType47, chronology48);
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant29, (org.joda.time.ReadableDuration) duration34, periodType47);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) (byte) 0, periodType47, chronology51);
        org.joda.time.Period period53 = period27.normalizedStandard(periodType47);
        org.joda.time.Period period55 = period53.withMillis((int) (byte) 10);
        org.joda.time.PeriodType periodType56 = period53.getPeriodType();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((long) (-1), periodType56, chronology57);
        org.joda.time.Period period59 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration11, periodType56);
        int int60 = period59.getSeconds();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0.011S" + "'", str5, "PT0.011S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(hours21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) 0);
        int int2 = period1.getMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '4', (-1L), periodType2, chronology3);
        org.joda.time.Period period6 = period4.minusSeconds((int) '#');
        org.joda.time.Period period8 = period4.withMonths((int) (byte) -1);
        org.joda.time.Period period10 = period4.minusSeconds((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = period10.getClass();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.Period period16 = period15.normalizedStandard();
        org.joda.time.Period period18 = period15.withWeeks(1);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 'a', periodType20, chronology21);
        org.joda.time.Period period24 = period22.withMinutes(0);
        org.joda.time.Period period25 = period15.minus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.DurationFieldType[] durationFieldTypeArray26 = period15.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableInstant28);
        org.joda.time.Period period30 = period29.normalizedStandard();
        org.joda.time.Period period32 = period29.withWeeks(1);
        int int33 = period32.getWeeks();
        org.joda.time.Period period34 = period15.minus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationTo(readableInstant35);
        org.joda.time.Period period39 = new org.joda.time.Period((long) (byte) -1);
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
        org.joda.time.Period period55 = period39.minus((org.joda.time.ReadablePeriod) period54);
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant66, readableInstant67);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Duration duration70 = period68.toDurationFrom(readableInstant69);
        org.joda.time.Period period72 = period68.plusMonths(0);
        org.joda.time.Period period74 = period72.plusMonths((int) '#');
        org.joda.time.Period period76 = period72.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType77 = period72.getPeriodType();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period((long) (short) -1, periodType77, chronology78);
        org.joda.time.Period period80 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType77);
        org.joda.time.Period period81 = new org.joda.time.Period((long) (byte) 10, periodType77);
        org.joda.time.Period period82 = period54.withPeriodType(periodType77);
        org.joda.time.Period period83 = new org.joda.time.Period((long) 11, periodType77);
        org.joda.time.Period period84 = new org.joda.time.Period((java.lang.Object) readableInstant35, periodType77);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.Period period86 = new org.joda.time.Period((long) (byte) 0, periodType77, chronology85);
        org.joda.time.Period period87 = new org.joda.time.Period((java.lang.Object) period10, periodType77);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(durationFieldTypeArray26);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(periodType77);
        org.junit.Assert.assertNotNull(period82);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(0L, (long) (short) -1, chronology2);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 'a', periodType1, chronology2);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 'a', periodType5, chronology6);
        org.joda.time.Hours hours8 = period7.toStandardHours();
        org.joda.time.Period period9 = period3.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period3.minusSeconds(8);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        java.lang.String str65 = period20.toString();
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PT97.011S" + "'", str65, "PT97.011S");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.joda.time.Period period4 = new org.joda.time.Period(10, (int) (short) -1, (int) 'a', 0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        java.lang.String str6 = period4.toString();
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT10H-1M97S" + "'", str6, "PT10H-1M97S");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
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
        int int16 = period15.getYears();
        int int17 = period15.getMillis();
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
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
        int int15 = period10.getHours();
        org.joda.time.Weeks weeks16 = period10.toStandardWeeks();
        org.joda.time.Period period18 = period10.plusHours(8);
        int int19 = period10.getSeconds();
        int int20 = period10.getYears();
        org.joda.time.Duration duration21 = period10.toStandardDuration();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(duration21);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 0, 97, 97, (-1), 197, (int) 'a', 8, (int) 'a');
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        int int4 = period2.getMillis();
        org.joda.time.Period period6 = period2.withHours((int) (byte) 0);
        org.joda.time.Period period8 = period2.withMonths((int) '4');
        org.joda.time.Period period10 = period8.plusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        int int12 = period10.indexOf(durationFieldType11);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableInstant3);
        org.joda.time.Period period5 = period4.normalizedStandard();
        org.joda.time.Period period7 = period5.withMinutes((-1));
        org.joda.time.Period period9 = period7.plusDays((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration11, periodType12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration11);
        org.joda.time.Period period16 = period14.multipliedBy(197);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        org.joda.time.Period period19 = period14.plusDays(1);
        org.joda.time.Hours hours20 = period19.toStandardHours();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(hours20);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 10);
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
        int int43 = period42.getDays();
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) 'a', periodType45, chronology46);
        org.joda.time.Period period49 = period47.withMinutes(0);
        int int50 = period49.getWeeks();
        int int51 = period49.getSeconds();
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableInstant52, readableInstant53, periodType54);
        org.joda.time.Period period57 = period55.minusMillis((int) '4');
        int int58 = period57.getSeconds();
        org.joda.time.Period period60 = period57.withHours(100);
        int int61 = period57.getDays();
        org.joda.time.Period period62 = period49.plus((org.joda.time.ReadablePeriod) period57);
        org.joda.time.Period period65 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period67 = period65.minusYears(100);
        org.joda.time.Period period68 = period67.negated();
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = new org.joda.time.Period(readableInstant69, readableInstant70, periodType71);
        org.joda.time.Period period74 = period72.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period(readableInstant75, readableInstant76, periodType77);
        org.joda.time.DurationFieldType durationFieldType80 = period78.getFieldType((int) (byte) 0);
        int int81 = period74.indexOf(durationFieldType80);
        org.joda.time.Period period83 = period67.withField(durationFieldType80, 10);
        int int84 = period62.indexOf(durationFieldType80);
        org.joda.time.Period period86 = period42.withField(durationFieldType80, (int) (short) -1);
        org.joda.time.Period period88 = period1.withFieldAdded(durationFieldType80, (-10));
        org.joda.time.Period period90 = period1.plusMinutes(8);
        org.joda.time.Period period92 = period90.withHours((int) 'a');
        org.junit.Assert.assertNotNull(period1);
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(durationFieldType80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertNotNull(period90);
        org.junit.Assert.assertNotNull(period92);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
        org.joda.time.Period period67 = period56.withMonths((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(period67);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.joda.time.Period period4 = new org.joda.time.Period((int) ' ', 8, (int) (short) 1, (int) '4');
        org.joda.time.Period period6 = org.joda.time.Period.millis((int) (short) -1);
        org.joda.time.Period period7 = period4.withFields((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Seconds seconds8 = period4.toStandardSeconds();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(seconds8);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (-1), chronology1);
        int int3 = period2.getMonths();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType6);
        org.joda.time.Period period9 = period7.plusMonths((int) '4');
        org.joda.time.Period period11 = org.joda.time.Period.millis(1);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 'a', periodType13, chronology14);
        org.joda.time.Hours hours16 = period15.toStandardHours();
        org.joda.time.Period period18 = period15.plusSeconds((int) (byte) 1);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableInstant19, readableInstant20, periodType21);
        org.joda.time.DurationFieldType durationFieldType24 = period22.getFieldType((int) (byte) 0);
        org.joda.time.Period period26 = period15.withField(durationFieldType24, 1);
        boolean boolean27 = period11.equals((java.lang.Object) 1);
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
        org.joda.time.Period period42 = period11.withFieldAdded(durationFieldType39, (int) (short) 0);
        org.joda.time.Period period44 = period7.withFieldAdded(durationFieldType39, (int) '#');
        int int45 = period44.getMillis();
        org.joda.time.Period period46 = new org.joda.time.Period();
        org.joda.time.DurationFieldType durationFieldType48 = period46.getFieldType(1);
        int int49 = period44.get(durationFieldType48);
        int int50 = period2.get(durationFieldType48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.Period period19 = period15.plusMonths(0);
        org.joda.time.Period period21 = period15.plusWeeks((int) ' ');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableInstant23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationFrom(readableInstant25);
        org.joda.time.Period period28 = period24.plusMonths(0);
        org.joda.time.Period period30 = period28.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = period28.toDurationFrom(readableInstant31);
        org.joda.time.Period period34 = period28.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant35, readableInstant36, periodType37);
        org.joda.time.Period period40 = period38.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableInstant41, readableInstant42, periodType43);
        org.joda.time.Period period46 = period44.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableInstant47, readableInstant48, periodType49);
        org.joda.time.DurationFieldType durationFieldType52 = period50.getFieldType((int) (byte) 0);
        int int53 = period46.indexOf(durationFieldType52);
        int int54 = period38.get(durationFieldType52);
        org.joda.time.Period period56 = period28.withField(durationFieldType52, (int) (short) 0);
        int int57 = period21.indexOf(durationFieldType52);
        org.joda.time.Period period59 = period11.withField(durationFieldType52, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = period59.toDurationFrom(readableInstant60);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.Period period63 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration61, readableInstant62);
        org.joda.time.Period period65 = period63.minusSeconds(17);
        int int66 = period65.getDays();
        org.joda.time.Duration duration67 = period65.toStandardDuration();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(duration67);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 98, (long) (byte) 1, chronology2);
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
        org.joda.time.Period period28 = new org.joda.time.Period(0, 1, (int) (short) 100, (-1), (int) (short) 10, 100, (int) ' ', (int) (short) 1, periodType25);
        org.joda.time.Period period29 = new org.joda.time.Period((long) (byte) 10, periodType25);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((java.lang.Object) period29, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant32, readableInstant33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = period34.toDurationFrom(readableInstant35);
        org.joda.time.Period period38 = period34.plusMonths(0);
        int int39 = period34.getWeeks();
        int int40 = period34.size();
        org.joda.time.Period period42 = period34.minusDays((int) (byte) -1);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((long) (short) 10, (long) (short) -1, chronology45);
        java.lang.String str47 = period46.toString();
        org.joda.time.Period period48 = new org.joda.time.Period((java.lang.Object) str47);
        org.joda.time.Period period50 = period48.plusSeconds((int) 'a');
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
        org.joda.time.Period period76 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType71, chronology75);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.Period period80 = new org.joda.time.Period((long) 100, (long) (-1), chronology79);
        org.joda.time.Period period82 = period80.plusMinutes((int) (short) 10);
        org.joda.time.Period period84 = period82.plusMinutes((-1));
        int int85 = period84.getWeeks();
        org.joda.time.Period period87 = period84.withMinutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType89 = period87.getFieldType(0);
        org.joda.time.Period period91 = period76.withFieldAdded(durationFieldType89, (int) (short) 100);
        org.joda.time.Period period93 = period50.withFieldAdded(durationFieldType89, 52);
        int int94 = period34.indexOf(durationFieldType89);
        org.joda.time.Period period96 = period31.withField(durationFieldType89, (int) (byte) 0);
        org.joda.time.Period period98 = period3.withFieldAdded(durationFieldType89, (-100));
        int int99 = period3.getYears();
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PT0.011S" + "'", str47, "PT0.011S");
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(durationFieldType89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(period96);
        org.junit.Assert.assertNotNull(period98);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
        org.joda.time.Period period14 = period12.plusYears((int) (short) -1);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period2.plusMonths(0);
        int int7 = period2.getWeeks();
        int int8 = period2.size();
        org.joda.time.Period period10 = period2.minusDays((int) (byte) -1);
        org.joda.time.Period period12 = period2.withMonths(8);
        org.joda.time.Period period14 = period2.withMillis((int) (byte) 0);
        org.joda.time.Weeks weeks15 = period14.toStandardWeeks();
        org.joda.time.Period period17 = period14.minusMillis((int) (short) 100);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.Period period30 = period28.withFields(readablePeriod29);
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
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.joda.time.Period period11 = org.joda.time.Period.millis((int) (short) -1);
        org.joda.time.PeriodType periodType12 = period11.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period((int) (short) 1, (int) (byte) 0, (int) (short) 1, 10, 10, 32, (int) (short) 1, (int) (short) 100, periodType12);
        org.joda.time.Period period14 = new org.joda.time.Period((long) 32, (long) (-3), periodType12);
        java.lang.Class<?> wildcardClass15 = periodType12.getClass();
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) 1);
        org.joda.time.Hours hours2 = period1.toStandardHours();
        org.joda.time.Period period4 = period1.withMonths((-10));
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableInstant17, readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant23, readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = period25.toDurationFrom(readableInstant26);
        org.joda.time.Period period29 = period25.plusMonths(0);
        org.joda.time.Period period31 = period29.plusMonths((int) '#');
        org.joda.time.Period period33 = period29.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType34 = period29.getPeriodType();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) (short) -1, periodType34, chronology35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant16, (org.joda.time.ReadableDuration) duration21, periodType34);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) (byte) 0, periodType34, chronology38);
        org.joda.time.Period period40 = period14.normalizedStandard(periodType34);
        int[] intArray41 = period40.getValues();
        int int42 = period40.size();
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period40.toDurationTo(readableInstant43);
        org.joda.time.Period period46 = period40.withMinutes((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod47 = period46.toMutablePeriod();
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[10, 0, 0, 0, 0, 0, 0, 98]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(mutablePeriod47);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.joda.time.Period period2 = new org.joda.time.Period(0L, (-1L));
        org.joda.time.Period period4 = period2.minusYears(100);
        int int5 = period4.getWeeks();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) 97, chronology7);
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
        org.joda.time.Period period35 = period8.withPeriodType(periodType31);
        org.joda.time.Period period36 = period4.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period38 = period4.minusHours((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes39 = period4.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) (byte) 1, (long) 52, chronology5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant7, readableInstant8);
        org.joda.time.Period period10 = period9.normalizedStandard();
        int int11 = period9.getMillis();
        org.joda.time.Period period13 = period9.withHours((int) (byte) 0);
        org.joda.time.Period period15 = period9.withMonths((int) '4');
        org.joda.time.Period period17 = period15.plusSeconds((int) (byte) 10);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 100, (long) (-1), chronology20);
        org.joda.time.Period period23 = period21.plusMinutes((int) (short) 10);
        org.joda.time.Period period25 = period23.plusMinutes((-1));
        int int26 = period25.getWeeks();
        org.joda.time.Period period28 = period25.withMinutes((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant29, readableInstant30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period31.toDurationFrom(readableInstant32);
        org.joda.time.Period period35 = period31.plusMonths(0);
        org.joda.time.Period period37 = period35.plusMonths((int) '#');
        org.joda.time.Period period39 = period35.plusMinutes((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant40, readableInstant41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = period42.toDurationFrom(readableInstant43);
        org.joda.time.Period period46 = period42.plusMonths(0);
        org.joda.time.Period period48 = period46.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = period46.toDurationFrom(readableInstant49);
        org.joda.time.Period period52 = period46.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period(readableInstant53, readableInstant54, periodType55);
        org.joda.time.Period period58 = period56.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableInstant59, readableInstant60, periodType61);
        org.joda.time.Period period64 = period62.plusMonths((int) '4');
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period(readableInstant65, readableInstant66, periodType67);
        org.joda.time.DurationFieldType durationFieldType70 = period68.getFieldType((int) (byte) 0);
        int int71 = period64.indexOf(durationFieldType70);
        int int72 = period56.get(durationFieldType70);
        org.joda.time.Period period74 = period46.withField(durationFieldType70, (int) (short) 0);
        boolean boolean75 = period39.isSupported(durationFieldType70);
        org.joda.time.Period period77 = period28.withField(durationFieldType70, (int) ' ');
        org.joda.time.Period period79 = period15.withField(durationFieldType70, (-1));
        int int80 = period6.indexOf(durationFieldType70);
        int int81 = period2.indexOf(durationFieldType70);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(durationFieldType70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.joda.time.Period period4 = new org.joda.time.Period((-3), (int) (byte) -1, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = period4.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableInstant13, readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationFrom(readableInstant16);
        org.joda.time.Period period19 = period15.plusMonths(0);
        org.joda.time.Period period21 = period19.plusMonths((int) '#');
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Duration duration23 = period19.toDurationFrom(readableInstant22);
        org.joda.time.Period period25 = period19.minusMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant26, readableInstant27, periodType28);
        org.joda.time.Period period31 = period29.plusMonths((int) '4');
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
        int int45 = period29.get(durationFieldType43);
        org.joda.time.Period period47 = period19.withField(durationFieldType43, (int) (short) 0);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(100L, (long) ' ', chronology50);
        org.joda.time.Period period53 = period51.plusHours(1);
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
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.Period period78 = new org.joda.time.Period((long) (byte) 0, periodType73, chronology77);
        org.joda.time.Period period79 = period53.withPeriodType(periodType73);
        org.joda.time.Period period80 = period19.withPeriodType(periodType73);
        org.joda.time.Period period81 = new org.joda.time.Period((int) '#', (int) ' ', 0, (int) (short) -1, 100, (int) (byte) 100, (int) (byte) 0, 97, periodType73);
        org.joda.time.Period period82 = new org.joda.time.Period((long) (byte) -1, periodType73);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.Period period84 = new org.joda.time.Period(0L, (long) (byte) -1, periodType73, chronology83);
        org.joda.time.Period period85 = new org.joda.time.Period((long) (-31), (long) (short) 100, periodType73);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(periodType73);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(period80);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
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
        org.joda.time.PeriodType periodType20 = period18.getPeriodType();
        org.joda.time.Period period21 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType20);
        org.joda.time.Period period22 = new org.joda.time.Period((long) (-100), (long) (short) 10, periodType20);
        org.joda.time.Period period24 = period22.withYears((int) (byte) 0);
        org.joda.time.Hours hours25 = period22.toStandardHours();
        org.joda.time.Period period27 = period22.withSeconds((-101));
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(period27);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period3 = period2.normalizedStandard();
        org.joda.time.Period period5 = period3.withMinutes((-1));
        org.joda.time.Period period7 = period5.plusDays((int) (short) 100);
        int int8 = period7.getWeeks();
        org.joda.time.Period period9 = period7.normalizedStandard();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
        org.joda.time.Period period32 = period9.withDays((int) (byte) 0);
        org.joda.time.Period period34 = period9.withMillis(1);
        org.joda.time.Period period35 = new org.joda.time.Period((java.lang.Object) period9);
        int int36 = period9.getMinutes();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-100) + "'", int36 == (-100));
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.joda.time.Period period4 = new org.joda.time.Period(100, 0, 52, 1);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) '4', periodType2, chronology3);
        int int5 = period4.getWeeks();
        org.joda.time.PeriodType periodType6 = period4.getPeriodType();
        int int7 = period4.getHours();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant6, readableInstant7, periodType8);
        org.joda.time.MutablePeriod mutablePeriod10 = period9.toMutablePeriod();
        org.joda.time.Period period11 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period9.withMonths((int) (byte) 0);
        org.joda.time.Period period15 = period13.minusSeconds((-1));
        org.joda.time.Period period17 = period15.minusHours((-1));
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant21, readableInstant22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = period23.toDurationFrom(readableInstant24);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationFrom(readableInstant30);
        org.joda.time.Period period33 = period29.plusMonths(0);
        org.joda.time.Period period35 = period33.plusMonths((int) '#');
        org.joda.time.Period period37 = period33.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType38 = period33.getPeriodType();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) (short) -1, periodType38, chronology39);
        org.joda.time.Period period41 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration25, periodType38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType38, chronology42);
        org.joda.time.Period period44 = period15.withPeriodType(periodType38);
        org.joda.time.Duration duration45 = period44.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Duration duration47 = period44.toDurationTo(readableInstant46);
        org.joda.time.Period period49 = org.joda.time.Period.years((int) (byte) 1);
        org.joda.time.PeriodType periodType50 = period49.getPeriodType();
        org.joda.time.Period period51 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration47, periodType50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) 97, (long) 52, periodType50, chronology52);
        org.joda.time.MutablePeriod mutablePeriod54 = period53.toMutablePeriod();
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(mutablePeriod54);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        org.joda.time.MutablePeriod mutablePeriod4 = period3.toMutablePeriod();
        org.joda.time.Period period6 = period3.minusMinutes((int) (byte) 100);
        org.joda.time.Minutes minutes7 = period3.toStandardMinutes();
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) period3);
        org.joda.time.Period period10 = org.joda.time.Period.weeks((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period10.toDurationFrom(readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
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
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) 1, (long) 1, periodType29, chronology30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 'a', periodType29, chronology32);
        org.joda.time.Period period34 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType29);
        org.joda.time.Period period35 = period10.withPeriodType(periodType29);
        org.joda.time.Period period36 = period3.normalizedStandard(periodType29);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period36);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(3104);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant5, readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant11, readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = period13.toDurationFrom(readableInstant14);
        org.joda.time.Period period17 = period13.plusMonths(0);
        org.joda.time.Period period19 = period17.plusMonths((int) '#');
        org.joda.time.Period period21 = period17.plusMinutes((int) (short) 100);
        org.joda.time.PeriodType periodType22 = period17.getPeriodType();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) (short) -1, periodType22, chronology23);
        org.joda.time.Period period25 = new org.joda.time.Period(readableInstant4, (org.joda.time.ReadableDuration) duration9, periodType22);
        org.joda.time.Period period26 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType22);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) 32, (long) (short) 0, periodType22, chronology27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period28.toDurationFrom(readableInstant29);
        org.joda.time.Period period32 = period28.minusYears((int) (byte) 0);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(0L, chronology1);
        org.joda.time.Period period4 = period2.minusMillis((int) (short) 0);
        org.joda.time.Period period6 = period2.withDays(8);
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
        org.joda.time.Period period30 = new org.joda.time.Period((long) (-100), (long) (short) 10, periodType28);
        org.joda.time.Period period31 = new org.joda.time.Period(0L, periodType28);
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
        org.joda.time.Period period57 = new org.joda.time.Period((long) (byte) 10, (long) 10, periodType52, chronology56);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period((long) 100, (long) (-1), chronology60);
        org.joda.time.Period period63 = period61.plusMinutes((int) (short) 10);
        org.joda.time.Period period65 = period63.plusMinutes((-1));
        int int66 = period65.getWeeks();
        org.joda.time.Period period68 = period65.withMinutes((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType70 = period68.getFieldType(0);
        org.joda.time.Period period72 = period57.withFieldAdded(durationFieldType70, (int) (short) 100);
        int int73 = period31.get(durationFieldType70);
        int int74 = period2.get(durationFieldType70);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(durationFieldType70);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.joda.time.Period period1 = org.joda.time.Period.millis(1);
        org.joda.time.Period period3 = period1.withWeeks((int) (short) 0);
        org.joda.time.Period period5 = period1.plusHours((int) (short) 100);
        org.joda.time.Period period7 = period5.multipliedBy((int) (byte) 10);
        org.joda.time.Period period9 = period5.plusDays(52);
        org.joda.time.Period period10 = period5.normalizedStandard();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
    }
}

