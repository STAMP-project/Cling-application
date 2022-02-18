import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration16 = duration6.plus((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str19 = periodType18.getName();
        org.joda.time.Period period20 = duration6.toPeriodTo(readableInstant17, periodType18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = period20.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "YearMonthDay" + "'", str19, "YearMonthDay");
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.Weeks weeks4 = weeks0.dividedBy(8);
        java.lang.String str5 = weeks4.toString();
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeks((-10));
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeks(1);
        boolean boolean10 = weeks7.isGreaterThan(weeks9);
        org.joda.time.Weeks weeks11 = weeks4.minus(weeks7);
        boolean boolean13 = weeks11.equals((java.lang.Object) "P2147483647W");
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P268435455W" + "'", str5, "P268435455W");
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        org.joda.time.Period period1 = org.joda.time.Period.millis(3);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Period period4 = period1.minusMonths(100);
        org.joda.time.Period period6 = period4.minusYears((int) (short) 10);
        java.lang.String str7 = period4.toString();
        org.joda.time.Period period9 = period4.withMinutes((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = period4.getValue((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P-100M10D" + "'", str7, "P-100M10D");
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = days0.minus(8);
        java.lang.String str4 = days3.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P-3D" + "'", str4, "P-3D");
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        org.joda.time.Duration duration3 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.days();
        boolean boolean10 = periodType8.isSupported(durationFieldType9);
        org.joda.time.PeriodType periodType11 = periodType8.withMinutesRemoved();
        int int12 = periodType8.size();
        org.joda.time.Period period13 = duration3.toPeriodFrom(readableInstant4, periodType8);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (byte) -1, (long) 4, periodType8, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = period15.plusMillis((-36));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.Hours hours1 = org.joda.time.Hours.standardHoursIn(readablePeriod0);
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
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
        java.util.Locale locale23 = periodFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod25 = periodFormatter2.parseMutablePeriod("P100W");
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
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "YearMonthDay" + "'", str20, "YearMonthDay");
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertNull(locale23);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration11 = duration8.plus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration4.withDurationAdded((org.joda.time.ReadableDuration) duration11, (int) (byte) 0);
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration15 = seconds14.toStandardDuration();
        int int16 = duration13.compareTo((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period21 = new org.joda.time.Period((long) (byte) 1, (long) (-36), periodType20);
        org.joda.time.PeriodType periodType22 = periodType20.withMinutesRemoved();
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, readableInstant17, periodType20);
        org.joda.time.format.PeriodPrinter periodPrinter24 = null;
        org.joda.time.format.PeriodParser periodParser25 = null;
        org.joda.time.format.PeriodFormatter periodFormatter26 = new org.joda.time.format.PeriodFormatter(periodPrinter24, periodParser25);
        boolean boolean27 = periodFormatter26.isParser();
        java.util.Locale locale28 = null;
        org.joda.time.format.PeriodFormatter periodFormatter29 = periodFormatter26.withLocale(locale28);
        org.joda.time.PeriodType periodType30 = periodFormatter26.getParseType();
        boolean boolean31 = periodFormatter26.isParser();
        boolean boolean32 = periodFormatter26.isParser();
        org.joda.time.format.PeriodPrinter periodPrinter33 = periodFormatter26.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = period23.toString(periodFormatter26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(periodFormatter29);
        org.junit.Assert.assertNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(periodPrinter33);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        org.joda.time.Days days8 = duration1.toStandardDays();
        org.joda.time.Days days9 = org.joda.time.Days.MIN_VALUE;
        boolean boolean10 = days8.isLessThan(days9);
        org.joda.time.Period period11 = days9.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days13 = days9.multipliedBy((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 10");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        org.joda.time.Hours hours0 = org.joda.time.Hours.EIGHT;
        int int1 = hours0.getHours();
        org.joda.time.Hours hours2 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours3 = hours0.minus(hours2);
        org.joda.time.Hours hours4 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = hours4.getFieldType();
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period9 = period8.negated();
        int int10 = period8.getHours();
        org.joda.time.Period period12 = org.joda.time.Period.days(10);
        org.joda.time.Period period14 = period12.plusMonths((int) 'a');
        org.joda.time.Period period16 = period12.plusSeconds((int) (short) 100);
        org.joda.time.Period period18 = period16.minusMonths((int) 'a');
        org.joda.time.Period period19 = period8.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Hours hours20 = period8.toStandardHours();
        int int21 = hours20.getHours();
        org.joda.time.Hours hours22 = hours4.plus(hours20);
        org.joda.time.Hours hours23 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours25 = hours23.dividedBy(100);
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Period period32 = period30.minusSeconds(0);
        org.joda.time.Period period33 = period32.normalizedStandard();
        org.joda.time.Hours hours34 = period33.toStandardHours();
        boolean boolean35 = hours25.isLessThan(hours34);
        org.joda.time.Period period37 = org.joda.time.Period.millis((int) '#');
        int int38 = period37.getYears();
        org.joda.time.Hours hours39 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period41 = period37.multipliedBy((int) (byte) 0);
        org.joda.time.Hours hours42 = period41.toStandardHours();
        org.joda.time.Hours hours43 = hours25.minus(hours42);
        boolean boolean44 = hours20.isLessThan(hours42);
        org.joda.time.Hours hours45 = org.joda.time.Hours.ONE;
        java.lang.String str46 = hours45.toString();
        org.joda.time.Hours hours47 = hours45.negated();
        org.joda.time.Hours hours48 = hours42.plus(hours45);
        org.joda.time.Hours hours50 = hours42.dividedBy(8);
        org.joda.time.Hours hours51 = hours0.minus(hours50);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours25);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(hours34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(hours39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(hours42);
        org.junit.Assert.assertNotNull(hours43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(hours45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PT1H" + "'", str46, "PT1H");
        org.junit.Assert.assertNotNull(hours47);
        org.junit.Assert.assertNotNull(hours48);
        org.junit.Assert.assertNotNull(hours50);
        org.junit.Assert.assertNotNull(hours51);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("P-97M10DT100S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        java.util.Locale locale8 = null;
        org.joda.time.format.PeriodFormatter periodFormatter9 = periodFormatter7.withLocale(locale8);
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.weeks((-10));
        org.joda.time.Hours hours12 = weeks11.toStandardHours();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = periodFormatter7.print((org.joda.time.ReadablePeriod) hours12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(hours12);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
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
        org.joda.time.Days days22 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days24 = days22.multipliedBy((int) (short) 100);
        org.joda.time.Days days25 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType26 = days25.getPeriodType();
        org.joda.time.Days days28 = days25.minus(0);
        org.joda.time.Days days29 = days22.minus(days28);
        org.joda.time.Days days30 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days29);
        org.joda.time.Days days32 = days29.dividedBy(3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = periodFormatter20.print((org.joda.time.ReadablePeriod) days32);
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
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days32);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.MutablePeriod mutablePeriod5 = period2.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod6 = period2.toMutablePeriod();
        org.joda.time.Period period8 = period2.minusMinutes((int) 'a');
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Days days10 = org.joda.time.Days.daysIn(readableInterval9);
        org.joda.time.Period period11 = period2.minus((org.joda.time.ReadablePeriod) days10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) period2, chronology12);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Period period8 = period4.minusSeconds((int) (byte) 100);
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.days();
        boolean boolean14 = periodType12.isSupported(durationFieldType13);
        int int15 = period4.get(durationFieldType13);
        org.joda.time.Period period17 = period4.withHours(1);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearDay();
        boolean boolean19 = period17.equals((java.lang.Object) periodType18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType22 = periodType18.getFieldType(59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 59");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        boolean boolean4 = periodFormatter2.isParser();
        boolean boolean5 = periodFormatter2.isParser();
        org.joda.time.Period period7 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period8 = period7.toPeriod();
        org.joda.time.Period period10 = period7.withWeeks((-1));
        int int11 = period10.size();
        org.joda.time.Period period12 = period10.toPeriod();
        org.joda.time.Period period13 = period10.negated();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = periodFormatter2.print((org.joda.time.ReadablePeriod) period10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds5 = seconds3.plus(seconds4);
        org.joda.time.Seconds seconds7 = seconds4.plus((int) (byte) 0);
        org.joda.time.Seconds seconds9 = seconds7.minus((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.months();
        int int11 = seconds7.get(durationFieldType10);
        boolean boolean12 = period2.isSupported(durationFieldType10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DurationField durationField14 = durationFieldType10.getField(chronology13);
        java.lang.String str15 = durationFieldType10.toString();
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "months" + "'", str15, "months");
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes2 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P-1M");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.Period period8 = period6.minusWeeks(10);
        org.joda.time.Period period9 = period6.negated();
        org.joda.time.Period period11 = period6.minusMillis((int) (short) 0);
        org.joda.time.Period period13 = period6.minusWeeks(0);
        org.joda.time.Hours hours14 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours15 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours17 = hours15.dividedBy(100);
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Period period24 = period22.minusSeconds(0);
        org.joda.time.Period period25 = period24.normalizedStandard();
        org.joda.time.Hours hours26 = period25.toStandardHours();
        boolean boolean27 = hours17.isLessThan(hours26);
        boolean boolean28 = hours14.isLessThan(hours17);
        org.joda.time.Duration duration29 = hours17.toStandardDuration();
        org.joda.time.PeriodType periodType30 = hours17.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period31 = period13.withPeriodType(periodType30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        int int5 = period4.getYears();
        org.joda.time.Period period6 = period4.toPeriod();
        org.joda.time.Period period8 = period6.plusMinutes(100);
        org.joda.time.Period period10 = period6.minusMillis(1);
        org.joda.time.Period period12 = period10.multipliedBy(1);
        int[] intArray13 = period12.getValues();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0, 0, 0, -37]");
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        org.joda.time.Hours hours0 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours1 = org.joda.time.Hours.SIX;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.Hours hours4 = hours1.minus((-10));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType6 = hours4.getFieldType((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours4);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration16 = duration6.plus((long) (short) 10);
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        int int22 = period21.getYears();
        org.joda.time.Period period24 = period21.plusYears((int) ' ');
        boolean boolean25 = duration16.equals((java.lang.Object) period24);
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        org.joda.time.Period period33 = duration32.toPeriod();
        org.joda.time.Duration duration35 = duration32.plus((long) (byte) 0);
        org.joda.time.Duration duration37 = duration32.withMillis((long) 1);
        boolean boolean38 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration32);
        long long39 = duration32.getStandardHours();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str46 = periodType45.getName();
        boolean boolean48 = periodType45.equals((java.lang.Object) true);
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant43, readableInstant44, periodType45);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) 0, (long) (-10), periodType45, chronology50);
        org.joda.time.Period period52 = duration32.toPeriodFrom(readableInstant40, periodType45);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration32, readableInstant53, periodType54);
        long long56 = duration32.getStandardHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "YearMonthDay" + "'", str46, "YearMonthDay");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Period period4 = period1.minusMonths(100);
        org.joda.time.Period period6 = period4.minusYears((int) (short) 10);
        org.joda.time.Period period8 = period6.withMillis((-36));
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Period period15 = period11.minusSeconds((int) (byte) 100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray16 = period11.getFieldTypes();
        org.joda.time.Period period17 = period8.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period19 = period17.minusYears((int) '4');
        org.joda.time.DurationFieldType[] durationFieldTypeArray20 = period19.getFieldTypes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(durationFieldTypeArray16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldTypeArray20);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.withMillis((int) (short) 0);
        int int7 = period6.getSeconds();
        java.lang.Object obj8 = null;
        boolean boolean9 = period6.equals(obj8);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        int int11 = period6.indexOf(durationFieldType10);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes12 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) weeks2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 21646635161760");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 2147483645, (long) 'a');
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        org.joda.time.Period period1 = org.joda.time.Period.years((-1));
        org.joda.time.Days days3 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days5 = days3.multipliedBy((int) (short) 100);
        org.joda.time.Days days6 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.Days days9 = days6.minus(0);
        org.joda.time.Days days10 = days3.minus(days9);
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days10);
        org.joda.time.Duration duration14 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration16 = duration14.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Interval interval20 = duration16.toIntervalFrom(readableInstant19);
        org.joda.time.Days days21 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval20);
        org.joda.time.Days days23 = days21.minus((int) '4');
        org.joda.time.Days days24 = days11.minus(days23);
        org.joda.time.Period period25 = period1.withFields((org.joda.time.ReadablePeriod) days11);
        org.joda.time.Period period27 = period1.multipliedBy((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration28 = period27.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        java.util.Locale locale3 = periodFormatter2.getLocale();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Period period6 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period7 = period6.toPeriod();
        org.joda.time.Period period9 = period6.withWeeks((-1));
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period6.toDurationTo(readableInstant10);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer4, (org.joda.time.ReadablePeriod) period6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.Seconds seconds9 = seconds6.plus((int) (byte) 0);
        org.joda.time.Seconds seconds11 = seconds9.minus((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        int int13 = seconds9.get(durationFieldType12);
        boolean boolean14 = period4.isSupported(durationFieldType12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType[] durationFieldTypeArray16 = new org.joda.time.DurationFieldType[] { durationFieldType12, durationFieldType15 };
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.forFields(durationFieldTypeArray16);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.forFields(durationFieldTypeArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(durationFieldTypeArray16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.Period period7 = period2.plusDays(6);
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        org.joda.time.PeriodType periodType12 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType13 = periodType9.withHoursRemoved();
        int int14 = periodType13.size();
        org.joda.time.PeriodType periodType15 = periodType13.withWeeksRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = period2.withPeriodType(periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        org.joda.time.Hours hours2 = org.joda.time.Hours.THREE;
        org.joda.time.PeriodType periodType3 = hours2.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = new org.joda.time.Period((long) 6, 1298798109705600000L, periodType3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 360777252695");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType4.withMinutesRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(10L, (long) (byte) -1, periodType8, chronology9);
        org.joda.time.PeriodType periodType11 = periodType8.withYearsRemoved();
        boolean boolean12 = periodType0.equals((java.lang.Object) periodType8);
        java.lang.String str13 = periodType8.getName();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Days" + "'", str13, "Days");
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
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
        org.joda.time.Minutes minutes46 = minutes41.dividedBy((-1));
        org.joda.time.DurationFieldType durationFieldType47 = minutes41.getFieldType();
        org.joda.time.Period period50 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period52 = period50.minusMonths(0);
        org.joda.time.Minutes minutes53 = period52.toStandardMinutes();
        org.joda.time.Duration duration54 = minutes53.toStandardDuration();
        org.joda.time.Minutes minutes56 = minutes53.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType57 = minutes53.getFieldType();
        org.joda.time.Minutes minutes58 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod59 = minutes58.toMutablePeriod();
        org.joda.time.Minutes minutes60 = minutes53.plus(minutes58);
        org.joda.time.Minutes minutes61 = minutes41.plus(minutes53);
        org.joda.time.Minutes minutes63 = minutes53.minus((int) (short) 0);
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
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(minutes53);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertNotNull(durationFieldType57);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertNotNull(mutablePeriod59);
        org.junit.Assert.assertNotNull(minutes60);
        org.junit.Assert.assertNotNull(minutes61);
        org.junit.Assert.assertNotNull(minutes63);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.MutablePeriod mutablePeriod5 = period2.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod6 = period2.toMutablePeriod();
        org.joda.time.Period period8 = period2.minusMinutes((int) 'a');
        org.joda.time.Period period10 = period8.plusWeeks((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = period10.getFieldType((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("Days");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Days\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withLocale(locale7);
        java.util.Locale locale9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = periodFormatter8.withLocale(locale9);
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Minutes minutes22 = period21.toStandardMinutes();
        org.joda.time.Duration duration23 = minutes22.toStandardDuration();
        org.joda.time.Minutes minutes25 = minutes22.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType26 = minutes22.getFieldType();
        int int27 = period15.indexOf(durationFieldType26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = periodFormatter10.print((org.joda.time.ReadablePeriod) period15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodFormatter10);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("hours");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hours\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (short) 0);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        org.joda.time.format.PeriodPrinter periodPrinter8 = null;
        org.joda.time.format.PeriodParser periodParser9 = null;
        org.joda.time.format.PeriodFormatter periodFormatter10 = new org.joda.time.format.PeriodFormatter(periodPrinter8, periodParser9);
        boolean boolean11 = periodFormatter10.isParser();
        org.joda.time.Days days12 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType13 = days12.getPeriodType();
        org.joda.time.PeriodType periodType14 = periodType13.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter15 = periodFormatter10.withParseType(periodType13);
        org.joda.time.Days days16 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        org.joda.time.PeriodType periodType18 = periodType17.withSecondsRemoved();
        org.joda.time.PeriodType periodType19 = periodType17.withYearsRemoved();
        java.lang.String str20 = periodType19.toString();
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter15.withParseType(periodType19);
        org.joda.time.PeriodType periodType22 = periodFormatter21.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period23 = new org.joda.time.Period((int) (byte) 0, (-95), 0, (int) (byte) 1, 100, (int) ' ', 3, 2, periodType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PeriodType[Days]" + "'", str20, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
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
        java.lang.Class<?> wildcardClass52 = duration9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 100, chronology1);
        int int3 = period2.getSeconds();
        org.joda.time.MutablePeriod mutablePeriod4 = period2.toMutablePeriod();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod4);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds(100L);
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
        boolean boolean48 = duration3.isLongerThan((org.joda.time.ReadableDuration) duration45);
        long long49 = duration45.getStandardHours();
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period53 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period55 = period53.minusMonths(0);
        org.joda.time.Period period57 = period53.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType58 = period53.getPeriodType();
        org.joda.time.PeriodType periodType59 = periodType58.withMinutesRemoved();
        org.joda.time.PeriodType periodType60 = periodType59.withMinutesRemoved();
        org.joda.time.Period period61 = duration45.toPeriodTo(readableInstant50, periodType60);
        org.joda.time.Period period62 = new org.joda.time.Period((long) (-10), (long) (-95), periodType60);
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(period61);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        org.joda.time.Days days1 = org.joda.time.Days.days(10);
        org.joda.time.Minutes minutes2 = days1.toStandardMinutes();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(268435465);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
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
        org.joda.time.Period period22 = duration13.toPeriod();
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
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
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
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, readableInstant53);
        org.joda.time.Duration duration56 = duration15.minus((long) (-2147483646));
        java.lang.Class<?> wildcardClass57 = duration15.getClass();
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
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration21 = new org.joda.time.Duration((java.lang.Object) hours20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Hours");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period10 = new org.joda.time.Period((-128849018880L), periodType9);
        org.joda.time.Seconds seconds11 = period10.toStandardSeconds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = periodFormatter7.print((org.joda.time.ReadablePeriod) period10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(seconds11);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        org.joda.time.Period period1 = org.joda.time.Period.months(100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(35);
        org.joda.time.Weeks weeks3 = weeks1.multipliedBy(5);
        org.joda.time.Weeks weeks5 = weeks1.dividedBy((-36));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = weeks1.getFieldType(59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 59");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = periodFormatter2.parsePeriod("PT2M");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNull(periodType8);
        org.junit.Assert.assertNull(periodPrinter9);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.Period period7 = period2.minusMinutes((int) '#');
        org.joda.time.Period period9 = period7.plusSeconds((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType11 = period9.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.format.PeriodParser periodParser6 = periodFormatter2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod8 = periodFormatter2.parseMutablePeriod("YearMonthDay");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodParser6);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(8);
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("YearMonthDayTimeNoDays");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearMonthDayTimeNoDays\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        org.joda.time.Days days1 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.Period period4 = new org.joda.time.Period((long) 2, periodType3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = period4.plusHours(87);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks7 = weeks6.negated();
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeksIn(readableInterval9);
        boolean boolean11 = weeks8.isLessThan(weeks10);
        boolean boolean12 = weeks7.isGreaterThan(weeks10);
        org.joda.time.Weeks weeks13 = null;
        org.joda.time.Weeks weeks14 = weeks10.minus(weeks13);
        org.joda.time.DurationFieldType durationFieldType15 = weeks14.getFieldType();
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks19 = weeks18.negated();
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.weeksIn(readableInterval21);
        boolean boolean23 = weeks20.isLessThan(weeks22);
        boolean boolean24 = weeks19.isGreaterThan(weeks22);
        boolean boolean25 = weeks16.isLessThan(weeks19);
        org.joda.time.Weeks weeks26 = weeks14.plus(weeks19);
        org.joda.time.Weeks weeks28 = weeks19.minus(2);
        org.joda.time.Weeks weeks30 = weeks28.dividedBy((-10));
        org.joda.time.Weeks weeks31 = weeks30.negated();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer4, (org.joda.time.ReadablePeriod) weeks30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks31);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        org.joda.time.Period period4 = new org.joda.time.Period(6, 0, 8, 11);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        org.joda.time.Period period2 = new org.joda.time.Period((long) 8, 0L);
        java.lang.Class<?> wildcardClass3 = period2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) (byte) 100);
        org.joda.time.Hours hours2 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours4 = hours2.multipliedBy((int) 'a');
        boolean boolean5 = hours1.isGreaterThan(hours2);
        org.joda.time.Hours hours7 = hours1.plus((int) 'a');
        org.joda.time.PeriodType periodType8 = hours1.getPeriodType();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.Minutes minutes1 = duration0.toStandardMinutes();
        org.joda.time.Hours hours2 = minutes1.toStandardHours();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.PeriodType periodType6 = periodFormatter2.getParseType();
        boolean boolean7 = periodFormatter2.isParser();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds11 = seconds9.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType12 = seconds9.getFieldType();
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds15 = seconds13.plus(seconds14);
        org.joda.time.Seconds seconds17 = seconds13.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds18 = seconds9.plus(seconds13);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer8, (org.joda.time.ReadablePeriod) seconds9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) -1, (long) (byte) 0, chronology2);
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) (byte) 0, chronology4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod9 = periodFormatter7.parseMutablePeriod("PT6000S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
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
        org.joda.time.Period period42 = org.joda.time.Period.millis((int) '#');
        int int43 = period42.getYears();
        org.joda.time.Hours hours44 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period42);
        int int45 = hours44.getHours();
        org.joda.time.Duration duration46 = hours44.toStandardDuration();
        org.joda.time.PeriodType periodType47 = hours44.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period48 = new org.joda.time.Period((java.lang.Object) boolean40, periodType47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(hours44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(periodType47);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Period period8 = period4.minusSeconds((int) (byte) 100);
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.days();
        boolean boolean14 = periodType12.isSupported(durationFieldType13);
        int int15 = period4.get(durationFieldType13);
        org.joda.time.Period period17 = period4.withHours(1);
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Period period24 = period20.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType25 = period20.getPeriodType();
        org.joda.time.PeriodType periodType26 = periodType25.withMinutesRemoved();
        java.lang.String str27 = periodType26.toString();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((java.lang.Object) period4, periodType26, chronology28);
        org.joda.time.PeriodType periodType30 = periodType26.withDaysRemoved();
        int int31 = periodType26.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period32 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str27, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 10);
        org.joda.time.Duration duration2 = period1.toStandardDuration();
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.PeriodType periodType8 = seconds1.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType10 = periodType8.getFieldType(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Period period7 = period3.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType8 = period3.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (short) -1, periodType10, chronology11);
        org.joda.time.Period period14 = period12.plusSeconds(14400);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = period14.withMinutes(10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks1 = weeks0.negated();
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks4 = weeks3.negated();
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        boolean boolean8 = weeks5.isLessThan(weeks7);
        boolean boolean9 = weeks4.isGreaterThan(weeks7);
        org.joda.time.Weeks weeks11 = weeks7.plus((int) (short) 100);
        org.joda.time.Weeks weeks12 = weeks0.minus(weeks11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks14 = weeks0.dividedBy((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks12);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Days days1 = hours0.toStandardDays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days3 = days1.multipliedBy((-36));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 89478485 * -36");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        org.joda.time.Days days1 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.Period period4 = new org.joda.time.Period((long) 1, periodType3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = period4.withMonths(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) '4');
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) days1, chronology2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = period3.plusWeeks(1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 1, (long) (-36), periodType2);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        int int9 = period8.getYears();
        org.joda.time.Period period10 = period8.toPeriod();
        org.joda.time.Seconds seconds11 = period8.toStandardSeconds();
        org.joda.time.Period period12 = period3.withFields((org.joda.time.ReadablePeriod) seconds11);
        org.joda.time.Period period14 = period3.plusSeconds(0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = period3.getValue((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration11 = duration8.plus((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration13 = duration4.withDurationAdded((org.joda.time.ReadableDuration) duration11, (int) (byte) 0);
        org.joda.time.Period period14 = duration4.toPeriod();
        org.joda.time.Period period16 = period14.minusSeconds((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = period16.getClass();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = seconds1.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2147483647");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.io.Writer writer6 = null;
        org.joda.time.Period period8 = org.joda.time.Period.millis(0);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer6, (org.joda.time.ReadablePeriod) period8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) '#');
        org.joda.time.Period period3 = period1.withWeeks((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration4 = new org.joda.time.Duration((java.lang.Object) period1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.weeks();
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = period3.minusSeconds((-95));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.Hours hours2 = weeks1.toStandardHours();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-10));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
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
        long long44 = duration22.getMillis();
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
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 8L + "'", long44 == 8L);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType5 = periodType4.withMillisRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        org.joda.time.Days days1 = org.joda.time.Days.days(1);
        org.joda.time.Hours hours2 = days1.toStandardHours();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        java.lang.String str1 = weeks0.toString();
        int int2 = weeks0.size();
        org.joda.time.PeriodType periodType3 = weeks0.getPeriodType();
        org.joda.time.Weeks weeks5 = weeks0.minus(7);
        java.lang.String str6 = weeks0.toString();
        org.joda.time.Duration duration7 = weeks0.toStandardDuration();
        org.joda.time.Duration duration9 = duration7.plus((-2147483648L));
        org.joda.time.ReadableDuration readableDuration10 = null;
        boolean boolean11 = duration7.isEqual(readableDuration10);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((long) (byte) 1);
        boolean boolean14 = duration7.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0W" + "'", str1, "P0W");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0W" + "'", str6, "P0W");
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-2), 7, (int) (short) 10, (int) (short) 100, 0, (int) (byte) 100, (-2147483646), 5, periodType8);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.format.PeriodParser periodParser6 = periodFormatter5.getParser();
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodParser6);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((-10));
        org.joda.time.Days days2 = weeks1.toStandardDays();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) '#');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardSeconds((long) 10);
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
        org.joda.time.Interval interval31 = duration27.toIntervalTo(readableInstant30);
        boolean boolean32 = duration10.isLongerThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((java.lang.Object) duration27, chronology33);
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant8, (org.joda.time.ReadableDuration) duration27, periodType35);
        int int37 = periodType35.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period38 = new org.joda.time.Period(14400, (-97), (int) (short) 100, (int) '#', (int) (byte) 0, (-5), (-95), 2147483647, periodType35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration10);
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
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
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
        org.joda.time.format.PeriodPrinter periodPrinter16 = periodFormatter15.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod18 = periodFormatter15.parseMutablePeriod("PT6H");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
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
        org.junit.Assert.assertNull(periodPrinter16);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Duration duration20 = minutes19.toStandardDuration();
        boolean boolean21 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = new org.joda.time.Duration(readableInstant22, readableInstant23);
        org.joda.time.Duration duration25 = duration13.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration26 = duration13.toDuration();
        boolean boolean27 = duration4.isEqual((org.joda.time.ReadableDuration) duration26);
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
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration34, readableInstant47);
        org.joda.time.Duration duration50 = duration34.plus((long) 8);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Interval interval52 = duration50.toIntervalFrom(readableInstant51);
        org.joda.time.Period period55 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period57 = period55.minusMonths(0);
        org.joda.time.Minutes minutes58 = period57.toStandardMinutes();
        org.joda.time.Duration duration59 = minutes58.toStandardDuration();
        org.joda.time.Period period62 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period64 = period62.minusMonths(0);
        org.joda.time.Minutes minutes65 = period64.toStandardMinutes();
        org.joda.time.Duration duration66 = minutes65.toStandardDuration();
        boolean boolean67 = duration59.isShorterThan((org.joda.time.ReadableDuration) duration66);
        org.joda.time.Duration duration69 = duration59.plus((long) (short) 10);
        org.joda.time.Duration duration71 = duration50.withDurationAdded((org.joda.time.ReadableDuration) duration69, (int) (byte) 0);
        boolean boolean72 = duration26.isEqual((org.joda.time.ReadableDuration) duration69);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Duration duration75 = org.joda.time.Duration.standardSeconds((long) 0);
        org.joda.time.Period period76 = new org.joda.time.Period(readableInstant73, (org.joda.time.ReadableDuration) duration75);
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.ReadableInstant readableInstant78 = null;
        org.joda.time.Period period81 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period83 = period81.minusMonths(0);
        org.joda.time.Minutes minutes84 = period83.toStandardMinutes();
        org.joda.time.Duration duration85 = minutes84.toStandardDuration();
        org.joda.time.Period period86 = duration85.toPeriod();
        org.joda.time.Duration duration88 = duration85.plus((long) (byte) 0);
        org.joda.time.Period period89 = new org.joda.time.Period(readableInstant78, (org.joda.time.ReadableDuration) duration88);
        org.joda.time.PeriodType periodType90 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology91 = null;
        org.joda.time.Period period92 = new org.joda.time.Period((java.lang.Object) duration88, periodType90, chronology91);
        org.joda.time.Period period93 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration75, readableInstant77, periodType90);
        org.joda.time.Period period94 = new org.joda.time.Period((java.lang.Object) duration26, periodType90);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType96 = period94.getFieldType(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(minutes65);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(minutes84);
        org.junit.Assert.assertNotNull(duration85);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(duration88);
        org.junit.Assert.assertNotNull(periodType90);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Period period4 = period1.withWeeks((-1));
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        boolean boolean6 = period1.isSupported(durationFieldType5);
        org.joda.time.Period period7 = period1.normalizedStandard();
        java.lang.String str8 = period1.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT0S" + "'", str8, "PT0S");
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P10D");
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.Days days5 = days2.plus((int) (byte) 100);
        boolean boolean6 = days1.isLessThan(days5);
        org.joda.time.DurationFieldType durationFieldType7 = days1.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration8 = new org.joda.time.Duration((java.lang.Object) days1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Days");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType4 = periodType1.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType6 = periodType1.getFieldType((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.days();
        boolean boolean8 = periodType6.isSupported(durationFieldType7);
        org.joda.time.PeriodType periodType9 = periodType6.withMinutesRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((-128849018880L), periodType6);
        java.lang.String str11 = periodType6.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Days" + "'", str11, "Days");
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean4 = days2.isSupported(durationFieldType3);
        boolean boolean5 = days0.isGreaterThan(days2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = days0.getFieldType(2147483645);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2147483645");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
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
        org.joda.time.Minutes minutes24 = minutes20.negated();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType26 = minutes20.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(minutes24);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
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
        org.joda.time.Period period22 = period20.plusMonths((int) 'a');
        org.joda.time.Period period24 = period22.withMonths((int) (byte) 100);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) 0);
        java.lang.String str2 = duration1.toString();
        org.joda.time.Duration duration4 = duration1.minus((long) 10);
        java.lang.String str5 = duration1.toString();
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        long long8 = duration7.getStandardSeconds();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Duration duration15 = minutes14.toStandardDuration();
        org.joda.time.Minutes minutes17 = minutes14.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration18 = minutes14.toStandardDuration();
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period23 = period21.minusMonths(0);
        org.joda.time.Minutes minutes24 = period23.toStandardMinutes();
        org.joda.time.Duration duration25 = minutes24.toStandardDuration();
        org.joda.time.Period period26 = duration25.toPeriod();
        boolean boolean27 = duration18.isLongerThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.days();
        org.joda.time.Period period30 = duration18.toPeriodTo(readableInstant28, periodType29);
        org.joda.time.Duration duration31 = duration7.plus((org.joda.time.ReadableDuration) duration18);
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period36 = period34.minusMonths(0);
        org.joda.time.Minutes minutes37 = period36.toStandardMinutes();
        org.joda.time.Duration duration38 = minutes37.toStandardDuration();
        org.joda.time.Period period41 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period43 = period41.minusMonths(0);
        org.joda.time.Minutes minutes44 = period43.toStandardMinutes();
        org.joda.time.Duration duration45 = minutes44.toStandardDuration();
        boolean boolean46 = duration38.isShorterThan((org.joda.time.ReadableDuration) duration45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration45, readableInstant47);
        long long49 = duration45.getStandardHours();
        org.joda.time.Duration duration50 = duration18.minus((org.joda.time.ReadableDuration) duration45);
        boolean boolean51 = duration1.isShorterThan((org.joda.time.ReadableDuration) duration50);
        org.joda.time.Duration duration53 = duration1.plus((long) (-2147483646));
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0S" + "'", str5, "PT0S");
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-128849018880L) + "'", long8 == (-128849018880L));
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(duration53);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.multipliedBy(10);
        org.joda.time.Duration duration5 = seconds2.toStandardDuration();
        org.joda.time.PeriodType periodType6 = seconds2.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Period period3 = period1.plusMonths((int) 'a');
        org.joda.time.Period period5 = period1.plusSeconds((int) (short) 100);
        org.joda.time.Period period7 = period5.minusMonths((int) 'a');
        org.joda.time.Period period9 = period7.withMillis((int) (short) 100);
        int int10 = period9.getYears();
        int int12 = period9.getValue(0);
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks16 = weeks14.dividedBy(100);
        org.joda.time.Weeks weeks17 = weeks14.negated();
        org.joda.time.PeriodType periodType18 = weeks17.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = period9.normalizedStandard(periodType18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Minutes minutes7 = minutes5.dividedBy((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = minutes5.getValue((-95));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -95");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
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
        // The following exception was thrown during execution in test generation
        try {
            int int28 = period23.getValue(2147483645);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2147483645");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(13);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("P-97M10DT100S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"P-97M10DT100S\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.Seconds seconds2 = seconds0.multipliedBy((int) (byte) 100);
        org.joda.time.Seconds seconds4 = seconds0.multipliedBy((int) (byte) 0);
        org.joda.time.Duration duration5 = seconds0.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant6);
        java.lang.String str8 = duration5.toString();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT0S" + "'", str8, "PT0S");
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.Period period6 = org.joda.time.Period.days(10);
        org.joda.time.Period period8 = period6.plusMonths((int) 'a');
        org.joda.time.Period period10 = period6.plusSeconds((int) (short) 100);
        org.joda.time.Period period12 = period10.minusMonths((int) 'a');
        org.joda.time.Period period13 = period2.withFields((org.joda.time.ReadablePeriod) period12);
        java.lang.String str14 = period12.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours15 = period12.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P-97M10DT100S" + "'", str14, "P-97M10DT100S");
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
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
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.seconds((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = minutes20.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Minutes cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(seconds25);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
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
        org.joda.time.Period period21 = period11.minusYears(0);
        org.joda.time.Period period23 = period21.withMinutes((-1));
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
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = periodFormatter2.getParseType();
        boolean boolean4 = periodFormatter2.isParser();
        java.io.Writer writer5 = null;
        org.joda.time.Days days7 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withWeeksRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((long) (byte) -1, periodType9);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer5, (org.joda.time.ReadablePeriod) period10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(7);
        org.joda.time.Hours hours3 = hours1.plus((int) (byte) 1);
        org.joda.time.Hours hours4 = org.joda.time.Hours.ONE;
        int int5 = hours4.getHours();
        org.joda.time.Hours hours7 = hours4.dividedBy(8);
        org.joda.time.Hours hours8 = hours3.minus(hours4);
        org.joda.time.Hours hours10 = hours8.minus((-95));
        int int11 = hours8.getHours();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutes((int) ' ');
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period5 = period1.multipliedBy((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = period5.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes2 = minutes0.plus((int) (short) 10);
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.MutablePeriod mutablePeriod4 = minutes3.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes5 = minutes0.minus(minutes3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2147483648 + -2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(mutablePeriod4);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("P-10WT8M0.036S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PeriodType[YearDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[YearDay]\" is malformed at \"eriodType[YearDay]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getStandardHours();
        org.joda.time.Duration duration11 = duration1.withDurationAdded(10L, (-36));
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Duration duration15 = duration11.withDurationAdded((long) ' ', (int) (byte) 0);
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
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = period18.toDurationTo(readableInstant32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.Period period35 = duration33.toPeriodTo(readableInstant34);
        int int36 = duration15.compareTo((org.joda.time.ReadableDuration) duration33);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Days days41 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType42 = days41.getPeriodType();
        org.joda.time.PeriodType periodType43 = periodType42.withHoursRemoved();
        org.joda.time.PeriodType periodType44 = periodType42.withSecondsRemoved();
        org.joda.time.PeriodType periodType45 = periodType42.withMinutesRemoved();
        org.joda.time.PeriodType periodType46 = periodType45.withWeeksRemoved();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(10L, (long) (byte) -1, periodType46, chronology47);
        org.joda.time.PeriodType periodType49 = periodType46.withYearsRemoved();
        boolean boolean50 = periodType38.equals((java.lang.Object) periodType46);
        org.joda.time.Period period51 = duration33.toPeriodTo(readableInstant37, periodType46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period53 = period51.withSeconds(7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration15);
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
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(period51);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.time();
        org.joda.time.PeriodType periodType1 = periodType0.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration2 = new org.joda.time.Duration((java.lang.Object) periodType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT-2S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withYearsRemoved();
        org.joda.time.PeriodType periodType12 = periodType9.withSecondsRemoved();
        org.joda.time.PeriodType periodType13 = periodType9.withHoursRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withYearsRemoved();
        org.joda.time.PeriodType periodType15 = periodType14.withHoursRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period(2, (int) '4', 14400, (int) (short) 100, (-97), (-2147483646), (-2147483646), (-5), periodType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
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
        org.joda.time.Days days16 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        org.joda.time.PeriodType periodType18 = periodType17.withHoursRemoved();
        org.joda.time.PeriodType periodType19 = periodType17.withYearsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter2.withParseType(periodType17);
        org.joda.time.ReadWritablePeriod readWritablePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = periodFormatter2.parseInto(readWritablePeriod21, "P35W", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
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
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodFormatter20);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes2 = minutes0.plus((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes4 = minutes2.plus((-97));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2147483638 + -97");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(100L, periodType1);
        org.joda.time.Period period4 = period2.withYears(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours5 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as years is not precise in the period P1YT0.100S");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
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
        org.joda.time.Period period18 = period2.withSeconds((int) (short) 10);
        int int19 = period18.getMonths();
        int int20 = period18.size();
        org.joda.time.Period period22 = period18.withMillis(8);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Period period3 = period1.plusMonths((int) 'a');
        org.joda.time.Period period5 = period1.plusSeconds((int) (short) 100);
        org.joda.time.Period period7 = period5.minusMonths((int) 'a');
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period5.withField(durationFieldType8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weekyears'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
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
        java.io.Writer writer20 = null;
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.THREE;
        org.joda.time.Hours hours22 = weeks21.toStandardHours();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer20, (org.joda.time.ReadablePeriod) hours22);
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
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(hours22);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
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
        java.util.Locale locale10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter2.withLocale(locale10);
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks14 = weeks13.negated();
        org.joda.time.Weeks weeks15 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeksIn(readableInterval16);
        boolean boolean18 = weeks15.isLessThan(weeks17);
        boolean boolean19 = weeks14.isGreaterThan(weeks17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = periodFormatter11.print((org.joda.time.ReadablePeriod) weeks17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNull(periodType8);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days1 = org.joda.time.Days.ONE;
        int int2 = days0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days1);
        org.joda.time.Days days4 = days1.multipliedBy((int) '#');
        org.joda.time.Period period5 = days4.toPeriod();
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Period period12 = period8.minusSeconds((int) (byte) 100);
        org.joda.time.Days days13 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        org.joda.time.PeriodType periodType15 = periodType14.withHoursRemoved();
        org.joda.time.PeriodType periodType16 = periodType14.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.days();
        boolean boolean18 = periodType16.isSupported(durationFieldType17);
        int int19 = period8.get(durationFieldType17);
        int int20 = period5.indexOf(durationFieldType17);
        int int21 = period5.getMillis();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
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
        // The following exception was thrown during execution in test generation
        try {
            int int22 = hours2.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Period period4 = period1.minusMonths(100);
        org.joda.time.Period period6 = period4.minusYears((int) (short) 10);
        org.joda.time.Period period8 = period6.withMillis((-36));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration9 = period8.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Period period4 = period1.withWeeks((-1));
        org.joda.time.Period period6 = period4.withMinutes((-1));
        org.joda.time.Period period8 = period4.withMonths(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours9 = period8.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.PeriodType periodType3 = seconds0.getPeriodType();
        int int4 = seconds0.size();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.seconds((int) (byte) 10);
        boolean boolean8 = seconds6.equals((java.lang.Object) "PeriodType[StandardNoMinutes]");
        org.joda.time.Seconds seconds9 = seconds0.plus(seconds6);
        org.joda.time.Seconds seconds11 = seconds9.plus((int) (short) 0);
        org.joda.time.Duration duration12 = seconds11.toStandardDuration();
        long long13 = duration12.getStandardDays();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(3);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((-95));
        org.joda.time.Duration duration2 = weeks1.toStandardDuration();
        org.joda.time.Minutes minutes3 = weeks1.toStandardMinutes();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(minutes3);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) ' ');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("P1W3D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"P1W3D\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        int int4 = seconds2.get(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType5 = seconds2.getFieldType();
        java.lang.String str6 = durationFieldType5.getName();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "seconds" + "'", str6, "seconds");
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration2 = duration1.toDuration();
        org.joda.time.Minutes minutes3 = duration1.toStandardMinutes();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period9 = period7.minusMonths(0);
        org.joda.time.Minutes minutes10 = period9.toStandardMinutes();
        org.joda.time.Minutes minutes12 = minutes10.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes13 = minutes4.minus(minutes10);
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period17 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period19 = period17.minusMonths(0);
        org.joda.time.Minutes minutes20 = period19.toStandardMinutes();
        org.joda.time.Minutes minutes22 = minutes20.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes23 = minutes14.minus(minutes20);
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period28 = period26.minusMonths(0);
        org.joda.time.Minutes minutes29 = period28.toStandardMinutes();
        org.joda.time.Duration duration30 = minutes29.toStandardDuration();
        org.joda.time.Minutes minutes32 = minutes29.multipliedBy((int) (short) 1);
        int int33 = minutes14.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes32);
        org.joda.time.Minutes minutes34 = minutes13.plus(minutes32);
        org.joda.time.Period period37 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period39 = period37.minusMonths(0);
        org.joda.time.Minutes minutes40 = period39.toStandardMinutes();
        org.joda.time.Minutes minutes42 = minutes40.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((java.lang.Object) minutes40, chronology43);
        org.joda.time.Period period45 = minutes40.toPeriod();
        org.joda.time.Minutes minutes46 = org.joda.time.Minutes.MAX_VALUE;
        boolean boolean47 = minutes40.isLessThan(minutes46);
        org.joda.time.Minutes minutes48 = minutes34.minus(minutes40);
        boolean boolean49 = minutes3.isGreaterThan(minutes40);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(minutes32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(minutes46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
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
        org.joda.time.Seconds seconds24 = org.joda.time.Seconds.parseSeconds("PT0H");
        boolean boolean25 = seconds9.isLessThan(seconds24);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = seconds24.getValue(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 13");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period2 = period1.toPeriod();
        int int3 = period2.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        org.joda.time.Period period1 = new org.joda.time.Period((-36L));
        // The following exception was thrown during execution in test generation
        try {
            int int3 = period1.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period1);
        int int4 = hours3.getHours();
        org.joda.time.Hours hours6 = hours3.multipliedBy((int) (short) 1);
        org.joda.time.Hours hours8 = hours3.multipliedBy((int) (short) 100);
        org.joda.time.Hours hours9 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours11 = hours9.multipliedBy((int) 'a');
        org.joda.time.PeriodType periodType12 = hours9.getPeriodType();
        org.joda.time.Chronology chronology13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = new org.joda.time.Period((java.lang.Object) (short) 100, periodType12, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter3.withParseType(periodType6);
        boolean boolean9 = periodFormatter8.isPrinter();
        boolean boolean10 = periodFormatter8.isParser();
        org.joda.time.PeriodType periodType11 = periodFormatter8.getParseType();
        org.joda.time.PeriodType periodType12 = periodType11.withSecondsRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period(0L, periodType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = period13.minusHours((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.PeriodType periodType3 = weeks2.getPeriodType();
        int int4 = weeks2.getWeeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) weeks2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 15032385529");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
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
        org.joda.time.Period period17 = duration15.toPeriod(chronology16);
        long long18 = duration15.getMillis();
        java.lang.Class<?> wildcardClass19 = duration15.getClass();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
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
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Minutes minutes22 = period21.toStandardMinutes();
        org.joda.time.Duration duration23 = minutes22.toStandardDuration();
        boolean boolean24 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(readableInstant25, readableInstant26);
        org.joda.time.Duration duration28 = duration16.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration29 = duration16.toDuration();
        org.joda.time.Duration duration30 = duration9.plus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period36 = period34.minusMonths(0);
        org.joda.time.Minutes minutes37 = period36.toStandardMinutes();
        org.joda.time.Duration duration38 = minutes37.toStandardDuration();
        org.joda.time.Period period39 = duration38.toPeriod();
        org.joda.time.Duration duration41 = duration38.plus((long) (byte) 0);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration41);
        org.joda.time.Duration duration43 = duration9.plus((org.joda.time.ReadableDuration) duration41);
        long long44 = duration41.getStandardHours();
        org.joda.time.Duration duration46 = duration41.withMillis(0L);
        org.joda.time.Period period47 = duration46.toPeriod();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(period47);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        org.joda.time.Period period1 = org.joda.time.Period.millis((-1));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        org.joda.time.Hours hours4 = org.joda.time.Hours.THREE;
        org.joda.time.PeriodType periodType5 = hours4.getPeriodType();
        org.joda.time.Chronology chronology6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) periodFormatter2, periodType5, chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.format.PeriodFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.seconds();
        org.joda.time.Period period2 = new org.joda.time.Period((-128849018880L), periodType1);
        org.joda.time.Seconds seconds3 = period2.toStandardSeconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = period2.withHours(11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(seconds3);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType3 = minutes2.getFieldType();
        java.lang.Class<?> wildcardClass4 = minutes2.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.format.PeriodPrinter periodPrinter5 = null;
        org.joda.time.format.PeriodParser periodParser6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = new org.joda.time.format.PeriodFormatter(periodPrinter5, periodParser6);
        boolean boolean8 = periodFormatter7.isParser();
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter7.withParseType(periodType10);
        boolean boolean13 = periodFormatter12.isPrinter();
        boolean boolean14 = periodFormatter12.isParser();
        org.joda.time.PeriodType periodType15 = periodFormatter12.getParseType();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period(0L, periodType16);
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration2, readableInstant3, periodType16);
        java.lang.String str19 = duration2.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0.011S" + "'", str19, "PT0.011S");
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours1 = org.joda.time.Hours.TWO;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = hours1.getValue(268435465);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 268435465");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
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
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        org.joda.time.Period period35 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period37 = period35.minusMonths(0);
        org.joda.time.Minutes minutes38 = period37.toStandardMinutes();
        org.joda.time.Duration duration39 = minutes38.toStandardDuration();
        boolean boolean40 = duration32.isShorterThan((org.joda.time.ReadableDuration) duration39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration39, readableInstant41);
        long long43 = duration39.getStandardHours();
        org.joda.time.Duration duration44 = duration12.minus((org.joda.time.ReadableDuration) duration39);
        org.joda.time.Duration duration46 = org.joda.time.Duration.standardSeconds((long) 0);
        java.lang.String str47 = duration46.toString();
        org.joda.time.Duration duration49 = duration46.minus((long) 10);
        org.joda.time.Duration duration51 = duration44.withDurationAdded((org.joda.time.ReadableDuration) duration46, (int) 'a');
        org.joda.time.Duration duration53 = new org.joda.time.Duration((long) (byte) -1);
        boolean boolean54 = duration44.isEqual((org.joda.time.ReadableDuration) duration53);
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
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PT0S" + "'", str47, "PT0S");
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
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
        java.lang.StringBuffer stringBuffer15 = null;
        org.joda.time.Period period17 = org.joda.time.Period.millis((int) '#');
        int int18 = period17.getYears();
        org.joda.time.Hours hours19 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period17);
        int int20 = hours19.getHours();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter7.printTo(stringBuffer15, (org.joda.time.ReadablePeriod) hours19);
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
        org.junit.Assert.assertNull(periodPrinter14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(hours19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
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
        long long18 = duration17.getStandardSeconds();
        org.joda.time.Duration duration19 = duration17.toDuration();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardSeconds((long) 0);
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        org.joda.time.Period period33 = duration32.toPeriod();
        org.joda.time.Duration duration35 = duration32.plus((long) (byte) 0);
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant25, (org.joda.time.ReadableDuration) duration35);
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) duration35, periodType37, chronology38);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, readableInstant24, periodType37);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardMinutes(100L);
        boolean boolean43 = duration22.isLongerThan((org.joda.time.ReadableDuration) duration42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        boolean boolean45 = duration22.isLongerThan(readableDuration44);
        boolean boolean46 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration17, periodType47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration17, readableInstant49);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT97S");
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        org.joda.time.Period period1 = org.joda.time.Period.millis(0);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Days days4 = days2.plus((int) ' ');
        org.joda.time.DurationFieldType durationFieldType5 = days4.getFieldType();
        org.joda.time.Chronology chronology6 = null;
        boolean boolean7 = durationFieldType5.isSupported(chronology6);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksIn(readableInterval1);
        org.joda.time.Weeks weeks4 = weeks2.dividedBy((int) (byte) -1);
        org.joda.time.Weeks weeks5 = null;
        org.joda.time.Weeks weeks6 = weeks4.minus(weeks5);
        org.joda.time.PeriodType periodType7 = weeks4.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withMillisRemoved();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(10L, periodType7, chronology9);
        org.joda.time.Period period12 = org.joda.time.Period.days((-95));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period10.withFields((org.joda.time.ReadablePeriod) period12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
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
        org.joda.time.format.PeriodParser periodParser10 = periodFormatter7.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter11 = periodFormatter7.getPrinter();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.Period period14 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes15 = period14.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType16 = minutes15.getFieldType();
        int int17 = minutes15.getMinutes();
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period23 = period21.minusMonths(0);
        org.joda.time.Minutes minutes24 = period23.toStandardMinutes();
        org.joda.time.Minutes minutes26 = minutes24.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes27 = minutes18.minus(minutes24);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period32 = period30.minusMonths(0);
        org.joda.time.Minutes minutes33 = period32.toStandardMinutes();
        org.joda.time.Minutes minutes35 = minutes33.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((java.lang.Object) minutes33, chronology36);
        org.joda.time.Minutes minutes38 = minutes18.minus(minutes33);
        org.joda.time.DurationFieldType durationFieldType40 = minutes38.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType41 = minutes38.getPeriodType();
        org.joda.time.Minutes minutes42 = minutes38.negated();
        org.joda.time.Minutes minutes43 = minutes15.minus(minutes42);
        org.joda.time.Minutes minutes44 = minutes43.negated();
        org.joda.time.Duration duration45 = minutes43.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter7.printTo(stringBuffer12, (org.joda.time.ReadablePeriod) minutes43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(periodParser10);
        org.junit.Assert.assertNull(periodPrinter11);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 14400 + "'", int17 == 14400);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(minutes42);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(minutes44);
        org.junit.Assert.assertNotNull(duration45);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.MutablePeriod mutablePeriod5 = period2.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod6 = period2.toMutablePeriod();
        org.joda.time.Period period8 = period2.minusMinutes((int) 'a');
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Days days10 = org.joda.time.Days.daysIn(readableInterval9);
        org.joda.time.Period period11 = period2.minus((org.joda.time.ReadablePeriod) days10);
        org.joda.time.Period period13 = period2.withDays(0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Duration duration20 = minutes19.toStandardDuration();
        boolean boolean21 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = new org.joda.time.Duration(readableInstant22, readableInstant23);
        org.joda.time.Duration duration25 = duration13.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration26 = duration13.toDuration();
        boolean boolean27 = duration4.isEqual((org.joda.time.ReadableDuration) duration26);
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
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration34, readableInstant47);
        org.joda.time.Duration duration50 = duration34.plus((long) 8);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Interval interval52 = duration50.toIntervalFrom(readableInstant51);
        org.joda.time.Period period55 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period57 = period55.minusMonths(0);
        org.joda.time.Minutes minutes58 = period57.toStandardMinutes();
        org.joda.time.Duration duration59 = minutes58.toStandardDuration();
        org.joda.time.Period period62 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period64 = period62.minusMonths(0);
        org.joda.time.Minutes minutes65 = period64.toStandardMinutes();
        org.joda.time.Duration duration66 = minutes65.toStandardDuration();
        boolean boolean67 = duration59.isShorterThan((org.joda.time.ReadableDuration) duration66);
        org.joda.time.Duration duration69 = duration59.plus((long) (short) 10);
        org.joda.time.Duration duration71 = duration50.withDurationAdded((org.joda.time.ReadableDuration) duration69, (int) (byte) 0);
        boolean boolean72 = duration26.isEqual((org.joda.time.ReadableDuration) duration69);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.PeriodType periodType74 = org.joda.time.PeriodType.weeks();
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration26, readableInstant73, periodType74);
        org.joda.time.Period period78 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period80 = period78.minusMonths(0);
        org.joda.time.Period period82 = period78.minusSeconds((int) (byte) 100);
        org.joda.time.Days days83 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType84 = days83.getPeriodType();
        org.joda.time.PeriodType periodType85 = periodType84.withHoursRemoved();
        org.joda.time.PeriodType periodType86 = periodType84.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType87 = org.joda.time.DurationFieldType.days();
        boolean boolean88 = periodType86.isSupported(durationFieldType87);
        int int89 = period78.get(durationFieldType87);
        org.joda.time.Period period91 = period78.withHours(1);
        org.joda.time.Period period93 = period91.withSeconds((int) (short) 0);
        org.joda.time.Period period95 = period91.withWeeks(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period96 = period75.minus((org.joda.time.ReadablePeriod) period91);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(minutes58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(minutes65);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(days83);
        org.junit.Assert.assertNotNull(periodType84);
        org.junit.Assert.assertNotNull(periodType85);
        org.junit.Assert.assertNotNull(periodType86);
        org.junit.Assert.assertNotNull(durationFieldType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertNotNull(period95);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
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
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardSeconds((long) 10);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period29 = period27.minusMonths(0);
        org.joda.time.Minutes minutes30 = period29.toStandardMinutes();
        org.joda.time.Duration duration31 = minutes30.toStandardDuration();
        org.joda.time.Minutes minutes33 = minutes30.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration34 = minutes30.toStandardDuration();
        org.joda.time.Period period37 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period39 = period37.minusMonths(0);
        org.joda.time.Minutes minutes40 = period39.toStandardMinutes();
        org.joda.time.Duration duration41 = minutes40.toStandardDuration();
        org.joda.time.Period period42 = duration41.toPeriod();
        boolean boolean43 = duration34.isLongerThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Interval interval45 = duration41.toIntervalTo(readableInstant44);
        boolean boolean46 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration41);
        int int47 = duration6.compareTo((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Minutes minutes48 = duration6.toStandardMinutes();
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period53 = period51.minusMonths(0);
        org.joda.time.Minutes minutes54 = period53.toStandardMinutes();
        org.joda.time.Minutes minutes56 = minutes54.dividedBy((int) (byte) 100);
        org.joda.time.Period period59 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period61 = period59.minusMonths(0);
        org.joda.time.Minutes minutes62 = period61.toStandardMinutes();
        org.joda.time.Duration duration63 = minutes62.toStandardDuration();
        org.joda.time.Minutes minutes65 = minutes62.multipliedBy((int) (short) 1);
        int int66 = minutes65.getMinutes();
        boolean boolean67 = minutes56.isGreaterThan(minutes65);
        boolean boolean68 = minutes48.isGreaterThan(minutes65);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(minutes48);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(minutes54);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(minutes62);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertNotNull(minutes65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.PeriodType periodType6 = periodFormatter2.getParseType();
        boolean boolean7 = periodFormatter2.isParser();
        boolean boolean8 = periodFormatter2.isParser();
        boolean boolean9 = periodFormatter2.isPrinter();
        java.io.Writer writer10 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period13.minusMonths(0);
        org.joda.time.Minutes minutes16 = period15.toStandardMinutes();
        org.joda.time.Duration duration17 = minutes16.toStandardDuration();
        org.joda.time.Minutes minutes19 = minutes16.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration20 = minutes16.toStandardDuration();
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period23.negated();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationTo(readableInstant25);
        boolean boolean27 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration30 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration31 = duration26.plus((org.joda.time.ReadableDuration) duration30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Interval interval33 = duration30.toIntervalTo(readableInstant32);
        org.joda.time.Minutes minutes34 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval33);
        org.joda.time.Minutes minutes36 = minutes34.plus(0);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer10, (org.joda.time.ReadablePeriod) minutes34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(minutes36);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Period period4 = period1.minusMonths(100);
        org.joda.time.Period period6 = period4.minusYears((int) (short) 10);
        java.lang.String str7 = period4.toString();
        org.joda.time.Period period9 = period4.withMinutes((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks10 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P-100M10D");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P-100M10D" + "'", str7, "P-100M10D");
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.PeriodType periodType6 = periodFormatter2.getParseType();
        boolean boolean7 = periodFormatter2.isParser();
        boolean boolean8 = periodFormatter2.isParser();
        boolean boolean9 = periodFormatter2.isPrinter();
        org.joda.time.PeriodType periodType10 = periodFormatter2.getParseType();
        org.joda.time.PeriodType periodType11 = periodFormatter2.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = periodFormatter2.parsePeriod("PT-128849018880S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(periodType10);
        org.junit.Assert.assertNull(periodType11);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.Period period4 = period1.withFields(readablePeriod3);
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period7.negated();
        int int9 = period7.getHours();
        org.joda.time.Period period11 = org.joda.time.Period.days(10);
        org.joda.time.Period period13 = period11.plusMonths((int) 'a');
        org.joda.time.Period period15 = period11.plusSeconds((int) (short) 100);
        org.joda.time.Period period17 = period15.minusMonths((int) 'a');
        org.joda.time.Period period18 = period7.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period19 = period1.minus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period21 = period1.withSeconds(1);
        int int22 = period1.getYears();
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.ZERO;
        java.lang.String str24 = weeks23.toString();
        int int25 = weeks23.size();
        org.joda.time.PeriodType periodType26 = weeks23.getPeriodType();
        org.joda.time.Weeks weeks28 = weeks23.minus(7);
        org.joda.time.Period period29 = period1.withFields((org.joda.time.ReadablePeriod) weeks28);
        org.joda.time.PeriodType periodType30 = weeks28.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            int int32 = weeks28.getValue((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "P0W" + "'", str24, "P0W");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        org.joda.time.Period period7 = period3.plusWeeks((int) (short) 10);
        org.joda.time.PeriodType periodType8 = period3.getPeriodType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray9 = period3.getFieldTypes();
        int int10 = period3.getMillis();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = seconds1.multipliedBy(10);
        org.joda.time.Seconds seconds4 = seconds0.minus(seconds1);
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.ZERO;
        java.lang.String str6 = weeks5.toString();
        org.joda.time.Weeks weeks8 = weeks5.multipliedBy(7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = seconds0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) weeks8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Seconds cannot be compared to class org.joda.time.Weeks");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0W" + "'", str6, "P0W");
        org.junit.Assert.assertNotNull(weeks8);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
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
        java.lang.String str19 = duration13.toString();
        long long20 = duration13.getMillis();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0S" + "'", str17, "PT0S");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0S" + "'", str19, "PT0S");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        org.joda.time.Days days1 = org.joda.time.Days.days(6);
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        java.lang.String str3 = days2.toString();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        boolean boolean8 = days2.isLessThan(days7);
        org.joda.time.Days days9 = days1.plus(days7);
        org.joda.time.Hours hours10 = org.joda.time.Hours.ONE;
        int int11 = hours10.getHours();
        org.joda.time.Hours hours13 = hours10.multipliedBy((-95));
        org.joda.time.Hours hours15 = hours13.dividedBy((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = days7.compareTo((org.joda.time.base.BaseSingleFieldPeriod) hours15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Days cannot be compared to class org.joda.time.Hours");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P5D" + "'", str3, "P5D");
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(hours15);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MIN_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 13");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PeriodType[Standard]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Standard]\" is malformed at \"eriodType[Standard]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(87);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        org.joda.time.Days days1 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withYearsRemoved();
        org.joda.time.PeriodType periodType5 = periodType2.withSecondsRemoved();
        org.joda.time.Period period6 = new org.joda.time.Period((long) (short) 10, periodType2);
        org.joda.time.Period period8 = period6.withDays(52);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.joda.time.Days days1 = org.joda.time.Days.days(6);
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        java.lang.String str3 = days2.toString();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        boolean boolean8 = days2.isLessThan(days7);
        org.joda.time.Days days9 = days1.plus(days7);
        java.lang.String str10 = days1.toString();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P5D" + "'", str3, "P5D");
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P6D" + "'", str10, "P6D");
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Period period8 = period4.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType9 = period4.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.Period period12 = new org.joda.time.Period((long) (-97), periodType11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) 120L, periodType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("P-100M10D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 1, (long) (-36), periodType2);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        int int9 = period8.getYears();
        org.joda.time.Period period10 = period8.toPeriod();
        org.joda.time.Seconds seconds11 = period8.toStandardSeconds();
        org.joda.time.Period period12 = period3.withFields((org.joda.time.ReadablePeriod) seconds11);
        org.joda.time.Period period14 = period3.plusSeconds(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = period3.minusMillis(11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT2147483647H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Period period3 = period1.plusMonths((int) 'a');
        org.joda.time.Period period5 = period1.plusSeconds((int) (short) 100);
        org.joda.time.Period period7 = period5.minusMonths((int) 'a');
        org.joda.time.Period period9 = period7.withMillis((int) (short) 100);
        int int10 = period9.getYears();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType12 = periodType11.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period9.normalizedStandard(periodType11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
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
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeks(35);
        org.joda.time.Weeks weeks22 = weeks20.multipliedBy(5);
        org.joda.time.MutablePeriod mutablePeriod23 = weeks22.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod23, "PT-1H", (int) '#');
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
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(mutablePeriod23);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks3 = weeks2.negated();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        boolean boolean7 = weeks4.isLessThan(weeks6);
        boolean boolean8 = weeks3.isGreaterThan(weeks6);
        boolean boolean9 = weeks0.isLessThan(weeks3);
        org.joda.time.Duration duration10 = weeks0.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days11 = duration10.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -15032385536");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
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
        java.util.Locale locale23 = periodFormatter2.getLocale();
        java.lang.Class<?> wildcardClass24 = periodFormatter2.getClass();
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
        org.junit.Assert.assertNull(locale23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (byte) 0);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        org.joda.time.Hours hours0 = org.joda.time.Hours.SIX;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType((-36));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -36");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
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
        java.io.Writer writer23 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period28 = period26.minusMonths(0);
        int int29 = period28.getYears();
        org.joda.time.Period period31 = period28.plusYears((int) ' ');
        org.joda.time.Period period33 = period28.plusMinutes((-1));
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter22.printTo(writer23, (org.joda.time.ReadablePeriod) period28);
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
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) 6);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
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
        org.joda.time.PeriodType periodType10 = periodFormatter7.getParseType();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str15 = periodType14.getName();
        boolean boolean17 = periodType14.equals((java.lang.Object) true);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant12, readableInstant13, periodType14);
        org.joda.time.Chronology chronology19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) periodType11, periodType14, chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "YearMonthDay" + "'", str15, "YearMonthDay");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
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
        org.joda.time.Period period16 = period2.plusHours((int) '#');
        org.joda.time.Period period18 = period16.plusMonths((int) (short) 1);
        org.joda.time.Period period20 = period18.minusWeeks((int) (short) 1);
        org.joda.time.Period period22 = period18.withMillis(0);
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
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        org.joda.time.Period period1 = org.joda.time.Period.years(8);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter2.withParseType(periodType5);
        org.joda.time.PeriodType periodType8 = periodFormatter7.getParseType();
        java.io.Writer writer9 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period12.minusMonths(0);
        org.joda.time.Period period15 = period12.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = period15.toDurationFrom(readableInstant17);
        org.joda.time.Period period19 = period15.normalizedStandard();
        org.joda.time.Period period20 = period15.negated();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter7.printTo(writer9, (org.joda.time.ReadablePeriod) period15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
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
        org.joda.time.PeriodType periodType23 = periodFormatter22.getParseType();
        org.joda.time.Weeks weeks25 = org.joda.time.Weeks.weeks((int) (short) 1);
        org.joda.time.Weeks weeks27 = weeks25.dividedBy(100);
        org.joda.time.Weeks weeks28 = weeks25.negated();
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeksIn(readableInterval29);
        org.joda.time.Weeks weeks32 = weeks30.dividedBy((int) (byte) -1);
        org.joda.time.Weeks weeks33 = null;
        org.joda.time.Weeks weeks34 = weeks32.minus(weeks33);
        org.joda.time.Weeks weeks36 = weeks32.dividedBy(2147483647);
        boolean boolean37 = weeks28.isGreaterThan(weeks36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = periodFormatter22.print((org.joda.time.ReadablePeriod) weeks28);
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
        org.junit.Assert.assertNull(periodType23);
        org.junit.Assert.assertNotNull(weeks25);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(weeks32);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        org.joda.time.Days days1 = org.joda.time.Days.days(1);
        org.joda.time.Duration duration2 = days1.toStandardDuration();
        org.joda.time.Seconds seconds3 = days1.toStandardSeconds();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isPrinter();
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.Days days10 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType11 = days10.getPeriodType();
        org.joda.time.Days days13 = days10.minus(0);
        org.joda.time.Days days14 = days13.negated();
        boolean boolean15 = days8.isGreaterThan(days13);
        org.joda.time.Days days16 = days8.negated();
        org.joda.time.Days days18 = org.joda.time.Days.days((int) '4');
        boolean boolean19 = days16.isLessThan(days18);
        int int20 = days16.getDays();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer7, (org.joda.time.ReadablePeriod) days16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-5) + "'", int20 == (-5));
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        org.joda.time.Hours hours2 = hours0.multipliedBy((int) 'a');
        org.joda.time.Hours hours4 = hours2.minus((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType6 = hours4.getFieldType((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours4);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType17 = period12.getFieldType(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P-97M10DT100S" + "'", str14, "P-97M10DT100S");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
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
        org.joda.time.Period period22 = period20.withYears((int) (byte) 1);
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period26 = period25.negated();
        org.joda.time.DurationFieldType durationFieldType28 = period25.getFieldType((int) (short) 1);
        org.joda.time.Period period30 = period20.withField(durationFieldType28, 6);
        int[] intArray31 = period30.getValues();
        org.joda.time.Period period33 = period30.plusMinutes((-95));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType35 = period30.getFieldType(36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 6, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(period33);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Period period1 = new org.joda.time.Period((java.lang.Object) minutes0);
        org.joda.time.Duration duration2 = period1.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = period1.getFieldType(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        org.joda.time.Period period1 = org.joda.time.Period.parse("PT99.640S");
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = period3.toDurationTo(readableInstant4);
        org.joda.time.Period period7 = period3.plusWeeks((int) (short) 10);
        org.joda.time.PeriodType periodType8 = period3.getPeriodType();
        org.joda.time.Period period10 = period3.withWeeks(7);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = period3.getValue(14400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14400");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("PT-128849018880S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT-128849018880S\" is malformed at \"-128849018880S\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksIn(readableInterval1);
        boolean boolean3 = weeks0.isLessThan(weeks2);
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks6 = weeks4.dividedBy(1);
        boolean boolean7 = weeks0.isGreaterThan(weeks6);
        java.lang.String str8 = weeks0.toString();
        java.lang.String str9 = weeks0.toString();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P2147483647W" + "'", str8, "P2147483647W");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P2147483647W" + "'", str9, "P2147483647W");
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
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
        int int25 = period24.getWeeks();
        org.joda.time.Period period26 = period24.toPeriod();
        org.joda.time.Period period28 = period24.plusWeeks(5);
        org.joda.time.Days days30 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days32 = days30.multipliedBy((int) (short) 100);
        org.joda.time.format.PeriodPrinter periodPrinter33 = null;
        org.joda.time.format.PeriodParser periodParser34 = null;
        org.joda.time.format.PeriodFormatter periodFormatter35 = new org.joda.time.format.PeriodFormatter(periodPrinter33, periodParser34);
        boolean boolean36 = periodFormatter35.isParser();
        org.joda.time.Days days37 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType38 = days37.getPeriodType();
        org.joda.time.PeriodType periodType39 = periodType38.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter40 = periodFormatter35.withParseType(periodType38);
        org.joda.time.Days days41 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType42 = days41.getPeriodType();
        org.joda.time.PeriodType periodType43 = periodType42.withSecondsRemoved();
        org.joda.time.PeriodType periodType44 = periodType42.withYearsRemoved();
        java.lang.String str45 = periodType44.toString();
        org.joda.time.format.PeriodFormatter periodFormatter46 = periodFormatter40.withParseType(periodType44);
        org.joda.time.PeriodType periodType47 = periodFormatter46.getParseType();
        org.joda.time.PeriodType periodType48 = periodFormatter46.getParseType();
        boolean boolean49 = days30.equals((java.lang.Object) periodType48);
        org.joda.time.Chronology chronology50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period51 = new org.joda.time.Period((java.lang.Object) period28, periodType48, chronology50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(periodFormatter40);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PeriodType[Days]" + "'", str45, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        java.lang.String str1 = weeks0.toString();
        int int2 = weeks0.size();
        org.joda.time.PeriodType periodType3 = weeks0.getPeriodType();
        org.joda.time.Weeks weeks5 = weeks0.minus(7);
        org.joda.time.PeriodType periodType6 = weeks5.getPeriodType();
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeks(1);
        java.lang.String str9 = weeks8.toString();
        java.lang.String str10 = weeks8.toString();
        boolean boolean11 = weeks5.isGreaterThan(weeks8);
        org.joda.time.Period period12 = weeks5.toPeriod();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0W" + "'", str1, "P0W");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P1W" + "'", str9, "P1W");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P1W" + "'", str10, "P1W");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds29 = seconds2.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) '4');
        org.joda.time.Minutes minutes2 = days1.toStandardMinutes();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = seconds2.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
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
        org.joda.time.Period period19 = duration6.toPeriod();
        long long20 = duration6.getMillis();
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Period period27 = period23.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType28 = period23.getPeriodType();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period23.toDurationTo(readableInstant29);
        boolean boolean31 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration30);
        long long32 = duration30.getStandardMinutes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period3 = period2.negated();
        int int4 = period2.getHours();
        org.joda.time.Period period6 = org.joda.time.Period.days(10);
        org.joda.time.Period period8 = period6.plusMonths((int) 'a');
        org.joda.time.Period period10 = period6.plusSeconds((int) (short) 100);
        org.joda.time.Period period12 = period10.minusMonths((int) 'a');
        org.joda.time.Period period13 = period2.withFields((org.joda.time.ReadablePeriod) period12);
        int[] intArray14 = period13.getValues();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, -97, 0, 10, 0, 0, 100, 0]");
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(10);
        org.joda.time.Period period3 = period1.withDays(6);
        java.lang.Class<?> wildcardClass4 = period1.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("P10W");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Hours hours1 = org.joda.time.Hours.hoursIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Hours hours3 = org.joda.time.Hours.hoursIn(readableInterval2);
        org.joda.time.Hours hours5 = hours3.multipliedBy(8);
        org.joda.time.Hours hours6 = hours1.plus(hours3);
        org.joda.time.Hours hours7 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType8 = hours7.getFieldType();
        org.joda.time.Hours hours9 = hours7.negated();
        org.joda.time.Hours hours10 = hours1.plus(hours7);
        org.joda.time.Days days11 = org.joda.time.Days.ONE;
        org.joda.time.Days days12 = org.joda.time.Days.ONE;
        int int13 = days11.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days12);
        org.joda.time.Days days15 = days11.multipliedBy(8);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hours1.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Hours cannot be compared to class org.joda.time.Days");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(days15);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT2M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withSecondsRemoved();
        org.joda.time.Period period6 = new org.joda.time.Period((-1L), (long) (byte) 1, periodType5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Period period15 = period11.minusSeconds((int) (byte) 100);
        org.joda.time.Days days16 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        org.joda.time.PeriodType periodType18 = periodType17.withHoursRemoved();
        org.joda.time.PeriodType periodType19 = periodType17.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.days();
        boolean boolean21 = periodType19.isSupported(durationFieldType20);
        int int22 = period11.get(durationFieldType20);
        org.joda.time.Period period24 = period11.withHours(1);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period29 = period27.minusMonths(0);
        org.joda.time.Period period31 = period27.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType32 = period27.getPeriodType();
        org.joda.time.PeriodType periodType33 = periodType32.withMinutesRemoved();
        java.lang.String str34 = periodType33.toString();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((java.lang.Object) period11, periodType33, chronology35);
        org.joda.time.PeriodType periodType37 = periodType33.withHoursRemoved();
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType33);
        org.joda.time.Period period40 = period38.withMillis(14400);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period41 = period6.minus((org.joda.time.ReadablePeriod) period40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str34, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period40);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.Days days3 = period2.toStandardDays();
        org.joda.time.Days days5 = days3.minus(7);
        org.joda.time.Days days7 = days3.plus((-97));
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days7);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
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
        java.lang.Class<?> wildcardClass21 = duration15.getClass();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days4 = days0.minus(days3);
        org.joda.time.Days days6 = days0.minus(0);
        int int7 = days6.getDays();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod2 = hours1.toMutablePeriod();
        org.joda.time.Duration duration3 = hours1.toStandardDuration();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        int int1 = hours0.getHours();
        org.joda.time.Hours hours3 = hours0.dividedBy(8);
        org.joda.time.Hours hours4 = null;
        org.joda.time.Hours hours5 = hours0.plus(hours4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = hours5.getFieldType(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
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
        java.util.Locale locale20 = null;
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter2.withLocale(locale20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableInstant22, readableDuration23);
        org.joda.time.Period period26 = period24.minusYears(0);
        org.joda.time.Days days27 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period24);
        org.joda.time.MutablePeriod mutablePeriod28 = period24.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod28, "P35W", 52);
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
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(mutablePeriod28);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration1 = minutes0.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes2 = minutes0.negated();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(7);
        org.joda.time.Hours hours3 = hours1.dividedBy((-95));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = hours1.getFieldType(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        org.joda.time.format.PeriodPrinter periodPrinter2 = null;
        org.joda.time.format.PeriodParser periodParser3 = null;
        org.joda.time.format.PeriodFormatter periodFormatter4 = new org.joda.time.format.PeriodFormatter(periodPrinter2, periodParser3);
        boolean boolean5 = periodFormatter4.isParser();
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds9 = seconds7.plus(seconds8);
        org.joda.time.PeriodType periodType10 = seconds7.getPeriodType();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period13.negated();
        org.joda.time.DurationFieldType durationFieldType16 = period13.getFieldType((int) (short) 1);
        int int17 = periodType10.indexOf(durationFieldType16);
        org.joda.time.Period period18 = new org.joda.time.Period((long) ' ', periodType10);
        org.joda.time.format.PeriodFormatter periodFormatter19 = periodFormatter4.withParseType(periodType10);
        org.joda.time.PeriodType periodType20 = periodType10.withDaysRemoved();
        org.joda.time.PeriodType periodType21 = periodType20.withSecondsRemoved();
        org.joda.time.PeriodType periodType22 = periodType20.withHoursRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period23 = new org.joda.time.Period(1298798109705600000L, (long) (-1), periodType22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1298798109705600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
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
        int int11 = period10.getYears();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100000L + "'", long8 == 100000L);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
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
        boolean boolean74 = duration20.isShorterThan((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Minutes minutes75 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period78 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period80 = period78.minusMonths(0);
        org.joda.time.Minutes minutes81 = period80.toStandardMinutes();
        org.joda.time.Minutes minutes83 = minutes81.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes84 = minutes75.minus(minutes81);
        org.joda.time.Period period87 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period89 = period87.minusMonths(0);
        org.joda.time.Minutes minutes90 = period89.toStandardMinutes();
        org.joda.time.Minutes minutes92 = minutes90.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology93 = null;
        org.joda.time.Period period94 = new org.joda.time.Period((java.lang.Object) minutes90, chronology93);
        org.joda.time.Minutes minutes95 = minutes75.minus(minutes90);
        org.joda.time.Duration duration96 = minutes75.toStandardDuration();
        org.joda.time.Chronology chronology97 = null;
        org.joda.time.Period period98 = new org.joda.time.Period((java.lang.Object) duration96, chronology97);
        org.joda.time.Duration duration99 = duration53.minus((org.joda.time.ReadableDuration) duration96);
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
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(minutes75);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(minutes81);
        org.junit.Assert.assertNotNull(minutes83);
        org.junit.Assert.assertNotNull(minutes84);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(minutes90);
        org.junit.Assert.assertNotNull(minutes92);
        org.junit.Assert.assertNotNull(minutes95);
        org.junit.Assert.assertNotNull(duration96);
        org.junit.Assert.assertNotNull(duration99);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period5.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period5.minusDays((-36));
        org.joda.time.Period period12 = period5.plusSeconds((-1));
        int int13 = period5.getYears();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
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
        java.util.Locale locale10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter2.withLocale(locale10);
        boolean boolean12 = periodFormatter11.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = periodFormatter11.parsePeriod("P-1W");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNull(periodType8);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("months");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"months\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksIn(readableInterval1);
        boolean boolean3 = weeks0.isLessThan(weeks2);
        org.joda.time.Weeks weeks5 = weeks2.multipliedBy((int) (short) 100);
        org.joda.time.Period period6 = weeks2.toPeriod();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withSecondsRemoved();
        org.joda.time.Period period8 = duration2.toPeriodFrom(readableInstant3, periodType5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) (short) 1, periodType5, chronology9);
        int int11 = period10.getSeconds();
        org.joda.time.Seconds seconds12 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds14 = seconds12.plus(seconds13);
        org.joda.time.Seconds seconds16 = seconds12.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds19 = seconds17.plus(seconds18);
        java.lang.String str20 = seconds17.toString();
        org.joda.time.DurationFieldType durationFieldType21 = seconds17.getFieldType();
        java.lang.String str22 = durationFieldType21.getName();
        boolean boolean23 = seconds12.isSupported(durationFieldType21);
        org.joda.time.Chronology chronology24 = null;
        boolean boolean25 = durationFieldType21.isSupported(chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period27 = period10.withFieldAdded(durationFieldType21, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT2S" + "'", str20, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "seconds" + "'", str22, "seconds");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksIn(readableInterval1);
        boolean boolean3 = weeks0.isLessThan(weeks2);
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks6 = weeks4.dividedBy(1);
        boolean boolean7 = weeks0.isGreaterThan(weeks6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds8 = weeks6.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 604800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Period period4 = period1.minusMonths(100);
        org.joda.time.Period period6 = period4.minusYears((int) (short) 10);
        org.joda.time.Period period8 = period6.withMillis((-36));
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Period period15 = period11.minusSeconds((int) (byte) 100);
        org.joda.time.DurationFieldType[] durationFieldTypeArray16 = period11.getFieldTypes();
        org.joda.time.Period period17 = period8.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period19 = period17.minusYears((int) '4');
        int[] intArray20 = period19.getValues();
        org.joda.time.Period period21 = period19.normalizedStandard();
        int int22 = period21.getSeconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration23 = period21.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(durationFieldTypeArray16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-62, -100, 0, 10, 0, 0, 0, -72]");
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withYearsRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withYearsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        int int10 = periodType9.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
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
        org.joda.time.format.PeriodParser periodParser10 = periodFormatter7.getParser();
        org.joda.time.PeriodType periodType11 = periodFormatter7.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = periodFormatter7.parsePeriod("P0W");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(periodParser10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(10);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        int int3 = weeks2.getWeeks();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.PeriodType periodType3 = seconds0.getPeriodType();
        int int4 = seconds0.size();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.seconds((int) (byte) 10);
        boolean boolean8 = seconds6.equals((java.lang.Object) "PeriodType[StandardNoMinutes]");
        org.joda.time.Seconds seconds9 = seconds0.plus(seconds6);
        org.joda.time.Seconds seconds11 = seconds9.plus((int) (short) 0);
        org.joda.time.Duration duration12 = seconds11.toStandardDuration();
        long long13 = duration12.getStandardHours();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Days days10 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType11 = days10.getPeriodType();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withSecondsRemoved();
        org.joda.time.Period period14 = duration8.toPeriodFrom(readableInstant9, periodType11);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.minutes();
        boolean boolean16 = periodType11.equals((java.lang.Object) durationFieldType15);
        java.lang.String str17 = durationFieldType15.getName();
        org.joda.time.Period period19 = period6.withFieldAdded(durationFieldType15, 8);
        org.joda.time.Days days20 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period19);
        java.lang.Class<?> wildcardClass21 = days20.getClass();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "minutes" + "'", str17, "minutes");
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks((-95));
        org.joda.time.Weeks weeks3 = weeks1.plus((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = weeks3.getValue(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays(1298798109705600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1298798109705600000 * 86400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.parseSeconds("PT100S");
        org.joda.time.Duration duration8 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration10 = duration8.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration10, readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Interval interval14 = duration10.toIntervalFrom(readableInstant13);
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval14);
        org.joda.time.Seconds seconds17 = seconds15.plus(0);
        org.joda.time.Seconds seconds18 = seconds5.plus(seconds17);
        org.joda.time.MutablePeriod mutablePeriod19 = seconds5.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod19, "PT97S", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(mutablePeriod19);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
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
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardSeconds((long) 10);
        org.joda.time.Period period27 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period29 = period27.minusMonths(0);
        org.joda.time.Minutes minutes30 = period29.toStandardMinutes();
        org.joda.time.Duration duration31 = minutes30.toStandardDuration();
        org.joda.time.Minutes minutes33 = minutes30.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration34 = minutes30.toStandardDuration();
        org.joda.time.Period period37 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period39 = period37.minusMonths(0);
        org.joda.time.Minutes minutes40 = period39.toStandardMinutes();
        org.joda.time.Duration duration41 = minutes40.toStandardDuration();
        org.joda.time.Period period42 = duration41.toPeriod();
        boolean boolean43 = duration34.isLongerThan((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Interval interval45 = duration41.toIntervalTo(readableInstant44);
        boolean boolean46 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration41);
        int int47 = duration6.compareTo((org.joda.time.ReadableDuration) duration24);
        java.lang.String str48 = duration24.toString();
        long long49 = duration24.getStandardMinutes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PT10S" + "'", str48, "PT10S");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        org.joda.time.Period period1 = org.joda.time.Period.seconds(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        org.joda.time.Period period2 = new org.joda.time.Period((-128849018880000L), (-1L));
        org.joda.time.DurationFieldType[] durationFieldTypeArray3 = period2.getFieldTypes();
        int int4 = period2.getSeconds();
        int int5 = period2.getMillis();
        org.junit.Assert.assertNotNull(durationFieldTypeArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 999 + "'", int5 == 999);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days3 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days4 = days0.minus(days3);
        org.joda.time.Days days6 = days3.minus((int) '#');
        org.joda.time.Days days7 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days8 = days6.plus(days7);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Days days12 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType13 = days12.getPeriodType();
        org.joda.time.PeriodType periodType14 = periodType13.withHoursRemoved();
        org.joda.time.PeriodType periodType15 = periodType13.withSecondsRemoved();
        org.joda.time.Period period16 = duration10.toPeriodFrom(readableInstant11, periodType13);
        org.joda.time.Days days17 = duration10.toStandardDays();
        org.joda.time.Days days18 = org.joda.time.Days.MIN_VALUE;
        boolean boolean19 = days17.isLessThan(days18);
        java.lang.String str20 = days18.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days21 = days6.plus(days18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -30 + -2147483648");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P5D" + "'", str1, "P5D");
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "P-2147483648D" + "'", str20, "P-2147483648D");
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) '#');
        int int2 = seconds1.getSeconds();
        org.joda.time.Seconds seconds4 = seconds1.dividedBy((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = seconds4.getValue((-2147483646));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -2147483646");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(seconds4);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        org.joda.time.Period period1 = org.joda.time.Period.millis(0);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Days days4 = days2.plus((int) ' ');
        org.joda.time.Duration duration7 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration9 = duration7.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Interval interval13 = duration9.toIntervalFrom(readableInstant12);
        org.joda.time.Days days14 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval13);
        org.joda.time.Days days16 = days14.minus((int) '4');
        org.joda.time.Duration duration17 = days14.toStandardDuration();
        org.joda.time.Days days18 = org.joda.time.Days.FIVE;
        java.lang.String str19 = days18.toString();
        org.joda.time.Days days21 = days18.multipliedBy((int) (byte) -1);
        org.joda.time.Days days22 = days18.negated();
        org.joda.time.Days days23 = org.joda.time.Days.ONE;
        org.joda.time.Days days24 = org.joda.time.Days.ONE;
        int int25 = days23.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days24);
        org.joda.time.Days days27 = days24.multipliedBy((int) '#');
        org.joda.time.Days days28 = days22.minus(days24);
        org.joda.time.MutablePeriod mutablePeriod29 = days22.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod30 = days22.toMutablePeriod();
        boolean boolean31 = days14.isGreaterThan(days22);
        org.joda.time.Days days32 = days2.plus(days14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType34 = days2.getFieldType(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P5D" + "'", str19, "P5D");
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(mutablePeriod30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(days32);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(52000L, 0L, chronology2);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
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
        org.joda.time.Period period16 = period14.plusMillis((-97));
        int int17 = period14.getHours();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
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
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Minutes minutes22 = period21.toStandardMinutes();
        org.joda.time.Duration duration23 = minutes22.toStandardDuration();
        boolean boolean24 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(readableInstant25, readableInstant26);
        org.joda.time.Duration duration28 = duration16.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration29 = duration16.toDuration();
        org.joda.time.Duration duration30 = duration9.plus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period36 = period34.minusMonths(0);
        org.joda.time.Minutes minutes37 = period36.toStandardMinutes();
        org.joda.time.Duration duration38 = minutes37.toStandardDuration();
        org.joda.time.Period period39 = duration38.toPeriod();
        org.joda.time.Duration duration41 = duration38.plus((long) (byte) 0);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration41);
        org.joda.time.Duration duration43 = duration9.plus((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Interval interval45 = duration43.toIntervalTo(readableInstant44);
        long long46 = duration43.getStandardMinutes();
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
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Period period70 = duration56.toPeriodFrom(readableInstant69);
        org.joda.time.Period period71 = period70.negated();
        org.joda.time.Period period73 = period71.minusHours(8);
        org.joda.time.PeriodType periodType74 = period71.getPeriodType();
        org.joda.time.Period period76 = period71.plusSeconds((-36));
        org.joda.time.Period period78 = period71.minusYears(52);
        boolean boolean79 = duration43.equals((java.lang.Object) 52);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
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
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
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
        org.joda.time.Duration duration29 = duration6.plus((long) (short) 100);
        org.joda.time.Duration duration31 = duration29.minus((long) '4');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Interval interval33 = duration31.toIntervalTo(readableInstant32);
        long long34 = duration31.getStandardDays();
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
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
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
        org.joda.time.Weeks weeks17 = weeks11.multipliedBy((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds18 = weeks17.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483647 * 604800");
        } catch (java.lang.ArithmeticException e) {
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
        org.junit.Assert.assertNotNull(weeks17);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType3 = minutes2.getFieldType();
        int int4 = minutes2.getMinutes();
        org.joda.time.Days days5 = minutes2.toStandardDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14400 + "'", int4 == 14400);
        org.junit.Assert.assertNotNull(days5);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withSecondsRemoved();
        java.lang.String str5 = periodType3.toString();
        org.joda.time.Period period6 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType3);
        org.joda.time.Days days7 = period6.toStandardDays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = period6.plusYears(5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PeriodType[Days]" + "'", str5, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(days7);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        org.joda.time.Hours hours0 = org.joda.time.Hours.EIGHT;
        int int1 = hours0.getHours();
        org.joda.time.Hours hours2 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.Hours hours3 = hours0.minus(hours2);
        int int4 = hours3.size();
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeks(14400);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hours3.compareTo((org.joda.time.base.BaseSingleFieldPeriod) weeks6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Hours cannot be compared to class org.joda.time.Weeks");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(weeks6);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds4 = seconds2.plus(seconds3);
        org.joda.time.Seconds seconds6 = seconds2.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds7 = seconds1.plus(seconds2);
        org.joda.time.Seconds seconds9 = seconds1.plus((int) '4');
        org.joda.time.Chronology chronology10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) '4', chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        org.joda.time.Period period1 = org.joda.time.Period.months(2147483645);
        org.joda.time.Period period3 = org.joda.time.Period.months((int) '#');
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        org.joda.time.Duration duration12 = minutes11.toStandardDuration();
        org.joda.time.Minutes minutes14 = minutes11.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration15 = minutes11.toStandardDuration();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period19 = period18.negated();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = period19.toDurationTo(readableInstant20);
        boolean boolean22 = duration15.isShorterThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Duration duration25 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration26 = duration21.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period31 = period29.minusMonths(0);
        org.joda.time.Period period33 = period29.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType34 = period29.getPeriodType();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = duration21.toPeriod(periodType34, chronology35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant4, readableInstant5, periodType34);
        org.joda.time.Period period38 = period3.plus((org.joda.time.ReadablePeriod) period37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period39 = period1.plus((org.joda.time.ReadablePeriod) period3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483645 + 35");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
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
        org.joda.time.Days days31 = org.joda.time.Days.FIVE;
        java.lang.String str32 = days31.toString();
        org.joda.time.Days days34 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days35 = days31.minus(days34);
        org.joda.time.DurationFieldType durationFieldType36 = days31.getFieldType();
        boolean boolean37 = periodType24.isSupported(durationFieldType36);
        org.joda.time.PeriodType periodType38 = periodType24.withDaysRemoved();
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
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "P5D" + "'", str32, "P5D");
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(periodType38);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant2, readableDuration3);
        org.joda.time.Period period6 = period4.minusYears(0);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.MutablePeriod mutablePeriod8 = period4.toMutablePeriod();
        org.joda.time.PeriodType periodType9 = period4.getPeriodType();
        org.joda.time.Period period10 = new org.joda.time.Period((long) '4', 1298798109705600000L, periodType9);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Minutes minutes7 = minutes5.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes9 = minutes5.plus(8);
        org.joda.time.Minutes minutes11 = minutes5.dividedBy((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes13 = minutes11.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes11);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration4 = duration1.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Period period5 = duration3.toPeriod();
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        org.joda.time.Duration duration12 = minutes11.toStandardDuration();
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period15.minusMonths(0);
        org.joda.time.Minutes minutes18 = period17.toStandardMinutes();
        org.joda.time.Duration duration19 = minutes18.toStandardDuration();
        boolean boolean20 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Period period21 = duration19.toPeriod();
        long long22 = duration19.getStandardSeconds();
        org.joda.time.Duration duration23 = duration19.toDuration();
        org.joda.time.Duration duration25 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration28 = duration25.plus((org.joda.time.ReadableDuration) duration27);
        long long29 = duration27.getMillis();
        int int30 = duration19.compareTo((org.joda.time.ReadableDuration) duration27);
        long long31 = duration27.getStandardDays();
        org.joda.time.Duration duration34 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration36 = duration34.plus((long) (-1));
        org.joda.time.Duration duration37 = duration27.plus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Duration duration38 = duration3.plus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration40 = duration38.minus((long) (-2));
        long long41 = duration38.getStandardSeconds();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 6000000L + "'", long29 == 6000000L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 12000L + "'", long41 == 12000L);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableDuration1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period2.toDurationTo(readableInstant3);
        org.joda.time.Hours hours5 = duration4.toStandardHours();
        org.joda.time.Hours hours6 = hours5.negated();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours6);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
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
        org.joda.time.Period period21 = period19.plusWeeks(6);
        java.lang.Class<?> wildcardClass22 = period21.getClass();
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
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (byte) 100, (int) (short) 100, (int) (short) -1, (int) (short) 100);
        org.joda.time.Period period5 = period4.toPeriod();
        java.lang.Class<?> wildcardClass6 = period4.getClass();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
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
        org.joda.time.Days days28 = org.joda.time.Days.FIVE;
        java.lang.String str29 = days28.toString();
        org.joda.time.Days days31 = days28.multipliedBy((int) (byte) -1);
        org.joda.time.Days days32 = days28.negated();
        org.joda.time.Days days33 = org.joda.time.Days.ONE;
        org.joda.time.Days days34 = org.joda.time.Days.ONE;
        int int35 = days33.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days34);
        org.joda.time.Days days37 = days34.multipliedBy((int) '#');
        org.joda.time.Days days38 = days32.minus(days34);
        org.joda.time.MutablePeriod mutablePeriod39 = days32.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod40 = days32.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int43 = periodFormatter26.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod40, "months", (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "YearMonthDay" + "'", str25, "YearMonthDay");
        org.junit.Assert.assertNotNull(periodFormatter26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "P5D" + "'", str29, "P5D");
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(mutablePeriod39);
        org.junit.Assert.assertNotNull(mutablePeriod40);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
        org.joda.time.Duration duration8 = minutes7.toStandardDuration();
        org.joda.time.Minutes minutes10 = minutes7.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration11 = minutes7.toStandardDuration();
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period15 = period14.negated();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = period15.toDurationTo(readableInstant16);
        boolean boolean18 = duration11.isShorterThan((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration22 = duration17.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Period period25 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period27 = period25.minusMonths(0);
        org.joda.time.Period period29 = period25.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType30 = period25.getPeriodType();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = duration17.toPeriod(periodType30, chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period33 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period32);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.days();
        boolean boolean8 = periodType6.isSupported(durationFieldType7);
        org.joda.time.PeriodType periodType9 = periodType6.withMinutesRemoved();
        int int10 = periodType6.size();
        org.joda.time.Period period11 = duration1.toPeriodFrom(readableInstant2, periodType6);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Days days13 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        org.joda.time.PeriodType periodType15 = periodType14.withSecondsRemoved();
        org.joda.time.PeriodType periodType16 = periodType14.withYearsRemoved();
        java.lang.String str17 = periodType16.toString();
        org.joda.time.PeriodType periodType18 = periodType16.withHoursRemoved();
        java.lang.String str19 = periodType18.toString();
        org.joda.time.Period period20 = duration1.toPeriodTo(readableInstant12, periodType18);
        org.joda.time.PeriodType periodType21 = periodType18.withDaysRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withSecondsRemoved();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PeriodType[Days]" + "'", str17, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PeriodType[Days]" + "'", str19, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
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
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) weeks16);
        org.joda.time.PeriodType periodType18 = weeks16.getPeriodType();
        int int19 = weeks16.getWeeks();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        int int2 = period1.getMillis();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Duration duration4 = period1.toDurationFrom(readableInstant3);
        org.joda.time.Period period6 = period1.minusYears((int) ' ');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period5 = period2.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod6 = period5.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Duration duration8 = period5.toDurationFrom(readableInstant7);
        org.joda.time.Period period10 = period5.minusDays((-36));
        org.joda.time.Period period12 = period5.plusSeconds((-1));
        int int13 = period12.getHours();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
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
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Minutes minutes22 = period21.toStandardMinutes();
        org.joda.time.Duration duration23 = minutes22.toStandardDuration();
        boolean boolean24 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(readableInstant25, readableInstant26);
        org.joda.time.Duration duration28 = duration16.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration29 = duration16.toDuration();
        org.joda.time.Duration duration30 = duration9.plus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration9, readableInstant31);
        org.joda.time.Period period34 = period32.withYears(100);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds(100);
        org.joda.time.Period period8 = period6.plusYears(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours9 = period8.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        org.joda.time.Duration duration10 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration12 = duration10.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Interval interval16 = duration12.toIntervalFrom(readableInstant15);
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval16);
        org.joda.time.PeriodType periodType18 = weeks17.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period((int) (short) 100, 7, 268435465, 2147483647, 2147483647, 11, 52, (int) (byte) 1, periodType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
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
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str20 = periodType19.getName();
        org.joda.time.Period period21 = duration7.toPeriodTo(readableInstant18, periodType19);
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period26 = period24.minusMonths(0);
        org.joda.time.Period period27 = period24.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod28 = period27.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = period27.toDurationFrom(readableInstant29);
        org.joda.time.Period period31 = period27.normalizedStandard();
        org.joda.time.DurationFieldType durationFieldType33 = period31.getFieldType(0);
        int int34 = periodType19.indexOf(durationFieldType33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period((long) 52, periodType19, chronology35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType38 = periodType19.getFieldType(87);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 87");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "YearMonthDay" + "'", str20, "YearMonthDay");
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(mutablePeriod28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
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
        java.util.Locale locale20 = periodFormatter19.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod22 = periodFormatter19.parseMutablePeriod("PT0M");
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
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNull(locale20);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT0M");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = hours1.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ONE;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds3 = seconds1.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType4 = seconds1.getFieldType();
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = seconds5.plus(seconds6);
        org.joda.time.Seconds seconds9 = seconds5.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds10 = seconds1.plus(seconds5);
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds13 = seconds11.multipliedBy(10);
        org.joda.time.DurationFieldType durationFieldType14 = seconds11.getFieldType();
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds17 = seconds15.plus(seconds16);
        org.joda.time.Seconds seconds19 = seconds15.multipliedBy((int) ' ');
        org.joda.time.Seconds seconds20 = seconds11.plus(seconds15);
        boolean boolean21 = seconds10.isGreaterThan(seconds15);
        org.joda.time.Seconds seconds23 = seconds10.multipliedBy((-5));
        boolean boolean24 = seconds0.isLessThan(seconds10);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withHoursRemoved();
        org.joda.time.PeriodType periodType5 = periodType3.withSecondsRemoved();
        org.joda.time.PeriodType periodType6 = periodType3.withMinutesRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(10L, (long) (byte) -1, periodType7, chronology8);
        int int10 = period9.getDays();
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
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
        org.joda.time.Duration duration26 = duration25.toDuration();
        long long27 = duration26.getStandardMinutes();
        org.joda.time.Duration duration29 = new org.joda.time.Duration((long) 100);
        boolean boolean30 = duration26.isShorterThan((org.joda.time.ReadableDuration) duration29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds31 = duration26.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -128849018880");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-2147483648L) + "'", long27 == (-2147483648L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) (short) -1);
        org.joda.time.Weeks weeks2 = days1.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = days1.getValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter3.withLocale(locale5);
        org.joda.time.PeriodType periodType7 = periodFormatter3.getParseType();
        boolean boolean8 = periodFormatter3.isParser();
        boolean boolean9 = periodFormatter3.isParser();
        boolean boolean10 = periodFormatter3.isPrinter();
        org.joda.time.PeriodType periodType11 = periodFormatter3.getParseType();
        org.joda.time.PeriodType periodType12 = periodFormatter3.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = org.joda.time.Period.parse("PT2S", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNull(periodType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(periodType11);
        org.junit.Assert.assertNull(periodType12);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Period period14 = period10.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType15 = period10.getPeriodType();
        org.joda.time.PeriodType periodType16 = periodType15.withMinutesRemoved();
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Minutes minutes22 = period21.toStandardMinutes();
        org.joda.time.Duration duration23 = minutes22.toStandardDuration();
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period28 = period26.minusMonths(0);
        org.joda.time.Minutes minutes29 = period28.toStandardMinutes();
        org.joda.time.Duration duration30 = minutes29.toStandardDuration();
        org.joda.time.Duration duration32 = duration23.withDurationAdded((org.joda.time.ReadableDuration) duration30, (int) (short) 100);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = duration32.toPeriod(chronology33);
        long long35 = duration32.getMillis();
        org.joda.time.Duration duration38 = duration32.withDurationAdded((long) 52, (-2));
        boolean boolean39 = periodType16.equals((java.lang.Object) duration32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period40 = new org.joda.time.Period(13, 0, (int) (short) 1, 13, 0, 13, (-36), (-2147483646), periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration1 = minutes0.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -128849018880");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
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
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Minutes minutes22 = period21.toStandardMinutes();
        org.joda.time.Duration duration23 = minutes22.toStandardDuration();
        boolean boolean24 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = new org.joda.time.Duration(readableInstant25, readableInstant26);
        org.joda.time.Duration duration28 = duration16.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration29 = duration16.toDuration();
        org.joda.time.Duration duration30 = duration9.plus((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period36 = period34.minusMonths(0);
        org.joda.time.Minutes minutes37 = period36.toStandardMinutes();
        org.joda.time.Duration duration38 = minutes37.toStandardDuration();
        org.joda.time.Period period39 = duration38.toPeriod();
        org.joda.time.Duration duration41 = duration38.plus((long) (byte) 0);
        org.joda.time.Period period42 = new org.joda.time.Period(readableInstant31, (org.joda.time.ReadableDuration) duration41);
        org.joda.time.Duration duration43 = duration9.plus((org.joda.time.ReadableDuration) duration41);
        long long44 = duration41.getStandardHours();
        org.joda.time.Duration duration46 = duration41.withMillis(0L);
        java.lang.String str47 = duration46.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(minutes37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PT0S" + "'", str47, "PT0S");
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) 1);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod17 = periodFormatter13.parseMutablePeriod("P0D");
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
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str2 = seconds1.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        int int8 = period7.getYears();
        org.joda.time.Period period9 = period7.toPeriod();
        org.joda.time.Seconds seconds10 = period7.toStandardSeconds();
        boolean boolean11 = seconds1.isLessThan(seconds10);
        org.joda.time.Duration duration12 = seconds10.toStandardDuration();
        org.joda.time.Duration duration15 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration17 = duration15.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Seconds seconds20 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds22 = seconds20.plus(seconds21);
        org.joda.time.PeriodType periodType23 = seconds20.getPeriodType();
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period27 = period26.negated();
        org.joda.time.DurationFieldType durationFieldType29 = period26.getFieldType((int) (short) 1);
        int int30 = periodType23.indexOf(durationFieldType29);
        org.joda.time.Period period31 = new org.joda.time.Period((long) ' ', periodType23);
        org.joda.time.Period period32 = duration15.toPeriodTo(readableInstant18, periodType23);
        org.joda.time.Period period33 = duration12.toPeriod(periodType23);
        org.joda.time.DurationFieldType[] durationFieldTypeArray34 = period33.getFieldTypes();
        int int35 = period33.getSeconds();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(durationFieldTypeArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration4 = duration1.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration6 = duration1.minus((long) (-1));
        org.joda.time.ReadableDuration readableDuration7 = null;
        boolean boolean8 = duration1.isShorterThan(readableDuration7);
        org.joda.time.Minutes minutes9 = duration1.toStandardMinutes();
        org.joda.time.Hours hours10 = minutes9.toStandardHours();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(hours10);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.Period period4 = period1.withFields(readablePeriod3);
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period7.negated();
        int int9 = period7.getHours();
        org.joda.time.Period period11 = org.joda.time.Period.days(10);
        org.joda.time.Period period13 = period11.plusMonths((int) 'a');
        org.joda.time.Period period15 = period11.plusSeconds((int) (short) 100);
        org.joda.time.Period period17 = period15.minusMonths((int) 'a');
        org.joda.time.Period period18 = period7.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period19 = period1.minus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period21 = period1.withSeconds(1);
        org.joda.time.Period period23 = period21.minusWeeks(35);
        int int24 = period23.getWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-35) + "'", int24 == (-35));
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = days0.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 24");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
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
        org.joda.time.Hours hours21 = org.joda.time.Hours.ONE;
        java.lang.String str22 = hours21.toString();
        org.joda.time.Hours hours23 = hours21.negated();
        org.joda.time.Hours hours24 = hours20.minus(hours23);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = hours23.getValue((-95));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -95");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT1H" + "'", str22, "PT1H");
        org.junit.Assert.assertNotNull(hours23);
        org.junit.Assert.assertNotNull(hours24);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        org.joda.time.Period period1 = new org.joda.time.Period(100000L);
        org.joda.time.Period period3 = period1.minusYears(100);
        org.joda.time.Period period5 = period1.withHours((-2));
        org.joda.time.Period period7 = period1.minusWeeks((int) (short) 0);
        java.lang.String str8 = period7.toString();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT1M40S" + "'", str8, "PT1M40S");
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
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
        org.joda.time.Period period16 = period2.plusHours((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = period16.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("years");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"years\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getStandardHours();
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = duration1.toPeriod(periodType10, chronology11);
        int int13 = period12.getWeeks();
        org.joda.time.Period period15 = period12.plusWeeks((int) (byte) 0);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Minutes minutes23 = minutes21.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes25 = minutes21.plus(8);
        org.joda.time.Minutes minutes27 = minutes25.dividedBy((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period28 = period12.minus((org.joda.time.ReadablePeriod) minutes25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(minutes27);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.seconds();
        boolean boolean8 = period6.isSupported(durationFieldType7);
        int int9 = period6.getSeconds();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        org.joda.time.Period period1 = org.joda.time.Period.years(0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
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
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearDay();
        boolean boolean17 = period15.equals((java.lang.Object) periodType16);
        int int18 = period15.getHours();
        org.joda.time.Period period20 = period15.minusSeconds((int) (short) 0);
        int int21 = period15.getHours();
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
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
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
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType28);
        org.joda.time.PeriodType periodType32 = periodType28.withMinutesRemoved();
        org.joda.time.PeriodType periodType33 = periodType28.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period34 = new org.joda.time.Period(36, 35, (int) '#', (-35), 0, 100, 11, (-2147483646), periodType28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType33);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) '#');
        org.joda.time.Period period3 = period1.withWeeks((int) (byte) 0);
        org.joda.time.Period period5 = period1.plusMillis(0);
        org.joda.time.Period period7 = period5.withMonths((int) (short) -1);
        org.joda.time.Period period9 = period7.minusMonths((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days10 = period7.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType();
        org.joda.time.Hours hours4 = hours0.dividedBy((-95));
        org.joda.time.DurationFieldType durationFieldType5 = hours0.getFieldType();
        org.joda.time.PeriodType periodType6 = hours0.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours8 = hours0.multipliedBy(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) '4');
        org.joda.time.Days days2 = duration1.toStandardDays();
        org.joda.time.Hours hours3 = days2.toStandardHours();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(hours3);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks3 = weeks2.negated();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        boolean boolean7 = weeks4.isLessThan(weeks6);
        boolean boolean8 = weeks3.isGreaterThan(weeks6);
        org.joda.time.PeriodType periodType9 = weeks3.getPeriodType();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 10, periodType9, chronology10);
        java.lang.Class<?> wildcardClass12 = period11.getClass();
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        int int5 = period4.getYears();
        org.joda.time.Period period6 = period4.toPeriod();
        org.joda.time.Period period8 = period4.minusYears((int) (byte) 10);
        org.joda.time.Period period10 = period8.plusHours((int) (byte) 10);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.withDays(8);
        int int3 = period0.getSeconds();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.seconds();
        int int5 = period0.get(durationFieldType4);
        org.joda.time.Period period7 = period0.minusMillis((int) (byte) 10);
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.days();
        boolean boolean14 = periodType12.isSupported(durationFieldType13);
        org.joda.time.PeriodType periodType15 = periodType12.withMinutesRemoved();
        org.joda.time.Period period16 = new org.joda.time.Period((-128849018880L), periodType12);
        org.joda.time.PeriodType periodType17 = periodType12.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = period7.withPeriodType(periodType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
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
        java.lang.StringBuffer stringBuffer15 = null;
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str18 = seconds17.toString();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter7.printTo(stringBuffer15, (org.joda.time.ReadablePeriod) seconds17);
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
        org.junit.Assert.assertNull(periodPrinter14);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT0S" + "'", str18, "PT0S");
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
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
        org.joda.time.Duration duration27 = duration26.toDuration();
        long long28 = duration26.getStandardHours();
        org.joda.time.Duration duration29 = duration26.toDuration();
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds31 = duration29.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -128849018880");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-35791394L) + "'", long28 == (-35791394L));
        org.junit.Assert.assertNotNull(duration29);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Period period7 = period3.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType8 = period3.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (short) -1, periodType10, chronology11);
        org.joda.time.Period period14 = period12.plusSeconds(14400);
        java.lang.String str15 = period12.toString();
        org.joda.time.Hours hours16 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Hours hours17 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Hours hours19 = hours17.minus(2147483645);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PT0.001S" + "'", str15, "PT0.001S");
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(hours19);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT0.001S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        org.joda.time.Days days1 = org.joda.time.Days.days(52);
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.Period period4 = org.joda.time.Period.millis(0);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Days days7 = days5.plus((int) ' ');
        org.joda.time.Duration duration10 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration12 = duration10.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration12, readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Interval interval16 = duration12.toIntervalFrom(readableInstant15);
        org.joda.time.Days days17 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval16);
        org.joda.time.Days days19 = days17.minus((int) '4');
        org.joda.time.Duration duration20 = days17.toStandardDuration();
        org.joda.time.Days days21 = org.joda.time.Days.FIVE;
        java.lang.String str22 = days21.toString();
        org.joda.time.Days days24 = days21.multipliedBy((int) (byte) -1);
        org.joda.time.Days days25 = days21.negated();
        org.joda.time.Days days26 = org.joda.time.Days.ONE;
        org.joda.time.Days days27 = org.joda.time.Days.ONE;
        int int28 = days26.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days27);
        org.joda.time.Days days30 = days27.multipliedBy((int) '#');
        org.joda.time.Days days31 = days25.minus(days27);
        org.joda.time.MutablePeriod mutablePeriod32 = days25.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod33 = days25.toMutablePeriod();
        boolean boolean34 = days17.isGreaterThan(days25);
        org.joda.time.Days days35 = days5.plus(days17);
        boolean boolean36 = days1.equals((java.lang.Object) days5);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "P5D" + "'", str22, "P5D");
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(mutablePeriod33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (-36));
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period2);
        org.joda.time.Hours hours4 = minutes3.toStandardHours();
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(hours4);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = seconds6.plus(seconds7);
        org.joda.time.PeriodType periodType9 = seconds6.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.DurationFieldType durationFieldType15 = period12.getFieldType((int) (short) 1);
        int int16 = periodType9.indexOf(durationFieldType15);
        org.joda.time.Period period17 = new org.joda.time.Period((long) ' ', periodType9);
        org.joda.time.format.PeriodFormatter periodFormatter18 = periodFormatter3.withParseType(periodType9);
        java.util.Locale locale19 = periodFormatter3.getLocale();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str21 = periodType20.getName();
        org.joda.time.PeriodType periodType22 = periodType20.withHoursRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter23 = periodFormatter3.withParseType(periodType20);
        java.util.Locale locale24 = periodFormatter3.getLocale();
        org.joda.time.Seconds seconds25 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds26 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds27 = seconds25.plus(seconds26);
        org.joda.time.PeriodType periodType28 = seconds25.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter29 = periodFormatter3.withParseType(periodType28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = org.joda.time.Period.parse("P-35W", periodFormatter29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter18);
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "YearMonthDay" + "'", str21, "YearMonthDay");
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodFormatter23);
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodFormatter29);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.PeriodType periodType3 = seconds0.getPeriodType();
        int int4 = seconds0.size();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.seconds((int) (byte) 10);
        boolean boolean8 = seconds6.equals((java.lang.Object) "PeriodType[StandardNoMinutes]");
        org.joda.time.Seconds seconds9 = seconds0.plus(seconds6);
        int int10 = seconds0.getSeconds();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
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
        org.joda.time.Duration duration29 = duration1.withDurationAdded((long) (short) -1, (int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant30 = null;
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
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Period period54 = duration40.toPeriodFrom(readableInstant53);
        int int55 = period54.getMinutes();
        org.joda.time.Period period57 = period54.withHours(6);
        org.joda.time.PeriodType periodType58 = period54.getPeriodType();
        org.joda.time.Period period59 = duration1.toPeriodTo(readableInstant30, periodType58);
        org.joda.time.ReadableInstant readableInstant60 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval61 = duration1.toIntervalTo(readableInstant60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(duration29);
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
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(period59);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
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
        java.lang.String str25 = period23.toString();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT0S" + "'", str25, "PT0S");
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = seconds6.plus(seconds7);
        org.joda.time.PeriodType periodType9 = seconds6.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.DurationFieldType durationFieldType15 = period12.getFieldType((int) (short) 1);
        int int16 = periodType9.indexOf(durationFieldType15);
        org.joda.time.Period period17 = new org.joda.time.Period((long) ' ', periodType9);
        org.joda.time.format.PeriodFormatter periodFormatter18 = periodFormatter3.withParseType(periodType9);
        org.joda.time.PeriodType periodType19 = periodType9.withDaysRemoved();
        org.joda.time.Period period20 = new org.joda.time.Period(10L, periodType9);
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period23.negated();
        int int25 = period23.getHours();
        int int26 = period23.getMonths();
        org.joda.time.Period period28 = period23.withMonths(2147483647);
        org.joda.time.Weeks weeks29 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.Weeks weeks31 = org.joda.time.Weeks.weeksIn(readableInterval30);
        boolean boolean32 = weeks29.isLessThan(weeks31);
        org.joda.time.Weeks weeks34 = weeks31.multipliedBy((int) (short) 100);
        org.joda.time.Period period35 = period23.withFields((org.joda.time.ReadablePeriod) weeks34);
        org.joda.time.Duration duration36 = period23.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period37 = period20.plus((org.joda.time.ReadablePeriod) period23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(weeks34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration36);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
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
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.Duration duration64 = new org.joda.time.Duration(readableInstant62, readableInstant63);
        org.joda.time.Duration duration65 = duration53.minus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Duration duration66 = duration53.toDuration();
        org.joda.time.Period period69 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period71 = period69.minusMonths(0);
        org.joda.time.Minutes minutes72 = period71.toStandardMinutes();
        org.joda.time.Duration duration73 = minutes72.toStandardDuration();
        org.joda.time.Minutes minutes75 = minutes72.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration76 = minutes72.toStandardDuration();
        org.joda.time.Period period79 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period81 = period79.minusMonths(0);
        org.joda.time.Minutes minutes82 = period81.toStandardMinutes();
        org.joda.time.Duration duration83 = minutes82.toStandardDuration();
        org.joda.time.Period period84 = duration83.toPeriod();
        boolean boolean85 = duration76.isLongerThan((org.joda.time.ReadableDuration) duration83);
        org.joda.time.ReadableInstant readableInstant86 = null;
        org.joda.time.PeriodType periodType87 = org.joda.time.PeriodType.days();
        org.joda.time.Period period88 = duration76.toPeriodTo(readableInstant86, periodType87);
        org.joda.time.ReadableInstant readableInstant89 = null;
        org.joda.time.Period period90 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration76, readableInstant89);
        boolean boolean91 = duration66.isLongerThan((org.joda.time.ReadableDuration) duration76);
        long long92 = duration66.getMillis();
        org.joda.time.ReadableDuration readableDuration93 = null;
        org.joda.time.Duration duration95 = duration66.withDurationAdded(readableDuration93, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int96 = duration43.compareTo(readableDuration93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(minutes52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(minutes59);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(minutes72);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(minutes75);
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(minutes82);
        org.junit.Assert.assertNotNull(duration83);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(periodType87);
        org.junit.Assert.assertNotNull(period88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
        org.junit.Assert.assertNotNull(duration95);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
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
        long long17 = duration13.getStandardHours();
        org.joda.time.Duration duration19 = duration13.minus((long) (byte) 100);
        long long20 = duration19.getStandardSeconds();
        org.joda.time.Duration duration23 = duration19.withDurationAdded((long) 59, (int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval25 = duration19.toIntervalTo(readableInstant24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(duration23);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period32 = new org.joda.time.Period((java.lang.Object) periodType30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Hours hours2 = days0.toStandardHours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours4 = hours2.multipliedBy(2147483645);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 120 * 2147483645");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration1 = seconds0.toStandardDuration();
        org.joda.time.Hours hours2 = seconds0.toStandardHours();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
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
        org.joda.time.format.PeriodParser periodParser10 = periodFormatter7.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter11 = periodFormatter7.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = periodFormatter7.parsePeriod("P0W");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(periodParser10);
        org.junit.Assert.assertNull(periodPrinter11);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (byte) -1);
        long long2 = duration1.getMillis();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Hours hours4 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours6 = hours4.dividedBy(100);
        org.joda.time.Hours hours8 = hours6.multipliedBy((int) ' ');
        org.joda.time.PeriodType periodType9 = hours8.getPeriodType();
        org.joda.time.Period period10 = duration1.toPeriodFrom(readableInstant3, periodType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = period10.withYears((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Minutes minutes7 = minutes5.dividedBy((int) (byte) 100);
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        org.joda.time.Minutes minutes16 = minutes13.multipliedBy((int) (short) 1);
        int int17 = minutes16.getMinutes();
        boolean boolean18 = minutes7.isGreaterThan(minutes16);
        org.joda.time.Minutes minutes19 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Minutes minutes25 = period24.toStandardMinutes();
        org.joda.time.Minutes minutes27 = minutes25.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes28 = minutes19.minus(minutes25);
        org.joda.time.Period period31 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period33 = period31.minusMonths(0);
        org.joda.time.Minutes minutes34 = period33.toStandardMinutes();
        org.joda.time.Minutes minutes36 = minutes34.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((java.lang.Object) minutes34, chronology37);
        org.joda.time.Minutes minutes39 = minutes19.minus(minutes34);
        org.joda.time.DurationFieldType durationFieldType41 = minutes39.getFieldType((int) (short) 0);
        org.joda.time.PeriodType periodType42 = minutes39.getPeriodType();
        boolean boolean43 = minutes16.isGreaterThan(minutes39);
        org.joda.time.Weeks weeks45 = org.joda.time.Weeks.weeks(1);
        int int46 = weeks45.getWeeks();
        org.joda.time.Period period47 = weeks45.toPeriod();
        org.joda.time.Weeks weeks48 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval49 = null;
        org.joda.time.Weeks weeks50 = org.joda.time.Weeks.weeksIn(readableInterval49);
        boolean boolean51 = weeks48.isLessThan(weeks50);
        boolean boolean52 = weeks45.equals((java.lang.Object) weeks50);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = minutes16.compareTo((org.joda.time.base.BaseSingleFieldPeriod) weeks50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Minutes cannot be compared to class org.joda.time.Weeks");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(minutes25);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(minutes39);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(weeks45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(weeks48);
        org.junit.Assert.assertNotNull(weeks50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType16 = period14.getFieldType((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.MutablePeriod mutablePeriod1 = hours0.toMutablePeriod();
        org.joda.time.Days days2 = hours0.toStandardDays();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
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
        org.joda.time.Period period26 = period24.plusWeeks((int) (short) 100);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period26);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
        org.joda.time.Duration duration8 = minutes7.toStandardDuration();
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        org.joda.time.Minutes minutes14 = period13.toStandardMinutes();
        org.joda.time.Duration duration15 = minutes14.toStandardDuration();
        boolean boolean16 = duration8.isShorterThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Duration duration18 = duration8.plus((long) (short) 10);
        org.joda.time.Period period19 = duration8.toPeriod();
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Duration duration27 = minutes26.toStandardDuration();
        org.joda.time.Period period28 = duration27.toPeriod();
        org.joda.time.Duration duration30 = duration27.plus((long) (byte) 0);
        org.joda.time.Period period31 = new org.joda.time.Period(readableInstant20, (org.joda.time.ReadableDuration) duration30);
        org.joda.time.Period period32 = duration30.toPeriod();
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.days();
        org.joda.time.Period period34 = duration30.toPeriod(periodType33);
        boolean boolean35 = duration8.isShorterThan((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Period period36 = new org.joda.time.Period(readableInstant1, (org.joda.time.ReadableDuration) duration30);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str42 = periodType41.getName();
        boolean boolean44 = periodType41.equals((java.lang.Object) true);
        org.joda.time.Period period45 = new org.joda.time.Period(readableInstant39, readableInstant40, periodType41);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Period period47 = new org.joda.time.Period((long) 0, (long) (-10), periodType41, chronology46);
        org.joda.time.Period period48 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration30, periodType41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period50 = period48.withSeconds(36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "YearMonthDay" + "'", str42, "YearMonthDay");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("P-5D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"P-5D\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Period period8 = period7.normalizedStandard();
        org.joda.time.Period period10 = period7.withWeeks((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = period7.getValue((-35));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period18 = period16.minusMonths(0);
        org.joda.time.Minutes minutes19 = period18.toStandardMinutes();
        org.joda.time.Duration duration20 = minutes19.toStandardDuration();
        boolean boolean21 = duration13.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Duration duration24 = new org.joda.time.Duration(readableInstant22, readableInstant23);
        org.joda.time.Duration duration25 = duration13.minus((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration26 = duration13.toDuration();
        boolean boolean27 = duration4.isEqual((org.joda.time.ReadableDuration) duration26);
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
        org.joda.time.Period period45 = duration34.toPeriod();
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period51 = period49.minusMonths(0);
        org.joda.time.Minutes minutes52 = period51.toStandardMinutes();
        org.joda.time.Duration duration53 = minutes52.toStandardDuration();
        org.joda.time.Period period54 = duration53.toPeriod();
        org.joda.time.Duration duration56 = duration53.plus((long) (byte) 0);
        org.joda.time.Period period57 = new org.joda.time.Period(readableInstant46, (org.joda.time.ReadableDuration) duration56);
        org.joda.time.Period period58 = duration56.toPeriod();
        org.joda.time.PeriodType periodType59 = org.joda.time.PeriodType.days();
        org.joda.time.Period period60 = duration56.toPeriod(periodType59);
        boolean boolean61 = duration34.isShorterThan((org.joda.time.ReadableDuration) duration56);
        java.lang.String str62 = duration56.toString();
        boolean boolean63 = duration4.isLongerThan((org.joda.time.ReadableDuration) duration56);
        org.joda.time.Duration duration65 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration67 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration68 = duration65.plus((org.joda.time.ReadableDuration) duration67);
        org.joda.time.Duration duration70 = duration65.minus((long) (-1));
        org.joda.time.ReadableDuration readableDuration71 = null;
        boolean boolean72 = duration65.isShorterThan(readableDuration71);
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration65, readableInstant73);
        org.joda.time.Duration duration76 = duration56.withDurationAdded((org.joda.time.ReadableDuration) duration65, (-5));
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(minutes19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(minutes52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "PT0S" + "'", str62, "PT0S");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(duration76);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalFrom(readableInstant7);
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Seconds seconds10 = weeks9.toStandardSeconds();
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.MIN_VALUE;
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
        org.joda.time.Weeks weeks35 = weeks26.minus(2);
        org.joda.time.Weeks weeks36 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks38 = weeks36.dividedBy(1);
        org.joda.time.Weeks weeks40 = weeks36.dividedBy(8);
        org.joda.time.Weeks weeks41 = weeks35.plus(weeks36);
        boolean boolean42 = weeks11.isGreaterThan(weeks36);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = seconds10.compareTo((org.joda.time.base.BaseSingleFieldPeriod) weeks36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Seconds cannot be compared to class org.joda.time.Weeks");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(seconds10);
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
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertNotNull(weeks40);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withYearsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        int int8 = periodType7.size();
        org.joda.time.PeriodType periodType9 = periodType7.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType11 = periodType9.getFieldType(13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(100, (int) (short) 1, (int) (short) 10, (int) (byte) -1, (int) (byte) 10, (int) '4', (int) (short) 100, (-1), periodType8);
        int int10 = period9.getSeconds();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((-3600000L));
        org.joda.time.ReadableInstant readableInstant2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval3 = duration1.toIntervalFrom(readableInstant2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Days days3 = days0.plus((int) (byte) 100);
        org.joda.time.Duration duration4 = days3.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = duration4.toPeriodFrom(readableInstant5);
        java.lang.String str7 = duration4.toString();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Period period9 = duration4.toPeriodFrom(readableInstant8);
        java.lang.String str10 = duration4.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT9072000S" + "'", str7, "PT9072000S");
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT9072000S" + "'", str10, "PT9072000S");
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        org.joda.time.Period period1 = org.joda.time.Period.months((-1));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Minutes minutes7 = minutes5.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) minutes5, chronology8);
        org.joda.time.Period period10 = minutes5.toPeriod();
        org.joda.time.Minutes minutes11 = org.joda.time.Minutes.MAX_VALUE;
        boolean boolean12 = minutes5.isLessThan(minutes11);
        org.joda.time.PeriodType periodType13 = minutes11.getPeriodType();
        int int14 = minutes11.getMinutes();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.plusMinutes(0);
        int int7 = period2.getYears();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = period2.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = periodFormatter2.parsePeriod("YearMonthDayTimeNoDays");
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
        org.junit.Assert.assertNotNull(periodFormatter19);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.ONE;
        org.joda.time.Days days3 = org.joda.time.Days.ONE;
        int int4 = days2.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days3);
        org.joda.time.Days days6 = days3.multipliedBy((int) '#');
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType2 = days0.getFieldType();
        org.joda.time.Days days3 = org.joda.time.Days.MAX_VALUE;
        boolean boolean4 = days0.isGreaterThan(days3);
        int int5 = days0.getDays();
        java.lang.String str6 = days0.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P5D" + "'", str6, "P5D");
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = seconds6.plus(seconds7);
        org.joda.time.PeriodType periodType9 = seconds6.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.DurationFieldType durationFieldType15 = period12.getFieldType((int) (short) 1);
        int int16 = periodType9.indexOf(durationFieldType15);
        org.joda.time.Period period17 = new org.joda.time.Period((long) ' ', periodType9);
        org.joda.time.format.PeriodFormatter periodFormatter18 = periodFormatter3.withParseType(periodType9);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.time();
        org.joda.time.PeriodType periodType20 = periodType19.withDaysRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter3.withParseType(periodType20);
        java.util.Locale locale22 = null;
        org.joda.time.format.PeriodFormatter periodFormatter23 = periodFormatter3.withLocale(locale22);
        org.joda.time.format.PeriodPrinter periodPrinter24 = periodFormatter23.getPrinter();
        java.util.Locale locale25 = periodFormatter23.getLocale();
        org.joda.time.format.PeriodPrinter periodPrinter26 = periodFormatter23.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period27 = org.joda.time.Period.parse("PT0.036S", periodFormatter23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodFormatter21);
        org.junit.Assert.assertNotNull(periodFormatter23);
        org.junit.Assert.assertNull(periodPrinter24);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNull(periodPrinter26);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        org.joda.time.Duration duration1 = new org.joda.time.Duration(12000L);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.Seconds seconds4 = seconds1.plus((int) (byte) 0);
        org.joda.time.Seconds seconds6 = seconds4.minus((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.months();
        int int8 = seconds4.get(durationFieldType7);
        int int9 = seconds4.getSeconds();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) 10);
        org.joda.time.Hours hours2 = period1.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType3 = hours2.getFieldType();
        org.joda.time.Minutes minutes4 = hours2.toStandardMinutes();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(minutes4);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) -1, (int) ' ', (int) '4', (int) (short) -1, 10, (int) 'a', (-1), (int) '4');
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        int int14 = period13.getYears();
        org.joda.time.Period period16 = period13.plusYears((int) ' ');
        org.joda.time.Period period18 = period13.plusMinutes((-1));
        org.joda.time.Period period20 = org.joda.time.Period.weeks(7);
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Duration duration27 = minutes26.toStandardDuration();
        org.joda.time.Minutes minutes29 = minutes26.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType30 = minutes26.getFieldType();
        org.joda.time.Period period32 = period20.withFieldAdded(durationFieldType30, (int) (byte) 1);
        boolean boolean33 = period18.isSupported(durationFieldType30);
        org.joda.time.Period period35 = period8.withField(durationFieldType30, (-2));
        java.lang.String str36 = durationFieldType30.toString();
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "minutes" + "'", str36, "minutes");
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getStandardHours();
        org.joda.time.Duration duration11 = duration1.withDurationAdded(10L, (-36));
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.Period period14 = period12.plusSeconds(5);
        java.lang.Class<?> wildcardClass15 = period14.getClass();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT6000S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
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
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks17 = weeks16.negated();
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks20 = weeks19.negated();
        org.joda.time.Weeks weeks21 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval22 = null;
        org.joda.time.Weeks weeks23 = org.joda.time.Weeks.weeksIn(readableInterval22);
        boolean boolean24 = weeks21.isLessThan(weeks23);
        boolean boolean25 = weeks20.isGreaterThan(weeks23);
        org.joda.time.Weeks weeks27 = weeks23.plus((int) (short) 100);
        org.joda.time.Weeks weeks28 = weeks16.minus(weeks27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks29 = weeks11.plus(weeks16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 2147483647");
        } catch (java.lang.ArithmeticException e) {
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
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks28);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        org.joda.time.Period period1 = org.joda.time.Period.days((-10));
        org.joda.time.Period period3 = period1.withMonths((int) (byte) 10);
        org.joda.time.Period period5 = period3.plusMinutes((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
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
        org.joda.time.Period period26 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period28 = period26.minusMonths(0);
        org.joda.time.Minutes minutes29 = period28.toStandardMinutes();
        org.joda.time.Duration duration30 = minutes29.toStandardDuration();
        org.joda.time.Period period33 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period33.minusMonths(0);
        org.joda.time.Minutes minutes36 = period35.toStandardMinutes();
        org.joda.time.Duration duration37 = minutes36.toStandardDuration();
        boolean boolean38 = duration30.isShorterThan((org.joda.time.ReadableDuration) duration37);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = new org.joda.time.Duration(readableInstant39, readableInstant40);
        org.joda.time.Duration duration42 = duration30.minus((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration30, readableInstant43);
        org.joda.time.Period period45 = duration30.toPeriod();
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardDays(1L);
        boolean boolean48 = duration30.isEqual((org.joda.time.ReadableDuration) duration47);
        org.joda.time.Duration duration49 = duration20.minus((org.joda.time.ReadableDuration) duration47);
        long long50 = duration20.getMillis();
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
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 47L + "'", long50 == 47L);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        org.joda.time.Period period1 = org.joda.time.Period.years(36);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(13);
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType4.withMinutesRemoved();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) (byte) -1, periodType7, chronology8);
        org.joda.time.Period period10 = new org.joda.time.Period((long) (-2147483646), periodType7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 0, periodType7, chronology11);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(100L, periodType1);
        org.joda.time.Period period4 = period2.withYears(1);
        java.lang.Class<?> wildcardClass5 = period4.getClass();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period9 = new org.joda.time.Period((long) (byte) 1, (long) (-36), periodType8);
        org.joda.time.Chronology chronology10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) wildcardClass5, periodType8, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
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
        boolean boolean34 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration31);
        long long35 = duration31.getStandardSeconds();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(periodType12);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds8 = seconds6.plus(seconds7);
        org.joda.time.PeriodType periodType9 = seconds6.getPeriodType();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period12.negated();
        org.joda.time.DurationFieldType durationFieldType15 = period12.getFieldType((int) (short) 1);
        int int16 = periodType9.indexOf(durationFieldType15);
        org.joda.time.Period period17 = new org.joda.time.Period((long) ' ', periodType9);
        org.joda.time.format.PeriodFormatter periodFormatter18 = periodFormatter3.withParseType(periodType9);
        java.util.Locale locale19 = periodFormatter3.getLocale();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str21 = periodType20.getName();
        org.joda.time.PeriodType periodType22 = periodType20.withHoursRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter23 = periodFormatter3.withParseType(periodType20);
        boolean boolean24 = periodFormatter23.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = org.joda.time.Period.parse("PT2S", periodFormatter23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter18);
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "YearMonthDay" + "'", str21, "YearMonthDay");
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodFormatter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Period period4 = period1.withWeeks((-1));
        java.lang.String str5 = period4.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = period4.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P-1W" + "'", str5, "P-1W");
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Period period1 = new org.joda.time.Period();
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = period1.toDurationFrom(readableInstant2);
        org.joda.time.Duration duration4 = duration3.toDuration();
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period9 = period7.minusMonths(0);
        org.joda.time.Minutes minutes10 = period9.toStandardMinutes();
        org.joda.time.Duration duration11 = minutes10.toStandardDuration();
        org.joda.time.Minutes minutes13 = minutes10.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType14 = minutes10.getFieldType();
        org.joda.time.Minutes minutes16 = minutes10.multipliedBy(1);
        org.joda.time.PeriodType periodType17 = minutes16.getPeriodType();
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration4, periodType17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = period18.plusHours((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        java.lang.Object obj0 = null;
        org.joda.time.Period period1 = new org.joda.time.Period(obj0);
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period2.minusSeconds(100);
        org.joda.time.Period period8 = period2.withMillis((int) '#');
        org.joda.time.Period period9 = period2.normalizedStandard();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
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
        java.util.Locale locale20 = null;
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter2.withLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod23 = periodFormatter2.parseMutablePeriod("PT1H");
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
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNotNull(periodFormatter21);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
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
        org.joda.time.Minutes minutes21 = org.joda.time.Minutes.TWO;
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period26 = period24.minusMonths(0);
        org.joda.time.Minutes minutes27 = period26.toStandardMinutes();
        org.joda.time.Minutes minutes29 = minutes27.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes30 = minutes21.minus(minutes27);
        org.joda.time.Period period33 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period33.minusMonths(0);
        org.joda.time.Minutes minutes36 = period35.toStandardMinutes();
        org.joda.time.Minutes minutes38 = minutes36.dividedBy((int) (byte) 100);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((java.lang.Object) minutes36, chronology39);
        org.joda.time.Minutes minutes41 = minutes21.minus(minutes36);
        org.joda.time.Minutes minutes43 = org.joda.time.Minutes.minutes(2147483647);
        org.joda.time.Minutes minutes44 = minutes41.minus(minutes43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes45 = minutes0.plus(minutes43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2 + 2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(minutes30);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(minutes44);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Period period4 = period1.multipliedBy((int) (byte) 100);
        org.joda.time.Hours hours5 = period1.toStandardHours();
        int int6 = hours5.size();
        java.lang.String str7 = hours5.toString();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType12 = days11.getPeriodType();
        org.joda.time.PeriodType periodType13 = periodType12.withHoursRemoved();
        org.joda.time.PeriodType periodType14 = periodType12.withSecondsRemoved();
        org.joda.time.Period period15 = duration9.toPeriodFrom(readableInstant10, periodType12);
        org.joda.time.Days days16 = duration9.toStandardDays();
        org.joda.time.Days days17 = org.joda.time.Days.MIN_VALUE;
        boolean boolean18 = days16.isLessThan(days17);
        org.joda.time.Period period19 = days17.toPeriod();
        org.joda.time.Period period22 = new org.joda.time.Period((long) 35, (long) (byte) 1);
        org.joda.time.Period period23 = period22.toPeriod();
        org.joda.time.Days days24 = period23.toStandardDays();
        int int25 = days17.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days24);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = hours5.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Hours cannot be compared to class org.joda.time.Days");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0H" + "'", str7, "PT0H");
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        org.joda.time.Period period1 = new org.joda.time.Period((long) (-2147483648));
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days2 = days0.dividedBy((int) (byte) 10);
        int int3 = days2.getDays();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        java.lang.String str3 = seconds0.toString();
        org.joda.time.DurationFieldType durationFieldType4 = seconds0.getFieldType();
        org.joda.time.Seconds seconds6 = seconds0.multipliedBy(0);
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.THREE;
        org.joda.time.Duration duration8 = seconds7.toStandardDuration();
        boolean boolean9 = seconds6.isGreaterThan(seconds7);
        org.joda.time.DurationFieldType durationFieldType11 = seconds6.getFieldType((int) (short) 0);
        org.joda.time.Seconds seconds12 = seconds6.negated();
        int int13 = seconds12.size();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT2S" + "'", str3, "PT2S");
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        org.joda.time.Hours hours0 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours1 = org.joda.time.Hours.SIX;
        org.joda.time.Hours hours2 = hours0.minus(hours1);
        org.joda.time.Hours hours4 = hours1.minus((-10));
        org.joda.time.PeriodType periodType5 = hours4.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = periodType5.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType29 = period24.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isParser();
        org.joda.time.format.PeriodPrinter periodPrinter7 = periodFormatter2.getPrinter();
        org.joda.time.format.PeriodPrinter periodPrinter8 = periodFormatter2.getPrinter();
        java.io.Writer writer9 = null;
        org.joda.time.Days days10 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType11 = days10.getPeriodType();
        org.joda.time.Days days12 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType13 = days12.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType14 = days12.getFieldType();
        boolean boolean15 = days10.isLessThan(days12);
        org.joda.time.Duration duration16 = days10.toStandardDuration();
        org.joda.time.Days days18 = days10.minus((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer9, (org.joda.time.ReadablePeriod) days10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(periodPrinter7);
        org.junit.Assert.assertNull(periodPrinter8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(days18);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
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
        org.joda.time.Duration duration22 = duration19.withMillis(100L);
        java.lang.String str23 = duration22.toString();
        long long24 = duration22.getMillis();
        org.joda.time.ReadableDuration readableDuration25 = null;
        boolean boolean26 = duration22.isShorterThan(readableDuration25);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT0.100S" + "'", str23, "PT0.100S");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter3.withParseType(periodType6);
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withYearsRemoved();
        java.lang.String str13 = periodType12.toString();
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter8.withParseType(periodType12);
        org.joda.time.format.PeriodPrinter periodPrinter15 = periodFormatter8.getPrinter();
        java.util.Locale locale16 = null;
        org.joda.time.format.PeriodFormatter periodFormatter17 = periodFormatter8.withLocale(locale16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = org.joda.time.Period.parse("PT-7H", periodFormatter17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PeriodType[Days]" + "'", str13, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNull(periodPrinter15);
        org.junit.Assert.assertNotNull(periodFormatter17);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.Period period4 = period1.withFields(readablePeriod3);
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period7.negated();
        int int9 = period7.getHours();
        org.joda.time.Period period11 = org.joda.time.Period.days(10);
        org.joda.time.Period period13 = period11.plusMonths((int) 'a');
        org.joda.time.Period period15 = period11.plusSeconds((int) (short) 100);
        org.joda.time.Period period17 = period15.minusMonths((int) 'a');
        org.joda.time.Period period18 = period7.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period19 = period1.minus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period21 = period1.minusWeeks((int) (byte) 1);
        int int22 = period1.getMonths();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration2 = new org.joda.time.Duration(readableInstant0, readableInstant1);
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Duration duration4 = minutes3.toStandardDuration();
        long long5 = duration4.getStandardSeconds();
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        org.joda.time.Duration duration12 = minutes11.toStandardDuration();
        org.joda.time.Minutes minutes14 = minutes11.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration15 = minutes11.toStandardDuration();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Duration duration22 = minutes21.toStandardDuration();
        org.joda.time.Period period23 = duration22.toPeriod();
        boolean boolean24 = duration15.isLongerThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.days();
        org.joda.time.Period period27 = duration15.toPeriodTo(readableInstant25, periodType26);
        org.joda.time.Duration duration28 = duration4.plus((org.joda.time.ReadableDuration) duration15);
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
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration42, readableInstant44);
        long long46 = duration42.getStandardHours();
        org.joda.time.Duration duration47 = duration15.minus((org.joda.time.ReadableDuration) duration42);
        int int48 = duration2.compareTo((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Duration duration50 = duration42.minus((long) (byte) 1);
        org.joda.time.Period period53 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period54 = period53.negated();
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.Duration duration56 = period54.toDurationTo(readableInstant55);
        int int57 = duration50.compareTo((org.joda.time.ReadableDuration) duration56);
        long long58 = duration56.getMillis();
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period64 = period62.minusMonths(0);
        org.joda.time.Minutes minutes65 = period64.toStandardMinutes();
        org.joda.time.Duration duration66 = minutes65.toStandardDuration();
        org.joda.time.Period period67 = duration66.toPeriod();
        org.joda.time.Duration duration69 = duration66.plus((long) (byte) 0);
        org.joda.time.Period period70 = new org.joda.time.Period(readableInstant59, (org.joda.time.ReadableDuration) duration69);
        boolean boolean71 = duration56.isShorterThan((org.joda.time.ReadableDuration) duration69);
        org.joda.time.Duration duration73 = org.joda.time.Duration.standardSeconds((long) 0);
        java.lang.String str74 = duration73.toString();
        org.joda.time.Duration duration76 = duration73.minus((long) 10);
        org.joda.time.Duration duration79 = duration73.withDurationAdded((long) (-95), (int) (short) 1);
        boolean boolean80 = duration56.isShorterThan((org.joda.time.ReadableDuration) duration73);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-128849018880L) + "'", long5 == (-128849018880L));
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(minutes34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(minutes41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(duration56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 36L + "'", long58 == 36L);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(minutes65);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "PT0S" + "'", str74, "PT0S");
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertNotNull(duration79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardSeconds((long) 0);
        org.joda.time.Period period5 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period12 = period10.minusMonths(0);
        org.joda.time.Minutes minutes13 = period12.toStandardMinutes();
        org.joda.time.Duration duration14 = minutes13.toStandardDuration();
        org.joda.time.Period period15 = duration14.toPeriod();
        org.joda.time.Duration duration17 = duration14.plus((long) (byte) 0);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant7, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.minutes();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((java.lang.Object) duration17, periodType19, chronology20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant6, periodType19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((long) ' ', (long) 2147483645, periodType19, chronology23);
        java.lang.String str25 = periodType19.getName();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Minutes" + "'", str25, "Minutes");
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.minutes();
        int int8 = period4.get(durationFieldType7);
        org.joda.time.PeriodType periodType9 = period4.getPeriodType();
        java.lang.String str10 = period4.toString();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0.036S" + "'", str10, "PT0.036S");
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.Weeks weeks4 = weeks0.dividedBy(8);
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        java.lang.String str6 = days5.toString();
        org.joda.time.Days days8 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days9 = days5.minus(days8);
        org.joda.time.Days days11 = days8.minus((int) '#');
        org.joda.time.Days days12 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days13 = days11.plus(days12);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = weeks0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Weeks cannot be compared to class org.joda.time.Days");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P5D" + "'", str6, "P5D");
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) -1, (int) ' ', (int) '4', (int) (short) -1, 10, (int) 'a', (-1), (int) '4');
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period13 = period11.minusMonths(0);
        int int14 = period13.getYears();
        org.joda.time.Period period16 = period13.plusYears((int) ' ');
        org.joda.time.Period period18 = period13.plusMinutes((-1));
        org.joda.time.Period period20 = org.joda.time.Period.weeks(7);
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Minutes minutes26 = period25.toStandardMinutes();
        org.joda.time.Duration duration27 = minutes26.toStandardDuration();
        org.joda.time.Minutes minutes29 = minutes26.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType30 = minutes26.getFieldType();
        org.joda.time.Period period32 = period20.withFieldAdded(durationFieldType30, (int) (byte) 1);
        boolean boolean33 = period18.isSupported(durationFieldType30);
        org.joda.time.Period period35 = period8.withField(durationFieldType30, (-2));
        org.joda.time.format.PeriodPrinter periodPrinter36 = null;
        org.joda.time.format.PeriodParser periodParser37 = null;
        org.joda.time.format.PeriodFormatter periodFormatter38 = new org.joda.time.format.PeriodFormatter(periodPrinter36, periodParser37);
        boolean boolean39 = periodFormatter38.isParser();
        org.joda.time.Days days40 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType41 = days40.getPeriodType();
        org.joda.time.PeriodType periodType42 = periodType41.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter43 = periodFormatter38.withParseType(periodType41);
        org.joda.time.Days days44 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType45 = days44.getPeriodType();
        org.joda.time.PeriodType periodType46 = periodType45.withSecondsRemoved();
        org.joda.time.PeriodType periodType47 = periodType45.withYearsRemoved();
        java.lang.String str48 = periodType47.toString();
        org.joda.time.format.PeriodFormatter periodFormatter49 = periodFormatter43.withParseType(periodType47);
        org.joda.time.PeriodType periodType50 = periodFormatter49.getParseType();
        java.util.Locale locale51 = periodFormatter49.getLocale();
        java.util.Locale locale52 = periodFormatter49.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = period8.toString(periodFormatter49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodFormatter43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PeriodType[Days]" + "'", str48, "PeriodType[Days]");
        org.junit.Assert.assertNotNull(periodFormatter49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNull(locale51);
        org.junit.Assert.assertNull(locale52);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(47L, (long) 35, periodType2);
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        org.joda.time.Weeks weeks7 = weeks5.dividedBy((int) (byte) -1);
        org.joda.time.Weeks weeks8 = null;
        org.joda.time.Weeks weeks9 = weeks7.minus(weeks8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) weeks7, chronology10);
        org.joda.time.Duration duration12 = weeks7.toStandardDuration();
        org.joda.time.Weeks weeks14 = weeks7.multipliedBy(59);
        boolean boolean15 = period3.equals((java.lang.Object) weeks7);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
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
        org.joda.time.ReadableInstant readableInstant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval19 = duration17.toIntervalFrom(readableInstant18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(duration17);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT6H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod21 = periodFormatter13.parseMutablePeriod("PT0.011S");
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
        org.junit.Assert.assertNotNull(periodFormatter19);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter3.withParseType(periodType6);
        org.joda.time.PeriodType periodType9 = periodFormatter3.getParseType();
        org.joda.time.format.PeriodPrinter periodPrinter10 = periodFormatter3.getPrinter();
        java.util.Locale locale11 = null;
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter3.withLocale(locale11);
        org.joda.time.PeriodType periodType13 = periodFormatter12.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = org.joda.time.Period.parse("weeks", periodFormatter12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNull(periodType9);
        org.junit.Assert.assertNull(periodPrinter10);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNull(periodType13);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
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
        java.util.Locale locale20 = null;
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter2.withLocale(locale20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod23 = periodFormatter21.parseMutablePeriod("P-5D");
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
        org.junit.Assert.assertNotNull(periodFormatter19);
        org.junit.Assert.assertNotNull(periodFormatter21);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) 52);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
        org.joda.time.Period period4 = period1.minusMonths(100);
        org.joda.time.Period period6 = period4.minusYears((int) (short) 10);
        org.joda.time.Period period8 = period6.withMillis((-36));
        org.joda.time.Days days12 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days14 = days12.multipliedBy((int) (short) 100);
        org.joda.time.Days days15 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType16 = days15.getPeriodType();
        org.joda.time.Days days18 = days15.minus(0);
        org.joda.time.Days days19 = days12.minus(days18);
        org.joda.time.Days days20 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days19);
        org.joda.time.Days days22 = days20.minus((-1));
        org.joda.time.PeriodType periodType23 = days22.getPeriodType();
        org.joda.time.Period period24 = new org.joda.time.Period((long) (short) -1, (long) '4', periodType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = period6.normalizedStandard(periodType23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType2 = days0.getFieldType();
        org.joda.time.Days days3 = org.joda.time.Days.MAX_VALUE;
        boolean boolean4 = days0.isGreaterThan(days3);
        int int5 = days0.size();
        org.joda.time.PeriodType periodType6 = days0.getPeriodType();
        java.lang.String str7 = days0.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P5D" + "'", str7, "P5D");
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter3.withParseType(periodType6);
        boolean boolean9 = periodFormatter8.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = org.joda.time.Period.parse("P35W", periodFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        org.joda.time.Duration duration1 = org.joda.time.Duration.millis((long) 3);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = duration1.toPeriodFrom(readableInstant2);
        org.joda.time.Period period4 = new org.joda.time.Period((java.lang.Object) period3);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withHoursRemoved();
        org.joda.time.PeriodType periodType3 = periodType1.withYearsRemoved();
        org.joda.time.PeriodType periodType4 = periodType1.withSecondsRemoved();
        org.joda.time.PeriodType periodType5 = periodType1.withHoursRemoved();
        int int6 = periodType5.size();
        org.joda.time.PeriodType periodType7 = periodType5.withWeeksRemoved();
        java.lang.String str8 = periodType7.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PeriodType[Days]" + "'", str8, "PeriodType[Days]");
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((-2147483648L));
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType12 = days11.getPeriodType();
        org.joda.time.PeriodType periodType13 = periodType12.withHoursRemoved();
        org.joda.time.PeriodType periodType14 = periodType12.withSecondsRemoved();
        org.joda.time.Period period15 = duration9.toPeriodFrom(readableInstant10, periodType12);
        long long16 = duration9.getStandardHours();
        org.joda.time.Days days17 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = duration9.toPeriod(periodType18, chronology19);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType22 = periodType21.withMillisRemoved();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) period20, periodType22, chronology23);
        org.joda.time.PeriodType periodType25 = periodType22.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period26 = new org.joda.time.Period(13, (int) (short) 1, 52, 0, 999, 14400, (-2), (int) (byte) 0, periodType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType25);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
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
        org.joda.time.PeriodType periodType10 = periodFormatter7.getParseType();
        org.joda.time.PeriodType periodType11 = periodType10.withSecondsRemoved();
        int int12 = periodType10.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
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
        org.joda.time.Period period48 = period42.minusWeeks((int) (byte) -1);
        int[] intArray49 = period42.getValues();
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
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 0, 0, 0, 100]");
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        org.joda.time.Days days10 = days1.minus(35);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = days10.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
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
        org.joda.time.Duration duration26 = duration25.toDuration();
        long long27 = duration25.getStandardHours();
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
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration41, readableInstant43);
        long long45 = duration41.getStandardHours();
        org.joda.time.Period period46 = duration41.toPeriod();
        org.joda.time.Duration duration47 = duration25.plus((org.joda.time.ReadableDuration) duration41);
        long long48 = duration25.getMillis();
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
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-35791394L) + "'", long27 == (-35791394L));
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-128849018880000L) + "'", long48 == (-128849018880000L));
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
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
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        org.joda.time.Period period23 = period19.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType24 = period19.getPeriodType();
        org.joda.time.PeriodType periodType25 = periodType24.withMinutesRemoved();
        java.lang.String str26 = periodType25.toString();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) period3, periodType25, chronology27);
        org.joda.time.PeriodType periodType29 = periodType25.withHoursRemoved();
        org.joda.time.PeriodType periodType30 = periodType25.withSecondsRemoved();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 7, periodType30, chronology31);
        org.joda.time.format.PeriodPrinter periodPrinter33 = null;
        org.joda.time.format.PeriodParser periodParser34 = null;
        org.joda.time.format.PeriodFormatter periodFormatter35 = new org.joda.time.format.PeriodFormatter(periodPrinter33, periodParser34);
        boolean boolean36 = periodFormatter35.isParser();
        org.joda.time.Seconds seconds38 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds39 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds40 = seconds38.plus(seconds39);
        org.joda.time.PeriodType periodType41 = seconds38.getPeriodType();
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period45 = period44.negated();
        org.joda.time.DurationFieldType durationFieldType47 = period44.getFieldType((int) (short) 1);
        int int48 = periodType41.indexOf(durationFieldType47);
        org.joda.time.Period period49 = new org.joda.time.Period((long) ' ', periodType41);
        org.joda.time.format.PeriodFormatter periodFormatter50 = periodFormatter35.withParseType(periodType41);
        java.util.Locale locale51 = null;
        org.joda.time.format.PeriodFormatter periodFormatter52 = periodFormatter35.withLocale(locale51);
        java.util.Locale locale53 = null;
        org.joda.time.format.PeriodFormatter periodFormatter54 = periodFormatter35.withLocale(locale53);
        org.joda.time.PeriodType periodType55 = periodFormatter35.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = period32.toString(periodFormatter35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str26, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(seconds38);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter50);
        org.junit.Assert.assertNotNull(periodFormatter52);
        org.junit.Assert.assertNotNull(periodFormatter54);
        org.junit.Assert.assertNull(periodType55);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        int int2 = period1.getMillis();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
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
        org.joda.time.Period period19 = duration6.toPeriod();
        org.joda.time.Duration duration21 = duration6.plus(0L);
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period26 = period24.minusMonths(0);
        org.joda.time.Minutes minutes27 = period26.toStandardMinutes();
        org.joda.time.Duration duration28 = minutes27.toStandardDuration();
        org.joda.time.Period period29 = duration28.toPeriod();
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period34 = period32.minusMonths(0);
        org.joda.time.Minutes minutes35 = period34.toStandardMinutes();
        org.joda.time.Duration duration36 = minutes35.toStandardDuration();
        org.joda.time.Minutes minutes38 = minutes35.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration39 = minutes35.toStandardDuration();
        org.joda.time.Period period42 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period44 = period42.minusMonths(0);
        org.joda.time.Minutes minutes45 = period44.toStandardMinutes();
        org.joda.time.Duration duration46 = minutes45.toStandardDuration();
        org.joda.time.Period period47 = duration46.toPeriod();
        boolean boolean48 = duration39.isLongerThan((org.joda.time.ReadableDuration) duration46);
        boolean boolean49 = duration28.isEqual((org.joda.time.ReadableDuration) duration39);
        long long50 = duration28.getStandardMinutes();
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration28, readableInstant51, periodType52);
        int int54 = period53.getWeeks();
        boolean boolean55 = duration21.equals((java.lang.Object) int54);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(minutes45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Period period4 = period1.multipliedBy((int) (byte) 100);
        org.joda.time.Hours hours5 = period1.toStandardHours();
        int int6 = hours5.size();
        java.lang.Class<?> wildcardClass7 = hours5.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Hours hours2 = hours0.negated();
        org.joda.time.Duration duration3 = hours0.toStandardDuration();
        org.joda.time.Hours hours5 = hours0.dividedBy((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours7 = hours0.plus(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 52");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(hours5);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = periodFormatter22.parsePeriod("PT99.640S");
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
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "YearMonthDay" + "'", str20, "YearMonthDay");
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodFormatter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        org.joda.time.Period period1 = org.joda.time.Period.years((-2));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days2 = period1.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Days as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
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
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds16 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds17 = seconds15.plus(seconds16);
        org.joda.time.PeriodType periodType18 = seconds15.getPeriodType();
        org.joda.time.Period period21 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period21.negated();
        org.joda.time.DurationFieldType durationFieldType24 = period21.getFieldType((int) (short) 1);
        int int25 = periodType18.indexOf(durationFieldType24);
        boolean boolean26 = period14.isSupported(durationFieldType24);
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
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
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
        org.joda.time.format.PeriodPrinter periodPrinter16 = periodFormatter15.getPrinter();
        org.joda.time.format.PeriodPrinter periodPrinter17 = periodFormatter15.getPrinter();
        org.junit.Assert.assertNull(periodPrinter3);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodFormatter15);
        org.junit.Assert.assertNull(periodPrinter16);
        org.junit.Assert.assertNull(periodPrinter17);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period4 = org.joda.time.Period.millis((int) '#');
        int int5 = period4.getYears();
        org.joda.time.DurationFieldType[] durationFieldTypeArray6 = period4.getFieldTypes();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.forFields(durationFieldTypeArray6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((-1L), periodType7, chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeks(1);
        boolean boolean3 = weeks0.isGreaterThan(weeks2);
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.ZERO;
        java.lang.String str5 = weeks4.toString();
        int int6 = weeks4.size();
        org.joda.time.PeriodType periodType7 = weeks4.getPeriodType();
        org.joda.time.Weeks weeks9 = weeks4.minus(7);
        org.joda.time.PeriodType periodType10 = weeks9.getPeriodType();
        org.joda.time.Weeks weeks11 = weeks0.plus(weeks9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds12 = weeks0.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 604800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0W" + "'", str5, "P0W");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(weeks11);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
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
        org.joda.time.Duration duration15 = period2.toStandardDuration();
        java.lang.String str16 = duration15.toString();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PT-0.036S" + "'", str16, "PT-0.036S");
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
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
        int int17 = seconds16.size();
        org.joda.time.PeriodType periodType18 = seconds16.getPeriodType();
        org.joda.time.Seconds seconds20 = seconds16.plus(100);
        org.joda.time.Seconds seconds22 = seconds20.plus((-95));
        int int23 = seconds20.getSeconds();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 36 + "'", int23 == 36);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
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
        org.joda.time.format.PeriodPrinter periodPrinter24 = periodFormatter22.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod26 = periodFormatter22.parseMutablePeriod("minutes");
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
        org.junit.Assert.assertNull(periodPrinter24);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
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
        org.joda.time.Minutes minutes46 = minutes36.multipliedBy(5);
        org.joda.time.Minutes minutes47 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes49 = minutes47.minus(2147483645);
        org.joda.time.Minutes minutes50 = minutes36.plus(minutes47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType52 = minutes47.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(minutes47);
        org.junit.Assert.assertNotNull(minutes49);
        org.junit.Assert.assertNotNull(minutes50);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        org.joda.time.Period period8 = new org.joda.time.Period((int) '#', (-36), (int) (short) 1, 1, 1, (int) (byte) 100, 3, 8);
        org.joda.time.Period period10 = period8.withSeconds(6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = period8.plusMillis(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 8 + 2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration16 = duration6.plus((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str19 = periodType18.getName();
        org.joda.time.Period period20 = duration6.toPeriodTo(readableInstant17, periodType18);
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period25 = period23.minusMonths(0);
        org.joda.time.Period period26 = period23.normalizedStandard();
        org.joda.time.MutablePeriod mutablePeriod27 = period26.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = period26.toDurationFrom(readableInstant28);
        org.joda.time.Period period30 = period26.normalizedStandard();
        org.joda.time.DurationFieldType durationFieldType32 = period30.getFieldType(0);
        int int33 = periodType18.indexOf(durationFieldType32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DurationField durationField35 = durationFieldType32.getField(chronology34);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "YearMonthDay" + "'", str19, "YearMonthDay");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(durationField35);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        org.joda.time.Period period3 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period5 = period3.minusMonths(0);
        org.joda.time.Minutes minutes6 = period5.toStandardMinutes();
        org.joda.time.Duration duration7 = minutes6.toStandardDuration();
        org.joda.time.Minutes minutes9 = minutes6.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration10 = minutes6.toStandardDuration();
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period14 = period13.negated();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = period14.toDurationTo(readableInstant15);
        boolean boolean17 = duration10.isShorterThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration21 = duration16.plus((org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Interval interval23 = duration20.toIntervalTo(readableInstant22);
        org.joda.time.Minutes minutes24 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval23);
        org.joda.time.Minutes minutes26 = minutes24.plus(0);
        org.joda.time.PeriodType periodType27 = minutes24.getPeriodType();
        org.joda.time.Period period28 = new org.joda.time.Period((-36L), periodType27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = period28.withWeeks((-36));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        org.joda.time.Period period1 = org.joda.time.Period.years(7);
        org.joda.time.Period period2 = period1.normalizedStandard();
        int[] intArray3 = period1.getValues();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.PeriodType periodType7 = periodType5.withYearsRemoved();
        org.joda.time.PeriodType periodType8 = periodType5.withSecondsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period1.normalizedStandard(periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[7, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        org.joda.time.Period period1 = org.joda.time.Period.hours(52);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Hours hours2 = hours0.negated();
        org.joda.time.Duration duration3 = hours0.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds4 = hours0.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 3600");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        long long8 = duration1.getMillis();
        org.joda.time.Period period9 = duration1.toPeriod();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Interval interval11 = duration1.toIntervalFrom(readableInstant10);
        org.joda.time.Duration duration13 = duration1.withMillis((long) 2147483647);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100000L + "'", long8 == 100000L);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
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
        org.joda.time.Hours hours16 = hours9.dividedBy(1);
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
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
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
        org.joda.time.Duration duration34 = org.joda.time.Duration.parse("PT0S");
        boolean boolean35 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration34);
        java.lang.String str36 = duration1.toString();
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
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PT52S" + "'", str36, "PT52S");
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        java.lang.String str3 = seconds0.toString();
        org.joda.time.Seconds seconds5 = seconds0.plus(6);
        org.joda.time.Seconds seconds7 = seconds5.multipliedBy(14405);
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT2S" + "'", str3, "PT2S");
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds7);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval49 = duration47.toIntervalFrom(readableInstant48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("Weeks");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Weeks\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.Seconds seconds4 = seconds1.plus((int) (byte) 0);
        org.joda.time.Seconds seconds6 = seconds1.minus(8);
        org.joda.time.Period period7 = seconds6.toPeriod();
        org.joda.time.Period period9 = period7.plusMillis((int) ' ');
        org.joda.time.Days days10 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType11 = days10.getPeriodType();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.PeriodType periodType13 = periodType11.withYearsRemoved();
        org.joda.time.PeriodType periodType14 = periodType11.withSecondsRemoved();
        org.joda.time.PeriodType periodType15 = periodType11.withHoursRemoved();
        org.joda.time.PeriodType periodType16 = periodType15.withMonthsRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withWeeksRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = period9.withPeriodType(periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Period period6 = period4.minusSeconds(0);
        org.joda.time.Period period8 = period6.minusWeeks(10);
        org.joda.time.Period period9 = period6.negated();
        org.joda.time.Days days11 = org.joda.time.Days.days((int) '4');
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) days11, chronology12);
        int int14 = days11.getDays();
        org.joda.time.DurationFieldType durationFieldType15 = days11.getFieldType();
        org.joda.time.Period period17 = period9.withFieldAdded(durationFieldType15, 4);
        org.joda.time.format.PeriodPrinter periodPrinter18 = null;
        org.joda.time.format.PeriodParser periodParser19 = null;
        org.joda.time.format.PeriodFormatter periodFormatter20 = new org.joda.time.format.PeriodFormatter(periodPrinter18, periodParser19);
        boolean boolean21 = periodFormatter20.isParser();
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds24 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds25 = seconds23.plus(seconds24);
        org.joda.time.PeriodType periodType26 = seconds23.getPeriodType();
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period29.negated();
        org.joda.time.DurationFieldType durationFieldType32 = period29.getFieldType((int) (short) 1);
        int int33 = periodType26.indexOf(durationFieldType32);
        org.joda.time.Period period34 = new org.joda.time.Period((long) ' ', periodType26);
        org.joda.time.format.PeriodFormatter periodFormatter35 = periodFormatter20.withParseType(periodType26);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.time();
        org.joda.time.PeriodType periodType37 = periodType36.withDaysRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter38 = periodFormatter20.withParseType(periodType37);
        java.util.Locale locale39 = null;
        org.joda.time.format.PeriodFormatter periodFormatter40 = periodFormatter20.withLocale(locale39);
        org.joda.time.format.PeriodPrinter periodPrinter41 = periodFormatter40.getPrinter();
        java.util.Locale locale42 = periodFormatter40.getLocale();
        org.joda.time.format.PeriodPrinter periodPrinter43 = periodFormatter40.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = period9.toString(periodFormatter40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(periodFormatter38);
        org.junit.Assert.assertNotNull(periodFormatter40);
        org.junit.Assert.assertNull(periodPrinter41);
        org.junit.Assert.assertNull(locale42);
        org.junit.Assert.assertNull(periodPrinter43);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(100);
        org.joda.time.Weeks weeks2 = null;
        org.joda.time.Weeks weeks3 = weeks1.plus(weeks2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks5 = weeks1.plus(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 100 + 2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        org.joda.time.Days days6 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withHoursRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.days();
        boolean boolean11 = periodType9.isSupported(durationFieldType10);
        org.joda.time.PeriodType periodType12 = periodType9.withMinutesRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period((-128849018880L), periodType9);
        org.joda.time.Period period14 = new org.joda.time.Period((long) '4', periodType9);
        org.joda.time.PeriodType periodType15 = periodType9.withMonthsRemoved();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((-1L), (long) (byte) 1, periodType9, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (-1), (long) ' ', periodType9, chronology18);
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Period period26 = period22.minusSeconds(100);
        org.joda.time.Period period28 = period26.plusYears(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = period19.withFields((org.joda.time.ReadablePeriod) period26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
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
        org.joda.time.Seconds seconds21 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds22 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds23 = seconds21.plus(seconds22);
        org.joda.time.PeriodType periodType24 = seconds21.getPeriodType();
        int int25 = seconds21.size();
        org.joda.time.Seconds seconds27 = org.joda.time.Seconds.seconds((int) (byte) 10);
        boolean boolean29 = seconds27.equals((java.lang.Object) "PeriodType[StandardNoMinutes]");
        org.joda.time.Seconds seconds30 = seconds21.plus(seconds27);
        org.joda.time.Seconds seconds32 = seconds30.plus((int) (short) 0);
        org.joda.time.Duration duration33 = seconds32.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            int int34 = minutes15.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Minutes cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(seconds30);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(duration33);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) '#');
        int int2 = period1.getYears();
        org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) period1);
        java.lang.String str4 = hours3.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0H" + "'", str4, "PT0H");
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration16 = duration6.plus((long) (short) 10);
        long long17 = duration16.getStandardSeconds();
        org.joda.time.Period period20 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period22 = period20.minusMonths(0);
        org.joda.time.Minutes minutes23 = period22.toStandardMinutes();
        org.joda.time.Duration duration24 = minutes23.toStandardDuration();
        org.joda.time.Period period25 = duration24.toPeriod();
        org.joda.time.Duration duration27 = duration24.plus((long) (byte) 0);
        org.joda.time.Duration duration29 = duration24.withMillis((long) 1);
        org.joda.time.Period period30 = new org.joda.time.Period((java.lang.Object) duration29);
        org.joda.time.Period period33 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period35 = period33.minusMonths(0);
        org.joda.time.Minutes minutes36 = period35.toStandardMinutes();
        org.joda.time.Duration duration37 = minutes36.toStandardDuration();
        org.joda.time.Period period40 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period42 = period40.minusMonths(0);
        org.joda.time.Minutes minutes43 = period42.toStandardMinutes();
        org.joda.time.Duration duration44 = minutes43.toStandardDuration();
        boolean boolean45 = duration37.isShorterThan((org.joda.time.ReadableDuration) duration44);
        org.joda.time.Period period46 = duration44.toPeriod();
        long long47 = duration44.getStandardSeconds();
        org.joda.time.Duration duration48 = duration44.toDuration();
        org.joda.time.Duration duration50 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration52 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration53 = duration50.plus((org.joda.time.ReadableDuration) duration52);
        long long54 = duration52.getMillis();
        int int55 = duration44.compareTo((org.joda.time.ReadableDuration) duration52);
        long long56 = duration52.getStandardDays();
        org.joda.time.Duration duration59 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration61 = duration59.plus((long) (-1));
        org.joda.time.Duration duration62 = duration52.plus((org.joda.time.ReadableDuration) duration61);
        boolean boolean63 = duration29.isLongerThan((org.joda.time.ReadableDuration) duration61);
        boolean boolean64 = duration16.isLongerThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.Duration duration66 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration68 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration69 = duration66.plus((org.joda.time.ReadableDuration) duration68);
        int int70 = duration16.compareTo((org.joda.time.ReadableDuration) duration66);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(minutes36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(minutes43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 6000000L + "'", long54 == 6000000L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) 6, chronology1);
        org.joda.time.Days days3 = org.joda.time.Days.TWO;
        org.joda.time.Days days5 = days3.minus((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType6 = days3.getFieldType();
        int int7 = period2.indexOf(durationFieldType6);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        org.joda.time.Days days6 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withHoursRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.days();
        boolean boolean11 = periodType9.isSupported(durationFieldType10);
        org.joda.time.PeriodType periodType12 = periodType9.withMinutesRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period((-128849018880L), periodType9);
        org.joda.time.Period period14 = new org.joda.time.Period((long) '4', periodType9);
        org.joda.time.PeriodType periodType15 = periodType9.withMonthsRemoved();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((-1L), (long) (byte) 1, periodType9, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) (-1), (long) ' ', periodType9, chronology18);
        org.joda.time.Period period20 = period19.normalizedStandard();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = period19.withMinutes((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str2 = seconds1.toString();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period7 = period5.minusMonths(0);
        int int8 = period7.getYears();
        org.joda.time.Period period9 = period7.toPeriod();
        org.joda.time.Seconds seconds10 = period7.toStandardSeconds();
        boolean boolean11 = seconds1.isLessThan(seconds10);
        org.joda.time.Duration duration12 = seconds10.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Interval interval14 = duration12.toIntervalTo(readableInstant13);
        long long15 = duration12.getStandardMinutes();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
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
        org.joda.time.format.PeriodParser periodParser23 = periodFormatter22.getParser();
        org.joda.time.format.PeriodParser periodParser24 = periodFormatter22.getParser();
        java.io.Writer writer25 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period29 = period28.negated();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = period29.toDurationTo(readableInstant30);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.Period period34 = duration31.toPeriod(periodType32, chronology33);
        org.joda.time.Period period35 = period34.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter22.printTo(writer25, (org.joda.time.ReadablePeriod) period35);
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
        org.junit.Assert.assertNull(periodParser23);
        org.junit.Assert.assertNull(periodParser24);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        org.joda.time.Period period1 = org.joda.time.Period.days(10);
        org.joda.time.Period period3 = period1.plusMonths((int) 'a');
        org.joda.time.Period period5 = period1.plusSeconds((int) (short) 100);
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        org.joda.time.Duration duration12 = minutes11.toStandardDuration();
        org.joda.time.Minutes minutes14 = minutes11.multipliedBy((int) (short) 1);
        org.joda.time.Duration duration15 = minutes11.toStandardDuration();
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period20 = period18.minusMonths(0);
        org.joda.time.Minutes minutes21 = period20.toStandardMinutes();
        org.joda.time.Duration duration22 = minutes21.toStandardDuration();
        org.joda.time.Period period23 = duration22.toPeriod();
        boolean boolean24 = duration15.isLongerThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.days();
        org.joda.time.Period period27 = duration15.toPeriodTo(readableInstant25, periodType26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = duration15.toPeriodFrom(readableInstant28);
        org.joda.time.Period period30 = period29.negated();
        org.joda.time.Period period32 = period30.minusHours(8);
        org.joda.time.PeriodType periodType33 = period30.getPeriodType();
        org.joda.time.Period period34 = period1.normalizedStandard(periodType33);
        org.joda.time.PeriodType periodType35 = periodType33.withHoursRemoved();
        java.lang.String str36 = periodType35.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PeriodType[StandardNoHours]" + "'", str36, "PeriodType[StandardNoHours]");
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) -1, (int) ' ', (int) '4', (int) (short) -1, 10, (int) 'a', (-1), (int) '4');
        org.joda.time.Period period10 = period8.minusSeconds((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = period8.getFieldType(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        org.joda.time.Days days1 = hours0.toStandardDays();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
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
        org.joda.time.format.PeriodPrinter periodPrinter24 = periodFormatter22.getPrinter();
        org.joda.time.Hours hours26 = org.joda.time.Hours.hours((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod27 = hours26.toMutablePeriod();
        org.joda.time.Period period28 = mutablePeriod27.toPeriod();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period((java.lang.Object) mutablePeriod27, chronology29);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = periodFormatter22.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod27, "Minutes", (int) (byte) 1);
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
        org.junit.Assert.assertNull(periodPrinter24);
        org.junit.Assert.assertNotNull(hours26);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        org.joda.time.Period period1 = org.joda.time.Period.months(6);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
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
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.weeks((int) (byte) 0);
        org.joda.time.Weeks weeks26 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks27 = weeks26.negated();
        org.joda.time.Weeks weeks28 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeksIn(readableInterval29);
        boolean boolean31 = weeks28.isLessThan(weeks30);
        boolean boolean32 = weeks27.isGreaterThan(weeks30);
        boolean boolean33 = weeks24.isLessThan(weeks30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = periodFormatter2.print((org.joda.time.ReadablePeriod) weeks30);
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
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks27);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
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
        org.joda.time.Period period23 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period23.negated();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = period24.toDurationTo(readableInstant25);
        org.joda.time.Minutes minutes27 = period24.toStandardMinutes();
        org.joda.time.PeriodType periodType28 = minutes27.getPeriodType();
        boolean boolean29 = minutes15.isLessThan(minutes27);
        org.joda.time.Period period32 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period34 = period32.minusMonths(0);
        org.joda.time.Minutes minutes35 = period34.toStandardMinutes();
        org.joda.time.Duration duration36 = minutes35.toStandardDuration();
        org.joda.time.Minutes minutes38 = minutes35.multipliedBy((int) (short) 1);
        int int39 = minutes38.getMinutes();
        boolean boolean40 = minutes15.isLessThan(minutes38);
        int int41 = minutes38.getMinutes();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(minutes35);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(minutes38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) '#');
        org.joda.time.PeriodType periodType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) '#', periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((-10));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        int int2 = weeks1.getWeeks();
        java.lang.Class<?> wildcardClass3 = weeks1.getClass();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        java.lang.String str1 = weeks0.toString();
        int int2 = weeks0.size();
        org.joda.time.Weeks weeks4 = weeks0.plus(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType6 = weeks0.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0W" + "'", str1, "P0W");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(weeks4);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT-7H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
        java.lang.String str1 = weeks0.toString();
        int int2 = weeks0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = weeks0.getValue(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0W" + "'", str1, "P0W");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        boolean boolean4 = periodFormatter3.isParser();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter3.withLocale(locale5);
        boolean boolean7 = periodFormatter3.isParser();
        org.joda.time.format.PeriodPrinter periodPrinter8 = periodFormatter3.getPrinter();
        org.joda.time.format.PeriodPrinter periodPrinter9 = periodFormatter3.getPrinter();
        org.joda.time.format.PeriodParser periodParser10 = periodFormatter3.getParser();
        boolean boolean11 = periodFormatter3.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = org.joda.time.Period.parse("P0D", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(periodPrinter8);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNull(periodParser10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
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
        org.joda.time.PeriodType periodType23 = periodFormatter22.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = periodFormatter22.parsePeriod("Weeks");
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
        org.junit.Assert.assertNull(periodType23);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((-128849018880000L), chronology1);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0S");
        java.lang.String str2 = seconds1.toString();
        org.joda.time.DurationFieldType durationFieldType3 = seconds1.getFieldType();
        java.lang.String str4 = durationFieldType3.getName();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "seconds" + "'", str4, "seconds");
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((-35791394L));
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int) (byte) 10);
        org.joda.time.Seconds seconds2 = seconds1.negated();
        java.lang.Class<?> wildcardClass3 = seconds2.getClass();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.Weeks weeks4 = weeks0.dividedBy(8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks6 = weeks4.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Period period7 = period4.plusDays((int) 'a');
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        org.joda.time.Duration duration3 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Days days5 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.PeriodType periodType8 = periodType6.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.days();
        boolean boolean10 = periodType8.isSupported(durationFieldType9);
        org.joda.time.PeriodType periodType11 = periodType8.withMinutesRemoved();
        int int12 = periodType8.size();
        org.joda.time.Period period13 = duration3.toPeriodFrom(readableInstant4, periodType8);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (byte) -1, (long) 4, periodType8, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = period15.minusMinutes(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter3.getPrinter();
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Days days9 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = periodType10.withSecondsRemoved();
        org.joda.time.Period period13 = duration7.toPeriodFrom(readableInstant8, periodType10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) (short) 1, periodType10, chronology14);
        org.joda.time.format.PeriodFormatter periodFormatter16 = periodFormatter3.withParseType(periodType10);
        org.joda.time.Days days17 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        org.joda.time.PeriodType periodType19 = periodType18.withHoursRemoved();
        org.joda.time.PeriodType periodType20 = periodType18.withYearsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter21 = periodFormatter3.withParseType(periodType18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = org.joda.time.Period.parse("PT-1H", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodFormatter16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodFormatter21);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period11 = period9.minusMonths(0);
        org.joda.time.Minutes minutes12 = period11.toStandardMinutes();
        org.joda.time.Duration duration13 = minutes12.toStandardDuration();
        boolean boolean14 = duration6.isShorterThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration16 = duration6.plus((long) (short) 10);
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period21 = period19.minusMonths(0);
        int int22 = period21.getYears();
        org.joda.time.Period period24 = period21.plusYears((int) ' ');
        boolean boolean25 = duration16.equals((java.lang.Object) period24);
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period30 = period28.minusMonths(0);
        org.joda.time.Minutes minutes31 = period30.toStandardMinutes();
        org.joda.time.Duration duration32 = minutes31.toStandardDuration();
        org.joda.time.Period period33 = duration32.toPeriod();
        org.joda.time.Duration duration35 = duration32.plus((long) (byte) 0);
        org.joda.time.Duration duration37 = duration32.withMillis((long) 1);
        boolean boolean38 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration32);
        long long39 = duration32.getStandardHours();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str46 = periodType45.getName();
        boolean boolean48 = periodType45.equals((java.lang.Object) true);
        org.joda.time.Period period49 = new org.joda.time.Period(readableInstant43, readableInstant44, periodType45);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period((long) 0, (long) (-10), periodType45, chronology50);
        org.joda.time.Period period52 = duration32.toPeriodFrom(readableInstant40, periodType45);
        org.joda.time.Period period54 = org.joda.time.Period.seconds(2);
        boolean boolean55 = periodType45.equals((java.lang.Object) period54);
        org.joda.time.Period period57 = period54.plusYears(0);
        int int58 = period54.getDays();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(minutes31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "YearMonthDay" + "'", str46, "YearMonthDay");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P1W", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P5D");
        org.joda.time.Days days3 = days1.multipliedBy((int) (short) 100);
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Days days7 = days4.minus(0);
        org.joda.time.Days days8 = days1.minus(days7);
        java.lang.String str9 = days8.toString();
        org.joda.time.Days days10 = days8.negated();
        org.joda.time.Duration duration13 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration15 = duration13.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, readableInstant16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration15.toIntervalFrom(readableInstant18);
        org.joda.time.Minutes minutes20 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval19);
        org.joda.time.Minutes minutes21 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval19);
        org.joda.time.Minutes minutes22 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval19);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        int int24 = minutes22.get(durationFieldType23);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = days10.compareTo((org.joda.time.base.BaseSingleFieldPeriod) minutes22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Days cannot be compared to class org.joda.time.Minutes");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(minutes20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 0);
        org.joda.time.Period period3 = period1.plusMonths((int) '4');
        org.joda.time.format.PeriodPrinter periodPrinter4 = null;
        org.joda.time.format.PeriodParser periodParser5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = new org.joda.time.format.PeriodFormatter(periodPrinter4, periodParser5);
        boolean boolean7 = periodFormatter6.isParser();
        java.util.Locale locale8 = null;
        org.joda.time.format.PeriodFormatter periodFormatter9 = periodFormatter6.withLocale(locale8);
        org.joda.time.PeriodType periodType10 = periodFormatter6.getParseType();
        boolean boolean11 = periodFormatter6.isParser();
        boolean boolean12 = periodFormatter6.isParser();
        boolean boolean13 = periodFormatter6.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = period3.toString(periodFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodFormatter9);
        org.junit.Assert.assertNull(periodType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        org.joda.time.Period period2 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period4 = period2.minusMonths(0);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Duration duration6 = minutes5.toStandardDuration();
        org.joda.time.Period period7 = duration6.toPeriod();
        org.joda.time.Duration duration9 = duration6.plus((long) (byte) 0);
        org.joda.time.Duration duration11 = duration6.withMillis((long) 1);
        org.joda.time.Minutes minutes12 = duration6.toStandardMinutes();
        java.lang.Class<?> wildcardClass13 = duration6.getClass();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
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
        boolean boolean21 = periodFormatter2.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod23 = periodFormatter2.parseMutablePeriod("PT1M40S");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        org.joda.time.Period period1 = org.joda.time.Period.years((int) (short) 1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
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
        org.joda.time.Period period26 = duration25.toPeriod();
        org.joda.time.Period period28 = period26.plusMinutes((-2147483646));
        org.joda.time.MutablePeriod mutablePeriod29 = period28.toMutablePeriod();
        org.joda.time.Minutes minutes30 = period28.toStandardMinutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period32 = period28.minusMinutes(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2147483646 + -97");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(minutes30);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType23 = period21.getFieldType((-95));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(duration19);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period6.minusMonths(0);
        org.joda.time.Period period10 = period6.minusSeconds((int) (byte) 100);
        org.joda.time.Days days11 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType12 = days11.getPeriodType();
        org.joda.time.PeriodType periodType13 = periodType12.withHoursRemoved();
        org.joda.time.PeriodType periodType14 = periodType12.withYearsRemoved();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.days();
        boolean boolean16 = periodType14.isSupported(durationFieldType15);
        int int17 = period6.get(durationFieldType15);
        org.joda.time.Period period19 = period6.withHours(1);
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period24 = period22.minusMonths(0);
        org.joda.time.Period period26 = period22.minusSeconds((int) (byte) 100);
        org.joda.time.PeriodType periodType27 = period22.getPeriodType();
        org.joda.time.PeriodType periodType28 = periodType27.withMinutesRemoved();
        java.lang.String str29 = periodType28.toString();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((java.lang.Object) period6, periodType28, chronology30);
        org.joda.time.PeriodType periodType32 = periodType28.withHoursRemoved();
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType28);
        org.joda.time.PeriodType periodType34 = periodType28.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period35 = period1.withPeriodType(periodType34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PeriodType[StandardNoMinutes]" + "'", str29, "PeriodType[StandardNoMinutes]");
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(periodType34);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isParser();
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = periodFormatter2.parseMutablePeriod("PT97S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodFormatter8);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        int int2 = weeks1.getWeeks();
        org.joda.time.Period period3 = weeks1.toPeriod();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        boolean boolean7 = weeks4.isLessThan(weeks6);
        boolean boolean8 = weeks1.equals((java.lang.Object) weeks6);
        int int9 = weeks1.getWeeks();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
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
        org.joda.time.Duration duration26 = duration25.toDuration();
        long long27 = duration25.getStandardHours();
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
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration41, readableInstant43);
        long long45 = duration41.getStandardHours();
        org.joda.time.Period period46 = duration41.toPeriod();
        org.joda.time.Duration duration47 = duration25.plus((org.joda.time.ReadableDuration) duration41);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Period period49 = duration25.toPeriodFrom(readableInstant48);
        int int50 = period49.getSeconds();
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
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-35791394L) + "'", long27 == (-35791394L));
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(minutes40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
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
        long long49 = duration48.getStandardMinutes();
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
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        org.joda.time.Period period1 = org.joda.time.Period.years(87);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
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
        java.util.Locale locale16 = periodFormatter13.getLocale();
        java.io.Writer writer17 = null;
        org.joda.time.Period period19 = org.joda.time.Period.millis(0);
        org.joda.time.Days days20 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Days days22 = days20.plus((int) ' ');
        org.joda.time.Duration duration25 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration27 = duration25.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration27, readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Interval interval31 = duration27.toIntervalFrom(readableInstant30);
        org.joda.time.Days days32 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval31);
        org.joda.time.Days days34 = days32.minus((int) '4');
        org.joda.time.Duration duration35 = days32.toStandardDuration();
        org.joda.time.Days days36 = org.joda.time.Days.FIVE;
        java.lang.String str37 = days36.toString();
        org.joda.time.Days days39 = days36.multipliedBy((int) (byte) -1);
        org.joda.time.Days days40 = days36.negated();
        org.joda.time.Days days41 = org.joda.time.Days.ONE;
        org.joda.time.Days days42 = org.joda.time.Days.ONE;
        int int43 = days41.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days42);
        org.joda.time.Days days45 = days42.multipliedBy((int) '#');
        org.joda.time.Days days46 = days40.minus(days42);
        org.joda.time.MutablePeriod mutablePeriod47 = days40.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod48 = days40.toMutablePeriod();
        boolean boolean49 = days32.isGreaterThan(days40);
        org.joda.time.Days days50 = days20.plus(days32);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter13.printTo(writer17, (org.joda.time.ReadablePeriod) days32);
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
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "P5D" + "'", str37, "P5D");
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(days42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(days45);
        org.junit.Assert.assertNotNull(days46);
        org.junit.Assert.assertNotNull(mutablePeriod47);
        org.junit.Assert.assertNotNull(mutablePeriod48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(days50);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        boolean boolean3 = periodFormatter2.isParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.Seconds seconds6 = org.joda.time.Seconds.TWO;
        org.joda.time.MutablePeriod mutablePeriod7 = seconds6.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = periodFormatter5.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod7, "Seconds", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = periodFormatter2.getParseType();
        java.io.Writer writer4 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period8 = period7.negated();
        int int9 = period7.getHours();
        int int10 = period7.getWeeks();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer4, (org.joda.time.ReadablePeriod) period7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodType3);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds2 = seconds0.plus(seconds1);
        org.joda.time.PeriodType periodType3 = seconds0.getPeriodType();
        int int4 = seconds0.size();
        org.joda.time.PeriodType periodType5 = seconds0.getPeriodType();
        org.joda.time.PeriodType periodType6 = periodType5.withSecondsRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withMillisRemoved();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
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
        org.joda.time.Days days16 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        org.joda.time.PeriodType periodType18 = periodType17.withHoursRemoved();
        org.joda.time.PeriodType periodType19 = periodType17.withYearsRemoved();
        org.joda.time.format.PeriodFormatter periodFormatter20 = periodFormatter2.withParseType(periodType17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod22 = periodFormatter20.parseMutablePeriod("P1D");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
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
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodFormatter20);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(1);
        org.joda.time.Weeks weeks4 = weeks0.dividedBy(8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days5 = weeks0.toStandardDays();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 7");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration4 = duration2.plus((long) (-1));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalFrom(readableInstant7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval8);
        org.joda.time.Minutes minutes11 = minutes10.negated();
        org.joda.time.Minutes minutes13 = minutes11.minus((-97));
        int int14 = minutes13.getMinutes();
        org.joda.time.DurationFieldType durationFieldType15 = minutes13.getFieldType();
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(durationFieldType15);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
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
        org.joda.time.Period period23 = org.joda.time.Period.millis(0);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.months();
        boolean boolean25 = period23.isSupported(durationFieldType24);
        java.lang.String str26 = durationFieldType24.getName();
        int int27 = period21.get(durationFieldType24);
        int int28 = period21.getSeconds();
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
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "months" + "'", str26, "months");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PeriodType[Days]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Days]\" is malformed at \"eriodType[Days]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((-35));
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(7);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period6 = period4.minusMonths(0);
        org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
        org.joda.time.Duration duration8 = minutes7.toStandardDuration();
        org.joda.time.Minutes minutes10 = minutes7.multipliedBy((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType11 = minutes7.getFieldType();
        org.joda.time.Period period13 = period1.withFieldAdded(durationFieldType11, (int) (byte) 1);
        org.joda.time.Period period15 = period1.minusMonths((-10));
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearMonthDay();
        java.lang.String str17 = periodType16.getName();
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.ONE;
        boolean boolean19 = periodType16.equals((java.lang.Object) weeks18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = period15.withPeriodType(periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "YearMonthDay" + "'", str17, "YearMonthDay");
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 100);
        int int2 = period1.size();
        int int3 = period1.getSeconds();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
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
        org.joda.time.format.PeriodParser periodParser10 = periodFormatter2.getParser();
        java.io.Writer writer11 = null;
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.THREE;
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer11, (org.joda.time.ReadablePeriod) weeks12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNull(periodParser10);
        org.junit.Assert.assertNotNull(weeks12);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
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
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DurationField durationField24 = durationFieldType22.getField(chronology23);
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
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Weeks weeks2 = weeks1.negated();
        org.joda.time.Weeks weeks3 = weeks1.negated();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks3);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod19 = periodFormatter13.parseMutablePeriod("PT0.010S");
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
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
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
        org.joda.time.format.PeriodPrinter periodPrinter17 = null;
        org.joda.time.format.PeriodParser periodParser18 = null;
        org.joda.time.format.PeriodFormatter periodFormatter19 = new org.joda.time.format.PeriodFormatter(periodPrinter17, periodParser18);
        boolean boolean20 = periodFormatter19.isParser();
        org.joda.time.Seconds seconds22 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds23 = org.joda.time.Seconds.TWO;
        org.joda.time.Seconds seconds24 = seconds22.plus(seconds23);
        org.joda.time.PeriodType periodType25 = seconds22.getPeriodType();
        org.joda.time.Period period28 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period29 = period28.negated();
        org.joda.time.DurationFieldType durationFieldType31 = period28.getFieldType((int) (short) 1);
        int int32 = periodType25.indexOf(durationFieldType31);
        org.joda.time.Period period33 = new org.joda.time.Period((long) ' ', periodType25);
        org.joda.time.format.PeriodFormatter periodFormatter34 = periodFormatter19.withParseType(periodType25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = period14.toString(periodFormatter34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertNotNull(seconds24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(periodFormatter34);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration4 = duration1.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Period period5 = duration3.toPeriod();
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period10 = period8.minusMonths(0);
        org.joda.time.Minutes minutes11 = period10.toStandardMinutes();
        org.joda.time.Duration duration12 = minutes11.toStandardDuration();
        org.joda.time.Period period15 = new org.joda.time.Period((long) '#', (long) (-1));
        org.joda.time.Period period17 = period15.minusMonths(0);
        org.joda.time.Minutes minutes18 = period17.toStandardMinutes();
        org.joda.time.Duration duration19 = minutes18.toStandardDuration();
        boolean boolean20 = duration12.isShorterThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Period period21 = duration19.toPeriod();
        long long22 = duration19.getStandardSeconds();
        org.joda.time.Duration duration23 = duration19.toDuration();
        org.joda.time.Duration duration25 = org.joda.time.Duration.parse("PT0S");
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Duration duration28 = duration25.plus((org.joda.time.ReadableDuration) duration27);
        long long29 = duration27.getMillis();
        int int30 = duration19.compareTo((org.joda.time.ReadableDuration) duration27);
        long long31 = duration27.getStandardDays();
        org.joda.time.Duration duration34 = new org.joda.time.Duration((long) (byte) -1, (long) (byte) 10);
        org.joda.time.Duration duration36 = duration34.plus((long) (-1));
        org.joda.time.Duration duration37 = duration27.plus((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Duration duration38 = duration3.plus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration40 = duration38.minus((long) (-2));
        org.joda.time.ReadableDuration readableDuration41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = duration40.compareTo(readableDuration41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 6000000L + "'", long29 == 6000000L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration40);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
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
        java.util.Locale locale10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter2.withLocale(locale10);
        boolean boolean12 = periodFormatter2.isPrinter();
        org.joda.time.Period period14 = org.joda.time.Period.millis((int) '#');
        int int15 = period14.getYears();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.Period period17 = period14.withFields(readablePeriod16);
        org.joda.time.MutablePeriod mutablePeriod18 = period14.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod18, "StandardNoDays", (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodFormatter7);
        org.junit.Assert.assertNull(periodType8);
        org.junit.Assert.assertNull(periodPrinter9);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(mutablePeriod18);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        org.joda.time.Hours hours0 = org.joda.time.Hours.MAX_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.DurationFieldType durationFieldType2 = hours0.getFieldType();
        org.joda.time.Hours hours4 = hours0.dividedBy((-95));
        org.joda.time.DurationFieldType durationFieldType5 = hours0.getFieldType();
        org.joda.time.PeriodType periodType6 = hours0.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours8 = hours0.minus((-36));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 2147483647 + 36");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(100L);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.FIVE;
        org.joda.time.PeriodType periodType4 = days3.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.PeriodType periodType6 = periodType4.withSecondsRemoved();
        org.joda.time.Period period7 = duration1.toPeriodFrom(readableInstant2, periodType4);
        org.joda.time.Days days8 = duration1.toStandardDays();
        org.joda.time.Days days9 = org.joda.time.Days.MIN_VALUE;
        boolean boolean10 = days8.isLessThan(days9);
        org.joda.time.Period period11 = days9.toPeriod();
        java.lang.Class<?> wildcardClass12 = period11.getClass();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

