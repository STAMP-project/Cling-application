import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest37 {

    public static boolean debug = false;

    @Test
    public void test18501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18501");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime16.add(readablePeriod38);
        mutableDateTime16.setMillis((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime16.dayOfYear();
        int int43 = mutableDateTime16.getSecondOfDay();
        mutableDateTime16.setMillis(0L);
        boolean boolean47 = mutableDateTime16.isAfter(18994L);
        org.joda.time.DateTime dateTime48 = mutableDateTime16.toDateTime();
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone51 = instant50.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = instant50.toMutableDateTimeISO();
        org.joda.time.Instant instant54 = instant50.plus((-2678399900L));
        org.joda.time.Interval interval57 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval60 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean61 = interval57.abuts((org.joda.time.ReadableInterval) interval60);
        long long62 = interval60.getStartMillis();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        long long67 = dateTimeZone65.nextTransition(1L);
        int int69 = dateTimeZone65.getOffset(1015936L);
        org.joda.time.Interval interval70 = new org.joda.time.Interval((long) 14, (long) 25, dateTimeZone65);
        org.joda.time.Period period71 = interval70.toPeriod();
        org.joda.time.Duration duration72 = interval70.toDuration();
        org.joda.time.Interval interval73 = interval60.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration72);
        org.joda.time.Instant instant74 = instant54.plus((org.joda.time.ReadableDuration) duration72);
        mutableDateTime16.add((org.joda.time.ReadableDuration) duration72, 2032);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertNotNull(instant74);
    }

    @Test
    public void test18502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18502");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property6 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate7 = property6.withMinimumValue();
        org.joda.time.LocalDate localDate8 = property6.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight9 = localDate8.toDateMidnight();
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.monthOfYear();
        int int11 = property10.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test18503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18503");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.minus(readablePeriod3);
        org.joda.time.DateTimeField dateTimeField6 = localDate4.getField(0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDate4.getFieldTypes();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
    }

    @Test
    public void test18504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18504");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        int[] intArray32 = chronology24.get((org.joda.time.ReadablePartial) timeOfDay27, (long) (short) -1);
        mutableDateTime17.setChronology(chronology24);
        boolean boolean34 = mutableDateTime17.isEqualNow();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime17.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfEven();
        org.joda.time.Interval interval37 = new org.joda.time.Interval(readablePeriod0, (org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.Period period38 = interval37.toPeriod();
        org.joda.time.Period period39 = interval37.toPeriod();
        org.joda.time.Period period40 = interval37.toPeriod();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period40);
    }

    @Test
    public void test18505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18505");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str3 = dateTimeZone2.toString();
        boolean boolean4 = dateTimeZone2.isFixed();
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone2);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.minusMonths((int) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay5.minusDays(11);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay5.minusYears(7);
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean18 = interval14.abuts((org.joda.time.ReadableInterval) interval17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.withWeekyear(2);
        boolean boolean24 = interval14.isBefore((org.joda.time.ReadableInstant) dateMidnight21);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Interval interval26 = interval14.withDurationAfterStart(readableDuration25);
        org.joda.time.Duration duration27 = interval14.toDuration();
        org.joda.time.Interval interval30 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean34 = interval30.abuts((org.joda.time.ReadableInterval) interval33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.withWeekyear(2);
        boolean boolean40 = interval30.isBefore((org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Interval interval42 = interval30.withDurationAfterStart(readableDuration41);
        org.joda.time.Duration duration43 = interval30.toDuration();
        int int44 = duration27.compareTo((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Period period45 = duration27.toPeriod();
        java.lang.String str46 = period45.toString();
        org.joda.time.YearMonthDay yearMonthDay47 = yearMonthDay11.minus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay11.plusMonths(32770);
        java.lang.String str50 = yearMonthDay11.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PT0S" + "'", str46, "PT0S");
        org.junit.Assert.assertNotNull(yearMonthDay47);
        org.junit.Assert.assertNotNull(yearMonthDay49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "2015-02-22" + "'", str50, "2015-02-22");
    }

    @Test
    public void test18506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18506");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.DateTime dateTime3 = timeOfDay2.toDateTimeToday();
        org.joda.time.Chronology chronology4 = timeOfDay2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.monthOfYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test18507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18507");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean13 = interval9.abuts((org.joda.time.ReadableInterval) interval12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Interval interval15 = interval12.withDurationBeforeEnd(readableDuration14);
        boolean boolean16 = interval15.isBeforeNow();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Interval interval18 = interval15.withDurationBeforeEnd(readableDuration17);
        boolean boolean20 = interval15.isBefore((long) 3);
        boolean boolean21 = interval5.contains((org.joda.time.ReadableInterval) interval15);
        org.joda.time.DateTime dateTime22 = interval5.getEnd();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test18508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18508");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.weekOfWeekyear();
        java.lang.String str8 = property7.getAsString();
        java.util.Locale locale9 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale10 = locale9.stripExtensions();
        int int11 = property7.getMaximumTextLength(locale9);
        org.joda.time.DateMidnight dateMidnight13 = property7.addToCopy(1904);
        org.joda.time.DateMidnight dateMidnight14 = property7.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight15 = property7.roundFloorCopy();
        org.joda.time.YearMonthDay yearMonthDay16 = dateMidnight15.toYearMonthDay();
        java.lang.Object obj17 = null;
        org.joda.time.Instant instant18 = new org.joda.time.Instant(obj17);
        org.joda.time.Instant instant20 = instant18.minus((long) 0);
        boolean boolean21 = dateMidnight15.isBefore((org.joda.time.ReadableInstant) instant20);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test18509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18509");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime3 = property2.roundFloorCopy();
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.dayOfMonth();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology11);
        int int17 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.LocalTime localTime19 = localTime16.minusSeconds((int) 'x');
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        org.joda.time.Chronology chronology27 = instant25.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.year();
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromMillisOfDay((long) (-1959), chronology27);
        boolean boolean30 = localTime19.isBefore((org.joda.time.ReadablePartial) localTime29);
        int int31 = localTime29.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = localTime29.toString("property[millisofsecond]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: p");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 41 + "'", int31 == 41);
    }

    @Test
    public void test18510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18510");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.weekyear();
        org.joda.time.DateMidnight dateMidnight9 = property8.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight11 = property8.addWrapFieldToCopy((int) (byte) 100);
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean18 = interval14.abuts((org.joda.time.ReadableInterval) interval17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Interval interval20 = interval17.withDurationBeforeEnd(readableDuration19);
        boolean boolean21 = interval20.isBeforeNow();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = interval20.toPeriod(periodType22);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight11.plus((org.joda.time.ReadablePeriod) period23);
        int int25 = dateMidnight24.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight24.withYearOfCentury(18);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateMidnight27);
    }

    @Test
    public void test18511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18511");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.secondOfMinute();
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 23, chronology15, locale18, (java.lang.Integer) 31, (int) (byte) 10);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.withDurationAdded(readableDuration26, (int) (byte) 0);
        org.joda.time.DateTime dateTime30 = dateTime25.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime32 = dateTime30.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime34 = dateTime30.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property35 = dateTime30.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str39 = dateTimeZone38.toString();
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight43.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone48 = dateMidnight43.getZone();
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant54 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime55 = timeOfDay52.toDateTime((org.joda.time.ReadableInstant) instant54);
        org.joda.time.Chronology chronology56 = instant54.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.clockhourOfHalfday();
        long long59 = dateTimeField57.roundHalfFloor(0L);
        java.util.Locale locale60 = java.util.Locale.TRADITIONAL_CHINESE;
        int int61 = dateTimeField57.getMaximumShortTextLength(locale60);
        java.util.Locale locale62 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale63 = locale62.stripExtensions();
        java.util.Locale locale64 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale65 = locale64.stripExtensions();
        java.lang.String str66 = locale62.getDisplayName(locale64);
        java.lang.String str67 = locale60.getDisplayLanguage(locale62);
        java.lang.String str68 = dateTimeZone48.getName((long) 'x', locale62);
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime(dateTimeZone48);
        java.util.TimeZone timeZone70 = dateTimeZone48.toTimeZone();
        boolean boolean71 = dateTimeZone48.isFixed();
        long long73 = dateTimeZone38.getMillisKeepLocal(dateTimeZone48, 0L);
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight((java.lang.Object) dateTime30, dateTimeZone38);
        org.joda.time.Chronology chronology75 = chronology15.withZone(dateTimeZone38);
        org.joda.time.TimeOfDay timeOfDay76 = timeOfDay2.withChronologyRetainFields(chronology75);
        org.joda.time.DateTimeField dateTimeField77 = chronology75.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long85 = chronology75.getDateTimeMillis(53956, 39600, 54034, 264, 53966, 2054, 69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 264 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+10:00" + "'", str39, "+10:00");
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str66, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\u4e2d\u6587" + "'", str67, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "+00:00" + "'", str68, "+00:00");
        org.junit.Assert.assertNotNull(timeZone70);
        org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 36000000L + "'", long73 == 36000000L);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(timeOfDay76);
        org.junit.Assert.assertNotNull(dateTimeField77);
    }

    @Test
    public void test18512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18512");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.withDurationAdded(readableDuration5, (int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusDays(2);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMillis((int) (short) 0);
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear(35);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime15.getZone();
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((-61943443200000L), dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test18513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18513");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 46);
        org.joda.time.DateMidnight dateMidnight2 = dateTime1.toDateMidnight();
        org.junit.Assert.assertNotNull(dateMidnight2);
    }

    @Test
    public void test18514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18514");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.withPeriodAdded(readablePeriod11, (int) (short) 0);
        int int14 = property3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime15 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) dateTime10);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.DateTime dateTime20 = dateTime16.withYear(31);
        org.joda.time.DateTime.Property property21 = dateTime16.millisOfDay();
        org.joda.time.DateTime.Property property22 = dateTime16.yearOfEra();
        org.joda.time.DateTime dateTime23 = property22.roundHalfCeilingCopy();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0L, chronology32);
        org.joda.time.DateTimeField dateTimeField37 = chronology32.secondOfMinute();
        org.joda.time.DateTime dateTime38 = dateTime23.withChronology(chronology32);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test18515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18515");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        java.util.Locale locale19 = new java.util.Locale("zh");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology8, locale19, (java.lang.Integer) (-292275054));
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        org.joda.time.Chronology chronology29 = instant27.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.clockhourOfHalfday();
        org.joda.time.DurationField durationField31 = chronology29.eras();
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType22.getField(chronology29);
        java.util.Locale locale34 = null;
        dateTimeParserBucket21.saveField(dateTimeFieldType22, "\u516c\u5143", locale34);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone39 = instant38.getZone();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone39);
        java.util.TimeZone timeZone41 = dateTimeZone39.toTimeZone();
        java.lang.String str42 = dateTimeZone39.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone39);
        dateTimeParserBucket21.setZone(dateTimeZone39);
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime50 = timeOfDay47.toDateTime((org.joda.time.ReadableInstant) instant49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.DateTime dateTime53 = dateTime50.withPeriodAdded(readablePeriod51, (int) (short) 0);
        org.joda.time.DateTime dateTime55 = dateTime53.withDayOfYear((int) (short) 10);
        org.joda.time.DateTime dateTime56 = dateTime55.withEarlierOffsetAtOverlap();
        int int57 = dateTimeZone39.getOffset((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTime.Property property58 = dateTime55.millisOfSecond();
        int int59 = property58.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 999 + "'", int59 == 999);
    }

    @Test
    public void test18516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18516");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.setMillisOfSecond((int) (byte) 0);
        mutableDateTime16.setHourOfDay(5);
        mutableDateTime16.addWeekyears((-1));
        int int42 = mutableDateTime16.getYear();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime44 = property43.roundCeiling();
        mutableDateTime44.addHours(1645455555);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone50 = instant49.getZone();
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.weekOfWeekyear();
        org.joda.time.Instant instant54 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone55 = instant54.getZone();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(dateTimeZone55);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTime dateTime59 = dateTime56.withDurationAdded(readableDuration57, (int) (byte) 0);
        org.joda.time.DateTime dateTime61 = dateTime56.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.DateTime dateTime63 = dateTime56.minus(readableDuration62);
        org.joda.time.DateTime dateTime65 = dateTime56.minusSeconds((int) (byte) 100);
        int int66 = mutableDateTime51.compareTo((org.joda.time.ReadableInstant) dateTime65);
        mutableDateTime44.setTime((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.TimeOfDay timeOfDay68 = dateTime65.toTimeOfDay();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1969 + "'", int42 == 1969);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(timeOfDay68);
    }

    @Test
    public void test18517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18517");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-3600000L));
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        mutableDateTime2.setZoneRetainFields(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime2);
    }

    @Test
    public void test18518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18518");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.plus((long) 4);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.dayOfYear();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean13 = localDate11.isSupported(dateTimeFieldType12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = localDate11.toDateMidnight(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((long) 100);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight15.plusMonths(8);
        org.joda.time.DateMidnight.Property property20 = dateMidnight15.centuryOfEra();
        org.joda.time.DateMidnight.Property property21 = dateMidnight15.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay22 = dateMidnight15.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay22.withYear(54138489);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay24.plusDays(352);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = property10.compareTo((org.joda.time.ReadablePartial) yearMonthDay24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
    }

    @Test
    public void test18519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18519");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.withPeriodAdded(readablePeriod11, (int) (short) 0);
        int int14 = property3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime15 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property16 = dateTime15.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.clockhourOfHalfday();
        long long26 = dateTimeField24.roundHalfFloor(0L);
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        int int28 = dateTimeField24.getMaximumShortTextLength(locale27);
        java.lang.String str29 = locale27.getLanguage();
        java.lang.String str30 = locale27.getLanguage();
        java.util.Calendar calendar31 = dateTime15.toCalendar(locale27);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = calendar31.get(476);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 476");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh" + "'", str29, "zh");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh" + "'", str30, "zh");
        org.junit.Assert.assertNotNull(calendar31);
        org.junit.Assert.assertEquals(calendar31.toString(), "java.util.GregorianCalendar[time=-86340000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=1,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test18520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18520");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        mutableDateTime16.addMillis(1904);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime16.add(readablePeriod20, 53891);
        mutableDateTime16.setSecondOfMinute(32);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray28 = timeOfDay27.getValues();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) instant33);
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay31.minusMinutes((int) '4');
        int int37 = timeOfDay27.compareTo((org.joda.time.ReadablePartial) timeOfDay31);
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) instant42);
        org.joda.time.Chronology chronology44 = instant42.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.clockhourOfHalfday();
        org.joda.time.DurationField durationField46 = chronology44.eras();
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay27.withChronologyRetainFields(chronology44);
        org.joda.time.LocalTime localTime49 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property50 = localTime49.hourOfDay();
        org.joda.time.LocalTime localTime52 = property50.addCopy(21);
        org.joda.time.LocalTime localTime53 = property50.roundFloorCopy();
        org.joda.time.LocalTime localTime55 = localTime53.minusHours(29);
        long long57 = chronology44.set((org.joda.time.ReadablePartial) localTime53, 592888L);
        org.joda.time.DateTimeField dateTimeField58 = chronology44.minuteOfHour();
        org.joda.time.DateTime dateTime59 = mutableDateTime16.toDateTime(chronology44);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTime59);
    }

    @Test
    public void test18521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18521");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        long long10 = dateTimeField8.roundHalfFloor(0L);
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        int int12 = dateTimeField8.getMaximumShortTextLength(locale11);
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale13.getDisplayName(locale15);
        java.lang.String str18 = locale11.getDisplayLanguage(locale13);
        java.lang.String str19 = locale11.getDisplayLanguage();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight22.withDurationAdded((long) 2, 100);
        int int26 = dateMidnight25.getDayOfMonth();
        java.util.GregorianCalendar gregorianCalendar27 = dateMidnight25.toGregorianCalendar();
        gregorianCalendar27.setTimeInMillis(14L);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        org.joda.time.Chronology chronology39 = instant37.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.clockhourOfHalfday();
        org.joda.time.DurationField durationField41 = chronology39.eras();
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType32.getField(chronology39);
        long long45 = dateTimeField42.add((long) (short) 100, (long) (byte) -1);
        boolean boolean46 = dateTimeField42.isSupported();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime53 = timeOfDay50.toDateTime((org.joda.time.ReadableInstant) instant52);
        org.joda.time.Chronology chronology54 = instant52.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.clockhourOfHalfday();
        long long57 = dateTimeField55.roundHalfFloor(0L);
        java.util.Locale locale58 = java.util.Locale.TRADITIONAL_CHINESE;
        int int59 = dateTimeField55.getMaximumShortTextLength(locale58);
        java.lang.String str60 = locale58.getLanguage();
        java.util.Locale locale61 = locale58.stripExtensions();
        java.lang.String str62 = dateTimeField42.getAsShortText((long) 10, locale58);
        java.util.Map<java.lang.String, java.lang.Integer> strMap63 = gregorianCalendar27.getDisplayNames(11, (int) (byte) 0, locale58);
        java.lang.String str64 = locale11.getDisplayScript(locale58);
        java.lang.String str67 = nameProvider0.getName(locale11, "DurationField[minutes]", "TW");
        java.util.Locale.Builder builder68 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder69 = builder68.clearExtensions();
        org.joda.time.TimeOfDay timeOfDay72 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant74 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime75 = timeOfDay72.toDateTime((org.joda.time.ReadableInstant) instant74);
        org.joda.time.Chronology chronology76 = instant74.getChronology();
        org.joda.time.DateTimeField dateTimeField77 = chronology76.clockhourOfHalfday();
        long long79 = dateTimeField77.roundHalfFloor(0L);
        java.util.Locale locale80 = java.util.Locale.TRADITIONAL_CHINESE;
        int int81 = dateTimeField77.getMaximumShortTextLength(locale80);
        java.util.Locale locale82 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale83 = locale82.stripExtensions();
        java.util.Locale locale84 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale85 = locale84.stripExtensions();
        java.lang.String str86 = locale82.getDisplayName(locale84);
        java.lang.String str87 = locale80.getDisplayLanguage(locale82);
        java.util.Locale.Builder builder88 = builder69.setLocale(locale82);
        java.util.Locale.Builder builder89 = builder88.clear();
        java.util.Locale.Builder builder90 = builder89.clear();
        java.util.Locale locale91 = builder90.build();
        java.lang.String str94 = nameProvider0.getName(locale91, "9906-08-27", "2028-04-15T17:16:00.000Z");
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str17, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587" + "'", str18, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinese" + "'", str19, "Chinese");
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(gregorianCalendar27);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-2678399900L) + "'", long45 == (-2678399900L));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "zh" + "'", str60, "zh");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\u4e00\u6708" + "'", str62, "\u4e00\u6708");
        org.junit.Assert.assertNull(strMap63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str86, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "\u4e2d\u6587" + "'", str87, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "");
        org.junit.Assert.assertNull(str94);
    }

    @Test
    public void test18522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18522");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(60000L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test18523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18523");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone4);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.minuteOfHour();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.dayOfYear();
        mutableDateTime7.addDays(54005493);
        mutableDateTime7.addHours(53967327);
        mutableDateTime7.addYears(54288524);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight18.withWeekyear(2);
        org.joda.time.DateMidnight.Property property23 = dateMidnight18.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight18.withYearOfCentury(1);
        int int26 = dateMidnight25.getMinuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight25.plus(readablePeriod27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight25.plusYears(10);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean33 = localDate31.isSupported(dateTimeFieldType32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = localDate31.toDateMidnight(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = localDate31.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property37 = localDate31.yearOfEra();
        org.joda.time.LocalDate.Property property38 = localDate31.year();
        org.joda.time.LocalDate.Property property39 = localDate31.dayOfMonth();
        java.util.Date date43 = new java.util.Date(0, (int) '4', 0);
        int int44 = date43.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay45 = org.joda.time.YearMonthDay.fromDateFields(date43);
        int int46 = yearMonthDay45.getYear();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay45.minus(readablePeriod47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.YearMonthDay yearMonthDay51 = yearMonthDay45.withPeriodAdded(readablePeriod49, 2022);
        int int52 = localDate31.compareTo((org.joda.time.ReadablePartial) yearMonthDay51);
        org.joda.time.YearMonthDay yearMonthDay54 = yearMonthDay51.withMonthOfYear(6);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight25.withFields((org.joda.time.ReadablePartial) yearMonthDay51);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.minusDays((int) '#');
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight57.withCenturyOfEra(0);
        int int60 = dateMidnight57.getMinuteOfDay();
        int int61 = dateMidnight57.getDayOfMonth();
        boolean boolean62 = mutableDateTime7.isAfter((org.joda.time.ReadableInstant) dateMidnight57);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertEquals(date43.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1904 + "'", int46 == 1904);
        org.junit.Assert.assertNotNull(yearMonthDay48);
        org.junit.Assert.assertNotNull(yearMonthDay51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay54);
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertNotNull(dateMidnight57);
        org.junit.Assert.assertNotNull(dateMidnight59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 26 + "'", int61 == 26);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test18524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18524");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusMonths(70);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight7.withDurationAdded((-2678399965L), (int) ' ');
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Calendar calendar15 = dateMidnight7.toCalendar(locale13);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str20 = dateTimeZone19.toString();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateMidnight7.toDateTime(dateTimeZone19);
        org.joda.time.DateMidnight.Property property23 = dateMidnight7.centuryOfEra();
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=-60480000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1968,MONTH=1,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test18525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18525");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.joda.time.LocalDate localDate3 = localDate0.withWeekyear((-1));
        int int4 = localDate0.getYearOfCentury();
        org.joda.time.LocalDate.Property property5 = localDate0.weekOfWeekyear();
        org.joda.time.LocalDate localDate7 = localDate0.plusYears((int) (byte) -1);
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.LocalDate.Property property9 = localDate7.year();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.LocalDate localDate12 = localDate10.plusWeeks(54435537);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test18526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18526");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        java.time.Instant instant6 = date3.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) date3);
        org.joda.time.DateTimeField dateTimeField8 = mutableDateTime7.getRoundingField();
        mutableDateTime7.add(4460347660L);
        mutableDateTime7.addMinutes(53968797);
        java.util.Date date13 = mutableDateTime7.toDate();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date13);
        org.joda.time.LocalDate.Property property15 = localDate14.monthOfYear();
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNull(dateTimeField8);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Mon Jan 29 22:56:07 UTC 2007");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test18527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18527");
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Chronology chronology10 = instant8.getChronology();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.year();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.weekyearOfCentury();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(53897496L, chronology10);
        org.joda.time.Interval interval16 = new org.joda.time.Interval((long) 54451167, 54934635L, chronology10);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test18528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18528");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) ' ');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = localDate2.toDateMidnight(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localDate2.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property8 = localDate2.yearOfEra();
        org.joda.time.LocalDate.Property property9 = localDate2.weekyear();
        boolean boolean10 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate2);
        org.joda.time.DateTime dateTime11 = localDate2.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology12 = localDate2.getChronology();
        org.joda.time.LocalDate.Property property13 = localDate2.dayOfWeek();
        boolean boolean15 = localDate2.equals((java.lang.Object) "2022-02-17T14:58:58.472Z/2022-02-17T14:58:58.472Z");
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18529");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.setMillisOfSecond((int) (byte) 0);
        mutableDateTime16.setHourOfDay(5);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone42 = instant41.getZone();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight45.withWeekyear(2);
        org.joda.time.DateTimeZone dateTimeZone50 = dateMidnight45.getZone();
        long long52 = dateTimeZone42.getMillisKeepLocal(dateTimeZone50, 10L);
        org.joda.time.LocalTime localTime53 = org.joda.time.LocalTime.now(dateTimeZone50);
        mutableDateTime16.setZone(dateTimeZone50);
        int int56 = dateTimeZone50.getStandardOffset(0L);
        java.lang.String str58 = dateTimeZone50.getNameKey((long) (-11491200));
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.Interval interval62 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval65 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean66 = interval62.abuts((org.joda.time.ReadableInterval) interval65);
        org.joda.time.Interval interval69 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval72 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean73 = interval69.abuts((org.joda.time.ReadableInterval) interval72);
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.Interval interval75 = interval72.withDurationBeforeEnd(readableDuration74);
        boolean boolean76 = interval75.isBeforeNow();
        org.joda.time.ReadableDuration readableDuration77 = null;
        org.joda.time.Interval interval78 = interval75.withDurationBeforeEnd(readableDuration77);
        boolean boolean80 = interval75.isBefore((long) 3);
        boolean boolean81 = interval65.contains((org.joda.time.ReadableInterval) interval75);
        org.joda.time.Chronology chronology82 = interval75.getChronology();
        org.joda.time.TimeOfDay timeOfDay83 = new org.joda.time.TimeOfDay(chronology82);
        org.joda.time.DateTime dateTime84 = dateTime59.withChronology(chronology82);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(dateMidnight49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 10L + "'", long52 == 10L);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "UTC" + "'", str58, "UTC");
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(interval78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertNotNull(dateTime84);
    }

    @Test
    public void test18530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18530");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        long long14 = dateTimeField12.roundHalfFloor(0L);
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        int int16 = dateTimeField12.getMaximumShortTextLength(locale15);
        java.lang.String str17 = locale15.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology4, locale15);
        java.util.Locale locale19 = dateTimeParserBucket18.getLocale();
        long long22 = dateTimeParserBucket18.computeMillis(true, "");
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime37 = timeOfDay34.toDateTime((org.joda.time.ReadableInstant) instant36);
        int[] intArray39 = chronology31.get((org.joda.time.ReadablePartial) timeOfDay34, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(0L, chronology31);
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        org.joda.time.Chronology chronology47 = instant45.getChronology();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime53 = timeOfDay50.toDateTime((org.joda.time.ReadableInstant) instant52);
        int[] intArray55 = chronology47.get((org.joda.time.ReadablePartial) timeOfDay50, (long) (short) -1);
        mutableDateTime40.setChronology(chronology47);
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType23.getField(chronology47);
        java.util.Locale locale59 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale60 = locale59.stripExtensions();
        dateTimeParserBucket18.saveField(dateTimeFieldType23, "hi!", locale60);
        java.lang.String str62 = locale60.getLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter2.withLocale(locale60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter2.withPivotYear((int) 'a');
        java.lang.Integer int68 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = dateTimeFormatter2.withPivotYear((-2735));
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "zh" + "'", str62, "zh");
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNull(int68);
        org.junit.Assert.assertNotNull(dateTimeFormatter70);
    }

    @Test
    public void test18531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18531");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology7.getZone();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(chronology7);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 32772, chronology7);
        org.joda.time.DateTimeField dateTimeField14 = chronology7.hourOfHalfday();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test18532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18532");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(chronology23);
        org.joda.time.LocalTime.Property property34 = localTime33.millisOfSecond();
        org.joda.time.LocalTime localTime35 = property34.roundFloorCopy();
        org.joda.time.LocalTime localTime36 = property34.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime38 = property34.addCopy(34);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
    }

    @Test
    public void test18533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18533");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DurationField durationField18 = chronology8.weeks();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((-86340000L), chronology8);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.DateTimeField dateTimeField21 = chronology8.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test18534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18534");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withPeriodAdded(readablePeriod6, (int) (short) 0);
        org.joda.time.DateTime.Property property9 = dateTime5.hourOfDay();
        org.joda.time.LocalTime localTime10 = dateTime5.toLocalTime();
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfWeek();
        java.lang.String str13 = chronology11.toString();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = chronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = chronology11.era();
        java.lang.String str18 = chronology11.toString();
        java.lang.String str19 = chronology11.toString();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[UTC]" + "'", str13, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[UTC]" + "'", str18, "ISOChronology[UTC]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ISOChronology[UTC]" + "'", str19, "ISOChronology[UTC]");
    }

    @Test
    public void test18535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18535");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.DurationField durationField17 = chronology7.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology7.monthOfYear();
        org.joda.time.DurationField durationField19 = chronology7.months();
        org.joda.time.DateTimeField dateTimeField20 = chronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = chronology7.weekyear();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        org.joda.time.Chronology chronology29 = instant27.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        int[] intArray37 = chronology29.get((org.joda.time.ReadablePartial) timeOfDay32, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(0L, chronology29);
        int int39 = mutableDateTime38.getEra();
        int int40 = mutableDateTime38.getWeekyear();
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant46 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime47 = timeOfDay44.toDateTime((org.joda.time.ReadableInstant) instant46);
        org.joda.time.Chronology chronology48 = instant46.getChronology();
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant53);
        int[] intArray56 = chronology48.get((org.joda.time.ReadablePartial) timeOfDay51, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(0L, chronology48);
        mutableDateTime57.setYear(3);
        org.joda.time.Instant instant61 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone62 = instant61.getZone();
        mutableDateTime57.setZone(dateTimeZone62);
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight(dateTimeZone62);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(dateTimeZone62);
        mutableDateTime38.setZone(dateTimeZone62);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate((java.lang.Object) chronology7, dateTimeZone62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone62);
    }

    @Test
    public void test18536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18536");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    }

    @Test
    public void test18537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18537");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.TimeOfDay timeOfDay13 = dateTime12.toTimeOfDay();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.plus(readablePeriod14);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = instant17.toMutableDateTimeISO();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property23 = timeOfDay22.minuteOfHour();
        java.lang.String str24 = property23.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.withPeriodAdded(readablePeriod31, (int) (short) 0);
        int int34 = property23.compareTo((org.joda.time.ReadableInstant) dateTime30);
        boolean boolean35 = mutableDateTime19.isBefore((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant40 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime41 = timeOfDay38.toDateTime((org.joda.time.ReadableInstant) instant40);
        org.joda.time.Chronology chronology42 = instant40.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.millis();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.monthOfYear();
        mutableDateTime19.setChronology(chronology42);
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay13.withChronologyRetainFields(chronology42);
        int[] intArray47 = timeOfDay13.getValues();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray48 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay13.plusMillis(1835);
        int int51 = timeOfDay50.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(intArray47);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[15, 17, 44, 538]");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray48);
        org.junit.Assert.assertNotNull(timeOfDay50);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 373 + "'", int51 == 373);
    }

    @Test
    public void test18538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18538");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField33 = chronology23.dayOfWeek();
        long long36 = dateTimeField33.add((long) 69, 10);
        java.lang.String str38 = dateTimeField33.getAsShortText((long) 9);
        long long41 = dateTimeField33.add(1645455676153L, (long) 32770);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 864000069L + "'", long36 == 864000069L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Thu" + "'", str38, "Thu");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 4476783676153L + "'", long41 == 4476783676153L);
    }

    @Test
    public void test18539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18539");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((int) (short) 0, 0);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.plusMillis((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay2.minusSeconds(54239440);
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.withPeriodAdded(readablePeriod14, (int) (short) 0);
        org.joda.time.DateTime.Property property17 = dateTime13.weekOfWeekyear();
        org.joda.time.DateTime dateTime19 = dateTime13.minusSeconds(21);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean26 = interval22.abuts((org.joda.time.ReadableInterval) interval25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Interval interval28 = interval25.withDurationBeforeEnd(readableDuration27);
        org.joda.time.Interval interval29 = interval25.toInterval();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.minutes();
        org.joda.time.Interval interval38 = interval25.withChronology(chronology36);
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(chronology36);
        org.joda.time.DateTime dateTime40 = dateTime19.withChronology(chronology36);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 851, chronology36);
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay2.withChronologyRetainFields(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(timeOfDay42);
    }

    @Test
    public void test18540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18540");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((int) (short) 0, 0);
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime6 = localTime4.minusMinutes((int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.seconds();
        boolean boolean8 = localTime4.isSupported(durationFieldType7);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay2.withFieldAdded(durationFieldType7, 39);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay2.minusSeconds(70);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay2.withMillisOfSecond(24);
        java.lang.String str15 = timeOfDay14.toString();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "T00:00:00.024" + "'", str15, "T00:00:00.024");
    }

    @Test
    public void test18541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18541");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        java.time.Instant instant6 = date3.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) date3);
        org.joda.time.DateTimeField dateTimeField8 = mutableDateTime7.getRoundingField();
        mutableDateTime7.add(4460347660L);
        mutableDateTime7.setMillis((long) 56154);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNull(dateTimeField8);
    }

    @Test
    public void test18542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18542");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property6 = localDate0.yearOfEra();
        org.joda.time.LocalDate.Property property7 = localDate0.year();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        java.util.Date date9 = localDate8.toDate();
        org.joda.time.LocalDate.Property property10 = localDate8.dayOfMonth();
        org.joda.time.LocalDate localDate11 = property10.getLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = property10.setCopy("java.util.GregorianCalendar[time=-60089040001904,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=65,MONTH=10,WEEK_OF_YEAR=45,WEEK_OF_MONTH=2,DAY_OF_MONTH=9,DAY_OF_YEAR=313,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=?,HOUR_OF_DAY=23,MINUTE=59,SECOND=58,MILLISECOND=96,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"java.util.GregorianCalendar[time=-60089040001904,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=65,MONTH=10,WEEK_OF_YEAR=45,WEEK_OF_MONTH=2,DAY_OF_MONTH=9,DAY_OF_YEAR=313,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=?,HOUR_OF_DAY=23,MINUTE=59,SECOND=58,MILLISECOND=96,ZONE_OFFSET=0,DST_OFFSET=0]\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 01 00:00:00 UTC 2023");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test18543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18543");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        int int6 = yearMonthDay5.getYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay5.minus(readablePeriod7);
        org.joda.time.Chronology chronology9 = yearMonthDay5.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekOfWeekyear();
        long long12 = dateTimeField10.roundHalfCeiling((long) 13);
        int int14 = dateTimeField10.get((long) 54139);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1904 + "'", int6 == 1904);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-259200000L) + "'", long12 == (-259200000L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test18544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18544");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZone(dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTimeFormatter4.parseDateTime("Property[minuteOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test18545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18545");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean13 = interval9.abuts((org.joda.time.ReadableInterval) interval12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Interval interval15 = interval12.withDurationBeforeEnd(readableDuration14);
        boolean boolean16 = interval15.isBeforeNow();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Interval interval18 = interval15.withDurationBeforeEnd(readableDuration17);
        boolean boolean20 = interval15.isBefore((long) 3);
        boolean boolean21 = interval5.contains((org.joda.time.ReadableInterval) interval15);
        org.joda.time.Chronology chronology22 = interval15.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(chronology22);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str29 = dateTimeZone28.toString();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(1645455552947L, dateTimeZone28);
        org.joda.time.DateTime dateTime33 = timeOfDay23.toDateTimeToday(dateTimeZone28);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.ReadablePartial readablePartial35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = localTime34.compareTo(readablePartial35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+10:00" + "'", str29, "+10:00");
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test18546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18546");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight2.minusMonths((-1));
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.minus(readablePeriod8);
        int int10 = dateMidnight9.getWeekyear();
        org.joda.time.DateMidnight.Property property11 = dateMidnight9.centuryOfEra();
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test18547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18547");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy(1L);
        org.joda.time.LocalDateTime localDateTime7 = property3.addWrapFieldToCopy(54342246);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test18548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18548");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguageTag("clockhourOfDay");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: clockhourOfDay [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18549");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1969-01-02T05:00:00.000Z");
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.weekOfWeekyear();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.withDurationAdded(readableDuration12, (int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime11.minusSeconds((int) (short) 1);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime11.minus(readableDuration17);
        org.joda.time.DateTime dateTime20 = dateTime11.minusSeconds((int) (byte) 100);
        int int21 = mutableDateTime6.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Chronology chronology22 = dateTime20.getChronology();
        int int23 = dateTime20.getWeekyear();
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime25 = dateMidnight24.toMutableDateTimeISO();
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.yearOfCentury();
        int int31 = localDateTime27.getDayOfYear();
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime27.withFieldAdded(durationFieldType32, 23);
        org.joda.time.LocalDateTime.Property property35 = localDateTime27.millisOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime27.withCenturyOfEra((int) 'a');
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean44 = interval40.abuts((org.joda.time.ReadableInterval) interval43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.withWeekyear(2);
        boolean boolean50 = interval40.isBefore((org.joda.time.ReadableInstant) dateMidnight47);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Interval interval52 = interval40.withDurationAfterStart(readableDuration51);
        org.joda.time.Duration duration53 = interval40.toDuration();
        org.joda.time.Interval interval56 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval59 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean60 = interval56.abuts((org.joda.time.ReadableInterval) interval59);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone62);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight63.withWeekyear(2);
        boolean boolean66 = interval56.isBefore((org.joda.time.ReadableInstant) dateMidnight63);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.Interval interval68 = interval56.withDurationAfterStart(readableDuration67);
        org.joda.time.Duration duration69 = interval56.toDuration();
        org.joda.time.Interval interval72 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval75 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean76 = interval72.abuts((org.joda.time.ReadableInterval) interval75);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.DateMidnight dateMidnight79 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone78);
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight79.withWeekyear(2);
        boolean boolean82 = interval72.isBefore((org.joda.time.ReadableInstant) dateMidnight79);
        org.joda.time.ReadableDuration readableDuration83 = null;
        org.joda.time.Interval interval84 = interval72.withDurationAfterStart(readableDuration83);
        org.joda.time.Duration duration85 = interval72.toDuration();
        int int86 = duration69.compareTo((org.joda.time.ReadableDuration) duration85);
        org.joda.time.Period period87 = duration69.toPeriod();
        boolean boolean88 = duration53.isShorterThan((org.joda.time.ReadableDuration) duration69);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime37.withDurationAdded((org.joda.time.ReadableDuration) duration69, 0);
        org.joda.time.Instant instant92 = instant26.withDurationAdded((org.joda.time.ReadableDuration) duration69, (-27424263));
        org.joda.time.DateTime dateTime94 = dateTime20.withDurationAdded((org.joda.time.ReadableDuration) duration69, 57);
        org.joda.time.Instant instant95 = instant1.plus((org.joda.time.ReadableDuration) duration69);
        org.joda.time.Instant instant97 = instant1.minus(1645455603769L);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateMidnight49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(dateMidnight65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(dateMidnight81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(interval84);
        org.junit.Assert.assertNotNull(duration85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(localDateTime90);
        org.junit.Assert.assertNotNull(instant92);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertNotNull(instant95);
        org.junit.Assert.assertNotNull(instant97);
    }

    @Test
    public void test18550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18550");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        int int2 = localDateTime0.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.weekyear();
        org.joda.time.LocalDateTime localDateTime4 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYearOfEra((int) (byte) 1);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean13 = interval9.abuts((org.joda.time.ReadableInterval) interval12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.withWeekyear(2);
        boolean boolean19 = interval9.isBefore((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Interval interval21 = interval9.withDurationAfterStart(readableDuration20);
        org.joda.time.Duration duration22 = interval9.toDuration();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval28 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean29 = interval25.abuts((org.joda.time.ReadableInterval) interval28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.withWeekyear(2);
        boolean boolean35 = interval25.isBefore((org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Interval interval37 = interval25.withDurationAfterStart(readableDuration36);
        org.joda.time.Duration duration38 = interval25.toDuration();
        int int39 = duration22.compareTo((org.joda.time.ReadableDuration) duration38);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime4.minus((org.joda.time.ReadableDuration) duration22);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime4.minusDays(365);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.centuryOfEra();
        int int44 = localDateTime42.getHourOfDay();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 15 + "'", int44 == 15);
    }

    @Test
    public void test18551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18551");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        int[] intArray3 = timeOfDay2.getValues();
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTime((org.joda.time.ReadableInstant) instant8);
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay6.minusMinutes((int) '4');
        int int12 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay2.minusMinutes((int) '#');
        org.joda.time.DateTime dateTime15 = timeOfDay14.toDateTimeToday();
        int int16 = timeOfDay14.getMillisOfSecond();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 0, 0]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test18552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18552");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.DateTime dateTime14 = dateTime10.withHourOfDay(10);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime();
        int int16 = mutableDateTime15.getMonthOfYear();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.withDurationAdded(readableDuration23, (int) (short) 1);
        int int26 = dateTime22.getDayOfYear();
        int int27 = dateTime22.getDayOfMonth();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        org.joda.time.Chronology chronology36 = instant34.getChronology();
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant41 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime42 = timeOfDay39.toDateTime((org.joda.time.ReadableInstant) instant41);
        int[] intArray44 = chronology36.get((org.joda.time.ReadablePartial) timeOfDay39, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, chronology36);
        mutableDateTime45.setYear(3);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone50 = instant49.getZone();
        mutableDateTime45.setZone(dateTimeZone50);
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(dateTimeZone50);
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((long) '#', dateTimeZone50);
        org.joda.time.Chronology chronology54 = localTime53.getChronology();
        org.joda.time.DateTime dateTime55 = dateTime22.withChronology(chronology54);
        mutableDateTime15.setChronology(chronology54);
        org.joda.time.DateTimeField dateTimeField57 = mutableDateTime15.getRoundingField();
        org.joda.time.DateTime dateTime58 = mutableDateTime15.toDateTime();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.TimeOfDay timeOfDay63 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant65 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime66 = timeOfDay63.toDateTime((org.joda.time.ReadableInstant) instant65);
        org.joda.time.Chronology chronology67 = instant65.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.clockhourOfHalfday();
        long long70 = dateTimeField68.roundHalfFloor(0L);
        java.util.Locale locale71 = java.util.Locale.TRADITIONAL_CHINESE;
        int int72 = dateTimeField68.getMaximumShortTextLength(locale71);
        java.lang.String str73 = locale71.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket74 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology60, locale71);
        java.util.Locale locale75 = dateTimeParserBucket74.getLocale();
        dateTimeParserBucket74.setPivotYear((java.lang.Integer) 52);
        dateTimeParserBucket74.setOffset((java.lang.Integer) 1904);
        org.joda.time.Chronology chronology80 = dateTimeParserBucket74.getChronology();
        org.joda.time.DurationField durationField81 = chronology80.years();
        org.joda.time.DateTimeField dateTimeField82 = chronology80.dayOfYear();
        org.joda.time.DateTime dateTime83 = mutableDateTime15.toDateTime(chronology80);
        mutableDateTime15.setTime((-1509872141560L));
        mutableDateTime15.setMillisOfDay(3598032);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 365 + "'", int26 == 365);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31 + "'", int27 == 31);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "zh" + "'", str73, "zh");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(durationField81);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertNotNull(dateTime83);
    }

    @Test
    public void test18553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18553");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusMonths(70);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight7.withDurationAdded((-2678399965L), (int) ' ');
        org.joda.time.LocalDate localDate13 = dateMidnight12.toLocalDate();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight12.plusMonths((-8918));
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plus((long) 54273);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateMidnight17);
    }

    @Test
    public void test18554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18554");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay5.dayOfMonth();
        int int7 = property6.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property6.getFieldType();
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 30 + "'", int7 == 30);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test18555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18555");
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTime((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Chronology chronology13 = instant11.getChronology();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        int[] intArray21 = chronology13.get((org.joda.time.ReadablePartial) timeOfDay16, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(0L, chronology13);
        org.joda.time.DurationField durationField23 = chronology13.weeks();
        org.joda.time.DateTimeField dateTimeField24 = chronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = chronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = chronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField27 = chronology13.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(0, 53956, 1985, 56025, (-1899), 292278994, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56025 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test18556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18556");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1645455486111L);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test18557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18557");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.plus(readablePeriod1);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay2.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay5 = property3.addToCopy((int) 'a');
        org.joda.time.YearMonthDay yearMonthDay7 = property3.addWrapFieldToCopy(14);
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.withDurationAdded((long) 2, 100);
        org.joda.time.LocalDate localDate15 = dateMidnight11.toLocalDate();
        org.joda.time.LocalDate localDate17 = localDate15.withYearOfEra((int) '#');
        org.joda.time.LocalDate localDate19 = localDate15.minusMonths((int) (byte) 1);
        org.joda.time.LocalDate localDate21 = localDate15.withMonthOfYear(8);
        int int22 = property3.compareTo((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate.Property property23 = localDate21.centuryOfEra();
        org.joda.time.LocalDate localDate24 = property23.roundFloorCopy();
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDate24);
    }

    @Test
    public void test18558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18558");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTimeISO();
        int int2 = mutableDateTime1.getSecondOfDay();
        mutableDateTime1.setMillis(1712996705904564000L);
        mutableDateTime1.addSeconds(366);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfWeek(24356615);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24356615 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18559");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withSecondOfMinute((int) (byte) 1);
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay7 = property5.addWrapFieldToCopy(1);
        int int8 = property5.getMinimumValueOverall();
        org.joda.time.TimeOfDay timeOfDay9 = property5.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusHours(462);
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.plusMinutes(235);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay11.getFieldTypes();
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
    }

    @Test
    public void test18560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18560");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.dayOfMonth();
        org.joda.time.DurationField durationField9 = chronology6.seconds();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology6.getZone();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test18561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18561");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str3 = dateTimeZone2.toString();
        boolean boolean4 = dateTimeZone2.isFixed();
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone2);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.minusMonths((int) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay5.minusDays(11);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay5.minusYears(7);
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay11.year();
        org.joda.time.YearMonthDay yearMonthDay13 = property12.getYearMonthDay();
        java.lang.Object obj14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(obj14);
        org.joda.time.LocalDate localDate17 = localDate15.plusYears(0);
        int int18 = property12.compareTo((org.joda.time.ReadablePartial) localDate15);
        int int19 = property12.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField20 = property12.getField();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-292275054) + "'", int19 == (-292275054));
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test18562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18562");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.withDurationAdded((long) 2, 100);
        int int14 = dateMidnight2.compareTo((org.joda.time.ReadableInstant) dateMidnight10);
        java.lang.String str15 = dateMidnight10.toString();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight10.withYear(100);
        int int18 = dateMidnight10.getMinuteOfHour();
        boolean boolean19 = dateMidnight10.isBeforeNow();
        int int20 = dateMidnight10.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str15, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test18563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18563");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        long long14 = dateTimeField12.roundHalfFloor(0L);
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        int int16 = dateTimeField12.getMaximumShortTextLength(locale15);
        java.lang.String str17 = locale15.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology4, locale15);
        java.util.Locale locale19 = dateTimeParserBucket18.getLocale();
        long long22 = dateTimeParserBucket18.computeMillis(true, "");
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime37 = timeOfDay34.toDateTime((org.joda.time.ReadableInstant) instant36);
        int[] intArray39 = chronology31.get((org.joda.time.ReadablePartial) timeOfDay34, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(0L, chronology31);
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        org.joda.time.Chronology chronology47 = instant45.getChronology();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime53 = timeOfDay50.toDateTime((org.joda.time.ReadableInstant) instant52);
        int[] intArray55 = chronology47.get((org.joda.time.ReadablePartial) timeOfDay50, (long) (short) -1);
        mutableDateTime40.setChronology(chronology47);
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType23.getField(chronology47);
        java.util.Locale locale59 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale60 = locale59.stripExtensions();
        dateTimeParserBucket18.saveField(dateTimeFieldType23, "hi!", locale60);
        java.lang.String str62 = locale60.getLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter2.withLocale(locale60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter2.withPivotYear((int) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter69 = dateTimeFormatter68.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter68.withDefaultYear(266);
        org.joda.time.Chronology chronology72 = dateTimeFormatter71.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter71.withOffsetParsed();
        boolean boolean74 = dateTimeFormatter73.isPrinter();
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "zh" + "'", str62, "zh");
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNotNull(dateTimeFormatter67);
        org.junit.Assert.assertNotNull(dateTimeFormatter68);
        org.junit.Assert.assertNull(dateTimePrinter69);
        org.junit.Assert.assertNotNull(dateTimeFormatter71);
        org.junit.Assert.assertNull(chronology72);
        org.junit.Assert.assertNotNull(dateTimeFormatter73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test18564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18564");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (byte) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant2.plus(readableDuration3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant2.minus(readableDuration5);
        org.joda.time.Instant instant8 = instant2.minus(54543908L);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((long) 59, 7);
        org.joda.time.DateTime dateTime12 = instant11.toDateTimeISO();
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test18565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18565");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        calendar38.roll(3, true);
        int int42 = calendar38.getFirstDayOfWeek();
        calendar38.set(5, 32772, 999, 36000000, 0);
        calendar38.setTimeInMillis(4460317562L);
        int int51 = calendar38.getMinimalDaysInFirstWeek();
        calendar38.roll(14, 54002);
        int int55 = calendar38.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=37,MILLISECOND=564,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test18566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18566");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        date3.setTime((long) 865);
        int int8 = date3.getMonth();
        date3.setTime((-990L));
        org.junit.Assert.assertEquals(date3.toString(), "Wed Dec 31 23:59:59 UTC 1969");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test18567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18567");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        java.lang.Object obj17 = mutableDateTime16.clone();
        int int18 = mutableDateTime16.getMinuteOfHour();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.withDurationAdded(readableDuration23, (int) (byte) 0);
        org.joda.time.DateTime dateTime27 = dateTime22.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime31 = dateTime29.plusDays(2);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMillis((int) (short) 0);
        boolean boolean34 = mutableDateTime16.equals((java.lang.Object) dateTime31);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime16.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfCeiling();
        mutableDateTime36.setDayOfYear(43);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime36.setSecondOfMinute(522);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 522 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
    }

    @Test
    public void test18568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18568");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        int[] intArray32 = chronology24.get((org.joda.time.ReadablePartial) timeOfDay27, (long) (short) -1);
        mutableDateTime17.setChronology(chronology24);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 0, chronology24);
        org.joda.time.DateTimeField dateTimeField36 = chronology24.secondOfMinute();
        long long40 = chronology24.add(54498645L, (long) 54038, 958);
        org.joda.time.DateTimeField dateTimeField41 = chronology24.halfdayOfDay();
        long long43 = dateTimeField41.roundFloor(1645455519638L);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 106267049L + "'", long40 == 106267049L);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1645444800000L + "'", long43 == 1645444800000L);
    }

    @Test
    public void test18569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18569");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        long long9 = dateTimeField7.roundHalfFloor(0L);
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        int int11 = dateTimeField7.getMaximumShortTextLength(locale10);
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale12.getDisplayName(locale14);
        java.lang.String str17 = locale10.getDisplayLanguage(locale12);
        java.lang.String str19 = locale10.getExtension('a');
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.lang.String str22 = locale20.getDisplayVariant();
        java.lang.String str23 = locale10.getDisplayScript(locale20);
        java.lang.String str24 = locale20.getDisplayScript();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str16, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u6587" + "'", str17, "\u4e2d\u6587");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Chinese" + "'", str21, "Chinese");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test18570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18570");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withSecondOfMinute((int) (byte) 1);
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay7 = property5.addWrapFieldToCopy(1);
        org.joda.time.TimeOfDay timeOfDay9 = property5.addWrapFieldToCopy((int) (byte) 1);
        int int10 = property5.getMinimumValueOverall();
        org.joda.time.TimeOfDay timeOfDay11 = property5.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay12 = property5.getTimeOfDay();
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay12);
    }

    @Test
    public void test18571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18571");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusDays(5);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMinutes(1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusYears((int) ' ');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMonths(5);
        org.joda.time.DateTime dateTime10 = localDateTime7.toDateTime();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test18572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18572");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime9 = property7.addWrapFieldToCopy(462);
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test18573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18573");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        int[] intArray32 = chronology24.get((org.joda.time.ReadablePartial) timeOfDay27, (long) (short) -1);
        mutableDateTime17.setChronology(chronology24);
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType0.getField(chronology24);
        org.joda.time.DateTimeField dateTimeField35 = chronology24.yearOfEra();
        org.joda.time.DateTimeField dateTimeField36 = chronology24.millisOfDay();
        long long39 = dateTimeField36.addWrapField(0L, 54370);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 54370L + "'", long39 == 54370L);
    }

    @Test
    public void test18574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18574");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int14 = dateTime12.get(dateTimeFieldType13);
        org.joda.time.DateTime dateTime16 = dateTime12.plusMillis(70);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillisOfDay(23);
        java.util.GregorianCalendar gregorianCalendar19 = dateTime18.toGregorianCalendar();
        org.joda.time.DateMidnight dateMidnight20 = org.joda.time.DateMidnight.now();
        boolean boolean21 = dateTime18.equals((java.lang.Object) dateMidnight20);
        org.joda.time.DateTime dateTime23 = dateTime18.withSecondOfMinute(1);
        org.joda.time.DateTime dateTime24 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfCentury();
        org.joda.time.DateTime dateTime26 = property25.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = property25.setCopy(342);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 342 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(gregorianCalendar19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test18575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18575");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.DateTime dateTime14 = dateTime10.withHourOfDay(10);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime();
        org.joda.time.DateTime dateTime17 = dateTime10.withCenturyOfEra(39);
        org.joda.time.DateTime.Property property18 = dateTime10.weekyear();
        org.joda.time.DateTime dateTime20 = property18.addToCopy((-8918));
        org.joda.time.DateTime dateTime21 = property18.getDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.minusDays(360);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test18576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18576");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str3 = dateTimeZone2.toString();
        boolean boolean4 = dateTimeZone2.isFixed();
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone2);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.minusMonths((int) (byte) 1);
        int int8 = yearMonthDay5.getDayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay5.minusMonths(88);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay5.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test18577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18577");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra(14);
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTime();
        int int9 = dateTime7.getDayOfYear();
        org.joda.time.DateTime dateTime11 = dateTime7.plusMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withDayOfWeek(54049462);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54049462 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 365 + "'", int9 == 365);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test18578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18578");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        int[] intArray32 = chronology24.get((org.joda.time.ReadablePartial) timeOfDay27, (long) (short) -1);
        mutableDateTime17.setChronology(chronology24);
        org.joda.time.DurationField durationField34 = chronology24.seconds();
        org.joda.time.DurationField durationField35 = chronology24.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = chronology24.weekOfWeekyear();
        java.util.Locale.Builder builder37 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder38 = builder37.clear();
        java.util.Locale.Builder builder39 = builder38.clear();
        java.util.Locale.Builder builder40 = builder38.clearExtensions();
        java.util.Locale locale41 = builder40.build();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket(54595649L, chronology24, locale41, (java.lang.Integer) 41, 965);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
    }

    @Test
    public void test18579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18579");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusSeconds(12);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusHours(52);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.monthOfYear();
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.yearOfEra();
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("2022-02-21T14:59:01.406Z");
        java.lang.String str12 = property9.getAsShortText(locale11);
        org.joda.time.LocalDateTime localDateTime13 = property9.roundHalfCeilingCopy();
        int int14 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022" + "'", str12, "2022");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test18580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18580");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.withYearOfCentury(1);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight2.minusYears(36000100);
        org.joda.time.YearMonthDay yearMonthDay12 = dateMidnight2.toYearMonthDay();
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
    }

    @Test
    public void test18581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18581");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        org.joda.time.DateTime dateTime6 = yearMonthDay5.toDateTimeAtMidnight();
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfDay();
        org.joda.time.DateTime dateTime8 = property7.getDateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.joda.time.DurationField durationField11 = property9.getDurationField();
        int int14 = durationField11.getDifference(1645455564570L, (long) 835);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test18582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18582");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        calendar38.clear(10);
        calendar38.clear();
        org.joda.time.LocalTime localTime50 = org.joda.time.LocalTime.fromCalendarFields(calendar38);
        org.joda.time.LocalTime localTime52 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property53 = localTime52.hourOfDay();
        org.joda.time.LocalTime localTime54 = property53.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime56 = localTime54.withMillisOfDay(5);
        int int57 = localTime50.compareTo((org.joda.time.ReadablePartial) localTime54);
        org.joda.time.LocalTime localTime59 = localTime54.plusSeconds(54017029);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(localTime59);
    }

    @Test
    public void test18583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18583");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(chronology23);
        org.joda.time.DateTimeField dateTimeField34 = chronology23.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField35 = chronology23.minuteOfHour();
        org.joda.time.DurationField durationField36 = chronology23.halfdays();
        int int39 = durationField36.getDifference((long) 54285253, (long) 54228000);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test18584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18584");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        long long7 = interval5.getStartMillis();
        org.joda.time.Interval interval9 = interval5.withStartMillis((long) (short) -1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime13.add(readablePeriod14, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        int[] intArray33 = chronology25.get((org.joda.time.ReadablePartial) timeOfDay28, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(0L, chronology25);
        org.joda.time.DurationField durationField35 = chronology25.weeks();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((-86340000L), chronology25);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField38 = chronology25.dayOfWeek();
        mutableDateTime13.setChronology(chronology25);
        org.joda.time.Interval interval40 = interval9.withChronology(chronology25);
        org.joda.time.DateTime dateTime41 = interval40.getEnd();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime48 = timeOfDay45.toDateTime((org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology49 = instant47.getChronology();
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology49);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(chronology49);
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay((java.lang.Object) dateTime41, chronology49);
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay52.minusMillis(2744);
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay52.minusSeconds(23);
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property59 = localTime58.hourOfDay();
        org.joda.time.LocalTime localTime60 = property59.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField61 = property59.getField();
        org.joda.time.LocalTime localTime62 = property59.roundHalfFloorCopy();
        int int63 = timeOfDay56.compareTo((org.joda.time.ReadablePartial) localTime62);
        org.joda.time.TimeOfDay timeOfDay65 = timeOfDay56.plusSeconds(831);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(timeOfDay65);
    }

    @Test
    public void test18585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18585");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DurationField durationField18 = chronology8.weeks();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((-86340000L), chronology8);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(chronology8);
        boolean boolean21 = mutableDateTime20.isEqualNow();
        mutableDateTime20.setMinuteOfDay(795);
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        mutableDateTime20.setYear((-75));
        mutableDateTime20.add(723699L);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test18586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18586");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded(readableDuration6, (int) (short) 1);
        long long9 = dateTime8.getMillis();
        org.joda.time.DateTime.Property property10 = dateTime8.dayOfMonth();
        org.joda.time.Chronology chronology11 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfDay();
        org.joda.time.Chronology chronology13 = chronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-86340000L) + "'", long9 == (-86340000L));
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test18587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18587");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withSecondOfMinute((int) (byte) 1);
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay7 = property5.addWrapFieldToCopy(1);
        int int8 = property5.getMinimumValueOverall();
        org.joda.time.TimeOfDay timeOfDay9 = property5.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay12.minusMinutes((int) '4');
        org.joda.time.TimeOfDay.Property property18 = timeOfDay12.millisOfSecond();
        boolean boolean19 = property5.equals((java.lang.Object) timeOfDay12);
        org.joda.time.TimeOfDay timeOfDay21 = property5.addNoWrapToCopy(0);
        org.joda.time.DurationField durationField22 = property5.getRangeDurationField();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime37 = timeOfDay34.toDateTime((org.joda.time.ReadableInstant) instant36);
        int[] intArray39 = chronology31.get((org.joda.time.ReadablePartial) timeOfDay34, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(0L, chronology31);
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        org.joda.time.Chronology chronology47 = instant45.getChronology();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime53 = timeOfDay50.toDateTime((org.joda.time.ReadableInstant) instant52);
        int[] intArray55 = chronology47.get((org.joda.time.ReadablePartial) timeOfDay50, (long) (short) -1);
        mutableDateTime40.setChronology(chronology47);
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(chronology47);
        org.joda.time.DateTimeField dateTimeField58 = chronology47.weekOfWeekyear();
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(chronology47);
        org.joda.time.LocalTime.Property property60 = localTime59.secondOfMinute();
        org.joda.time.LocalTime localTime61 = property60.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone63);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight64.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight67.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property70 = dateMidnight69.weekyear();
        int int71 = property70.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField72 = property70.getField();
        org.joda.time.DateMidnight dateMidnight74 = property70.setCopy((-292275054));
        int int75 = dateMidnight74.getDayOfYear();
        org.joda.time.DateMidnight.Property property76 = dateMidnight74.centuryOfEra();
        org.joda.time.TimeOfDay timeOfDay79 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant81 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime82 = timeOfDay79.toDateTime((org.joda.time.ReadableInstant) instant81);
        org.joda.time.Chronology chronology83 = instant81.getChronology();
        org.joda.time.DateTimeField dateTimeField84 = chronology83.clockhourOfHalfday();
        long long86 = dateTimeField84.roundHalfFloor(0L);
        java.util.Locale locale87 = java.util.Locale.TRADITIONAL_CHINESE;
        int int88 = dateTimeField84.getMaximumShortTextLength(locale87);
        java.util.Locale locale89 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale90 = locale89.stripExtensions();
        java.util.Locale locale91 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale92 = locale91.stripExtensions();
        java.lang.String str93 = locale89.getDisplayName(locale91);
        java.lang.String str94 = locale87.getDisplayLanguage(locale89);
        java.util.Set<java.lang.String> strSet95 = locale89.getUnicodeLocaleAttributes();
        java.lang.String str96 = property76.getAsShortText(locale89);
        int int97 = property60.getMaximumTextLength(locale89);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay98 = property5.setCopy("2022-02-21T15:06:58.724Z", locale89);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T15:06:58.724Z\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(dateMidnight67);
        org.junit.Assert.assertNotNull(dateMidnight69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-292275054) + "'", int71 == (-292275054));
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateMidnight74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 34 + "'", int75 == 34);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(chronology83);
        org.junit.Assert.assertNotNull(dateTimeField84);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2 + "'", int88 == 2);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str93 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str93, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "\u4e2d\u6587" + "'", str94, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "2922750" + "'", str96, "2922750");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 2 + "'", int97 == 2);
    }

    @Test
    public void test18588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18588");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Property[dayOfWeek]");
        java.util.Locale.setDefault(locale1);
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test18589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18589");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded(readableDuration7, (int) (short) 1);
        int int10 = dateTime6.getDayOfYear();
        int int11 = dateTime6.getDayOfMonth();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime26 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) instant25);
        int[] intArray28 = chronology20.get((org.joda.time.ReadablePartial) timeOfDay23, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(0L, chronology20);
        mutableDateTime29.setYear(3);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        mutableDateTime29.setZone(dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(dateTimeZone34);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((long) '#', dateTimeZone34);
        org.joda.time.Chronology chronology38 = localTime37.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime6.withChronology(chronology38);
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant44 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTime((org.joda.time.ReadableInstant) instant44);
        org.joda.time.Chronology chronology46 = instant44.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.clockhourOfHalfday();
        long long49 = dateTimeField47.roundHalfFloor(0L);
        java.util.Locale locale50 = java.util.Locale.TRADITIONAL_CHINESE;
        int int51 = dateTimeField47.getMaximumShortTextLength(locale50);
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale53 = locale52.stripExtensions();
        java.util.Locale locale54 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale55 = locale54.stripExtensions();
        java.lang.String str56 = locale52.getDisplayName(locale54);
        java.lang.String str57 = locale50.getDisplayLanguage(locale52);
        java.lang.String str58 = locale50.getDisplayScript();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology38, locale50);
        java.lang.Integer int60 = dateTimeParserBucket59.getPivotYear();
        long long61 = dateTimeParserBucket59.computeMillis();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str56, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\u4e2d\u6587" + "'", str57, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(int60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
    }

    @Test
    public void test18590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18590");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime5 = property3.setCopy(7);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        java.lang.String str7 = localDateTime5.toString();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2007-02-21T15:07:46.381" + "'", str7, "2007-02-21T15:07:46.381");
    }

    @Test
    public void test18591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18591");
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Chronology chronology14 = instant12.getChronology();
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0L, chronology14);
        org.joda.time.Chronology chronology19 = timeOfDay18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.months();
        org.joda.time.DurationField durationField21 = chronology19.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(54433164, 54140, 54350804, (int) (short) 100, (-75), (-8918), chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test18592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18592");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.DateTime dateTime14 = dateTime10.withHourOfDay(10);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillisOfDay((int) 'x');
        org.joda.time.DateTime dateTime18 = dateTime16.plusWeeks(147855);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((java.lang.Object) dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test18593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18593");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        org.joda.time.DurationField durationField33 = chronology23.seconds();
        org.joda.time.DurationField durationField34 = chronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField35 = chronology23.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis((-19045));
        org.joda.time.Chronology chronology38 = chronology23.withZone(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(chronology38);
    }

    @Test
    public void test18594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18594");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withPeriodAdded(readablePeriod6, (int) (short) 0);
        org.joda.time.DateTime.Property property9 = dateTime5.hourOfDay();
        org.joda.time.LocalTime localTime10 = dateTime5.toLocalTime();
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfWeek();
        java.lang.String str13 = chronology11.toString();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.clockhourOfHalfday();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(chronology11);
        org.joda.time.DateTimeField dateTimeField17 = chronology11.secondOfMinute();
        long long19 = dateTimeField17.roundCeiling(9000L);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[UTC]" + "'", str13, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9000L + "'", long19 == 9000L);
    }

    @Test
    public void test18595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18595");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("15:07:27.467");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '15:07:27.467' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18596");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        int int2 = localDateTime0.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMinutes(1);
        int int5 = localDateTime4.getYear();
        int int6 = localDateTime4.getYearOfCentury();
        int int7 = localDateTime4.getMillisOfDay();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 54406476 + "'", int7 == 54406476);
    }

    @Test
    public void test18597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18597");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusSeconds(12);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusWeeks(0);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusMillis(925);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test18598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18598");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableDateTime3.add(readablePeriod4, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        int[] intArray23 = chronology15.get((org.joda.time.ReadablePartial) timeOfDay18, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, chronology15);
        org.joda.time.DurationField durationField25 = chronology15.weeks();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((-86340000L), chronology15);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.DateTimeField dateTimeField28 = chronology15.dayOfWeek();
        mutableDateTime3.setChronology(chronology15);
        java.lang.String str30 = mutableDateTime3.toString();
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime37 = timeOfDay34.toDateTime((org.joda.time.ReadableInstant) instant36);
        org.joda.time.Chronology chronology38 = instant36.getChronology();
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        int[] intArray46 = chronology38.get((org.joda.time.ReadablePartial) timeOfDay41, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(0L, chronology38);
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime53 = timeOfDay50.toDateTime((org.joda.time.ReadableInstant) instant52);
        org.joda.time.Chronology chronology54 = instant52.getChronology();
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant59 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime60 = timeOfDay57.toDateTime((org.joda.time.ReadableInstant) instant59);
        int[] intArray62 = chronology54.get((org.joda.time.ReadablePartial) timeOfDay57, (long) (short) -1);
        mutableDateTime47.setChronology(chronology54);
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime(chronology54);
        org.joda.time.DateTimeField dateTimeField65 = chronology54.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField66 = chronology54.halfdayOfDay();
        org.joda.time.TimeOfDay timeOfDay67 = new org.joda.time.TimeOfDay(chronology54);
        mutableDateTime3.setChronology(chronology54);
        org.joda.time.DateTimeField dateTimeField69 = chronology54.yearOfEra();
        org.joda.time.DateTimeField dateTimeField70 = chronology54.dayOfWeek();
        org.joda.time.DurationField durationField71 = chronology54.halfdays();
        int int73 = durationField71.getValue((long) 'x');
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTimeField28);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2022-02-21T15:07:46.495Z" + "'", str30, "2022-02-21T15:07:46.495Z");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(durationField71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test18599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18599");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.withWeekyear(2);
        boolean boolean12 = interval2.isBefore((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 2, dateTimeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone16.toTimeZone();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight9.withZoneRetainFields(dateTimeZone16);
        long long21 = dateTimeZone16.convertUTCToLocal((-292275054L));
        long long24 = dateTimeZone16.adjustOffset(0L, true);
        long long26 = dateTimeZone16.convertUTCToLocal((-39599980L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-292275054L) + "'", long21 == (-292275054L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-39599980L) + "'", long26 == (-39599980L));
    }

    @Test
    public void test18600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18600");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property3.addWrapFieldToCopy((-11491200));
        org.joda.time.LocalDateTime localDateTime6 = property3.getLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean8 = localDateTime6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusSeconds(575);
        int int11 = localDateTime6.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime6.withTime(831, 69, 53917543, 54357);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 831 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 54466538 + "'", int11 == 54466538);
    }

    @Test
    public void test18601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18601");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) 54046399);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.withFieldAdded(durationFieldType3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdays' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test18602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18602");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded(readableDuration6, (int) (short) 1);
        long long9 = dateTime8.getMillis();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.minus(readablePeriod10);
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra(4);
        int int14 = dateTime13.getYear();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-86340000L) + "'", long9 == (-86340000L));
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 469 + "'", int14 == 469);
    }

    @Test
    public void test18603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18603");
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean11 = interval7.abuts((org.joda.time.ReadableInterval) interval10);
        long long12 = interval10.getStartMillis();
        org.joda.time.Interval interval14 = interval10.withStartMillis((long) (short) -1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Instant instant17 = instant15.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime18 = instant17.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime18.add(readablePeriod19, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        org.joda.time.Chronology chronology30 = instant28.getChronology();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) instant35);
        int[] intArray38 = chronology30.get((org.joda.time.ReadablePartial) timeOfDay33, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(0L, chronology30);
        org.joda.time.DurationField durationField40 = chronology30.weeks();
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((-86340000L), chronology30);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(chronology30);
        org.joda.time.DateTimeField dateTimeField43 = chronology30.dayOfWeek();
        mutableDateTime18.setChronology(chronology30);
        org.joda.time.Interval interval45 = interval14.withChronology(chronology30);
        org.joda.time.DateTimeField dateTimeField46 = chronology30.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology30.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(0, 82, 54387, 54237603, 36736900, chronology30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54237603 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
    }

    @Test
    public void test18604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18604");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime3 = localTime1.minusMinutes((int) (short) 1);
        int int4 = localTime1.getMillisOfDay();
        org.joda.time.LocalTime localTime6 = localTime1.plusSeconds(100);
        org.joda.time.LocalTime.Property property7 = localTime1.minuteOfHour();
        boolean boolean8 = property7.isLeap();
        org.joda.time.LocalTime localTime10 = property7.addWrapFieldToCopy(20);
        org.joda.time.LocalTime localTime11 = property7.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property12 = localTime11.hourOfDay();
        org.joda.time.LocalTime localTime14 = property12.addCopy(577);
        boolean boolean15 = property12.isLeap();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18605");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime localTime3 = localTime1.minusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime5 = localTime1.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime.Property property6 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.withMaximumValue();
        org.joda.time.LocalTime localTime8 = property6.withMaximumValue();
        org.joda.time.LocalTime localTime9 = property6.roundHalfCeilingCopy();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        org.joda.time.Chronology chronology16 = instant14.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.clockhourOfHalfday();
        long long19 = dateTimeField17.roundHalfFloor(0L);
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        int int21 = dateTimeField17.getMaximumShortTextLength(locale20);
        java.util.Locale locale22 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.lang.String str26 = locale22.getDisplayName(locale24);
        java.lang.String str27 = locale20.getDisplayLanguage(locale22);
        java.util.Set<java.lang.String> strSet28 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str29 = locale22.getDisplayCountry();
        int int30 = property6.getMaximumShortTextLength(locale22);
        org.joda.time.LocalTime localTime32 = property6.addCopy((long) 4);
        org.joda.time.LocalTime.Property property33 = localTime32.hourOfDay();
        int int34 = localTime32.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str26, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u4e2d\u6587" + "'", str27, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Taiwan" + "'", str29, "Taiwan");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test18606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18606");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.year();
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(chronology6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTime((org.joda.time.ReadableInstant) instant15);
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.clockhourOfHalfday();
        long long20 = dateTimeField18.roundHalfFloor(0L);
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        int int22 = dateTimeField18.getMaximumShortTextLength(locale21);
        java.lang.String str23 = locale21.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology10, locale21);
        java.util.Locale locale25 = dateTimeParserBucket24.getLocale();
        long long28 = dateTimeParserBucket24.computeMillis(true, "");
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) instant35);
        org.joda.time.Chronology chronology37 = instant35.getChronology();
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) instant42);
        int[] intArray45 = chronology37.get((org.joda.time.ReadablePartial) timeOfDay40, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(0L, chronology37);
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTime((org.joda.time.ReadableInstant) instant51);
        org.joda.time.Chronology chronology53 = instant51.getChronology();
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime59 = timeOfDay56.toDateTime((org.joda.time.ReadableInstant) instant58);
        int[] intArray61 = chronology53.get((org.joda.time.ReadablePartial) timeOfDay56, (long) (short) -1);
        mutableDateTime46.setChronology(chronology53);
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType29.getField(chronology53);
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale66 = locale65.stripExtensions();
        dateTimeParserBucket24.saveField(dateTimeFieldType29, "hi!", locale66);
        boolean boolean68 = timeOfDay8.isSupported(dateTimeFieldType29);
        org.joda.time.TimeOfDay timeOfDay71 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant73 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime74 = timeOfDay71.toDateTime((org.joda.time.ReadableInstant) instant73);
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.DateTime dateTime77 = dateTime74.withPeriodAdded(readablePeriod75, (int) (short) 0);
        org.joda.time.DateTime.Property property78 = dateTime74.hourOfDay();
        org.joda.time.LocalTime localTime79 = dateTime74.toLocalTime();
        org.joda.time.Chronology chronology80 = localTime79.getChronology();
        org.joda.time.DateTimeField dateTimeField81 = chronology80.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField82 = dateTimeFieldType29.getField(chronology80);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh" + "'", str23, "zh");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(localTime79);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertNotNull(dateTimeField82);
    }

    @Test
    public void test18607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18607");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        int int18 = mutableDateTime17.getEra();
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime17.setDayOfYear(6);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        org.joda.time.Chronology chronology29 = instant27.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        int[] intArray37 = chronology29.get((org.joda.time.ReadablePartial) timeOfDay32, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(0L, chronology29);
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Chronology chronology45 = instant43.getChronology();
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime51 = timeOfDay48.toDateTime((org.joda.time.ReadableInstant) instant50);
        int[] intArray53 = chronology45.get((org.joda.time.ReadablePartial) timeOfDay48, (long) (short) -1);
        mutableDateTime38.setChronology(chronology45);
        boolean boolean55 = mutableDateTime38.isEqualNow();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime38.secondOfDay();
        boolean boolean57 = mutableDateTime38.isAfterNow();
        mutableDateTime38.setMillisOfSecond((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime38.add(readablePeriod60);
        mutableDateTime38.setMillis((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHours(11);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime38, dateTimeZone65);
        mutableDateTime66.addMinutes((int) (short) -1);
        mutableDateTime66.addHours(0);
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) mutableDateTime66);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime17.year();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime17.weekyear();
        org.joda.time.MutableDateTime mutableDateTime75 = property73.set(19);
        org.joda.time.MutableDateTime mutableDateTime76 = property73.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime78 = property73.add((long) 687);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(mutableDateTime75);
        org.junit.Assert.assertNotNull(mutableDateTime76);
        org.junit.Assert.assertNotNull(mutableDateTime78);
    }

    @Test
    public void test18608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18608");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("53324", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=53324");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18609");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        java.lang.String str4 = property3.getAsShortText();
        int int5 = property3.getMinimumValueOverall();
        org.joda.time.TimeOfDay timeOfDay7 = property3.addToCopy(1900);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.withDurationAdded((long) 2, 100);
        int int14 = dateMidnight13.getDayOfMonth();
        org.joda.time.DateMidnight.Property property15 = dateMidnight13.era();
        org.joda.time.DateMidnight dateMidnight16 = property15.roundHalfFloorCopy();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.withWeekOfWeekyear(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfYear();
        boolean boolean20 = dateMidnight16.isSupported(dateTimeFieldType19);
        boolean boolean21 = timeOfDay7.isSupported(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test18610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18610");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.withPeriodAdded(readablePeriod11, (int) (short) 0);
        int int14 = property3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.TimeOfDay timeOfDay16 = property3.addToCopy(23);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property3.getFieldType();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.withPeriodAdded(readablePeriod24, (int) (short) 0);
        org.joda.time.DateTime.Property property27 = dateTime23.hourOfDay();
        org.joda.time.DateTimeField dateTimeField28 = property27.getField();
        org.joda.time.DateTimeField dateTimeField29 = property27.getField();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) instant35);
        org.joda.time.Chronology chronology37 = instant35.getChronology();
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) instant42);
        int[] intArray45 = chronology37.get((org.joda.time.ReadablePartial) timeOfDay40, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(0L, chronology37);
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTime((org.joda.time.ReadableInstant) instant51);
        org.joda.time.Chronology chronology53 = instant51.getChronology();
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime59 = timeOfDay56.toDateTime((org.joda.time.ReadableInstant) instant58);
        int[] intArray61 = chronology53.get((org.joda.time.ReadablePartial) timeOfDay56, (long) (short) -1);
        mutableDateTime46.setChronology(chronology53);
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime(chronology53);
        org.joda.time.LocalTime.Property property64 = localTime63.millisOfSecond();
        org.joda.time.LocalTime localTime66 = localTime63.minusSeconds(53989396);
        int int67 = dateTimeField29.getMinimumValue((org.joda.time.ReadablePartial) localTime66);
        int int68 = property3.compareTo((org.joda.time.ReadablePartial) localTime66);
        org.joda.time.TimeOfDay timeOfDay71 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant73 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime74 = timeOfDay71.toDateTime((org.joda.time.ReadableInstant) instant73);
        org.joda.time.Chronology chronology75 = instant73.getChronology();
        org.joda.time.DateTimeField dateTimeField76 = chronology75.clockhourOfHalfday();
        long long78 = dateTimeField76.roundHalfFloor(0L);
        java.util.Locale locale79 = java.util.Locale.TRADITIONAL_CHINESE;
        int int80 = dateTimeField76.getMaximumShortTextLength(locale79);
        java.lang.String str81 = locale79.getLanguage();
        java.lang.String str82 = locale79.getLanguage();
        java.util.Locale locale84 = new java.util.Locale("TWN");
        java.lang.String str85 = locale79.getDisplayCountry(locale84);
        java.lang.String str86 = locale79.getISO3Country();
        java.lang.String str87 = locale79.getScript();
        int int88 = property3.getMaximumTextLength(locale79);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "zh" + "'", str81, "zh");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "zh" + "'", str82, "zh");
        org.junit.Assert.assertEquals(locale84.toString(), "twn");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Taiwan" + "'", str85, "Taiwan");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "TWN" + "'", str86, "TWN");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2 + "'", int88 == 2);
    }

    @Test
    public void test18611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18611");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        int int40 = calendar38.getActualMinimum(2);
        calendar38.setMinimalDaysInFirstWeek(88);
        int int44 = calendar38.getMaximum(0);
        java.lang.String str45 = calendar38.toString();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=88,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=52,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=88,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=52,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str45, "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=88,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=52,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test18612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18612");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withSecondOfMinute((int) (byte) 1);
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay7 = property5.addWrapFieldToCopy(1);
        int int8 = property5.getMinimumValueOverall();
        org.joda.time.TimeOfDay timeOfDay9 = property5.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTime((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Chronology chronology18 = instant16.getChronology();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        int[] intArray26 = chronology18.get((org.joda.time.ReadablePartial) timeOfDay21, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(0L, chronology18);
        mutableDateTime27.setYear(3);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = instant31.getZone();
        mutableDateTime27.setZone(dateTimeZone32);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(0L, dateTimeZone32);
        java.util.TimeZone timeZone35 = dateTimeZone32.toTimeZone();
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTime((org.joda.time.ReadableInstant) instant42);
        org.joda.time.Chronology chronology44 = instant42.getChronology();
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime50 = timeOfDay47.toDateTime((org.joda.time.ReadableInstant) instant49);
        int[] intArray52 = chronology44.get((org.joda.time.ReadablePartial) timeOfDay47, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(0L, chronology44);
        mutableDateTime53.setYear(3);
        org.joda.time.Instant instant57 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone58 = instant57.getZone();
        mutableDateTime53.setZone(dateTimeZone58);
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime(0L, dateTimeZone58);
        java.util.TimeZone timeZone61 = dateTimeZone58.toTimeZone();
        boolean boolean62 = timeZone35.hasSameRules(timeZone61);
        org.joda.time.TimeOfDay timeOfDay65 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant67 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime68 = timeOfDay65.toDateTime((org.joda.time.ReadableInstant) instant67);
        org.joda.time.Chronology chronology69 = instant67.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.clockhourOfHalfday();
        long long72 = dateTimeField70.roundHalfFloor(0L);
        java.util.Locale locale73 = java.util.Locale.TRADITIONAL_CHINESE;
        int int74 = dateTimeField70.getMaximumShortTextLength(locale73);
        java.util.Locale locale75 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale76 = locale75.stripExtensions();
        java.util.Locale locale77 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale78 = locale77.stripExtensions();
        java.lang.String str79 = locale75.getDisplayName(locale77);
        java.lang.String str80 = locale73.getDisplayLanguage(locale75);
        java.util.Calendar calendar81 = java.util.Calendar.getInstance(timeZone61, locale75);
        int int82 = property5.getMaximumShortTextLength(locale75);
        java.lang.String str83 = locale75.toLanguageTag();
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str79, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\u4e2d\u6587" + "'", str80, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar81);
// flaky:         org.junit.Assert.assertEquals(calendar81.toString(), "java.util.GregorianCalendar[time=1645456066760,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=7,SECOND=46,MILLISECOND=760,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "zh-TW" + "'", str83, "zh-TW");
    }

    @Test
    public void test18613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18613");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        int int6 = localDate0.getEra();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate0.withPeriodAdded(readablePeriod7, 11);
        org.joda.time.LocalDate localDate11 = localDate9.withDayOfYear(7);
        org.joda.time.LocalDate localDate13 = localDate11.minusMonths(32769);
        int int14 = localDate13.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test18614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18614");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusDays(4);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, readablePeriod10);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        org.joda.time.DateTime dateTime15 = instant13.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar16 = dateTime15.toGregorianCalendar();
        org.joda.time.DateTime dateTime18 = dateTime15.minusYears((int) '#');
        boolean boolean19 = interval11.isBefore((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Interval interval20 = interval11.toInterval();
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.withDurationAdded(readableDuration26, (int) (byte) 0);
        org.joda.time.DateTime dateTime29 = dateTime28.toDateTime();
        org.joda.time.DateTime dateTime31 = dateTime29.minusDays(4);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, readablePeriod32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.Interval interval35 = interval33.withPeriodBeforeEnd(readablePeriod34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Interval interval37 = interval35.withDurationBeforeEnd(readableDuration36);
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean44 = interval40.abuts((org.joda.time.ReadableInterval) interval43);
        org.joda.time.Interval interval46 = interval40.withEndMillis((long) 1904);
        boolean boolean47 = interval37.abuts((org.joda.time.ReadableInterval) interval46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight50.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property56 = dateMidnight53.monthOfYear();
        org.joda.time.Interval interval57 = dateMidnight53.toInterval();
        boolean boolean58 = interval57.containsNow();
        boolean boolean59 = interval37.contains((org.joda.time.ReadableInterval) interval57);
        org.joda.time.Interval interval60 = interval20.gap((org.joda.time.ReadableInterval) interval57);
        long long61 = interval60.toDurationMillis();
        org.joda.time.Interval interval62 = interval60.toInterval();
        java.util.Date date66 = new java.util.Date(0, (int) '4', 0);
        int int67 = date66.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay68 = org.joda.time.YearMonthDay.fromDateFields(date66);
        int int69 = yearMonthDay68.getYear();
        org.joda.time.YearMonthDay yearMonthDay71 = yearMonthDay68.plusDays((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.YearMonthDay yearMonthDay73 = yearMonthDay68.minus(readablePeriod72);
        org.joda.time.Interval interval74 = yearMonthDay73.toInterval();
        boolean boolean75 = interval74.isAfterNow();
        org.joda.time.Interval interval78 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval81 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean82 = interval78.abuts((org.joda.time.ReadableInterval) interval81);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.DateMidnight dateMidnight85 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone84);
        org.joda.time.DateMidnight dateMidnight87 = dateMidnight85.withWeekyear(2);
        boolean boolean88 = interval78.isBefore((org.joda.time.ReadableInstant) dateMidnight85);
        org.joda.time.ReadableDuration readableDuration89 = null;
        org.joda.time.Interval interval90 = interval78.withDurationAfterStart(readableDuration89);
        org.joda.time.Duration duration91 = interval78.toDuration();
        org.joda.time.Interval interval92 = interval74.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration91);
        org.joda.time.Duration duration93 = interval92.toDuration();
        org.joda.time.Interval interval94 = interval62.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration93);
        long long95 = interval94.getEndMillis();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateMidnight53);
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(interval60);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1645024066807L + "'", long61 == 1645024066807L);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertEquals(date66.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1904 + "'", int69 == 1904);
        org.junit.Assert.assertNotNull(yearMonthDay71);
        org.junit.Assert.assertNotNull(yearMonthDay73);
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(dateMidnight87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(interval90);
        org.junit.Assert.assertNotNull(duration91);
        org.junit.Assert.assertNotNull(interval92);
        org.junit.Assert.assertNotNull(duration93);
        org.junit.Assert.assertNotNull(interval94);
// flaky:         org.junit.Assert.assertTrue("'" + long95 + "' != '" + 1645110466807L + "'", long95 == 1645110466807L);
    }

    @Test
    public void test18615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18615");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((-30219974256600000L), dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks(34212);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test18616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18616");
        java.util.Date date6 = new java.util.Date(53979631, 9, 2922789, 0, 58, 17);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromDateFields(date6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.monthOfYear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusMillis(53937);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime7.getFieldType(21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 21");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date6.toString(), "Fri Jan 26 00:58:17 UTC 53989534");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test18617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18617");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate8 = localDate0.minusWeeks((int) 'a');
        org.joda.time.LocalDate.Property property9 = localDate8.weekOfWeekyear();
        org.joda.time.LocalDate localDate10 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate11 = property9.withMinimumValue();
        int int12 = property9.getMinimumValueOverall();
        org.joda.time.LocalDate localDate13 = property9.getLocalDate();
        org.joda.time.LocalDate localDate15 = localDate13.minusWeeks(53962);
        org.joda.time.LocalDate.Property property16 = localDate13.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight17 = localDate13.toDateMidnight();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateMidnight17);
    }

    @Test
    public void test18618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18618");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        int int6 = dateMidnight5.getDayOfMonth();
        java.util.GregorianCalendar gregorianCalendar7 = dateMidnight5.toGregorianCalendar();
        gregorianCalendar7.setTimeInMillis(14L);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromCalendarFields((java.util.Calendar) gregorianCalendar7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusDays(16);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYearOfEra(54455320);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test18619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18619");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology1 = localDateTime0.getChronology();
        int int2 = localDateTime0.size();
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.secondOfMinute();
        int int4 = property3.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy(54576831);
        org.joda.time.DateTimeField dateTimeField7 = property3.getField();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test18620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18620");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        java.util.Date date42 = new java.util.Date(0, (int) '4', 0);
        int int43 = date42.getMinutes();
        date42.setYear(12);
        calendar38.setTime(date42);
        calendar38.clear(10);
        calendar38.clear();
        calendar38.clear(7);
        java.lang.String str52 = calendar38.getCalendarType();
        calendar38.setFirstDayOfWeek(54268);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=54268,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(date42.toString(), "Tue Apr 30 00:00:00 UTC 1912");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "gregory" + "'", str52, "gregory");
    }

    @Test
    public void test18621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18621");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException4 = new java.io.IOException("");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("1", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray7 = iOException2.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.String str9 = iOException8.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str9, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test18622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18622");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        boolean boolean35 = mutableDateTime16.isAfterNow();
        mutableDateTime16.setMillisOfSecond((int) (byte) 0);
        mutableDateTime16.setHourOfDay(5);
        mutableDateTime16.addWeekyears((-1));
        int int42 = mutableDateTime16.getYear();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime16.monthOfYear();
        mutableDateTime16.setYear(54332315);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1969 + "'", int42 == 1969);
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test18623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18623");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        int[] intArray32 = chronology24.get((org.joda.time.ReadablePartial) timeOfDay27, (long) (short) -1);
        mutableDateTime17.setChronology(chronology24);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(chronology24);
        org.joda.time.DateTimeField dateTimeField35 = chronology24.weekOfWeekyear();
        org.joda.time.DurationField durationField36 = chronology24.seconds();
        org.joda.time.DurationField durationField37 = chronology24.weeks();
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay((long) 999, chronology24);
        org.joda.time.DurationField durationField39 = chronology24.days();
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(chronology24);
        org.joda.time.Chronology chronology41 = localTime40.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.weekyears();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(durationField42);
    }

    @Test
    public void test18624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18624");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        int int18 = mutableDateTime17.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.property(dateTimeFieldType19);
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.property(dateTimeFieldType22);
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        mutableDateTime24.setSecondOfDay(35);
        org.joda.time.Interval interval27 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.Interval interval28 = interval27.toInterval();
        org.joda.time.MutableInterval mutableInterval29 = interval28.toMutableInterval();
        org.joda.time.Chronology chronology30 = interval28.getChronology();
        long long31 = interval28.getEndMillis();
        boolean boolean33 = interval28.isBefore(36972083318400000L);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-259165000L) + "'", long31 == (-259165000L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test18625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18625");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        int int3 = localDate0.getDayOfYear();
        org.joda.time.LocalDate localDate5 = localDate0.plusYears((-1));
        int int6 = localDate5.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test18626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18626");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Chronology chronology9 = instant7.getChronology();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime15 = timeOfDay12.toDateTime((org.joda.time.ReadableInstant) instant14);
        int[] intArray17 = chronology9.get((org.joda.time.ReadablePartial) timeOfDay12, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(0L, chronology9);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime24 = timeOfDay21.toDateTime((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTime((org.joda.time.ReadableInstant) instant30);
        int[] intArray33 = chronology25.get((org.joda.time.ReadablePartial) timeOfDay28, (long) (short) -1);
        mutableDateTime18.setChronology(chronology25);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(chronology25);
        boolean boolean36 = dateTimeFieldType1.isSupported(chronology25);
        org.joda.time.DateTimeField dateTimeField37 = chronology25.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(0L, chronology25);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property40 = localTime39.minuteOfHour();
        org.joda.time.LocalTime localTime41 = property40.roundHalfEvenCopy();
        int[] intArray43 = chronology25.get((org.joda.time.ReadablePartial) localTime41, (long) 289);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, 0, 0, 289]");
    }

    @Test
    public void test18627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18627");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property6 = localDate0.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.millis();
        boolean boolean8 = localDate0.isSupported(durationFieldType7);
        int int9 = localDate0.getMonthOfYear();
        java.lang.String str10 = localDate0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate0.withYearOfCentury(53973848);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53973848 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-21" + "'", str10, "2022-02-21");
    }

    @Test
    public void test18628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18628");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(27000L);
        org.joda.time.DateTime dateTime3 = dateTime1.minusDays(352);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded(1645456041810L, 54082304);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1645456041810 * 54082304");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test18629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18629");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withDurationAdded((long) 2, 100);
        org.joda.time.LocalDate localDate6 = dateMidnight2.toLocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra((int) '#');
        org.joda.time.LocalDate localDate10 = localDate6.minusMonths((int) (byte) 1);
        org.joda.time.LocalDate localDate12 = localDate6.withMonthOfYear(8);
        int int13 = localDate12.getWeekyear();
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.withDurationAdded(readableDuration18, (int) (byte) 0);
        org.joda.time.DateTime dateTime22 = dateTime17.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime26 = dateTime24.plusDays(2);
        org.joda.time.DateTime dateTime28 = dateTime24.withHourOfDay(10);
        int int29 = dateTime28.getYear();
        org.joda.time.DateTime.Property property30 = dateTime28.minuteOfHour();
        org.joda.time.DateTime dateTime32 = dateTime28.minusWeeks(52);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.withWeekyear(2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = dateMidnight35.toString(dateTimeFormatter38);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean42 = localDate40.isSupported(dateTimeFieldType41);
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType41.getDurationType();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight35.withField(dateTimeFieldType41, 32772);
        int int46 = dateTime28.get(dateTimeFieldType41);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = localDate12.get(dateTimeFieldType41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str39, "1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(dateMidnight45);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 37066052 + "'", int46 == 37066052);
    }

    @Test
    public void test18630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18630");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property6 = localDate0.yearOfEra();
        org.joda.time.LocalDate.Property property7 = localDate0.year();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        java.util.Date date9 = localDate8.toDate();
        org.joda.time.LocalDate localDate11 = localDate8.withWeekOfWeekyear(14);
        org.joda.time.LocalDate.Property property12 = localDate11.year();
        org.joda.time.LocalDate localDate14 = localDate11.withYearOfEra(101);
        int int15 = localDate11.getEra();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Jan 01 00:00:00 UTC 2023");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test18631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18631");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.Instant instant3 = instant1.withMillis(1645455529960L);
        org.joda.time.DateTime dateTime4 = instant1.toDateTimeISO();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test18632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18632");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property6 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate7 = property6.withMinimumValue();
        org.joda.time.LocalDate localDate9 = property6.addToCopy(9);
        org.joda.time.LocalDate localDate10 = property6.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight11 = localDate10.toDateMidnight();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateMidnight11);
    }

    @Test
    public void test18633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18633");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.withYearOfCentury(1);
        int int10 = dateMidnight9.getMinuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight9.plus(readablePeriod11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusYears((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight12.minusMonths(53977);
        org.joda.time.MutableDateTime mutableDateTime17 = dateMidnight16.toMutableDateTime();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight16.minus(54181441L);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateMidnight19);
    }

    @Test
    public void test18634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18634");
        org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("1");
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight3 = property2.roundFloorCopy();
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = instant5.getZone();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded(readableDuration8, (int) (byte) 0);
        org.joda.time.DateTime dateTime12 = dateTime7.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime16 = dateTime12.plusWeeks((int) (byte) -1);
        org.joda.time.DateTime.Property property17 = dateTime12.monthOfYear();
        org.joda.time.DateTime dateTime19 = property17.addWrapFieldToCopy(21);
        org.joda.time.DateTime dateTime20 = property17.roundFloorCopy();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTimeISO();
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime27 = timeOfDay24.toDateTime((org.joda.time.ReadableInstant) instant26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra(14);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = instant31.getZone();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withDurationAdded(readableDuration34, (int) (byte) 0);
        org.joda.time.DateTime dateTime38 = dateTime33.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime40 = dateTime38.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime42 = dateTime40.plusDays(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int44 = dateTime42.get(dateTimeFieldType43);
        org.joda.time.Chronology chronology45 = null;
        boolean boolean46 = dateTimeFieldType43.isSupported(chronology45);
        boolean boolean47 = dateTime29.isSupported(dateTimeFieldType43);
        int int48 = mutableDateTime21.get(dateTimeFieldType43);
        boolean boolean49 = dateMidnight3.isSupported(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(dateMidnight1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 15 + "'", int44 == 15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test18635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18635");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.minuteOfHour();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTime((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime18 = timeOfDay15.toDateTime((org.joda.time.ReadableInstant) instant17);
        int[] intArray20 = chronology12.get((org.joda.time.ReadablePartial) timeOfDay15, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, chronology12);
        int int22 = mutableDateTime21.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime21.property(dateTimeFieldType23);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfHalfday();
        long long34 = dateTimeField32.roundHalfFloor(0L);
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        int int36 = dateTimeField32.getMaximumShortTextLength(locale35);
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale40 = locale39.stripExtensions();
        java.lang.String str41 = locale37.getDisplayName(locale39);
        java.lang.String str42 = locale35.getDisplayLanguage(locale37);
        java.util.Calendar calendar43 = mutableDateTime21.toCalendar(locale37);
        int int44 = property3.getMaximumTextLength(locale37);
        java.lang.String str45 = property3.getAsString();
        java.lang.String str46 = property3.getAsString();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime54 = timeOfDay51.toDateTime((org.joda.time.ReadableInstant) instant53);
        org.joda.time.Chronology chronology55 = instant53.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        long long58 = dateTimeField56.roundHalfFloor(0L);
        java.util.Locale locale59 = java.util.Locale.TRADITIONAL_CHINESE;
        int int60 = dateTimeField56.getMaximumShortTextLength(locale59);
        java.lang.String str61 = locale59.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology48, locale59);
        java.util.Locale locale63 = dateTimeParserBucket62.getLocale();
        java.util.Locale locale64 = dateTimeParserBucket62.getLocale();
        java.util.Locale locale67 = new java.util.Locale("29 Apr 1904 23:59:59 GMT", "2022-02-21T10:09:34.070Z");
        java.lang.String str68 = locale64.getDisplayCountry(locale67);
        int int69 = property3.getMaximumShortTextLength(locale67);
        int int70 = property3.get();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str41, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e2d\u6587" + "'", str42, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar43);
        org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1" + "'", str45, "1");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1" + "'", str46, "1");
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "zh" + "'", str61, "zh");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale67.toString(), "29 apr 1904 23:59:59 gmt_2022-02-21T10:09:34.070Z");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Taiwan" + "'", str68, "Taiwan");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
    }

    @Test
    public void test18636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18636");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter3.withChronology(chronology11);
        boolean boolean14 = dateTimeFormatter13.isOffsetParsed();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean18 = interval17.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property27 = dateMidnight26.weekyear();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight26.minusYears((int) ' ');
        org.joda.time.Interval interval30 = interval17.withStart((org.joda.time.ReadableInstant) dateMidnight29);
        org.joda.time.DateMidnight.Property property31 = dateMidnight29.year();
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime38 = timeOfDay35.toDateTime((org.joda.time.ReadableInstant) instant37);
        org.joda.time.Chronology chronology39 = instant37.getChronology();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant44 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTime((org.joda.time.ReadableInstant) instant44);
        int[] intArray47 = chronology39.get((org.joda.time.ReadablePartial) timeOfDay42, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(0L, chronology39);
        mutableDateTime48.setYear(3);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone53 = instant52.getZone();
        mutableDateTime48.setZone(dateTimeZone53);
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(dateTimeZone53);
        java.lang.String str57 = dateTimeZone53.getName((long) 'x');
        org.joda.time.TimeOfDay timeOfDay61 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant63 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime64 = timeOfDay61.toDateTime((org.joda.time.ReadableInstant) instant63);
        org.joda.time.Chronology chronology65 = instant63.getChronology();
        org.joda.time.TimeOfDay timeOfDay68 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime71 = timeOfDay68.toDateTime((org.joda.time.ReadableInstant) instant70);
        int[] intArray73 = chronology65.get((org.joda.time.ReadablePartial) timeOfDay68, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(0L, chronology65);
        org.joda.time.DurationField durationField75 = chronology65.weeks();
        org.joda.time.DateTimeField dateTimeField76 = chronology65.dayOfYear();
        org.joda.time.LocalTime localTime78 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property79 = localTime78.secondOfMinute();
        long long81 = chronology65.set((org.joda.time.ReadablePartial) localTime78, (-2678399900L));
        boolean boolean82 = dateTimeZone53.equals((java.lang.Object) chronology65);
        org.joda.time.DurationField durationField83 = chronology65.months();
        org.joda.time.DateMidnight dateMidnight84 = dateMidnight29.withChronology(chronology65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = dateTimeFormatter13.withChronology(chronology65);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime86 = org.joda.time.LocalDateTime.parse("2022-02-21T15:02:45.942Z", dateTimeFormatter13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00" + "'", str57, "+00:00");
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-2678399965L) + "'", long81 == (-2678399965L));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(durationField83);
        org.junit.Assert.assertNotNull(dateMidnight84);
        org.junit.Assert.assertNotNull(dateTimeFormatter85);
    }

    @Test
    public void test18637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18637");
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTime((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Chronology chronology13 = instant11.getChronology();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime19 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) instant18);
        int[] intArray21 = chronology13.get((org.joda.time.ReadablePartial) timeOfDay16, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(0L, chronology13);
        mutableDateTime22.setYear(3);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = instant26.getZone();
        mutableDateTime22.setZone(dateTimeZone27);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale31 = locale30.stripExtensions();
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.lang.String str34 = locale30.getDisplayName(locale32);
        java.lang.String str35 = dateTimeZone27.getName(100L, locale32);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((-402192000000L), dateTimeZone27);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((java.lang.Object) 2831327999967L, dateTimeZone27);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(26524800018L, dateTimeZone27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(0, 60000, 54020, dateTimeZone27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str34, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
    }

    @Test
    public void test18638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18638");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str3 = dateTimeZone2.toString();
        boolean boolean4 = dateTimeZone2.isFixed();
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone2);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.minusMonths((int) (byte) 1);
        int int8 = yearMonthDay5.getDayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay5.minusMonths(88);
        org.joda.time.Instant instant12 = new org.joda.time.Instant(58L);
        org.joda.time.Chronology chronology13 = instant12.getChronology();
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay5.withChronologyRetainFields(chronology13);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(chronology13);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean18 = localDate16.isSupported(dateTimeFieldType17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = localDate16.toDateMidnight(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = localDate16.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property22 = localDate16.yearOfEra();
        org.joda.time.LocalDate localDate24 = localDate16.minusMonths((int) (byte) -1);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean27 = localDate25.isSupported(dateTimeFieldType26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = localDate25.toDateMidnight(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = localDate25.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime31 = localDate25.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime32 = localDate16.toDateTime((org.joda.time.ReadableInstant) dateTime31);
        boolean boolean33 = localDate15.equals((java.lang.Object) dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test18639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18639");
        java.io.IOException iOException2 = new java.io.IOException("Coordinated Universal Time");
        java.io.IOException iOException3 = new java.io.IOException("1970-01-01T00:00:00.072Z", (java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("19");
        java.io.IOException iOException8 = new java.io.IOException("");
        java.io.IOException iOException10 = new java.io.IOException("");
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException("");
        java.io.IOException iOException16 = new java.io.IOException("");
        iOException14.addSuppressed((java.lang.Throwable) iOException16);
        java.io.IOException iOException18 = new java.io.IOException("1", (java.lang.Throwable) iOException14);
        iOException10.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException21 = new java.io.IOException("");
        java.io.IOException iOException23 = new java.io.IOException("");
        iOException21.addSuppressed((java.lang.Throwable) iOException23);
        java.io.IOException iOException27 = new java.io.IOException("");
        java.io.IOException iOException29 = new java.io.IOException("");
        iOException27.addSuppressed((java.lang.Throwable) iOException29);
        java.io.IOException iOException31 = new java.io.IOException("1", (java.lang.Throwable) iOException27);
        iOException23.addSuppressed((java.lang.Throwable) iOException27);
        iOException14.addSuppressed((java.lang.Throwable) iOException27);
        java.io.IOException iOException34 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.io.IOException iOException35 = new java.io.IOException("2022-02-21T10:09:34.070Z", (java.lang.Throwable) iOException34);
        iOException5.addSuppressed((java.lang.Throwable) iOException35);
        java.io.IOException iOException37 = new java.io.IOException((java.lang.Throwable) iOException35);
        iOException2.addSuppressed((java.lang.Throwable) iOException37);
        java.lang.Throwable[] throwableArray39 = iOException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test18640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18640");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears((int) '4');
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withSecondOfMinute((int) ' ');
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime.Property property8 = localDateTime0.yearOfCentury();
        org.joda.time.LocalDateTime.Property property9 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.minusHours(470);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test18641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18641");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime5 = timeOfDay2.toDateTime((org.joda.time.ReadableInstant) instant4);
        org.joda.time.Chronology chronology6 = instant4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfHalfday();
        long long9 = dateTimeField7.roundHalfFloor(0L);
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        int int11 = dateTimeField7.getMaximumShortTextLength(locale10);
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Locale locale14 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale12.getDisplayName(locale14);
        java.lang.String str17 = locale10.getDisplayLanguage(locale12);
        java.util.Set<java.lang.String> strSet18 = locale12.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray19 = strSet18.toArray();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTime((org.joda.time.ReadableInstant) instant27);
        org.joda.time.Chronology chronology29 = instant27.getChronology();
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) instant34);
        int[] intArray37 = chronology29.get((org.joda.time.ReadablePartial) timeOfDay32, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(0L, chronology29);
        org.joda.time.DurationField durationField39 = chronology29.weeks();
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((-86340000L), chronology29);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(chronology29);
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay((-30281093963986000L), chronology29);
        boolean boolean43 = strSet18.remove((java.lang.Object) chronology29);
        boolean boolean44 = strSet18.isEmpty();
        org.joda.time.tz.Provider provider45 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet46 = provider45.getAvailableIDs();
        java.util.Set<java.lang.String> strSet47 = provider45.getAvailableIDs();
        java.util.Locale.LanguageRange[] languageRangeArray48 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList49 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList49, languageRangeArray48);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap51 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList52 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, strMap51);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "\u4e2d\u6587\u53f0\u7063)", "zh", "hi!", "\u4e2d\u6587", "1970-01-01T00:00:00.000Z", "zh" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        java.lang.String str63 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, (java.util.Collection<java.lang.String>) strList61);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap64 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList65 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList49, strMap64);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream66 = languageRangeList65.parallelStream();
        java.lang.String[] strArray82 = new java.lang.String[] { "gregory", "30 Apr 1904 00:00:00 GMT", "Chinese", "\u53f0\u7063", "java.io.IOException: ", "yearOfEra", "weekOfWeekyear", "UTC", "1969-12-31T00:01:00.000Z", "ISOChronology[UTC]", "java.util.GregorianCalendar[time=-1820016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1912,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=121,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", "zh", "hi!", "java.io.IOException: ", "+10:00" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags(languageRangeList65, (java.util.Collection<java.lang.String>) strList83);
        boolean boolean86 = strSet47.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList65);
        java.util.Set<java.lang.String> strSet87 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet87.clear();
        java.lang.Object[] objArray89 = strSet87.toArray();
        strSet87.clear();
        java.util.Locale.LanguageRange[] languageRangeArray91 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList92 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList92, languageRangeArray91);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap94 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList95 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList92, strMap94);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream96 = languageRangeList92.parallelStream();
        boolean boolean97 = strSet87.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList92);
        boolean boolean98 = strSet47.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList92);
        boolean boolean99 = strSet18.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList92);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str16, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u6587" + "'", str17, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(provider45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(languageRangeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(languageRangeList52);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(languageRangeList65);
        org.junit.Assert.assertNotNull(languageRangeStream66);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(strSet87);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[]");
        org.junit.Assert.assertNotNull(languageRangeArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(languageRangeList95);
        org.junit.Assert.assertNotNull(languageRangeStream96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test18642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18642");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableDateTime3.add(readablePeriod4, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTime((org.joda.time.ReadableInstant) instant20);
        int[] intArray23 = chronology15.get((org.joda.time.ReadablePartial) timeOfDay18, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, chronology15);
        org.joda.time.DurationField durationField25 = chronology15.weeks();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((-86340000L), chronology15);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.DateTimeField dateTimeField28 = chronology15.dayOfWeek();
        mutableDateTime3.setChronology(chronology15);
        java.lang.String str30 = mutableDateTime3.toString();
        mutableDateTime3.setWeekyear(0);
        mutableDateTime3.setWeekyear(55994);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime3.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime37 = property35.set("00:00:00.000");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"00:00:00.000\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTimeField28);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2022-02-21T15:07:47.294Z" + "'", str30, "2022-02-21T15:07:47.294Z");
        org.junit.Assert.assertNotNull(property35);
    }

    @Test
    public void test18643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18643");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        long long11 = dateTimeField9.roundHalfFloor(0L);
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        int int13 = dateTimeField9.getMaximumShortTextLength(locale12);
        java.lang.String str14 = locale12.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale12);
        java.lang.Integer int16 = dateTimeParserBucket15.getPivotYear();
        long long17 = dateTimeParserBucket15.computeMillis();
        org.joda.time.Chronology chronology18 = dateTimeParserBucket15.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.weeks();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.minuteOfDay();
        org.joda.time.DurationField durationField22 = chronology18.hours();
        long long25 = durationField22.add(54643564L, 1645455787576L);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 5923640835328243564L + "'", long25 == 5923640835328243564L);
    }

    @Test
    public void test18644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18644");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        long long14 = dateTimeField12.roundHalfFloor(0L);
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        int int16 = dateTimeField12.getMaximumShortTextLength(locale15);
        java.lang.String str17 = locale15.getLanguage();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology4, locale15);
        java.util.Locale locale19 = dateTimeParserBucket18.getLocale();
        long long22 = dateTimeParserBucket18.computeMillis(true, "");
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime37 = timeOfDay34.toDateTime((org.joda.time.ReadableInstant) instant36);
        int[] intArray39 = chronology31.get((org.joda.time.ReadablePartial) timeOfDay34, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(0L, chronology31);
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        org.joda.time.Chronology chronology47 = instant45.getChronology();
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime53 = timeOfDay50.toDateTime((org.joda.time.ReadableInstant) instant52);
        int[] intArray55 = chronology47.get((org.joda.time.ReadablePartial) timeOfDay50, (long) (short) -1);
        mutableDateTime40.setChronology(chronology47);
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType23.getField(chronology47);
        java.util.Locale locale59 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale60 = locale59.stripExtensions();
        dateTimeParserBucket18.saveField(dateTimeFieldType23, "hi!", locale60);
        java.lang.String str62 = locale60.getLanguage();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter2.withLocale(locale60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 0);
        java.lang.Integer int66 = dateTimeFormatter2.getPivotYear();
        org.joda.time.Chronology chronology67 = dateTimeFormatter2.getChronolgy();
        org.joda.time.TimeOfDay timeOfDay72 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant74 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime75 = timeOfDay72.toDateTime((org.joda.time.ReadableInstant) instant74);
        org.joda.time.Chronology chronology76 = instant74.getChronology();
        org.joda.time.TimeOfDay timeOfDay79 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant81 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime82 = timeOfDay79.toDateTime((org.joda.time.ReadableInstant) instant81);
        int[] intArray84 = chronology76.get((org.joda.time.ReadablePartial) timeOfDay79, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime(0L, chronology76);
        mutableDateTime85.setYear(3);
        org.joda.time.Instant instant89 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone90 = instant89.getZone();
        mutableDateTime85.setZone(dateTimeZone90);
        org.joda.time.DateMidnight dateMidnight92 = new org.joda.time.DateMidnight(dateTimeZone90);
        org.joda.time.LocalTime localTime93 = new org.joda.time.LocalTime((long) '#', dateTimeZone90);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter94 = dateTimeFormatter2.withZone(dateTimeZone90);
        java.lang.Integer int95 = dateTimeFormatter2.getPivotYear();
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh" + "'", str17, "zh");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "zh" + "'", str62, "zh");
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNull(int66);
        org.junit.Assert.assertNull(chronology67);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone90);
        org.junit.Assert.assertNotNull(dateTimeFormatter94);
        org.junit.Assert.assertNull(int95);
    }

    @Test
    public void test18645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18645");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds((int) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(2);
        org.joda.time.DateTime dateTime14 = dateTime10.withHourOfDay(10);
        int int15 = dateTime14.getYear();
        org.joda.time.DateTime.Property property16 = dateTime14.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTimeISO();
        int int18 = mutableDateTime17.getEra();
        mutableDateTime17.addDays(1948);
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime17.setHourOfDay(54455320);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54455320 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test18646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18646");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        java.util.Locale locale19 = new java.util.Locale("zh");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology8, locale19, (java.lang.Integer) (-292275054));
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.DateTimeField dateTimeField23 = chronology8.era();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test18647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18647");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        java.lang.String str3 = dateTimeZone2.toString();
        boolean boolean4 = dateTimeZone2.isFixed();
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone2);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.minusMonths((int) (byte) 1);
        int int8 = yearMonthDay5.getDayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay5.minusMonths(88);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay5.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay5.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property14 = localDate13.weekyear();
        org.joda.time.LocalDate localDate16 = localDate13.withWeekyear((-1));
        java.util.Date date17 = localDate13.toDate();
        org.joda.time.LocalDate.Property property18 = localDate13.dayOfYear();
        org.joda.time.LocalDate.Property property19 = localDate13.dayOfYear();
        org.joda.time.LocalDate localDate21 = localDate13.minusYears(366);
        org.joda.time.LocalDate.Property property22 = localDate21.centuryOfEra();
        boolean boolean23 = yearMonthDay5.isEqual((org.joda.time.ReadablePartial) localDate21);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+10:00" + "'", str3, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Feb 21 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test18648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18648");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(201, 6);
        int int4 = dateTimeZone2.getOffsetFromLocal(36972083318400000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 723960000 + "'", int4 == 723960000);
    }

    @Test
    public void test18649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18649");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.DurationField durationField17 = chronology7.millis();
        java.lang.String str18 = chronology7.toString();
        org.joda.time.DateTimeField dateTimeField19 = chronology7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology7.getZone();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[UTC]" + "'", str18, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test18650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18650");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 0);
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusDays(4);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, readablePeriod10);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        org.joda.time.DateTime dateTime15 = instant13.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar16 = dateTime15.toGregorianCalendar();
        org.joda.time.DateTime dateTime18 = dateTime15.minusYears((int) '#');
        boolean boolean19 = interval11.isBefore((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Interval interval20 = interval11.toInterval();
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.Instant instant23 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.withDurationAdded(readableDuration26, (int) (byte) 0);
        org.joda.time.DateTime dateTime29 = dateTime28.toDateTime();
        org.joda.time.DateTime dateTime31 = dateTime29.minusDays(4);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, readablePeriod32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.Interval interval35 = interval33.withPeriodBeforeEnd(readablePeriod34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Interval interval37 = interval35.withDurationBeforeEnd(readableDuration36);
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval43 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean44 = interval40.abuts((org.joda.time.ReadableInterval) interval43);
        org.joda.time.Interval interval46 = interval40.withEndMillis((long) 1904);
        boolean boolean47 = interval37.abuts((org.joda.time.ReadableInterval) interval46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight50.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight.Property property56 = dateMidnight53.monthOfYear();
        org.joda.time.Interval interval57 = dateMidnight53.toInterval();
        boolean boolean58 = interval57.containsNow();
        boolean boolean59 = interval37.contains((org.joda.time.ReadableInterval) interval57);
        org.joda.time.Interval interval60 = interval20.gap((org.joda.time.ReadableInterval) interval57);
        boolean boolean62 = interval57.isBefore(54543908L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateMidnight53);
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test18651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18651");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths((int) (short) 0);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(70);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate7 = localDate2.minusWeeks(21);
        org.joda.time.LocalDate localDate9 = localDate7.withDayOfYear(11);
        java.lang.String str10 = localDate9.toString();
        org.joda.time.LocalDate localDate12 = localDate9.plusYears(59);
        org.joda.time.LocalDate.Property property13 = localDate12.dayOfMonth();
        org.joda.time.LocalDate localDate15 = property13.addToCopy(53937);
        org.joda.time.LocalDate localDate16 = property13.roundFloorCopy();
        org.joda.time.LocalDate localDate17 = property13.roundHalfEvenCopy();
        org.joda.time.LocalDate.Property property18 = localDate17.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType20 = localDate17.getFieldType(1962);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1962");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2021-01-11" + "'", str10, "2021-01-11");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test18652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18652");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime29 = timeOfDay26.toDateTime((org.joda.time.ReadableInstant) instant28);
        int[] intArray31 = chronology23.get((org.joda.time.ReadablePartial) timeOfDay26, (long) (short) -1);
        mutableDateTime16.setChronology(chronology23);
        boolean boolean33 = mutableDateTime16.isEqualNow();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime16.secondOfDay();
        mutableDateTime16.setMillisOfDay((int) (short) 100);
        int int37 = mutableDateTime16.getHourOfDay();
        mutableDateTime16.setTime(7, 21, 8, (int) (byte) 0);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime16.weekOfWeekyear();
        int int44 = mutableDateTime16.getSecondOfDay();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 26468 + "'", int44 == 26468);
    }

    @Test
    public void test18653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18653");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.withWeekyear(2);
        org.joda.time.DateMidnight.Property property7 = dateMidnight2.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.withDurationAdded((long) 2, 100);
        int int14 = dateMidnight2.compareTo((org.joda.time.ReadableInstant) dateMidnight10);
        int int15 = dateMidnight2.getYearOfCentury();
        org.joda.time.DateMidnight.Property property16 = dateMidnight2.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.plusDays(5);
        int int21 = property16.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.year();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = localDateTime20.getValue((-3598030));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -3598030");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 70 + "'", int15 == 70);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test18654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18654");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean6 = interval2.abuts((org.joda.time.ReadableInterval) interval5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.withWeekyear(2);
        boolean boolean12 = interval2.isBefore((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Interval interval14 = interval2.withDurationAfterStart(readableDuration13);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean21 = interval17.abuts((org.joda.time.ReadableInterval) interval20);
        boolean boolean22 = interval20.containsNow();
        boolean boolean23 = interval14.abuts((org.joda.time.ReadableInterval) interval20);
        org.joda.time.Chronology chronology24 = interval20.getChronology();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test18655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18655");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        org.joda.time.DurationField durationField18 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField19 = chronology8.dayOfYear();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        long long24 = chronology8.set((org.joda.time.ReadablePartial) localTime21, (-2678399900L));
        org.joda.time.DurationField durationField25 = chronology8.years();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay(1645455601439L, chronology8);
        org.joda.time.LocalTime localTime28 = localTime26.minusMillis(1439);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.plusDays(5);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean39 = interval35.abuts((org.joda.time.ReadableInterval) interval38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.withWeekyear(2);
        boolean boolean45 = interval35.isBefore((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Interval interval47 = interval35.withDurationAfterStart(readableDuration46);
        org.joda.time.Duration duration48 = interval35.toDuration();
        org.joda.time.Interval interval51 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval54 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean55 = interval51.abuts((org.joda.time.ReadableInterval) interval54);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone57);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight58.withWeekyear(2);
        boolean boolean61 = interval51.isBefore((org.joda.time.ReadableInstant) dateMidnight58);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.Interval interval63 = interval51.withDurationAfterStart(readableDuration62);
        org.joda.time.Duration duration64 = interval51.toDuration();
        int int65 = duration48.compareTo((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Period period66 = duration48.toPeriod();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime29.minus((org.joda.time.ReadablePeriod) period66);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.yearOfEra();
        int int70 = localDateTime67.get(dateTimeFieldType69);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property71 = localTime26.property(dateTimeFieldType69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-2678399965L) + "'", long24 == (-2678399965L));
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(dateMidnight60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(duration64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2022 + "'", int70 == 2022);
    }

    @Test
    public void test18656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18656");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        int int40 = calendar38.getActualMinimum(2);
        calendar38.setMinimalDaysInFirstWeek(88);
        calendar38.roll(0, 34);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=88,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=52,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test18657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18657");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone1);
        int int3 = dateMidnight2.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.withWeekyear(14);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusWeeks(59);
        java.lang.String str8 = dateMidnight7.toString();
        int int9 = dateMidnight7.getMinuteOfDay();
        int int10 = dateMidnight7.getYearOfCentury();
        int int11 = dateMidnight7.getHourOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = dateMidnight7.toMutableDateTime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0012-11-15T00:00:00.000Z" + "'", str8, "0012-11-15T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test18658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18658");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.joda.time.LocalDate localDate3 = localDate0.withWeekyear((-1));
        int int4 = localDate3.getMonthOfYear();
        java.lang.String str5 = localDate3.toString();
        org.joda.time.DateTime dateTime6 = localDate3.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate3.withMonthOfYear(54138284);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54138284 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-0001-02-22" + "'", str5, "-0001-02-22");
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test18659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18659");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.DurationField durationField17 = chronology7.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology7.monthOfYear();
        org.joda.time.DurationField durationField19 = chronology7.months();
        long long22 = durationField19.getMillis(8, (long) (-1));
        boolean boolean23 = durationField19.isPrecise();
        long long26 = durationField19.getDifferenceAsLong(11L, 142353504000000L);
        int int29 = durationField19.getDifference(1645455844307L, 54544964L);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 20995200000L + "'", long22 == 20995200000L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-54131L) + "'", long26 == (-54131L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 625 + "'", int29 == 625);
    }

    @Test
    public void test18660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18660");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(0L, chronology8);
        org.joda.time.DateTime dateTime13 = timeOfDay12.toDateTimeToday();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay12.minuteOfHour();
        java.lang.String str15 = property14.toString();
        org.joda.time.TimeOfDay timeOfDay16 = property14.withMinimumValue();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant22 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTime((org.joda.time.ReadableInstant) instant29);
        int[] intArray32 = chronology24.get((org.joda.time.ReadablePartial) timeOfDay27, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(0L, chronology24);
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime39 = timeOfDay36.toDateTime((org.joda.time.ReadableInstant) instant38);
        org.joda.time.Chronology chronology40 = instant38.getChronology();
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime46 = timeOfDay43.toDateTime((org.joda.time.ReadableInstant) instant45);
        int[] intArray48 = chronology40.get((org.joda.time.ReadablePartial) timeOfDay43, (long) (short) -1);
        mutableDateTime33.setChronology(chronology40);
        boolean boolean50 = mutableDateTime33.isEqualNow();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime33.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant58 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime59 = timeOfDay56.toDateTime((org.joda.time.ReadableInstant) instant58);
        org.joda.time.Chronology chronology60 = instant58.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.clockhourOfHalfday();
        org.joda.time.DurationField durationField62 = chronology60.eras();
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType53.getField(chronology60);
        long long66 = dateTimeField63.add((long) (short) 100, (long) (byte) -1);
        boolean boolean67 = dateTimeField63.isSupported();
        org.joda.time.TimeOfDay timeOfDay71 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant73 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime74 = timeOfDay71.toDateTime((org.joda.time.ReadableInstant) instant73);
        org.joda.time.Chronology chronology75 = instant73.getChronology();
        org.joda.time.DateTimeField dateTimeField76 = chronology75.clockhourOfHalfday();
        long long78 = dateTimeField76.roundHalfFloor(0L);
        java.util.Locale locale79 = java.util.Locale.TRADITIONAL_CHINESE;
        int int80 = dateTimeField76.getMaximumShortTextLength(locale79);
        java.lang.String str81 = locale79.getLanguage();
        java.util.Locale locale82 = locale79.stripExtensions();
        java.lang.String str83 = dateTimeField63.getAsShortText((long) 10, locale79);
        org.joda.time.DateTimeZone dateTimeZone85 = null;
        org.joda.time.DateMidnight dateMidnight86 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone85);
        org.joda.time.DateMidnight dateMidnight88 = dateMidnight86.withWeekyear(2);
        org.joda.time.DateMidnight dateMidnight90 = dateMidnight86.withWeekyear(2);
        org.joda.time.DateMidnight.Property property91 = dateMidnight86.weekOfWeekyear();
        java.lang.String str92 = property91.getAsString();
        java.util.Locale locale93 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale94 = locale93.stripExtensions();
        int int95 = property91.getMaximumTextLength(locale93);
        java.lang.String str96 = locale79.getDisplayCountry(locale93);
        java.lang.String str97 = locale79.getCountry();
        java.lang.String str98 = property51.getAsShortText(locale79);
        int int99 = property14.getMaximumShortTextLength(locale79);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Property[minuteOfHour]" + "'", str15, "Property[minuteOfHour]");
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-2678399900L) + "'", long66 == (-2678399900L));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2 + "'", int80 == 2);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "zh" + "'", str81, "zh");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\u4e00\u6708" + "'", str83, "\u4e00\u6708");
        org.junit.Assert.assertNotNull(dateMidnight88);
        org.junit.Assert.assertNotNull(dateMidnight90);
        org.junit.Assert.assertNotNull(property91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "1" + "'", str92, "1");
        org.junit.Assert.assertNotNull(locale93);
        org.junit.Assert.assertEquals(locale93.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 2 + "'", int95 == 2);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "\u53f0\u7063" + "'", str96, "\u53f0\u7063");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "TW" + "'", str97, "TW");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "0" + "'", str98, "0");
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 2 + "'", int99 == 2);
    }

    @Test
    public void test18661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18661");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTime((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) instant13);
        int[] intArray16 = chronology8.get((org.joda.time.ReadablePartial) timeOfDay11, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology8);
        mutableDateTime17.setYear(3);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        mutableDateTime17.setZone(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        timeZone25.setID("1969-12-31T23:59:59.999Z");
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone25);
        java.lang.Object obj29 = calendar28.clone();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime37 = timeOfDay34.toDateTime((org.joda.time.ReadableInstant) instant36);
        org.joda.time.Chronology chronology38 = instant36.getChronology();
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime44 = timeOfDay41.toDateTime((org.joda.time.ReadableInstant) instant43);
        int[] intArray46 = chronology38.get((org.joda.time.ReadablePartial) timeOfDay41, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(0L, chronology38);
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant52 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime53 = timeOfDay50.toDateTime((org.joda.time.ReadableInstant) instant52);
        org.joda.time.Chronology chronology54 = instant52.getChronology();
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant59 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime60 = timeOfDay57.toDateTime((org.joda.time.ReadableInstant) instant59);
        int[] intArray62 = chronology54.get((org.joda.time.ReadablePartial) timeOfDay57, (long) (short) -1);
        mutableDateTime47.setChronology(chronology54);
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime(chronology54);
        boolean boolean65 = dateTimeFieldType30.isSupported(chronology54);
        org.joda.time.TimeOfDay timeOfDay66 = new org.joda.time.TimeOfDay((java.lang.Object) calendar28, chronology54);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(chronology54);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1645456067619,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1969-12-31T23:59:59.999Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=7,SECOND=47,MILLISECOND=619,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj29);
