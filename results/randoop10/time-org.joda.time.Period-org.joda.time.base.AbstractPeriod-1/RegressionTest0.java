import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("hi!", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.fieldDifference(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutesBetween(readableInstant0, readableInstant1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("hi!", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        int int5 = mutablePeriod2.getYears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration6 = new org.joda.time.Duration((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((java.lang.Object) 'a', chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT1M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT1M\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.Chronology chronology9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) period4, periodType8, chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        mutablePeriod2.setHours((int) (short) 100);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration6, chronology7);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType12 = seconds11.getFieldType();
        mutablePeriod2.add(durationFieldType12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod2.getFieldType(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = new org.joda.time.Period(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 0, (long) (byte) 10, periodType2, chronology3);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType6 = periodType5.withMinutesRemoved();
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) 0, periodType6, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds2 = org.joda.time.Seconds.secondsBetween(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        mutablePeriod2.setHours((int) (short) 100);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration6, chronology7);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType12 = seconds11.getFieldType();
        mutablePeriod2.add(durationFieldType12, (int) (short) 0);
        java.lang.String str15 = durationFieldType12.toString();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant16, readableDuration17);
        mutablePeriod18.setHours((int) (short) 100);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod18.setPeriod((org.joda.time.ReadableDuration) duration22, chronology23);
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds27 = duration26.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType28 = seconds27.getFieldType();
        mutablePeriod18.add(durationFieldType28, (int) (short) 0);
        java.lang.String str31 = durationFieldType28.toString();
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableInstant33, readableDuration34);
        mutablePeriod35.setHours((int) (short) 100);
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology40 = null;
        mutablePeriod35.setPeriod((org.joda.time.ReadableDuration) duration39, chronology40);
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds44 = duration43.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType45 = seconds44.getFieldType();
        mutablePeriod35.add(durationFieldType45, (int) (short) 0);
        java.lang.String str48 = durationFieldType45.toString();
        org.joda.time.DurationFieldType[] durationFieldTypeArray49 = new org.joda.time.DurationFieldType[] { durationFieldType12, durationFieldType28, durationFieldType32, durationFieldType45 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.forFields(durationFieldTypeArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: PeriodType does not support fields: [seconds, weekyears, seconds]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "seconds" + "'", str15, "seconds");
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(seconds27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "seconds" + "'", str31, "seconds");
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(seconds44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "seconds" + "'", str48, "seconds");
        org.junit.Assert.assertNotNull(durationFieldTypeArray49);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days2 = org.joda.time.Days.daysBetween(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((java.lang.Object) days0, periodType1, chronology2);
        org.joda.time.Hours hours4 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours6 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean7 = hours4.isGreaterThan(hours6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = days0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) hours4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Days cannot be compared to class org.joda.time.Hours");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str1 = durationFieldType0.getName();
        org.joda.time.DurationFieldType[] durationFieldTypeArray2 = new org.joda.time.DurationFieldType[] { durationFieldType0 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.forFields(durationFieldTypeArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: PeriodType does not support fields: [weekyears]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "weekyears" + "'", str1, "weekyears");
        org.junit.Assert.assertNotNull(durationFieldTypeArray2);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("weekyears");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"weekyears\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksIn(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.weeksIn(readableInterval3);
        boolean boolean5 = weeks2.isLessThan(weeks4);
        org.joda.time.Weeks weeks6 = weeks2.negated();
        org.joda.time.Weeks weeks8 = weeks6.minus((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hours0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) weeks6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Hours cannot be compared to class org.joda.time.Weeks");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.Days days2 = org.joda.time.Days.ZERO;
        int int3 = days2.getDays();
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period8 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period8);
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        boolean boolean11 = days6.isGreaterThan(days9);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Days days15 = days9.minus(days14);
        org.joda.time.Days days16 = days2.minus(days9);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = weeks1.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Weeks cannot be compared to class org.joda.time.Days");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant7, periodType8);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period10.withFieldAdded(durationFieldType11, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weekyears'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(durationFieldType11);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"seconds\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) weeks1, chronology6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = period7.minusMinutes(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks6 = weeks3.minus((int) (short) -1);
        org.joda.time.Weeks weeks7 = weeks6.negated();
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period12 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days13 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period12);
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        boolean boolean15 = days10.isGreaterThan(days13);
        org.joda.time.Period period17 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days18 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Days days19 = days13.minus(days18);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = weeks6.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Weeks cannot be compared to class org.joda.time.Days");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days19);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType1 = seconds0.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds3 = seconds0.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType2);
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = periodType7.indexOf(durationFieldType8);
        org.joda.time.PeriodType periodType10 = periodType7.withWeeksRemoved();
        org.joda.time.Chronology chronology11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) '#', periodType7, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 0, (long) (byte) 10, periodType4, chronology5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = days2.getFieldType((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType2 = seconds1.getPeriodType();
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((java.lang.Object) (byte) 1, periodType2, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        int int1 = days0.getDays();
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        boolean boolean9 = days4.isGreaterThan(days7);
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Days days13 = days7.minus(days12);
        org.joda.time.Days days14 = days0.minus(days7);
        int int15 = days0.getDays();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType2 = minutes1.getPeriodType();
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = new org.joda.time.Period((java.lang.Object) hours0, periodType2, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("seconds", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = new org.joda.time.Period((java.lang.Object) "hi!", periodType1, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        org.joda.time.Chronology chronology11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((java.lang.Object) period4, periodType9, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = seconds2.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours2 = hours0.minus(0);
        org.joda.time.Hours hours3 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours5 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean6 = hours3.isGreaterThan(hours5);
        boolean boolean7 = hours2.isLessThan(hours5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = hours5.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes2 = org.joda.time.Minutes.minutesBetween(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("weekyears");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"weekyears\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        long long1 = duration0.getStandardDays();
        org.joda.time.Hours hours2 = duration0.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType3 = hours2.getFieldType();
        org.joda.time.Hours hours4 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours6 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean7 = hours4.isGreaterThan(hours6);
        org.joda.time.Hours hours9 = hours4.minus((int) (byte) 0);
        org.joda.time.Hours hours10 = hours2.minus(hours4);
        org.joda.time.base.BaseSingleFieldPeriod baseSingleFieldPeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hours4.compareTo(baseSingleFieldPeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours10);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks6 = weeks3.minus((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = weeks6.getValue(25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 25");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks6);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Weeks weeks1 = days0.toStandardWeeks();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
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
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        long long1 = duration0.getStandardDays();
        org.joda.time.Hours hours2 = duration0.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType3 = hours2.getFieldType();
        org.joda.time.Days days4 = hours2.toStandardDays();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(days4);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', (long) (short) 0, periodType4);
        org.joda.time.Duration duration6 = period5.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = period5.withWeeks((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType1 = periodType0.withMinutesRemoved();
        org.joda.time.PeriodType periodType2 = periodType0.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = periodType2.getFieldType((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = periodType1.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant1, readableDuration2);
        mutablePeriod3.setPeriod((long) ' ', (long) 52);
        mutablePeriod3.addDays(100);
        org.joda.time.PeriodType periodType9 = mutablePeriod3.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((java.lang.Object) true, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = periodFormatter2.parsePeriod("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType3 = minutes2.getPeriodType();
        org.joda.time.PeriodType periodType4 = periodType3.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        java.lang.String str3 = seconds2.toString();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.days();
        boolean boolean5 = seconds2.isSupported(durationFieldType4);
        org.joda.time.Hours hours6 = seconds2.toStandardHours();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT60S" + "'", str3, "PT60S");
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hours6);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.THREE;
        org.junit.Assert.assertNotNull(seconds0);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("PeriodType[Minutes]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Minutes]\" is malformed at \"eriodType[Minutes]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Seconds seconds9 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period8);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer3, (org.joda.time.ReadablePeriod) period8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds9);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.Days days2 = weeks1.toStandardDays();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours2 = org.joda.time.Hours.hoursBetween(readableInstant0, readableInstant1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.plusYears((int) ' ');
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        boolean boolean8 = weeks5.isLessThan(weeks7);
        org.joda.time.Weeks weeks9 = weeks5.negated();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) weeks5, chronology10);
        boolean boolean12 = period3.equals((java.lang.Object) period11);
        int int13 = period3.getMonths();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours14 = period3.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Hours as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 0, (long) (byte) 10, periodType2, chronology3);
        org.joda.time.Duration duration5 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration5.toPeriod(chronology6);
        org.joda.time.Period period8 = period4.withFields((org.joda.time.ReadablePeriod) period7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period8.minusMinutes(52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.Days days1 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((java.lang.Object) days1, periodType2, chronology3);
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 52, periodType2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod5.addMinutes(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant1, readableDuration2);
        mutablePeriod3.setHours((int) (short) 100);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration7, chronology8);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration7, periodType11);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod13.setYears((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration1 = seconds0.toStandardDuration();
        org.joda.time.Days days2 = seconds0.toStandardDays();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.MutablePeriod mutablePeriod4 = org.joda.time.MutablePeriod.parse("PT1M");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod4, "weekyears", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod4);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        java.io.Writer writer3 = null;
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer3, readablePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksBetween(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days2 = org.joda.time.Days.daysBetween(readableInstant0, readableInstant1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        org.joda.time.Weeks weeks2 = minutes0.toStandardWeeks();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer4, readablePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType3 = minutes2.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType1 = minutes0.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes2 = minutes0.negated();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days2 = days0.dividedBy((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = period3.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period8 = period6.normalizedStandard(periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType7);
        mutablePeriod9.addMillis((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.addWeeks((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.ZERO;
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter5.printTo(stringBuffer6, (org.joda.time.ReadablePeriod) minutes7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(minutes7);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) weeks1, chronology6);
        org.joda.time.Weeks weeks9 = weeks1.multipliedBy((int) (byte) 1);
        org.joda.time.Duration duration10 = weeks1.toStandardDuration();
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.ZERO;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = weeks1.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Weeks cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeksIn(readableInterval7);
        boolean boolean9 = weeks6.isLessThan(weeks8);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer4, (org.joda.time.ReadablePeriod) weeks6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant6, readableDuration7);
        mutablePeriod8.setHours((int) (short) 100);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology13 = null;
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration12, chronology13);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds17 = duration16.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType18 = seconds17.getFieldType();
        mutablePeriod8.add(durationFieldType18, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableInstant21, readableDuration22);
        mutablePeriod23.setHours((int) (short) 100);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod23.setPeriod((org.joda.time.ReadableDuration) duration27, chronology28);
        org.joda.time.Chronology chronology30 = null;
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration27, chronology30);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = periodFormatter5.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod8, "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(duration27);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT0.001S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = periodFormatter2.parsePeriod("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', (long) (short) 0, periodType4);
        org.joda.time.Duration duration6 = period5.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = period5.plusHours(2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(duration6);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Minutes minutes2 = hours0.toStandardMinutes();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        java.lang.String str3 = seconds2.toString();
        org.joda.time.PeriodType periodType4 = seconds2.getPeriodType();
        org.joda.time.PeriodType periodType5 = seconds2.getPeriodType();
        org.joda.time.Period period7 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days8 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period10 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period10);
        org.joda.time.PeriodType periodType12 = days11.getPeriodType();
        boolean boolean13 = days8.isGreaterThan(days11);
        org.joda.time.Period period15 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days16 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Days days17 = days11.minus(days16);
        org.joda.time.Period period19 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days20 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Days days22 = days20.minus(10);
        org.joda.time.Days days23 = days11.plus(days20);
        org.joda.time.Days days25 = days23.dividedBy(100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = seconds2.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Seconds cannot be compared to class org.joda.time.Days");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT60S" + "'", str3, "PT60S");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days25);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.Period period11 = period8.withPeriodType(periodType9);
        int int12 = period11.getHours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = period11.withMonths((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Duration duration1 = hours0.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = hours0.getFieldType((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        org.joda.time.Period period5 = period3.withHours(0);
        int int6 = period5.getMinutes();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        long long1 = duration0.getStandardDays();
        org.joda.time.Hours hours2 = duration0.toStandardHours();
        org.joda.time.Seconds seconds3 = hours2.toStandardSeconds();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(seconds3);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds2 = org.joda.time.Seconds.secondsBetween(readableInstant0, readableInstant1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks6 = weeks3.minus((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = weeks3.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks6);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) (short) 1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FIVE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours2 = hours0.dividedBy((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.joda.time.Days days1 = org.joda.time.Days.days(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period9 = period6.withSeconds((int) ' ');
        org.joda.time.Period period10 = period3.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType12 = periodType11.withMonthsRemoved();
        org.joda.time.Period period13 = period10.withPeriodType(periodType11);
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 0, (-1L), periodType11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = period14.withYears((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant6, readableDuration7);
        mutablePeriod8.setHours((int) (short) 100);
        boolean boolean11 = periodType5.equals((java.lang.Object) mutablePeriod8);
        org.joda.time.Duration duration12 = org.joda.time.Duration.ZERO;
        long long13 = duration12.getStandardDays();
        mutablePeriod8.add((org.joda.time.ReadableDuration) duration12);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.weekyears();
        int int20 = period18.get(durationFieldType19);
        int int21 = mutablePeriod8.get(durationFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod1.add(durationFieldType19, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weekyears'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType2);
        int int4 = period3.getMillis();
        int int5 = period3.getMonths();
        int int6 = period3.getWeeks();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 25 + "'", int4 == 25);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.plusYears((int) ' ');
        org.joda.time.Period period5 = period3.minusYears((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks6 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as years is not precise in the period P32YT1M");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 0, periodType1, chronology2);
        mutablePeriod3.setMonths((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setHours((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.Seconds seconds4 = days2.toStandardSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(seconds4);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes3 = minutes0.plus(minutes2);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes6 = minutes4.plus((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes7 = minutes3.minus(minutes6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2147483648 + -1");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes6);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        int int8 = days2.size();
        org.joda.time.Days days9 = days2.negated();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) days9, chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType13 = days9.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(days9);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 32);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) (byte) -1);
        org.joda.time.Hours hours3 = hours1.multipliedBy((-1));
        org.joda.time.Hours hours5 = hours3.minus((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours7 = hours5.dividedBy((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        java.lang.String str11 = seconds10.toString();
        org.joda.time.PeriodType periodType12 = seconds10.getPeriodType();
        org.joda.time.PeriodType periodType13 = periodType12.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = new org.joda.time.Period((int) (short) 100, (int) (short) 10, 0, 100, (int) (short) 10, (-1), (int) (byte) 1, 52, periodType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT60S" + "'", str11, "PT60S");
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.plusYears((int) ' ');
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        boolean boolean8 = weeks5.isLessThan(weeks7);
        org.joda.time.Weeks weeks9 = weeks5.negated();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) weeks5, chronology10);
        boolean boolean12 = period3.equals((java.lang.Object) period11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = period11.plusSeconds((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 0, 52, (int) (short) -1, 52, (-1), (int) ' ', (int) '4', 8);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod8.setValue((int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Seconds seconds2 = hours0.toStandardSeconds();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType6 = minutes5.getFieldType();
        org.joda.time.PeriodType periodType7 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withParseType(periodType7);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod11.addYears((int) '4');
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod11.add((long) 100, chronology15);
        mutablePeriod11.setMillis((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = periodFormatter8.print((org.joda.time.ReadablePeriod) mutablePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 0, (long) (byte) 10, periodType2, chronology3);
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableInstant9, readableDuration10);
        mutablePeriod11.setHours((int) (short) 100);
        boolean boolean14 = periodType8.equals((java.lang.Object) mutablePeriod11);
        org.joda.time.Duration duration15 = org.joda.time.Duration.ZERO;
        long long16 = duration15.getStandardDays();
        mutablePeriod11.add((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType20 = periodType19.withWeeksRemoved();
        org.joda.time.PeriodType periodType21 = periodType20.withDaysRemoved();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration15, readableInstant18, periodType20);
        org.joda.time.PeriodType periodType23 = periodType20.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) (byte) 10, periodType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = periodType2.getFieldType((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Duration duration1 = hours0.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, readableInstant2);
        java.lang.String str4 = duration1.toString();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT14400S" + "'", str4, "PT14400S");
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ONE;
        org.joda.time.Hours hours1 = weeks0.toStandardHours();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Period period10 = period7.withMillis(100);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.time();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) 100, periodType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PeriodType[Millis]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Millis]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = duration0.toPeriod(chronology1);
        int int3 = period2.size();
        org.joda.time.Period period5 = period2.plusHours((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration6 = new org.joda.time.Duration((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType3 = seconds2.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) weeks1, chronology6);
        int[] intArray8 = period7.getValues();
        org.joda.time.Days days9 = org.joda.time.Days.THREE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period7.withFields((org.joda.time.ReadablePeriod) days9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertNotNull(days9);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("PT-2147483648M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT-2147483648M\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1);
        mutablePeriod2.setPeriod(1L, (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = mutablePeriod2.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        int int6 = mutablePeriod4.get(durationFieldType5);
        org.joda.time.Chronology chronology7 = null;
        boolean boolean8 = durationFieldType5.isSupported(chronology7);
        org.joda.time.Chronology chronology9 = null;
        boolean boolean10 = durationFieldType5.isSupported(chronology9);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) 100, chronology6);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.setValue(32, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = periodType5.indexOf(durationFieldType6);
        org.joda.time.PeriodType periodType8 = periodType5.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) '4', (long) 'a', periodType8);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.addMillis((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType6 = minutes5.getFieldType();
        org.joda.time.PeriodType periodType7 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withParseType(periodType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = periodFormatter2.parseMutablePeriod("PT4H");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) weeks1, chronology6);
        int[] intArray8 = period7.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period7.plusHours((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        mutablePeriod2.setHours((int) (short) 100);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration6, chronology7);
        org.joda.time.Period period9 = duration6.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType11 = period9.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT0.052S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.days();
        int int6 = mutablePeriod4.get(durationFieldType5);
        org.joda.time.Hours hours7 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withDaysRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period((long) 'a', (long) (short) 0, periodType12);
        mutablePeriod4.add((org.joda.time.ReadablePeriod) period13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = period13.plusMonths((-32));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = periodFormatter2.parsePeriod("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1);
        org.joda.time.format.PeriodFormatter periodFormatter3 = null;
        java.lang.String str4 = mutablePeriod2.toString(periodFormatter3);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.weeksIn(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeksIn(readableInterval7);
        boolean boolean9 = weeks6.isLessThan(weeks8);
        org.joda.time.Weeks weeks10 = weeks6.negated();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.Weeks weeks12 = org.joda.time.Weeks.weeksIn(readableInterval11);
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.Weeks weeks14 = org.joda.time.Weeks.weeksIn(readableInterval13);
        boolean boolean15 = weeks12.isLessThan(weeks14);
        org.joda.time.Weeks weeks16 = weeks12.negated();
        org.joda.time.Weeks weeks18 = weeks16.minus((int) (byte) 100);
        org.joda.time.Weeks weeks19 = weeks10.plus(weeks16);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.days();
        int int21 = weeks19.get(durationFieldType20);
        int int22 = mutablePeriod2.get(durationFieldType20);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = mutablePeriod2.getValue(13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.plus((int) (byte) 0);
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        java.lang.String str6 = seconds5.toString();
        org.joda.time.PeriodType periodType7 = seconds5.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period((java.lang.Object) weeks0, periodType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT60S" + "'", str6, "PT60S");
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        boolean boolean13 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.Period period14 = duration8.toPeriod();
        boolean boolean15 = duration4.isLongerThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = duration4.toPeriodTo(readableInstant16);
        long long18 = duration4.getStandardDays();
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period21 = duration20.toPeriod();
        long long22 = duration20.getStandardSeconds();
        boolean boolean23 = duration4.isEqual((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds26 = duration25.toStandardSeconds();
        java.lang.String str27 = seconds26.toString();
        org.joda.time.PeriodType periodType28 = seconds26.getPeriodType();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((java.lang.Object) duration4, periodType28, chronology29);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod30.setDays((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-60L) + "'", long22 == (-60L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PT60S" + "'", str27, "PT60S");
        org.junit.Assert.assertNotNull(periodType28);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.Days days6 = org.joda.time.Days.ZERO;
        int int7 = days6.getDays();
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period12 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days13 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period12);
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        boolean boolean15 = days10.isGreaterThan(days13);
        org.joda.time.Period period17 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days18 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Days days19 = days13.minus(days18);
        org.joda.time.Days days20 = days6.minus(days13);
        boolean boolean21 = duration1.equals((java.lang.Object) days13);
        org.joda.time.Period period23 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days24 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Days days26 = days24.minus(10);
        org.joda.time.Days days28 = days26.plus((int) (short) -1);
        org.joda.time.Days days29 = days13.plus(days26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType31 = days26.getFieldType((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days29);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean3 = hours0.isGreaterThan(hours2);
        org.joda.time.Hours hours5 = hours0.minus((int) (byte) 0);
        org.joda.time.Hours hours7 = hours5.plus(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours9 = hours5.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.plus((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds3 = weeks0.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 604800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT4H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT3H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = seconds2.plus(25);
        org.joda.time.Seconds seconds6 = seconds2.negated();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds8 = seconds2.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration1 = seconds0.toStandardDuration();
        java.lang.String str2 = duration1.toString();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT2S" + "'", str2, "PT2S");
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.Hours hours0 = org.joda.time.Hours.TWO;
        org.joda.time.Duration duration1 = hours0.toStandardDuration();
        org.joda.time.Minutes minutes2 = hours0.toStandardMinutes();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter5 = periodFormatter3.getPrinter();
        java.util.Locale locale6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter3.withLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod8 = org.joda.time.MutablePeriod.parse("PT4H", periodFormatter7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNull(periodPrinter5);
        org.junit.Assert.assertNotNull(periodFormatter7);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (-1));
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period9 = period6.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period11 = period9.normalizedStandard(periodType10);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType10);
        org.joda.time.PeriodType periodType13 = periodType10.withYearsRemoved();
        org.joda.time.Period period14 = duration1.toPeriodTo(readableInstant2, periodType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = period14.withMonths((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.ZERO;
        long long3 = duration2.getStandardDays();
        org.joda.time.Hours hours4 = duration2.toStandardHours();
        org.joda.time.PeriodType periodType5 = hours4.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes3 = minutes0.plus(minutes2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes5 = minutes2.multipliedBy(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 3");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes3);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        java.lang.String str2 = mutablePeriod1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType4 = seconds3.getFieldType();
        org.joda.time.Seconds seconds6 = seconds3.plus(25);
        org.joda.time.Seconds seconds7 = seconds3.negated();
        org.joda.time.PeriodType periodType8 = seconds7.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object) "PeriodType[Millis]", periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Millis]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Weeks weeks4 = minutes0.toStandardWeeks();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(weeks4);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter5 = periodFormatter3.getPrinter();
        java.util.Locale locale6 = null;
        org.joda.time.format.PeriodFormatter periodFormatter7 = periodFormatter3.withLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = org.joda.time.Period.parse("PT0S", periodFormatter7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNull(periodPrinter5);
        org.junit.Assert.assertNotNull(periodFormatter7);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = hours1.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Duration duration3 = new org.joda.time.Duration((long) (-1));
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Period period8 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period11 = period8.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period13 = period11.normalizedStandard(periodType12);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableInstant5, readableInstant6, periodType12);
        org.joda.time.PeriodType periodType15 = periodType12.withYearsRemoved();
        org.joda.time.Period period16 = duration3.toPeriodTo(readableInstant4, periodType15);
        org.joda.time.PeriodType periodType17 = periodType15.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = org.joda.time.Period.parse("PeriodType[Minutes]", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (-1), periodType2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setMinutes((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.plus((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks3 = weeks0.negated();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType9 = minutes8.getPeriodType();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        java.lang.String str11 = periodType9.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((int) (short) 100, (int) (byte) -1, 0, (int) (short) 1, (int) (short) 0, (int) '4', 10, 13, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PeriodType[Minutes]" + "'", str11, "PeriodType[Minutes]");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Days days9 = days2.minus(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days11 = days2.dividedBy((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(days9);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Days days1 = hours0.toStandardDays();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '4', chronology1);
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((java.lang.Object) '4', chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT1M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours2 = org.joda.time.Hours.hoursBetween(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days2 = days0.minus(25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration3 = new org.joda.time.Duration((java.lang.Object) 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 0, periodType1, chronology2);
        mutablePeriod3.setMonths((int) (byte) 100);
        int int6 = mutablePeriod3.getYears();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setMillis(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT600S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        int int5 = period4.getSeconds();
        org.joda.time.Period period7 = period4.minusMillis(0);
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period11 = period9.minusWeeks(52);
        org.joda.time.Period period12 = period4.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.DurationFieldType durationFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = period12.withFieldAdded(durationFieldType13, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = periodType5.indexOf(durationFieldType6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 0, (long) (byte) 10, periodType2, chronology3);
        org.joda.time.Duration duration5 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration5.toPeriod(chronology6);
        org.joda.time.Period period8 = period4.withFields((org.joda.time.ReadablePeriod) period7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period4.minusMillis((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType5 = periodFormatter2.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = periodFormatter2.parsePeriod("PT1M");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(periodType5);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeksIn(readableInterval8);
        boolean boolean10 = weeks7.isLessThan(weeks9);
        org.joda.time.Weeks weeks11 = weeks7.negated();
        org.joda.time.Weeks weeks13 = weeks11.minus((int) (byte) 100);
        org.joda.time.Weeks weeks14 = weeks5.plus(weeks11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType16 = weeks11.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT2S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        java.lang.String str3 = seconds2.toString();
        org.joda.time.PeriodType periodType4 = seconds2.getPeriodType();
        org.joda.time.PeriodType periodType5 = seconds2.getPeriodType();
        org.joda.time.Days days6 = seconds2.toStandardDays();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT60S" + "'", str3, "PT60S");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(days6);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("P0W");
        org.joda.time.Days days2 = seconds1.toStandardDays();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isParser();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod9, "P0W", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = periodFormatter2.parsePeriod("PT14400S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.MutablePeriod mutablePeriod8 = days2.toMutablePeriod();
        int int9 = mutablePeriod8.getMinutes();
        mutablePeriod8.addMonths((-32));
        mutablePeriod8.setWeeks(25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes14 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P-32M25W");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT0.052S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType5 = periodFormatter2.getParseType();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Period period8 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period10 = period8.minusWeeks(52);
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period8);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer6, (org.joda.time.ReadablePeriod) days11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(periodType5);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days11);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.Duration duration9 = new org.joda.time.Duration((long) (-1));
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period14 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days15 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period17 = period14.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period19 = period17.normalizedStandard(periodType18);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant11, readableInstant12, periodType18);
        org.joda.time.PeriodType periodType21 = periodType18.withYearsRemoved();
        org.joda.time.Period period22 = duration9.toPeriodTo(readableInstant10, periodType21);
        org.joda.time.PeriodType periodType23 = periodType21.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) (byte) 10, (int) '#', (-32), 3, (int) (short) -1, (int) (short) 0, (int) (byte) 1, (-1), periodType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        int int1 = days0.getDays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = days0.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        mutablePeriod2.setSeconds(8);
        mutablePeriod2.setValue(1, 2);
        org.joda.time.Duration duration10 = new org.joda.time.Duration((-1L), (long) ' ');
        mutablePeriod2.add((org.joda.time.ReadableDuration) duration10);
        mutablePeriod2.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration13 = new org.joda.time.Duration((java.lang.Object) mutablePeriod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.MutablePeriod");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.util.Locale locale6 = periodFormatter2.getLocale();
        org.joda.time.Period period8 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period8);
        org.joda.time.PeriodType periodType10 = days9.getPeriodType();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant11, readableDuration12);
        mutablePeriod13.setHours((int) (short) 100);
        boolean boolean16 = periodType10.equals((java.lang.Object) mutablePeriod13);
        org.joda.time.Duration duration17 = org.joda.time.Duration.ZERO;
        long long18 = duration17.getStandardDays();
        mutablePeriod13.add((org.joda.time.ReadableDuration) duration17);
        mutablePeriod13.setWeeks(8);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod13, "seconds", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period6 = period4.normalizedStandard(periodType5);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        java.lang.String str10 = seconds9.toString();
        org.joda.time.PeriodType periodType11 = seconds9.getPeriodType();
        org.joda.time.PeriodType periodType12 = periodType11.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) periodType5, periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT60S" + "'", str10, "PT60S");
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (-1), periodType2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setPeriod((-32), (int) '4', (int) (byte) 0, (-1), 13, (int) '4', (-32), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant7, periodType8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant11, readableDuration12);
        mutablePeriod13.setHours((int) (short) 100);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration17, chronology18);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds22 = duration21.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType23 = seconds22.getFieldType();
        mutablePeriod13.add(durationFieldType23, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant26, readableDuration27);
        mutablePeriod28.setHours((int) (short) 100);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration32, chronology33);
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration32, chronology35);
        int int37 = duration4.compareTo((org.joda.time.ReadableDuration) duration32);
        org.joda.time.ReadableDuration readableDuration38 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int39 = duration32.compareTo(readableDuration38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.Weeks weeks3 = weeks1.multipliedBy((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = weeks3.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Hours hours1 = org.joda.time.Hours.EIGHT;
        org.joda.time.Hours hours2 = hours1.negated();
        org.joda.time.Duration duration3 = hours2.toStandardDuration();
        org.joda.time.Period period4 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType6 = period4.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = duration0.toPeriod(chronology1);
        org.joda.time.Hours hours3 = duration0.toStandardHours();
        org.joda.time.Duration duration4 = org.joda.time.Duration.ZERO;
        long long5 = duration4.getStandardDays();
        org.joda.time.Hours hours6 = duration4.toStandardHours();
        long long7 = duration4.getStandardMinutes();
        long long8 = duration4.getStandardDays();
        org.joda.time.Hours hours9 = duration4.toStandardHours();
        boolean boolean10 = duration0.isLongerThan((org.joda.time.ReadableDuration) duration4);
        java.lang.Class<?> wildcardClass11 = duration4.getClass();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(25);
        org.joda.time.DurationFieldType durationFieldType2 = hours1.getFieldType();
        org.joda.time.Weeks weeks3 = hours1.toStandardWeeks();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(weeks3);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.withHours(32);
        int int4 = period3.getMinutes();
        int int5 = period3.getMonths();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period10 = period1.plusHours((-1));
        org.joda.time.Period period12 = period1.withDays((int) 'a');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant18, readableDuration19);
        mutablePeriod20.setPeriod((long) ' ', (long) 52);
        mutablePeriod20.addDays(100);
        org.joda.time.PeriodType periodType26 = mutablePeriod20.getPeriodType();
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) 0, periodType26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant15, readableInstant16, periodType26);
        org.joda.time.Period period29 = new org.joda.time.Period(readableInstant13, readableInstant14, periodType26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = new org.joda.time.Period((java.lang.Object) 'a', periodType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType26);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType9 = minutes8.getPeriodType();
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes11 = minutes8.plus(minutes10);
        org.joda.time.Minutes minutes12 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.ZERO;
        boolean boolean14 = minutes12.isLessThan(minutes13);
        boolean boolean15 = minutes8.isLessThan(minutes12);
        org.joda.time.Minutes minutes17 = minutes12.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType19 = minutes18.getFieldType();
        org.joda.time.PeriodType periodType20 = minutes18.getPeriodType();
        org.joda.time.Minutes minutes21 = minutes17.plus(minutes18);
        org.joda.time.PeriodType periodType22 = minutes17.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period23 = new org.joda.time.Period(32, 2, (-32), (int) (byte) 100, 25, (int) (short) 100, (int) (byte) -1, (-32), periodType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = periodFormatter2.parsePeriod("PT-1H");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        java.lang.String str5 = seconds4.toString();
        org.joda.time.PeriodType periodType6 = seconds4.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (-1), (long) 100, periodType7, chronology8);
        org.joda.time.Chronology chronology10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) periodType7, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT60S" + "'", str5, "PT60S");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.Hours hours0 = org.joda.time.Hours.SEVEN;
        org.joda.time.Hours hours1 = org.joda.time.Hours.THREE;
        org.joda.time.DurationFieldType durationFieldType2 = hours1.getFieldType();
        boolean boolean3 = hours0.isGreaterThan(hours1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = hours0.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) (byte) 1, chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutablePeriod2.setPeriod(readableDuration8);
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod2.setPeriod((long) (short) 10, (long) (short) 10, chronology12);
        org.joda.time.Duration duration14 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = duration14.toPeriod(chronology15);
        org.joda.time.Hours hours17 = duration14.toStandardHours();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType20 = periodType19.withMinutesRemoved();
        org.joda.time.Period period21 = duration14.toPeriodFrom(readableInstant18, periodType19);
        mutablePeriod2.add((org.joda.time.ReadableDuration) duration14);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.setValue(13, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Days days4 = days2.minus(10);
        org.joda.time.Days days6 = days4.plus((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration7 = new org.joda.time.Duration((java.lang.Object) days6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Days");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str2 = duration1.toString();
        org.joda.time.Duration duration4 = duration1.minus((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType7 = minutes6.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.Period period9 = duration4.toPeriodFrom(readableInstant5, periodType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = period9.minusMillis((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT600S" + "'", str2, "PT600S");
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        java.lang.String str6 = minutes4.toString();
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.Minutes minutes9 = minutes4.minus(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds10 = minutes9.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 60");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-2147483648M" + "'", str6, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(minutes9);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) (byte) -1);
        org.joda.time.Period period3 = period1.plusYears((int) (byte) 100);
        int int4 = period1.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.Minutes minutes1 = days0.toStandardMinutes();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.Period period1 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((int) (short) 1);
        org.joda.time.Period period5 = period1.withSeconds((-1));
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = period1.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(52);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = weeks2.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PT60S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        java.lang.String str6 = minutes4.toString();
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.Minutes minutes9 = minutes4.minus(0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = minutes4.getValue(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-2147483648M" + "'", str6, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(minutes9);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType3 = periodType2.withDaysRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        java.lang.String str11 = seconds10.toString();
        org.joda.time.PeriodType periodType12 = seconds10.getPeriodType();
        org.joda.time.PeriodType periodType13 = periodType12.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = new org.joda.time.Period((-32), (int) (short) 10, 0, 4, (int) '#', 52, 0, (int) (short) 10, periodType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT60S" + "'", str11, "PT60S");
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("PT3H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 0, (long) (byte) 10, periodType2, chronology3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = period4.minusMinutes((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.MutablePeriod mutablePeriod8 = days2.toMutablePeriod();
        int int9 = mutablePeriod8.getMinutes();
        mutablePeriod8.addMonths((-32));
        mutablePeriod8.setWeeks(25);
        java.lang.Object obj14 = mutablePeriod8.clone();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "P-32M25W");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "P-32M25W");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "P-32M25W");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.withHours(32);
        org.joda.time.Period period4 = period1.normalizedStandard();
        java.lang.String str5 = period4.toString();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period7 = period4.normalizedStandard(periodType6);
        java.lang.Class<?> wildcardClass8 = period7.getClass();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0.052S" + "'", str5, "PT0.052S");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.PeriodType periodType5 = periodFormatter2.getParseType();
        org.joda.time.Period period7 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days8 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period7);
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant10, readableDuration11);
        mutablePeriod12.setHours((int) (short) 100);
        boolean boolean15 = periodType9.equals((java.lang.Object) mutablePeriod12);
        org.joda.time.Duration duration16 = org.joda.time.Duration.ZERO;
        long long17 = duration16.getStandardDays();
        mutablePeriod12.add((org.joda.time.ReadableDuration) duration16);
        mutablePeriod12.setWeeks(8);
        mutablePeriod12.addDays((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int25 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod12, "PT0.001S", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(periodType5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        java.lang.Class<?> wildcardClass2 = periodType1.getClass();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("PT14400S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) weeks1, chronology6);
        java.lang.String str8 = period7.toString();
        org.joda.time.format.PeriodPrinter periodPrinter9 = null;
        org.joda.time.format.PeriodParser periodParser10 = null;
        org.joda.time.format.PeriodFormatter periodFormatter11 = new org.joda.time.format.PeriodFormatter(periodPrinter9, periodParser10);
        org.joda.time.PeriodType periodType12 = periodFormatter11.getParseType();
        org.joda.time.format.PeriodParser periodParser13 = periodFormatter11.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = period7.toString(periodFormatter11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0W" + "'", str8, "P0W");
        org.junit.Assert.assertNull(periodType12);
        org.junit.Assert.assertNull(periodParser13);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType3 = seconds2.getFieldType();
        org.joda.time.Seconds seconds5 = seconds2.plus(25);
        org.joda.time.Seconds seconds6 = seconds2.negated();
        org.joda.time.PeriodType periodType7 = seconds6.getPeriodType();
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.THREE;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = seconds6.compareTo((org.joda.time.base.BaseSingleFieldPeriod) weeks8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Seconds cannot be compared to class org.joda.time.Weeks");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(weeks8);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration1 = seconds0.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType2 = seconds0.getFieldType();
        org.joda.time.PeriodType periodType3 = seconds0.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = seconds0.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType1 = periodType0.withMonthsRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = periodType2.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"seconds\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        java.lang.String str3 = seconds2.toString();
        org.joda.time.PeriodType periodType4 = seconds2.getPeriodType();
        org.joda.time.PeriodType periodType5 = periodType4.withSecondsRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withDaysRemoved();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = mutablePeriod8.copy();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod8.setPeriod((int) (byte) 10, 3, (int) '#', (-32), (int) (byte) 100, 25, 32, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT60S" + "'", str3, "PT60S");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(mutablePeriod9);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        org.joda.time.Period period8 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = period11.withSeconds((int) ' ');
        org.joda.time.Period period15 = period8.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType17 = periodType16.withMonthsRemoved();
        org.joda.time.Period period18 = period15.withPeriodType(periodType16);
        int int19 = period18.getHours();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = periodFormatter6.print((org.joda.time.ReadablePeriod) period18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant4, readableDuration5);
        mutablePeriod6.setHours((int) (short) 100);
        boolean boolean9 = periodType3.equals((java.lang.Object) mutablePeriod6);
        org.joda.time.Duration duration10 = org.joda.time.Duration.ZERO;
        long long11 = duration10.getStandardDays();
        mutablePeriod6.add((org.joda.time.ReadableDuration) duration10);
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType17 = periodType16.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, readableInstant15, periodType16);
        java.lang.String str19 = periodType16.toString();
        org.joda.time.Chronology chronology20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod6, periodType16, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PeriodType[YearWeekDay]" + "'", str19, "PeriodType[YearWeekDay]");
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.PeriodType periodType1 = seconds0.getPeriodType();
        org.joda.time.Minutes minutes2 = seconds0.toStandardMinutes();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.withHours(32);
        org.joda.time.Period period4 = period1.normalizedStandard();
        org.joda.time.Period period6 = period1.plusHours((int) (short) 1);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        java.lang.String str10 = seconds9.toString();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        boolean boolean12 = seconds9.isSupported(durationFieldType11);
        org.joda.time.Seconds seconds13 = null;
        org.joda.time.Seconds seconds14 = seconds9.minus(seconds13);
        org.joda.time.Period period15 = period1.withFields((org.joda.time.ReadablePeriod) seconds13);
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.Seconds seconds17 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration18 = seconds17.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType19 = seconds17.getFieldType();
        org.joda.time.PeriodType periodType20 = seconds17.getPeriodType();
        org.joda.time.PeriodType periodType21 = periodType20.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = period15.withPeriodType(periodType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT60S" + "'", str10, "PT60S");
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.Period period4 = new org.joda.time.Period(2, (int) (byte) -1, (-32), (int) (short) 100);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus(25);
        org.joda.time.Seconds seconds10 = seconds6.negated();
        org.joda.time.PeriodType periodType11 = seconds10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withParseType(periodType11);
        boolean boolean13 = periodFormatter2.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod15 = periodFormatter2.parseMutablePeriod("hours");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.Period period1 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((int) (short) 1);
        org.joda.time.Period period5 = period1.withSeconds((-1));
        org.joda.time.Period period7 = period1.minusDays(52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = period1.getFieldType(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        java.util.Locale locale3 = periodFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod5 = periodFormatter2.parseMutablePeriod("PT0.052S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isParser();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = periodType10.withDaysRemoved();
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant7, readableInstant8, periodType11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = periodFormatter2.print((org.joda.time.ReadablePeriod) period12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        int int8 = days2.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType10 = days2.getFieldType(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant4, readableDuration5);
        mutablePeriod6.setHours((int) (short) 100);
        boolean boolean9 = periodType3.equals((java.lang.Object) mutablePeriod6);
        org.joda.time.Duration duration10 = org.joda.time.Duration.ZERO;
        long long11 = duration10.getStandardDays();
        mutablePeriod6.add((org.joda.time.ReadableDuration) duration10);
        mutablePeriod6.setWeeks(8);
        mutablePeriod6.addDays((int) '#');
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.months();
        int int18 = mutablePeriod6.indexOf(durationFieldType17);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType1 = periodType0.withDaysRemoved();
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) periodType1, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType6 = minutes5.getFieldType();
        org.joda.time.PeriodType periodType7 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withParseType(periodType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = periodFormatter8.parseMutablePeriod("PT3H");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ONE;
        org.joda.time.Weeks weeks1 = seconds0.toStandardWeeks();
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.Minutes minutes2 = weeks1.toStandardMinutes();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant4, readableDuration5);
        mutablePeriod6.setHours((int) (short) 100);
        boolean boolean9 = periodType3.equals((java.lang.Object) mutablePeriod6);
        org.joda.time.Duration duration10 = org.joda.time.Duration.ZERO;
        long long11 = duration10.getStandardDays();
        mutablePeriod6.add((org.joda.time.ReadableDuration) duration10);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType15);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.weekyears();
        int int18 = period16.get(durationFieldType17);
        int int19 = mutablePeriod6.get(durationFieldType17);
        mutablePeriod6.setMinutes((int) (short) 100);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        org.joda.time.Seconds seconds2 = minutes0.toStandardSeconds();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter3.withLocale(locale5);
        boolean boolean7 = periodFormatter3.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod8 = org.joda.time.MutablePeriod.parse("P0W", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksBetween(readableInstant0, readableInstant1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.Period period4 = new org.joda.time.Period((int) '#', 0, 13, 4);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = period3.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period8 = period6.normalizedStandard(periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType7);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.addDays(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((java.lang.Object) days0, periodType1, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.hours();
        int int5 = mutablePeriod3.get(durationFieldType4);
        org.joda.time.Hours hours6 = org.joda.time.Hours.TWO;
        org.joda.time.Duration duration7 = hours6.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) hours6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(duration7);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        boolean boolean6 = periodFormatter2.isParser();
        java.io.Writer writer7 = null;
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.ZERO;
        boolean boolean10 = minutes8.isLessThan(minutes9);
        org.joda.time.Minutes minutes12 = minutes8.plus(52);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer7, (org.joda.time.ReadablePeriod) minutes12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(minutes12);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.DurationFieldType[] durationFieldTypeArray0 = new org.joda.time.DurationFieldType[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.forFields(durationFieldTypeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Types array must not be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldTypeArray0);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Interval interval8 = duration4.toIntervalTo(readableInstant7);
        org.joda.time.Seconds seconds9 = duration4.toStandardSeconds();
        org.joda.time.Period period10 = duration4.toPeriod();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        boolean boolean7 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant8, periodType9);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period14 = duration5.toPeriod(periodType13);
        org.joda.time.Period period16 = period14.withWeeks((int) ' ');
        org.joda.time.Period period17 = period14.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = period14.withMonths((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(25);
        org.joda.time.Minutes minutes2 = hours1.toStandardMinutes();
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period3 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType2);
        java.lang.String str4 = period3.toString();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0D" + "'", str4, "P0D");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        java.lang.String str5 = period1.toString();
        org.joda.time.Period period7 = period1.withYears(0);
        org.joda.time.Period period9 = period1.withYears((int) (byte) -1);
        org.joda.time.Period period11 = period9.withMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds12 = period11.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.Days days1 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((java.lang.Object) days1, periodType2, chronology3);
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 52, periodType2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod5.addMillis((-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        long long1 = duration0.getStandardDays();
        org.joda.time.Hours hours2 = duration0.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType3 = hours2.getFieldType();
        org.joda.time.Hours hours4 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours6 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean7 = hours4.isGreaterThan(hours6);
        org.joda.time.Hours hours9 = hours4.minus((int) (byte) 0);
        org.joda.time.Hours hours10 = hours2.minus(hours4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = hours2.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours10);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        boolean boolean7 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Interval interval9 = duration5.toIntervalTo(readableInstant8);
        org.joda.time.Seconds seconds10 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval9);
        org.joda.time.Seconds seconds11 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval) interval9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = weeks0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Weeks cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = periodFormatter2.getParseType();
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant8, readableDuration9);
        mutablePeriod10.setHours((int) (short) 100);
        boolean boolean13 = periodType7.equals((java.lang.Object) mutablePeriod10);
        org.joda.time.Duration duration14 = org.joda.time.Duration.ZERO;
        long long15 = duration14.getStandardDays();
        mutablePeriod10.add((org.joda.time.ReadableDuration) duration14);
        mutablePeriod10.clear();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod20.addYears((int) '4');
        int int23 = mutablePeriod20.getYears();
        mutablePeriod10.add((org.joda.time.ReadablePeriod) mutablePeriod20);
        mutablePeriod20.add((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod20, "P0W", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.THREE;
        org.joda.time.Minutes minutes4 = minutes2.multipliedBy((int) ' ');
        org.joda.time.Minutes minutes5 = minutes0.minus(minutes2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes7 = minutes0.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes5);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean3 = hours0.isGreaterThan(hours2);
        org.joda.time.Hours hours5 = hours0.minus((int) (byte) 0);
        java.lang.String str6 = hours0.toString();
        java.lang.String str7 = hours0.toString();
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT3H" + "'", str6, "PT3H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT3H" + "'", str7, "PT3H");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MAX_VALUE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes1 = weeks0.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2147483647 * 10080");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = hours0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) minutes0);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(weeks4);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType4 = periodType3.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (-1), periodType4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(10L, (long) 8, periodType4, chronology6);
        org.joda.time.PeriodType periodType8 = mutablePeriod7.getPeriodType();
        mutablePeriod7.addMonths(0);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Period period10 = period7.withMillis(100);
        org.joda.time.Period period12 = period10.plusMonths(100);
        int int13 = period12.getHours();
        int int14 = period12.getSeconds();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period(0, (int) (byte) 100, 100, (int) ' ', 25, 32, (int) ' ', (-1), periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.format.PeriodPrinter periodPrinter6 = periodFormatter5.getPrinter();
        org.joda.time.Period period8 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period14 = period11.withSeconds((int) ' ');
        org.joda.time.Period period15 = period8.minus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period17 = period8.plusHours((-1));
        org.joda.time.Period period19 = period8.withDays((int) 'a');
        org.joda.time.Period period21 = period19.withSeconds(52);
        int int22 = period19.getMillis();
        org.joda.time.Period period24 = period19.minusYears(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = periodFormatter5.print((org.joda.time.ReadablePeriod) period24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodPrinter6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT0S");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = mutablePeriod1.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.Period period11 = period8.withPeriodType(periodType9);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period8);
        int int13 = period8.getSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        int int8 = days2.size();
        org.joda.time.Days days9 = days2.negated();
        int int10 = days9.getDays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days12 = days9.minus((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.lang.Object obj0 = null;
        org.joda.time.Duration duration1 = new org.joda.time.Duration(obj0);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds7 = duration6.toStandardSeconds();
        boolean boolean8 = duration3.isLongerThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Period period9 = duration3.toPeriod();
        int int10 = duration1.compareTo((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Period period16 = duration12.toPeriod(periodType13, chronology15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType19 = periodType18.withMonthsRemoved();
        org.joda.time.Period period20 = duration12.toPeriodTo(readableInstant17, periodType19);
        int int21 = duration3.compareTo((org.joda.time.ReadableDuration) duration12);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType23 = periodType22.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) int21, periodType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        int int8 = days2.size();
        org.joda.time.Days days9 = days2.negated();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) days9, chronology10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod12.addWeeks(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(mutablePeriod12);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        org.joda.time.Period period5 = period3.withHours(0);
        org.joda.time.Period period7 = org.joda.time.Period.hours(0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant8, readableDuration9);
        org.joda.time.Period period11 = mutablePeriod10.toPeriod();
        org.joda.time.Period period13 = period11.withHours(0);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.days();
        int int15 = period11.indexOf(durationFieldType14);
        int int16 = period7.indexOf(durationFieldType14);
        int int17 = period3.get(durationFieldType14);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Period period21 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days22 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period24 = period21.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period26 = period24.normalizedStandard(periodType25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant18, readableInstant19, periodType25);
        org.joda.time.DurationFieldType[] durationFieldTypeArray28 = mutablePeriod27.getFieldTypes();
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.forFields(durationFieldTypeArray28);
        org.joda.time.Period period30 = period3.withPeriodType(periodType29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period32 = period30.plusSeconds(7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(durationFieldTypeArray28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period30);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("weeks");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"weeks\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Days days11 = days5.minus(days10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Days days16 = days14.minus(10);
        org.joda.time.Days days17 = days5.plus(days14);
        org.joda.time.Days days19 = days17.dividedBy(100);
        org.joda.time.Days days20 = null;
        org.joda.time.Days days21 = days19.plus(days20);
        org.joda.time.Period period23 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days24 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period26 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days27 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period26);
        org.joda.time.PeriodType periodType28 = days27.getPeriodType();
        boolean boolean29 = days24.isGreaterThan(days27);
        org.joda.time.Period period31 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days32 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Days days33 = days27.minus(days32);
        org.joda.time.Period period35 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days36 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Days days38 = days36.minus(10);
        org.joda.time.Days days39 = days27.plus(days36);
        org.joda.time.Days days41 = days39.dividedBy(100);
        org.joda.time.Days days42 = null;
        org.joda.time.Days days43 = days41.plus(days42);
        org.joda.time.Days days44 = days41.negated();
        boolean boolean45 = days21.isGreaterThan(days44);
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType49 = periodType48.withWeeksRemoved();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = duration47.toPeriod(periodType48, chronology50);
        org.joda.time.Days days52 = org.joda.time.Days.ZERO;
        int int53 = days52.getDays();
        org.joda.time.Period period55 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days56 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period55);
        org.joda.time.Period period58 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days59 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period58);
        org.joda.time.PeriodType periodType60 = days59.getPeriodType();
        boolean boolean61 = days56.isGreaterThan(days59);
        org.joda.time.Period period63 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days64 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period63);
        org.joda.time.Days days65 = days59.minus(days64);
        org.joda.time.Days days66 = days52.minus(days59);
        boolean boolean67 = duration47.equals((java.lang.Object) days59);
        boolean boolean68 = days44.isGreaterThan(days59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType70 = days44.getFieldType(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(days52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(days59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(days64);
        org.junit.Assert.assertNotNull(days65);
        org.junit.Assert.assertNotNull(days66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period10 = period1.plusHours((-1));
        org.joda.time.Period period12 = period1.withDays((int) 'a');
        org.joda.time.Period period14 = period12.withSeconds(52);
        int int15 = period12.getMillis();
        org.joda.time.Period period17 = period12.minusYears(0);
        int int18 = period12.getYears();
        java.lang.Class<?> wildcardClass19 = period12.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.Weeks weeks7 = weeks5.minus((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType9 = weeks7.getFieldType(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        java.lang.String str5 = seconds4.toString();
        org.joda.time.PeriodType periodType6 = seconds4.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) '4', (-60L), periodType6);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod8.setMonths((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT60S" + "'", str5, "PT60S");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.Days days1 = org.joda.time.Days.days(32);
        org.joda.time.Hours hours2 = days1.toStandardHours();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        java.lang.Class<?> wildcardClass4 = days2.getClass();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        mutablePeriod2.setHours((int) (short) 100);
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration6, chronology7);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType12 = seconds11.getFieldType();
        mutablePeriod2.add(durationFieldType12, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableInstant15, readableDuration16);
        mutablePeriod17.setHours((int) (short) 100);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology22 = null;
        mutablePeriod17.setPeriod((org.joda.time.ReadableDuration) duration21, chronology22);
        org.joda.time.Chronology chronology24 = null;
        mutablePeriod2.setPeriod((org.joda.time.ReadableDuration) duration21, chronology24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        boolean boolean27 = duration21.isEqual(readableDuration26);
        long long28 = duration21.getMillis();
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 60000L + "'", long28 == 60000L);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Duration duration5 = new org.joda.time.Duration(readableInstant3, readableInstant4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        boolean boolean13 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType16 = periodType15.withMinutesRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant14, periodType15);
        org.joda.time.Period period18 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration11);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period20 = duration11.toPeriod(periodType19);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(readableInstant2, (org.joda.time.ReadableDuration) duration5, periodType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = periodFormatter2.getParseType();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant5, readableDuration6);
        org.joda.time.Period period8 = mutablePeriod7.toPeriod();
        int int9 = period8.size();
        org.joda.time.Period period11 = period8.plusDays(1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer4, (org.joda.time.ReadablePeriod) days12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodType3);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.PeriodType periodType6 = periodFormatter5.getParseType();
        org.joda.time.Period period10 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period13 = period10.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period15 = period13.normalizedStandard(periodType14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(1L, 1L, periodType14, chronology16);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = periodFormatter5.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod17, "hours", (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodType6);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period10 = period1.plusHours((-1));
        org.joda.time.Period period12 = period10.withHours(3);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant6, readableDuration7);
        mutablePeriod8.setHours((int) (short) 100);
        boolean boolean11 = periodType5.equals((java.lang.Object) mutablePeriod8);
        org.joda.time.Period period12 = new org.joda.time.Period((long) 0, 0L, periodType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = period12.plusWeeks((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (-1));
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant8, readableDuration9);
        mutablePeriod10.setHours((int) (short) 100);
        boolean boolean13 = periodType7.equals((java.lang.Object) mutablePeriod10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((java.lang.Object) duration3, periodType7, chronology14);
        boolean boolean16 = duration1.isEqual((org.joda.time.ReadableDuration) duration3);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType21 = periodType20.withWeeksRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withDaysRemoved();
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant17, periodType22);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod24.addMinutes(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT-2147483648M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.Duration duration9 = new org.joda.time.Duration((long) (-1));
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Period period14 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days15 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period17 = period14.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period19 = period17.normalizedStandard(periodType18);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant11, readableInstant12, periodType18);
        org.joda.time.PeriodType periodType21 = periodType18.withYearsRemoved();
        org.joda.time.Period period22 = duration9.toPeriodTo(readableInstant10, periodType21);
        org.joda.time.PeriodType periodType23 = periodType21.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period((int) '4', (int) (byte) 1, 8, (int) (short) 0, 1, 32, 10, (int) (short) 1, periodType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant2, periodType3);
        int int6 = mutablePeriod5.getWeeks();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod5.setPeriod(8, 60, (-1), (int) (byte) 0, (int) (short) 1, (int) '#', (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        mutablePeriod2.setPeriod((long) ' ', (long) 52);
        mutablePeriod2.addDays(100);
        org.joda.time.PeriodType periodType8 = mutablePeriod2.getPeriodType();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds14 = duration13.toStandardSeconds();
        boolean boolean15 = duration10.isLongerThan((org.joda.time.ReadableDuration) duration13);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType18 = periodType17.withMinutesRemoved();
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration13, readableInstant16, periodType17);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Interval interval21 = duration13.toIntervalFrom(readableInstant20);
        mutablePeriod2.add((org.joda.time.ReadableInterval) interval21);
        org.joda.time.Chronology chronology24 = null;
        mutablePeriod2.setPeriod((long) (byte) 10, chronology24);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(interval21);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.Minutes minutes8 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType9 = minutes8.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = new org.joda.time.Period((int) (byte) 1, (-2147483648), 25, (int) (byte) 0, 7, (int) (byte) 10, (int) (byte) -1, 2, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
        org.joda.time.Minutes minutes2 = minutes0.multipliedBy((int) (short) 0);
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        org.joda.time.Days days2 = minutes0.toStandardDays();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str2 = duration1.toString();
        org.joda.time.Duration duration4 = duration1.minus((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant5, readableDuration6);
        mutablePeriod7.setHours((int) (short) 100);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod7.setPeriod((org.joda.time.ReadableDuration) duration11, chronology12);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds16 = duration15.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType17 = seconds16.getFieldType();
        mutablePeriod7.add(durationFieldType17, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableInstant20, readableDuration21);
        mutablePeriod22.setHours((int) (short) 100);
        org.joda.time.Duration duration26 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology27 = null;
        mutablePeriod22.setPeriod((org.joda.time.ReadableDuration) duration26, chronology27);
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod7.setPeriod((org.joda.time.ReadableDuration) duration26, chronology29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        boolean boolean32 = duration26.isEqual(readableDuration31);
        org.joda.time.Duration duration33 = duration1.minus((org.joda.time.ReadableDuration) duration26);
        long long34 = duration33.getMillis();
        org.joda.time.Duration duration37 = duration33.withDurationAdded((long) (byte) -1, 60);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT600S" + "'", str2, "PT600S");
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 540000L + "'", long34 == 540000L);
        org.junit.Assert.assertNotNull(duration37);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter6.withLocale(locale7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.Hours hours11 = org.joda.time.Hours.hours(25);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter6.printTo(stringBuffer9, (org.joda.time.ReadablePeriod) hours11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(hours11);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str1 = durationFieldType0.getName();
        java.lang.String str2 = durationFieldType0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) durationFieldType0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "weekyears" + "'", str1, "weekyears");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "weekyears" + "'", str2, "weekyears");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant2, periodType3);
        int int6 = mutablePeriod5.getWeeks();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) mutablePeriod5, chronology7);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Days days11 = days9.plus((int) (short) 0);
        java.lang.String str12 = days11.toString();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P0D" + "'", str12, "P0D");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period6 = period4.normalizedStandard(periodType5);
        org.joda.time.Period period7 = period4.toPeriod();
        org.joda.time.Period period8 = period4.toPeriod();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((java.lang.Object) periodType0, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.TWO;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) weeks0);
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(seconds1);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("P1W");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean3 = hours0.isGreaterThan(hours2);
        org.joda.time.Duration duration4 = hours2.toStandardDuration();
        org.joda.time.Period period5 = duration4.toPeriod();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) '4', chronology7);
        org.joda.time.Duration duration9 = org.joda.time.Duration.ZERO;
        long long10 = duration9.getStandardDays();
        org.joda.time.Hours hours11 = duration9.toStandardHours();
        long long12 = duration9.getStandardMinutes();
        long long13 = duration9.getStandardDays();
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Duration duration15 = duration4.plus((org.joda.time.ReadableDuration) duration9);
        boolean boolean17 = duration4.equals((java.lang.Object) "PT3H");
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.Period period1 = org.joda.time.Period.hours(10);
        org.joda.time.Period period3 = period1.withWeeks((int) (byte) 10);
        int int4 = period3.getYears();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant2, periodType3);
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod5.copy();
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        boolean boolean13 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType16 = periodType15.withMinutesRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration11, readableInstant14, periodType15);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Interval interval19 = duration11.toIntervalFrom(readableInstant18);
        mutablePeriod6.add((org.joda.time.ReadableInterval) interval19);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod6.setValue((int) '4', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(interval19);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = duration1.compareTo(readableDuration5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 2, 600L);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, (long) 2, chronology2);
        mutablePeriod3.add((long) (byte) -1);
        mutablePeriod3.addWeeks((int) (byte) -1);
        mutablePeriod3.addMillis((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str11 = durationFieldType10.getName();
        java.lang.String str12 = durationFieldType10.getName();
        java.lang.String str13 = durationFieldType10.toString();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.add(durationFieldType10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weekyears'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weekyears" + "'", str11, "weekyears");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "weekyears" + "'", str12, "weekyears");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "weekyears" + "'", str13, "weekyears");
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus(25);
        org.joda.time.Seconds seconds10 = seconds6.negated();
        org.joda.time.PeriodType periodType11 = seconds10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withParseType(periodType11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod14 = periodFormatter2.parseMutablePeriod("PeriodType[Minutes]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType9 = periodType8.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (short) 100, 8, 32, (int) '4', 0, 1, (int) ' ', (int) '4', periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.Period period1 = new org.joda.time.Period(600L);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus(25);
        org.joda.time.Seconds seconds10 = seconds6.negated();
        org.joda.time.PeriodType periodType11 = seconds10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withParseType(periodType11);
        org.joda.time.PeriodType periodType13 = periodFormatter12.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod15 = periodFormatter12.parseMutablePeriod("PT60S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNotNull(periodType13);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        java.lang.String str5 = seconds4.toString();
        org.joda.time.PeriodType periodType6 = seconds4.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.PeriodType periodType8 = periodType7.withDaysRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(periodType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT60S" + "'", str5, "PT60S");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType6 = minutes5.getPeriodType();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes8 = minutes5.plus(minutes7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.ZERO;
        boolean boolean11 = minutes9.isLessThan(minutes10);
        boolean boolean12 = minutes5.isLessThan(minutes9);
        org.joda.time.PeriodType periodType13 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter2.withParseType(periodType13);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str19 = duration18.toString();
        org.joda.time.Duration duration21 = duration18.minus((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Minutes minutes23 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType24 = minutes23.getPeriodType();
        org.joda.time.PeriodType periodType25 = periodType24.withSecondsRemoved();
        org.joda.time.Period period26 = duration21.toPeriodFrom(readableInstant22, periodType24);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 0, (long) 3, periodType24);
        org.joda.time.PeriodType periodType28 = periodType24.withMonthsRemoved();
        org.joda.time.Chronology chronology29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = new org.joda.time.Period((java.lang.Object) periodFormatter14, periodType28, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.format.PeriodFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT600S" + "'", str19, "PT600S");
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(periodType28);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        boolean boolean13 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.Period period14 = duration8.toPeriod();
        boolean boolean15 = duration4.isLongerThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = duration4.toPeriodTo(readableInstant16);
        long long18 = duration4.getStandardDays();
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period21 = duration20.toPeriod();
        long long22 = duration20.getStandardSeconds();
        boolean boolean23 = duration4.isEqual((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration25 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds26 = duration25.toStandardSeconds();
        java.lang.String str27 = seconds26.toString();
        org.joda.time.PeriodType periodType28 = seconds26.getPeriodType();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((java.lang.Object) duration4, periodType28, chronology29);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.weekyears();
        java.lang.String str32 = durationFieldType31.getName();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod30.set(durationFieldType31, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weekyears'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-60L) + "'", long22 == (-60L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(seconds26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PT60S" + "'", str27, "PT60S");
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "weekyears" + "'", str32, "weekyears");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("hours");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hours\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.Period period1 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((int) (short) 1);
        org.joda.time.Period period5 = period1.withSeconds((-1));
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        java.lang.String str7 = period1.toString();
        int int8 = period1.getWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0S" + "'", str7, "PT0S");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT1H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("PeriodType[Seconds]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Seconds]\" is malformed at \"eriodType[Seconds]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType6 = minutes5.getFieldType();
        org.joda.time.PeriodType periodType7 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withParseType(periodType7);
        java.lang.StringBuffer stringBuffer9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant10, readableDuration11);
        org.joda.time.Period period13 = mutablePeriod12.toPeriod();
        int int14 = period13.size();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter8.printTo(stringBuffer9, (org.joda.time.ReadablePeriod) period13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((java.lang.Object) '4', chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.Weeks weeks3 = weeks1.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks5 = weeks1.dividedBy((int) 'a');
        java.lang.String str6 = weeks5.toString();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0W" + "'", str6, "P0W");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period3 = duration2.toPeriod();
        long long4 = duration2.getStandardSeconds();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds7 = duration6.toStandardSeconds();
        java.lang.String str8 = seconds7.toString();
        org.joda.time.PeriodType periodType9 = seconds7.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration2, periodType9);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod10.setDays(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-60L) + "'", long4 == (-60L));
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT60S" + "'", str8, "PT60S");
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.Period period4 = new org.joda.time.Period(8, 2, (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass5 = period4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        java.lang.String str6 = seconds5.toString();
        org.joda.time.PeriodType periodType7 = seconds5.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withSecondsRemoved();
        org.joda.time.PeriodType periodType9 = periodType8.withDaysRemoved();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        org.joda.time.PeriodType periodType11 = periodType9.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 2, periodType9);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType15 = periodType9.getFieldType(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT60S" + "'", str6, "PT60S");
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes3 = minutes0.plus(minutes2);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        boolean boolean6 = minutes4.isLessThan(minutes5);
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.PeriodType periodType8 = minutes0.getPeriodType();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType11 = periodType9.getFieldType((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Minutes minutes2 = weeks1.toStandardMinutes();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean3 = hours0.isGreaterThan(hours2);
        org.joda.time.Hours hours5 = hours0.minus((int) (byte) 0);
        org.joda.time.Hours hours7 = hours5.plus(0);
        org.joda.time.DurationFieldType durationFieldType8 = hours7.getFieldType();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType12 = periodType11.withWeeksRemoved();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Period period14 = duration10.toPeriod(periodType11, chronology13);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeksIn(readableInterval15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.weeksIn(readableInterval17);
        boolean boolean19 = weeks16.isLessThan(weeks18);
        org.joda.time.Weeks weeks21 = weeks18.minus((int) (short) -1);
        org.joda.time.Weeks weeks23 = weeks21.multipliedBy(0);
        org.joda.time.Weeks weeks24 = null;
        boolean boolean25 = weeks21.isLessThan(weeks24);
        int int27 = weeks21.getValue((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology29 = null;
        boolean boolean30 = durationFieldType28.isSupported(chronology29);
        boolean boolean31 = weeks21.isSupported(durationFieldType28);
        org.joda.time.DurationFieldType durationFieldType32 = weeks21.getFieldType();
        boolean boolean33 = periodType11.isSupported(durationFieldType32);
        org.joda.time.Chronology chronology34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((java.lang.Object) hours7, periodType11, chronology34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType10);
        int int12 = period11.getMillis();
        org.joda.time.Period period14 = period11.plusDays((int) 'a');
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds17 = duration16.toStandardSeconds();
        java.lang.String str18 = seconds17.toString();
        org.joda.time.PeriodType periodType19 = seconds17.getPeriodType();
        org.joda.time.PeriodType periodType20 = periodType19.withSecondsRemoved();
        org.joda.time.PeriodType periodType21 = periodType20.withDaysRemoved();
        org.joda.time.Period period22 = period14.normalizedStandard(periodType21);
        org.joda.time.PeriodType periodType23 = period22.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(4, (-2147483648), 100, (int) 'a', (int) '#', 4, 3, (int) '4', periodType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT60S" + "'", str18, "PT60S");
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period10 = period1.plusHours((-1));
        org.joda.time.Period period12 = period1.minusMonths(1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = period1.getValue(13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = periodFormatter2.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = periodFormatter2.parsePeriod("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodType3);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        java.lang.String str5 = seconds4.toString();
        org.joda.time.PeriodType periodType6 = seconds4.getPeriodType();
        org.joda.time.PeriodType periodType7 = periodType6.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) '4', (-60L), periodType6);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod8.setValue(3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT60S" + "'", str5, "PT60S");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        java.lang.String str6 = minutes4.toString();
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.Minutes minutes9 = minutes4.minus(0);
        org.joda.time.Minutes minutes11 = minutes9.dividedBy(2);
        org.joda.time.Period period12 = minutes11.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds13 = minutes11.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1073741824 * 60");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-2147483648M" + "'", str6, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        java.lang.String str6 = minutes4.toString();
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.Minutes minutes9 = minutes4.minus(0);
        int int10 = minutes9.getMinutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes12 = minutes9.minus(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -2147483648 + -32");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-2147483648M" + "'", str6, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2147483648) + "'", int10 == (-2147483648));
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.Period period4 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds8 = duration7.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType9 = seconds8.getFieldType();
        org.joda.time.Seconds seconds11 = seconds8.plus(25);
        org.joda.time.Seconds seconds12 = seconds8.negated();
        org.joda.time.Seconds seconds13 = org.joda.time.Seconds.MIN_VALUE;
        org.joda.time.Seconds seconds14 = seconds8.plus(seconds13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds15 = seconds5.minus(seconds13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Integer.MIN_VALUE cannot be negated");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(seconds14);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        org.joda.time.Hours hours5 = org.joda.time.Hours.hours(25);
        org.joda.time.DurationFieldType durationFieldType6 = hours5.getFieldType();
        boolean boolean7 = mutablePeriod2.isSupported(durationFieldType6);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType6 = minutes5.getFieldType();
        org.joda.time.PeriodType periodType7 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withParseType(periodType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = periodFormatter8.parseMutablePeriod("PeriodType[Days]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes2 = minutes0.plus((int) (short) -1);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) (short) -1, (int) '#', (int) ' ', 100);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.days();
        int int9 = mutablePeriod7.get(durationFieldType8);
        org.joda.time.Hours hours10 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.Hours hours12 = hours10.dividedBy((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = minutes2.compareTo((org.joda.time.base.BaseSingleFieldPeriod) hours12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Minutes cannot be compared to class org.joda.time.Hours");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(hours12);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter6.withLocale(locale7);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(periodType9);
        org.joda.time.format.PeriodFormatter periodFormatter11 = periodFormatter6.withParseType(periodType9);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeksIn(readableInterval12);
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.Weeks weeks15 = org.joda.time.Weeks.weeksIn(readableInterval14);
        boolean boolean16 = weeks13.isLessThan(weeks15);
        org.joda.time.Weeks weeks17 = weeks13.negated();
        org.joda.time.MutablePeriod mutablePeriod18 = weeks17.toMutablePeriod();
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod18.setPeriod((long) 13, 0L, chronology21);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = periodFormatter11.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod18, "PeriodType[Days]", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodFormatter11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(mutablePeriod18);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, (long) 2, chronology2);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.PeriodType periodType6 = periodType5.withDaysRemoved();
        org.joda.time.Seconds seconds7 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration8 = seconds7.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType9 = seconds7.getFieldType();
        org.joda.time.Chronology chronology10 = null;
        boolean boolean11 = durationFieldType9.isSupported(chronology10);
        int int12 = periodType6.indexOf(durationFieldType9);
        mutablePeriod3.set(durationFieldType9, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration15 = new org.joda.time.Duration((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter3.withLocale(locale5);
        org.joda.time.PeriodType periodType7 = periodFormatter6.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod8 = org.joda.time.MutablePeriod.parse("PT0S", periodFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNull(periodType7);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("P-1DT1M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.THREE;
        org.joda.time.Weeks weeks1 = minutes0.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration2 = new org.joda.time.Duration((java.lang.Object) weeks1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.Weeks");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration8 = duration1.minus((long) 3);
        org.joda.time.Duration duration9 = duration1.toDuration();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Interval interval11 = duration9.toIntervalFrom(readableInstant10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = duration9.compareTo(readableDuration12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(interval11);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType8 = periodType7.withMonthsRemoved();
        org.joda.time.Period period9 = duration1.toPeriodTo(readableInstant6, periodType8);
        org.joda.time.Minutes minutes10 = duration1.toStandardMinutes();
        org.joda.time.Minutes minutes12 = minutes10.multipliedBy((int) (short) -1);
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType14 = minutes13.getPeriodType();
        org.joda.time.Minutes minutes15 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes16 = minutes13.plus(minutes15);
        org.joda.time.Minutes minutes17 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes18 = org.joda.time.Minutes.ZERO;
        boolean boolean19 = minutes17.isLessThan(minutes18);
        boolean boolean20 = minutes13.isLessThan(minutes17);
        org.joda.time.Minutes minutes22 = minutes17.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes23 = minutes22.negated();
        org.joda.time.Minutes minutes24 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType25 = minutes24.getPeriodType();
        org.joda.time.Minutes minutes26 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes27 = minutes24.plus(minutes26);
        org.joda.time.Minutes minutes28 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes29 = org.joda.time.Minutes.ZERO;
        boolean boolean30 = minutes28.isLessThan(minutes29);
        boolean boolean31 = minutes24.isLessThan(minutes28);
        org.joda.time.Duration duration32 = minutes24.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        java.lang.Object obj35 = null;
        org.joda.time.Duration duration36 = new org.joda.time.Duration(obj35);
        org.joda.time.Period period37 = new org.joda.time.Period(readableInstant34, (org.joda.time.ReadableDuration) duration36);
        org.joda.time.Period period38 = new org.joda.time.Period(readableInstant33, (org.joda.time.ReadableDuration) duration36);
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType42 = periodType41.withWeeksRemoved();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Period period44 = duration40.toPeriod(periodType41, chronology43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType47 = periodType46.withMonthsRemoved();
        org.joda.time.Period period48 = duration40.toPeriodTo(readableInstant45, periodType47);
        org.joda.time.Period period49 = duration40.toPeriod();
        org.joda.time.Duration duration50 = duration36.plus((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration52 = duration32.withDurationAdded((org.joda.time.ReadableDuration) duration40, 25);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Interval interval54 = duration32.toIntervalFrom(readableInstant53);
        org.joda.time.Minutes minutes55 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval) interval54);
        org.joda.time.Minutes minutes56 = minutes22.plus(minutes55);
        org.joda.time.Minutes minutes57 = minutes10.plus(minutes55);
        java.lang.String str58 = minutes10.toString();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(minutes15);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(minutes22);
        org.junit.Assert.assertNotNull(minutes23);
        org.junit.Assert.assertNotNull(minutes24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(minutes26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(minutes28);
        org.junit.Assert.assertNotNull(minutes29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(minutes55);
        org.junit.Assert.assertNotNull(minutes56);
        org.junit.Assert.assertNotNull(minutes57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT-1M" + "'", str58, "PT-1M");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes3 = minutes0.plus(minutes2);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        boolean boolean6 = minutes4.isLessThan(minutes5);
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.Minutes minutes9 = minutes4.dividedBy((int) (byte) 100);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType11 = minutes10.getFieldType();
        org.joda.time.PeriodType periodType12 = minutes10.getPeriodType();
        org.joda.time.Minutes minutes13 = minutes9.plus(minutes10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds14 = minutes13.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 60");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(minutes13);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Hours hours1 = org.joda.time.Hours.parseHours("MinutesNoMinutes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"MinutesNoMinutes\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        java.lang.String str6 = minutes4.toString();
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.Minutes minutes9 = minutes4.minus(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds10 = minutes4.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 60");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-2147483648M" + "'", str6, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(minutes9);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Period period10 = period7.withMillis(100);
        org.joda.time.Period period12 = period10.plusMonths(100);
        org.joda.time.Period period14 = period12.multipliedBy(0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((long) 'a', (long) (short) 0, periodType4);
        org.joda.time.Hours hours6 = period5.toStandardHours();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period9 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType11 = period9.getFieldType((int) (short) 1);
        org.joda.time.Period period13 = period9.plusDays(10);
        boolean boolean14 = periodType7.equals((java.lang.Object) 10);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod17.addYears((int) '4');
        boolean boolean20 = periodType7.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = period5.withPeriodType(periodType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        int int5 = period4.getSeconds();
        org.joda.time.Period period7 = period4.withHours((int) '#');
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod10.addYears((int) '4');
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod10.add((long) 100, chronology14);
        mutablePeriod10.setMillis((int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        mutablePeriod10.setPeriod(readableInstant18, readableInstant19);
        mutablePeriod10.clear();
        org.joda.time.Period period22 = period4.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.format.PeriodPrinter periodPrinter23 = null;
        org.joda.time.format.PeriodParser periodParser24 = null;
        org.joda.time.format.PeriodFormatter periodFormatter25 = new org.joda.time.format.PeriodFormatter(periodPrinter23, periodParser24);
        org.joda.time.format.PeriodParser periodParser26 = periodFormatter25.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter27 = periodFormatter25.getPrinter();
        java.util.Locale locale28 = null;
        org.joda.time.format.PeriodFormatter periodFormatter29 = periodFormatter25.withLocale(locale28);
        java.util.Locale locale30 = null;
        org.joda.time.format.PeriodFormatter periodFormatter31 = periodFormatter29.withLocale(locale30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = mutablePeriod10.toString(periodFormatter31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNull(periodParser26);
        org.junit.Assert.assertNull(periodPrinter27);
        org.junit.Assert.assertNotNull(periodFormatter29);
        org.junit.Assert.assertNotNull(periodFormatter31);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        java.lang.Object obj0 = null;
        org.joda.time.Duration duration1 = new org.joda.time.Duration(obj0);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds7 = duration6.toStandardSeconds();
        boolean boolean8 = duration3.isLongerThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Period period9 = duration3.toPeriod();
        int int10 = duration1.compareTo((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds13 = duration12.toStandardSeconds();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds16 = duration15.toStandardSeconds();
        boolean boolean17 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Duration duration19 = duration12.minus((long) 3);
        boolean boolean20 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = duration1.compareTo(readableDuration21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(100, 8, 8, 25, 25, 10, 3, (int) '#');
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Days days11 = days5.minus(days10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Days days16 = days14.minus(10);
        org.joda.time.Days days17 = days5.plus(days14);
        org.joda.time.Days days19 = days17.dividedBy(100);
        org.joda.time.Days days20 = null;
        org.joda.time.Days days21 = days19.plus(days20);
        org.joda.time.Period period23 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days24 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period26 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days27 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period26);
        org.joda.time.PeriodType periodType28 = days27.getPeriodType();
        boolean boolean29 = days24.isGreaterThan(days27);
        org.joda.time.Period period31 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days32 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Days days33 = days27.minus(days32);
        org.joda.time.Period period35 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days36 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Days days38 = days36.minus(10);
        org.joda.time.Days days39 = days27.plus(days36);
        org.joda.time.Days days41 = days39.dividedBy(100);
        org.joda.time.Days days42 = null;
        org.joda.time.Days days43 = days41.plus(days42);
        org.joda.time.Days days44 = days41.negated();
        boolean boolean45 = days21.isGreaterThan(days44);
        org.joda.time.Duration duration47 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType49 = periodType48.withWeeksRemoved();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Period period51 = duration47.toPeriod(periodType48, chronology50);
        org.joda.time.Days days52 = org.joda.time.Days.ZERO;
        int int53 = days52.getDays();
        org.joda.time.Period period55 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days56 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period55);
        org.joda.time.Period period58 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days59 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period58);
        org.joda.time.PeriodType periodType60 = days59.getPeriodType();
        boolean boolean61 = days56.isGreaterThan(days59);
        org.joda.time.Period period63 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days64 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period63);
        org.joda.time.Days days65 = days59.minus(days64);
        org.joda.time.Days days66 = days52.minus(days59);
        boolean boolean67 = duration47.equals((java.lang.Object) days59);
        boolean boolean68 = days44.isGreaterThan(days59);
        org.joda.time.Seconds seconds69 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType70 = seconds69.getPeriodType();
        java.lang.String str71 = seconds69.toString();
        org.joda.time.Seconds seconds73 = seconds69.plus((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int74 = days59.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds69);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Days cannot be compared to class org.joda.time.Seconds");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(days52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(days56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(days59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(days64);
        org.junit.Assert.assertNotNull(days65);
        org.junit.Assert.assertNotNull(days66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(seconds69);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "PT0S" + "'", str71, "PT0S");
        org.junit.Assert.assertNotNull(seconds73);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.Period period1 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType3 = period1.getFieldType((int) (short) 1);
        org.joda.time.Period period5 = period1.withSeconds((-1));
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        java.lang.String str7 = period1.toString();
        org.joda.time.Period period9 = period1.plusHours(10);
        org.joda.time.Period period11 = period1.minusWeeks((int) (byte) 1);
        org.joda.time.Chronology chronology12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((java.lang.Object) (byte) 1, chronology12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0S" + "'", str7, "PT0S");
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period3 = org.joda.time.Period.hours(0);
        org.joda.time.DurationFieldType durationFieldType5 = period3.getFieldType((int) (short) 1);
        org.joda.time.Period period7 = period3.plusDays(10);
        boolean boolean8 = periodType1.equals((java.lang.Object) 10);
        org.joda.time.Period period9 = new org.joda.time.Period((long) ' ', periodType1);
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.PeriodType periodType13 = days12.getPeriodType();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableInstant14, readableDuration15);
        mutablePeriod16.setHours((int) (short) 100);
        boolean boolean19 = periodType13.equals((java.lang.Object) mutablePeriod16);
        org.joda.time.Duration duration20 = org.joda.time.Duration.ZERO;
        long long21 = duration20.getStandardDays();
        mutablePeriod16.add((org.joda.time.ReadableDuration) duration20);
        mutablePeriod16.setPeriod((long) 10, (long) (byte) -1);
        mutablePeriod16.addMinutes((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period28 = period9.withFields((org.joda.time.ReadablePeriod) mutablePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        int int1 = days0.getDays();
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        boolean boolean9 = days4.isGreaterThan(days7);
        org.joda.time.Period period11 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Days days13 = days7.minus(days12);
        org.joda.time.Days days14 = days0.minus(days7);
        org.joda.time.Period period16 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days17 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period19 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days20 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period19);
        org.joda.time.PeriodType periodType21 = days20.getPeriodType();
        boolean boolean22 = days17.isGreaterThan(days20);
        org.joda.time.Period period24 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days25 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Days days26 = days20.minus(days25);
        org.joda.time.Days days27 = days0.plus(days26);
        int int28 = days0.getDays();
        org.joda.time.Chronology chronology29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = new org.joda.time.Period((java.lang.Object) int28, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.ZERO;
        boolean boolean2 = minutes0.isLessThan(minutes1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes4 = minutes1.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant2, periodType3);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod5.setMillis(60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (-1));
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes(100L);
        org.joda.time.Period period5 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.PeriodType periodType7 = days6.getPeriodType();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant8, readableDuration9);
        mutablePeriod10.setHours((int) (short) 100);
        boolean boolean13 = periodType7.equals((java.lang.Object) mutablePeriod10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((java.lang.Object) duration3, periodType7, chronology14);
        boolean boolean16 = duration1.isEqual((org.joda.time.ReadableDuration) duration3);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType21 = periodType20.withWeeksRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withDaysRemoved();
        org.joda.time.Period period23 = new org.joda.time.Period(readableInstant18, readableInstant19, periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant17, periodType22);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod24.addMonths(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) 100, chronology6);
        mutablePeriod2.add(1, 10, (int) 'a', 52, (int) (short) 100, 0, (int) (byte) 0, (int) (byte) 10);
        org.joda.time.Seconds seconds18 = org.joda.time.Seconds.seconds(0);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) seconds18);
        mutablePeriod2.setPeriod((long) ' ', (long) 13);
        mutablePeriod2.setYears(1);
        mutablePeriod2.clear();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        mutablePeriod2.setPeriod(readableInstant26, readableInstant27);
        org.junit.Assert.assertNotNull(seconds18);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) 10);
        java.lang.String str12 = duration11.toString();
        org.joda.time.Duration duration14 = duration11.minus((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Minutes minutes16 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType17 = minutes16.getPeriodType();
        org.joda.time.PeriodType periodType18 = periodType17.withSecondsRemoved();
        org.joda.time.Period period19 = duration14.toPeriodFrom(readableInstant15, periodType17);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 0, (long) 3, periodType17);
        org.joda.time.PeriodType periodType21 = periodType17.withMonthsRemoved();
        org.joda.time.PeriodType periodType22 = periodType21.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(32, (int) '4', (int) (short) 1, (int) (short) 1, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, 32, periodType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT600S" + "'", str12, "PT600S");
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(minutes16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(periodType22);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant2, periodType3);
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod5.copy();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 0, (long) 2, chronology9);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType12 = periodType11.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = periodType12.withDaysRemoved();
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration15 = seconds14.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType16 = seconds14.getFieldType();
        org.joda.time.Chronology chronology17 = null;
        boolean boolean18 = durationFieldType16.isSupported(chronology17);
        int int19 = periodType13.indexOf(durationFieldType16);
        mutablePeriod10.set(durationFieldType16, 10);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod5.add((org.joda.time.ReadablePeriod) mutablePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(periodType3);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.setMillis((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT-1H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 0, periodType1, chronology2);
        mutablePeriod3.setMonths((int) (byte) 100);
        org.joda.time.Period period7 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days8 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period10 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period10);
        org.joda.time.PeriodType periodType12 = days11.getPeriodType();
        boolean boolean13 = days8.isGreaterThan(days11);
        org.joda.time.Period period15 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days16 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Days days17 = days11.minus(days16);
        int int18 = days11.size();
        org.joda.time.Days days19 = org.joda.time.Days.ZERO;
        org.joda.time.Period period21 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days22 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Days days24 = days22.minus(10);
        boolean boolean25 = days19.isGreaterThan(days22);
        org.joda.time.Days days26 = days11.minus(days22);
        org.joda.time.Duration duration27 = days26.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType28 = days26.getFieldType();
        org.joda.time.Days days29 = org.joda.time.Days.ONE;
        boolean boolean30 = days26.isGreaterThan(days29);
        mutablePeriod3.add((org.joda.time.ReadablePeriod) days29);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.add((-32), 0, 1, 1, (int) 'a', 32, (int) (short) -1, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        java.lang.String str3 = periodType2.getName();
        java.lang.String str4 = periodType2.toString();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MinutesNoMinutes" + "'", str3, "MinutesNoMinutes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PeriodType[MinutesNoMinutes]" + "'", str4, "PeriodType[MinutesNoMinutes]");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType8 = periodType7.withMonthsRemoved();
        org.joda.time.Period period9 = duration1.toPeriodTo(readableInstant6, periodType8);
        org.joda.time.Minutes minutes10 = duration1.toStandardMinutes();
        org.joda.time.Minutes minutes12 = minutes10.multipliedBy((int) (short) -1);
        org.joda.time.Period period14 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days15 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period17 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days18 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period17);
        org.joda.time.PeriodType periodType19 = days18.getPeriodType();
        boolean boolean20 = days15.isGreaterThan(days18);
        org.joda.time.Period period22 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days23 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Days days24 = days18.minus(days23);
        int int25 = days18.size();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = minutes10.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Minutes cannot be compared to class org.joda.time.Days");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant7, periodType8);
        org.joda.time.Duration duration11 = period10.toStandardDuration();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period10.withYears(60);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration11);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours2 = hours0.minus(0);
        org.joda.time.Hours hours3 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours5 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean6 = hours3.isGreaterThan(hours5);
        boolean boolean7 = hours2.isLessThan(hours5);
        java.lang.String str8 = hours2.toString();
        org.joda.time.Hours hours9 = org.joda.time.Hours.ZERO;
        org.joda.time.Hours hours10 = hours2.plus(hours9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = hours10.getFieldType(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 13");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT4H" + "'", str8, "PT4H");
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(hours10);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.seconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(0, 0, 0, (int) (short) 100, (-1), 0, 13, (int) (short) -1, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Period period6 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period8 = period6.withHours(32);
        org.joda.time.Hours hours9 = period6.toStandardHours();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = periodFormatter2.print((org.joda.time.ReadablePeriod) hours9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.Period period11 = period8.withPeriodType(periodType9);
        org.joda.time.Period period13 = period11.plusWeeks((int) (byte) 0);
        org.joda.time.Period period15 = period11.multipliedBy((int) (short) 0);
        int int16 = period15.getYears();
        org.joda.time.Period period18 = org.joda.time.Period.weeks(32);
        boolean boolean19 = period15.equals((java.lang.Object) 32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = period15.minusMonths((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds7 = duration6.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = seconds7.getFieldType();
        org.joda.time.Seconds seconds10 = seconds7.plus(25);
        org.joda.time.Seconds seconds11 = seconds7.negated();
        org.joda.time.PeriodType periodType12 = seconds11.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter3.withParseType(periodType12);
        org.joda.time.format.PeriodPrinter periodPrinter14 = periodFormatter13.getPrinter();
        org.joda.time.format.PeriodParser periodParser15 = periodFormatter13.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter16 = periodFormatter13.getPrinter();
        boolean boolean17 = periodFormatter13.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod18 = org.joda.time.MutablePeriod.parse("hours", periodFormatter13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertNull(periodPrinter14);
        org.junit.Assert.assertNull(periodParser15);
        org.junit.Assert.assertNull(periodPrinter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds10 = duration9.toStandardSeconds();
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds13 = duration12.toStandardSeconds();
        boolean boolean14 = duration9.isLongerThan((org.joda.time.ReadableDuration) duration12);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds17 = duration16.toStandardSeconds();
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds20 = duration19.toStandardSeconds();
        boolean boolean21 = duration16.isLongerThan((org.joda.time.ReadableDuration) duration19);
        org.joda.time.Period period22 = duration16.toPeriod();
        boolean boolean23 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = duration12.toPeriodTo(readableInstant24);
        long long26 = duration12.getStandardDays();
        org.joda.time.Duration duration28 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period29 = duration28.toPeriod();
        long long30 = duration28.getStandardSeconds();
        boolean boolean31 = duration12.isEqual((org.joda.time.ReadableDuration) duration28);
        org.joda.time.Duration duration33 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds34 = duration33.toStandardSeconds();
        java.lang.String str35 = seconds34.toString();
        org.joda.time.PeriodType periodType36 = seconds34.getPeriodType();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((java.lang.Object) duration12, periodType36, chronology37);
        java.lang.String str39 = periodType36.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period40 = new org.joda.time.Period((int) (short) 10, 0, (int) 'a', 3, 32, 10, (int) (short) 100, 32, periodType36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(seconds20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-60L) + "'", long30 == (-60L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertNotNull(seconds34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT60S" + "'", str35, "PT60S");
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PeriodType[Seconds]" + "'", str39, "PeriodType[Seconds]");
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Seconds seconds9 = period8.toStandardSeconds();
        org.joda.time.Period period10 = period8.negated();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = period8.toDurationTo(readableInstant11);
        org.joda.time.DurationFieldType[] durationFieldTypeArray13 = period8.getFieldTypes();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.forFields(durationFieldTypeArray13);
        org.joda.time.Chronology chronology15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) periodType14, chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(durationFieldTypeArray13);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        int int8 = days2.size();
        org.joda.time.Days days9 = days2.negated();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) days9, chronology10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((java.lang.Object) period11);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod13.add(4, 100, 8, 32, (-672), 10, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(mutablePeriod12);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds7 = duration6.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = seconds7.getFieldType();
        org.joda.time.Seconds seconds10 = seconds7.plus(25);
        org.joda.time.Seconds seconds11 = seconds7.negated();
        org.joda.time.PeriodType periodType12 = seconds11.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter3.withParseType(periodType12);
        boolean boolean14 = periodFormatter3.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = org.joda.time.Period.parse("PT600S", periodFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant4, readableDuration5);
        mutablePeriod6.setHours((int) (short) 100);
        boolean boolean9 = periodType3.equals((java.lang.Object) mutablePeriod6);
        org.joda.time.Duration duration10 = org.joda.time.Duration.ZERO;
        long long11 = duration10.getStandardDays();
        mutablePeriod6.add((org.joda.time.ReadableDuration) duration10);
        mutablePeriod6.setWeeks(8);
        int int15 = mutablePeriod6.getHours();
        mutablePeriod6.addHours((int) 'a');
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant2, periodType3);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod5.setValue(13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        org.joda.time.PeriodType periodType2 = periodType1.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = periodType2.getFieldType(2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType6 = minutes5.getPeriodType();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes8 = minutes5.plus(minutes7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.ZERO;
        boolean boolean11 = minutes9.isLessThan(minutes10);
        boolean boolean12 = minutes5.isLessThan(minutes9);
        org.joda.time.PeriodType periodType13 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter2.withParseType(periodType13);
        org.joda.time.Hours hours15 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours17 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean18 = hours15.isGreaterThan(hours17);
        org.joda.time.Hours hours20 = hours15.minus((int) (byte) 0);
        org.joda.time.Hours hours22 = hours20.plus(0);
        org.joda.time.DurationFieldType durationFieldType23 = hours22.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = periodFormatter2.print((org.joda.time.ReadablePeriod) hours22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(hours17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(hours20);
        org.junit.Assert.assertNotNull(hours22);
        org.junit.Assert.assertNotNull(durationFieldType23);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType6 = minutes5.getPeriodType();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes8 = minutes5.plus(minutes7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.ZERO;
        boolean boolean11 = minutes9.isLessThan(minutes10);
        boolean boolean12 = minutes5.isLessThan(minutes9);
        org.joda.time.PeriodType periodType13 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter2.withParseType(periodType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod16 = periodFormatter2.parseMutablePeriod("Days");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodFormatter14);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
        org.joda.time.Weeks weeks2 = weeks0.dividedBy(52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) weeks0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -15032385536");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Days days11 = days5.minus(days10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period16 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days17 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period16);
        org.joda.time.PeriodType periodType18 = days17.getPeriodType();
        boolean boolean19 = days14.isGreaterThan(days17);
        org.joda.time.Days days21 = days14.minus(1);
        boolean boolean22 = days5.isGreaterThan(days21);
        org.joda.time.PeriodType periodType23 = days5.getPeriodType();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        int int4 = period3.size();
        org.joda.time.Period period6 = period3.plusDays(1);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Period period9 = period6.plusMonths(25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds10 = period9.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(60000L, (long) (byte) 100, chronology2);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 0, periodType1, chronology2);
        mutablePeriod3.setMonths((int) (byte) 100);
        int int6 = mutablePeriod3.getYears();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.addMinutes(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod2.addYears((int) '4');
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod2.add((long) (byte) 1, chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutablePeriod2.setPeriod(readableDuration8);
        org.joda.time.Chronology chronology12 = null;
        mutablePeriod2.setPeriod((long) (short) 10, (long) (short) 10, chronology12);
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod2.add((long) (short) 100, chronology15);
        mutablePeriod2.add(0L);
        org.joda.time.format.PeriodPrinter periodPrinter19 = null;
        org.joda.time.format.PeriodParser periodParser20 = null;
        org.joda.time.format.PeriodFormatter periodFormatter21 = new org.joda.time.format.PeriodFormatter(periodPrinter19, periodParser20);
        org.joda.time.format.PeriodParser periodParser22 = periodFormatter21.getParser();
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds25 = duration24.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType26 = seconds25.getFieldType();
        org.joda.time.Seconds seconds28 = seconds25.plus(25);
        org.joda.time.Seconds seconds29 = seconds25.negated();
        org.joda.time.PeriodType periodType30 = seconds29.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter31 = periodFormatter21.withParseType(periodType30);
        boolean boolean32 = periodFormatter21.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = mutablePeriod2.toString(periodFormatter21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser22);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertNotNull(seconds29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodFormatter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours2 = hours0.minus(0);
        org.joda.time.Hours hours3 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours5 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean6 = hours3.isGreaterThan(hours5);
        boolean boolean7 = hours2.isLessThan(hours5);
        java.lang.String str8 = hours2.toString();
        org.joda.time.Hours hours10 = hours2.dividedBy((int) (short) 10);
        org.joda.time.PeriodType periodType11 = hours10.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(periodType11);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod12.setSeconds((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT4H" + "'", str8, "PT4H");
        org.junit.Assert.assertNotNull(hours10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.minutes();
        java.lang.String str1 = periodType0.getName();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Minutes" + "'", str1, "Minutes");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.Period period1 = org.joda.time.Period.years((-32));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean3 = hours0.isGreaterThan(hours2);
        org.joda.time.Duration duration4 = hours2.toStandardDuration();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.millis();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((-1L), periodType6, chronology7);
        org.joda.time.Chronology chronology9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) hours2, periodType6, chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.Period period7 = period5.withMillis(2);
        int int8 = period7.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period7.withHours(52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, (long) (byte) 100);
        mutablePeriod2.addMinutes(10);
        java.lang.Object obj5 = mutablePeriod2.clone();
        mutablePeriod2.setYears((int) (byte) 10);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "P10YT10M0.099S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "P10YT10M0.099S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "P10YT10M0.099S");
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean3 = hours0.isGreaterThan(hours2);
        org.joda.time.Duration duration4 = hours2.toStandardDuration();
        org.joda.time.Period period5 = duration4.toPeriod();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) '4', chronology7);
        org.joda.time.Duration duration9 = org.joda.time.Duration.ZERO;
        long long10 = duration9.getStandardDays();
        org.joda.time.Hours hours11 = duration9.toStandardHours();
        long long12 = duration9.getStandardMinutes();
        long long13 = duration9.getStandardDays();
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Duration duration15 = duration4.plus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = duration15.toPeriodTo(readableInstant16);
        org.joda.time.Duration duration19 = duration15.minus((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval21 = duration19.toIntervalTo(readableInstant20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(hours11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration19);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = period3.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period8 = period6.normalizedStandard(periodType7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(1L, 1L, periodType7, chronology9);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod10.addWeeks((-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = period3.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period8 = period6.normalizedStandard(periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType7);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.add((int) (byte) 0, 32, 13, (int) '#', 0, 1, 32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus(25);
        org.joda.time.Seconds seconds10 = seconds6.negated();
        org.joda.time.PeriodType periodType11 = seconds10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withParseType(periodType11);
        org.joda.time.Period period14 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days15 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period14);
        org.joda.time.PeriodType periodType16 = days15.getPeriodType();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant17, readableDuration18);
        mutablePeriod19.setHours((int) (short) 100);
        boolean boolean22 = periodType16.equals((java.lang.Object) mutablePeriod19);
        org.joda.time.PeriodType periodType23 = periodType16.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period((java.lang.Object) periodType11, periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType4 = periodType3.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, readableInstant2, periodType3);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod5.addSeconds((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(25, (int) 'a', (int) (short) 10, 4, 8, (int) (short) 100, (int) (short) 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DurationField durationField18 = durationFieldType16.getField(chronology17);
        mutablePeriod15.add(durationFieldType16, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(stringBuffer6, (org.joda.time.ReadablePeriod) mutablePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Seconds seconds9 = period8.toStandardSeconds();
        org.joda.time.Period period10 = period8.negated();
        int int11 = period8.getSeconds();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType13 = periodType12.withWeeksRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = period8.withPeriodType(periodType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Period period10 = period7.withMillis(100);
        org.joda.time.Period period12 = period10.plusMonths(100);
        org.joda.time.Period period14 = period10.withMonths(0);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.Period period16 = period10.minus(readablePeriod15);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        int int8 = days2.size();
        org.joda.time.Days days9 = days2.negated();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) days9, chronology10);
        org.joda.time.MutablePeriod mutablePeriod12 = period11.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod12.addMillis(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(mutablePeriod12);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.format.PeriodPrinter periodPrinter6 = periodFormatter5.getPrinter();
        java.io.Writer writer7 = null;
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period12 = period9.withSeconds((int) ' ');
        int int13 = period12.getSeconds();
        org.joda.time.Period period15 = period12.minusMillis(0);
        org.joda.time.Days days16 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period12);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter5.printTo(writer7, (org.joda.time.ReadablePeriod) days16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodPrinter6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        int int4 = period3.size();
        org.joda.time.Period period6 = period3.plusMillis((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.secondsIn(readableInterval0);
        org.joda.time.Weeks weeks2 = seconds1.toStandardWeeks();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        java.util.Locale locale3 = periodFormatter2.getLocale();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((-32), (int) (short) 10, (int) '#', 0, (-2147483648), 4, 8, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = periodFormatter2.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod12, "P0W", 52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Seconds seconds4 = seconds2.plus(100);
        java.lang.Class<?> wildcardClass5 = seconds4.getClass();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Period period10 = period7.withMillis(100);
        org.joda.time.Period period12 = period10.plusMonths(100);
        int int13 = period12.getHours();
        org.joda.time.Period period15 = period12.withSeconds(8);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds18 = duration17.toStandardSeconds();
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds21 = duration20.toStandardSeconds();
        boolean boolean22 = duration17.isLongerThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration24 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds25 = duration24.toStandardSeconds();
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds28 = duration27.toStandardSeconds();
        boolean boolean29 = duration24.isLongerThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Period period30 = duration24.toPeriod();
        boolean boolean31 = duration20.isLongerThan((org.joda.time.ReadableDuration) duration24);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = duration20.toPeriodTo(readableInstant32);
        long long34 = duration20.getStandardDays();
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period37 = duration36.toPeriod();
        long long38 = duration36.getStandardSeconds();
        boolean boolean39 = duration20.isEqual((org.joda.time.ReadableDuration) duration36);
        org.joda.time.Duration duration41 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds42 = duration41.toStandardSeconds();
        java.lang.String str43 = seconds42.toString();
        org.joda.time.PeriodType periodType44 = seconds42.getPeriodType();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((java.lang.Object) duration20, periodType44, chronology45);
        java.lang.String str47 = periodType44.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period48 = period12.withPeriodType(periodType44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(seconds18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(seconds21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(seconds25);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(seconds28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-60L) + "'", long38 == (-60L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(seconds42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PT60S" + "'", str43, "PT60S");
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PeriodType[Seconds]" + "'", str47, "PeriodType[Seconds]");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        long long1 = duration0.getStandardDays();
        org.joda.time.Hours hours2 = duration0.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType3 = hours2.getFieldType();
        org.joda.time.MutablePeriod mutablePeriod4 = hours2.toMutablePeriod();
        org.joda.time.Minutes minutes5 = hours2.toStandardMinutes();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(minutes5);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant5, readableDuration6);
        mutablePeriod7.setPeriod((long) ' ', (long) 52);
        mutablePeriod7.addDays(100);
        org.joda.time.PeriodType periodType13 = mutablePeriod7.getPeriodType();
        org.joda.time.Period period14 = new org.joda.time.Period((long) (short) 0, periodType13);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType13);
        org.joda.time.Period period16 = new org.joda.time.Period(readableInstant0, readableInstant1, periodType13);
        org.joda.time.Period period18 = period16.plusMonths(13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes19 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) period18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P13M");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant1, readableDuration2);
        mutablePeriod3.setPeriod((long) ' ', (long) 52);
        mutablePeriod3.addDays(100);
        org.joda.time.PeriodType periodType9 = mutablePeriod3.getPeriodType();
        org.joda.time.Period period10 = new org.joda.time.Period((long) (short) 0, periodType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = periodType9.getFieldType((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.Period period1 = org.joda.time.Period.millis((int) (short) 0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        org.joda.time.format.PeriodPrinter periodPrinter6 = periodFormatter5.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = periodFormatter5.parsePeriod("P0D");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(periodPrinter6);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.ZERO;
        boolean boolean2 = minutes0.isLessThan(minutes1);
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType4 = minutes3.getPeriodType();
        int int5 = minutes3.getMinutes();
        java.lang.String str6 = minutes3.toString();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType8 = minutes7.getFieldType();
        java.lang.String str9 = minutes7.toString();
        boolean boolean10 = minutes3.isLessThan(minutes7);
        int int11 = minutes3.size();
        org.joda.time.Minutes minutes12 = minutes0.plus(minutes3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType14 = minutes3.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0M" + "'", str6, "PT0M");
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT-2147483648M" + "'", str9, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(minutes12);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        org.joda.time.Minutes minutes2 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes3 = minutes0.plus(minutes2);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        boolean boolean6 = minutes4.isLessThan(minutes5);
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.Duration duration8 = minutes0.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        java.lang.Object obj11 = null;
        org.joda.time.Duration duration12 = new org.joda.time.Duration(obj11);
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant10, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.Period period14 = new org.joda.time.Period(readableInstant9, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType18 = periodType17.withWeeksRemoved();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Period period20 = duration16.toPeriod(periodType17, chronology19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType23 = periodType22.withMonthsRemoved();
        org.joda.time.Period period24 = duration16.toPeriodTo(readableInstant21, periodType23);
        org.joda.time.Period period25 = duration16.toPeriod();
        org.joda.time.Duration duration26 = duration12.plus((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Duration duration28 = duration8.withDurationAdded((org.joda.time.ReadableDuration) duration16, 25);
        org.joda.time.ReadableInstant readableInstant29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval30 = duration16.toIntervalFrom(readableInstant29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(minutes2);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration28);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.Weeks weeks0 = org.joda.time.Weeks.TWO;
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Weeks weeks2 = org.joda.time.Weeks.weeksIn(readableInterval1);
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.Weeks weeks4 = org.joda.time.Weeks.weeksIn(readableInterval3);
        boolean boolean5 = weeks2.isLessThan(weeks4);
        org.joda.time.Weeks weeks6 = weeks2.negated();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Weeks weeks8 = org.joda.time.Weeks.weeksIn(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Weeks weeks10 = org.joda.time.Weeks.weeksIn(readableInterval9);
        boolean boolean11 = weeks8.isLessThan(weeks10);
        org.joda.time.Weeks weeks12 = weeks8.negated();
        org.joda.time.Weeks weeks14 = weeks12.minus((int) (byte) 100);
        org.joda.time.Weeks weeks15 = weeks6.plus(weeks12);
        boolean boolean16 = weeks0.isLessThan(weeks12);
        org.joda.time.Weeks weeks18 = weeks0.multipliedBy((int) (short) 1);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeksIn(readableInterval19);
        org.joda.time.Weeks weeks22 = weeks20.multipliedBy((int) (short) 10);
        org.joda.time.Weeks weeks23 = weeks18.plus(weeks20);
        java.lang.Class<?> wildcardClass24 = weeks20.getClass();
        org.junit.Assert.assertNotNull(weeks0);
        org.junit.Assert.assertNotNull(weeks2);
        org.junit.Assert.assertNotNull(weeks4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(weeks10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(weeks12);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.withMillis((int) (byte) -1);
        org.joda.time.Period period5 = period1.withMillis(0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = period5.getValue(13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("MinutesNoMinutes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"MinutesNoMinutes\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 100);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.lang.Object obj0 = null;
        org.joda.time.Duration duration1 = new org.joda.time.Duration(obj0);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds4 = duration3.toStandardSeconds();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds7 = duration6.toStandardSeconds();
        boolean boolean8 = duration3.isLongerThan((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Period period9 = duration3.toPeriod();
        int int10 = duration1.compareTo((org.joda.time.ReadableDuration) duration3);
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds13 = duration12.toStandardSeconds();
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds16 = duration15.toStandardSeconds();
        boolean boolean17 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Duration duration19 = duration12.minus((long) 3);
        boolean boolean20 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration19);
        java.lang.String str21 = duration1.toString();
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(seconds4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(seconds16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT0S" + "'", str21, "PT0S");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType7 = seconds6.getFieldType();
        org.joda.time.Seconds seconds9 = seconds6.plus(25);
        org.joda.time.Seconds seconds10 = seconds6.negated();
        org.joda.time.PeriodType periodType11 = seconds10.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter12 = periodFormatter2.withParseType(periodType11);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 'a', (long) 0);
        mutablePeriod15.addYears((int) '4');
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod15.add((long) 100, chronology19);
        org.joda.time.Duration duration22 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds23 = duration22.toStandardSeconds();
        java.lang.String str24 = seconds23.toString();
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.days();
        boolean boolean26 = seconds23.isSupported(durationFieldType25);
        int int27 = mutablePeriod15.get(durationFieldType25);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = periodFormatter12.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod15, "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodFormatter12);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(seconds23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT60S" + "'", str24, "PT60S");
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 10);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.ZERO;
        boolean boolean2 = minutes0.isLessThan(minutes1);
        org.joda.time.Minutes minutes3 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType4 = minutes3.getPeriodType();
        int int5 = minutes3.getMinutes();
        java.lang.String str6 = minutes3.toString();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType8 = minutes7.getFieldType();
        java.lang.String str9 = minutes7.toString();
        boolean boolean10 = minutes3.isLessThan(minutes7);
        int int11 = minutes3.size();
        org.joda.time.Minutes minutes12 = minutes0.plus(minutes3);
        org.joda.time.Minutes minutes13 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes14 = org.joda.time.Minutes.ZERO;
        boolean boolean15 = minutes13.isLessThan(minutes14);
        org.joda.time.Minutes minutes17 = minutes14.multipliedBy((int) (short) 10);
        org.joda.time.Minutes minutes18 = minutes3.plus(minutes17);
        java.lang.String str19 = minutes17.toString();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(minutes3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0M" + "'", str6, "PT0M");
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT-2147483648M" + "'", str9, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
        org.junit.Assert.assertNotNull(minutes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(minutes17);
        org.junit.Assert.assertNotNull(minutes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0M" + "'", str19, "PT0M");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 0, (long) (byte) 10, periodType2, chronology3);
        org.joda.time.Duration duration5 = org.joda.time.Duration.ZERO;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration5.toPeriod(chronology6);
        org.joda.time.Period period8 = period4.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Hours hours9 = period7.toStandardHours();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) hours9, periodType10);
        org.joda.time.Seconds seconds12 = hours9.toStandardSeconds();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(seconds12);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.util.Locale locale6 = periodFormatter2.getLocale();
        java.io.Writer writer7 = null;
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.PeriodType periodType11 = days10.getPeriodType();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableInstant12, readableDuration13);
        mutablePeriod14.setHours((int) (short) 100);
        boolean boolean17 = periodType11.equals((java.lang.Object) mutablePeriod14);
        org.joda.time.Duration duration18 = org.joda.time.Duration.ZERO;
        long long19 = duration18.getStandardDays();
        mutablePeriod14.add((org.joda.time.ReadableDuration) duration18);
        mutablePeriod14.setWeeks((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod23 = mutablePeriod14.copy();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer7, (org.joda.time.ReadablePeriod) mutablePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(mutablePeriod23);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Period period3 = mutablePeriod2.toPeriod();
        org.joda.time.Period period5 = period3.withHours(0);
        org.joda.time.Hours hours6 = period5.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType7 = hours6.getFieldType();
        org.joda.time.Seconds seconds8 = hours6.toStandardSeconds();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(seconds8);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.Seconds seconds8 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType9 = seconds8.getPeriodType();
        int int10 = periodType9.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(7, 60, (int) (byte) 10, (int) (short) 100, (int) (short) 0, (int) ' ', 10, 7, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.Hours hours0 = org.joda.time.Hours.ONE;
        org.joda.time.DurationFieldType durationFieldType1 = hours0.getFieldType();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DurationField durationField3 = durationFieldType1.getField(chronology2);
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType4 = periodType3.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (-1), periodType4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(10L, (long) 8, periodType4, chronology6);
        int int8 = mutablePeriod7.getYears();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.Period period2 = new org.joda.time.Period(600L, (long) 60);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = periodFormatter5.parsePeriod("PeriodType[Days]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType6 = seconds5.getFieldType();
        mutablePeriod2.add(durationFieldType6, 52);
        mutablePeriod2.add((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.setValue(32, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeks(1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period5 = period3.withMillis((int) (byte) -1);
        org.joda.time.Weeks weeks6 = period5.toStandardWeeks();
        org.joda.time.Weeks weeks7 = weeks1.plus(weeks6);
        org.joda.time.Weeks weeks9 = weeks1.plus((int) (byte) 10);
        org.joda.time.Weeks weeks11 = weeks1.multipliedBy((-2147483648));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds12 = weeks11.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2147483648 * 604800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, chronology1);
        org.joda.time.Period period4 = period2.plusMonths(32);
        org.joda.time.Period period6 = period4.minusMinutes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes7 = period6.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant1, readableDuration2);
        mutablePeriod3.setHours((int) (short) 100);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration7, chronology8);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration7, periodType11);
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.ZERO;
        org.joda.time.Duration duration15 = seconds14.toStandardDuration();
        org.joda.time.Duration duration18 = new org.joda.time.Duration((-1L), (long) ' ');
        boolean boolean19 = duration15.isLongerThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration18, chronology20);
        int int22 = mutablePeriod13.getSeconds();
        mutablePeriod13.addMonths(0);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant7, periodType8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant11, readableDuration12);
        mutablePeriod13.setHours((int) (short) 100);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration17, chronology18);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds22 = duration21.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType23 = seconds22.getFieldType();
        mutablePeriod13.add(durationFieldType23, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant26, readableDuration27);
        mutablePeriod28.setHours((int) (short) 100);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration32, chronology33);
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration32, chronology35);
        int int37 = duration4.compareTo((org.joda.time.ReadableDuration) duration32);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Period period39 = duration32.toPeriodFrom(readableInstant38);
        int int40 = period39.getHours();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.MAX_VALUE;
        org.joda.time.Weeks weeks1 = minutes0.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds2 = weeks1.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 213044 * 604800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period((long) (short) 10, chronology1);
        org.joda.time.Period period4 = period2.plusMonths(32);
        org.joda.time.Period period6 = period4.minusMinutes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes7 = period4.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period7 = period4.withSeconds((int) ' ');
        org.joda.time.Period period8 = period1.minus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.Period period11 = period8.withPeriodType(periodType9);
        org.joda.time.Period period13 = period11.plusWeeks((int) (byte) 0);
        org.joda.time.Period period15 = period11.multipliedBy((int) (short) 0);
        int int16 = period15.getYears();
        org.joda.time.Period period18 = org.joda.time.Period.weeks(32);
        boolean boolean19 = period15.equals((java.lang.Object) 32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType6 = minutes5.getFieldType();
        org.joda.time.PeriodType periodType7 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withParseType(periodType7);
        java.io.Writer writer9 = null;
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        boolean boolean16 = duration11.isLongerThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType19 = periodType18.withMinutesRemoved();
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration14, readableInstant17, periodType18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableInstant21, readableDuration22);
        mutablePeriod23.setHours((int) (short) 100);
        org.joda.time.Duration duration27 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod23.setPeriod((org.joda.time.ReadableDuration) duration27, chronology28);
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds32 = duration31.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType33 = seconds32.getFieldType();
        mutablePeriod23.add(durationFieldType33, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(readableInstant36, readableDuration37);
        mutablePeriod38.setHours((int) (short) 100);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod38.setPeriod((org.joda.time.ReadableDuration) duration42, chronology43);
        org.joda.time.Chronology chronology45 = null;
        mutablePeriod23.setPeriod((org.joda.time.ReadableDuration) duration42, chronology45);
        int int47 = duration14.compareTo((org.joda.time.ReadableDuration) duration42);
        org.joda.time.Period period48 = duration42.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod49 = period48.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter8.printTo(writer9, (org.joda.time.ReadablePeriod) mutablePeriod49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(seconds32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(mutablePeriod49);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.Duration duration2 = new org.joda.time.Duration((long) 10, (long) (-2147483648));
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period3 = new org.joda.time.Period(readableDuration0, readableInstant1, periodType2);
        java.lang.Class<?> wildcardClass4 = periodType2.getClass();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        long long1 = duration0.getStandardDays();
        org.joda.time.Hours hours2 = duration0.toStandardHours();
        org.joda.time.PeriodType periodType3 = hours2.getPeriodType();
        org.joda.time.Duration duration4 = hours2.toStandardDuration();
        java.lang.String str5 = duration4.toString();
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0S" + "'", str5, "PT0S");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("P0W");
        org.joda.time.Seconds seconds2 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod) minutes1);
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(seconds2);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 13, (-60L), chronology2);
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DurationField durationField7 = durationFieldType5.getField(chronology6);
        org.joda.time.Period period9 = period3.withField(durationFieldType5, (int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) '4', chronology11);
        int int13 = mutablePeriod12.getHours();
        org.joda.time.Duration duration14 = org.joda.time.Duration.ZERO;
        long long15 = duration14.getStandardDays();
        org.joda.time.Hours hours16 = duration14.toStandardHours();
        long long17 = duration14.getStandardMinutes();
        mutablePeriod12.add((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardHours((long) 25);
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((java.lang.Object) duration20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        java.lang.Object obj24 = null;
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType26 = periodType25.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(obj24, periodType25);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, readableInstant23, periodType25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((java.lang.Object) period9, periodType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(hours16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = periodFormatter2.getLocale();
        org.joda.time.Minutes minutes5 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType6 = minutes5.getPeriodType();
        org.joda.time.Minutes minutes7 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.Minutes minutes8 = minutes5.plus(minutes7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.TWO;
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.ZERO;
        boolean boolean11 = minutes9.isLessThan(minutes10);
        boolean boolean12 = minutes5.isLessThan(minutes9);
        org.joda.time.PeriodType periodType13 = minutes5.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter14 = periodFormatter2.withParseType(periodType13);
        int int15 = periodType13.size();
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(minutes7);
        org.junit.Assert.assertNotNull(minutes8);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodFormatter14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(periodType3, chronology5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType9 = periodType8.withMonthsRemoved();
        org.joda.time.Period period10 = duration2.toPeriodTo(readableInstant7, periodType9);
        org.joda.time.Duration duration11 = duration2.toDuration();
        org.joda.time.Period period13 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days14 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period13);
        org.joda.time.PeriodType periodType15 = days14.getPeriodType();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant16, readableDuration17);
        mutablePeriod18.setHours((int) (short) 100);
        boolean boolean21 = periodType15.equals((java.lang.Object) mutablePeriod18);
        org.joda.time.Duration duration22 = org.joda.time.Duration.ZERO;
        long long23 = duration22.getStandardDays();
        mutablePeriod18.add((org.joda.time.ReadableDuration) duration22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType27 = periodType26.withWeeksRemoved();
        org.joda.time.PeriodType periodType28 = periodType27.withDaysRemoved();
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration22, readableInstant25, periodType27);
        boolean boolean30 = duration2.isEqual((org.joda.time.ReadableDuration) duration22);
        long long31 = duration2.getStandardSeconds();
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.hours();
        org.joda.time.Period period33 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration2, periodType32);
        org.joda.time.Period period34 = duration2.toPeriod();
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-60L) + "'", long31 == (-60L));
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period34);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMinutesRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration4, readableInstant7, periodType8);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant11, readableDuration12);
        mutablePeriod13.setHours((int) (short) 100);
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology18 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration17, chronology18);
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds22 = duration21.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType23 = seconds22.getFieldType();
        mutablePeriod13.add(durationFieldType23, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant26, readableDuration27);
        mutablePeriod28.setHours((int) (short) 100);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration32, chronology33);
        org.joda.time.Chronology chronology35 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration32, chronology35);
        int int37 = duration4.compareTo((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration38 = duration32.toDuration();
        org.joda.time.Duration duration39 = duration38.toDuration();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration38, readableInstant40);
        org.joda.time.MutablePeriod mutablePeriod42 = mutablePeriod41.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod41.setValue(8, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(seconds22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(mutablePeriod42);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(periodType2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = new org.joda.time.Period(readablePartial0, readablePartial1, periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeksIn(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.weeksIn(readableInterval10);
        boolean boolean12 = weeks9.isLessThan(weeks11);
        org.joda.time.Weeks weeks13 = weeks9.negated();
        org.joda.time.Weeks weeks15 = weeks13.minus((int) (byte) 100);
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.Weeks weeks17 = org.joda.time.Weeks.weeksIn(readableInterval16);
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.Weeks weeks19 = org.joda.time.Weeks.weeksIn(readableInterval18);
        boolean boolean20 = weeks17.isLessThan(weeks19);
        org.joda.time.Weeks weeks22 = weeks19.minus((int) (short) -1);
        org.joda.time.Weeks weeks24 = weeks22.multipliedBy(0);
        boolean boolean25 = weeks15.isGreaterThan(weeks24);
        org.joda.time.Period period30 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period32 = period30.withDays((int) 'a');
        org.joda.time.Weeks weeks33 = period32.toStandardWeeks();
        int int34 = weeks33.getWeeks();
        org.joda.time.ReadableInterval readableInterval35 = null;
        org.joda.time.Weeks weeks36 = org.joda.time.Weeks.weeksIn(readableInterval35);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.Weeks weeks38 = org.joda.time.Weeks.weeksIn(readableInterval37);
        boolean boolean39 = weeks36.isLessThan(weeks38);
        org.joda.time.Weeks weeks41 = weeks38.minus((int) (short) -1);
        org.joda.time.Weeks weeks42 = weeks41.negated();
        org.joda.time.Weeks weeks44 = weeks41.multipliedBy(0);
        boolean boolean45 = weeks33.isGreaterThan(weeks44);
        org.joda.time.Weeks weeks46 = weeks24.minus(weeks33);
        org.joda.time.Weeks weeks48 = weeks33.dividedBy(3);
        org.joda.time.PeriodType periodType49 = weeks33.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(4, (int) (byte) 0, 3, (int) (byte) 100, 0, 8, 2, 2, periodType49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(weeks19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 13 + "'", int34 == 13);
        org.junit.Assert.assertNotNull(weeks36);
        org.junit.Assert.assertNotNull(weeks38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(weeks41);
        org.junit.Assert.assertNotNull(weeks42);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(weeks46);
        org.junit.Assert.assertNotNull(weeks48);
        org.junit.Assert.assertNotNull(periodType49);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        boolean boolean13 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.Period period14 = duration8.toPeriod();
        boolean boolean15 = duration4.isLongerThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = duration4.toPeriodTo(readableInstant16);
        long long18 = duration4.getStandardDays();
        org.joda.time.Duration duration20 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.Period period21 = duration20.toPeriod();
        long long22 = duration20.getStandardSeconds();
        boolean boolean23 = duration4.isEqual((org.joda.time.ReadableDuration) duration20);
        long long24 = duration20.getMillis();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-60L) + "'", long22 == (-60L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-60000L) + "'", long24 == (-60000L));
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        org.joda.time.Duration duration6 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds7 = duration6.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = seconds7.getFieldType();
        org.joda.time.Seconds seconds10 = seconds7.plus(25);
        org.joda.time.Seconds seconds11 = seconds7.negated();
        org.joda.time.PeriodType periodType12 = seconds11.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter13 = periodFormatter3.withParseType(periodType12);
        boolean boolean14 = periodFormatter3.isParser();
        java.util.Locale locale15 = null;
        org.joda.time.format.PeriodFormatter periodFormatter16 = periodFormatter3.withLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod17 = org.joda.time.MutablePeriod.parse("PT-1H", periodFormatter16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(seconds7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(seconds10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(periodFormatter16);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.format.PeriodPrinter periodPrinter1 = null;
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter3.getParser();
        java.util.Locale locale5 = periodFormatter3.getLocale();
        org.joda.time.Minutes minutes6 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType7 = minutes6.getFieldType();
        org.joda.time.PeriodType periodType8 = minutes6.getPeriodType();
        org.joda.time.format.PeriodFormatter periodFormatter9 = periodFormatter3.withParseType(periodType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = org.joda.time.MutablePeriod.parse("PeriodType[Seconds]", periodFormatter9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodFormatter9);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.withHours(32);
        org.joda.time.Hours hours4 = period1.toStandardHours();
        org.joda.time.Hours hours5 = hours4.negated();
        java.lang.String str6 = hours4.toString();
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0H" + "'", str6, "PT0H");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Period period3 = period1.plusYears((int) ' ');
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Weeks weeks5 = org.joda.time.Weeks.weeksIn(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        boolean boolean8 = weeks5.isLessThan(weeks7);
        org.joda.time.Weeks weeks9 = weeks5.negated();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) weeks5, chronology10);
        boolean boolean12 = period3.equals((java.lang.Object) period11);
        org.joda.time.Period period14 = period3.plusYears(10);
        org.joda.time.Period period16 = period3.plusMonths((int) (byte) 100);
        int int17 = period3.getSeconds();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = period1.withSeconds((int) ' ');
        java.lang.String str5 = period1.toString();
        org.joda.time.Period period7 = period1.minusWeeks((int) (byte) 10);
        org.joda.time.Period period9 = period1.plusDays((int) (byte) 10);
        org.joda.time.Period period10 = period9.negated();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Period period5 = duration1.toPeriod(periodType2, chronology4);
        org.joda.time.Days days6 = org.joda.time.Days.ZERO;
        int int7 = days6.getDays();
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period12 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days13 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period12);
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        boolean boolean15 = days10.isGreaterThan(days13);
        org.joda.time.Period period17 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days18 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Days days19 = days13.minus(days18);
        org.joda.time.Days days20 = days6.minus(days13);
        boolean boolean21 = duration1.equals((java.lang.Object) days13);
        org.joda.time.Period period22 = duration1.toPeriod();
        org.joda.time.Duration duration23 = duration1.toDuration();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Period period25 = duration1.toPeriodTo(readableInstant24);
        long long26 = duration1.getMillis();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-60000L) + "'", long26 == (-60000L));
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours(8);
        org.joda.time.Minutes minutes2 = hours1.toStandardMinutes();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = minutes2.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 2147483647");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.Seconds seconds0 = org.joda.time.Seconds.ONE;
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.MAX_VALUE;
        org.joda.time.PeriodType periodType2 = seconds1.getPeriodType();
        int int3 = seconds1.getSeconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds4 = seconds0.plus(seconds1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 1 + 2147483647");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds0);
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("PT3H");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.parseSeconds("PT600S");
        int int2 = seconds1.getSeconds();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 600 + "'", int2 == 600);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableInstant0, readableInstant1);
        org.joda.time.Period period4 = period2.withHours((int) (byte) 100);
        org.joda.time.Seconds seconds5 = org.joda.time.Seconds.TWO;
        org.joda.time.Duration duration6 = seconds5.toStandardDuration();
        org.joda.time.DurationFieldType durationFieldType7 = seconds5.getFieldType();
        org.joda.time.PeriodType periodType8 = seconds5.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = period4.withPeriodType(periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 100);
        int int2 = period1.getWeeks();
        org.joda.time.Hours hours3 = org.joda.time.Hours.FOUR;
        org.joda.time.Hours hours5 = hours3.minus(0);
        org.joda.time.Hours hours6 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours8 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean9 = hours6.isGreaterThan(hours8);
        boolean boolean10 = hours5.isLessThan(hours8);
        java.lang.String str11 = hours5.toString();
        java.lang.String str12 = hours5.toString();
        org.joda.time.Hours hours14 = hours5.plus(13);
        org.joda.time.Period period15 = period1.minus((org.joda.time.ReadablePeriod) hours5);
        org.joda.time.Period period16 = period15.toPeriod();
        org.joda.time.format.PeriodPrinter periodPrinter17 = null;
        org.joda.time.format.PeriodParser periodParser18 = null;
        org.joda.time.format.PeriodFormatter periodFormatter19 = new org.joda.time.format.PeriodFormatter(periodPrinter17, periodParser18);
        org.joda.time.format.PeriodParser periodParser20 = periodFormatter19.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter21 = periodFormatter19.getPrinter();
        java.util.Locale locale22 = null;
        org.joda.time.format.PeriodFormatter periodFormatter23 = periodFormatter19.withLocale(locale22);
        java.util.Locale locale24 = null;
        org.joda.time.format.PeriodFormatter periodFormatter25 = periodFormatter23.withLocale(locale24);
        java.util.Locale locale26 = null;
        org.joda.time.format.PeriodFormatter periodFormatter27 = periodFormatter25.withLocale(locale26);
        java.util.Locale locale28 = null;
        org.joda.time.format.PeriodFormatter periodFormatter29 = periodFormatter27.withLocale(locale28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = period16.toString(periodFormatter29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(hours3);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(hours8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT4H" + "'", str11, "PT4H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT4H" + "'", str12, "PT4H");
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNull(periodParser20);
        org.junit.Assert.assertNull(periodPrinter21);
        org.junit.Assert.assertNotNull(periodFormatter23);
        org.junit.Assert.assertNotNull(periodFormatter25);
        org.junit.Assert.assertNotNull(periodFormatter27);
        org.junit.Assert.assertNotNull(periodFormatter29);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.Hours hours1 = org.joda.time.Hours.hours((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = hours1.getFieldType(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours1);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) 100);
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = duration3.toPeriod(periodType4, chronology6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType10 = periodType9.withMonthsRemoved();
        org.joda.time.Period period11 = duration3.toPeriodTo(readableInstant8, periodType10);
        org.joda.time.Period period12 = duration3.toPeriod();
        boolean boolean13 = duration1.equals((java.lang.Object) period12);
        org.joda.time.Seconds seconds15 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType16 = seconds15.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType16);
        org.joda.time.Chronology chronology18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) boolean13, periodType16, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(periodType1);
        java.lang.Class<?> wildcardClass3 = periodType1.getClass();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("Days");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Days\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration8 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds9 = duration8.toStandardSeconds();
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        boolean boolean13 = duration8.isLongerThan((org.joda.time.ReadableDuration) duration11);
        org.joda.time.Period period14 = duration8.toPeriod();
        boolean boolean15 = duration4.isLongerThan((org.joda.time.ReadableDuration) duration8);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Period period17 = duration4.toPeriodTo(readableInstant16);
        int int18 = period17.getSeconds();
        java.lang.Class<?> wildcardClass19 = period17.getClass();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(seconds9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int int7 = periodType5.indexOf(durationFieldType6);
        org.joda.time.PeriodType periodType8 = periodType5.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) '4', (long) 'a', periodType8);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.setSeconds(25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (-2147483648), (long) (short) 10, chronology2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setValue((-32), (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds(100);
        org.joda.time.Period period2 = seconds1.toPeriod();
        org.joda.time.Hours hours3 = seconds1.toStandardHours();
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(hours3);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("Millis");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Millis\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.Duration duration0 = org.joda.time.Duration.ZERO;
        long long1 = duration0.getStandardDays();
        org.joda.time.Hours hours2 = duration0.toStandardHours();
        org.joda.time.PeriodType periodType3 = hours2.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType5 = periodType3.getFieldType(60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 60");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.Days days1 = org.joda.time.Days.days(0);
        org.joda.time.Minutes minutes2 = days1.toStandardMinutes();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(minutes2);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant4, readableDuration5);
        mutablePeriod6.setHours((int) (short) 100);
        boolean boolean9 = periodType3.equals((java.lang.Object) mutablePeriod6);
        org.joda.time.Chronology chronology10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) boolean9, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        org.joda.time.Days days1 = org.joda.time.Days.ZERO;
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Days days6 = days4.minus(10);
        boolean boolean7 = days1.isGreaterThan(days4);
        org.joda.time.Days days8 = days0.minus(days1);
        org.joda.time.Days days9 = org.joda.time.Days.ZERO;
        int int10 = days9.getDays();
        org.joda.time.Period period12 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days13 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period15 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days16 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType17 = days16.getPeriodType();
        boolean boolean18 = days13.isGreaterThan(days16);
        org.joda.time.Period period20 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days21 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Days days22 = days16.minus(days21);
        org.joda.time.Days days23 = days9.minus(days16);
        org.joda.time.Period period25 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days26 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period28 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days29 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period28);
        org.joda.time.PeriodType periodType30 = days29.getPeriodType();
        boolean boolean31 = days26.isGreaterThan(days29);
        org.joda.time.Period period33 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days34 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Days days35 = days29.minus(days34);
        org.joda.time.Days days36 = days9.plus(days35);
        org.joda.time.Days days37 = days1.minus(days36);
        org.joda.time.Period period39 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days40 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Period period42 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days43 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period42);
        org.joda.time.PeriodType periodType44 = days43.getPeriodType();
        boolean boolean45 = days40.isGreaterThan(days43);
        org.joda.time.Days days47 = days40.minus(1);
        org.joda.time.Days days48 = days1.minus(days47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType50 = days1.getFieldType(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 13");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(days40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertNotNull(days48);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.Days days1 = org.joda.time.Days.ZERO;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((java.lang.Object) days1, periodType2, chronology3);
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 52, periodType2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod5.setMillis((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.util.Locale locale6 = periodFormatter2.getLocale();
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withLocale(locale7);
        java.util.Locale locale9 = periodFormatter8.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = periodFormatter8.parsePeriod("P97MT52S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.Seconds seconds1 = org.joda.time.Seconds.ZERO;
        org.joda.time.PeriodType periodType2 = seconds1.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) 100, periodType2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setMinutes((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seconds1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds3 = duration2.toStandardSeconds();
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds6 = duration5.toStandardSeconds();
        boolean boolean7 = duration2.isLongerThan((org.joda.time.ReadableDuration) duration5);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType10 = periodType9.withMinutesRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration5, readableInstant8, periodType9);
        org.joda.time.Period period12 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period14 = duration5.toPeriod(periodType13);
        org.joda.time.Period period16 = period14.withWeeks((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = period14.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(seconds6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Duration duration12 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds13 = duration12.toStandardSeconds();
        java.lang.String str14 = seconds13.toString();
        org.joda.time.PeriodType periodType15 = seconds13.getPeriodType();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.PeriodType periodType17 = periodType16.withDaysRemoved();
        org.joda.time.PeriodType periodType18 = periodType17.withWeeksRemoved();
        org.joda.time.PeriodType periodType19 = periodType17.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 2, periodType17);
        org.joda.time.Period period21 = new org.joda.time.Period(readableInstant8, readableInstant9, periodType17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = new org.joda.time.Period(4, (int) (byte) 0, 52, (int) (byte) 0, (int) '4', (int) (short) -1, 32, 25, periodType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(seconds13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT60S" + "'", str14, "PT60S");
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Minutes minutes1 = org.joda.time.Minutes.minutesIn(readableInterval0);
        org.joda.time.Hours hours2 = minutes1.toStandardHours();
        org.junit.Assert.assertNotNull(minutes1);
        org.junit.Assert.assertNotNull(hours2);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(1);
        org.joda.time.Period period3 = period1.withWeeks((int) ' ');
        org.joda.time.Period period5 = period1.withMonths(25);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("P1W");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.PeriodType periodType3 = periodFormatter2.getParseType();
        org.joda.time.format.PeriodParser periodParser4 = periodFormatter2.getParser();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) '4', chronology8);
        int int10 = mutablePeriod9.getHours();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = periodFormatter2.print((org.joda.time.ReadablePeriod) mutablePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodType3);
        org.junit.Assert.assertNull(periodParser4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = period3.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period8 = period6.normalizedStandard(periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType7);
        org.joda.time.DurationFieldType[] durationFieldTypeArray10 = mutablePeriod9.getFieldTypes();
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod9.copy();
        mutablePeriod9.add((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = mutablePeriod9.getValue(60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 60");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        java.lang.String str6 = minutes4.toString();
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 25);
        org.joda.time.Minutes minutes10 = org.joda.time.Minutes.standardMinutesIn((org.joda.time.ReadablePeriod) mutablePeriod9);
        org.joda.time.Minutes minutes12 = minutes10.minus((int) '4');
        org.joda.time.Minutes minutes13 = minutes0.plus(minutes12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = minutes13.getValue(54);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 54");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-2147483648M" + "'", str6, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(minutes10);
        org.junit.Assert.assertNotNull(minutes12);
        org.junit.Assert.assertNotNull(minutes13);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds2 = duration1.toStandardSeconds();
        org.joda.time.Duration duration4 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds5 = duration4.toStandardSeconds();
        boolean boolean6 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Period period7 = duration1.toPeriod();
        org.joda.time.Period period8 = period7.negated();
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds11 = duration10.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType12 = seconds11.getFieldType();
        org.joda.time.Seconds seconds14 = seconds11.plus(25);
        org.joda.time.Seconds seconds15 = seconds11.negated();
        org.joda.time.Seconds seconds17 = seconds11.dividedBy(10);
        org.joda.time.Period period18 = period7.plus((org.joda.time.ReadablePeriod) seconds17);
        int int19 = period18.getWeeks();
        org.joda.time.Period period21 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days22 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period21);
        org.joda.time.PeriodType periodType23 = days22.getPeriodType();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(readableInstant24, readableDuration25);
        mutablePeriod26.setHours((int) (short) 100);
        boolean boolean29 = periodType23.equals((java.lang.Object) mutablePeriod26);
        org.joda.time.Chronology chronology30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period31 = new org.joda.time.Period((java.lang.Object) int19, periodType23, chronology30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(seconds5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(seconds11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertNotNull(seconds17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology4 = null;
        mutablePeriod1.setPeriod((long) ' ', 10L, chronology4);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds8 = duration7.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType9 = seconds8.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod1.set(durationFieldType9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(durationFieldType9);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType6 = days5.getPeriodType();
        boolean boolean7 = days2.isGreaterThan(days5);
        org.joda.time.Period period9 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Days days11 = days5.minus(days10);
        int int12 = days10.getDays();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType1 = minutes0.getPeriodType();
        int int2 = minutes0.getMinutes();
        java.lang.String str3 = minutes0.toString();
        org.joda.time.Minutes minutes4 = org.joda.time.Minutes.MIN_VALUE;
        org.joda.time.DurationFieldType durationFieldType5 = minutes4.getFieldType();
        java.lang.String str6 = minutes4.toString();
        boolean boolean7 = minutes0.isLessThan(minutes4);
        org.joda.time.Minutes minutes9 = minutes4.minus(0);
        org.joda.time.Minutes minutes11 = minutes9.dividedBy(2);
        org.joda.time.Period period12 = minutes11.toPeriod();
        java.lang.String str13 = minutes11.toString();
        org.junit.Assert.assertNotNull(minutes0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0M" + "'", str3, "PT0M");
        org.junit.Assert.assertNotNull(minutes4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT-2147483648M" + "'", str6, "PT-2147483648M");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT-1073741824M" + "'", str13, "PT-1073741824M");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) weeks1, chronology6);
        org.joda.time.Weeks weeks9 = weeks1.multipliedBy((int) (byte) 1);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Weeks weeks11 = org.joda.time.Weeks.weeksIn(readableInterval10);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Weeks weeks13 = org.joda.time.Weeks.weeksIn(readableInterval12);
        boolean boolean14 = weeks11.isLessThan(weeks13);
        org.joda.time.Weeks weeks15 = weeks11.negated();
        org.joda.time.MutablePeriod mutablePeriod16 = weeks15.toMutablePeriod();
        org.joda.time.Weeks weeks17 = weeks1.minus(weeks15);
        org.joda.time.DurationFieldType durationFieldType18 = weeks15.getFieldType();
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.Weeks weeks20 = org.joda.time.Weeks.weeksIn(readableInterval19);
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.weeksIn(readableInterval21);
        boolean boolean23 = weeks20.isLessThan(weeks22);
        org.joda.time.Weeks weeks24 = weeks20.negated();
        org.joda.time.Weeks weeks26 = weeks24.minus((int) (byte) 100);
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.Weeks weeks28 = org.joda.time.Weeks.weeksIn(readableInterval27);
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.Weeks weeks30 = org.joda.time.Weeks.weeksIn(readableInterval29);
        boolean boolean31 = weeks28.isLessThan(weeks30);
        org.joda.time.Weeks weeks33 = weeks30.minus((int) (short) -1);
        org.joda.time.Weeks weeks35 = weeks33.multipliedBy(0);
        boolean boolean36 = weeks26.isGreaterThan(weeks35);
        org.joda.time.Period period41 = new org.joda.time.Period(0, (int) '4', (int) (short) 100, (int) (byte) -1);
        org.joda.time.Period period43 = period41.withDays((int) 'a');
        org.joda.time.Weeks weeks44 = period43.toStandardWeeks();
        int int45 = weeks44.getWeeks();
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.Weeks weeks47 = org.joda.time.Weeks.weeksIn(readableInterval46);
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.Weeks weeks49 = org.joda.time.Weeks.weeksIn(readableInterval48);
        boolean boolean50 = weeks47.isLessThan(weeks49);
        org.joda.time.Weeks weeks52 = weeks49.minus((int) (short) -1);
        org.joda.time.Weeks weeks53 = weeks52.negated();
        org.joda.time.Weeks weeks55 = weeks52.multipliedBy(0);
        boolean boolean56 = weeks44.isGreaterThan(weeks55);
        org.joda.time.Weeks weeks57 = weeks35.minus(weeks44);
        boolean boolean58 = weeks15.isLessThan(weeks57);
        java.lang.String str59 = weeks57.toString();
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(weeks15);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(weeks17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(weeks33);
        org.junit.Assert.assertNotNull(weeks35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(weeks44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 13 + "'", int45 == 13);
        org.junit.Assert.assertNotNull(weeks47);
        org.junit.Assert.assertNotNull(weeks49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(weeks52);
        org.junit.Assert.assertNotNull(weeks53);
        org.junit.Assert.assertNotNull(weeks55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(weeks57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "P-13W" + "'", str59, "P-13W");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Weeks weeks1 = org.joda.time.Weeks.weeksIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Weeks weeks3 = org.joda.time.Weeks.weeksIn(readableInterval2);
        boolean boolean4 = weeks1.isLessThan(weeks3);
        org.joda.time.Weeks weeks5 = weeks1.negated();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Weeks weeks7 = org.joda.time.Weeks.weeksIn(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Weeks weeks9 = org.joda.time.Weeks.weeksIn(readableInterval8);
        boolean boolean10 = weeks7.isLessThan(weeks9);
        org.joda.time.Weeks weeks11 = weeks7.negated();
        org.joda.time.Weeks weeks13 = weeks11.minus((int) (byte) 100);
        org.joda.time.Weeks weeks14 = weeks5.plus(weeks11);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.Weeks weeks16 = org.joda.time.Weeks.weeksIn(readableInterval15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.Weeks weeks18 = org.joda.time.Weeks.weeksIn(readableInterval17);
        boolean boolean19 = weeks16.isLessThan(weeks18);
        org.joda.time.Weeks weeks20 = weeks16.negated();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.Weeks weeks22 = org.joda.time.Weeks.weeksIn(readableInterval21);
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.Weeks weeks24 = org.joda.time.Weeks.weeksIn(readableInterval23);
        boolean boolean25 = weeks22.isLessThan(weeks24);
        org.joda.time.Weeks weeks26 = weeks22.negated();
        org.joda.time.Weeks weeks28 = weeks26.minus((int) (byte) 100);
        org.joda.time.Weeks weeks29 = weeks20.plus(weeks26);
        org.joda.time.DurationFieldType durationFieldType30 = weeks26.getFieldType();
        org.joda.time.Weeks weeks31 = weeks11.plus(weeks26);
        org.joda.time.Duration duration32 = weeks31.toStandardDuration();
        org.joda.time.Weeks weeks34 = weeks31.dividedBy((int) (short) 1);
        org.junit.Assert.assertNotNull(weeks1);
        org.junit.Assert.assertNotNull(weeks3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(weeks5);
        org.junit.Assert.assertNotNull(weeks7);
        org.junit.Assert.assertNotNull(weeks9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(weeks11);
        org.junit.Assert.assertNotNull(weeks13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(weeks16);
        org.junit.Assert.assertNotNull(weeks18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(weeks20);
        org.junit.Assert.assertNotNull(weeks22);
        org.junit.Assert.assertNotNull(weeks24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(weeks26);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(weeks29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(weeks34);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        java.util.Locale locale4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = periodFormatter2.withLocale(locale4);
        java.util.Locale locale6 = periodFormatter2.getLocale();
        java.util.Locale locale7 = null;
        org.joda.time.format.PeriodFormatter periodFormatter8 = periodFormatter2.withLocale(locale7);
        java.io.Writer writer9 = null;
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType13 = periodType12.withWeeksRemoved();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.Period period15 = duration11.toPeriod(periodType12, chronology14);
        org.joda.time.Period period17 = period15.withMillis(2);
        int int18 = period17.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter2.printTo(writer9, (org.joda.time.ReadablePeriod) period17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNotNull(periodFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(periodFormatter8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Duration duration2 = org.joda.time.Duration.standardMinutes((-1L));
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = duration2.toPeriod(periodType3, chronology5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType9 = periodType8.withMonthsRemoved();
        org.joda.time.Period period10 = duration2.toPeriodTo(readableInstant7, periodType9);
        org.joda.time.Minutes minutes11 = duration2.toStandardMinutes();
        java.lang.String str12 = duration2.toString();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration2);
        mutablePeriod13.addSeconds((int) (short) 100);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(minutes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT-60S" + "'", str12, "PT-60S");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period3 = org.joda.time.Period.minutes((int) (byte) 1);
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period6 = period3.withSeconds((int) ' ');
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period8 = period6.normalizedStandard(periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType7);
        org.joda.time.DurationFieldType[] durationFieldTypeArray10 = mutablePeriod9.getFieldTypes();
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod9.copy();
        mutablePeriod9.setPeriod(540000L, (long) 1);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.setWeeks(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldTypeArray10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant1, readableDuration2);
        mutablePeriod3.setHours((int) (short) 100);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration7, chronology8);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType12 = periodType11.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration7, periodType11);
        org.joda.time.Seconds seconds14 = org.joda.time.Seconds.ZERO;
        org.joda.time.Duration duration15 = seconds14.toStandardDuration();
        org.joda.time.Duration duration18 = new org.joda.time.Duration((-1L), (long) ' ');
        boolean boolean19 = duration15.isLongerThan((org.joda.time.ReadableDuration) duration18);
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration18, chronology20);
        int int22 = mutablePeriod13.getSeconds();
        mutablePeriod13.setValue((int) (byte) 0, 100);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableInstant26, readableDuration27);
        org.joda.time.Period period29 = mutablePeriod28.toPeriod();
        int int30 = period29.size();
        org.joda.time.Period period31 = period29.toPeriod();
        int int32 = period31.getYears();
        org.joda.time.Period period34 = period31.plusWeeks((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(readableInstant35, readableDuration36);
        org.joda.time.Duration duration39 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds40 = duration39.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType41 = seconds40.getFieldType();
        mutablePeriod37.add(durationFieldType41, 52);
        int int44 = period34.get(durationFieldType41);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod13.set(durationFieldType41, (-1073741824));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(seconds14);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(seconds40);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.format.PeriodPrinter periodPrinter0 = null;
        org.joda.time.format.PeriodParser periodParser1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = new org.joda.time.format.PeriodFormatter(periodPrinter0, periodParser1);
        org.joda.time.format.PeriodParser periodParser3 = periodFormatter2.getParser();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter2.getPrinter();
        java.util.Locale locale5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatter2.withLocale(locale5);
        org.joda.time.format.PeriodParser periodParser7 = periodFormatter6.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod9 = periodFormatter6.parseMutablePeriod("P3W");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(periodParser3);
        org.junit.Assert.assertNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNull(periodParser7);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.Hours hours0 = org.joda.time.Hours.FOUR;
        org.joda.time.Duration duration1 = hours0.toStandardDuration();
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period5 = org.joda.time.Period.hours((int) (short) -1);
        org.joda.time.Weeks weeks6 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod) period5);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.Period period8 = period5.normalizedStandard(periodType7);
        org.joda.time.Period period9 = new org.joda.time.Period(readableInstant2, readableInstant3, periodType7);
        org.joda.time.Chronology chronology10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object) hours0, periodType7, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(weeks6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("hours");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hours\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.Period period4 = new org.joda.time.Period(10, 0, (int) (byte) 10, (int) (byte) 10);
        org.joda.time.Minutes minutes5 = period4.toStandardMinutes();
        org.joda.time.Period period7 = period4.withHours((int) '#');
        org.joda.time.Period period9 = period7.plusSeconds((int) (byte) -1);
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds12 = duration11.toStandardSeconds();
        org.joda.time.Duration duration14 = org.joda.time.Duration.standardMinutes((long) (byte) 1);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        boolean boolean16 = duration11.isLongerThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Period period17 = duration11.toPeriod();
        org.joda.time.Period period18 = period17.negated();
        org.joda.time.Seconds seconds19 = period18.toStandardSeconds();
        org.joda.time.Period period20 = period18.negated();
        int int21 = period20.getHours();
        org.joda.time.Period period23 = period20.minusWeeks(0);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean25 = period20.isSupported(durationFieldType24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period27 = period9.withFieldAdded(durationFieldType24, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weekyears'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(minutes5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(seconds12);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(seconds19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
        org.joda.time.Hours hours2 = org.joda.time.Hours.hours((int) (byte) -1);
        boolean boolean3 = hours0.isGreaterThan(hours2);
        org.joda.time.Hours hours5 = hours0.minus((int) (byte) 0);
        org.joda.time.Hours hours7 = org.joda.time.Hours.hours((int) (byte) 0);
        boolean boolean8 = hours5.isGreaterThan(hours7);
        org.joda.time.Minutes minutes9 = org.joda.time.Minutes.ZERO;
        org.joda.time.PeriodType periodType10 = minutes9.getPeriodType();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((long) (byte) 10, (long) '#', periodType13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.weekyears();
        int int16 = period14.get(durationFieldType15);
        boolean boolean17 = periodType10.isSupported(durationFieldType15);
        org.joda.time.Chronology chronology18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object) boolean8, periodType10, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours0);
        org.junit.Assert.assertNotNull(hours2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(hours5);
        org.junit.Assert.assertNotNull(hours7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(minutes9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }
}