// flaky:         org.junit.Assert.assertEquals(obj29.toString(), "java.util.GregorianCalendar[time=1645456067619,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1969-12-31T23:59:59.999Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=7,SECOND=47,MILLISECOND=619,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "java.util.GregorianCalendar[time=1645456067619,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1969-12-31T23:59:59.999Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=7,SECOND=47,MILLISECOND=619,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "java.util.GregorianCalendar[time=1645456067619,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1969-12-31T23:59:59.999Z,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=7,SECOND=47,MILLISECOND=619,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[23, 59, 59, 999]");
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test18662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18662");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.years();
        java.lang.String str1 = durationFieldType0.getName();
        java.lang.String str2 = durationFieldType0.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "years" + "'", str1, "years");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "years" + "'", str2, "years");
    }

    @Test
    public void test18663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18663");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfEven();
        mutableDateTime20.setTime((long) 19);
        mutableDateTime20.setWeekyear(100);
        mutableDateTime20.add((long) 70);
        java.util.Date date27 = mutableDateTime20.toDate();
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime20.getZone();
        long long31 = dateTimeZone28.adjustOffset(54243712L, false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 09 00:00:00 UTC 100");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 54243712L + "'", long31 == 54243712L);
    }

    @Test
    public void test18664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18664");
        java.util.Date date3 = new java.util.Date(0, (int) '4', 0);
        int int4 = date3.getMinutes();
        org.joda.time.YearMonthDay yearMonthDay5 = org.joda.time.YearMonthDay.fromDateFields(date3);
        int int6 = yearMonthDay5.getYear();
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay5.plusDays((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay5.minus(readablePeriod9);
        org.joda.time.Interval interval11 = yearMonthDay10.toInterval();
        org.joda.time.LocalDate localDate12 = yearMonthDay10.toLocalDate();
        java.lang.String str13 = yearMonthDay10.toString();
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay10.plusMonths(235);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 30 00:00:00 UTC 1904");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1904 + "'", int6 == 1904);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1904-04-30" + "'", str13, "1904-04-30");
        org.junit.Assert.assertNotNull(yearMonthDay15);
    }

    @Test
    public void test18665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18665");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant5 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime6 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) instant12);
        int[] intArray15 = chronology7.get((org.joda.time.ReadablePartial) timeOfDay10, (long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology7);
        int int17 = mutableDateTime16.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.property(dateTimeFieldType18);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime25 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        long long29 = dateTimeField27.roundHalfFloor(0L);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = dateTimeField27.getMaximumShortTextLength(locale30);
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale33 = locale32.stripExtensions();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.lang.String str36 = locale32.getDisplayName(locale34);
        java.lang.String str37 = locale30.getDisplayLanguage(locale32);
        java.util.Calendar calendar38 = mutableDateTime16.toCalendar(locale32);
        calendar38.roll(3, true);
        int int42 = calendar38.getFirstDayOfWeek();
        java.time.Instant instant43 = calendar38.toInstant();
        calendar38.clear();
        calendar38.setTimeInMillis((long) 53891);
        int int47 = calendar38.getFirstDayOfWeek();
        java.util.Locale.Builder builder48 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder49 = builder48.clearExtensions();
        java.util.Locale locale50 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder51 = builder49.setLocale(locale50);
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(locale50);
        int int53 = calendar38.compareTo(calendar52);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 59, 59, 999]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str36, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=53891,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=53,MILLISECOND=891,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(calendar52);
// flaky:         org.junit.Assert.assertEquals(calendar52.toString(), "java.util.GregorianCalendar[time=1645456067695,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=7,SECOND=47,MILLISECOND=695,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test18666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18666");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("14:58:36.112");
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test18667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18667");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) (byte) 1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) (short) -1);
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.Chronology chronology9 = instant7.getChronology();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((java.lang.Object) (-11491200000L), chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.millisOfSecond();
        mutableDateTime0.setRounding(dateTimeField12);
        mutableDateTime0.setMillisOfSecond(31);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.seconds();
        mutableDateTime0.add(durationFieldType16, 2054);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime0.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight22.withDurationAdded((long) 2, 100);
        int int26 = dateMidnight25.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight25.withCenturyOfEra(70);
        org.joda.time.DateTime dateTime29 = dateMidnight28.toDateTimeISO();
        org.joda.time.DateTime dateTime31 = dateTime29.minusMinutes(12);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight34.withDurationAdded((long) 2, 100);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.minusWeeks((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight37.withMonthOfYear((int) (byte) 10);
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.yearOfCentury();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((long) (short) 0, 0L);
        org.joda.time.Interval interval48 = new org.joda.time.Interval((long) (short) 0, 0L);
        boolean boolean49 = interval45.abuts((org.joda.time.ReadableInterval) interval48);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight((long) (short) 100, dateTimeZone51);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.withWeekyear(2);
        boolean boolean55 = interval45.isBefore((org.joda.time.ReadableInstant) dateMidnight52);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.Interval interval57 = interval45.withDurationAfterStart(readableDuration56);
        org.joda.time.Duration duration58 = interval45.toDuration();
        long long59 = duration58.getMillis();
        org.joda.time.Duration duration60 = duration58.toDuration();
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight41.withDurationAdded((org.joda.time.ReadableDuration) duration60, 53956);
        org.joda.time.DateTime dateTime63 = dateTime29.minus((org.joda.time.ReadableDuration) duration60);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration60, 975);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(dateMidnight62);
        org.junit.Assert.assertNotNull(dateTime63);
    }
}
